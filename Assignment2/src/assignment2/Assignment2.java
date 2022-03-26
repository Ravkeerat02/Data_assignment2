package assignment2;

import java.util.Scanner;

/**
 *
 * @author UMIT KILINC 101232721
 * @author RAVKEERAT SINGH 101344680
 */
public class Assignment2 {

//    boolean exit;
//
//    public void printMenu() {
//        System.out.println("\n1) Add new word. ");
//        System.out.println("2) Delete word. ");
//        System.out.println("3) Get meaning. ");
//        System.out.println("4) Dictionary list. ");
//        System.out.println("5) Spell check a text file. ");
//        System.out.println("6) Exit. ");
//    }

//    public void runMenu() {
//        while (!exit) {
//            printMenu();
//            int option = getInput();
//            menuAction(option);
//        }
//    }

    private int getInput() {
        Scanner sc = new Scanner(System.in);
        int option = -1;
        while (option < 1 || option > 6) {
            try {
                System.out.print("\nEnter an option: ");
                option = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid selection. Try again.");
            }
        }
        return option;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
       while(true) {
           System.out.println("1: Add new word\n"+
                   "2: Delete word\n" +
                   "3: Get meaning\n" +
                   "4: Print Dictionary size\n"+
                   "5: Dictionary list\n" +
                   "6: Print Dictionary\n" +
                   "7: Exit");
           System.out.print("Enter your choice: ");
           int num = Integer.parseInt(sc.nextLine());
           boolean stop = false;
           switch (num) {
           case 1:
               if(Dictionary.size()==10000) {
                   System.out.println("Maximum capacity reached, not possible to add new words!");
               }
               System.out.print("Ente a word: ");
               String word = sc.nextLine();
               System.out.print("Ente the meaning of the word: ");
               String wordMeaning = sc.nextLine();
               //addWord(word,wordMeaning);
               break;
           case 2:
               if(Dictionary.size()==0) {
                   System.out.println("Dictionary is empty!");
               }
               else {
                   System.out.print("Enter a word to be deleted: ");
                   word = sc.nextLine();
                   if(deleteWord(word)) {
                       System.out.println("Word deleted successfully!");
                   }
                   else {
                       System.out.println("Word not found or Dictionary is empty!");
                   }
               }
               break;
           case 3:
               if(Dictionary.size()==0) {
                   System.out.println("Dictionary is empty!");
               }
               else {
                   System.out.print("Enter a word to get the meaning: ");
                   word = sc.nextLine();
                   if(getMeaning(word)!=null) {
                       System.out.println("The meaning of the entered word is: "+getMeaning(word).meaning);
                   }
               }
               break;
           case 4:
               System.out.println("The size of the Dictionary is: "+Dictionary.size());
               break;
           case 5:
               if(Dictionary.size()==0) {
                   System.out.println("Dictionary is empty!");
               }
               else {
                   System.out.println("The words in the Dictionary are");
                   for(String key:Dictionary.keySet()) {
                       System.out.println(key);
                   }
               }
               break;
           case 6:
               if(Dictionary.size()!=0) {
                   for(String wor:Dictionary.keySet()) {
                       System.out.println(wor+" = "+Dictionary.get(wor).meaning);
                   }
               }
               else {
                   System.out.println("Dictionary is empty!");
               }
               break;
           case 7:
               stop=true;
               break;
           default:
               break;
           }
           if(stop) {
               break;
           }
       }
       sc.close();


}
    
}

//private void addNewWord(){
//            System.out.println("Add new word.");
//        }
////    public static void main(String[] args) {
////        Assignment2 menu = new Assignment2();
////        menu.runMenu();
//    }
//}

