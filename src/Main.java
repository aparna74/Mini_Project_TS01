/*reads a word from user and writes bookname,
line number of line in which this word exists
,and line itself to the consle
 */
/*reads a word from user and writes bookname,
line number of line in which this word exists
,and line itself to the consle
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//to read input from user
        String[] arr = Copy_Array.copy_file_array();  //array of lines

        String k = " ";
        while (true) {

            System.out.print("TS01:>");
            if (sc.hasNext() && (k = sc.next()).equals("exit"))
                sc.close();
                System.exit(0);
            if (k.equals("search") && sc.hasNext())
                /*calling a method and passing word ,and array of lines to search word occurances
                output apropriate  lines*/
                search_word(sc.next(), arr);

        }
    }

    private static void search_word(String word, String[] arr) {

        String[] local = new String[50];//local string array to store words in a line temporarily
        String line;
        int found = 0;
        /*count gives current size of array, static data member of
        class Copy_Array class*/
        for (int i = 0; i < Copy_Array.count; i++) {

            line = arr[i];
            local = line.split(" ");
            for (String wo : local) {//wo represents each word of i th line
                if (wo.matches(word)) {
                    display("Alice in Wonderland", i, line);
                    found = 1;
                }
            }


        }
        if (found == 0) System.out.println("word not found");


    }

    private static void display(String book_name, int line_num, String line) {
        System.out.println(book_name + " " + line_num + " " + line);
    }


}

