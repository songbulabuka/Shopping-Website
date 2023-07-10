package jspservlet.dao;

import java.util.ArrayList;

import jspservlet.vo.Robot;

public interface RobotDAO {
	public ArrayList<Robot> queryByRobotNature(String i ,Robot robot) throws Exception;
}
