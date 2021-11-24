package cab.snapp.livecoding.rx.model


data class Ride(val id: String, val driver: String, val category: RideCategory) {

    override fun toString(): String {
        return "Ride Id: ".plus(id)
    }
}

enum class RideCategory {
    ECO,
    ROSE,
    TAXI
}