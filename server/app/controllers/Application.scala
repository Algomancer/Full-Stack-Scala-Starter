package controllers

import javax.inject._

import play.api.libs.json.Json
import play.api.mvc._
import shared.SharedMessages

class Application @Inject() extends Controller {

  def index = Action {
    Ok(views.html.index(SharedMessages.itWorks))
  }

}
