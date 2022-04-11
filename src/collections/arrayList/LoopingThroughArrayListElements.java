package collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class LoopingThroughArrayListElements {
    public static void main(String[] args) {


        ArrayList<Character> chars = new ArrayList<>();  // this can also be created as List<Character> chars = new ArrayList<>);

        chars.add('D');
        chars.add('A');
        chars.add('B');
        chars.add('C');

        System.out.println("My list before sort = " + chars);
        Collections.sort(chars);
        System.out.println("My list after sort = " + chars);

        //PRINTING EACH ELEMENT WITH FOR I LOOP

        for(int i = 0; i <= chars.size()-1; i++){
            System.out.println(chars.get(i));

            for(Character element: chars){
                System.out.println(element);
            }
        }
    }
}
