package learning.collections.compare;

public class Bus implements Comparable<Bus> {
    private String name;

    public Bus(String name) {
        this.name = name;
    }

    public Bus() {

    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Bus o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return name;
    }
}
