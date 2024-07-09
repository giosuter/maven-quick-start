package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {

    public int countWords(String phrase) {
        String[] separateWords = StringUtils.split(phrase, ' ');
        return (separateWords == null) ? 0 : separateWords.length;
    }

    public void greet() {
        List<String> greetings = new ArrayList<>();
        greetings.add("Hello Giovanni");

        for(String greeting : greetings) {
            System.out.println("Greeting is: " + greeting);
        }
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println("Starting Application");
	    Application app = new Application();
        app.greet();
        int count = app.countWords("I have 5 cool words!");
        System.out.println("Word count: " + count);
    }

    public Application() {
        System.out.println ("Inside Application");
    }

}
