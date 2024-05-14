package week1;

public class SillyString extends TreeDecorator{

    public SillyString(ChristmasTree tree){
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " with Silly String";
    }
}
