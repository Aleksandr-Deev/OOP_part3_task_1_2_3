package task1_2;

public class Train extends Transport {

    private String nameStationsDepart;
    private String finalStation;
    private int sumTrips;
    private int numberVogons;
    private double timeTrips;

    public Train(String brand, String model, int productionYear, String productionCountry, String bodyColor,
                 int maxSpeed, String nameStationsDepart, String finalStation, int sumTrips,
                 int numberVogons, double timeTrips, String fuelType) {
        super(brand, model, productionYear, productionCountry, bodyColor, maxSpeed, fuelType);
        setNameStationsDepart(nameStationsDepart);
        setFinalStop(finalStation);
        setSumTrips(sumTrips);
        setNumberVogons(numberVogons);
        setTimeTrips(timeTrips);
    }

    public String toString() {
        return "Поезд " + this.getBrand() + ", модель " + this.getModel() + ", "
                + this.getProductionYear() + " год выпуска, в " + getProductionCountry()
                + ", скорость пердвижения - " + this.getMaxSpeed() + " км/ч, ходит от " + getNameStationsDepart()
                + " и следует до станции " + getFinalStop() + ". Цена поездки - "
                + getSumTrips() + " рублей, в поезде " + getNumberVogons() + " вагонов.";
    }

    public void refill() {
        System.out.println("Запрвлятся дизелем - " + this.fuelType);
    }

    public String getNameStationsDepart() {
        return nameStationsDepart;
    }

    public void setNameStationsDepart(String nameStationsDepart) {
        if (nameStationsDepart != null && !nameStationsDepart.isEmpty() && !nameStationsDepart.isBlank()) {
            this.nameStationsDepart = nameStationsDepart;
        } else {
            this.nameStationsDepart = "default";
        }
    }

    public String getFinalStop() {
        return finalStation;
    }

    public void setFinalStop(String finalStation) {
        if (finalStation != null && !finalStation.isEmpty() && !finalStation.isBlank()) {
            this.finalStation = finalStation;
        } else {
            this.finalStation = "default";
        }
    }

    public int getSumTrips() {
        return sumTrips;
    }

    public void setSumTrips(int sumTrips) {
        if (sumTrips <= 0) {
            this.sumTrips = 1000;
        } else {
            this.sumTrips = sumTrips;
        }
    }

    public int getNumberVogons() {
        return numberVogons;
    }

    public void setNumberVogons(int numberVogons) {
        if (numberVogons <= 0) {
            this.numberVogons = 1;
        } else {
            this.numberVogons = numberVogons;
        }
    }

    public double getTimeTrips() {
        return timeTrips;
    }

    public void setTimeTrips(double timeTrips) {
        if (timeTrips <= 0) {
            this.timeTrips = 0;
        } else {
            this.timeTrips = timeTrips;
        }
    }
}