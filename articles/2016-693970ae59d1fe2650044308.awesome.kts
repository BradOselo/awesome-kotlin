
import link.kotlin.scripts.Article
import link.kotlin.scripts.model.LanguageCodes.RU
import link.kotlin.scripts.LinkType.article
import java.time.LocalDate

// language=Markdown
val body = """
Компания Jetbrains, развивающая интегрированную среду разработки IntelliJ IDEA, [представила](http://blog.jetbrains.com/kotlin/2016/02/kotlin-1-0-released-pragmatic-language-for-jvm-and-android/) первый значительный релиз объектно-ориентированного языка программирования [Kotlin 1.0](https://kotlinlang.org/), позволяющего создавать приложения, скомпилированные для последующего выполнения внутри стандартной виртуальной машины Java (JVM) или Android. Дополнительно поддерживается преобразование программ в JavaScript-представление для запуска внутри браузера, но данная функциональность пока отнесена к экспериментальным возможностям.

Выпуск 1.0 позиционируется как первый выпуск, готовый для промышленного применения. Все дальнейшие обновления будут выпускаться с учётом сохранения обратной совместимости. Исходные тексты [открыты](http://github.com/jetbrains/kotlin) под лицензией Apache 2.0. Плагины с поддержкой Kotlin подготовлены для интегрированных сред разработки IntelliJ IDEA, Eclipse и Android Studio. Из систем сборки поддерживаются Maven, Gradle и Ant.

Язык развивается в санкт-петербургском центре разработки компании JetBrains c целью создания максимально совместимого с Java языка программирования, одновременно лишённого ограничений и недостатков Java, от которых Java не может избавиться из-за необходимости обеспечения обратной совместимости. При этом проекты на Kotlin полностью совместимы с компонентами на языке Java - из программ Kotlin можно вызывать Java-классы и наоборот, из Java вызывать компоненты, написанные на Kotlin. Кроме возможности использования штатных Java-бибилиотек для Kotlin подготовлена большая библиотека классов, оптимизированная для генерации байткода минимального размера.

Из отличительных черт языка Kotlin можно выделить ориентацию на обеспечение более высокой безопасности за счет реализации статических проверок для выявления таких проблем как разыменование NULL-указателей. Среди других особенностей, имеющих отношение к безопасности, отмечается отсутствие raw-типов, полное сохранение информации о типах в процессе выполнения и реализация массивов в виде [инварианта](http://confluence.jetbrains.net/display/Kotlin/Basic+types#Basictypes-Arrays). Из расширенных языковых возможностей отмечается поддержка [функций высшего порядка](http://ru.wikipedia.org/wiki/%D0%A4%D1%83%D0%BD%D0%BA%D1%86%D0%B8%D1%8F_%D0%B2%D1%8B%D1%81%D1%88%D0%B5%D0%B3%D0%BE_%D0%BF%D0%BE%D1%80%D1%8F%D0%B4%D0%BA%D0%B0), [вывода типов](http://ru.wikipedia.org/wiki/%D0%92%D1%8B%D0%B2%D0%BE%D0%B4_%D1%82%D0%B8%D0%BF%D0%BE%D0%B2) значений на основании выражения, использование уточняющих "[примесей](http://ru.wikipedia.org/wiki/%D0%9F%D1%80%D0%B8%D0%BC%D0%B5%D1%81%D1%8C_%28%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5%29)" (mixin) и [делегирования](http://ru.wikipedia.org/wiki/%D0%94%D0%B5%D0%BB%D0%B5%D0%B3%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5_%28%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5%29).

"""

Article(
  title = "Релиз Kotlin 1.0, языка программирования для JVM и Android.",
  url = "http://www.opennet.ru/opennews/art.shtml?num=43882",
  categories = listOf(
    "Kotlin",
    "JVM"
  ),
  type = article,
  lang = RU,
  author = "Open Source",
  date = LocalDate.of(2016, 2, 16),
  body = body
)