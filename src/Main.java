public class Main {

    public static void main(String[] args) {

        Developer pierre = new Developer("Pierre", 46, true);
        pierre.setFirstname("Pierrot");
        Developer pasPierre = new Developer("Pas Pierre", 64, false);
        pierre.setAge(-42);
        System.out.println(pierre.getAge());

        pierre.setAge(47);
        System.out.println(pierre.getAge());
        String fonctionReturn = pierre.getDeveloperMessage();

        String fonctionReturn2 = pasPierre.getDeveloperMessage();

        System.out.println(fonctionReturn);
        System.out.println(pierre.getFirstname());


    }


}