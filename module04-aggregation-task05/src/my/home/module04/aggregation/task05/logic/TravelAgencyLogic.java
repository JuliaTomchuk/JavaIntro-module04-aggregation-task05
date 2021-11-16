package my.home.module04.aggregation.task05.logic;

import java.util.ArrayList;
import java.util.List;

import my.home.module04.aggregation.task05.entity.Destination;
import my.home.module04.aggregation.task05.entity.TravelAgency;
import my.home.module04.aggregation.task05.entity.TypeOfTrip;
import my.home.module04.aggregation.task05.entity.Voucher;

public class TravelAgencyLogic {

	public List<Voucher> findVoucherByDestination(Destination destination, TravelAgency agency) {

		List<Voucher> vouchers = agency.getVouchers();
		List<Voucher> result = new ArrayList<>();

		for (int i = 0; i < vouchers.size(); i++) {

			if (vouchers.get(i).getDestination().equals(destination)) {
				result.add(vouchers.get(i));
			}

		}

		return result;
	}

	public List<Voucher> findVoucherByTypeOfTrip(TypeOfTrip type, TravelAgency agency) {

		List<Voucher> vouchers = agency.getVouchers();
		List<Voucher> result = new ArrayList<>();
		for (int i = 0; i < vouchers.size(); i++) {

			if (vouchers.get(i).getTypeOfTrip().equals(type)) {
				result.add(vouchers.get(i));
			}

		}

		return result;

	}
}
