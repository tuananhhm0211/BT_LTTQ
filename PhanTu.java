public class PhanTu<T extends Comparable<T>> {
    public T value;

    public T getValue() {
        return this.value;
    }

    public T isGreaterThan(T a) {
        if (this.getValue().compareTo(a) > 0) {
            return this.getValue();
        } else return a;
    }
}
