REPOSITORY=/home/ec2-user/app
cd $REPOSITORY

APP_NAME=curriculum #1
JAR_NAME=$(ls $REPOSITORY/build/libs/ | grep 'samyang_daily-0.0.1-SNAPSHOT.jar' | tail -n 1)
JAR_PATH=$REPOSITORY/build/libs/$JAR_NAME

CURRENT_PID=$(pgrep -f $APP_NAME)

if [ -z $CURRENT_PID ] #2
then
  echo "> 현재 구동중인 애플리케이션이 없으므로 종료하지 않습니다."
else
  echo "> kill -15 $CURRENT_PID"
  sudo kill -15 $CURRENT_PID
  sleep 5
fi

echo "> $JAR_PATH 배포" #3
nohup java -jar /home/ec2-user/app/build/libs/samyang_daily-0.0.1-SNAPSHOT.jar --spring.config.location=file:/home/ec2-user/properties/application.yml > /home/ec2-user/nohup.out &
sudo sudo iptables -A PREROUTING -t nat -i eth0 -p tcp --dport 80 -j REDIRECT --to-port 8080