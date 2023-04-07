import java.util.function.BiFunction;

public class Operasi {
    private final int a;
    private final int b;
    private final BiFunction<Integer, Integer, Integer> biOperation;
    private final String name;

    public Operasi(int a, int b, BiFunction<Integer, Integer, Integer> biOperation, String name) {
        this.a = a;
        this.b = b;
        this.biOperation = biOperation;
        this.name = name;
    }

    public void perform() {
        System.out.println(biOperation.apply(a, b));
    }
    
    public String getName() {
        return name;
    }
}
