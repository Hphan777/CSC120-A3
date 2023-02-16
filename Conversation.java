import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

import javax.lang.model.util.ElementScanner14;

class Conversation {

    public static void main(String[] args) {

      ArrayList<String>transcript = new ArrayList<String>();
      Scanner userInput = new Scanner(System.in);
      System.out.println("How many rounds?");
      int num_Rounds = userInput.nextInt();
      transcript.add("How many rounds?");
      transcript.add(Integer.toString(num_Rounds));

      //calling random method
      Random r = new Random();

      userInput.nextLine();
   
      String[] conversation = new String[2*num_Rounds+1];
      conversation[0] = "Hi there!  What's on your mind?";
      transcript.add("Hi there! What's on your mind?");

      System.out.println(conversation[0]); 

      for (int i = 0; i < num_Rounds; i++) { 
        Scanner mirror = new Scanner(System.in);
        String mirrored = mirror.nextLine();
        String mirrored1 = mirrored;
        
        //strings is split
        String[] splited = mirrored1.split(" ");


        //array list for random responses 
        String[] canned_responses = {"mmhm", "I see", "Ok.", "I don't care", "shut up", "loser"};
        //array list for user's input 
        String[] input = {"I", "me", "am", "you", "my", "your"};
        //array list of mirrored words of user's input
        String[] replacment = {"you", "you", "are", "I", "your", "my"}; 

        //empty strings to add
        String str = "";

        int counter = 0;
        String words; 
        //for loop to 
        for (int i2 = 0; i2 < splited.length; i2++) {
          words = "";
          for (int h = 0; h < input.length; h++ ) {
            if(splited[i2].equalsIgnoreCase(input[h])){
              counter ++;
              words = replacment[h];
            }
            if(words.equals("")){
              //str += words[i] + " "; 

            }

            }if (words.equals("")){
              str += splited[i2] + " ";
            }else{
              str += words + " ";
            }
          }if (counter > 0){
            System.out.println(str + "?");
            transcript.add(str);


          }if (counter <= 0){
            String random = (canned_responses[r.nextInt(canned_responses.length)]);
            transcript.add(str);
            transcript.add(random);
          
          }
          System.out.println("Thanks for chatting!");
          transcript.add("Thanks for chatting!");
          System.out.println("TRANSCRIPT:");
          //each sentences printed into transcript
          for (String word: transcript);
            System.out.println(transcript);
            







    

            


        

        }

  
          userInput.close(); }}
          

      
    

      


    
  


