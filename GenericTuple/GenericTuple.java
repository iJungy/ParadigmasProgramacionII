
// Todo: implement logic
public class GenericTuple<T,U> {
    private final T first;
    private final U second;
    
    public GenericTuple(T first, U second) {
        this.first = first;
        this.second = second;
    }
    
    public T getFirst(){
        return first;
    }
    
    public U getSecond(){
        return second;
    }
    
        @Override
        public String toString() {
            return String.format("(%s,%s)", getFirst().toString(), getSecond().toString());
        }
    }