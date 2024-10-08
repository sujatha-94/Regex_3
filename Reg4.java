import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg4{
// Match a Decimal Number with Optional Leading and Trailing Zeros
// Problem: Create a regex to match a decimal number that allows for optional leading and trailing zeros.
// Example Input: "007.89", "0.123", "3.14", "100", "000.000"
// Expected Matches: "007.89", "0.123", "3.14", "100", "000.000"

    public static void main(String[] args) {
        String regex = "^0*[1-9][0-9]*(\\.[0-9]+)?|0+\\.[0-9]+$";
        String[] pattern = {"007.89", "0.123", "3.14", "100", "000.000"};

        Pattern p= Pattern.compile(regex);

        for (String s : pattern) {
            Matcher m = p.matcher(s);
            if (m.matches()) {
                System.out.println(s + " is a valid decimal number");
            } else {
                System.out.println(s+ " is not a valid decimal number");
            }
        }
    }
}


