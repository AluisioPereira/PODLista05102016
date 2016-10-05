package q2

/**
  * Created by Aluísio on 04/10/2016.
  */

import java.io.{PrintWriter,PrintStream}
import java.net.{ServerSocket, Socket}


class EchoServer extends Thread {
  override def run() : Unit = {
    for {
      server <- managed(new ServerSocket(8007))
      connection <- managed(server.accept)
      outStream <- managed(new PrintWriter(new BufferedWriter(new OutputStreamWriter(connection.getOutputStream))))
      input <- managed(new BufferedReader(new InputStreamReader(connection.getInputStream)))
      line <- new JavaBufferedReaderLineIterator(input)
    } {
      outStream.println(line)
      outStream.flush()
    }
  }
}

object EchoClient {
  def main(args : Array[String]) : Unit = {
    for { connection <- ManagedResource(new Socket("localhost", 8007))
          outStream <- ManagedResource(connection.getOutputStream))
      val out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outStream)))
      inStream <- managed(new InputStreamReader(connection.getInputStream))
      val in = new BufferedReader(inStream)
    } {
      out.println("servidor!")
      out.flush()
      println("Recebido do cliente: " + in.readLine)
    }
  }
}