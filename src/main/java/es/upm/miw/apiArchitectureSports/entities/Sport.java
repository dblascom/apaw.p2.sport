package es.upm.miw.apiArchitectureSports.entities;

public class Sport {
    private String name;

    public Sport(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sport [name=" + name + "]";
    }
}
