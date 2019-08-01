import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        hongBao(200, 12);
    }

    // 抢红包算法
    public static void hongBao(double size, int num) {
        System.out.println("红包大小：" + size + ",数量：" + num);
        List<BigDecimal> index = new ArrayList<>();
        for (int i = 0; i < num - 1; i++) {
            index.add(new BigDecimal(String.valueOf(Math.floor(Math.random() * size * 100) / 100)));
        }
        Collections.sort(index);
        index.add(new BigDecimal(size));
        for (int i = 0; i < num; i++) {
            System.out.println("第" + (i + 1) + "个红包:" + (index.get(i).subtract(i == 0 ? new BigDecimal("0") : index.get(i - 1))));
        }
    }


}

