package pack_worker;

import java.util.Objects;

abstract public class person {
    private int age;
    public int work_experience;
    public String firstName;
    private String lastName;
    public TeamNumber num_team;
    public int phoneNumber;



    public person(int age, int work_experience, TeamNumber num_team, String firstName, String lastName, int phoneNumber){
        int begWork;
        begWork = age - work_experience;
        if(begWork < 18) System.out.println(firstName + " started working at a young age: " + begWork);
        else System.out.println(firstName + " started working after 18 ");
    }

    public person(int age, int work_experience, TeamNumber num_team){
        this.age = age;
        this.work_experience = work_experience;
        this.num_team = num_team;
    }

    public person() {

    }

    public int getAge() {
        return age;
    }

    public int getWork_experience() {
        return work_experience;
    }

    public String getLastName() {
        return lastName;
    }

    public TeamNumber getNum_team() {
        return num_team;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setWork_experience(int work_experience) {
        this.work_experience = work_experience;
    }

    public void setNum_team() {
        if (num_team == TeamNumber.SECOND) {
            if (this.work_experience >= 2) this.num_team = num_team;
            else System.out.println("Not enough experience!");
        } else this.num_team = num_team;

        if (num_team == TeamNumber.THIRD) {
            if (this.work_experience >= 4) this.num_team = num_team;
            else System.out.println("Not enough experience!");
        } else this.num_team = num_team;
    }


    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    abstract public void specialization();

    public void sayNumTeam(){
        System.out.println("Hello, my name :" + firstName + ". I'm from " + num_team + " team.");
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return age == person.age && Objects.equals(work_experience, person.work_experience)
                && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName)
                && Objects.equals(phoneNumber, person.phoneNumber) && num_team == person.num_team;
    }

    @Override
    public int hashCode(){
        int result = num_team == null ? 0 : num_team.hashCode();
        result = result * 29 + age;
        result = result * 29 + work_experience;
        result = result * 29 + phoneNumber;
        return Objects.hash(age, work_experience, phoneNumber, num_team);
    }

    @Override
    public String toString(){
        return "person{ " + "age " + age + '\'' + "work experience " + work_experience + '\'' + "phone number "
                + phoneNumber + '\'' + "number team " + num_team + '\'' + '}';
    }
}
