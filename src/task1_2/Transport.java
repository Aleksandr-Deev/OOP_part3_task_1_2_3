package task1_2;

import java.time.LocalDate;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String bodyColor;
    private int maxSpeed;
    protected final String fuelType;

    public Transport(String brand, String model, int productionYear, String productionCountry,
                     String bodyColor, int maxSpeed, String fuelType) {

        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }

        if (model != null && !model.isBlank() && !model.isEmpty()) {
            this.model = model;
        } else {
            this.model = "default";
        }

        if(productionYear <= 0) {
            this.productionYear = LocalDate.now().getYear();
        } else {
            this.productionYear = productionYear;
        }

        if (productionCountry != null && !productionCountry.isBlank() && !productionCountry.isEmpty()) {
            this.productionCountry = productionCountry;
        } else {
            this.productionCountry = "default";
        }

        setBodyColor(bodyColor);

        setMaxSpeed(maxSpeed);

        this.fuelType = fuelType;
    }

    public String toString() {
        return this.getBrand() + " " + this.getModel() + ", " + this.getProductionYear() + " года выпуска, сборка в "
                + getProductionCountry() + ", " + this.getBodyColor() + " цвета, максимальная скорость - "
                + this.getMaxSpeed();
    }

    public abstract void refill();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor != null && !bodyColor.isBlank() && !bodyColor.isEmpty()) {
            this.bodyColor = bodyColor;
        } else {
            this.bodyColor = "Black";
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = 0;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }
}
