docker build -t smi-rest .

docker tag smi-rest lampa/smi-rest:0.0.1
docker push lampa/smi-rest