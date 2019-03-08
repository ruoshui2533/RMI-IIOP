javac -d . -classpath . HelloImpl.java
rmic -poa -iiop HelloImpl
javac -d . -classpath . HelloInterface.java HelloServer.java HelloClient.java
start orbd -ORBInitialPort 1060
java -classpath . -Djava.naming.factory.initial=com.sun.jndi.cosnaming.CNCtxFactory -Djava.naming.provider.url=iiop://localhost:1060 HelloServer
java -classpath . -Djava.naming.factory.initial=com.sun.jndi.cosnaming.CNCtxFactory -Djava.naming.provider.url=iiop://localhost:1060 HelloClient 
