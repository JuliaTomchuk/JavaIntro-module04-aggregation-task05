package my.home.module04.aggregation.task05.entity;

import java.util.Comparator;

public class VoucherDestinationComparator implements Comparator<Voucher> {

	@Override
	public int compare(Voucher voucherFirst, Voucher voucherSecond) {

		return voucherFirst.getDestination().compareTo(voucherSecond.getDestination());
	}

}