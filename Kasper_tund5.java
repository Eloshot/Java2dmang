import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;


public class Kasper_tund5 {


    public static void main(String[] args) {
        Integer[] list = {5,202,345,66,3,5,78,3,341,51,2,3444,499};
        String[] soned = {"üks", "kaks", "kolm", "kaks", "neli", "üks", "viis", "kaks",
                "kolm", "neli", "viis", "üks", "üks", "kaks"};
        List<Integer> list1 = Arrays.asList(list);
        List<String> list2 = Arrays.asList(soned);
        ul1(new ArrayList<>(list1));
        ul2(new ArrayList<>(list2));



    }
     public static void ul1(ArrayList<Integer> list) {
         List<Integer> suuremad = new ArrayList<>();
         List<Integer> vaiksemad = new ArrayList<>();
         for (Integer number : list) {
             if (number > 100) {
                 suuremad.add(number);
             } else {
                 vaiksemad.add(number);
             }
         }
         System.out.println(suuremad);
         Collections.sort(vaiksemad);
         System.out.println(vaiksemad);
     }
     public static void ul2(ArrayList<String> list) {
         HashMap<Character, Integer> letterCount = new HashMap<>();

         for (String word : list) {
                 char letter = word.charAt(0);
                 letterCount.put(letter, letterCount.getOrDefault(letter, 0) + 1);
         }
         for (char letter : letterCount.keySet()) {
             System.out.println(letter + ": " + letterCount.get(letter));

         }
     }
}