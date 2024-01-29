package src;
/**
 * Represents a Dillo
 */
public class Dillo implements IAnimal {
    public int length;
    public boolean isDead;

    public Dillo(int howLong, boolean isD) {
        this.length = howLong;
        this.isDead = isD;
    }

    /**
     * @return true if this Dillo could shelter a human
     */
    public boolean canShelter() {
        return (this.length > 60) && (this.isDead);
    }

    /**
     * @param other Another Dillo
     * @return true if current Dillo is bigger than other Dillo
     */
    public boolean isBigger(Dillo other) {
        return this.length > other.length;
    }

    public boolean isHealthy() {
        return (this.length > 12 && this.length < 24);
    }
}
