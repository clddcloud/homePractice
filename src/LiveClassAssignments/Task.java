package LiveClassAssignments;

public class Task {
    int min (int a, int b){
        if (a<b){
            return a;
        } else if (a>b){
            return b;
        } else {
            System.out.println("They are equal");
            return a;
        }
    }
    double min (double a, double b){
        if (a<b){
            return a;
        } else if (a>b){
            return b;
        } else {
            System.out.println("They are equal");
            return a;
        }

    }

    public static void main(String[] args) {
        Task obj=new Task();
        System.out.println(obj.min(10.0, 10));
    }
}

