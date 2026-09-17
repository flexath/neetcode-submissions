class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        val hashMapForS = HashMap<Char,Int>()
        val hashMapForT = HashMap<Char,Int>()
        for(chr in s) {
            hashMapForS[chr] = (hashMapForS[chr] ?: 0) + 1
        }
        for(chr in t) {
            hashMapForT[chr] = (hashMapForT[chr] ?: 0) + 1
        }
        for(chr in hashMapForS.keys) {
            if(hashMapForT[chr] != hashMapForS[chr]) {
                return false
            }
        }
        return true
    }
}
