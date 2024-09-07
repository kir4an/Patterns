package decorator;

public class CoffeeRunner {
    public static void main(String[] args) {
        Coffee coffee = new DefaultCoffee();
        System.out.println("Стоимость простого кофе: " + coffee.cost());

        coffee = new MilkDecorator(coffee);
        System.out.println("Стоимость кофе с молоком: " + coffee.cost());

        coffee = new SugarDecorator(coffee);
        System.out.println("Стоимость кофе с молоком и сахаром: " + coffee.cost());
    }
}
