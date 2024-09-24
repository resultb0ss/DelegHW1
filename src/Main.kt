fun main() {

    val b = ToBin(10)
    MyNum(b).toBin()

}

interface Binary{
    fun toBin()
}

class ToBin(val num: Int): Binary{
    override fun toBin() {
        println("Число в бинарной системе счисления ${Integer.toBinaryString(num)}")
    }
}

class MyNum(num: Binary): Binary by num