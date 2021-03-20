package lab9;

import Lab8.ArrayQueue;
import Lab8.LinkedQueue;

/**
 * Created by fatima on 12/07/2020.
 */
public class RoundRobin {
    public static void main(String[] args) {
        LinkedQueue<Process> ready= new LinkedQueue<>();
        LinkedQueue<Process> execution=new LinkedQueue<>();
        LinkedQueue<Process>done=new LinkedQueue<>();

       // String[]ProcessName={ "p0","p1","p2","p3","p4","p5" };
        int[]ArrivalTime={ 0,50,130,190,210,350};
        int[]ExecutingTime={ 250,170,75,100,130,50 };

        for (int i = 0; i < ArrivalTime.length; i++) {
            ready.enqueue(new Process(i,ArrivalTime[i],ExecutingTime[i]));

        }
        int quantum=100;
        int currentTime=0;
        execution.enqueue(ready.dequeue());
        String seq="";
        while(!execution.isEmpty())
        {
            if(execution.first().getRemainingTime()>quantum)
            {
                seq+=" -->P"+execution.first().getProcessIndex();
              int x= execution.first().getRemainingTime();
               int index=execution.first().getProcessIndex();
                int rt=execution.first().getRemainingTime()-quantum;
                execution.first().setRemainingTime(rt);
                currentTime+=quantum;
                while(!ready.isEmpty()&&ready.first().getArrivalTime()<=currentTime)
                {
                    execution.enqueue(ready.dequeue());
                }
                execution.enqueue(execution.dequeue());

            }else
            {
                seq+=" -->P"+execution.first().getProcessIndex();
               int x= execution.first().getRemainingTime();
               int index=execution.first().getProcessIndex();
                currentTime+=execution.first().getRemainingTime();
                execution.first().setEndTime(currentTime);
                execution.first().setTurnAroundTime(execution.first().getEndTime()-execution.first().getArrivalTime());
                execution.first().setWaitingTime(execution.first().getTurnAroundTime()-execution.first().getExecutingTime());
                done.enqueue(execution.dequeue());

            }


        }
        while(!done.isEmpty())
        {System.out.println("P"+done.first().getProcessIndex());
        done.dequeue();}
        System.out.println("sequence of processing is "+seq);
    }
}
