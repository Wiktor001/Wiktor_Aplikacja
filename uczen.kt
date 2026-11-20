
fun main() {
    val imie = "Jan"
    var klasa = "3D"
    val kierunek = "Technik programista"

    println("===== DANE UCZNIA =====")
    println("Imię: $imie")
    println("Klasa: $klasa")
    println("Kierunek: $kierunek")

    klasa = "3B"

    println("\n===== AKTUALNE DANE =====")
    println("Imię: $imie")
    println("Klasa: $klasa")
    println("Kierunek: $kierunek")

    fun obliczGodziny(godzinyTygodniowo: Int, liczbaTygodni: Int): Int {
        return godzinyTygodniowo * liczbaTygodni
    }

    val wynik1 = obliczGodziny(30, 4)
    val wynik2 = obliczGodziny(25, 6)

    println("\n===== LICZBA GODZIN ZAJĘĆ =====")
    println("30 godzin przez 4 tygodnie = $wynik1 godzin")
    println("25 godzin przez 6 tygodni = $wynik2 godzin")
}

// ===== AKTUALNE DANE =====
// Imię: Jan
// Klasa: 3d
// Kierunek: Technik programista

// ===== LICZBA GODZIN ZAJĘĆ =====
// 30 godzin przez 4 tygodnie = 120 godzin
// 25 godzin przez 6 tygodni = 150 godzin
