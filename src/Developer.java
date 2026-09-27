public class Developer {

    private String firstname;
    private int age;
    private boolean isDeveloper;

    public Developer(String firstname, int age, boolean isDeveloper) {

        this.firstname = firstname;
        this.age = age;
        this.isDeveloper = isDeveloper;

    }

    public  String getFirstname(){
        return this.firstname;
    }

    public void setFirstname(String newFirstname){
        this.firstname = newFirstname;
    }

    public  int getAge(){
        return this.age;
    }

    public void setAge(int newAge) {
        if (newAge >= 0) {
            this.age = newAge;
        }
    }

    public  String getDeveloperMessage() {


        if (isDeveloper) {

            return firstname + " est developpeur et il a " + age + " ans";

        }

        return firstname + " n'est pas developpeur et il a " + age + " ans";


    }

}
