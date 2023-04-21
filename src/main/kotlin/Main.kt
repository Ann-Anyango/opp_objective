fun main() {
 var person3=User("Ann","Anyango","annmwangombe@gmail.coom ","0721369226",8796)
 var person= Human("Ann",20,75.5)
 person.eat(15)
 person.speak("I am Ann")
 // person.birthday(34)
 person.age
 println(person.age)
// var user= data("Ann","Anyango","annmwangombe@gmail.com","67675675","453421")
// println(user.email)
// println(user.firstName)

}
//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
// attribute
data class User (var firstName:String , var lastName:String, var email:String,var phoneNumber:String, var  password:Int)



class Human( var name:String,var age:Int,var weight:Double){



 fun eat(foodWeight:Int) {
  println("I am eating $foodWeight kgs of food")
  weight += foodWeight
  println(weight)
 }
 fun speak(speech:String){
  println(speech)
 }
 fun birthday(){
  age+=1



 }
}


