# qq,微信拼手气红包算法实现

### 思路：将一段绳子切n-1刀，分为n份,用户按顺序取



* hongBao(double size, int num)  //size 红包大小  num 份数  
###运行结果  ：  
     红包大小：200.0,数量：12  
     第1个红包:23.09  
     第2个红包:24.45  
     第3个红包:2.31  
     第4个红包:3.76  
     第5个红包:4.31  
     第6个红包:1.98  
     第7个红包:9.36   
     第8个红包:68.95  
     第9个红包:1.64  
     第10个红包:17.62  
     第11个红包:10.25  
     第12个红包:32.28  

### 代码实现
     
        // 抢红包算法
        public static void hongBao(double money, int size) {
        System.out.println("红包金额：" + money + ",数量：" + size);
        List<BigDecimal> index = new ArrayList<>(size);
        // 将红包按最大金额切 size- 1个点
        for (int i = 0; i < size - 1; i++) {
            // ieee 754
            index.add(new BigDecimal(String.valueOf(Math.floor(Math.random() * money * 100) / 100)));
        }
        // 将点排序,这样任意两点之间的距离就是手气红包大小
        Collections.sort(index);
        // 红包金额数量就是最后一个点
        index.add(new BigDecimal(money));
        for (int i = 0; i < size; i++) {
            System.out.println("第" + (i + 1) + "个红包:" + (index.get(i).subtract(i == 0 ? new BigDecimal("0") : index.get(i - 1))));
        }
    }
