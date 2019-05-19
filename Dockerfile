FROM hseeberger/scala-sbt
WORKDIR /opt/ScalaRestServer
ADD . /opt/ScalaRestServer
CMD ["sbt", "clean", "package", "run"]
