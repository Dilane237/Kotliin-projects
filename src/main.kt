fun sayHello(greetings:String, vararg itemToGreet:String){
    itemToGreet.forEach { element ->
        println("$greetings $element")
    }
}

fun main(){
    val personToGreet = arrayOf("Dilane","Mesmer","Magloire","Tianou")


        sayHello(itemToGreet = *personToGreet,greetings = "Hello")


}