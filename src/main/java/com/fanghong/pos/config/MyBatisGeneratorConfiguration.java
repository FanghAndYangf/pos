package com.fanghong.pos.config;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MyBatisGeneratorConfiguration {

    List<String> warnings = new ArrayList<String>();
    boolean overwrite = true;
    String genCfg = "/generatorConfig.xml";
    File configFile = new File(MyBatisGeneratorConfiguration.class.getResource(genCfg).getFile());
    ConfigurationParser cp = new ConfigurationParser(warnings);
    Configuration config = null;

    //config = cp.parseConfiguration(configFile);

    DefaultShellCallback callback = new DefaultShellCallback(overwrite);
    MyBatisGenerator myBatisGenerator = null;

    //myBatisGenerator = new MyBatisGeneratorConfiguration(config, callback, warnings);

    //myBatisGenerator.generate(null);

}
