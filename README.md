# springboot-gwt
-- gwt与springboot结合 以jsp为模板引擎
## 将gwt war 文件输出为springboot 静态资源文件 配置如下：

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

  
