
import java.io.*;
/**
 * @Author: ym
 * @Date: 2019/7/26 15:40
 * @Version 1.0
 */
public class IOtest {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        if(args.length!=1){
            System.out.println("what the fuck");
            return;
        }
        try{
            fin =new FileInputStream(args[0]);
        }catch (FileNotFoundException exc){
            System.out.println("File not Found");
            return;
        }
        try{
            do{
                i =fin.read();
                if(i!=-1) System.out.println((char)i);

            }while (i !=1);

        }catch (IOException exc){
            System.out.println("Error reading file");

        }
        try{
            fin.close();
        }catch (IOException exc){
            System.out.println("Error Closing file.");
        }
    }
}
