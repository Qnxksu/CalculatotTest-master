import java.util.regex.Matcher;

public interface Verification {
    Boolean isRomanNumber(String valueStr);

    Boolean isArabicNumber(String valueStr);

    Matcher getMatcherRomanNumber(String valueStr);

    Matcher getMatcherArabicNumber(String valueStr);
}
