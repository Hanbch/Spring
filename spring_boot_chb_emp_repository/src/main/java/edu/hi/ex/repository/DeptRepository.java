package edu.hi.ex.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.hi.ex.vo.DeptVO;
import edu.hi.ex.vo.EmpVO;

//persistence = 영속영역 = Repository = Dao 

@Repository
public class DeptRepository {

   @Autowired
   private DataSource dataSource;
   
//   public EmpRepository() {
//      try {
//         Context context = new InitialContext();
//         dataSource = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
//      } catch (Exception e) {
//         e.printStackTrace();
//      }
//   }
   
   public ArrayList<DeptVO> selectList(){
      ArrayList<DeptVO> deptList = new ArrayList<DeptVO>();
      
      Connection connection = null;
      PreparedStatement preparedStatement = null;
      ResultSet rs = null;
      
      try {
         String query = "select * from dept";
         
         connection = dataSource.getConnection();
         preparedStatement = connection.prepareStatement(query);
         rs = preparedStatement.executeQuery();
         
         while(rs.next()) {
            
        	 int deptno = rs.getInt("deptno");
            String dname = rs.getString("dname");
            String loc = rs.getString("loc");
            
            DeptVO dept = new DeptVO(deptno,dname,loc);
            
            deptList.add(dept);
            
         }
         
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if(rs != null) rs.close();
            if(preparedStatement != null) preparedStatement.close();
            if(connection != null) connection.close();
         } catch (Exception e2) {
            e2.printStackTrace();
         }
      }   
      return deptList;
   }   

}