

import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] grades = new int[n];
            for (int i = 0; i < n; i++)
            {
                grades[i] = scanner.nextInt();
            }

            String[] strs = new String[m];
            int[] a = new int[m];
            int[] b = new int[m];
            for (int i = 0; i < m; i++)
            {
                strs[i] = scanner.next();
                a[i] = scanner.nextInt();
                b[i] = scanner.nextInt();
            }
            for (int i = 0; i < m; i++)
            {
                if (strs[i].equals("Q"))
                {
                    if (a[i] < b[i])
                        getMax(grades, a[i], b[i]);
                    else
                        getMax(grades, b[i], a[i]);
                }
                else
                    grades[a[i] - 1] = b[i];
            }
        }
    }
    public static void getMax(int[] arr, int i, int j)
    {
        int max = arr[i - 1];
        for (int k = i; k <= j - 1; k++)
            if (arr[k] > max)
                max = arr[k];
        System.out.println(max);
    }
}