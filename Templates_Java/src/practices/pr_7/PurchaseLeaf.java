package practices.pr_7;

public class PurchaseLeaf implements PackageComponent{
    private  int price;

    public PurchaseLeaf(int price) {
        this.price = price;
    }

    @Override
    public int countPrice() {
        return price;
    }
}
