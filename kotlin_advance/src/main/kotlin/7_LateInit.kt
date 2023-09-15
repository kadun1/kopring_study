class `7_LateInit` {

    lateinit var text: String

    val textInitialized: Boolean
        get() = this::text.isInitialized

    fun printText() {
        if (this::text.isInitialized) {
            println("초기화됨")
        } else {
            text = "안녕하세요"
        }

        println(text)
    }

}

fun main() {
    val test = `7_LateInit`()

    if (!test.textInitialized) {
        test.text = "하이요"
    }

//    test.text.isInitialized //클래스 외부에서 불가능
    test.printText()
}