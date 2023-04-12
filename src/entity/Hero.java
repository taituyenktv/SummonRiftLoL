package entity;

public class Hero {
    private String name;
    private String Position;

    public Hero(String name, String position) {
        this.name = name;
        Position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    @Override
    public String toString() {
        return
                "Tướng " + name + '\'' +
                ", Vị trí : " + Position + '\'' +
                '}';
    }
}
