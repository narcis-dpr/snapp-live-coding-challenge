package cab.snapp.livecoding.rx

import cab.snapp.livecoding.rx.model.Discount
import cab.snapp.livecoding.rx.model.Ride
import cab.snapp.livecoding.rx.model.RideCategory
import io.reactivex.Observable
import java.util.concurrent.TimeUnit

class RideDataManager {

    fun getRides(): Observable<List<Ride>> {
        return Observable.timer(5000, TimeUnit.MILLISECONDS)
            .flatMap {
                Observable.create { emitter ->
                    if (!emitter.isDisposed) {
                        val data = listOf(
                            Ride("10001", "driver_1", RideCategory.ECO),
                            Ride("10002", "driver_2", RideCategory.ECO),
                            Ride("10003", "driver_3", RideCategory.TAXI),
                            Ride("10004", "driver_4", RideCategory.ROSE),
                            Ride("10005", "driver_5", RideCategory.ECO),
                            Ride("10006", "driver_5", RideCategory.TAXI),
                            Ride("10007", "driver_5", RideCategory.ECO)
                        )
                        emitter.onNext(data)
                        emitter.onComplete()
                    }
                }
            }
    }

    fun getRideDiscounts(): Observable<List<Discount>> {
        return Observable.timer(2000, TimeUnit.MILLISECONDS)
            .flatMap {
                Observable.create { emitter ->
                    if (!emitter.isDisposed) {
                        val data = listOf(
                            Discount("id_1", "vJsFdd", RideCategory.ECO),
                            Discount("id_3", "sd34", RideCategory.ROSE),
                        )
                        emitter.onNext(data)
                        emitter.onComplete()
                    }
                }
            }
    }
}