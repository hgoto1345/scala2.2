package controllers

import play.api._
import play.api.mvc._
import play.api.i18n.Messages



import controllers.main._

object Application extends Controller {


 	// def index = Action {
  //   	Ok(views.html.index(Messages("pageTitle.login"), Messages("info.login")))
 	// }
  
 	def diary = Action {
    	Ok(views.html.layout.layout(Messages("menu.diary"), views.html.content.diary()))
 	}

 	def aboutSite = Action {
    	Ok(views.html.layout.layout(Messages("menu.aboutSite"), views.html.content.aboutSite()))
 	}
 	def bookRanking = Action {

		val str = Messages("menu.amazon.book")
		var list = Ranking.bookRanking

    Ok(views.html.layout.layout(str, views.html.content.ytRan(str,list)))
    
 	}
    def musicRanking = Action {

      val str = Messages("menu.music.daily")
      var list = Ranking.musicRanking

      Ok(views.html.layout.layout(str, views.html.content.ytRan(str,list)))
    
  }
 	def introduction = Action {
    	Ok(views.html.layout.layout(Messages("menu.introduction"), views.html.content.introduction()))
 	}

  def notFound(hoge:String) = Action {
    Ok(views.html.layout.layout(Messages("message.error.1"), views.html.error.e404()))

  }
  
def dfftedfdefefrd(hoge:String) = Action {
    Ok(views.html.layout.layout(Messages("message.error.1"), views.html.error.e404()))

  }
}