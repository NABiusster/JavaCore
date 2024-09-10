package HomeWork2.Task2;

public class Main {
    public static void main(String[] args) {
    Laptop laptop = new Laptop(
            "Intel® Core™ i5 13gen 13450HX",
            "NVIDIA® GeForce RTX™ 3050 + Intel UHD Graphics",
            "16 GB DDR5 4800 Mhz",
            "1 TB SSD",
            "Dell",
            "G15 5530-8522"
    );
        System.out.println(laptop);
        UltraBook ultraBook = new UltraBook(
                "Intel® Core™ Ultra 5 14gen 125H",
                "Intel® Arc™ Graphics",
                "16 GB DDR5 4800 Mhz",
                "1 TB SSD",
                "ASUS",
                "Zenbook 14",
                1.2,220
        );
        System.out.println(ultraBook);
        Netbook netbook = new Netbook(
                "Intel® Pentium® Gold 6500Y",
                "Intel® UHD Graphics 615",
                "4 GB LPDDR3",
                "64 GB eMMC",
                "Microsoft",
                "Surface Go 3",
                10
        );
        System.out.println(netbook);
    }

}