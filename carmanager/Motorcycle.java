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

    //Конструктор, для того чтобы делать копию мотоцикла. Нужно чтобы из енум Motorcycles через геттер получать новую копию.
    public Motorcycle(Motorcycle motorcycle) {
        this.name = motorcycle.name;
        this.yearOfProduction = motorcycle.yearOfProduction;
        this.price = motorcycle.price;
        this.weight = motorcycle.weight;
        this.color = motorcycle.color;
        this.engineType = motorcycle.engineType;
        this.isReadyToDrive = motorcycle.isReadyToDrive;
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
        distance += additionalDistance;
    }

    public void addDistance(float additionalDistance) {
        /*
        Метод Math.round вернет целое число, поэтому мы может вызвать метод addDistance, который принимает int
        и как параметр поставить туда результат округления. Это позволит нам избежать дублирования кода(Дублирование кода это плохо)
         */
        addDistance(Math.round(additionalDistance));
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
