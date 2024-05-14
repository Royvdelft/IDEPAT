package week2;

public class SillyString extends TreeDecorator{

    public SillyString(ChristmasTree tree){
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithSillyString();
    }

    private String decorateWithSillyString() {
        return " with Silly String";
    }
}
