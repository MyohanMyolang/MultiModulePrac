package member
open class Member (val id: String, val pw:String){

    override fun toString(): String{
        return "id = ${id} | pw = ${pw}"
    }
}