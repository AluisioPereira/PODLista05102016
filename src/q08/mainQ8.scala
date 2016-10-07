package q8

/**
  * Created by Aluísio on 04/10/2016.
  */


class mainQ8[A] {
  private var x=0
  private var y=0
  private var isDefined : Boolean=false
  private var value: A = _

  def get = synchronized{
    while (!isDefined)wait()
    value
  }

  def sum () {
    x = y + 1
    y = x + 1
  }

  def main(args: Array[String]): Unit = {
    val t= new Thread()
    var i = 0
    for(i <- 1 to 10) {

    }
  }
}
