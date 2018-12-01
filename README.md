# szjug-spring-boot-examples

some Spring Boot Examples collected together

## Data Access Level

Too many choices for Database access

1. JDBC (following Java Oracle tutorials)
2. Spring JdbcTemplate
3. Spring Hibernate
4. Spring JPA
5. Spring Data Repositories (over JPA with Hibernate)
6. Spring Data JDBC
7. MyBatis https://github.com/mybatis/spring-boot-starter 

## Communication and Web

Actually here number of choices may go down, as web now is implemented in pure JavaScipt framework that take care of templating (Angular, Vue.js).
So on Server side there is just JSON Web Services


3. Socket
4. Netty
1. Spring MVC
2. Spring WebFlux (over netty)
5. Spring Data Rest - this has been hope/promise to automatically generate JSON webservices for existing repositories, but unfortunately trying this always bring disappoinments.
