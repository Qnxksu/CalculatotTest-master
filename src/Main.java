public class Main {
    public static void main(String[] args) throws IncorrectEntry {
        DataInputOutput inputOutput = new DataInOutCons();
        Verification verification = new ArabicRomanNumber();
        ConvertNumber convertNumber = new RomanArabicNumberConverter();
        Calcul calcul = new CalcTest();
        Calculator calculator = new Calculator(inputOutput, verification, convertNumber, calcul);
        calculator.start();
    }
}