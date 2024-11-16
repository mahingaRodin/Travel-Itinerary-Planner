import java.util.ArrayList;
import java.util.List;

    class ItineraryPlanner {
        private final List<Destination> destinations;

        public ItineraryPlanner() {
            destinations = new ArrayList<>();
        }

        public void addDestination(Destination destination) {
            destinations.add(destination);
            System.out.println("Destination added successfully!");
        }

        public void viewItinerary() {
            if (destinations.isEmpty()) {
                System.out.println("No destinations added yet.");
            } else {
                System.out.println("\n--- Travel Itinerary ---");
                for (Destination dest : destinations) {
                    System.out.println(dest);
                    System.out.println("-----------------------");
                }
            }
        }

        public double calculateTotalBudget() {
            double totalBudget = 0;
            for (Destination dest : destinations) {
                totalBudget += dest.budget();
            }
            return totalBudget;
        }
    }


