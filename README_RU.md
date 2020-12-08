**Что это такое?**

Smi Rest - сервис для получения данных GPU в удобном формате и сборе статистики.

**Как установить?**

1. Для Windows и Linux нужно установить драйвер nvidia https://www.nvidia.com/Download/index.aspx
1. Для использования без контейнеризации установить Java 11 https://adoptopenjdk.net/
1. Для использования с контейнеризацией установить docker, docker-compose
1. Для использования в Docker нужно установить NVIDIA Container Toolkit https://docs.nvidia.com/datacenter/cloud-native/container-toolkit/install-guide.html#docker

**Без Докера**

1. Собрать из исходников, либо загрузить последний релиз 
1. Запустить java -jar smirest.latest.jar

**С докером**

1. Загрузить файл docker-compose.yml
1. Запустить docker-compose -d up

**REST API**

http://localhost:8169/v1