

fun main(){

    val authLog = AuthLog("Bad Password")

}

open class Log{
    var data: String = ""
    var numberOfTimes = 0

    //define secondary constructor of class Log
    constructor(_data: String){
        data = _data
    }

    //secondary constructor with different parameters
    constructor(_data: String, _numberOfTimes: Int){
        data = _data
        numberOfTimes = _numberOfTimes

        //display values collected from the derived class
        println("$data:  $numberOfTimes times")
    }
}

class AuthLog: Log{

    //here we initialize the constructor because the primary constrcutor has not been initialized
    constructor(_data: String): this(_data,10) //accessing _numberOfTimes using this

    //here we call the superclass base constructor using super
    constructor(_data: String,_numberOfTimes: Int): super(_data,_numberOfTimes){

    }

}

