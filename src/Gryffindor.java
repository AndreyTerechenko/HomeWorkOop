public class Gryffindor extends Hogwards {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String lostName, int strongMagic, int transgress, String faculty, int nobility, int honor, int bravery) {
        super(name, lostName, strongMagic, transgress, faculty);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void topStudent(Gryffindor point) {

        if (this.allSum() < point.allSum()) {
            System.out.println("Лучший студент Гриффиндора  " + point.getName() + " " + point.getLostName());
        } else if (this.allSum() > point.allSum()) {
            System.out.println("Лучший студент Гриффиндора  " + this.getName() + " " + this.getLostName());
        }
    }

    private int allSum() {
        return nobility + honor + bravery;

    }


    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() +
                ".\n Личные качества :\n " +
                " Благородство = " + nobility +
                ", Честь = " + honor +
                ", Храбрость = " + bravery + " ";
    }
}
