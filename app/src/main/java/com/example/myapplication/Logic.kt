package com.example.myapplication


class Person {
    var name = ""
    var username = ""
    var age = 0
    var email = ""
    fun printName() {
        println(name)
        println(username)
        println(age)
        println(email)

    }

    override fun toString(): String {
        return "$name" + "$username" + "$age" + "$email"

    }

}

fun main() {
    var person1 = Person()
    person1.name = "nikoloz"
    person1.username = "broladze"
    person1.age = 18
    person1.email = "nikoloz.broladze.1@btu.edu.ge"
    person1.printName()

    var person2 = Person()
    person2.name = "vigac"
    person2.username = "gvari"
    person2.age = 23
    person2.email = "vigac.gvari.1@btu.edu.ge"
    person2.printName()

}