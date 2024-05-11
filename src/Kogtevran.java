public class Kogtevran extends Hogwards {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creation;

    public Kogtevran(String name, String lostName, int strongMagic, int transgress, String faculty, int intelligence, int wisdom, int wit, int creation) {
        super(name, lostName, strongMagic, transgress, faculty);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public void topStudent(Kogtevran point) {
        if (this.allSum() < point.allSum()) {
            System.out.println("Лучший студент Когтевранa " + point.getName() + " " + getLostName());
        }
        if (this.allSum() > point.allSum()) {
            System.out.println("Лучший студент Когтевранa " + this.getName() + " " + this.getLostName());
        }
    }

    private int allSum() {
        return intelligence + wisdom + wit + creation;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }


    @Override
    public String toString() {
        return super.toString() +
                ".\n Личные качества : \n" +
                ", Ум = " + intelligence +
                ", Мудрость = " + wisdom +
                ", Остроумие = " + wit +
                ", Творчество = " + creation;
    }


}

