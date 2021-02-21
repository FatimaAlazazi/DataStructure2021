package lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by fatima on 21/02/2021.
 */
public class ReadTextToList {
    public static void main(String[] args) {
        SinglyLinkedList<String> list= new SinglyLinkedList<>();

        try {
            Scanner input= new Scanner(new File("F://Students.txt"));

            while (input.hasNext())
            {list.addFirst(input.nextLine());}

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
        System.out.println(list.print());
    }
}
