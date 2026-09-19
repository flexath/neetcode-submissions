class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        val hashMap1 = hashMapOf<Char,Int>()
        for(chr in s) {
            hashMap1[chr] = (hashMap1[chr] ?: 0) + 1
        }

        val hashMap2 = hashMapOf<Char,Int>()
        for(chr in t) {
            hashMap2[chr] = (hashMap2[chr] ?: 0) + 1
        }

        for((chr, count) in hashMap1) {
            if((chr !in hashMap2) || count !=  hashMap2[chr]) {
                return false
            }
        }
        return true
    }
}
