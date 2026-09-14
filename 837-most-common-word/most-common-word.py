class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        
        bannedSet=set(banned)

        paragraph=paragraph.lower()

        for ch in "!?',;.":
            paragraph=paragraph.replace(ch," ")
        
        words=paragraph.split()

        freq={}

        for word in words:
            if word not in bannedSet:
                freq[word]=freq.get(word,0)+1
        
        answer=""
        maxm=0
        for word in freq:
            if freq[word]>maxm:
                maxm=freq[word]
                answer=word
        return answer