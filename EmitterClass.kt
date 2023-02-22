import DuplicationListenerException
import EventCallBack
import IEvent
import IEventEmitter

abstract class EventEmitter<T : emun<T>, S> : IEventEmitter<T, S> {
    private val listeners: LinkHashMap<T, ArrayList<EventCallBack<T, S>>> = linkedMapOf()
}