package src;

public class Zoo {
    public IAnimal animal1;
    public IAnimal animal2;

    public Zoo(IAnimal a1, IAnimal a2) {
        this.animal1 = a1;
        this.animal2 = a2;
    }

    public boolean healthCheck() {
        // True if all of my animals are healthy, and false otherwise

        // A dillo is health if its between 12 and 24 inches in length
        return this.animal1.isHealthy() && this.animal2.isHealthy();
    }
}
