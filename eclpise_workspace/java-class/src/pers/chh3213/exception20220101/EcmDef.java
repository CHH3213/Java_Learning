package pers.chh3213.exception20220101;
import java.util.*;
public class EcmDef {
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[0]);
			
			int result = ecm(i,j);
			
			System.out.println(result);
		} catch (NumberFormatException e) {
			System.out.println("数据类型不一致");
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("缺少命令行参数");
		}catch (ArithmeticException e){
			System.out.println("除0");
		}catch (EcDef e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int ecm(int i, int j) throws EcDef{
		if(i < 0 || j < 0){
			throw new EcDef("分子或分母为负数了！");
		}
		return i / j;
	}
}
class EcDef extends Exception {

	static final long serialVersionUID = -33875164229948L;

	public EcDef() {
		
	}

	public EcDef(String msg) {
		super(msg);
	}
}


