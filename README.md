# Bubble Sort program for String values
Bubble sort program for string values in Java

Bubble sort is a simple sorting algorithm. This sorting algorithm is comparison-based algorithm in which each pair of adjacent elements is compared and the elements are swapped if they are not in order. 

Bubble sort for numbers is done by the following algorithm:
```
BubbleSort(list : array of items)
   loop = list.count;
   for i = 0 to loop-1 do:
      swapped = false
      for j = 0 to loop-1 do:
          /* compare the adjacent elements */   
         if list[j] > list[j+1] then
            /* swap them */
            swap( list[j], list[j+1] )		 
            swapped = true
         end if
       end for
       /*if no number was swapped that means 
      array is sorted now, break the loop.*/  
      if(not swapped) then
         break
      end if
   end for
end and return list
```

To perform bubble sort on Strings we compare adjacent Strings and if they are not in the order then we need to swap those strings.
