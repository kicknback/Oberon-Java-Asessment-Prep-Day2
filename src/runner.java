import java.util.Arrays;

public class runner {
    public static void main(String[] args) {

        int[] ints = {3, 52, 5, 7, 35, 78, 23};

        System.out.println(Arrays.toString(Questions.ascending(ints)));

        String exStr = "This is an example string";

        System.out.println(Questions.countWords(exStr));

        Questions.cardHidden("3905872784132953");

    }
}
