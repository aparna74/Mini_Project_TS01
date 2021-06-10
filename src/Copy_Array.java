import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class Copy_Array {
    static int count = 0;
    static String[] arr=new String[100000];


    static String[]  copy() {


        File file = new File("C:\\Users\\abotl\\OneDrive\\Desktop\\alice_in_wonderland.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                arr[count++] = sc.nextLine();
            }


        } catch (FileNotFoundException fe) {
            System.out.println("file not found");
            System.exit(0);
        }
        return (arr);

    }
}

