import java.util.Arrays;

public class Manager {
    public Material[] materials = new Material[10];

    private static Manager instance;

    private Manager() {
    }

    public static Manager getInstance() {
        if (instance == null) {
            synchronized (Manager.class) {
                if (instance == null) {
                    instance = new Manager();
                }
            }
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "materials=" + Arrays.toString(materials) +
                '}';
    }
}
