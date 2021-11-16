package my.home.module04.aggregation.task05.entity;

import java.util.Comparator;

public class VoucherTransportComparator implements Comparator<Voucher> {

	@Override
	public int compare(Voucher o1, Voucher o2) {

		return o1.getTransport().compareTo(o2.getTransport());
	}

}
