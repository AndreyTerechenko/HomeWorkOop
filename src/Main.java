public class Main {

    public static void main(String[] args) {
        Gryffindor germiona = new Gryffindor("Гермиона", "Грейнджер", 5, 4, "Гриффиндор", 5, 6, 8);
        Gryffindor potter = new Gryffindor("Гарри", "Поттер", 10, 9, "Гриффиндор", 10, 9, 9);
        Gryffindor wisly = new Gryffindor("Рон", "Уизли", 6, 3, "Гриффиндор", 4, 5, 5);
        Slytherin makfloy = new Slytherin("Драко", "Макфлой", 6, 7, "Слизерин", 5, 7, 5, 5, 8);
        Slytherin montegu = new Slytherin("Грэхэм", "Монтегю", 6, 4, "Слизерин", 5, 4, 6, 2, 2);
        Slytherin goil = new Slytherin("Грегори", "Гойл", 3, 2, "Слизерин", 6, 8, 2, 9, 6);
        Puffenduy smit = new Puffenduy("Захария", "Смит", 4, 8, "Пуффендуй", 3, 4, 2);
        Puffenduy dittory = new Puffenduy("Седрик", "Диттори", 7, 4, "Пуффендуй", 6, 4, 7);
        Puffenduy finch = new Puffenduy("Джастин", "Финч-Флетчли", 5, 9, "Пуффендуй", 6, 4, 8);
        Kogtevran chang = new Kogtevran("Чжоу", "Чанг", 3, 8, "Когтевран", 6, 4, 8, 0);
        Kogtevran patil = new Kogtevran("Падма", "Патил", 5, 4, "Когтевран", 5, 2, 9, 6);
        Kogtevran balby = new Kogtevran("Маркус", "Белби", 8, 7, "Когтевран", 4, 2, 9, 6);
        System.out.println(patil);
        makfloy.topInHogwards(potter);
        chang.topStudent(balby);
        finch.topStudent(dittory);
        goil.topStudent(montegu);
        germiona.topStudent(wisly);
    }
}








