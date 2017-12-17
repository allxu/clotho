package priv.allxu.clotho

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ClothoApplication

fun main(args: Array<String>) {
    SpringApplication.run(ClothoApplication::class.java, *args)
}
