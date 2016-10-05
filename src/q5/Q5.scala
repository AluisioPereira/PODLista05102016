package q5

/**
  * Created by Aluísio on 05/10/2016.
  */
class Q5 {
  //declaração
  private var x: Int = 0
  private var y: Int = 0

  //procedimento
  def sum() {
    x = y + 1
    y = x + 1
  }

  def main(args: Array[String]) {
    var i: Int = 1
    while (i <= 10) {
      {
        //Thread A
        val a: Thread = new Thread() {
          override def run() {
            sum()
          }
        }
        a.start()
        //Thread B
        val b: Thread = new Thread() {
          override def run() {
            sum()
          }
        }
        b.start()
        System.out.println("valor de x: " + x)
      }
      {
        i += 1; i - 1
      }
    }
  }


}
