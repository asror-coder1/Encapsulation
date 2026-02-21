//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Asror");
        student.setSurname("Fayzullayev");
        student.setAge(16);

        System.out.println("Name : " + student.getName() + "\nSurname : " + student.getSurname() + "\nAge : " + student.getAge());

        System.out.println("=================================");

        Student student1 = new Student("Asror" , "Fayzullayev" , 16);
        System.out.println(student1.getName()+"\n"+student1.getAge()+"\n"+student1.getSurname());


//        ====================================

        Animal animal = new Animal();
        animal.setName("Ismoil");
        animal.setAge(16);

        System.out.println("Name : " + animal.getName() + "Age" + animal.getAge());


    }

}