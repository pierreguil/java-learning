public class  Developer extends Person implements Worker, Payable{


    private boolean isDeveloper;

    public Developer(String firstname, int age, boolean isDeveloper) {

        super(firstname, age);
        this.isDeveloper = isDeveloper;
    }

    @Override
    public double getSalary(){
        return 3000;
    }

    @Override
    public String getRole() {
        return "Développeur";
    }

    @Override
    public String work() {
        return this.getFirstname() + " est en train de coder";
    }

    @Override
    public String introduce() {
        return super.introduce() + " !!";
    }



}
