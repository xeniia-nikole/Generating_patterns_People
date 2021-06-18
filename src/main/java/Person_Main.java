public class Person_Main {
    public static void main(String[] args) {
        Person anna = new PersonBuilder()
                .setFirstName("Анна")
                .setLastName("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person anton = anna.newChildBuilder()
                .setFirstName("Антошка")
                .setAge(3)
                .build();
        System.out.println("Пример #1\n~У~ " + anna + " ~есть сын,~ " + anton);


        Person lawrence = new PersonBuilder()
                .setFirstName("Лоуренс")
                .setLastName("Блэк")
                .setAge(31)
                .setAddress("Франкфурт")
                .build();
        Person vanessa = lawrence.newChildBuilder()
                .setFirstName("Ванесса")
                .setAge(0)
                .build();
        System.out.println("Пример #2\n" + vanessa + " ~дочь~ " + lawrence);

        System.out.println("Пример #3\n~Дочери~ " + lawrence + " " + vanessa.getAge() + " ~лет~");

        System.out.println("Пример #4\n~Сыну~" + anna + "~в следующем году будет~" + anton.happyBirthday(anton.getAge()));

        try {
            // Не хватает обязательных полей
            new PersonBuilder()
                    .setFirstName("Ноэль")
                    .setAge(45)
                    .build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
