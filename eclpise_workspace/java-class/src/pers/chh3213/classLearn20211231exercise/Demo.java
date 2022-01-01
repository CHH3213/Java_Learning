package pers.chh3213.classLearn20211231exercise;

interface Inter {
	void show(int a, int b);

	void func();
}

class Demo {
	public static void main(String[] args) {
		// 补足代码；调用两个函数，要求用匿名内部类
		Inter in = new Inter() {
			public void show(int a, int b) {

			}

			public void func() {

			}
		};

		in.show(4, 5);
		in.func();

	}
}

