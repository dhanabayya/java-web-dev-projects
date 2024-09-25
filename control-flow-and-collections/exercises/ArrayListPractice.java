import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> integerList=new ArrayList<>();
        integerList.add(11);
        integerList.add(16);
        integerList.add(20);
        integerList.add(17);
        integerList.add(110);
        integerList.add(1);
        integerList.add(44);
        integerList.add(98);
        integerList.add(64);
        integerList.add(35);
        System.out.println(sumEven(integerList));

        String forSearchSentence="I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String [] forSearchSentenceSplit=forSearchSentence.split(" ");
        System.out.println(forSearchSentenceSplit);

        for(String searchWord : forSearchSentenceSplit){
            String word=searchWord.toString();
            if(fiveLetterWord(word)){
                System.out.println(word);
            }
        }
        System.out.println("Enter a word length: ");
        int wordLength = input.nextInt();
        for(String i : forSearchSentenceSplit){
            String name=i.toString();
            if(i.length()==wordLength){
                System.out.println(name);
            }
        }
        input.close();

    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
    public static boolean fiveLetterWord(String args){
if(args.length()==5){
    return true;
}else{
    return false;
}
    }
    public static boolean wordLength(String word,int number){
        if(word.length()==number){
           return true;
        }else{
            return  false;
        }
    }
}
