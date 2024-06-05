public class Calculator {
    protected int chairperson;
    protected int discussion;
    protected int topic;

    protected void getAverage(){
        float avChairperson = 0;
        float avDiscussion = 0;
        float avTopic = 0;
        float avOverall = 0;
        for(Participant participant : Main.participants){
            avChairperson += participant.getChairperson();
            avDiscussion += participant.getDiscussion();
            avTopic += participant.getTopic();
        }
        avOverall = (avChairperson + avDiscussion + avTopic)/(Main.participants.size() * 3);
        avChairperson = avChairperson/Main.participants.size();
        avDiscussion = avDiscussion/Main.participants.size();
        avTopic = avTopic/Main.participants.size();

        System.out.println("The average score for the chairperson is: " + avChairperson);
        System.out.println("The average score for the discussion is: " + avDiscussion);
        System.out.println("The average score for the topic is: " + avTopic);
        System.out.println("The overall average score is: " + avOverall);
    }
}
