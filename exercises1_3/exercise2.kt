open class Person(val name: String, val age: Int, val email: String) {
    open fun displayInfo() {
        println("Name: $name, Age: $age, Email: $email")
    }
}

class Employee(name: String, age: Int, email: String, val salary: Double) : Person(name, age, email) {
    override fun displayInfo() {
        println("Name: $name, Age: $age, Email: $email, Salary: $salary")
    }
}

class BankAccount(private var balance: Double) {
    
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited: $amount, New balance: $balance")
        } else {
            println("Deposit amount must be positive.")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Withdrew: $amount, Remaining balance: $balance")
        } else {
            println("Insufficient funds or invalid amount.")
        }
    }

    fun displayBalance() {
        println("Current balance: $balance")
    }
}


fun main() {
    val person = Person("Asan", 23, "Asan.Bitanov@gmail.com")
    person.displayInfo()

    val employee = Employee("Asan2", 25, "Asan.Bitanov2@gmail.com", 50000.0)
    employee.displayInfo()

    val account = BankAccount(1000.0)
    account.displayBalance()
    account.deposit(500.0)
    account.withdraw(300.0)
    account.withdraw(1500.0)
}
