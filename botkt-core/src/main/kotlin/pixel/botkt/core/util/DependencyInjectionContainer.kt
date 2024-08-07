package pixel.botkt.core.util

import arrow.core.Option
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.KParameter

class DependencyInjectionContainer <C> {

    interface Injector <C> {

        fun inject(context: C): Option<*>

    }

    private val injectors = mutableMapOf<KClass<Injector<C>>, Injector<C>>()

    fun inject(parameter: KParameter, context: C): Option<*> { TODO() }
    fun inject(function: KFunction<*>, context: C): Option<*> { TODO() }

    fun createInjector(injector: KClass<Injector<C>>): Injector<C> { TODO() }

}