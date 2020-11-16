package FactoryMethodPattern;

public class ReportFactory {
	private ReportFactory() {

	}

	public static final Report getReport(ReportType reportType) {
		switch (reportType) {
		case TRACNGHIEM:
			return new TracNghiem();
		case CODE:
			return new Code();
		case LUAN:
			return new BaiLuan();
		default:
			throw new IllegalArgumentException("Không có báo cáo loại khác");
		}
	}
}
