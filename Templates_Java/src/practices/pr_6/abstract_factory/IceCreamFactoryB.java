package practices.pr_6.abstract_factory;

public class IceCreamFactoryB implements IceCreamFactory {
    @Override
    public IceCreamCone createIceCreamCone() {
        return new IceCreamConeB();
    }

    @Override
    public IceCreamSundae createIceCreamSundae() {
        return new IceCreamSundaeB();
    }
}
