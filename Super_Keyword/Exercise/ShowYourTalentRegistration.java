package OverridingAndSuper;

class EventRegistration{
    protected String name;
    protected String nameOfEvent;
    protected double registrationFee;

    public EventRegistration(String name, String nameOfEvent){
        this.name = name;
        this.nameOfEvent = nameOfEvent;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getNameOfEvent(){
        return this.nameOfEvent;
    }
    public void setNameOfEvent(String nameOfEvent){
        this.nameOfEvent = nameOfEvent;
    }
    public double getRegistrationFee(){
        return this.registrationFee;
    }
    public void setRegistrationFee(double registrationFee){
        this.registrationFee = registrationFee;
    }
    public void registerEvent(){
        if(this.nameOfEvent == "ShakeALeg"){
            this.registrationFee = 100;
        }
        else if(this.nameOfEvent == "Sing&Win"){
            this.registrationFee = 150;
        }
        else if(this.nameOfEvent == "Actathon"){
            this.registrationFee = 70;
        }
        else if(this.nameOfEvent == "PlayAway"){
            this.registrationFee = 130;
        }
        else {
            System.out.println("Please choose a valid event");
        }
        if(this.registrationFee != 0){
            // System.out.println(String.format("Thank You %s for your participation. Your registration fee is: " + this.registrationFee, this.name));
            System.out.println(String.format("Thank You %s for your participation. Your registration fee is: %.1f", this.getName(), this.getRegistrationFee()));
        }
        
    }
}
class SingleEventRegistration extends EventRegistration{
    public int participantNo;

    public SingleEventRegistration(String name, String nameOfEvent, int participantNo){
        super(name, nameOfEvent);
        this.participantNo = participantNo;
    }
    public int getParticipantNo(){
        // return this.ParticipantNo;
        return this.participantNo;
    }
    public void setParticipantNo(int participantNo){
        this.participantNo = participantNo;
    }

    
    public void registerEvent(){
        super.registerEvent();
        System.out.println("You are Participant no: " + this.participantNo);
    }

}
class TeamEventRegistration extends EventRegistration{
    public int noOfParticipant;
    public int teamNo;

    public TeamEventRegistration(String name, String nameOfEvent, int noOfParticipant, int teamNo){
        super(name, nameOfEvent);
        this.noOfParticipant = noOfParticipant;
        this.teamNo = teamNo;
    }
    public int getNoOfParticipants(){
        return this.noOfParticipant;
    }
    public void setNoOfParticipants(int noOfParticipant){
        this.noOfParticipant = noOfParticipant;
    }
    public int getTeamNo(){
        return this.teamNo;
    }
    public void setTeamNo(int teamNo){
        this.teamNo = teamNo;
    }

    public void registerEvent(){
        if(super.nameOfEvent == "ShakeALeg"){
            super.registrationFee = 50;
        }
        else if(super.nameOfEvent == "Sing&Win"){
            super.registrationFee = 60;
        }
        else if(super.nameOfEvent == "Actathon"){
            super.registrationFee = 80;
        }
        else if(super.nameOfEvent == "PlayAway"){
            super.registrationFee = 100;
        }
        if(super.registrationFee != 0){
            System.out.println(String.format("Thank You %s for your participation. Your registration fee is: %.1f", super.name, super.registrationFee));
            System.out.println("You are Team no: " + this.getTeamNo());
            System.out.println("You are Participant no: " + this.getNoOfParticipants());
        }
    }

}

public class ShowYourTalentRegistration {
    public static void main(String[] args) {
        EventRegistration participant1 = new SingleEventRegistration("Jenny", "Sing&Win", 1);
        EventRegistration participant2 = new SingleEventRegistration("Hudson", "PlayAway", 2);
        EventRegistration participant3 = new TeamEventRegistration("Aura", "ShakeALeg", 5, 1);
        participant1.registerEvent();
        participant2.registerEvent();
        participant3.registerEvent();
        // System.out.println("This is package");
    }
}