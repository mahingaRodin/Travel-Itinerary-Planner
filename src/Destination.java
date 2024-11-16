record Destination(String name, String travelDate, double budget) {

    @Override
    public String toString() {
        return "Destination: " + name + "\nDate: " + travelDate + "\nBudget: $" + budget;
    }
}
