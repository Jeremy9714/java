package day05.myproject.services;

import day05.myproject.domain.*;

/**
 * @description 关于开发团队成员的管理：添加、删除
 * @author Chenyang
 *
 */
public class TeamService {

	private static int counter = 1;// 给memberId赋值
	private final int MAX_SIZE = 5;// 团队最大人数
	private Programmer[] team;// 团队中各成员对象
	private int total;// 团队当前人数

	public TeamService() {
		this.team = new Programmer[MAX_SIZE];
	}

	// 获取团队
	public Programmer[] getTeam() {
		Programmer[] res = new Programmer[total];
		int count = 0;
		for (Programmer p : team) {
			res[count++] = p;
		}
		return res;
	}

	// 添加团队成员
	public void addMember(Employee e) throws TeamException {
		// 成员已满，无法添加
		if (total >= MAX_SIZE) {
			throw new TeamException("成员已满，无法添加");
		}
		// 该成员不是开发成员，无法添加
		if (!(e instanceof Programmer)) {
			throw new TeamException("该成员不是开发成员，无法添加");
		}
		Programmer p = (Programmer) e;
		// 该员工已在本开发团队中
		if (isExist(p)) {
			throw new TeamException("该员工已在本开发团队中");
		}
		// 该员工已是某团队成员
		if ("BUSY".equals(p.getStatus().getName())) {
			throw new TeamException("该员工已是某团队成员");
			// 该员工正在休假，无法添加
		} else if ("VACATION".equals(p.getStatus().getName())) {
			throw new TeamException("该员工正在休假，无法添加");
		}
		// 团队中至多只能有一名架构师
		// 团队中至多只能有两名设计师
		// 团队中至多只能由三名程序员
		int numOfPro = 0, numOfDes = 0, numOfArc = 0;
		for (Programmer member : team) {
			if (member instanceof Architect) {
				numOfArc++;
			} else if (member instanceof Designer) {
				numOfDes++;
			} else if (member instanceof Programmer) {
				numOfPro++;
			}
		}
		if(p instanceof Architect) {
			if(numOfArc>=1) {
				throw new TeamException("团队中至多只能有一名架构师");
			}
		}else if (p instanceof Designer) {
			if(numOfDes>=2) {
				throw new TeamException("团队中至多只能有两名设计师");
			}
		}else if(p instanceof Programmer) {
			if(numOfPro>=3) {
				throw new TeamException("团队中至多只能有三名程序员");	
			}
		}
		
		//添加该成员到团队
		team[total++] = p;
		p.setMemberId(counter++);
		p.setStatus(Status.BUSY);
	}

	// 判断员工是否是该团队的成员
	private boolean isExist(Employee e) {
		for (Programmer p : team) {
			if (p.getId() == e.getId())
				return true;
		}
		return false;
	}

	// 移除团队成员
	public void removeMember(int memberId) throws TeamException {
		int i = 0;
		for(;i<total;++i) {
			if(team[i].getMemberId()==memberId) {
				team[i].setStatus(Status.FREE);
				break;
			}
		}
		if(i==total) {
			throw new TeamException("找不到指定memberId的员工，删除失败");
		}

		for(int j=i;j<total-1;++j) {
			team[j] = team[j+1];
		}
		team[--total] = null;
	}
	
}
