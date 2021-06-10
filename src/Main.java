
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = Copy_Array.copy();

        String k = " ";
        while (true) {

            System.out.print("TS01:>");
            if (sc.hasNext() && (k = sc.next()) .equals("exit"))
                System.exit(0);
            if ( k.equals("search")&& sc.hasNext())
                method(sc.next(),arr);


        }
    }

    private static void method(String word,String[] arr) {

        String[] local =new String[50];
        String line;
        int found =0;
        for (int i=0;i<Copy_Array.count;i++) {
            line= arr[i];
            local = line.split(" ");
            for (String wo: local) {
                if(wo.matches(word)) {
                    display("Alice in Wonderland", i, line);
                    found = 1;
                }
            }


        }
        if(found ==0)System.out.println("word not found");


    }

    private static void display(String book_name, int line_num, String line) {
        System.out.println(book_name+" "+line_num+" "+line);
    }


}

