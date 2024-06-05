import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static ArrayList<Participant> participants = new ArrayList<>();

    public static void main(String[] args) {
        participants.add(new Participant("Casper"));
        participants.add(new Participant("Valon"));
        participants.add(new Participant("Muhammed"));
        participants.add(new Participant("Lea"));
        for (Participant participant : participants) {
            participant.updateFeedback();
        }
        Calculator calc = new Calculator();
        calc.getAverage();
    }
}