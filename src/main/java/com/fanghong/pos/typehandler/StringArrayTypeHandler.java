package com.fanghong.pos.typehandler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.*;

@MappedTypes({String[].class})
@MappedJdbcTypes({JdbcType.VARCHAR})
public class StringArrayTypeHandler implements TypeHandler<String[]>{

    @Override
    public void setParameter(PreparedStatement ps, int i, String[] strings, JdbcType jdbcType) throws SQLException {
        if(strings == null){
            ps.setNull(i, Types.VARCHAR);
        }else{
            StringBuffer result = new StringBuffer();
            for(String vlaue : strings){
                result.append(vlaue).append(",");
            }
            result.deleteCharAt(result.length()-1);
            ps.setString(i, result.toString());
        }
    }

    @Override
    public String[] getResult(ResultSet resultSet, String s) throws SQLException {
        String columnValue = resultSet.getString(s);
        return this.getStringArray(columnValue);
    }

    @Override
    public String[] getResult(ResultSet resultSet, int i) throws SQLException {
        String columnValue = resultSet.getString(i);
        return this.getStringArray(columnValue);
    }

    @Override
    public String[] getResult(CallableStatement callableStatement, int i) throws SQLException {
        String columnValue = callableStatement.getString(i);
        return this.getStringArray(columnValue);
    }

    private String[] getStringArray(String columnValue) {
        if (columnValue == null)
            return null;
        return columnValue.split(",");
    }
}
