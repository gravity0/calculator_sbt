package calculator
import scala.collection.mutable.Seq

/**
 * Created by greapflute on 15/03/21.
 */
case class Stack() {
    var stack: Seq[Number] = Seq[Number]()
    def push(x: Int) = {stack = Number(x) +: stack}

    def pop(): Number = {
        val result = stack.head
        this.stack = stack.tail
        result
    }
}
