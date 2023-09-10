import java.util.ArrayList
import java.util.LinkedList

fun main() {
    //immutable
    val currencyList = listOf("달러", "유로", "원")


    // mutable
    val mutableCurrencyList = mutableListOf<String>().apply {
        add("달러")
        add("유로")
        add("원")
    }
//    mutableCurrencyList.add("달러")
//    mutableCurrencyList.add("유로")
//    mutableCurrencyList.add("원")

    //immutable set
    val numberSet = setOf(1, 2, 3, 4)

    // mutable set
    val mutableSet = mutableSetOf<Int>().apply {
        add(1)
        add(2)
        add(3)
        add(4)
    }

    //immutable map
    val numberMap = mapOf("one" to 1, "two" to 2)

    //mutable map
    val mutableNumberMap = mutableMapOf<String, Int>()
    mutableNumberMap["one"] = 1
    mutableNumberMap["two"] = 2
    mutableNumberMap["three"] = 3

    // 컬렉션 빌더는 내부에선 mutable 반환은 immutable
    val numberList: List<Int> = buildList{
        add(1)
        add(2)
        add(3)
    }

    // linkedList

    val linkedList = LinkedList<Int>().apply {
        addFirst(3)
        add(2)
        addLast(1)
    }

    // arrayList
    val arrayList = ArrayList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }
//
//    val iterator = currencyList.iterator()
//    while (iterator.hasNext()) {
//        println(iterator.next())
//    }
//
//    println("=====================")
//
//    for (currency in currencyList) {
//        println(currency)
//    }
//
//
//    currencyList.forEach {
//        println(it)
//    }

    // for loop -> map
    val lowerList = listOf("a", "b", "c")
//    val upperList = mutableListOf<String>()

//    for (lowercase in lowerList) {
//        upperList.add(lowercase.uppercase())
//    }

    val upperList = lowerList.map { it.uppercase() }
    println(upperList)
//
//    val filteredList = mutableListOf<String>()
//    for (upperCase in upperList) {
//        if (upperCase == "A" || upperCase == "C") {
//            filteredList.add(upperCase)
//        }
//    }


    val filteredList = upperList
//        .asSequence() // 대용량 데이터일 경우 터미널 연산자를 사용하여 최종 객체만 생성되도록한다.
        .filter { it == "A" || it == "C" }
        .filter { it == "C" }
        .filter { it == "C" }
        .filter { it == "C" }
        .filter { it == "C" }
//        .toList() // 대용량 데이터일 경우 터미널 연산자를 사용하여 최종 객체만 생성되도록한다.

    println(filteredList)
}