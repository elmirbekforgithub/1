package org.example;

import java.sql.*;

public class RelationMethodsNeedSQL implements MethodsWhichSQL {
    @Override
    public void addUser(String name, String last_name, int age, String country) {
        String SQL = "INSERT INTO pomxml(name,last_name,age,country) VALUES (?,?,?,?)";
        try (Connection connection = Connecetion123.connection(); PreparedStatement statement = connection.prepareStatement(SQL)) {
            statement.setString(1, name);
            statement.setString(2, last_name);
            statement.setInt(3, age);
            statement.setString(4, country);
            statement.executeUpdate();
            System.out.println("good");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void deleteUser(int id) {
        String SQL = "DELETE FROM pomxml where id = " + String.valueOf(id) + ";";
        try (Connection connection = Connecetion123.connection(); PreparedStatement statement = connection.prepareStatement(SQL)) {
            statement.executeUpdate();
            System.out.println("user delete");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public void getId(int id) {
        String Sql = "SELECT * FROM pomxml where id = "+String.valueOf(id)+";";
        try (Connection connection=Connecetion123.connection(); Statement statement= connection.createStatement(); ResultSet resultSet = statement.executeQuery(Sql)){
            while (resultSet.next()){
                System.out.println("id           : "+resultSet.getInt("id")+"\nname         : " +resultSet.getString("name")+"\nlast_name    : " +resultSet.getString("last_name")+"\nage          : " +resultSet.getInt("age")+"\ncountry      : " +resultSet.getString("country"));
            }

        }catch(SQLException sqlException){
            System.out.println(sqlException);
        }

    }
}
