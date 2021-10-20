public class Lab8 {
    public static void main(String[] args){
        People heman = new People("Danil", "Ishutin", 29);
        heman.walk();
        heman.voice();
        heman.run();

        Student Danil = new Student("Nikolay", "Zakharov", 20);
        Danil.walk();
        Danil.voice();
        Danil.run();
        Danil.learn();

        Teacher Nikolay = new Teacher("Nikolay", "Petrov", 30);
        Nikolay.walk();
        Nikolay.voice();
        Nikolay.run();
        Nikolay.teach();
    }
}
