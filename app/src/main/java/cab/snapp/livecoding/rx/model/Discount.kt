package cab.snapp.livecoding.rx.model

data class Discount(val id: String, val value: String, val category: RideCategory) {

    override fun toString(): String {
        return "Discount: ".plus(value)
    }

}