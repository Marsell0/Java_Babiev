package second_lesson;

import first_lesson.Turtle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Program {
    public static void splitList(ArrayList<Integer> source, ArrayList<Integer> positive, ArrayList<Integer> negative){
        for (int i = 0; i < source.size(); i++){
            if (source.get(i) > 0) {
              positive.add(source.get(i));
            } else if (source.get(i) < 0) {
                negative.add(source.get(i));
            }
//            System.out.println(source.get(i));
        }
    }
    public static void main(String args[]){
        Random rnd = new Random();
        ArrayList<Integer> source = new ArrayList<Integer>();
        ArrayList<Integer> positive = new ArrayList<Integer>();
        ArrayList<Integer> negative = new ArrayList<Integer>();
        for(int i = 0; i < 50; i++){
            source.add(rnd.nextInt(-50, 50));
        }
        splitList(source, positive, negative);
        Collections.sort(positive);
        Collections.sort(negative);
        for (int i = 0; i < positive.size(); i++){
            System.out.println(positive.get(i));
        }
        for (int i = 0; i < negative.size(); i++){
            System.out.println(negative.get(i));
        }
    }
}
