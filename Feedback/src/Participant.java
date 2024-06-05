import java.util.Scanner;

public class Participant extends Calculator{

    Scanner scan = new Scanner(System.in);

    private String name;

    public Participant(String name){
        this.name = name;
    }

    public void updateFeedback(){
        System.out.println("Hello " + name + "!");
        System.out.println("Give feedback by entering a number between 1 and 10(10 being the best).");
        System.out.println("Please give feedback for the chairperson: ");
        this.chairperson = scan.nextInt();
        System.out.println("Please give feedback for the discussion: ");
        this.discussion = scan.nextInt();
        System.out.println("Please give feedback for the topic: ");
        this.topic = scan.nextInt();
    }

    public int getChairperson(){return chairperson;}
    public int getDiscussion(){return discussion;}
    public int getTopic(){return topic;}

}
