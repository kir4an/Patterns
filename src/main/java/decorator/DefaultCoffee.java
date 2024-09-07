package decorator;

public class DefaultCoffee implements Coffee {
    @Override
    public double cost(){
        return 5.0;
    }
}
