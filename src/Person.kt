class Person( val firstName:String, val lastName:String){
//    constructor() : this()

    constructor(): this("Dilane","Azangue"){
        println(this.firstName)
        println(this.lastName)
    }

}