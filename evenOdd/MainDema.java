package evenOdd;

import java.util.Arrays;
import java.util.List;

class MySuperClass {
    public String getType()
    {
        return "MySuperCLass";
    }
}

public class MainDema extends MySuperClass {
     static int amount = 1;

    public String getType() {
        return "MainDemo";
    }

    public static void main(String[] args) {

        MySuperClass s1 = new MainDema();
        System.out.println(s1.getType());

        MainDema print = new MainDema();

        List<Integer> integerList = Arrays.asList(5,7,8,2);
        List<Character> characterList = Arrays.asList('a','e','i','o','u');
        List<String> stringList = Arrays.asList("Phrkar","Dann","Karma","Sonam");


        System.out.println(amount);

        for(int i: integerList) {
            //print.printNum(i);
        }

        for(char c: characterList) {
           // print.printChar(c);
        }

//        for(String s: stringList) {
//            if(s.toLowerCase().contains("kar")) {
//                print.printString(s);
//            }
//        }
    }

    private void printString(String s) {
        System.out.print(s + "");
    }

    private void printChar(char c) {
        if(c == 'o' || c == 'a') {
            System.out.print(c + "");
        }
    }

    public void printNum(int n) {
        System.out.print(2*n+ " ");
    }
}
