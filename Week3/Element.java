import java.util.*;

public class Element {
    private int atomicNumber;
    private String name;
    private String chemicalSymbol;
    private String classification;
    private double atomicWeight;

    public Element(int atomicNumber, String name, String chemicalSymbol, String classification, double atomicWeight) {
        this.atomicNumber = atomicNumber;
        this.name = name;
        this.chemicalSymbol = chemicalSymbol;
        this.classification = classification;
        this.atomicWeight = atomicWeight;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public String getName() {
        return name;
    }

    public String getChemicalSymbol() {
        return chemicalSymbol;
    }

    public String getClassification() {
        return classification;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }

    public String getElementContent() {
        return name + " " + chemicalSymbol + " " + classification + " " + atomicWeight;
    }

    public static void main(String[] args) {
        // Create three elements
        Element sodium = new Element(11, "Sodium", "Na", "Alkali Metal", 22.9898);
        Element oxygen = new Element(8, "Oxygen", "O", "Non-metal", 15.999);
        Element iron = new Element(26, "Iron", "Fe", "Transition Metal", 55.845);

        // Display details of all three elements
        System.out.println("Details of all three elements:");

        // Display content of all three elements
        System.out.println(sodium.getElementContent());
        System.out.println(oxygen.getElementContent());
        System.out.println(iron.getElementContent());

        // Display details of elements with atomic weight > 15
        System.out.println("\nElements with atomic weight > 15:");
        Element[] elements = {sodium, oxygen, iron};
        for (Element element : elements) {
            if (element.getAtomicWeight() > 15) {
                System.out.println(element.getElementContent());
            }
        }
    }
}
