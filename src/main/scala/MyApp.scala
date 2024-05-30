abstract class User(val id:Int, val name:String, val email:String, val address:String)
{
    def Login(email:String,password:String):Boolean={
      true
    }
    def Logout():Boolean={
      false
    }
}
class Admin(_id:Int,_name:String, _email:String, _address:String) extends User(_id,_name, _email, _address)
{
    override def Login(email:String, password:String):Boolean={
      println("Login successfully")
      true
    }
    override def Logout():Boolean={false}

}

class Customer(_id:Int,_name:String, _email:String, _address:String) extends User(_id,_name, _email, _address)
{
  override def Login(email:String,password:String):Boolean={
    true
  }
  override def Logout():Boolean={false}

}

abstract class Mobile(val id: Int, val name: String, val price: Double){
  def showInfo(): Unit = {}
}
// Specific types of Mobiles
class SmartPhone(_id: Int, _name: String, _price: Double) extends Mobile(_id, _name, _price){
  //show the information of mobile phone
  override def showInfo(): Unit = {}
}
class AndroidPhone(_id: Int, _name: String, _price: Double) extends Mobile(_id, _name, _price){
  //show the information of mobile phone
  override def showInfo(): Unit = {}
}

class Cart(val customerId: Int){
  def addCart(order: Order): Unit = {}
  def deleteCart(order: Order): Unit = {}
  def editCart(order: Order): Unit = {}
}

case class Payment(val customerId: Int,val amount: Double){}

class Order(val orderId: Int, val customerId: Int, val items: List[Mobile], val totalAmount: Double){
  def showOrderDetails(): Unit = {}
}

case class Feedback(val id: Int, val customerId: Int, val mobileId: Int, val rating: Int, val comments: String){
  //customer can give feedback of the mobile item
}

object MyApp{
  def main(args:Array[String]):Unit={
    val admin=new Admin(123,"P","ee","")
    val user=new Admin(123,"P","ee","")

    admin.Login(admin.email,"Perhtht")

  }
}