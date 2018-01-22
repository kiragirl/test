package test;

/**
 * 测试类Test
 * 
 * Email:530025983@qq.com
 * 
 * @author MONKEY.D.MENG 2011-03-15
 * 
 */
public class Test
{
	public static void main(String[] args)
	{
		// 仓库对象
		Storage storage = new Storage();

		// 生产者对象
		Producer p1 = new Producer(storage);
		Producer p2 = new Producer(storage);
		Producer p3 = new Producer(storage);
		Producer p4 = new Producer(storage);
		Producer p5 = new Producer(storage);
		Producer p6 = new Producer(storage);
		Producer p7 = new Producer(storage);

		// 消费者对象
		Consumer c1 = new Consumer(storage);
		Consumer c2 = new Consumer(storage);
		Consumer c3 = new Consumer(storage);

		// 设置生产者产品生产数量
		p1.setNum(10);
		p2.setNum(10);
		p3.setNum(10);
		p4.setNum(10);
		p5.setNum(10);
		p6.setNum(10);
		p7.setNum(80);

		// 设置消费者产品消费数量
		c1.setNum(50);
		c2.setNum(20);
		c3.setNum(30);

		// 线程开始执行
		c1.start();
		c2.start();
		c3.start();
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		p6.start();
		p7.start();
	}
}
/*【要消费的产品数量】:50	【库存量】:0	暂时不能执行生产任务!
【要消费的产品数量】:30	【库存量】:0	暂时不能执行生产任务!
【要消费的产品数量】:20	【库存量】:0	暂时不能执行生产任务!
【已经生产产品数】:10	【现仓储量为】:10
【要消费的产品数量】:20	【库存量】:10	暂时不能执行生产任务!
【要消费的产品数量】:30	【库存量】:10	暂时不能执行生产任务!
【要消费的产品数量】:50	【库存量】:10	暂时不能执行生产任务!
【已经生产产品数】:10	【现仓储量为】:20
【要消费的产品数量】:50	【库存量】:20	暂时不能执行生产任务!
【要消费的产品数量】:30	【库存量】:20	暂时不能执行生产任务!
【已经消费产品数】:20	【现仓储量为】:0
【已经生产产品数】:10	【现仓储量为】:10
【已经生产产品数】:10	【现仓储量为】:20
【已经生产产品数】:80	【现仓储量为】:100
【要生产的产品数量】:10	【库存量】:100	暂时不能执行生产任务!
【已经消费产品数】:30	【现仓储量为】:70
【已经消费产品数】:50	【现仓储量为】:20
【已经生产产品数】:10	【现仓储量为】:30
【已经生产产品数】:10	【现仓储量为】:40*/