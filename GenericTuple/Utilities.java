public class Utilities {

    public static <T,U> boolean compare (GenericTuple<T,U> tuple1, GenericTuple<T,U> tuple2){
        return tuple1.getFirst().equals(tuple2.getFirst()) && tuple1.getSecond().equals(tuple2.getSecond());
    }
    public static <T> boolean compare (T obj1, T obj2){
        return obj1.equals(obj2);
    }

}
