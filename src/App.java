import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("tomasJUD.dat"));
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

            for(int xx = 0; xx < nums.size(); xx++){
                ArrayList<Character> possLet = new ArrayList<Character>();
                int cursor = 0;
                

                possLet = toLetters(nums.get(xx));
                
                    if(possLet.size() == 1){
                        cursor = 0;

                    }
                    if(possLet.size() == 3){
                        int mod = (nums.get(xx).length() % 3);
                        if(mod == 0){
                            cursor = 2;
                            
                        }
                        if(mod == 1){
                            cursor = 0;
                            
                        }
                        if(mod == 2){
                            cursor = 1;
                            
                        }


                    }
                    if(possLet.size() == 4){
                        int mod = (nums.get(xx).length() % 4);
                        if(mod == 0){
                            cursor = 3;
                            
                        }
                        if(mod == 1){
                            cursor = 0;
                            
                        }
                        if(mod == 2){
                            cursor = 1;
                            
                        }if(mod == 3){
                            cursor = 2;
                        }

                            
                            
                        

                        

                    }
                    System.out.print(possLet.get(cursor));

            }
            System.out.println();
         

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

