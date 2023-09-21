import java.Hero


fun main() {
    val hero = Hero()
//
    hero.address = "스타크타워"

    val heroKt = HeroKt(name = "아이언맨", age = 50, address = "스타크타워")
    println("heroKt = ${heroKt}")
}