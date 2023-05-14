package com.anushka.roomdemo.db

class SubscriberRepository(private val dao : SubscriberDAO) {
    val subscribers = dao.getAllSubscribers()

    suspend fun subscriberInsert(subscriber: Subscriber) {
        dao.insertSubscriber(subscriber)
    }

    suspend fun subscriberUpdate(subscriber: Subscriber) {
        dao.updateSubscriber(subscriber)
    }

    suspend fun subscriberDelete(subscriber: Subscriber) {
        dao.deleteSubscriber(subscriber)
    }

    suspend fun deleteAll(){
        dao.deleteAll()
    }
}