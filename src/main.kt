fun main(){

    //create Girl object
    val girl = Girl()

    //access displayAge through the girl object
    girl.displayAge(23)

}

open class Person() {

    //we use open because if not the displayAge function will be seen as final so can be overriden
   open fun displayAge(age: Int){
        println("my age is $age")
    }
}

class Girl: Person(){

    //overrode because it is already in the superclass while he has a different implementation here
   override fun displayAge(age: Int){
        println("My age is ${age-5}")
    }
}

