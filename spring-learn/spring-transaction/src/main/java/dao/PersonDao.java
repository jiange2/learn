package dao;

import entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.ConnectionHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import javax.sql.DataSource;
import java.sql.Connection;

@Repository
public class PersonDao {

    @Autowired
    private DataSource dataSource;

    private Person search(Integer id){
        
    }

    private Connection getConnection(){
        ConnectionHolder connectionHolder = (ConnectionHolder) TransactionSynchronizationManager.getResource(dataSource);
        assert connectionHolder != null;
        return connectionHolder.getConnection();
    }
}
