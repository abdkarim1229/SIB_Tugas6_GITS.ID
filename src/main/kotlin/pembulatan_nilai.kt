fun main() {
    val angka = Angka()
    angka.angka1 = 0.51
    println("Pembulatan angkanya adalah : ${angka.angka1.toInt()}")
}

class Angka {
    var angka1: Double = 0.0
        get() = field
        set(value) {
            field = if (value > 0.5)
                1.0
            else if (value < 0.5)
                0.0
            else
                value
        }
}
