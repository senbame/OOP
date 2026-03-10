package lab2.Problem5;

public class PhDStudent extends Person {
    private String topic;
    private String major;

    public PhDStudent(String name , int age , String topic , String major){
        super(name, age);
        this.topic = topic;
        this.major = major;
    }

    
    @Override
    public void assignPet(Animal pet) {
        if(pet instanceof Dog){
            System.out.println("PhD Students are not able to have dog's as a pet because they don't have time!");
            return;
        }
        super.assignPet(pet);
    }
    public String getMajor() {
        return major;
    }
    public String getTopic() {
        return topic;
    }
    @Override
    public String getOccupation() {
        return "PhD Student's majority is " + major + " and research topic is " + topic;
    }


}
