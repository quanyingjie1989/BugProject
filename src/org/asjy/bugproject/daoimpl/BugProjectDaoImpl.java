package org.asjy.bugproject.daoimpl;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import org.asjy.bugproject.BugProject;
import org.asjy.bugproject.dao.BugProjectDao;
import org.asjy.util.JDBCUtil;

import com.mysql.jdbc.ResultSet;

public class BugProjectDaoImpl implements BugProjectDao{

	@Override
	public List<BugProject> getBugProject(BugProject bugProject) {
		List<BugProject> bugProjects=new ArrayList<>();
		java.sql.Connection connection=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		
		try {
			connection=JDBCUtil.getMySelfConnection();
			String sql="select pro_id,pro_name,start_time,end_time,header from project";
			String condition="";
			
			if(bugProject.getPro_name() != null && !"".equals(bugProject.getPro_name())) {
				condition ="where pro_name like '%"+bugProject.getPro_name()+"%'";
			}
			sql += condition;
			//sql +="limit"+(bugProject.getPageSize()*(bugProject.getPageNum()-1))+","+bugProject.getPageSize();
			System.out.println(sql);
			
			pstm=connection.prepareStatement(sql);
			rs=(ResultSet) pstm.executeQuery();
			while(rs.next()) {
				BugProject bProject=new BugProject(rs.getInt("pro_id"), rs.getString("pro_name"), rs.getDate("start_time"), rs.getDate("end_time"), rs.getInt("header"), rs.getInt("pageSize"), rs.getInt("pageNum"));
				bugProjects.add(bProject);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.myselfClose(connection, pstm, rs);
		}
		
		return bugProjects;
	}

}
