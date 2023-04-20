package org.kde.kdeconnect.Helpers

import java.util.concurrent.Callable
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.Future

object ThreadHelper {

    private val executor: ExecutorService = Executors.newCachedThreadPool()

    @JvmStatic
    fun execute(command: Runnable) = executor.execute(command)

    @JvmStatic
    fun <T> executeCallable(callable: Callable<T>): Future<T> = executor.submit(callable)

}
