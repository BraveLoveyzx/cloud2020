#基础镜像
FROM registry.cn-shanghai.aliyuncs.com/ecinx-cloud/jdk1.8:latest
#构建镜像时参数
ARG JAR_FILE
#增加项目文件 重命名
ADD ${JAR_FILE} app.jar
#指定容器要打开的端口
EXPOSE 8080
#指定镜像的默认入口命令，该入口命令会在启动容器时作为根命令执行，所有传入值作为该命令的参数。
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]