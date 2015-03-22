package calculator

/**
 * Created by greapflute on 15/03/21.
 */
object calculator extends App {
    val input: String = readLine
    val stack: Stack = Stack()
    input.map{ element =>
        if(element.isDigit){
            stack.push(element.asDigit)
        }else{
            element match {
                case '*' => {
                    println(stack.pop.number * stack.pop.number)
                }
                case '+' => {
                    println(stack.pop.number + stack.pop.number)
                }
                case '-' => {
                    println(stack.pop.number - stack.pop.number)
                }
                case '/' => {
                    println(stack.pop.number / stack.pop.number)
                }
            }
        }
    }


}
