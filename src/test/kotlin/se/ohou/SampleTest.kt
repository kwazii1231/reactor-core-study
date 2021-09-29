package se.ohou

import org.junit.jupiter.api.Test
import reactor.core.publisher.Mono
import reactor.test.StepVerifier

class SampleTest {

    @Test fun sampleMonoTest(){
        val myNameMono : Mono<String> = Mono.fromSupplier{
            "Jinhan"
        }

        val mappedMono = myNameMono
            .map { it.uppercase() }

        StepVerifier.create(mappedMono)
            .expectSubscription()
            .expectNext("JINHAN")
            .expectComplete()
            .verify()

    }
}
