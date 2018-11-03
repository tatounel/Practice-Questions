/**
Scheduling is how the processor decides which jobs(processes) get to use the processor and for how long. This can cause a lot of problems. Like a really long process taking the entire CPU and freezing all the other processes. One solution is Shortest Job First(SJF), which today you will be implementing.

SJF works by, well, letting the shortest jobs take the CPU first. If the jobs are the same size then it is First In First Out (FIFO). The idea is that the shorter jobs will finish quicker, so theoretically jobs won't get frozen because of large jobs. (In practice they're frozen because of small jobs).

Specification
Challenge.sjf(jobs, index)
Returns the clock-cycles(cc) of when process will get executed for given index

Parameters
jobs: Integers[] - A non-empty array of positive integers representing cc needed to finish a job.

index: Integer - A positive integer that respresents the job we're interested in

Return Value
Integer - A number representing the cc it takes to complete the job at index.

Examples
jobs	index	Return Value
[3,10,20,1,2]	0	6
[3,10,10,20,1,2]	2	26
**/

import java.util.List;
import java.util.Arrays;
class Challenge {
  public static Integer sjf( List<Integer> jobs,Integer index ) {
      int totalCC = 0;
      for(int i=0; i<jobs.size(); i++){
          if(jobs.get(index) > jobs.get(i))
              totalCC += jobs.get(i);
          if(jobs.get(index) == jobs.get(i) && i<index)
              totalCC += jobs.get(i);
      }
      totalCC += jobs.get(index);
      
      return totalCC;
  }
}
