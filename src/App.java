import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("tomas.dat"));
        int loop = scanner.nextInt();
        scanner.nextLine();
        String temp = "";

        for(int i = 0; i < loop; i++) {
            ArrayList<String> nums = new ArrayList<String>();
            scanner.nextLine();
            String scan = scanner.nextLine() + " ";



            
            
                
            for(int j = 0; j < scan.length(); j++) {
                
                if(scan.charAt(j) != ' '){
                    
                    temp = temp + scan.toString().charAt(j);
                    
                }else{
                    nums.add(temp);
                    temp = "";
                }


            }
         



            }


        }
        public static char[] toLetters(String inNum){
            ArrayList<Character> letterChar = new ArrayList<Character>();
                if(inNum.charAt(0) == '2'){
                    letterchar
                }


            return letterChar.;
        }

    }

