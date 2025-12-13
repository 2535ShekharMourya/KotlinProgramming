package coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.runBlocking
val list = mutableListOf<Int>()
val lock = Object()
fun main() {

    val producer = Thread {
        for (i in 1..5) {
            synchronized(lock) {
                list.add(i)
                println("Produced: $i")
                lock.notify()
                Thread.sleep(500)
            }
        }
    }

    val consumer = Thread {
        repeat(5) {
            synchronized(lock) {
                while (list.isEmpty()) lock.wait()
                val item = list.removeAt(0)
                println("Consumed: $item")
            }
        }
    }

    producer.start()
    consumer.start()

    producer.join()
    consumer.join()
}

