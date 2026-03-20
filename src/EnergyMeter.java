/**
 * Клас для обліку спожитої електроенергії.
 * Забезпечує збереження показників та розрахунок вартості.
 * * @author student
 * @version 1.1
 */
public class EnergyMeter {
    private double reading;

    /**
     * Конструктор для ініціалізації лічильника.
     * @param initialReading початкові показники (кВт-год)
     */
    public EnergyMeter(double initialReading) {
        this.reading = initialReading;
    }

    /**
     * Додає нові показники до лічильника.
     * @param amount кількість спожитої енергії
     * @throws IllegalArgumentException якщо значення від'ємне
     */
    public void addConsumption(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Споживання не може бути від'ємним");
        this.reading += amount;
    }
}
