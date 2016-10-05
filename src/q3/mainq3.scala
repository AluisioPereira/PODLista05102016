package q3
import java.lang.{Thread}

/**
  * Created by Aluísio on 04/10/2016.
  */


object mainq3 {
  var value = "B"
  def setValue (): Unit ={
    value ="A"
  }
  def setter(thread: Thread){
    setValue()
  }

  def main(args: Array[String]): Unit = {
    setter()
    var x=0
    for (x <- 1 to 10){
      println(x+" valor: "+value)
    }
  }
}
