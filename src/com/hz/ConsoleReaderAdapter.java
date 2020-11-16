package com.hz;

import java.util.Arrays;
import java.util.List;

public class ConsoleReaderAdapter extends ConsoleReader{
    private final ConsoleReader consoleReader;

    public ConsoleReaderAdapter() {
        consoleReader = new ConsoleReader();
    }

    public boolean checkAnswer(){
        String input = consoleReader.readLine();
        String[] goodAnswers = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};
        List<String> answers = Arrays.asList(goodAnswers);

        if(answers.contains(input)){
            return true;
        }
        else{
            return false;
        }
    }
}
