//Question: https://leetcode.com/problems/find-smallest-letter-greater-than-target/ 

public class CeilingAlphabet
{
  public char nextGreatestLetter(char[] letters, char target) {
        int start= 0;
        int end= letters.length-1;
        while(start<=end)
        {
            int mid= start +(end - start)/2;
            if(letters[mid]>target)
                end = end -1;
            else
                start = start+1;
        }
        return letters[start% letters.length];  //for wrapping around
    
    }
}
