package q2

import java.sql.{DriverManager, ResultSet}

/**
  * Created by Aluísio on 05/10/2016.
  */
object node01 extends App {
  println("Postgres connector")
  classOf[org.postgresql.Driver]
  val con_st = "jdbc:postgresql://localhost:5432/pod"
  val conn = DriverManager.getConnection(con_str)
  try {
    val stm = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)

    val rs = stm.executeQuery("SELECT * from Usuario")

    while(rs.next) {
      println(rs.getString("quote"))
    }
  } finally {
    conn.close()
  }
}
