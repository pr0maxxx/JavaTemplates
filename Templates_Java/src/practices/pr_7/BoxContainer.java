package practices.pr_7;

import java.util.List;

public class BoxContainer implements PackageComponent{

    private final List<PackageComponent> childrenComponents;

    public BoxContainer(List<PackageComponent> childrenComponents) {
        this.childrenComponents = childrenComponents;
    }

    public void add(PackageComponent packageComponent){
        childrenComponents.add(packageComponent);
    }

    public void remove(int index){
        childrenComponents.remove(index);
    }
    public List<PackageComponent> getChildren(){
        return childrenComponents;
    }

    @Override
    public int countPrice() {
        return childrenComponents.stream()
                .map(PackageComponent::countPrice)
                .mapToInt(Integer::intValue).sum();
    }
}
