package com.exilant.day2.stats;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DragonsClient {

	public static void main(String[] args) {
		List<Dragon> dragonList=
				Stream.of(
						new Dragon("Errol","USA",15),
						new Dragon("Errol","USA",33),
						new Dragon("Firran","USA",5),
						new Dragon("Hasai","France",12),
						new Dragon("Errol","France",3)
						).collect(Collectors.toList());
		
		// to find no of dragons
		Map<String,Long> mapDragonCount=dragonList.stream()
				.collect(Collectors.groupingBy(Dragon:: getName, Collectors.counting()));
		System.out.println(mapDragonCount);
		
		
		
		// find the sum of dragons based on names
		
		Map<String, Integer> sumOfDragons=dragonList.stream()
				.collect(Collectors.groupingBy(Dragon:: getName,Collectors.summingInt(Dragon::getCount)));
		
		System.out.println("---------Report for sum of Dragon------------");
		sumOfDragons.forEach(
				(k,v)->{
					System.out.println("Dragon Name-->"+k +",Number of Dragons-->"+v);
					System.out.println("-------------------");
				}
				);
		
		Map<String, Double> sumOfAverage=dragonList.stream()
				.collect(Collectors.groupingBy(Dragon:: getName, Collectors.averagingInt(Dragon::getCount)));
		
		sumOfAverage.forEach(
				(k,v)->{
					System.out.println("Dragon Name-->"+k +", Dragons Average-->"+v);
				}
				);
		
		Optional<Dragon> max=dragonList.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Dragon::getCount)));
		System.out.println("Max--->"+max);
		
		Optional<Dragon> min=dragonList.stream()
				.collect(Collectors.minBy(Comparator.comparing(Dragon::getCount)));
		System.out.println("Min--->"+min);
		
		System.out.println("------------------------");
//		Map<String, List<Dragon>> groupByCountry=dragonList.stream()
//				.collect(Collectors.groupingBy(Dragon:: getCountry));
//		
//		groupByCountry.forEach(
//				(k,v)->{
//					System.out.println("Country-->"+k +",Name-->"+v );
//				}
//				);
		
		IntSummaryStatistics stats=dragonList.stream().mapToInt(
				(x)->x.getCount()
				).summaryStatistics();
		System.out.println("Sum is-->"+stats.getSum());
		System.out.println("Average is-->"+stats.getAverage());
		System.out.println("Max is-->"+stats.getMax());
		System.out.println("Min is-->"+stats.getMin());
		System.out.println("Count is-->"+stats.getCount());
	}

}
