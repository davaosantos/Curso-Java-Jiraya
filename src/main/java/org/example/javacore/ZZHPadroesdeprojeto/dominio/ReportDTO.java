package org.example.javacore.ZZHPadroesdeprojeto.dominio;

public class ReportDTO {

    private String aircraftName;

    private Currency currency;

    private CountryEnum countryEnum;


    public static final class ReportDTOBuilder {
        private String aircraftName;
        private Currency currency;
        private CountryEnum countryEnum;

        private ReportDTOBuilder() {
        }

        public static ReportDTOBuilder builder() {
            return new ReportDTOBuilder();
        }

        public ReportDTOBuilder withAircraftName(String aircraftName) {
            this.aircraftName = aircraftName;
            return this;
        }

        public ReportDTOBuilder withCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public ReportDTOBuilder withCountryEnum(CountryEnum countryEnum) {
            this.countryEnum = countryEnum;
            return this;
        }

        public ReportDTO build() {
            ReportDTO reportDTO = new ReportDTO();
            reportDTO.aircraftName = this.aircraftName;
            reportDTO.countryEnum = this.countryEnum;
            reportDTO.currency = this.currency;
            return reportDTO;
        }

        public String getAircraftName() {
            return aircraftName;
        }

        public void setAircraftName(String aircraftName) {
            this.aircraftName = aircraftName;
        }

        public Currency getCurrency() {
            return currency;
        }

        public void setCurrency(Currency currency) {
            this.currency = currency;
        }

        public CountryEnum getCountryEnum() {
            return countryEnum;
        }

        public void setCountryEnum(CountryEnum countryEnum) {
            this.countryEnum = countryEnum;
        }
    }

    public String getAircraftName() {
        return aircraftName;
    }

    public void setAircraftName(String aircraftName) {
        this.aircraftName = aircraftName;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public CountryEnum getCountryEnum() {
        return countryEnum;
    }

    public void setCountryEnum(CountryEnum countryEnum) {
        this.countryEnum = countryEnum;
    }
}
