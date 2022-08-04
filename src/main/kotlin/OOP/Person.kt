package OOP

import java.util.*

open class Person constructor(var firstName: String ,var lastName: String,var age: Int) {
    val upperCaseFullName: String = firstName.uppercase() + " " + lastName.uppercase()
    val fullName: String
     get() = "$firstName $lastName"
    open val id: String = "$firstName-$age"
}