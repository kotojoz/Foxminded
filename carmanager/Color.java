package carmanager;

public enum Color {
    /*
     * Каждая из этих констант, по сути готовый обьект, который содержит поле name.
     * Это как suzuki и yamaha из прошлых заданий, только создаются они автоматически при запуске программы,
     * содержат в данном случае одно поле и после запуска программы их нельзя изменить, но можно вызывать
     * в любом месте программы, где нам нужен цвет
     */
    WHITE("White"),
    GREEN("Green"),
    BLACK("Black"),
    BLUE("Blue"),
    ORANGE("Orange"),
    YELLOW ("Yellow");

    public final String name;   //Это поле enum, которое содержит строку

    /*
     * Это конструктор enum Color, то же самое было в Car и Motorcycle. Только здесь одно поле.
     * Хотя если есть желание, то можно сделать сколько угодно полей
     */
    Color(String name) {
        this.name = name;
    }

    /*
     * Это геттер, возвращает значение поля name
     */
    public String getName() {
        return name;
    }
}
