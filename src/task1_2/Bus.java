package task1_2;

public class Bus extends Transport {

    public Bus(String brand, String model, int productionYear, String productionCountry, String bodyColor,
               int maxSpeed, String fuelType) {
        super(brand, model, productionYear, productionCountry, bodyColor, maxSpeed, fuelType);
    }

    public void refill() {
        System.out.println("Запрвлять дизелем или бензином - " + this.fuelType);
    }
}
