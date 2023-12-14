package account.accountapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["member"])
class AccountApiApplication

fun main(args: Array<String>) {
	runApplication<AccountApiApplication>(*args)
}
