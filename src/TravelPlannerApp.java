import java.util.Scanner;

    public class TravelPlannerApp {
        public static void main(String[] args) {
            ItineraryPlanner planner = new ItineraryPlanner();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\n=== Travel Itinerary Planner ===");
                System.out.println("1. Add Destination");
                System.out.println("2. View Itinerary");
                System.out.println("3. Calculate Total Budget");
                System.out.println("4. Exit");
                System.out.print("Choose an option (1-4): ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                switch (choice) {
                    case 1:
                        System.out.print("Enter destination name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter travel date (YYYY-MM-DD): ");
                        String date = scanner.nextLine();
                        System.out.print("Enter budget for this destination: ");
                        double budget = scanner.nextDouble();

                        Destination destination = new Destination(name, date, budget);
                        planner.addDestination(destination);
                        break;

                    case 2:
                        planner.viewItinerary();
                        break;

                    case 3:
                        double totalBudget = planner.calculateTotalBudget();
                        System.out.println("Total Estimated Budget: $" + totalBudget);
                        break;

                    case 4:
                        System.out.println("Thank you for using the Travel Itinerary Planner. Goodbye!");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
