class DuplicationListenerException(override val message: String): Throwable(message)

typealias EventCallBack<T, S> = (IEvent<T, S>) -> Unit

interface IEventEmitter<T : emun<T>, S> {
    @Throws(DuplicationListenerException::class)
    fun on(eventType: T, callBack: EventCallBack<T, S>)
    fun del(eventType: T, callBack: EventCallBack<T, S>)
    fun once(eventType: T, callBack: EventCallBack<T, S>)
}