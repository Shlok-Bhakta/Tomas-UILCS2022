import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("tomas.dat"));
        int loop = scanner.nextInt();
        


        for(int i = 0; i < loop; i++) {
            ArrayList<String> nums = new ArrayList<String>();
            
            outer:
            while(true){
                String tempin = scanner.next();
                inner:
                while(true){
                if(tempin == ""){
                    break outer;
                }else{
                    if(tempin == " "){
                        break inner;
                    }else{
                        nums.add(tempin);
                    }
                }
            }
            }
System.out.println(nums);




        }


    }
}
