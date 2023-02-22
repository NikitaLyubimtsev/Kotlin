import interface
import kotlin.js.JsExport

@JsExport
open class First<T: emun<T>, S> (val type: T, val source: S): IEvent<T, S>  