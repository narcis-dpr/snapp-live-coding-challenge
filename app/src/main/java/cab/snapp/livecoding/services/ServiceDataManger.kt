package cab.snapp.livecoding.services

import cab.snapp.livecoding.R
import cab.snapp.livecoding.services.model.ServiceId
import cab.snapp.livecoding.services.model.ServiceItem
import io.reactivex.Single

class ServiceDataManger {

    fun getServices(): Single<List<ServiceItem>> {
        return Single.just(
            listOf(
                ServiceItem(ServiceId.SNAPP_CAB, R.string.snapp, R.drawable.cab),
                ServiceItem(ServiceId.SNAPP_BOX, R.string.box, R.drawable.box),
                ServiceItem(ServiceId.SNAPP_FOOD, R.string.food, R.drawable.food),
                ServiceItem(ServiceId.SNAPP_ROOM, R.string.room, R.drawable.room),
                ServiceItem(ServiceId.SNAPP_TICKET, R.string.ticket, R.drawable.ticket),
            )
        )
    }

    fun getAllServices(): Single<List<ServiceItem>> {
        return Single.just(
            listOf(
                ServiceItem(ServiceId.SNAPP_CAB, R.string.snapp, R.drawable.cab),
                ServiceItem(ServiceId.SNAPP_BOX, R.string.box, R.drawable.box),
                ServiceItem(ServiceId.SNAPP_FOOD, R.string.food, R.drawable.food),
                ServiceItem(ServiceId.SNAPP_TRIP, R.string.trip, R.drawable.trip),
                ServiceItem(ServiceId.SNAPP_MARKET, R.string.market, R.drawable.market),
                ServiceItem(ServiceId.SNAPP_DOCTOR, R.string.doctor, R.drawable.doctor),
                ServiceItem(ServiceId.SNAPP_SHOP, R.string.shop, R.drawable.shop),
                ServiceItem(ServiceId.SNAPP_ROOM, R.string.room, R.drawable.room),
                ServiceItem(ServiceId.SNAPP_TICKET, R.string.ticket, R.drawable.ticket),
                ServiceItem(ServiceId.SNAPP_CLUB, R.string.club, R.drawable.club),
            )
        )
    }

}