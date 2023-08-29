public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("James Peterson", (byte) 34, 180F, 73.5F);
        Person person2 = new Person("Bob Thornley", (byte) 25, 171F, 68.2F);
        person1.growOlder();
        System.out.println("The name is: " + person1.getName());
        System.out.println("The age is: " + person1.getAge());
        System.out.println("The weight is: " + person1.getWeight() + "Lbs");
        System.out.println("The height is: " + person1.getHeight() + "cm");


    }
}
