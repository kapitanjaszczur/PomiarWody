package pl.klonowski.woda

class Pomiar (val adres : String, val ilosc : String) {
    companion object {
        var pomiary = ArrayList<Pomiar>()
        fun arrP() : ArrayList<Pomiar> {
            var p : Pomiar = Pomiar("Sosnowa", "100")
            pomiary += p
            return pomiary
        }
    }
}