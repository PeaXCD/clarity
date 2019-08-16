package skadistats.clarity.model.state;

public interface ArrayEntityState {

    int length();

    boolean has(int idx);

    Object get(int idx);
    void set(int idx, Object value);
    void clear(int idx);

    boolean isSub(int idx);
    ArrayEntityState sub(int idx);

    ArrayEntityState capacity(int wantedSize, boolean shrinkIfNeeded);

    default ArrayEntityState capacity(int wantedSize) {
        return capacity(wantedSize, false);
    }

    default Accessor accessor(int idx) {
        return null;
    }

    interface Accessor {
        boolean has();
        Object get();
        void set(Object value);
        void clear();
        ArrayEntityState sub();
    }

}
