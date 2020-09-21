import java.util.regex.Matcher;

class Calculator {
    private DataInputOutput inputOutput;
    private Verification verification;
    private ConvertNumber convertNumber;
    private Calcul calcul;

    Calculator(DataInputOutput inputOutput, Verification verification, ConvertNumber convertNumber, Calcul calcul) {
        this.inputOutput = inputOutput;
        this.verification = verification;
        this.convertNumber = convertNumber;
        this.calcul = calcul;
    }

    void start() throws IncorrectEntry {
        String str;
        while (!(str = inputOutput.input()).equals("EXIT")) {
            if (verification.isArabicNumber(str)) {
                Matcher resultMatch = verification.getMatcherArabicNumber(str);
                int a1 = Integer.parseInt(resultMatch.group(1));
                int b1 = Integer.parseInt(resultMatch.group(3));
                char c = resultMatch.group(2).charAt(0);
                inputOutput.output(calcul.calc(a1, b1, c).toString());
            } else if (verification.isRomanNumber(str)) {
                Matcher resultMatch = verification.getMatcherRomanNumber(str);
                int a1 = convertNumber.convert(resultMatch.group(1));
                int b1 = convertNumber.convert(resultMatch.group(3));
                char c = resultMatch.group(2).charAt(0);
                inputOutput.output(convertNumber.reverseConvert(calcul.calc(a1, b1, c).intValue()));
            } else throw new IncorrectEntry("Данные введены не верно!");
        }
    }
}

