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
            ArrayList<Character> possLet = new ArrayList<Character>();
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

            for(int xx = 0; xx < nums.size(); xx++){
                possLet.add(toLetters);


            }

         

            }


        }
        public static ArrayList<Character> toLetters(String inNum){
            ArrayList<Character> letterChar = new ArrayList<Character>();
                if(inNum.charAt(0) == '2'){
                    letterChar.add('A');
                    letterChar.add('B');
                    letterChar.add('C');
                }
                if(inNum.charAt(0) == '3'){
                    letterChar.add('D');
                    letterChar.add('E');
                    letterChar.add('F');
                }
                if(inNum.charAt(0) == '4'){
                    letterChar.add('G');
                    letterChar.add('H');
                    letterChar.add('I');
                }
                if(inNum.charAt(0) == '5'){
                    letterChar.add('J');
                    letterChar.add('K');
                    letterChar.add('L');
                }
                if(inNum.charAt(0) == '6'){
                    letterChar.add('M');
                    letterChar.add('N');
                    letterChar.add('O');
                }
                if(inNum.charAt(0) == '7'){
                    letterChar.add('P');
                    letterChar.add('Q');
                    letterChar.add('R');
                    letterChar.add('S');
                }
                if(inNum.charAt(0) == '8'){
                    letterChar.add('T');
                    letterChar.add('U');
                    letterChar.add('V');
                }
                if(inNum.charAt(0) == '9'){
                    letterChar.add('W');
                    letterChar.add('X');
                    letterChar.add('Y');
                    letterChar.add('Z');
                }
                if(inNum.charAt(0) == '0'){
                    letterChar.add(' ');

                }

            return letterChar;
        }

    }

