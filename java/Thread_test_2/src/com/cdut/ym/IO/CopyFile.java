

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: ym
 * @Date: 2019/7/26 16:24
 * @Version 1.0
 */
public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin =null;
        FileOutputStream fout =null;
        if(args.length !=2){
            System.out.println();
            return;
        }

        try{
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do{
                i =fin.read();
                if(i!=-1)fout.write(i);

            }while (i!=-1);
        }catch (IOException exc){
            System.out.println("I/0 ERROR");

        }finally {
            fin.close();
            fout.close();
        }

    }
}
