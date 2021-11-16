package my.home.module04.aggregation.task05.view;

import java.util.List;

import my.home.module04.aggregation.task05.entity.Voucher;

public class View {

	public void print(List<Voucher> vouchers, String message) {

		System.out.println(message);

		for (Voucher v : vouchers) {
			System.out.println(v);
		}
	}

	public void print(Voucher voucher) {
		System.out.println(voucher);
	}

}
