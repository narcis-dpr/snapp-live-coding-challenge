package cab.snapp.livecoding.services.model

data class ServiceItem(val id: ServiceId, val title: Int, val image: Int)

enum class ServiceId {
    SNAPP_CAB,
    SNAPP_BOX,
    SNAPP_FOOD,
    SNAPP_TRIP,
    SNAPP_MARKET,
    SNAPP_DOCTOR,
    SNAPP_SHOP,
    SNAPP_ROOM,
    SNAPP_TICKET,
    SNAPP_CLUB
}
