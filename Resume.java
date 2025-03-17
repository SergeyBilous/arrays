/**
 * Initial resume class
 */
public class Resume {

    // Unique identifier
    String uuid;

    @Override
    public String toString() {
        return uuid;
    }

    @Override
    public boolean equals(Object another) {
        if (!(another instanceof Resume)) {
            return false;
        }
        Resume c = (Resume) another;
        return c.uuid.equals(this.uuid);
    }
}
