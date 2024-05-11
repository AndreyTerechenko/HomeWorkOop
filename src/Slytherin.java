public class Slytherin extends Hogwards {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, String lostName, int strongMagic, int transgress, String faculty, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, lostName, strongMagic, transgress, faculty);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public void topStudent(Slytherin point) {
        if (this.allSum() < point.allSum()) {
            System.out.println("Лучший студент Слизерена  " + point.getName() + " " + getLostName());
        }
        if (this.allSum() > point.allSum()) {
            System.out.println("Лучший студент Слизерена  " + this.getName() + " " + this.getLostName());
        }
    }

    private int allSum() {
        return cunning + determination + ambition + resourcefulness + lustForPower;

    }


    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() +
                ".\n Личные качества : \n" +
                " хитрсть = " + cunning +
                ", Решительность = " + determination +
                ", Амбициозность = " + ambition +
                ", Находчивость = " + resourcefulness +
                ", Жажда Власти = " + lustForPower;
    }
}
