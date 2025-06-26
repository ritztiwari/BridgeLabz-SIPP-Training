public class Student1 {
    public String name;  // private field
    int age = 25;

    Student1(String name,int age){
        this.age = age;
        this.name = name;
        System.out.println("rishabh class age and name");
    }
    Student1(int age){
        this.age = age;
        // this.name = name;
        System.out.printf("rishabh class age is %d:",age);
    }
    Student1(String name){
        // this.age = age;
        this.name = name;
        System.out.printf("rishabh class is student name is %s",name);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}

class rishabh extends Student1{
    rishabh(String name,int age){
        super(name);
    }
}
