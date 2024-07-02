package threads.rx

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers

fun main() {
    val orderList = listOf<Long>(1, 2, 3)

    loadAllOrders(orderList)
        .blockingSubscribe { orders ->
            val result = orderList == orders.map(Order::id)
            println(result)
        }
}

fun loadAllOrders(ordersIds: List<Long>): Single<List<Order>> {
    return Observable.fromIterable(ordersIds)
        .subscribeOn(Schedulers.io())
        .flatMapSingle(::loadByOderId)
        .toList()
}

fun loadByOderId(l: Long): Single<Order> {
    return Single.just(Order(l))
}


data class Order(
    val id: Long
)