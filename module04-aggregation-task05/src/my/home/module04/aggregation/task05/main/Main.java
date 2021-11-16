package my.home.module04.aggregation.task05.main;

import java.util.Collections;
import java.util.List;

import my.home.module04.aggregation.task05.entity.Destination;

import my.home.module04.aggregation.task05.entity.Transport;
import my.home.module04.aggregation.task05.entity.TravelAgency;
import my.home.module04.aggregation.task05.entity.TypeOfFood;
import my.home.module04.aggregation.task05.entity.TypeOfTrip;
import my.home.module04.aggregation.task05.entity.Voucher;
import my.home.module04.aggregation.task05.entity.VoucherDestinationComparator;
import my.home.module04.aggregation.task05.entity.VoucherTransportComparator;
import my.home.module04.aggregation.task05.logic.TravelAgencyLogic;
import my.home.module04.aggregation.task05.view.View;

/*Туристические путёвки. 
 * Сформировать набор предложений клиенту по выбору туристической путёвки различного типа.
 * (отдых, экскурсии,лечение, шоппинг, круиз и тд) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней.
 * Реализовать выбор и сортировку путёвок*/

public class Main {

	public static void main(String[] args) {

		TravelAgency travelAgency = new TravelAgency();

		travelAgency.addVoucher(
				new Voucher(TypeOfTrip.CRUISE, Transport.SHIP, 14, TypeOfFood.ALL_INCLUSIVE, Destination.ITALY));
		travelAgency.addVoucher(
				new Voucher(TypeOfTrip.BEACH, Transport.CAR, 7, TypeOfFood.ALL_INCLUSIVE, Destination.UKRAINE));
		travelAgency.addVoucher(
				new Voucher(TypeOfTrip.EXCURSION, Transport.TRAIN, 10, TypeOfFood.BREAKFAST_ONLY, Destination.BELARUS));
		travelAgency.addVoucher(
				new Voucher(TypeOfTrip.SHOPPING, Transport.AIRCRAFT, 14, TypeOfFood.HALF_BOARD, Destination.ITALY));
		travelAgency.addVoucher(
				new Voucher(TypeOfTrip.MEDICAL, Transport.CAR, 7, TypeOfFood.ALL_INCLUSIVE, Destination.GREECE));
		travelAgency.addVoucher(
				new Voucher(TypeOfTrip.BEACH, Transport.AIRCRAFT, 7, TypeOfFood.ALL_INCLUSIVE, Destination.TURKEY));
		travelAgency.addVoucher(
				new Voucher(TypeOfTrip.EXCURSION, Transport.BIKE, 21, TypeOfFood.BREAKFAST_ONLY, Destination.NORWAY));
		travelAgency
				.addVoucher(new Voucher(TypeOfTrip.BEACH, Transport.CAR, 14, TypeOfFood.FULL_BOARD, Destination.SPAIN));
		travelAgency.addVoucher(
				new Voucher(TypeOfTrip.EXCURSION, Transport.TRAIN, 7, TypeOfFood.BREAKFAST_ONLY, Destination.NORWAY));
		travelAgency.addVoucher(
				new Voucher(TypeOfTrip.CRUISE, Transport.SHIP, 7, TypeOfFood.ALL_INCLUSIVE, Destination.ITALY));
		travelAgency.addVoucher(
				new Voucher(TypeOfTrip.BEACH, Transport.AIRCRAFT, 7, TypeOfFood.ALL_INCLUSIVE, Destination.US));

		View view = new View();

		view.print(travelAgency.getVouchers(), "Все туры:");

		TravelAgencyLogic logic = new TravelAgencyLogic();

		List<Voucher> italyTour = logic.findVoucherByDestination(Destination.ITALY, travelAgency);

		view.print(italyTour, " Туры в Италию:");

		List<Voucher> excursion = logic.findVoucherByTypeOfTrip(TypeOfTrip.EXCURSION, travelAgency);

		view.print(excursion, " Экскурсии:");

		Collections.sort(travelAgency.getVouchers(), new VoucherDestinationComparator());

		view.print(travelAgency.getVouchers(), " Сортировать туры по направлению");

		Collections.sort(travelAgency.getVouchers(), new VoucherTransportComparator());

		view.print(travelAgency.getVouchers(), " Сортировать туры по типу транспорта");

	}

}