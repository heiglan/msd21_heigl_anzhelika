# Exercise 6
## Maven Site Documentation

### What is necessary to generate a Maven Site Documentation?
Maven Site creates report of current project documentation. It uses data of source code and comments
(JavaDoc, Self-created Maven Site documentations, JUnit Test results, extended pom.xml information etc.)

To generate documentation use **mvn site**



### Which aspects, configurations, and information are necessary for configuration of site.xml and pom.xml?

#### pom.xml


* developers information
* reporting

            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-site-plugin</artifactId>
                <version>3.7.1</version>
            </plugin>

* generate information about test coverage

            <plugin>
                <groupId>org.jacoco</groupId>
                <artifactId>jacoco-maven-plugin</artifactId>
                <version>0.8.6</version>
                <executions>
                    <execution>
                        <id>prepare-agent</id>
                        <goals>
                            <goal>prepare-agent</goal>
                        </goals>
                    </execution>
                    <execution>
                        <id>report</id>
                        <phase>test</phase>
                        <goals>
                            <goal>report</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>


* dependencies


    <dependencies>
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-api</artifactId>
            <version>2.17.2</version>
        </dependency>
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-core</artifactId>
            <version>2.17.2</version>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>5.8.2</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>5.8.2</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-params</artifactId>
            <version>5.8.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

* reporting
  * maven site for documentation


            <plugin>
                <artifactId>maven-project-info-reports-plugin</artifactId>
                <version>3.3.0</version>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-site-plugin</artifactId>
                <version>3.7.1</version>
            </plugin>

  * Java Doc within Maven Site Documentation


            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-javadoc-plugin</artifactId>
                <version>3.4.0</version>
                <configuration>
                    <doclint>-html,-syntax,-accessibility,-missing</doclint>
                    <failOnError>false</failOnError>
                    <quiet>true</quiet>
                </configuration>
            </plugin>


* Test Coverage from JaCoCo Plugin integration in Maven Site Documentation


            <plugin>
                <groupId>org.jacoco</groupId>
                <artifactId>jacoco-maven-plugin</artifactId>
                <configuration>
                    <dataFile>${jacoco.execution.data.file}</dataFile>
                </configuration>
                <reportSets>
                    <reportSet>
                        <reports>
                            <report>report</report>
                        </reports>
                    </reportSet>
                </reportSets>
            </plugin>
        </plugins>
    </reporting>


#### site.xml

The site.xml file is used to describe the structure of the site.


