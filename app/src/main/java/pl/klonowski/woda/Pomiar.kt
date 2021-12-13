package pl.klonowski.woda

class Pomiar (val adres : String, val ilosc : String) {
    companion object {
        var pomiary = ArrayList<Pomiar>()
        fun arrP() : ArrayList<Pomiar> {
            var p = Pomiar("Adres: Sosnowa", "100 m3")
            pomiary += p
            p = Pomiar("Adres: Świerkowa", "200 m3")
            pomiary += p
            p = Pomiar("Adres: Jodłowa", "300 m3")
            pomiary += p
            p = Pomiar("Adres: Wierzbowa", "150 m3")
            pomiary += p
            p = Pomiar("Adres: Bukowa", "250 m3")
            pomiary += p
            p = Pomiar("Adres: Leśna", "440.000 m3")
            pomiary += p
            return pomiary
        }
    }
}