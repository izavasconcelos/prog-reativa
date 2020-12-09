package com.izavasconcelos.reactive;


import reactor.core.publisher.Flux;

public class TestWebFlux {

    public static void main(String[] args) {
        final Flux<String> brands = Flux.just("Under Armour", "Asics", "Nike", "Adidas", "Mizuno");
        brands.sort()
                .subscribe(System.out::println);
        System.out.println("--------------------------");

        brands.skip(1)
                .groupBy(b -> b.charAt(0))
                .flatMap(group -> group.collectSortedList())
                .subscribe(System.out::println);
    }

}
