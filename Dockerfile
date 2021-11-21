FROM docker.io/zevrant/zevrant-ubuntu-base:latest

EXPOSE 9008

RUN mkdir -p /usr/local/microservices/zevrant-home-services/zevrant-acra-backend/

RUN mkdir -p /var/log/zevrant-home-services/zevrant-acra-backend\
  && mkdir -p /storage/keys

RUN useradd -m -d /usr/local/microservices/zevrant-home-services/zevrant-acra-backend/ -G developers  zevrant-acra-backend

RUN chown -R zevrant-acra-backend:developers /var/log/zevrant-home-services/zevrant-acra-backend /usr/local/microservices/zevrant-home-services/zevrant-acra-backend /storage/keys

USER zevrant-acra-backend

COPY build/libs/zevrant-acra-backend-*.jar /usr/local/microservices/zevrant-home-services/zevrant-acra-backend/zevrant-acra-backend.jar

RUN mkdir ~/.aws; echo "[default]" > ~/.aws/config; echo "region = us-east-1" >> ~/.aws/config; echo "output = json" >> ~/.aws/config

RUN curl https://raw.githubusercontent.com/zevrant/zevrant-services-pipeline/master/bash/zevrant-services-start.sh > /usr/local/microservices/zevrant-home-services/zevrant-acra-backend/startup.sh \
  && curl https://raw.githubusercontent.com/zevrant/zevrant-services-pipeline/master/bash/openssl.conf > ~/openssl.conf

CMD export ROLE_ARN="arn:aws:iam::725235728275:role/SecretsOnlyServiceRole" \
 && password=`date +%s | sha256sum | base64 | head -c 32` \
 && bash ~/startup.sh zevrant-acra-backend $password \
 && java -jar -Dspring.profiles.active=$ENVIRONMENT -Dpassword=$password /usr/local/microservices/zevrant-home-services/zevrant-acra-backend/zevrant-acra-backend.jar

