package OOP

class Doctor: Person("Hein Htet","Aung",30),DoSomething {
    override val id = "Dr $fullName-$age";
    override fun doSomething() {
        println("I will inject you")
        // GitTest
    }
}