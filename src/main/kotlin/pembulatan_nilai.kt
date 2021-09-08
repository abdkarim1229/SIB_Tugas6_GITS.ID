fun main() {
    val angka = Angka()
    angka.angka1 = 15.51
    println("~ Pembulatan Angka 15 & 16 ~")
    println("Angkanya adalah : ${angka.angka1.toInt()}")
}

class Angka {
    var angka1: Double = 0.0
        get() = field
        set(value) {
            field = if (value < 15.5)
                15.0
            else if (value > 15.5)
                16.0
            else
                value
        }
}
