package de.htwg.se.learn_duel

trait Observable {
    private var observers: List[Observer] = List()
    def addObserver(observer: Observer): Unit = observers = observer :: observers
    def removeObserver(observer: Observer): Unit = observers = observers.filter(_ != observer)
    private def notifyObservers: Unit = for (observer <- observers) observer.update
}