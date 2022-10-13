package carmanager;

public class Motorcycle {

    public String name;

    public int yearOfProduction;

    public int price;

    public int weight;

    public Color color;

    public String engineType;

    public boolean isReadyToDrive;

    public Motorcycle(String name, int yearOfProduction, int price, int weight, String colorString, String engineType, boolean isReadyToDrive) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;

        colorString = colorString.replace(" ", "");    //вырезаем пробелы и сохраняем полученый результат в ту же самую переменную
        colorString = colorString.toUpperCase();    //делаем все буквы большими и сохраняяем полученный результат в ту же самую переменную

        /*
         *Метод valueOf() принимает строку, заходит в enum Color и проверяет есть ли в enum Color такая константа.
         * Если есть, возвращает нам эту константу, если нет выкидывает ошибку
         * Как пример:
         * Color.valueOf("BLACK") вернет нам константу Color.BLACK
         */
        this.color = Color.valueOf(colorString);

        this.engineType = engineType;
        this.isReadyToDrive = isReadyToDrive;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", color='" + color.getName() + '\'' + //вызываем геттер, чтобы получить значение поля
                ", engineType='" + engineType + '\'' +
                ", isReadyToDrive=" + isReadyToDrive +
                '}';
    }
}
