public class Merge_Sort {

    //conquer isliye banaya hai kyonki we have to sort the array 
    public static void conquer(int arr[], int si, int mid, int ei) {    // si -- starting index
                                                                        // ei -- ending index  
             
        int merged [] = new int [ei - si + 1];     // puri array shuru se aakhri tak joki sorted hogi 

        //inserting elements 
        int idx1 = si;      //idx1 -- index  1   // pahali array track ho rhi h
        int idx2 = mid+1;   // idx2 -- index 2   // doosri array track ho rhi h
        int x = 0;

        while(idx1 <= mid && idx2 <= ei) {
        if(arr[idx1] <= arr[idx2]) {
            merged [x++] = arr[idx1++];  
        //x++ ;       // aise bhi kr skte the alag line mein 
        //idx1++;
        } 

        else {
            merged [x++] = arr[idx2++];
        }
        }

        //jo already sorted hai unke liye 2 loop aur 
        while(idx1 <= mid) {
            merged [x++] = arr[idx1++];
        }
        
        while(idx2 <= ei){
            merged [x++] = arr[idx2++]; 
        }

        //original array mein merged array ke elements copy krne hai  
        for(int i=0, j=si; i<merged. length; i++, j++) {   // do alag alag loop ki jagah ek mein bhi likh skte hai 
            arr[j] = merged [i];
            }
        }





        public static void divide(int arr[], int si, int ei) { 
        if(si >= ei) {                                                 
        return;
        }
        int mid = si + (ei - si)/2; // (si+ei)/2 --> yeh nhi likha kyonki bade code mein yeh 
                                    // space complexity ki problem de skta hai 
        //array ko 1st baar jab todnege tab  
        divide (arr, si/*(starting index)*/, mid/*(ending index)*/);
        divide (arr, mid+1, ei);
        conquer (arr, si, mid, ei);
        }





        public static void main(String args[]) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        
        divide (arr, 0, n-1);
        //print
        for(int i=0; i<n; i++) {
        System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        
    }
    
}
