package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class StatusController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def status() = Action { implicit request: Request[AnyContent] =>
    Ok("ok\n")
  }
}
