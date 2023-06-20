import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean loop = true;
        while(loop){
            System.out.println("CALCULATOR");
            System.out.println("----------");
            System.out.println("Keterangan:");
            System.out.println("a adalah angka didepan");
            System.out.println("b adalah angka dibelakang");
            System.out.println("Sehingga jika ingin pembagian akan jadi a / b");
            System.out.println("----------");
            Scanner scan = new Scanner(System.in);

            System.out.print("Masukkan nilai a: ");
                Integer a = scan.nextInt(); scan.nextLine();
            System.out.print("Masukkan nilai b: ");
                Integer b = scan.nextInt(); scan.nextLine();

            System.out.print("Pilih Operasi yang ingin dilakukan [tambah | kurang | kali | bagi | quit (untuk keluar)] : ");
                String pilihanOperasi = scan.nextLine();

//          Ini bukan code smell. ini factory (if else yang memang harus ada).
            // edit: dijadiin factory
            if (pilihanOperasi.equals("quit")) {
                loop = false;
                break;
            }
            
            var operasi = switch (pilihanOperasi) {
                case "bagi" -> OperationFactory.bagi(a, b);
                case "kali" -> OperationFactory.kali(a, b);
                case "tambah" -> OperationFactory.tambah(a, b);
                case "kurang" -> OperationFactory.kurang(a, b);
                default -> null;
            };
            
            if (operasi == null) break;
            
            printPilihanOperasi(operasi);
            operasi.perform();

            System.out.print("Press enter to continue");
            scan.nextLine();

            System.out.println();
            System.out.println();
        }
     }

//  code smell
    public static void printPilihanOperasi (Operasi operasi){
        System.out.print("Anda memilih " + operasi.getName() + " dan hasilnya adalah ");
    }
}
