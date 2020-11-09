web:    java $JAVA_OPTS -jar target/heroku-demo-0.0.1-SNAPSHOT.jar -Dserver.port=$PORT
web: bundle exec rails server -p $PORT
worker: bundle exec sidekiq
