public class ArraySum {
    static void main() {
        int []a={10,12,13,14,15};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        System.out.println("sum of all the elemnts"+sum);
    }
}
