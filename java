import java.util.ArrayList;
import java.util.List;

// Class to represent a landmark
class Landmark {
    String name;
    String description;

    public Landmark(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return name + ": " + description;
    }
}

// Class to represent Jodhpur City's information
public class JodhpurInfoSystem {
    private String name = "Jodhpur";
    private String state = "Rajasthan";
    private int foundedYear = 1459;
    private String nicknames = "Blue City, Sun City";
    private double populationMillion = 1.03; // 2011 Census

    private List<Landmark> majorLandmarks;

    public JodhpurInfoSystem() {
        majorLandmarks = new ArrayList<>();
        majorLandmarks.add(new Landmark("Mehrangarh Fort", "Massive citadel dominating the city."));
        majorLandmarks.add(new Landmark("Umaid Bhawan Palace", "Art Deco palace, now a heritage hotel."));
        majorLandmarks.add(new Landmark("Jaswant Thada", "White marble royal cenotaph."));
        majorLandmarks.add(new Landmark("Ghanta Ghar", "Historic Clock Tower and market area."));
    }

    public void displayFacts() {
        System.out.println("=== 🇮🇳 Jodhpur City: The Blue City ===");
        System.out.println("Name: " + name);
        System.out.println("State: " + state);
        System.out.println("Founded: " + foundedYear);
        System.out.println("Nicknames: " + nicknames);
        System.out.println("Population (2011): " + populationMillion + " million");
        System.out.println("=======================================");
    }

    public void displayLandmarks() {
        System.out.println("\n--- Major Landmarks ---");
        for (Landmark landmark : majorLandmarks) {
            System.out.println(landmark);
        }
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        JodhpurInfoSystem infoSystem = new JodhpurInfoSystem();
        infoSystem.displayFacts();
        infoSystem.displayLandmarks();
    }
}
