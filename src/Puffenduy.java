public class Puffenduy extends Hogwards {
    private int hardworking;
    private int loyalty;
    private int honesty;

    public Puffenduy(String name, String lostName, int strongMagic, int transgress, String faculty, int hardworking, int loyalty, int honesty) {
        super(name, lostName, strongMagic, transgress, faculty);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void topStudent(Puffenduy point) {
        if (this.allSum() < point.allSum()) {
            System.out.println("Лучший студент Пуффендуя  " + point.getName() + " " + getLostName());
        }
        if (this.allSum() > point.allSum()) {
            System.out.println("Лучший студент Пуффендуя  " + this.getName() + " " + this.getLostName());
        }
    }

    private int allSum() {
        return hardworking + loyalty + honesty;

    }


    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                ".\n Личные качества : \n" +
                " Трудолюбивость = " + hardworking +
                ", Верность = " + loyalty +
                ", Честность = " + honesty;
    }
}
