package practices.pr_1;

import java.util.ArrayList;
import java.util.function.Function;
public class Main {
    public static void main(String[] args) {
        Function<ArrayList<String>, ArrayList<String>> function = new Function<ArrayList<String>, ArrayList<String>>() {
            @Override
            public ArrayList<String> apply(ArrayList<String> array) {
                ArrayList<String> result = new ArrayList<String>();
                for (int i = 0; i < array.size(); i++) {
                    String s = "";
                    for (int j = array.get(i).length() - 1; j >= 0; j--) {
                        s += array.get(i).charAt(j);
                    }
                    result.add(s);
                }
                return result;
            }
        };
        ArrayList<String> array = new ArrayList<String>();
        array.add("Hello");
        array.add("World");
        array.add("Good luck");
        System.out.println(function.apply(array));
    }
}
