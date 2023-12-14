package member

import org.springframework.stereotype.Repository

@Repository
class MemberRepo {
    private val memberList = mutableListOf<Member>();

    fun addMember(member:Member): Member?{
        val isAlready = memberList.find{
            it.id == member.id
        }
        isAlready ?: memberList.add(member);
        return isAlready;
    }
}