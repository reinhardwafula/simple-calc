fun main(args: Array<String>) {
        var num1: Int
        var num2: Int

        print("Enter a number: ")
        num1 = readLine()!!.toInt()
        print("Enter operator: ")
        var op = readLine()
        print("Enter a second number: ")
        num2 = readLine()!!.toInt()

        if (op == "+"){
                println(num1+num2)
        } else if (op == "-") {
                println(num1-num2)
        } else if (op == "*"){
                println(num1*num2)
        }  else if (op == "/"){
                println(num1/num2)
        } else{
                println("Enter a valid operator!")
        }
}