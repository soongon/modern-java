package kr.re.kitri.stream.transaction;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class TxAnalyzer {

    public static void main(String[] args) {

        List<Transaction> transaction = Transaction.getTransaction();

//        Map<Currency, Double> collect = transaction.stream() // Stream<Transaction>
//                .collect(groupingBy(item -> item.getCurrency(), summingDouble(item -> item.getValue())));

        Map<Currency, Map<Boolean, Double>> collect = transaction.stream()
                .collect(groupingBy(item -> item.getCurrency(),
                        partitioningBy(item -> item.getValue() >= 5000,
                        averagingDouble(item -> item.getValue()))));

        System.out.println(collect);

    }

}
/*

Map<Currency, Double>
{
    JPY=[
            Transaction{currency=JPY, value=7800.0},
            Transaction{currency=JPY, value=5700.0}
        ],
    EUR=[
            Transaction{currency=EUR, value=1500.0},
            Transaction{currency=EUR, value=1100.0},
            Transaction{currency=EUR, value=5600.0},
            Transaction{currency=EUR, value=6800.0}
        ],
    CHF=[
            Transaction{currency=CHF, value=6700.0},
            Transaction{currency=CHF, value=3400.0}
        ],
    USD=[
            Transaction{currency=USD, value=2300.0},
            Transaction{currency=USD, value=4500.0},
            Transaction{currency=USD, value=4600.0}
        ],
    GBP=[
            Transaction{currency=GBP, value=9900.0},
            Transaction{currency=GBP, value=3200.0}
        ]
}

*/