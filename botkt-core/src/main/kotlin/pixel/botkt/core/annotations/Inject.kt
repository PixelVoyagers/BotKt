package pixel.botkt.core.annotations

import pixel.botkt.core.util.DependencyInjectionContainer
import kotlin.reflect.KClass

@Retention(AnnotationRetention.RUNTIME)
annotation class Inject(val injector: KClass<DependencyInjectionContainer.Injector<*>>)
