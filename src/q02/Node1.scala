package q2
/**
  * Created by Aluísio on 06/10/2016.
  */
class Node1 {
  Class.forName("org.postgresql.Driver");
  val session = Session.create(java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres"), new PostgreSqlAdapter)

}
