package com.yzx.cloudproviderpayment8001;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @ClassName MybatisPlusGenerator
 * @Description TODO
 * @Author jason
 * @Date 19/7/1
 */
public class MybatisPlusGenerator {

    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotEmpty(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

    public static void main(String[] args) {

        //数据库链接地址
        String dbUrl = "jdbc:mysql://127.0.0.1:3306/cloud2020";
        String dbUserName = "root";
        String dbPassword = "123456";
        //数据库前缀
        String dbPrefix = "yzx_";
        //公共文件项目名称
        String commpath = "cloudcommon";
        //当前文件项目名称
        String downpath = "cloudproviderpayment8001";

        String projectPath = System.getProperty("user.dir") + "/cloud-provider-payment8001";
        String commonPath = System.getProperty("user.dir") + "/cloud-common";
        // 全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setAuthor("mastermind") // 作者
                .setOutputDir(projectPath + "/src/main/java") // 生成路径
                .setFileOverride(false)  // 重新生成覆盖原有文件
                .setOpen(false)
                .setIdType(IdType.ID_WORKER)
                .setBaseResultMap(true)
                .setBaseColumnList(true)
                .setServiceName("%sService");

        // 数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL) // 设置数据库类型
                .setDriverName("com.mysql.jdbc.Driver")
                .setUrl(dbUrl)
                .setUsername(dbUserName)
                .setPassword(dbPassword)
                .setTypeConvert(new MySqlTypeConvert() {
                    @Override
                    public DbColumnType processTypeConvert(GlobalConfig globalConfig, String fieldType) {
                        if (fieldType.toLowerCase().contains("datetime")) {
                            return DbColumnType.DATE;
                        }
                        return (DbColumnType) super.processTypeConvert(globalConfig, fieldType);
                    }
                });

        // 策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                .setNaming(NamingStrategy.underline_to_camel) // 数据库表映射到实体的命名策略
                .setColumnNaming(NamingStrategy.underline_to_camel)
                .setTablePrefix(dbPrefix) // 指定表的前缀
                .setInclude(scanner("表名"))
                .setEntityLombokModel(true)
                .setRestControllerStyle(true)
                .setControllerMappingHyphenStyle(true);

        // 包名策略配置
        PackageConfig packageConfig = new PackageConfig();
        Map<String, String> map = new HashMap<String, String>();
        map.put("entity_path", commonPath + "/src/main/java/com/yzx/" + commpath + "/entity/" + downpath + "");
        map.put("service_path", projectPath + "/src/main/java/com/yzx/" + downpath + "/service");
        map.put("service_impl_path", projectPath + "/src/main/java/com/yzx/" + downpath + "/service/impl");
        map.put("mapper_path", projectPath + "/src/main/java/com/yzx/" + downpath + "/mapper");
        map.put("xml_path", projectPath + "/src/main/resources/mapper");
        packageConfig
                .setEntity("com.yzx." + commpath + ".entity." + downpath + "")
                .setService("com.yzx." + downpath + ".service")
                .setServiceImpl("com.yzx." + downpath + ".service.impl")
                .setMapper("com.yzx." + downpath + ".mapper")
                .setParent("")
                .setPathInfo(map);

        // 整合配置
        AutoGenerator autoGenerator = new AutoGenerator();
        autoGenerator.setGlobalConfig(globalConfig)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(packageConfig);

//        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };

        // 如果模板引擎是 velocity
//        String templatePath = "/templates/mapper.xml.vm";
//        // 自定义输出配置
//        List<FileOutConfig> focList = new ArrayList<>();
//        // 自定义配置会被优先输出
//        focList.add(new FileOutConfig(templatePath) {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
//                return projectPath + "/src/main/resources/mapper/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
//            }
//        });
//        cfg.setFileOutConfigList(focList);
        //只创建mapper,mapper.xml,entity
//        cfg.setFileCreate(new IFileCreate() {
////            @Override
////            public boolean isCreate(ConfigBuilder configBuilder, FileType fileType, String filePath) {
////                if (FileType.ENTITY==fileType || FileType.MAPPER==fileType || FileType.OTHER==fileType){
////                    return true;
////                }
////                return false;
////            }
////        });
        autoGenerator.setCfg(cfg);
        // 执行
        autoGenerator.execute();
    }
}
