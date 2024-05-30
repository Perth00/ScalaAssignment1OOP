import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.text.Text

object MyApp extends JFXApp{
  stage=new PrimaryStage(){

    title = "My ScalaFX"
    width=490
    height=490
    scene=new Scene(){
      content=new Text(x=30, y=30, t="hellow world")
    }

  }

  //    stage.title = "My ScalaFX"
  //    stage.width=490
  //    stage.height=490
}