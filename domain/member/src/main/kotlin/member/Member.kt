package member
open class Member (var id: String, var pw:String){

    override fun toString(): String{
        return "id = ${id} | pw = ${pw}"
    }
}