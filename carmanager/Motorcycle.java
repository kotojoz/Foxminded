package carmanager;

public class Motorcycle {

    public String name;

    public int yearOfProduction;

    public int price;

    public int weight;

    public Color color;

    public String engineType;

    public boolean isReadyToDrive;

    private int distance = 0;

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

    public void repair() {
        isReadyToDrive = true;
    }

    public void destroyEngine() {
        if (distance > 200_000) {
            isReadyToDrive = false;
        }
    }

    public void changeColor(String newColor) {
        newColor = newColor.replace(" ", "");
        newColor = newColor.toUpperCase();
        color = Color.valueOf(newColor);
    }

    public void addDistance(int additionalDistance) {
        /*
        Блок try нужен, если часть кода может выбрасить ошибку.
        Мы как бы заранее говорим, будь там осторожен
         */
        try {
            if (additionalDistance <= 0) {  //Проверяем значение additionalDistance и если оно меньше или равно 0, создаем ошибку
                /*
                Создаем ошибку с сообщением.
                !!! Надо понимать, что после этого прерывается нормальный порядок действия программы.
                После создания ошибки, программа начнет искать блок catch, который сможет обработать этот вид ошибки
                Если такого нет, то программа закроется с выбросом ошибки.
                 */
                throw new RuntimeException("Additional distance must be greater then 0");
            }

            distance += additionalDistance; // в случаи ошибки, эта часть кода не будет выполняться

        } catch (RuntimeException e) { //Блок catch ловит ошибки.
            System.out.println(e.getMessage()); // метод getMessage вернет строку, что мы написали при создание ошибки
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Motorcycle that = (Motorcycle) o;

        if (isReadyToDrive != that.isReadyToDrive) return false;
        return color == that.color;
    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + (isReadyToDrive ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", color=" + color.getName() +  //вызываем геттер, чтобы получить значение поля
                ", engineType='" + engineType + '\'' +
                ", isReadyToDrive=" + isReadyToDrive +
                ", distance=" + distance +
                '}';
    }
}
