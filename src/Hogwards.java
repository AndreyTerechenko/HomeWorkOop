public class Hogwards {
    private String name;
    private String lostName;
    private int strongMagic;
    private int transgress;
    private String faculty;

    private int pointsPower() {
        return strongMagic + transgress;
    }

    public void topInHogwards(Hogwards point) {
        if (this.pointsPower() < point.pointsPower()) {
            System.out.println("Сильнейший ученик Хогвардс " + point.getName() + " " + point.getLostName() + " " + point.getFaculty());
        } else if (this.pointsPower() > point.pointsPower()) {
            System.out.println("Сильнейший ученик Хогвардс " + this.getName() + " " + this.getLostName() + " " + this.getFaculty());
        }
    }

    public Hogwards(String name, String lostName, int strongMagic, int transgress, String faculty) {
        this.name = name;
        this.lostName = lostName;
        this.strongMagic = strongMagic;
        this.transgress = transgress;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLostName() {
        return lostName;
    }

    public void setLostName(String lostName) {
        this.lostName = lostName;
    }

    public int getStrongMagic() {
        return strongMagic;
    }

    public void setStrongMagic(int strongMagic) {
        this.strongMagic = strongMagic;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return " Имя = " + name + '\'' +
                ", Фамилия = " + lostName + '\'' +
                ", Сила Магии = " + strongMagic +
                ", Трансгресия = " + transgress +
                ", Факультет = " + faculty;
    }

}

