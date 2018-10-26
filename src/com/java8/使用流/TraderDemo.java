package com.java8.使用流;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
 * @Author MASTERYEE
 * @Date 2018/10/20 22:10
 **/
public class TraderDemo {

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));

        List<Transaction> collect = transactions.stream().filter(transaction -> transaction.getYear() == 2011).
                sorted(Comparator.comparing(Transaction::getValue)).collect(toList());

        List<String> collect1 = transactions.stream().map(Transaction::getTrader).map(d -> d.getCity()).distinct().collect(toList());

        //List<Trader> cambridge = transactions.stream().filter(d -> d.getTrader().getCity().equalsIgnoreCase("Cambridge")).
                //distinct().map(Transaction::getTrader).sorted(Comparator.comparing(Trader::getName)).collect(toList());
        transactions.stream().map(Transaction::getTrader).filter(d->d.getCity().equalsIgnoreCase("Cambridge")).distinct()
                .sorted(Comparator.comparing(Trader::getName)).collect(toList());

        //transactions.stream().map(Transaction::getTrader).map(Trader::getName).distinct().sorted(Comparator.comparing(Trader::getName));

        boolean milan = transactions.stream().anyMatch(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("Milan"));

        Integer cambridge1 = transactions.stream().filter(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("Cambridge")).map(Transaction::getValue).
                reduce(0, Integer::sum);

        Integer integer = transactions.stream().map(Transaction::getValue).reduce(Integer::max).get();
        int sum = transactions.stream().mapToInt(Transaction::getValue).sum();

        List<Apple> collect2 = transactions.stream().map(transaction -> new Apple(transaction.getTrader().getName(), transaction.getValue(), transaction.getYear())).collect(toList());
        System.out.println(collect2);

        Stream.iterate(0,n->n+2).limit(10).forEach(System.out::println);

        Map<Trader, List<Transaction>> collect3 = transactions.stream().collect(groupingBy(Transaction::getTrader));
        Map<Integer, List<Transaction>> collect4 = transactions.stream().collect(groupingBy(Transaction::getValue));
        collect4.getOrDefault(1, new ArrayList<>());
        Map<Integer, Object> maps = new HashMap<>();
        maps.put(1, "good");
        maps.put(2, "good");
        maps.put(3, "good");

        long count = (long) transactions.size();
        transactions.stream().collect(maxBy(Comparator.comparingInt(Transaction::getValue)));
        Integer collect5 = transactions.stream().collect(summingInt(Transaction::getValue));
        Double collect6 = transactions.stream().collect(averagingInt(Transaction::getValue));
        IntSummaryStatistics collect7 = transactions.stream().collect(summarizingInt(Transaction::getValue));
        transactions.stream().map(d -> String.valueOf(d.getYear())).collect(joining(","));
//        transactions.stream().filter(transactions.stream().reduce(Integer::min))
//        System.out.println(integer);
    }
}
