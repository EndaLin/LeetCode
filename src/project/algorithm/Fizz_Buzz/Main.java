package project.algorithm.Fizz_Buzz;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public List<String> fizzBuzz(int n) {
        List<String> listAns = new ArrayList<>(n);
        for (int i = 1;i <= n;i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                listAns.add("FizzBuzz");
            } else if (i % 3 == 0) {
                listAns.add("Fizz");
            } else if (i % 5 == 0) {
                listAns.add("Buzz");
            } else {
                listAns.add(String.valueOf(i));
            }
        }
        return listAns;
    }
}
