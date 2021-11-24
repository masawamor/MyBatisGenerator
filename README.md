# MyBatis Generatorによるコード自動生成

あらかじめDB生成、テーブル生成しておく。今回はMariaDBを使用。

## pom.xml
```
<dependency>
	<groupId>org.mybatis</groupId>
	<artifactId>mybatis</artifactId>
	<version>3.5.0</version>
</dependency>
<dependency>
	<groupId>org.mybatis</groupId>
	<artifactId>mybatis-spring</artifactId>
	<version>2.0.0</version>
</dependency>

 <plugin>
    <groupId>org.mybatis.generator</groupId>
       <artifactId>mybatis-generator-maven-plugin</artifactId>
      <version>1.3.0</version>
</plugin>
```

## generatorConfig.xml
```
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE generatorConfiguration PUBLIC "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN" "http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd" >
<generatorConfiguration >

  <classPathEntry location="C:\mariadb-java-client-2.5.2.jar"/>

  <context id="context1" >

    <jdbcConnection driverClass="org.mariadb.jdbc.Driver" connectionURL="jdbc:mariadb://localhost:3306/library" userId="root" password="Masawa5005" />
    
    <javaModelGenerator targetPackage="com.example.demo" targetProject=".\src\main\java\" />
    
    <sqlMapGenerator targetPackage="com.example.demo" targetProject=".\src\main\java\" />
    
    <javaClientGenerator targetPackage="com.example.demo" targetProject=".\src\main\java\" type="XMLMAPPER" />
    
    <table schema="library" tableName="%" ></table>

  </context>
</generatorConfiguration>
```

メニュー->実行->実行構成...  
規定ディレクトリに現在のプロジェクトを選択する。
「ゴール」欄には「mybatis-generator:generate」と入力し、実行ボタンを選択

プロジェクトを右クリック->mavenを右クリック->プロジェクトの更新を選択すると、生成されたコードが出現する。