# Eternity
Anonymous thread-based online social platform (I took inspiration from 2ch.hk)

![Project stage: Development][project-stage-badge: Development]

[project-stage-badge: Development]: https://img.shields.io/badge/Project%20Stage-Development-yellowgreen.svg

## Table of Contents
* [How to run](#how-to-run)
* [Endpoints](#endpoints)
* [Database entities](#database-entities)
* [Technologies and Features used](#technologies-and-features-used)

## How to run
```bash
./mvnw clean                      # clean /target (if it's not the first run)
./mvnw package -Dmaven.test.skip  # build .jar (and skip testing)
docker compose up                 # run postgres db in container
java -jar target/*.jar            # run application (in the near future it will be containerized)
```

## Endpoints
| URL                 | Method |                             Description                             |
|:--------------------|:------:|:-------------------------------------------------------------------:|
| `/`                 | `GET`  |    Home page with news, popular threads and menu navigation bar     |
| `/readme`           | `GET`  |            Readme page with some info about the project             |
| `/thread/{id}`      | `GET`  | Thread page with chat, input textarea and navigation bar at the top |
| `/thread/{id}/info` | `GET`  |       Info page with statistical data about the opened thread       |
| `/api/v1/messages`  | `POST` |                API endpoint for posting new messages                |

## Database entities
### Messages (`messages`)
| Name        | Type           |                      Description                      |
|-------------|----------------|:-----------------------------------------------------:|
| `id`        | `bigint PK AI` |                      primary key                      |
| `text`      | `varchar(800)` |         contains text content of the message          |
| `thread_id` | `bigint FK`    |                      foreign key                      |
| `timestamp` | `timestamp`    | contains local datetime stamp when message was posted |

### News Topics (`news_topics`)
| Name          | Type            |                        Description                        |
|---------------|-----------------|:---------------------------------------------------------:|
| `id`          | `bigint PK AI`  |                        primary key                        |
| `title`       | `varchar(255)`  |           contains text title of the news post            |
| `description` | `varchar(2500)` |        contains text description of the news post         |
| `timestamp`   | `timestamp`     | contains local datetime stamp when the news post was made |

### Thread Topics (`thread_topics`)
| Name          | Type           |               Description               |
|---------------|----------------|:---------------------------------------:|
| `id`          | `bigint PK AI` |               primary key               |
| `title`       | `varchar(255)` |    contains text title of the thread    |
| `description` | `varchar(255)` | contains text description of the thread |

## Technologies and Features used

![java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-%23005C0F.svg?style=for-the-badge&logo=Thymeleaf&logoColor=white)
![spring](https://img.shields.io/badge/spring%20-%236DB33F.svg?&style=for-the-badge&logo=spring&logoColor=white)
![Spring Boot](https://img.shields.io/static/v1?style=for-the-badge&message=Spring+Boot&color=6DB33F&logo=Spring+Boot&logoColor=FFFFFF&label=)
![Spring Data](https://img.shields.io/static/v1?style=for-the-badge&message=Spring+Data&color=6DB33F&logo=Spring+Data&logoColor=FFFFFF&label=)
![maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven)
![postgres](https://img.shields.io/badge/postgres-%23316192.svg?&style=for-the-badge&logo=postgresql&logoColor=white)
![docker](https://img.shields.io/badge/docker-%232496ED.svg?&style=for-the-badge&logo=docker&logoColor=white)
![postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=Postman&logoColor=white)

* Spring
    * Spring Boot 2.7.1
    * Spring Data JPA
    * Spring Boot Starter Validation
    * Spring Boot Starter Web
* PostgreSQL 14
* Lombok
* Thymeleaf
* Vanilla HTML/CSS/JS
* Docker
    * docker-compose (PostgreSQL14 + Spring Boot)
