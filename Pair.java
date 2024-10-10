public class Pair <A, B> {
    private A first;
    private B second;
    
    public Pair(A thing) {
        this.first = thing;
        this.second = null;
    }

    // Constructor with two parameters for both values
    public Pair(A thing, B otherThing) {
        this.first = thing;
        this.second = otherThing;
    }
    
    public void setFirst(A first) {
        this.first = first;
    }

    public void setSecond(B second) {
        this.second = second;
    }
    
    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }
}
