package pgms_sanjay;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class Extra {
@Test
public void countNoOfDuplicatesInAString()
{
	String s = "my date of birth is 2006-11-13";
    
    // Define the regex pattern for matching the date
    String regex = "\\d{4}-\\d{2}-\\d{2}";
    Pattern pattern = Pattern.compile(regex);
    
    // Find the date using the pattern
    Matcher matcher = pattern.matcher(s);
    if (matcher.find()) {
        String extractedDate = matcher.group();
        System.out.println("Extracted date: " + extractedDate);
    } else {
        System.out.println("Date not found in the string.");
    }
}
}
