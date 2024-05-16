package week2;

public class Main {
    public static void main(String[] args) {
        ChristmasTree tree1 = new BubbleLights(new ChristmasTreeImpl());
        System.out.println(tree1.decorate());

        ChristmasTree tree2 = new SillyString(new BubbleLights(new ChristmasTreeImpl()));
        System.out.println(tree2.decorate());

        ChristmasTree tree69 = new SillyString(new ChristmasTreeImpl());
        System.out.println(tree69.decorate());

    }
}