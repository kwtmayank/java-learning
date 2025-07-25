package learning.designPatterns.singleton;


public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    private static ChocolateBoiler instance = null;

    public static ChocolateBoiler getInstance(){
        if(instance == null){
            synchronized(ChocolateBoiler.class){
                instance = new ChocolateBoiler();
            }
        }
        return instance;
    }



    public void fill() {
        System.out.println("Filling the boiler");
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("Boiler is filled");
        }else{
            System.out.println("Boiler is already filled");
        }

    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
            System.out.println("Draining the boiled milk");
        }else{
            System.out.println("Boiler is empty");
        }

    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
            System.out.println("Boiling the milk");
        }else{
            System.out.println("Boiler is already boiled or empty");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void setBoiled(boolean boiled) {
        this.boiled = boiled;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
}
