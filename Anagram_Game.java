import java.util.*;
public class Anagram_Game{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter total number of words to enter:");
        int n=sc.nextInt();
        String[]arr=new String[n];
        System.out.println("Enter " + n + " words:");
        for(int i=0;i<n;i++){
            System.out.println("Enter the word "+(i+1)+" : ");
            arr[i] = sc.nextLine();
        }
        int index=(int)(Math.random() * n);
        System.out.println("The word to be guessed is: "+arr[index]);
        String word=arr[index];
        System.out.println("Enter its anagram:");
        String anagram = sc .nextLine();
         if(isAnagram(word, anagram)){
            System.out.println("Wow!! you got the correct!");
        } 
        else{
            System.out.println("Oh No! better luck next time!");
        }
    }
     public static boolean isAnagram(String word, String anagram){
        if(word.length()!= anagram.length()) {
            return false;
        }

        char[] wordArray = word.toLowerCase().toCharArray();
        char[] anagramArray = anagram.toLowerCase().toCharArray();

        Arrays.sort(wordArray);
        Arrays.sort(anagramArray);

        return Arrays.equals(wordArray, anagramArray);
    }
}
