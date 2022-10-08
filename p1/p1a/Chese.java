package p1a;
public class Chese extends CondimentDecorator {
    Pizza pizza;
    
    public Chese (Pizza pizza){
        this.pizza = pizza;
    }

    public double cost(){
        return 0.20 + pizza.cost();
    }
    
    public String getDescription(){
        return pizza.getDescription() + ", Chesse";
    }
}
