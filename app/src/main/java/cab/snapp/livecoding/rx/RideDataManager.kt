package cab.snapp.livecoding.rx

import cab.snapp.livecoding.rx.model.Discount
import cab.snapp.livecoding.rx.model.Ride
import cab.snapp.livecoding.rx.model.RideCategory
import io.reactivex.Observable
import io.reactivex.functions.BiFunction
import kotlinx.coroutines.flow.*
import java.util.concurrent.TimeUnit
import kotlin.time.Duration

class RideDataManager {

    private val rideData = listOf(
        Ride("10001", "driver_1", RideCategory.ECO),
        Ride("10002", "driver_2", RideCategory.ECO),
        Ride("10003", "driver_3", RideCategory.TAXI),
        Ride("10004", "driver_4", RideCategory.ROSE),
        Ride("10005", "driver_5", RideCategory.ECO),
        Ride("10006", "driver_5", RideCategory.TAXI),
        Ride("10007", "driver_5", RideCategory.ECO)
    )

    private val rideDiscountData = listOf(
        Discount("id_1", "vJsFdd", RideCategory.ECO),
        Discount("id_3", "sd34", RideCategory.ROSE),
    )

    //returns all ride list completely as Observable
    fun getRidesCompletely() : Observable<List<Ride>> {
        return Observable.timer(5000, TimeUnit.MILLISECONDS)
            .flatMap {
                Observable.create { emitter ->
                    if (!emitter.isDisposed) {
                        emitter.onNext(rideData)
                        emitter.onComplete()
                    }
                }
            }
    }

    //returns ride list data item by item individually as Observable
    fun getRidesIndividually(): Observable<Ride> {
        return Observable.fromIterable(rideData)
            .zipWith(
                Observable.interval(
                    5,
                    1,
                    TimeUnit.SECONDS
                ).take(rideData.size.toLong()),
                BiFunction { item, time ->
                    return@BiFunction item
                }
            )
    }

    //returns all ride discount list completely as Observable
    fun getRideDiscountsCompletely(): Observable<List<Discount>> {
        return Observable.timer(2000, TimeUnit.MILLISECONDS)
            .flatMap {
                Observable.create { emitter ->
                    if (!emitter.isDisposed) {
                        emitter.onNext(rideDiscountData)
                        emitter.onComplete()
                    }
                }
            }
    }

    //returns ride discount list data item by item individually as Observable
    fun getRideDiscountsIndividually(): Observable<Discount> {
        return Observable.fromIterable(rideDiscountData)
            .zipWith(
                Observable.interval(
                    2,
                    1,
                    TimeUnit.SECONDS
                ).take(rideDiscountData.size.toLong()),
                BiFunction { item, time ->
                    return@BiFunction item
                }
            )
    }



    //returns all ride list completely as Flow
    fun getRidesCompletelyAsFlow() : Flow<List<Ride>> {
        return flow {
            kotlinx.coroutines.delay(5000)
            emit(rideData)
        }
    }

    //returns ride list data item by item individually as Flow
    fun getRidesIndividuallyAsFlow(): Flow<Ride> {
        return flow {
            kotlinx.coroutines.delay(5000)
            for (i in rideData.indices) {
                emit(rideData[i])
                if(i != rideData.size - 1) {
                    kotlinx.coroutines.delay(1000)
                }
            }
        }
    }

    //returns all ride discount list completely as Flow
    fun getRideDiscountsCompletelyAsFlow(): Flow<List<Discount>> {
        return flow {
            kotlinx.coroutines.delay(2000)
            emit(rideDiscountData)
        }
    }

    //returns ride discount list data item by item individually as Flow
    fun getRideDiscountsIndividuallyAsFlow(): Flow<Discount> {
        return flow {
            kotlinx.coroutines.delay(2000)
            for (i in rideDiscountData.indices) {
                emit(rideDiscountData[i])
                if(i != rideDiscountData.size - 1) {
                    kotlinx.coroutines.delay(1000)
                }
            }
        }
    }
}