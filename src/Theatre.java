public class Theatre {
    public static void main(String[] args) {
        // Создаем актеров
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 180);
        Actor actor2 = new Actor("Мария", "Петрова", Gender.FEMALE, 170);
        Actor actor3 = new Actor("Алексей", "Сидоров", Gender.MALE, 185);

        // Создаем режиссеров
        Director director1 = new Director("Петр", "Петров", Gender.MALE, 10);
        Director director2 = new Director("Анна", "Кузнецова", Gender.FEMALE, 15);

        // Создаем автора музыки и хореографа
        Person musicAuthor = new Person("Людмила", "Смирнова", Gender.FEMALE);
        Person choreographer = new Person("Сергей", "Васильев", Gender.MALE);

        // Создаем спектакли
        Show show = new Show("Гамлет", 120, director1);
        Opera opera = new Opera("Кармен", 150, director2, musicAuthor, "Либретто оперы Кармен", 30);
        Ballet ballet = new Ballet("Лебединое озеро", 140, director1, musicAuthor, "Либретто балета Лебединое озеро", choreographer);

        // Добавляем актеров в спектакли
        show.addActor(actor1);
        show.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        // Выводим список актеров для каждого спектакля
        show.printActors();
        opera.printActors();
        ballet.printActors();

        // Заменяем актера в спектакле
        opera.replaceActor(new Actor("Николай", "Иванов", Gender.MALE, 182), "Петрова");
        opera.printActors();

        // Пытаемся заменить несуществующего актера
        ballet.replaceActor(new Actor("Ольга", "Смирнова", Gender.FEMALE, 168), "Иванова");

        // Выводим текст либретто для оперы и балета
        opera.printLibretto();
        ballet.printLibretto();
    }
}

