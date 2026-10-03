public abstract class Person {

    private String firstname;
    private int age;

    public Person(String firstname, int age) {

        this.firstname = firstname;
        this.age = age;

    }


    public  String getFirstname(){
        return this.firstname;
    }
    public  int getAge(){
        return this.age;
    }

    public String introduce() {
        return "Je m'appelle "+ this.getFirstname()+" et j'ai "+ this.getAge()+" ans";
    }

    public abstract String getRole();

}