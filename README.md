# springboot-gwt

    <profiles>
        <profile>
            <id>gwt</id>
            <build>
                <plugins>
                    <plugin>
                        <groupId>org.codehaus.mojo</groupId>
                        <artifactId>gwt-maven-plugin</artifactId>
                        <version>2.8.0</version>
                        <configuration>
                            <productionMode>true</productionMode>
                            <warSourceDirectory>src/main/webapp</warSourceDirectory>
                            <webappDirectory>src/main/resources/static</webappDirectory>
                            <module>cn.liusf.gwt.ui.GwtDemo</module>
                        </configuration>
                    </plugin>
                </plugins>
            </build>
        </profile>
    </profiles>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
