class Quicksort {
    static void qsort(char items[]){
        qs(items, 0, items.length - 1);
    }
    private static void qs(char items[], int left, int right) {
        int i, j;
        char x, y;
        
        i = left;
        j = right;
        x = items[(left + right) / 2];
        
        do {
            while((items[i] < x) && (i < right)) i++;
            while((x < items[j]) && (j > left)) j--;
            
            if(i <= j) {
                y = items[i];
                items[i] = items[j];
                System.out.println(y + " replace " + items[i]);
                items[j] = y;
                System.out.print("Array: ");
                for(int mi = 0; mi < items.length; mi++)
                    System.out.print(items[mi]);
                System.out.println();
                i++;
                j--;
            }
        } while(i <= j);
        
        if(left < j) qs(items, left, j);
        if(i < right) qs(items, i, right);
    }
}

class QSDemo {
    public static void main(String args[]) {
        char a[] = {'3', '4', '7', '1', '6', '5', '2'};
        int i;
        
        System.out.print("Start array: ");
        for(i = 0; i < a.length; i++)
            System.out.print(a[i]);
        System.out.println();
        
        Quicksort.qsort(a);
        
        System.out.print("Sorted array: ");
        for(i = 0; i < a.length; i++)
            System.out.print(a[i]);
        System.out.println();
        
    }
}