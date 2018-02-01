# springboot-gwt
## 将gwt war 文件输出为springboot 静态资源文件

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

  
