class Destination {
    private String name;
    private String travelDate;
    private double budget;


    public Destination(String name, String travelDate, double budget) {
        this.name = name;
        this.travelDate = travelDate;
        this.budget = budget;
    }
    public String getName() {
        return name;
    }

    public String getTravelDate() {
        return travelDate;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public String toString() {
        return "Destination: "+name + "\nDate: " +travelDate + "\nBudget: $" + budget;
    }
}
