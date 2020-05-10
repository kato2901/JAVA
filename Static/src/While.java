public class While {
    public static void main(String[] args) {
        System.out.println("=== while文 ===");
    int i = 1;
    while (i < 10) {
        // iが4の倍数のとき、繰り返し処理を終了
        if(i % 4 == 0) {
        break;
        }

        System.out.println(i);
        i++;
    }
    
    System.out.println("=== for文 ===");
    for (int j = 1; j < 10; j++) {
        // jが5の倍数のとき、処理をスキップ
        if(j % 5 == 0) {
        continue;
        }
        System.out.println(j);
    }
    }
}