package com.fanghong.pos.BeanConfig;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;

import javax.sql.DataSource;

public class LiquibaseConfiguration {

    public SpringLiquibase userLiquibase(DataSource dataSource){
        SpringLiquibase liquibase = new SpringLiquibase();
        // 全局master文件设置
        liquibase.setChangeLog("classpath:liquibase/master.xml");
        liquibase.setDataSource(dataSource);
        liquibase.setShouldRun(true);
        liquibase.setResourceLoader(new DefaultResourceLoader());
        // 覆盖Liquibase changelog表名
        //liquibase.setDatabaseChangeLogTable("user_changelog_table");
        //liquibase.setDatabaseChangeLogLockTable("user_changelog_lock_table");
        return liquibase;
    };
}
