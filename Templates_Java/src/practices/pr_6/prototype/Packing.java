package practices.pr_6.prototype;

public class Packing implements Cloneable {
    public void print() {
        System.out.println("New packing");
    }

    @Override
    public Packing clone() throws CloneNotSupportedException {
        return (Packing) super.clone();
    }
}
