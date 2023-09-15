class HelloBot {

    val greeting: String by lazy(LazyThreadSafetyMode.PUBLICATION) {
        println("초기화 로직 수행")
        getHello()
    }

    fun sayHello() = println(greeting)

}

fun getHello() = "안녕하세요"

fun main() {
    val helloBot = HelloBot()

    // ..
    // ..

//    helloBot.greeting = getHello() //가변상태일경우..
//    helloBot.sayHello()

    for (i in 1..5) {
        Thread {
            helloBot.sayHello()
        }.start()
    }
}
