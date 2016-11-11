# Eclipse OSGi Framework
============================================================================

# 控制台
1.进入Equinox的控制台
  
    java –jar org.eclipse.osgi_3.7.0.v20110613.jar -console


2.Bundle-Name是给用户读的，而Bundle-SymbolicName是给OSGi框架读的，让OSGi框架能够唯一标识一个bundle。

3.打包 ：
    
    mvn clean install pax:provision