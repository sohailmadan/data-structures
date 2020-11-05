import java.util.*;
class mycomparator implements Comparator<meeting>{
  
    public int compare(meeting o1,meeting o2){
        if(o1.end<o2.end){
            return -1;
        }else if(o1.end>o2.end){
            return 1;
        }
        return 0;
    }
}
 class meeting
{
    int start;
    int end;
    int pos;
     
    meeting(int start, int end, int pos)
    {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}
public class Meetingselection{
 public static void meetselect(List<meeting>meet,int n){
     ArrayList<Integer> m = new ArrayList<>();
      int time_limit = 0;
      mycomparator mc = new mycomparator(); 
      Collections.sort(meet,mc);
      m.add(meet.get(0).pos);
     time_limit = meet.get(0).end;
     for(int i=0;i<n;i++){
         if(meet.get(i).start>=time_limit){
             m.add(meet.get(i).pos);
            time_limit = meet.get(0).end;
         }
     }
      for(int i = 0; i < m.size(); i++)
        System.out.print(m.get(i) + 1 + " ");
   

 }
  public static void main(String[]args){
    
    int s[] = { 1, 3, 0, 5, 8, 5 };
     
    
    int f[] = { 5, 4, 6, 7, 9, 9 };
    ArrayList<meeting> meet = new ArrayList<>();
    for(int i=0;i<s.length;i++){
      	meet.add(new meeting(s[i], f[i], i));
    }
    meetselect(meet,meet.size());
    }    
    
}
