import java.lang.NullPointerException

fun getNullStr(): String? = null

fun getLengthIfNotNull(str: String?) = str?.length ?: 0

fun main() {

//    val a : String = null
//    var b : String = "aabbcc"
//    b = null
//
//    var a : String? = null
//    println(a?.length)
//
//    val b: Int = if(a != null) a.length else 0
//    println(b)
//
//    // 엘비스 연산자
//    val c = a?.length ?: 0
//    println(c)

    val nullableStr = getNullStr()

    val nullableStrLength = nullableStr?.length ?: "null인 경우 반환".length
    println(nullableStrLength)

    val length = getLengthIfNotNull(null)
    println(length)


//    throw NullPointerException()

//    val c: String? = null
//    val d = c!!.length

//    자바 코드의 Null을 호출할 때도 NPE 발생할 수 있음
//    엘비스 연산자로 처리 가능
//    println(Java_NullSafety.getNullStr()?.length ?: 0)
}