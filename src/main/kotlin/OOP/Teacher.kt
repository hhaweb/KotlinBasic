package OOP

class Teacher: Person("Hein Htet","Aung",30), DoSomething {
    override val id: String = "Teacher $fullName-$age"
    override fun doSomething() {
        println("I will teach you");
    }
}