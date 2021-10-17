public class People {
    protected String name;
    protected String lastname;
    protected int age;
    public People(String name, String lastname, int age){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }
    public void walk(){System.out.println(this.name +" "+ this.lastname + " может ходить");}
    public void voice(){System.out.println(this.name +" "+ this.lastname + " говорит");}
    public void run(){System.out.println(this.name +" "+ this.lastname +  " может бежать");}
    }
    class Student extends People{
        public Student(String name, String lastname, int age) {
            super(name, lastname, age);
    }
    void learn(){
            System.out.println(this.name +" "+ this.lastname + " учится");
        }
    }
    class Teacher extends People{
        public Teacher(String name, String lastname, int age) {
            super(name, lastname, age);
    }
    void teach(){
        System.out.println(this.name +" "+ this.lastname + " преподает");
    }
}

