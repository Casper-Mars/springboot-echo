FROM registry.cn-hangzhou.aliyuncs.com/casper/jdk1.8:1.0

ADD target/demo.jar /

ENTRYPOINT ["java","-jar","-Xms20M","-Xmx20M","/demo.jar"]


