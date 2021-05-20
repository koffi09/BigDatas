object ExamenBigData {


  def main(args: Array[String]): Unit = {


      def Listevaleur(liste: List[String]):List[String]= {
        val new_list = liste.filter(s => s.endsWith("n"))
         return new_list
      }
    println(Listevaleur(List("Julien","Paul","Jean","rac","trec","joel","ed","chris")))

    // test de fla fonction

        def liste_double():Unit={
           val liste=List(Map(
             "ecommermarg.fr"->"",
             "https://www.journal.com/contact"->"Payant",
             "https://www.zatap.com/"->"",
             "https://lerevenu.com"->"",
             "https://cadre-dirigeant-magazine.com"->"Paynt",
             "https://silicon.fr/service/contact#/annoncer"->"Payant",
             "https://www.channelbiz.fr/nous-contacter"->"",
             "https://www.itespresso.fr"->"",
             "https://www.industrie-mag.com/article/article4.html"->"invité",
             "https://www.jesuissundev.com/article-invite"->"invite",
             "https://www.journal.com/contact"->"invite"

           )
          )
             // a ffichage ses resulatat des liste

        }

  }
}
