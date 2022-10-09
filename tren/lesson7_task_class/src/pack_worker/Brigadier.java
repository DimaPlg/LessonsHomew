package pack_worker;

public class Brigadier extends person{
    private int numSubordinates;
    private String nameObject;



    public int getNumSubordinates() {
        return numSubordinates;
    }

    public String getNameObject() {
        return nameObject;
    }

    public Brigadier(){

    }

    public Brigadier(int numSubordinates, int age, int work_experience, TeamNumber num_team, String firstName,
                   String lastName, int phoneNumber){
        super(age, work_experience, num_team, firstName, lastName, phoneNumber);
        this.numSubordinates = numSubordinates;
    }

    public void setNameObject(String nameObject){
        this.nameObject = nameObject;
    }

    public void setNumSubordinates(int numSubordinates){
        this.numSubordinates = numSubordinates;
    }

    public void newObject(String newNameObject){
        if(newNameObject == nameObject) System.out.println("I'm already work!");
        else{
            nameObject = newNameObject;
            System.out.println("Ok, from the next day I start work!");}
    }

    public void newSubordinates(int newNumSubordinates){
        if(newNumSubordinates == numSubordinates) System.out.println("No newcomers...");
        if (newNumSubordinates <  numSubordinates && newNumSubordinates <= 5) System.out.println("It's bed, not enough people");
        else System.out.println("Nice, more work...");
    }

    @Override
    public void specialization() {

    }
}
