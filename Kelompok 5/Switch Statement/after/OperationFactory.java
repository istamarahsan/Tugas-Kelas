public class OperationFactory {
    public static Operasi bagi(int a, int b) {
        return new Operasi(a, b, (_a, _b) -> _a/_b, "bagi");
    }

    public static Operasi kali(int a, int b) {
        return new Operasi(a, b, (_a, _b) -> _a*_b, "kali");
    }

    public static Operasi tambah(int a, int b) {
        return new Operasi(a, b, (_a, _b) -> _a+_b, "tambah");
    }

    public static Operasi kurang(int a, int b) {
        return new Operasi(a, b, (_a, _b) -> _a-_b, "kurang");
    }
}
