package eligibility;

public class EligibilityResponse {
    private ExtensionProperties ExtensionProperties;

    private String CustomFields;

    private DemographicInfo DemographicInfo;

    private String VerificationType;

    private NetworkSections[] NetworkSections;

    private String VerificationStatus;

    private ServicesTypes[] ServicesTypes;

    private String EDIErrorMessage;

    private String VerificationMessage;

    private String ReportURL;

    private EligibilityPeriod EligibilityPeriod;

    private String PayerName;

    private String IsPayerBackOffice;

    private String Status;

    private String AdditionalInformation;

    private String DOS;

    private String ExceptionNotes;

    private String OtherMessage;

    private String ElgRequestID;

    private HealthBenefitPlanCoverageServiceType HealthBenefitPlanCoverageServiceType;

    private String Plan;

    public ExtensionProperties getExtensionProperties ()
    {
        return ExtensionProperties;
    }

    public void setExtensionProperties (ExtensionProperties ExtensionProperties)
    {
        this.ExtensionProperties = ExtensionProperties;
    }

    public String getCustomFields ()
    {
        return CustomFields;
    }

    public void setCustomFields (String CustomFields)
    {
        this.CustomFields = CustomFields;
    }

    public DemographicInfo getDemographicInfo ()
    {
        return DemographicInfo;
    }

    public void setDemographicInfo (DemographicInfo DemographicInfo)
    {
        this.DemographicInfo = DemographicInfo;
    }

    public String getVerificationType ()
    {
        return VerificationType;
    }

    public void setVerificationType (String VerificationType)
    {
        this.VerificationType = VerificationType;
    }

    public NetworkSections[] getNetworkSections ()
    {
        return NetworkSections;
    }

    public void setNetworkSections (NetworkSections[] NetworkSections)
    {
        this.NetworkSections = NetworkSections;
    }

    public String getVerificationStatus ()
    {
        return VerificationStatus;
    }

    public void setVerificationStatus (String VerificationStatus)
    {
        this.VerificationStatus = VerificationStatus;
    }

    public ServicesTypes[] getServicesTypes ()
    {
        return ServicesTypes;
    }

    public void setServicesTypes (ServicesTypes[] ServicesTypes)
    {
        this.ServicesTypes = ServicesTypes;
    }

    public String getEDIErrorMessage ()
    {
        return EDIErrorMessage;
    }

    public void setEDIErrorMessage (String EDIErrorMessage)
    {
        this.EDIErrorMessage = EDIErrorMessage;
    }

    public String getVerificationMessage ()
    {
        return VerificationMessage;
    }

    public void setVerificationMessage (String VerificationMessage)
    {
        this.VerificationMessage = VerificationMessage;
    }

    public String getReportURL ()
    {
        return ReportURL;
    }

    public void setReportURL (String ReportURL)
    {
        this.ReportURL = ReportURL;
    }

    public EligibilityPeriod getEligibilityPeriod ()
    {
        return EligibilityPeriod;
    }

    public void setEligibilityPeriod (EligibilityPeriod EligibilityPeriod)
    {
        this.EligibilityPeriod = EligibilityPeriod;
    }

    public String getPayerName ()
    {
        return PayerName;
    }

    public void setPayerName (String PayerName)
    {
        this.PayerName = PayerName;
    }

    public String getIsPayerBackOffice ()
    {
        return IsPayerBackOffice;
    }

    public void setIsPayerBackOffice (String IsPayerBackOffice)
    {
        this.IsPayerBackOffice = IsPayerBackOffice;
    }

    public String getStatus ()
    {
        return Status;
    }

    public void setStatus (String Status)
    {
        this.Status = Status;
    }

    public String getAdditionalInformation ()
    {
        return AdditionalInformation;
    }

    public void setAdditionalInformation (String AdditionalInformation)
    {
        this.AdditionalInformation = AdditionalInformation;
    }

    public String getDOS ()
    {
        return DOS;
    }

    public void setDOS (String DOS)
    {
        this.DOS = DOS;
    }

    public String getExceptionNotes ()
    {
        return ExceptionNotes;
    }

    public void setExceptionNotes (String ExceptionNotes)
    {
        this.ExceptionNotes = ExceptionNotes;
    }

    public String getOtherMessage ()
    {
        return OtherMessage;
    }

    public void setOtherMessage (String OtherMessage)
    {
        this.OtherMessage = OtherMessage;
    }

    public String getElgRequestID ()
    {
        return ElgRequestID;
    }

    public void setElgRequestID (String ElgRequestID)
    {
        this.ElgRequestID = ElgRequestID;
    }

    public HealthBenefitPlanCoverageServiceType getHealthBenefitPlanCoverageServiceType ()
    {
        return HealthBenefitPlanCoverageServiceType;
    }

    public void setHealthBenefitPlanCoverageServiceType (HealthBenefitPlanCoverageServiceType HealthBenefitPlanCoverageServiceType)
    {
        this.HealthBenefitPlanCoverageServiceType = HealthBenefitPlanCoverageServiceType;
    }

    public String getPlan ()
    {
        return Plan;
    }

    public void setPlan (String Plan)
    {
        this.Plan = Plan;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ExtensionProperties = "+ExtensionProperties+", CustomFields = "+CustomFields+", DemographicInfo = "+DemographicInfo+", VerificationType = "+VerificationType+", NetworkSections = "+NetworkSections+", VerificationStatus = "+VerificationStatus+", ServicesTypes = "+ServicesTypes+", EDIErrorMessage = "+EDIErrorMessage+", VerificationMessage = "+VerificationMessage+", ReportURL = "+ReportURL+", EligibilityPeriod = "+EligibilityPeriod+", PayerName = "+PayerName+", IsPayerBackOffice = "+IsPayerBackOffice+", Status = "+Status+", AdditionalInformation = "+AdditionalInformation+", DOS = "+DOS+", ExceptionNotes = "+ExceptionNotes+", OtherMessage = "+OtherMessage+", ElgRequestID = "+ElgRequestID+", HealthBenefitPlanCoverageServiceType = "+HealthBenefitPlanCoverageServiceType+", Plan = "+Plan+"]";
    }
}
