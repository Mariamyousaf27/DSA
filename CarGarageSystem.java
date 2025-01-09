

package garage;
import java.util.*;
class Garage {
    private int capacity;
    private List<String> garage;
    private Map<String, Integer> moveCount;

    public Garage(int capacity) {
        this.capacity = capacity;
        this.garage = new ArrayList<>();
        this.moveCount = new HashMap<>();
    }

    public void carArrives(String plateNumber) {
        if (garage.size() < capacity) {
            garage.add(plateNumber);  
            moveCount.put(plateNumber, 0); 
            System.out.println("Car " + plateNumber + " has arrived and entered the garage. There is room.");
        } else {
            System.out.println("Car " + plateNumber + " has arrived, but there is no room. The car leaves.");
        }
    }

    public void carDeparts(String plateNumber) {
        if (garage.contains(plateNumber)) {
            garage.remove(plateNumber); 
            System.out.println("Car " + plateNumber + " has departed. It was moved " + moveCount.get(plateNumber) + " time(s).");
        } else {
            System.out.println("Car " + plateNumber + " is not in the garage.");
        }
    }

    public void moveCarForDeparture(String departingCar) {
       
        for (String car : garage) {
            if (!car.equals(departingCar)) {
                moveCount.put(car, moveCount.get(car) + 1);
            }
        }
    }
}

public class CarGarageSystem {
    public static void processInput(List<String> lines, int garageCapacity) {
        Garage garage = new Garage(garageCapacity);

        for (String line : lines) {
            String[] parts = line.split(" ");
            String action = parts[0];
            String plateNumber = parts[1];

            if (action.equals("A")) { 
                garage.carArrives(plateNumber);
            } else if (action.equals("D")) { 
                garage.moveCarForDeparture(plateNumber);
                garage.carDeparts(plateNumber);
            } else {
                System.out.println("Invalid action: " + action);
            }
        }
    }

    public static void main(String[] args) {
        List<String> lines = Arrays.asList(
            "A COROLLA",
            "A TOYATA",
            "D AUDI",
            "A CIVIC",
            "A ALTO",
            "D MEHRAN",
            "A FERRARI"
        );
        int garageCapacity = 3;  
        processInput(lines, garageCapacity);
    }
}

