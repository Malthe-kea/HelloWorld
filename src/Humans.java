public class Humans {
    public static void main(String[] args) {

        HumanMaker human1 = new HumanMaker(42, "Flemming", 1000);
        HumanMaker human2 = new HumanMaker(11, "Lone", 1000);

        System.out.println("your name is " + human2.name + " and is " + human2.age+  " years old. You also have a powerlevel of " + human2.powerLevel);
        System.out.println("your name is " + human1.name + " and is " + human1.age+   " years old. You also have a powerlevel of " + human2.powerLevel);


    }
}
