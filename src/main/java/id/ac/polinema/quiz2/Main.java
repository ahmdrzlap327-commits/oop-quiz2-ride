package id.ac.polinema.quiz2;

import java.util.ArrayList;
import java.util.List;

/**
 * Tempat bebas untuk mencoba programmu. Kelas ini TIDAK dinilai.
 *
 * Ide percobaan (tulis sendiri setelah tiap tahap selesai):
 *  1. Buat satu Passenger, lalu coba ubah namanya.
 *  2. Buat satu BikeRide dan satu CarRide, lalu tampilkan tarif-nya.
 *  3. Masukkan keduanya ke RideCalculator.totalFare(...) lewat sebuah List.
 *  4. Buat RideDispatcher dengan new CashPayment(), tambahkan perjalanan, lalu panggil checkout(...).
 *
 * Jalankan lewat NetBeans (Run Project), VS Code (Run di atas main),
 * atau terminal: mvn -q compile exec:java
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Ojek Online: tulis percobaanmu di sini.");


        Passenger passenger = new Passenger("P001", "Rina");

        System.out.println("ID: " + passenger.getPassengerId());
        System.out.println("Nama awal: " + passenger.getName());

        passenger.setName("");
        System.out.println("Set nama kosong: " + passenger.getName());

        passenger.setName("   ");
        System.out.println("Set nama spasi: " + passenger.getName());

        passenger.setName(null);
        System.out.println("Set nama null: " + passenger.getName());

        passenger.setName("Rofiq");
        System.out.println("Set nama valid: " + passenger.getName());


        // Tahap 2: Ride
        System.out.println("\n=== RIDE ===");

        Ride motor = new BikeRide("L1", passenger, 67);
        Ride mobil = new CarRide("L2", passenger, 5);

        System.out.println("Tarif motor: " + motor.calculateFare());
        System.out.println("Tarif mobil: " + mobil.calculateFare());


        // Tahap 3: Polymorphism & Exception
        System.out.println("\n=== CALCULATOR ===");

        System.out.println("Total tarif: " +
                RideCalculator.totalFare(List.of(motor, mobil)));

        System.out.println("Jarak motor valid: " +
                RideCalculator.isAcceptable(motor));

        System.out.println("Jarak mobil valid: " +
                RideCalculator.isAcceptable(mobil));


        System.out.println("\n=== COLLECTIONS ===");
        RideDispatcher dispatcher = new RideDispatcher(new CashPayment());
        dispatcher.add(motor);
        dispatcher.add(mobil);
        System.out.println("Jumlah perjalanan: " + dispatcher.count());
        System.out.println("Cari L1: " + dispatcher.findById("L1").getRideId());

        System.out.println("\n=== CHECKOUT ===");
        dispatcher.checkout("L1");
        dispatcher.checkout("L2");
    }
}
