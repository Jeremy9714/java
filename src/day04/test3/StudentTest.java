package day04.test3;

public class StudentTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			Student s = new Student();
			s.regis(-1);
			System.out.println(s);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			System.out.println(e.getMessage());
		}
	}

}
class Student {
	private int id;
	
	//由于自定义的异常类继承于Exception,所以可能存在编译时
	//异常，需要显式地处理异常(try-catch或throws异常类型)
	public void regis(int id) throws Exception{
		if(id>0) {
			this.id=id;
		}else {
			//自定义异常类型
			throw new MyException("不能输入负数");
		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
}