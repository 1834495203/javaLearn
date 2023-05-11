package own.agency;

/**
 * @author GLaDOS
 * @date 2023/5/8 21:59
 */
public enum Type {

    BEFORE(1),
    AFTER(2),
    AROUND(3);

    Type(int i) {
        this.i = i;
    }

    private final int i;

    public int getI() {
        return i;
    }
}
