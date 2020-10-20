import org.apache.commons.lang3.StringUtils;

public class StringPlay {
    public static String capitalizeLetter(String letter){
        return StringUtils.upperCase(letter);
        //return letter.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(capitalizeLetter("a"));
    }
}
