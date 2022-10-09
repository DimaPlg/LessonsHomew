package pack_worker;

public class Builder extends person{
    private String nameObject;
    public String specialization;


    public Builder(){

    }

    public Builder(int age, int work_experience, TeamNumber num_team, String firstName,
                   String lastName, int phoneNumber){
        super(age, work_experience, num_team, firstName, lastName, phoneNumber);
        this.nameObject = "No object";
    }

    public Builder(String nameObject, int age, int work_experience, TeamNumber num_team, String firstName,
                   String lastName, int phoneNumber){
        super(age, work_experience, num_team, firstName, lastName, phoneNumber);
        this.nameObject = nameObject;
    }

    public String getSpecialization(){
        return specialization;
    }

    public Builder(String specialization){
        this.specialization = specialization;
    }

    public Builder(int age, int work_experience, TeamNumber num_team) {
        super(age, work_experience, num_team);
    }

    public void setNameObject(String nameObject){
        this.nameObject = nameObject;
    }

    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }

    public void newObject(String newNameObject){
        if(newNameObject == nameObject) System.out.println("I'm already work!");
        else{
            nameObject = newNameObject;
            System.out.println("Ok, from the next day I start work!");}
    }

    public void sayWhoYou(){
        System.out.println("My name is" + firstName + " my specialization" + specialization);
    }

    @Override
    public void specialization() {
        System.out.println("Specialization "+ firstName + " is " + specialization);
    }
}
