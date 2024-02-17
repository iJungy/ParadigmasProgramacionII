
public class EntryPoint  {

    public static void main(String[] args) {
        GenericTuple<Integer, Integer> point1 = new GenericTuple<>(1, 5);
        GenericTuple<Integer, Integer> point2 = new GenericTuple<>(1, 15);

        boolean result = Utilities.compare (point1, point2);
        System.out.println (result);

        boolean result2 = Utilities.compare ("Hola", "Hola");
        System.out.println (result2);

        boolean result3 = Utilities.compare (3.0, 3.0);
        System.out.println (result3);

        GenericTuple<Double,Double> point3 = new GenericTuple<>(4.0, 4.0);
        GenericTuple <Double,Double> point4 = new GenericTuple<>(4.0,5.0);

        boolean result4 = Utilities.compare(point3,point4);
        System.out.println(result4);

    }

}