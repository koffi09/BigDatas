object ExamenBigData {


  def main(args: Array[String]): Unit = {


      def Listevaleur(liste: List[String]):List[String]= {
        val new_list = liste.filter(s => s.endsWith("n"))
         return new_list
      }
         // test de fla fonction
      println(Listevaleur(List("Rolan","rrr","papap","pppp")))

  }
}
