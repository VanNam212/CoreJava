package FactoryMethodPattern;

public class TestFactoryMethodPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Report report = ReportFactory.getReport(ReportType.TRACNGHIEM);
		System.out.println(report.getType());
		System.out.println(report.evaluate());

		report = ReportFactory.getReport(ReportType.CODE);
		System.out.println(report.getType());
		System.out.println(report.evaluate());

		report = ReportFactory.getReport(ReportType.LUAN);
		System.out.println(report.getType());
		System.out.println(report.evaluate());
	}

}
