package info.developia.prevengic

import info.developia.prevengic.mapper.ComposeMapper
import org.apache.ibatis.datasource.pooled.PooledDataSource
import org.apache.ibatis.mapping.Environment
import org.apache.ibatis.session.Configuration
import org.apache.ibatis.session.SqlSession
import org.apache.ibatis.session.SqlSessionFactory
import org.apache.ibatis.session.SqlSessionFactoryBuilder
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory

import javax.sql.DataSource

class PersistenceService {

    SqlSessionFactory sqlSessionFactory

    PersistenceService() {
        this.sqlSessionFactory = buildSqlSessionFactory()
    }

    public static SqlSessionFactory buildSqlSessionFactory() {
        DataSource dataSource = new PooledDataSource("org.postgresql.Driver", "jdbc:postgresql://localhost:5432/postgres", "admin", "password");
        Environment environment = new Environment("Development", new JdbcTransactionFactory(), dataSource);
        Configuration configuration = new Configuration(environment);
        configuration.addMapper(ComposeMapper);

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        return builder.build(configuration);
    }

    SqlSession getSqlSession() {
        return sqlSessionFactory.openSession()
    }
}
