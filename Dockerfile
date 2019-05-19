FROM hseeberger/scala-sbt
WORKDIR /opt/ScalaRestServer
ADD . /opt/ScalaRestServer
EXPOSE 8080
CMD ["sbt", "clean", "package", "run"]
