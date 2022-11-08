package task1_2;

import java.time.LocalDate;

public class Car extends Transport {

    public static class Key {

        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public static class Insurance{
        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }

            this.cost = cost;

            if (number == null) {
                this.number = "012345678";
            } else {
                this.number = number;
            }
        }

        public Insurance() {
            this(null, 10_000, null);

        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpireDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку.");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }

    }

    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private String monthSeason;

    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, int productionYear, String productionCountry, String bodyColor,
               int maxSpeed, double engineVolume, String transmission, String bodyType,
               String registrationNumber, int numberOfSeats, Integer monthSeason, Key key,
               Insurance insurance, String fuelType) {
        super(brand, model, productionYear, productionCountry, bodyColor, maxSpeed, fuelType);

        setEngineVolume(engineVolume);

        setTransmission(transmission);

        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }

        setRegistrationNumber(registrationNumber);

        if (numberOfSeats <= 0) {
            this.numberOfSeats = 3;
        } else {
            this.numberOfSeats = numberOfSeats;
        }

        setMonthSeason(monthSeason);

        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }

        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
    }

    public String toString() {
        return getBrand() + " " + getModel() + ", " + getProductionYear() + " года выпуска, сборка в "
                + getProductionCountry() + ", " + getBodyColor() + " цвета, максимальная скорость - "
                + getMaxSpeed() +", объём двигателя - " + getEngineVolume() + ", трансмиссия - " + getTransmission()
                + ", кузов - " + getBodyType() + ", гос номер - " + getRegistrationNumber() + ", количество мест - "
                + getNumberOfSeats() + ", шины - " + getMonthSeason() + ", "
                + (getKey().isKeylessAccess() ? " безключевой доступ, " : " ключевой доступ, ") +
                (getKey().isRemoteEngineStart() ? " удалённый запуск " : " обычный запуск ") +
                ", номер страховки " + getInsurance().getNumber() +
                ", стоимиость страховки " + getInsurance().getCost() +
                ", срок действия страховки: " + getInsurance().getExpireDate();
    }

    private boolean isNumber(char symbol) {
        return Character.isDigit(symbol);
    }

    private boolean isNumberLetter(char symbol) {
        String allowedSymbol = "АВЕКМНОРСТУХ";
        return allowedSymbol.contains("" + symbol);
    }

    public void refill() {
        System.out.println("Заправлять бензином или дизелем на заправке или заряжать на специальных электропарковках - "
        + this.fuelType);
    }

    public double getEngineVolume() {
        return this.engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0.0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getTransmission() {
        return this.transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isBlank() || registrationNumber.length() != 9) {
            this.registrationNumber = "х000хх000";
        } else {
            char[] chars = registrationNumber.toCharArray();
            if (isNumberLetter(chars[0]) && isNumber(chars[1]) && isNumber(chars[2]) && isNumber(chars[3])
                    && isNumberLetter(chars[4]) && isNumberLetter(chars[5]) && isNumber(chars[6])
                    && isNumber(chars[7]) && isNumber(chars[8])) {
                this.registrationNumber = registrationNumber;
            } else {
                this.registrationNumber = "х000хх000";
            }
        }
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getMonthSeason() {
        return monthSeason;
    }

    public void setMonthSeason(Integer monthSeason) {
        if (monthSeason >= 4 && monthSeason <= 9) {
            this.monthSeason = "лето.";
        } else {
            this.monthSeason = "зима.";
        }
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

}
