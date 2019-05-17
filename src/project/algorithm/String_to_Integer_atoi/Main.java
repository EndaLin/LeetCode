package project.algorithm.String_to_Integer_atoi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public int myAtoi(String str) {
        String temp = str.trim();
        if (temp.isEmpty() || (temp.charAt(0) != '-' && temp.charAt(0) != '+') && !Character.isDigit(temp.charAt(0))) {
            return 0;
        }
        if (temp.length() == 1 && !Character.isDigit(temp.charAt(0))) return 0;
        if (temp.indexOf("-") > -1 && temp.indexOf("-") != temp.length() - 1 && temp.indexOf("-") != temp.length() - 2 && temp.charAt(temp.indexOf("-") + 1) == ' ')
            return 0;
        if (temp.indexOf("+") > -1 && temp.indexOf("+") != temp.length() - 1 && temp.indexOf("+") != temp.length() - 2 && temp.charAt(temp.indexOf("+") + 1) == ' ')
            return 0;

        Pattern pattern = Pattern.compile("[-+]?[0-9]+");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String num = matcher.group();
            char[] ch = num.toCharArray();
            if (temp.length() >= 2 && temp.charAt(0) == '+' && temp.charAt(1) == '-') {
                return 0;
            }
            if (temp.length() >= 2 && temp.charAt(1) == '+' && temp.charAt(0) == '-') {
                return 0;
            }
            long ans = 0;
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == '-' || ch[i] == '+') {
                    continue;
                }
                ans = ans * 10 + ch[i] - 48;
                if (ans > Integer.MAX_VALUE) {
                    if (ch[0] == '-') {
                        return Integer.MIN_VALUE;
                    } else {
                        return Integer.MAX_VALUE;
                    }
                }
            }
            if (ch[0] == '-') {
                return (int) ans * -1;
            } else {
                return (int) ans;
            }
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        new Main().myAtoi("++1");
    }
}
