import kotlin.js.JsExport

@JsExport
interface IEvent<T: emun<T>, S> {
    val type: T
    val source: S

    operator fun component1(): T = this.type
    operator fun component2(): S = this.source
}