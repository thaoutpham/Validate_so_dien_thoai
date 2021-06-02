import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    private static final String PHONE_NUMBER="^[0]+[93]+\\d{8}$";
    public boolean validate(String account){
        Pattern pattern=Pattern.compile(PHONE_NUMBER);
        Matcher matcher=pattern.matcher(account);
        return matcher.matches();
    }
}
