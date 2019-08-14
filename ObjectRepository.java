package uimap;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import democomponents.Crimeshield;
import democomponents.CrimeshieldThirdParty;
import democomponents.TechEO;

public class ObjectRepository {
	//Crimeshield
	public static final By lstPolicySystem = By.xpath("//select[@name='chgPosition']");

	public static final By lnkundwriter = By.xpath("//span[@title='Rajanikant Shetty (9913)']");
	public static final By undwriter = By.xpath("//select[@name='uwSelect']");
	public static final By btnSubmit = By.xpath("//input[@value='Submit' and @class='bookbill']");	// select underwriter submit button
	public static final By txtInsuredName = By.xpath("//input[@class='search']");
	public static final By btnInsuredName = By.xpath("//input[@class='searchsub']");
	public static final By btnNewSubmission = By.xpath("//input[@name='submit' and @value='Create New Submission']");
	public static final By btnClearSubmission = By.xpath("//input[@name='cleassub']");
	//account info
	public static final By txtAddress = By.xpath("//input[@name='insad1']");
	public static final By txtAddress2 = By.xpath("//input[@name='insad2']");
	public static final By txtCity = By.xpath("//input[@name='inscty']");
	public static final By lstState = By.xpath("//select[@name='insst']");
	public static final By txtZip = By.xpath("//input[@name='inszip']");
	public static final By btnPublic = By.xpath("//input[@name='pubpri' and @value='1']");
	public static final By btnPrivate = By.xpath("//input[@name='pubpri' and @value='2']");
	public static final By txtTicker = By.xpath("//*[@name='ticker']");
	public static final By txtRevenue = By.xpath("//input[@name='reven']");
	public static final By LstIndustry = By.xpath("//select[@name='indcls']");	
	public static final By txtEffDate = By.xpath("//input[@name='effdte']");
	public static final By btnPrimary = By.xpath("//input[@name='laytyp' and @value='P']");
	public static final By btnExcess = By.xpath("//input[@name='laytyp' and @value='E']");
	public static final By lstProduct = By.xpath("//select[@name='visprd']");
	public static final By lstLeadFrom = By.xpath("//select[@name='leadfr']");
	public static final By txtCoverage = By.xpath("//input[@name='hfpcovline']");
	public static final By txtProducer = By.xpath("//input[@name='agent']");
	public static final By txtProducerContact = By.xpath("//input[@name='prodcontname']"); 
	public static final By RdProdcontact = By.xpath("//input[@name='prdrundw']");
	public static final By chkmailAdd = By.xpath("//input[@name='sameas']");

	public static final By lstDepartment = By.xpath("//select[@name='newdepart']");
	public static final By lstUW = By.xpath("//select[@name='newundwrt']");
	//public static final By btnSubmitAI = By.xpath("//table[@onclick='abUpdSubmit(document.jedi)']//td[@bgColor='#ffcc00']");

	//public static final By btnSubmitAI = By.xpath("//td[@class='abox']");
	public static final By btnUpdateSubmit = By.xpath("//img[@src='/VIS/images/action/ic_submit.gif']");
	//public static final By btnUpdateSubmit = By.xpath("//img[text()='Submit']");

	public static final By btnContinueAS = By.xpath("//a[@href='javascript:gotoVision()']");

	public static final By lstIndustrySubClass = By.xpath("//select[@name='rnicsb']");
	public static final By chkNonProfit = By.xpath("//input[@name='entind']");
	

	//co25156
	//UW-general info
	public static final By btnPopSP = By.xpath("//input[@class='bookbill' and @value='Populate S&P Data']");
	public static final By lstSAAcode = By.xpath("//select[@name='surcde']");
	public static final By txtSICcode = By.xpath("//input[@name='siccod']");

	//Industry Data
	public static final By lnkIndustry = By.xpath("//*[@id='txtIND']"); 
	public static final By txtEmployees = By.xpath("//input[@name='emplcnt']");
	public static final By txtOperatingSince = By.xpath("//input[@name='opersinc']");
	public static final By lstSPSelector = By.xpath("//*[@name='sctrclsf']");
	public static final By lstSPIndustry = By.xpath("//*[@name='spsigrp']");
	public static final By txtRev = By.xpath("//input[@name='totrev']");
	public static final By txtAssets = By.xpath("//input[@name='asssiz']");
	public static final By btnMAActivityYes = By.xpath("//*[@name='mrgaact' and @value='Y']");
	public static final By btnCmpnyCoreOperNo = By.xpath("//*[@name='reglrsk' and @value='N']");
	public static final By btnCmpnyCoreOperUnknwn = By.xpath("//*[@name='reglrsk' and @value='U']");

	public static final By txtMktCap2YrHigh= By.xpath("//input[@name='mrkcap2']");
	public static final By txtMktCap5YrHigh = By.xpath("//input[@name='mrkcap5']");
	
	//Stock Information
	public static final By lnkStockInfo = By.xpath("//*[@id='txtSTK']"); 
	public static final By txtMarketCap = By.xpath("//*[@name='mrkcap']");
	public static final By txtPriorMarketCap = By.xpath("//*[@name='mrkcap12p']");
	public static final By txtFFOShares = By.xpath("//*[@name='ffoshr']");
	public static final By txtDidviShare = By.xpath("//*[@name='divdshr']");
	public static final By txtVolatility = By.xpath("//*[@name='vltltyb']");
	public static final By txtPERAtio= By.xpath("//*[@name='peratio']");

	public static final By txtCurrentStock = By.xpath("//*[@name='stkprcc']");
	public static final By txtWeekHigh = By.xpath("//*[@name='high52w']");
	public static final By txtWeekLow= By.xpath("//*[@name='low52w']");
	public static final By txtMonthPriorStock = By.xpath("//*[@name='stkpr12p']");
	public static final By txtInterestCurrent = By.xpath("//*[@name='shrtint']");
	public static final By txtInterestHigh= By.xpath("//*[@name='shrtint52']");

	public static final By txtDOOwnership= By.xpath("//*[@name='ownrsdo']");
	public static final By btnMultClassNo = By.xpath("//*[@name='clsstck' and @value='N']");
	public static final By btnStockDropNo = By.xpath("//*[@name='stckdrp' and @value='N']");
	public static final By txtTradingVolume= By.xpath("//*[@name='tradvol']");

	public static final By lstSecOff= By.xpath("//*[@name='secofrn']");
	public static final By btnSecOffNo= By.xpath("//*[@name='secofipo' and @value='N']");
	public static final By btnControlledCmpnyYesNo = By.xpath("//*[@name='cntrlco' and @value='Y']");
	public static final By btnDepNo = By.xpath("//*[@name='dpndco' and @value='N']");
	public static final By btnGoodwillNo= By.xpath("//*[@name='goodwrto' and @value='Y']");
	public static final By btnPreferredOutstandingYes= By.xpath("//*[@name='prfstko' and @value='Y']");
	public static final By chkExecutiveShares= By.xpath("//*[@name='exctsshr']");
	
	//Financials
	public static final By lnkFinancials = By.xpath("//*[@id='txtFIN']"); 
	public static final By lstSPCredRating= By.xpath("//*[@name='crdratsp']");
	public static final By lstCurrSPCredRatOutlook= By.xpath("//*[@name='crdrtc']");
	public static final By lstSPRatPrior= By.xpath("//*[@name='sprt12p']");
	public static final By lstSPOutlookPrior= By.xpath("//*[@name='spol12p']");

	public static final By txtTangBookValue = By.xpath("//*[@name='tangbookval']");
	public static final By txtUnLevFreeCashFlow = By.xpath("//*[@name='unlfreecshflow']");
	public static final By txtOverallOccupancy= By.xpath("//*[@name='ovrallocp']");
	public static final By txtTotDebt = By.xpath("//*[@name='totdebt']");
	public static final By txtDebtPrpValue = By.xpath("//*[@name='dbtprvalp']");
	public static final By txtDebtAssets= By.xpath("//*[@name='dbttastp']");

	public static final By txtNPPE = By.xpath("//*[@name='nppe']");
	public static final By txtDisModelScore= By.xpath("//*[@name='dstdflt']");
	public static final By btnAssetMortgageNo= By.xpath("//*[@name='undmrtg' and @value='N']");

	//Litigation
	public static final By lnkLitigation = By.xpath("//*[@id='txtLIT']"); 
	public static final By btnCyberEventsNo= By.xpath("//*[@name='cybevent' and @value='N']");

	//Governance
	public static final By lnkGovernance = By.xpath("//*[@id='txtGOV']"); 
	public static final By lstGMIBoardScore= By.xpath("//*[@name='gmiscr']");

	public static final By txtCurrGMIAGRScore = By.xpath("//*[@name='gmiagrc']");
	public static final By txtHighAGR = By.xpath("//*[@name='agr2yhg']");
	public static final By txtLowAGR= By.xpath("//*[@name='agr2ylw']");

	//Coverage
	public static final By lnkCoverage = By.xpath("//*[@id='txtCVG']"); 
	public static final By btnCovWarrantyNo= By.xpath("//*[@name='cgwrntstm' and @value='N']");
	public static final By btnCovPriorNo= By.xpath("//*[@name='cgwrngact' and @value='N']");

	//P&C
	public static final By lnkPC = By.xpath("//*[@id='txtPNC']"); 

	//Review
	public static final By lnkReview = By.xpath("//*[@id='txtUND']"); 
	public static final By btnAccWithinAuthNo= By.xpath("//*[@name='mgrrevw' and @value='N']");
	public static final By btnMapReviewNo= By.xpath("//*[@name='maprevw' and @value='N']");

	//Subjectivity
	public static final By lnkSubjectivity = By.xpath("//*[@id='txtSUBJ']"); 

	//Rate
	public static final By txtInvestContinuityDate = By.xpath("//*[@name='inccontdt']");
	/*********Option1**********/
	public static final By btnDOTypeA1= By.xpath("//input[@name='retind1'and @value='A']");
	public static final By btnDOTypeB1= By.xpath("//input[@name='retind1'and @value='B']");
	public static final By btnDOTypeC1= By.xpath("//input[@name='retind1'and @value='C']");
	public static final By btnDOTypeD1= By.xpath("//input[@name='retind1'and @value='D']");
	
	public static final By txtLimit1= By.xpath("//input[@name='limit1']");
	public static final By txtLimAggregate1= By.xpath("//input[@name='limag1']");
	public static final By lstLimit1= By.xpath("//select[@name='limit1']");
	public static final By txtEachDO1 = By.xpath("//input[@name='reteach1']");
	public static final By txtAggregate1 = By.xpath("//input[@name='retagg1']");
	public static final By txtCompReimburse1 = By.xpath("//input[@name='rettypb1']");
	public static final By txtDefenceCostPer1 = By.xpath("//input[@name='coincr1']");
	public static final By btnPresetAllocationNo1= By.xpath("//input[@name='preall1' and @value='N']");
	public static final By btnCoInsuranceNo1= By.xpath("//input[@name='coinfg1' and @value='N']");
	public static final By btnPresetAllocationYes1= By.xpath("//input[@name='preall1' and @value='Y']");
	public static final By btnCoInsuranceYes1= By.xpath("//input[@name='coinfg1' and @value='Y']");
	
	
	public static final By chkIA2RelEntityOpt1= By.xpath("//*[@name='entinvc1']");
	public static final By txtInsuringAgreementIA2Opt1= By.xpath("//*[@name='rettypc1']");
	public static final By txtDefenceCostPerIA2Opt1 = By.xpath("//*[@name='coinsc1']");
	public static final By txtLossIA2Opt1 = By.xpath("//*[@name='coinao1']");
	
	public static final By chkIA6RelEntityOpt1= By.xpath("//*[@name='nonsecc1']");
	public static final By txtInsuringAgreementIA6Opt1= By.xpath("//*[@name='nsceret1']");
	public static final By txtDefenceCostPerIA6Opt1 = By.xpath("//*[@name='coinnsc1']");
	public static final By txtAllOtherLosses1 = By.xpath("//*[@name='coinnao1']");
	
	public static final By chkIA7RelEntityOpt1= By.xpath("//*[@name='regfdc1']");
	
	public static final By txtCooperationCostSubOpt1= By.xpath("//*[@name='rmbrslmt1']");
	public static final By txtRetentionCredOpt1 = By.xpath("//*[@name='retcrd1']");
	
	public static final By txtDerDemandSubLimit1 = By.xpath("//*[@name='drtvlmt1']");
	public static final By txtBooksAndRecReqSubLimit1 = By.xpath("//*[@name='rcrdlmt1']");
	public static final By txtEscrowSubLimit1 = By.xpath("//*[@name='escrwlmt1']");
	public static final By txtEnforceEntityPerExecutive1 = By.xpath("//*[@name='eceslmt1']");//
	public static final By txtEnforceEntityInAgg1 = By.xpath("//*[@name='ecslmt1']");//
	public static final By txtRepCostPerExecutive1 = By.xpath("//*[@name='rcelmt1']");
	public static final By txtRepCostInAgg1 = By.xpath("//*[@name='rcslmt1']");//
	public static final By txtSubLimitiOfLiability1 = By.xpath("//*[@name='regfdlmt1']");
	
	public static final By txtNonIndefinedCov1 = By.xpath("//*[@name='nonindr1']");
	public static final By txtIndefCovOther1 = By.xpath("//*[@name='indcrb1']");
	public static final By txtEachClaim1 = By.xpath("//*[@name='indclmr1']");
	public static final By txtClaimAndRelInvest1 = By.xpath("//*[@name='secclmr1']");
	public static final By txtDerDemand1 = By.xpath("//*[@name='drtvret1']");
	public static final By txtBooksAndRecReq1 = By.xpath("//*[@name='rcrdret1']");
	public static final By txtPartnershipClaim1 = By.xpath("//*[@name='prtspclr1']");
	public static final By txtNonSecuritiesClaim1 = By.xpath("//*[@name='nonsecr1']");
	public static final By txtFDDemand1 = By.xpath("//*[@name='regfdret1']");
	public static final By txtRegEvent1 = By.xpath("//*[@name='regeret1']");
	
	public static final By txtOwneshpTypeStruct1 = By.xpath("//input[@name='OWNSTRF1']");
	public static final By txtTimeInBuss1 = By.xpath("//input[@name='TMBUSF1']");
	public static final By txtMerAcqHis1 = By.xpath("//input[@name='MRACQAF1']");
	public static final By txtLitClaimHist1 = By.xpath("//input[@name='LITCLMN1']");
	public static final By txtMgmtQuality1 = By.xpath("//input[@name='QUALMANG1']");
	public static final By txtPEOfReit1 = By.xpath("//input[@name='PEREITF1']");
	public static final By txtFinCondition1 = By.xpath("//input[@name='FINCNDF1']");
	public static final By txtSecClaimCover1 = By.xpath("//input[@name='SECCLMM1']");
	public static final By txtNonSecClaimCover1 = By.xpath("//input[@name='NSECCLMM1']");
	public static final By txtPriorActRatFactor1= By.xpath("//input[@name='PRIACTF1']");
	public static final By txtRetModifier1= By.xpath("//input[@name='retmodf1']");
	
	public static final By txtIncLimitModifier1= By.xpath("//*[@name='inclmtm1']");
	public static final By txtTotPremium1= By.xpath("//*[@name='premp1']");
	
	/*********Option2**********/
	public static final By btnDOTypeA2= By.xpath("//input[@name='retind2'and @value='A']");
	public static final By btnDOTypeB2= By.xpath("//input[@name='retind2'and @value='B']");
	public static final By btnDOTypeC2= By.xpath("//input[@name='retind2'and @value='C']");
	public static final By btnDOTypeD2= By.xpath("//input[@name='retind2'and @value='D']");
	
	public static final By txtLimit2= By.xpath("//*[@name='limit2']");
	public static final By txtLimAggregate2= By.xpath("//input[@name='limag2']");
	public static final By lstLimit2= By.xpath("//select[@name='limit2']");
	public static final By txtEachDO2 = By.xpath("//input[@name='reteach2']");
	public static final By txtAggregate2 = By.xpath("//input[@name='retagg2']");
	public static final By txtCompReimburse2 = By.xpath("//input[@name='rettypb2']");
	
	public static final By txtDefenceCostPer2 = By.xpath("//input[@name='coincr2']");
	public static final By btnPresetAllocationNo2= By.xpath("//input[@name='preall2' and @value='N']");
	public static final By btnCoInsuranceNo2= By.xpath("//input[@name='coinfg2' and @value='N']");
	public static final By btnPresetAllocationYes2= By.xpath("//input[@name='preall2' and @value='Y']");
	public static final By btnCoInsuranceYes2= By.xpath("//input[@name='coinfg2' and @value='Y']");
	
	public static final By chkIA2RelEntityOpt2= By.xpath("//*[@name='entinvc2']");
	public static final By txtInsuringAgreementIA2Opt2= By.xpath("//*[@name='rettypc2']");
	public static final By txtDefenceCostPerIA2Opt2 = By.xpath("//*[@name='coinsc2']");
	public static final By txtLossIA2Opt2 = By.xpath("//*[@name='coinao2']");
	
	public static final By chkIA6RelEntityOpt2= By.xpath("//*[@name='nonsecc2']");
	public static final By txtInsuringAgreementIA6Opt2= By.xpath("//*[@name='nsceret2']");
	public static final By txtDefenceCostPerIA6Opt2 = By.xpath("//*[@name='coinnsc2']");
	public static final By txtAllOtherLosses2 = By.xpath("//*[@name='coinnao2']");
	
	public static final By chkIA7RelEntityOpt2= By.xpath("//*[@name='regfdc2']");
	
	public static final By txtCooperationCostSubOpt2= By.xpath("//*[@name='rmbrslmt2']");
	public static final By txtRetentionCredOpt2 = By.xpath("//*[@name='retcrd2']");
	
	public static final By txtDerDemandSubLimit2 = By.xpath("//*[@name='drtvlmt2']");
	public static final By txtBooksAndRecReqSubLimit2 = By.xpath("//*[@name='rcrdlmt2']");
	public static final By txtEscrowSubLimit2 = By.xpath("//*[@name='escrwlmt2']");
	public static final By txtEnforceEntityPerExecutive2 = By.xpath("//*[@name='eceslmt2']");//
	public static final By txtEnforceEntityInAgg2 = By.xpath("//*[@name='ecslmt2']");//
	public static final By txtRepCostPerExecutive2 = By.xpath("//*[@name='rcelmt2']");
	public static final By txtRepCostInAgg2 = By.xpath("//*[@name='rcslmt2']");//
	public static final By txtSubLimitiOfLiability2 = By.xpath("//*[@name='regfdlmt2']");
	
	public static final By txtNonIndefinedCov2 = By.xpath("//*[@name='nonindr2']");
	public static final By txtIndefCovOther2 = By.xpath("//*[@name='indcrb2']");
	public static final By txtEachClaim2 = By.xpath("//*[@name='indclmr2']");
	public static final By txtClaimAndRelInvest2 = By.xpath("//*[@name='secclmr2']");
	
	public static final By txtDerDemand2 = By.xpath("//*[@name='drtvret2']");
	public static final By txtBooksAndRecReq2 = By.xpath("//*[@name='rcrdret2']");
	
	public static final By txtPartnershipClaim2 = By.xpath("//*[@name='prtspclr2']");
	public static final By txtNonSecuritiesClaim2 = By.xpath("//*[@name='nonsecr2']");
	
	public static final By txtFDDemand2 = By.xpath("//*[@name='regfdret2']");
	public static final By txtRegEvent2 = By.xpath("//*[@name='regeret2']");
	
	public static final By txtOwneshpTypeStruct2 = By.xpath("//input[@name='OWNSTRF2']");
	public static final By txtTimeInBuss2 = By.xpath("//input[@name='TMBUSF2']");
	public static final By txtMerAcqHis2 = By.xpath("//input[@name='MRACQAF2']");
	public static final By txtLitClaimHist2 = By.xpath("//input[@name='LITCLMN2']");
	public static final By txtMgmtQuality2 = By.xpath("//input[@name='QUALMANG2']");
	public static final By txtPEOfReit2 = By.xpath("//input[@name='PEREITF2']");
	public static final By txtFinCondition2 = By.xpath("//input[@name='FINCNDF2']");
	public static final By txtSecClaimCover2 = By.xpath("//input[@name='SECCLMM2']");
	public static final By txtNonSecClaimCover2 = By.xpath("//input[@name='NSECCLMM2']");
	public static final By txtPriorActRatFactor2= By.xpath("//input[@name='PRIACTF2']");
	public static final By txtRetModifier2= By.xpath("//input[@name='retmodf2']");
	
	public static final By txtIncLimitModifier2= By.xpath("//*[@name='inclmtm2']");
	public static final By txtTotPremium2= By.xpath("//*[@name='premp2']");
	
	
	/*********Option3**********/
	public static final By btnDOTypeA3= By.xpath("//*[@name='retind3'and @value='A']");
	public static final By btnDOTypeB3= By.xpath("//*[@name='retind3'and @value='B']");
	public static final By btnDOTypeC3= By.xpath("//*[@name='retind3'and @value='C']");
	public static final By btnDOTypeD3= By.xpath("//*[@name='retind3'and @value='D']");
	
	public static final By txtLimit3= By.xpath("//*[@name='limit3']");
	public static final By txtLimAggregate3= By.xpath("//input[@name='limag3']");
	public static final By lstLimit3= By.xpath("//*[@name='limit3']");
	public static final By txtEachDO3 = By.xpath("//input[@name='reteach3']");
	public static final By txtAggregate3 = By.xpath("//input[@name='retagg3']");
	public static final By txtCompReimburse3 = By.xpath("//input[@name='rettypb3']");
	
	public static final By txtDefenceCostPer3 = By.xpath("//input[@name='coincr3']");
	public static final By btnPresetAllocationNo3= By.xpath("//input[@name='preall3' and @value='N']");
	public static final By btnCoInsuranceNo3= By.xpath("//input[@name='coinfg3' and @value='N']");
	public static final By btnPresetAllocationYes3= By.xpath("//input[@name='preall3' and @value='Y']");
	public static final By btnCoInsuranceYes3= By.xpath("//input[@name='coinfg3' and @value='Y']");
	
	public static final By chkIA3RelEntityOpt3= By.xpath("//*[@name='entinvc3']");
	public static final By txtInsuringAgreementIA2Opt3= By.xpath("//*[@name='rettypc3']");
	public static final By txtDefenceCostPerIA2Opt3 = By.xpath("//*[@name='coinsc3']");
	public static final By txtLossIA2Opt3 = By.xpath("//*[@name='coinao3']");
	
	
	public static final By chkIA6RelEntityOpt3= By.xpath("//*[@name='nonsecc3']");
	public static final By txtInsuringAgreementIA6Opt3= By.xpath("//*[@name='nsceret3']");
	public static final By txtDefenceCostPerIA6Opt3 = By.xpath("//*[@name='coinnsc3']");
	public static final By txtAllOtherLosses3 = By.xpath("//*[@name='coinnao3']");
	
	public static final By chkIA7RelEntityOpt3= By.xpath("//*[@name='regfdc3']");
	
	public static final By txtCooperationCostSubOpt3= By.xpath("//*[@name='rmbrslmt3']");
	public static final By txtRetentionCredOpt3 = By.xpath("//*[@name='retcrd3']");
	
	public static final By txtDerDemandSubLimit3 = By.xpath("//*[@name='drtvlmt3']");
	public static final By txtBooksAndRecReqSubLimit3 = By.xpath("//*[@name='rcrdlmt3']");
	public static final By txtEscrowSubLimit3 = By.xpath("//*[@name='escrwlmt3']");
	public static final By txtSubLimitiOfLiability3 = By.xpath("//*[@name='regfdlmt3']");
	
	public static final By txtNonIndefinedCov3 = By.xpath("//*[@name='nonindr3']");
	public static final By txtIndefCovOther3 = By.xpath("//*[@name='indcrb3']");
	public static final By txtEachClaim3 = By.xpath("//*[@name='indclmr3']");
	public static final By txtClaimAndRelInvest3 = By.xpath("//*[@name='secclmr3']");
	public static final By txtDerDemand3 = By.xpath("//*[@name='drtvret3']");
	public static final By txtBooksAndRecReq3 = By.xpath("//*[@name='rcrdret3']");
	public static final By txtPartnershipClaim3 = By.xpath("//*[@name='prtspclr3']");
	public static final By txtNonSecuritiesClaim3 = By.xpath("//*[@name='nonsecr3']");
	public static final By txtFDDemand3 = By.xpath("//*[@name='regfdret3']");
	public static final By txtRegEvent3 = By.xpath("//*[@name='regeret3']");
	
	public static final By txtOwneshpTypeStruct3 = By.xpath("//input[@name='OWNSTRF3']");
	public static final By txtTimeInBuss3 = By.xpath("//input[@name='TMBUSF3']");
	public static final By txtMerAcqHis3 = By.xpath("//input[@name='MRACQAF3']");
	public static final By txtLitClaimHist3 = By.xpath("//input[@name='LITCLMN3']");
	public static final By txtMgmtQuality3 = By.xpath("//input[@name='QUALMANG3']");
	public static final By txtPEOfReit3 = By.xpath("//input[@name='PEREITF3']");
	public static final By txtFinCondition3 = By.xpath("//input[@name='FINCNDF3']");
	public static final By txtSecClaimCover3 = By.xpath("//input[@name='SECCLMM3']");
	public static final By txtNonSecClaimCover3 = By.xpath("//input[@name='NSECCLMM3']");
	public static final By txtPriorActRatFactor3= By.xpath("//input[@name='PRIACTF3']");
	public static final By txtRetModifier3= By.xpath("//input[@name='retmodf3']");
	
	public static final By txtIncLimitModifier3= By.xpath("//*[@name='inclmtm3']");
	public static final By txtTotPremium3= By.xpath("//*[@name='premp3']");
	
	/*********Option4**********/
	public static final By btnDOTypeA4= By.xpath("//*[@name='retind4'and @value='A']");
	public static final By btnDOTypeB4= By.xpath("//*[@name='retind4'and @value='B']");
	public static final By btnDOTypeC4= By.xpath("//*[@name='retind4'and @value='C']");
	public static final By btnDOTypeD4= By.xpath("//*[@name='retind4'and @value='D']");
	
	public static final By txtLimit4= By.xpath("//*[@name='limit4']");
	public static final By txtLimAggregate4= By.xpath("//input[@name='limag4']");
	public static final By lstLimit4= By.xpath("//*[@name='limit4']");
	public static final By txtEachDO4 = By.xpath("//input[@name='reteach4']");
	public static final By txtAggregate4 = By.xpath("//input[@name='retagg4']");
	public static final By txtCompReimburse4 = By.xpath("//input[@name='rettypb4']");
	
	public static final By txtDefenceCostPer4 = By.xpath("//input[@name='coincr4']");
	public static final By btnPresetAllocationNo4= By.xpath("//input[@name='preall4' and @value='N']");
	public static final By btnCoInsuranceNo4= By.xpath("//input[@name='coinfg4' and @value='N']");
	
	public static final By btnPresetAllocationYes4= By.xpath("//input[@name='preall4' and @value='Y']");
	public static final By btnCoInsuranceYes4= By.xpath("//input[@name='coinfg4' and @value='Y']");
	
	public static final By chkIA2RelEntityOpt4= By.xpath("//*[@name='entinvc4']");
	public static final By txtInsuringAgreementIA2Opt4= By.xpath("//*[@name='rettypc4']");
	public static final By txtDefenceCostPerIA2Opt4 = By.xpath("//*[@name='coinsc4']");
	public static final By txtLossIA2Opt4 = By.xpath("//*[@name='coinao4']");
	
	public static final By chkIA6RelEntityOpt4= By.xpath("//*[@name='nonsecc4']");
	public static final By txtInsuringAgreementIA6Opt4= By.xpath("//*[@name='nsceret4']");
	public static final By txtDefenceCostPerIA6Opt4 = By.xpath("//*[@name='coinnsc4']");
	public static final By txtAllOtherLosses4 = By.xpath("//*[@name='coinnao4']");
	
	public static final By chkIA7RelEntityOpt4= By.xpath("//*[@name='regfdc4']");
	
	public static final By txtCooperationCostSubOpt4= By.xpath("//*[@name='rmbrslmt4']");
	public static final By txtRetentionCredOpt4 = By.xpath("//*[@name='retcrd4']");
	
	public static final By txtSubLimitiOfLiability4 = By.xpath("//*[@name='regfdlmt4']");
	public static final By txtNonIndefinedCov4 = By.xpath("//*[@name='nonindr4']");
	public static final By txtIndefCovOther4 = By.xpath("//*[@name='indcrb4']");
	
	public static final By txtEachClaim4 = By.xpath("//*[@name='indclmr4']");
	public static final By txtClaimAndRelInvest4 = By.xpath("//*[@name='secclmr4']");
	
	public static final By txtDerDemand4 = By.xpath("//*[@name='drtvret4']");
	public static final By txtBooksAndRecReq4 = By.xpath("//*[@name='rcrdret4']");
	
	public static final By txtPartnershipClaim4 = By.xpath("//*[@name='prtspclr4']");
	public static final By txtNonSecuritiesClaim4 = By.xpath("//*[@name='nonsecr4']");
	
	public static final By txtFDDemand4 = By.xpath("//*[@name='regfdret4']");
	public static final By txtRegEvent4 = By.xpath("//*[@name='regeret4']");
	
	public static final By txtOwneshpTypeStruct4 = By.xpath("//input[@name='OWNSTRF4']");
	public static final By txtTimeInBuss4 = By.xpath("//input[@name='TMBUSF4']");
	public static final By txtMerAcqHis4 = By.xpath("//input[@name='MRACQAF4']");
	public static final By txtLitClaimHist4 = By.xpath("//input[@name='LITCLMN4']");
	public static final By txtMgmtQuality4 = By.xpath("//input[@name='QUALMANG4']");
	public static final By txtPEOfReit4 = By.xpath("//input[@name='PEREITF4']");
	public static final By txtFinCondition4 = By.xpath("//input[@name='FINCNDF4']");
	public static final By txtSecClaimCover4 = By.xpath("//input[@name='SECCLMM4']");
	public static final By txtNonSecClaimCover4 = By.xpath("//input[@name='NSECCLMM4']");
	public static final By txtPriorActRatFactor4= By.xpath("//input[@name='PRIACTF4']");
	public static final By txtRetModifier4= By.xpath("//input[@name='retmodf4']");
	
	public static final By txtIncLimitModifier4= By.xpath("//*[@name='inclmtm4']");
	public static final By txtTotPremium4= By.xpath("//*[@name='premp4']");
	
	public static final By txtDerDemandSubLimit4 = By.xpath("//*[@name='drtvlmt4']");
	public static final By txtBooksAndRecReqSubLimit4 = By.xpath("//*[@name='rcrdlmt4']");
	public static final By txtEscrowSubLimit4 = By.xpath("//*[@name='escrwlmt4']");
	public static final By btnGetRating= By.className("bookbill");
	public static final By btnGetRatingAspose= By.xpath("//input[@class='bookbill' and @value=' Get Rating from ASPOSE']");
	
	public static final By txtBasePremium= By.xpath("//*[@name='bsprem']");
	
	//Co25156
	
	public static final By txtRatableEmp = By.xpath("//input[@name='empiratec']");
	public static final By txtLocations = By.xpath("//input[@name='totloc']");
	public static final By lstEnttyp = By.xpath("//select[@name='enttyp']");
	public static final By txtBusinessDescp = By.xpath("//textarea[@name='busdesc']");
	public static final By txtFinancialAssess = By.xpath("//textarea[@name='finassess']");
	public static final By txtAquisitionAct = By.xpath("//textarea[@name='acqsact']");
	public static final By txtQualInternCtrl = By.xpath("//textarea[@name='qltintcnt']");
	//UW - previous insurance
	public static final By lnkPrevIns = By.xpath("//td[@id='txtPRI']");
	public static final By btnInsCovY = By.xpath("//input[@name='curcov' and @value='Y']");
	public static final By btnInsCovN = By.xpath("//input[@name='curcov' and @value='N']");
	public static final By lstCarrier = By.xpath("//select[@name='crcomp']");
	public static final By txtEffDate2 = By.xpath("//input[@name='creff']");
	public static final By txtLimit = By.xpath("//input[@name='crlmt']");
	public static final By txtSIR = By.xpath("//input[@name='crsir']");
	public static final By txtPremium = By.xpath("//input[@name='crprem']");
	//UW- crimeshield
	public static final By lnkCrimeshield = By.xpath("//td[@id='nbCRI']");
	public static final By chkIA2 = By.xpath("//input[@name='empthftcp']");
	public static final By chkIA3 = By.xpath("//input[@name='comfraudc']");
	public static final By chkIA4 = By.xpath("//input[@name='inpremc']");
	public static final By chkIA5 = By.xpath("//input[@name='outpremc']");
	public static final By chkIA6 = By.xpath("//input[@name='depoforc']");
	public static final By chkIA7 = By.xpath("//input[@name='crdchgc']");
	public static final By chkIA8 = By.xpath("//input[@name='moccurrc']");
	public static final By chkIA9 = By.xpath("//input[@name='invtgexp']");
	public static final By chkIA10 = By.xpath("//input[@name='csrstexp']");
	public static final By chkIA11 = By.xpath("//input[@name='idrexprmb']");
	public static final By btnScheduled = By.xpath("//input[@name='blnktschd' and @value='S']");	
	public static final By btnIntermediary = By.xpath("//input[@name='intrmdry' and @value='N']");
	public static final By btnLossSustained = By.xpath("//input[@name='discvfrmc' and @value='S']");
	public static final By txtRetroDate = By.xpath("//input[@name='lossrtdtc']");
	public static final By txtOff_PremEmp = By.xpath("//input[@name='offpremplc']");
	public static final By btnIndContr = By.xpath("//input[@name='covindctr' and @value='Y']");
	public static final By btnLimitPeriods = By.xpath("//input[@name='inclimspic' and @value='N']");
	public static final By btnUWCrimeshieldSub1 = By.xpath("//input[@name='CRPX00CRP0001' and @value='Y']");
	public static final By btnUWCrimeshieldSub2 = By.xpath("//input[@name='CRPX00OTH0044' and @value='Y']");
	public static final By btnUWCrimeshieldSub3 = By.xpath("//input[@name='CRPX00OTH0045' and @value='Y']");
	public static final By btnUWCrimeshieldSub4 = By.xpath("//input[@name='CRPX00CRP0026' and @value='Y']");
	public static final By btnUWCrimeshieldSub5 = By.xpath("//input[@name='CRPX00CRP0005' and @value='Y']");
	public static final By btnUWCrimeshieldSub6 = By.xpath("//input[@name='CRPX00OTH0043' and @value='Y']");
	public static final By btnUWCrimeshieldSub7 = By.xpath("//input[@name='CRPX00CRP0025' and @value='Y']");
	public static final By btnUWCrimeshieldSub8 = By.xpath("//input[@name='CRPX00OTH8000' and @value='Y']");
	public static final By lstLossPrev = By.xpath("//select[@name='optnCRPX00OTH0044']");
	public static final By txtSub8AgentName = By.xpath("//input[@name='CRPbilnam']");
	public static final By txtSub8Telephone = By.xpath("//input[@name='CRPbiltel']");
	public static final By txtSub8Address = By.xpath("//input[@name='CRPbilad1']");
	public static final By txtSub8City = By.xpath("//input[@name='CRPbilcty']");
	public static final By txtSub8State = By.xpath("//input[@name='CRPbilst']");
	public static final By txtSub8Zip = By.xpath("//input[@name='CRPbilzip']");
	public static final By txtSub8License = By.xpath("//input[@name='CRPaccnbr']");
	public static final By txtSub8Comments = By.xpath("//textarea[@name='CRPcommnt']");
	public static final By btnUWCrimeshieldSubmit = By.xpath("//table[@onclick='abUpdSubmit();']//td[@bgColor= '#ffcc00']");
	public static final By btnRatableEmp = By.xpath("//input[@name='ratemprl' and @value='3']");
	//rating page
	public static final By txtIA1limit1 = By.xpath("//input[@name='C01LIMITZ1']");
	public static final By txtIA1ret1 = By.xpath("//input[@name='C01DEDUCO1']");
	public static final By txtIA1limit2 = By.xpath("//input[@name='C01LIMITZ2']");
	public static final By txtIA1ret2 = By.xpath("//input[@name='C01DEDUCO2']");
	public static final By txtIA1limit3 = By.xpath("//input[@name='C01LIMITZ3']");
	public static final By txtIA1ret3 = By.xpath("//input[@name='C01DEDUCO3']");
	public static final By txtIA1limit4 = By.xpath("//input[@name='C01LIMITZ4']");
	public static final By txtIA1ret4 = By.xpath("//input[@name='C01DEDUCO4']");
	public static final By txtIA2limit1 = By.xpath("//input[@name='C02LIMITZ1']");
	public static final By txtIA2ret1 = By.xpath("//input[@name='C02DEDUCO1']");
	public static final By txtIA2limit2 = By.xpath("//input[@name='C02LIMITZ2']");
	public static final By txtIA2ret2 = By.xpath("//input[@name='C02DEDUCO2']");
	public static final By txtIA2limit3 = By.xpath("//input[@name='C02LIMITZ3']");
	public static final By txtIA2ret3 = By.xpath("//input[@name='C02DEDUCO3']");
	public static final By txtIA2limit4 = By.xpath("//input[@name='C02LIMITZ4']");
	public static final By txtIA2ret4 = By.xpath("//input[@name='C02DEDUCO4']");
	public static final By txtIA3limit1 = By.xpath("//input[@name='C03LIMITZ1']");
	public static final By txtIA3ret1 = By.xpath("//input[@name='C03DEDUCO1']");
	public static final By txtIA3limit2 = By.xpath("//input[@name='C03LIMITZ2']");
	public static final By txtIA3ret2 = By.xpath("//input[@name='C03DEDUCO2']");
	public static final By txtIA3limit3 = By.xpath("//input[@name='C03LIMITZ3']");
	public static final By txtIA3ret3 = By.xpath("//input[@name='C03DEDUCO3']");
	public static final By txtIA3limit4 = By.xpath("//input[@name='C03LIMITZ4']");
	public static final By txtIA3ret4 = By.xpath("//input[@name='C03DEDUCO4']");
	public static final By txtIA4limit1 = By.xpath("//input[@name='C04LIMITZ1']");
	public static final By txtIA4ret1 = By.xpath("//input[@name='C04DEDUCO1']");
	public static final By txtIA4limit2 = By.xpath("//input[@name='C04LIMITZ2']");
	public static final By txtIA4ret2 = By.xpath("//input[@name='C04DEDUCO2']");
	public static final By txtIA4limit3 = By.xpath("//input[@name='C04LIMITZ3']");
	public static final By txtIA4ret3 = By.xpath("//input[@name='C04DEDUCO3']");
	public static final By txtIA4limit4 = By.xpath("//input[@name='C04LIMITZ4']");
	public static final By txtIA4ret4 = By.xpath("//input[@name='C04DEDUCO4']");
	public static final By txtIA5limit1 = By.xpath("//input[@name='C05LIMITZ1']");
	public static final By txtIA5ret1 = By.xpath("//input[@name='C05DEDUCO1']");
	public static final By txtIA5limit2 = By.xpath("//input[@name='C05LIMITZ2']");
	public static final By txtIA5ret2 = By.xpath("//input[@name='C05DEDUCO2']");
	public static final By txtIA5limit3 = By.xpath("//input[@name='C05LIMITZ3']");
	public static final By txtIA5ret3 = By.xpath("//input[@name='C05DEDUCO3']");
	public static final By txtIA5limit4 = By.xpath("//input[@name='C05LIMITZ4']");
	public static final By txtIA5ret4 = By.xpath("//input[@name='C05DEDUCO4']");
	public static final By txtIA6limit1 = By.xpath("//input[@name='C06LIMITZ1']");
	public static final By txtIA6ret1 = By.xpath("//input[@name='C06DEDUCO1']");
	public static final By txtIA6limit2 = By.xpath("//input[@name='C06LIMITZ2']");
	public static final By txtIA6ret2 = By.xpath("//input[@name='C06DEDUCO2']");
	public static final By txtIA6limit3 = By.xpath("//input[@name='C06LIMITZ3']");
	public static final By txtIA6ret3 = By.xpath("//input[@name='C06DEDUCO3']");
	public static final By txtIA6limit4 = By.xpath("//input[@name='C06LIMITZ4']");
	public static final By txtIA6ret4 = By.xpath("//input[@name='C06DEDUCO4']");
	public static final By txtIA7limit1 = By.xpath("//input[@name='C07LIMITZ1']");
	public static final By txtIA7ret1 = By.xpath("//input[@name='C07DEDUCO1']");
	public static final By txtIA7limit2 = By.xpath("//input[@name='C07LIMITZ2']");
	public static final By txtIA7ret2 = By.xpath("//input[@name='C07DEDUCO2']");
	public static final By txtIA7limit3 = By.xpath("//input[@name='C07LIMITZ3']");
	public static final By txtIA7ret3 = By.xpath("//input[@name='C07DEDUCO3']");
	public static final By txtIA7limit4 = By.xpath("//input[@name='C07LIMITZ4']");
	public static final By txtIA7ret4 = By.xpath("//input[@name='C07DEDUCO4']");
	public static final By txtIA8limit1 = By.xpath("//input[@name='C08LIMITZ1']");
	public static final By txtIA8ret1 = By.xpath("//input[@name='C08DEDUCO1']");
	public static final By txtIA8limit2 = By.xpath("//input[@name='C08LIMITZ2']");
	public static final By txtIA8ret2 = By.xpath("//input[@name='C08DEDUCO2']");
	public static final By txtIA8limit3 = By.xpath("//input[@name='C08LIMITZ3']");
	public static final By txtIA8ret3 = By.xpath("//input[@name='C08DEDUCO3']");
	public static final By txtIA8limit4 = By.xpath("//input[@name='C08LIMITZ4']");
	public static final By txtIA8ret4 = By.xpath("//input[@name='C08DEDUCO4']");
	public static final By txtIA9limit1 = By.xpath("//input[@name='C09LIMITZ1']");
	public static final By txtIA9ret1 = By.xpath("//input[@name='C09DEDUCO1']");
	public static final By txtIA9limit2 = By.xpath("//input[@name='C09LIMITZ2']");
	public static final By txtIA9ret2 = By.xpath("//input[@name='C09DEDUCO2']");
	public static final By txtIA9limit3 = By.xpath("//input[@name='C09LIMITZ3']");
	public static final By txtIA9ret3 = By.xpath("//input[@name='C09DEDUCO3']");
	public static final By txtIA9limit4 = By.xpath("//input[@name='C09LIMITZ4']");
	public static final By txtIA9ret4 = By.xpath("//input[@name='C09DEDUCO4']");
	public static final By txtIA10limit1 = By.xpath("//input[@name='C10LIMITZ1']");
	public static final By txtIA10ret1 = By.xpath("//input[@name='C10DEDUCO1']");
	public static final By txtIA10limit2 = By.xpath("//input[@name='C10LIMITZ2']");
	public static final By txtIA10ret2 = By.xpath("//input[@name='C10DEDUCO2']");
	public static final By txtIA10limit3 = By.xpath("//input[@name='C10LIMITZ3']");
	public static final By txtIA10ret3 = By.xpath("//input[@name='C10DEDUCO3']");
	public static final By txtIA10limit4 = By.xpath("//input[@name='C10LIMITZ4']");
	public static final By txtIA10ret4 = By.xpath("//input[@name='C10DEDUCO4']");
	public static final By txtIA11limit1 = By.xpath("//input[@name='C11LIMITZ1']");
	public static final By txtIA11limit2 = By.xpath("//input[@name='C11LIMITZ2']");
	public static final By txtIA11limit3 = By.xpath("//input[@name='C11LIMITZ3']");
	public static final By txtIA11limit4 = By.xpath("//input[@name='C11LIMITZ4']");

	public static final By lstDisbursements = By.xpath("//select[@name='DISBCTRD']");
	public static final By lstLossActivity = By.xpath("//select[@name='LOSSACTIVD']");
	public static final By lstCompSec = By.xpath("//select[@name='COMPCTRD']");
	public static final By lstPurchasingInv = By.xpath("//select[@name='PURCHINVD']");
	public static final By lstPreEmpScreen = By.xpath("//select[@name='PREEMPLD']");
	public static final By lstAuditControls = By.xpath("//select[@name='AUDITCOND']");
	public static final By lstHighValueInv = By.xpath("//select[@name='HIVALINCD']");
	public static final By lstSupervision = By.xpath("//select[@name='SPVSCTRLD']");
	public static final By lstAccessClientMoney = By.xpath("//select[@name='ACCMOND']");

	public static final By txtDisbursements_Factor = By.xpath("//input[@name='DISBCTR']");
	public static final By txtLossActivity_Factor = By.xpath("//input[@name='LOSSACTIV']");
	public static final By txtCompSec_Factor = By.xpath("//input[@name='COMPCTR']");
	public static final By txtPurchasingInv_Factor = By.xpath("//input[@name='PURCHINV']");
	public static final By txtPreEmpScreen_Factor = By.xpath("//input[@name='PREEMPL']");
	public static final By txtAuditControls_Factor = By.xpath("//input[@name='AUDITCON']");
	public static final By txtHighValueInv_Factor = By.xpath("//input[@name='HIVALINC']");
	public static final By txtSupervision_Factor = By.xpath("//input[@name='SPVSCTRL']");
	public static final By txtAccessClientMoney_Factor = By.xpath("//input[@name='ACCMON']");

	public static final By chkEmpTheftopt1 = By.xpath("//input[@name='INCDESAGR1']");
	public static final By chkEmpTheftopt2 = By.xpath("//input[@name='INCDESAGR2']");
	public static final By chkEmpTheftopt3 = By.xpath("//input[@name='INCDESAGR3']");
	public static final By chkEmpTheftopt4 = By.xpath("//input[@name='INCDESAGR4']");
	public static final By txtEmpTheft_NoAgents = By.xpath("//input[@name='NOAGENTR']");

	public static final By chkMgmtStaffopt1 = By.xpath("//input[@name='PACCTINR1']");
	public static final By chkMgmtStaffopt2 = By.xpath("//input[@name='PACCTINR2']");
	public static final By chkMgmtStaffopt3 = By.xpath("//input[@name='PACCTINR3']");
	public static final By chkMgmtStaffopt4 = By.xpath("//input[@name='PACCTINR4']");
	public static final By txtMgmtStaff_Count = By.xpath("//input[@name='PACCTICR']");

	public static final By chkVolunteersopt1 = By.xpath("//input[@name='VWRKRINDR1']");
	public static final By chkVolunteersopt2 = By.xpath("//input[@name='VWRKRINDR2']");
	public static final By chkVolunteersopt3 = By.xpath("//input[@name='VWRKRINDR3']");
	public static final By chkVolunteersopt4 = By.xpath("//input[@name='VWRKRINDR4']");
	public static final By txtVolunteers_Count = By.xpath("//input[@name='VWRKRCNTR']");

	public static final By chkDeleteTradingopt1 = By.xpath("//input[@name='DTLEXCR1']");
	public static final By chkDeleteTradingopt2 = By.xpath("//input[@name='DTLEXCR2']");
	public static final By chkDeleteTradingopt3 = By.xpath("//input[@name='DTLEXCR3']");
	public static final By chkDeleteTradingopt4 = By.xpath("//input[@name='DTLEXCR4']");
	public static final By txtDeleteTrading_Fac1 = By.xpath("//input[@name='DTLEXCRF1']");
	public static final By txtDeleteTrading_Fac2 = By.xpath("//input[@name='DTLEXCRF2']");
	public static final By txtDeleteTrading_Fac3 = By.xpath("//input[@name='DTLEXCRF3']");
	public static final By txtDeleteTrading_Fac4 = By.xpath("//input[@name='DTLEXCRF4']");

	public static final By chkAddScheduleopt1 = By.xpath("//input[@name='ADDSCHEDR1']");
	public static final By chkAddScheduleopt2 = By.xpath("//input[@name='ADDSCHEDR2']");
	public static final By chkAddScheduleopt3 = By.xpath("//input[@name='ADDSCHEDR3']");
	public static final By chkAddScheduleopt4 = By.xpath("//input[@name='ADDSCHEDR4']");

	public static final By txtGroup1Limitopt1 = By.xpath("//input[@name='GRPLMT1R1']");
	public static final By txtGroup1Limitopt2 = By.xpath("//input[@name='GRPLMT1R2']");
	public static final By txtGroup1Limitopt3 = By.xpath("//input[@name='GRPLMT1R3']");
	public static final By txtGroup1Limitopt4 = By.xpath("//input[@name='GRPLMT1R4']");

	public static final By txtGroup1Emplopt1 = By.xpath("//input[@name='GRPEMPL1R1']");
	public static final By txtGroup1Emplopt2 = By.xpath("//input[@name='GRPEMPL1R2']");
	public static final By txtGroup1Emplopt3 = By.xpath("//input[@name='GRPEMPL1R3']");
	public static final By txtGroup1Emplopt4 = By.xpath("//input[@name='GRPEMPL1R4']");

	public static final By txtGroup2Limitopt1 = By.xpath("//input[@name='GRPLMT2R1']");
	public static final By txtGroup2Limitopt2 = By.xpath("//input[@name='GRPLMT2R2']");
	public static final By txtGroup2Limitopt3 = By.xpath("//input[@name='GRPLMT2R3']");
	public static final By txtGroup2Limitopt4 = By.xpath("//input[@name='GRPLMT2R4']");

	public static final By txtGroup2Emplopt1 = By.xpath("//input[@name='GRPEMPL2R1']");
	public static final By txtGroup2Emplopt2 = By.xpath("//input[@name='GRPEMPL2R2']");
	public static final By txtGroup2Emplopt3 = By.xpath("//input[@name='GRPEMPL2R3']");
	public static final By txtGroup2Emplopt4 = By.xpath("//input[@name='GRPEMPL2R4']");

	public static final By txtGroup3Limitopt1 = By.xpath("//input[@name='GRPLMT3R1']");
	public static final By txtGroup3Limitopt2 = By.xpath("//input[@name='GRPLMT3R2']");
	public static final By txtGroup3Limitopt3 = By.xpath("//input[@name='GRPLMT3R3']");
	public static final By txtGroup3Limitopt4 = By.xpath("//input[@name='GRPLMT3R4']");

	public static final By txtGroup3Emplopt1 = By.xpath("//input[@name='GRPEMPL3R1']");
	public static final By txtGroup3Emplopt2 = By.xpath("//input[@name='GRPEMPL3R2']");
	public static final By txtGroup3Emplopt3 = By.xpath("//input[@name='GRPEMPL3R3']");
	public static final By txtGroup3Emplopt4 = By.xpath("//input[@name='GRPEMPL3R4']");

	public static final By txtGroup4Limitopt1 = By.xpath("//input[@name='GRPLMT4R1']");
	public static final By txtGroup4Limitopt2 = By.xpath("//input[@name='GRPLMT4R2']");
	public static final By txtGroup4Limitopt3 = By.xpath("//input[@name='GRPLMT4R3']");
	public static final By txtGroup4Limitopt4 = By.xpath("//input[@name='GRPLMT4R4']");

	public static final By txtGroup4Emplopt1 = By.xpath("//input[@name='GRPEMPL4R1']");
	public static final By txtGroup4Emplopt2 = By.xpath("//input[@name='GRPEMPL4R2']");
	public static final By txtGroup4Emplopt3 = By.xpath("//input[@name='GRPEMPL4R3']");
	public static final By txtGroup4Emplopt4 = By.xpath("//input[@name='GRPEMPL4R4']");

	public static final By txtGroup5Limitopt1 = By.xpath("//input[@name='GRPLMT5R1']");
	public static final By txtGroup5Limitopt2 = By.xpath("//input[@name='GRPLMT5R2']");
	public static final By txtGroup5Limitopt3 = By.xpath("//input[@name='GRPLMT5R3']");
	public static final By txtGroup5Limitopt4 = By.xpath("//input[@name='GRPLMT5R4']");

	public static final By txtGroup5Emplopt1 = By.xpath("//input[@name='GRPEMPL5R1']");
	public static final By txtGroup5Emplopt2 = By.xpath("//input[@name='GRPEMPL5R2']");
	public static final By txtGroup5Emplopt3 = By.xpath("//input[@name='GRPEMPL5R3']");
	public static final By txtGroup5Emplopt4 = By.xpath("//input[@name='GRPEMPL5R4']");

	public static final By chkDeceptionFraudopt1 = By.xpath("//input[@name='dfind1']");
	public static final By chkDeceptionFraudopt2 = By.xpath("//input[@name='dfind2']");
	public static final By chkDeceptionFraudopt3 = By.xpath("//input[@name='dfind3']");
	public static final By chkDeceptionFraudopt4 = By.xpath("//input[@name='dfind4']");

	public static final By txtDeceptionFraudFactoropt1 = By.xpath("//input[@name='DECFRAUD1']");
	public static final By txtDeceptionFraudFactoropt2 = By.xpath("//input[@name='DECFRAUD2']");
	public static final By txtDeceptionFraudFactoropt3 = By.xpath("//input[@name='DECFRAUD3']");
	public static final By txtDeceptionFraudFactoropt4 = By.xpath("//input[@name='DECFRAUD4']");

	public static final By txtDeceptionFraudLimitopt1 = By.xpath("//input[@name='DFLIMITZ1']");
	public static final By txtDeceptionFraudLimitopt2 = By.xpath("//input[@name='DFLIMITZ2']");
	public static final By txtDeceptionFraudLimitopt3 = By.xpath("//input[@name='DFLIMITZ3']");
	public static final By txtDeceptionFraudLimitopt4 = By.xpath("//input[@name='DFLIMITZ4']");

	public static final By txtDeceptionFraudRetopt1 = By.xpath("//input[@name='DFDEDUCO1']");
	public static final By txtDeceptionFraudRetopt2 = By.xpath("//input[@name='DFDEDUCO2']");
	public static final By txtDeceptionFraudRetopt3 = By.xpath("//input[@name='DFDEDUCO3']");
	public static final By txtDeceptionFraudRetopt4 = By.xpath("//input[@name='DFDEDUCO4']");

	public static final By chkVirtualCurropt1 = By.xpath("//input[@name='vcind1']");
	public static final By chkVirtualCurropt2 = By.xpath("//input[@name='vcind2']");
	public static final By chkVirtualCurropt3 = By.xpath("//input[@name='vcind3']");
	public static final By chkVirtualCurropt4 = By.xpath("//input[@name='vcind4']");

	public static final By txtVirtualCurrFactoropt1 = By.xpath("//input[@name='VIRCURR1']");
	public static final By txtVirtualCurrFactoropt2 = By.xpath("//input[@name='VIRCURR2']");
	public static final By txtVirtualCurrFactoropt3 = By.xpath("//input[@name='VIRCURR3']");
	public static final By txtVirtualCurrFactoropt4 = By.xpath("//input[@name='VIRCURR4']");

	public static final By txtVirtualCurrLimitopt1 = By.xpath("//input[@name='VCLIMITZ1']");
	public static final By txtVirtualCurrLimitopt2 = By.xpath("//input[@name='VCLIMITZ2']");
	public static final By txtVirtualCurrLimitopt3 = By.xpath("//input[@name='VCLIMITZ3']");
	public static final By txtVirtualCurrLimitopt4 = By.xpath("//input[@name='VCLIMITZ4']");

	public static final By txtVirtualCurrRetopt1 = By.xpath("//input[@name='VCDEDUCO1']");
	public static final By txtVirtualCurrRetopt2 = By.xpath("//input[@name='VCDEDUCO2']");
	public static final By txtVirtualCurrRetopt3 = By.xpath("//input[@name='VCDEDUCO3']");
	public static final By txtVirtualCurrRetopt4 = By.xpath("//input[@name='VCDEDUCO4']");

	public static final By txtFinanCond_Opt1 = By.xpath("//input[@name='srfc1']");
	public static final By txtQualOfMgmt_Opt1 = By.xpath("//input[@name='srqm1']");
	public static final By txtMergerAcq_Opt1 = By.xpath("//input[@name='srma1']");
	public static final By txtOther_Opt1 = By.xpath("//input[@name='srot1']");
	public static final By txtFinanCond_Opt2 = By.xpath("//input[@name='srfc2']");
	public static final By txtQualOfMgmt_Opt2 = By.xpath("//input[@name='srqm2']");
	public static final By txtMergerAcq_Opt2 = By.xpath("//input[@name='srma2']");
	public static final By txtOther_Opt2 = By.xpath("//input[@name='srot2']");
	public static final By txtFinanCond_Opt3 = By.xpath("//input[@name='srfc3']");
	public static final By txtQualOfMgmt_Opt3 = By.xpath("//input[@name='srqm3']");
	public static final By txtMergerAcq_Opt3 = By.xpath("//input[@name='srma3']");
	public static final By txtOther_Opt3 = By.xpath("//input[@name='srot3']");
	public static final By txtFinanCond_Opt4 = By.xpath("//input[@name='srfc4']");
	public static final By txtQualOfMgmt_Opt4 = By.xpath("//input[@name='srqm4']");
	public static final By txtMergerAcq_Opt4 = By.xpath("//input[@name='srma4']");
	public static final By txtOther_Opt4 = By.xpath("//input[@name='srot4']");

	public static final By btnRateActual = By.xpath("//input[@class='bookbill' and @value='Rate Actuate']");
	//public static final By txtUnderWriting = By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/p");
	//public static final By txtUnderWriting = By.xpath("//html[@class='CSS1Compat']");
	public static final By txtUnderWriting = By.xpath("//a[@title='Insert/Remove Numbered List']");	


	public static final By PremiumOpt1 = By.xpath("//input[@name='psubtotal1']");
	public static final By PremiumOpt2 = By.xpath("//input[@name='psubtotal2']");
	public static final By PremiumOpt3 = By.xpath("//input[@name='psubtotal3']");
	public static final By PremiumOpt4 = By.xpath("//input[@name='psubtotal4']");
	//quote page
	public static final By QuotePremiumOpt1 = By.xpath("//td[@id='prem1']");
	public static final By QuotePremiumOpt2 = By.xpath("//td[@id='prem2']");
	public static final By QuotePremiumOpt3 = By.xpath("//td[@id='prem3']");
	public static final By QuotePremiumOpt4 = By.xpath("//td[@id='prem4']");

	public static final By chkpremium1 = By.xpath("//input[@name='opt1']");
	public static final By chkpremium2 = By.xpath("//input[@name='opt2']");
	public static final By chkpremium3 = By.xpath("//input[@name='opt3']");
	public static final By chkpremium4 = By.xpath("//input[@name='opt4']");

	public static final By chkSelectAll = By.xpath("//input[@id='selectAllId']");
	public static final By chkProdContactLic = By.xpath("//input[@name='prcliciflg']");
	
	public static final By txtBrokerCommission = By.xpath("//input[@name='originalcommission']");
	//co25156
	public static final By btnOptionalForm = By.xpath("//form[@name='QUOTE2']/table/tbody/tr[2]/td/table//tbody/tr/td[2]");
	public static final By txtDiscoveryPremium = By.xpath("//input[@name='disprem']");
	public static final By txtAnnualPremium = By.xpath("//input[@name='term']");
	public static final By txtWaiverRecPremium = By.xpath("//input[@name='qt3worprm']");
	
	public static final By lstTerritoryCode = By.xpath("//select[@name='taxterr']");
	public static final By txtRiskTier = By.xpath("//input[@name='totrisktier1']");
	public static final By txtBitsightScore = By.xpath("//input[@name='bitsightscr']");
	public static final By txtCyenceScore = By.xpath("//input[@name='cyencescr']");
	
	public static final By chkPendingForm = By.xpath("//input[@name='UX00H02800|Pending & Prior Litigation Exclusion (Split Layers)|THED|N|C|N|']");
	public static final By btnNewWindowSubmit = By.xpath("//input[@name='Submit']");
	//co25156
	
	public static final By Quoteform1 = By.xpath("//td[@onclick='showOptForm('CA00H00300')']");
	public static final By Quoteform2 = By.xpath("//td[@onclick='showOptForm('CA00H00200')']");
	//public static final By btnMandatoryForm = By.xpath("//img[@src='http://hfdev.thehartford.com:17777/VIS/images/icons/TPMin2.gif']");
	public static final By btnMandatoryForm = By.xpath("//img[@src='http://hfdev.thehartford.com:19999/VIS/images/icons/TPMin2.gif']");
	
	public static final By btnBinderMandatoryForm = By.xpath("//img[@src='/VIS/images/icons/TPMax2.gif']");
	public static final By Binderform1 = By.xpath("//td[@onclick='showOptForm('CA00H00300')']");
	public static final By Binderform2 = By.xpath("//td[@onclick='showOptForm('CA09H00200')']");
	public static final By btnBindPremiumOpt1 = By.xpath("//tr[@id='dspopt1']//input[@name='opt']");
	
	//co25156
	public static final By btnBindPremiumOpt2 = By.xpath("//tr[@id='dspopt2']//input[@name='opt']");
	public static final By btnBindPremiumOpt3 = By.xpath("//tr[@id='dspopt3']//input[@name='opt']");
	public static final By btnBindPremiumOpt4 = By.xpath("//tr[@id='dspopt4']//input[@name='opt']");
	
	public static final By BindPremiumTextOpt1 = By.xpath("//tr[@id='dspopt1']/td[4]");
	public static final By BindPremiumTextOpt2 = By.xpath("//tr[@id='dspopt2']/td[4]");
	public static final By BindPremiumTextOpt3 = By.xpath("//tr[@id='dspopt3']/td[4]");
	public static final By BindPremiumTextOpt4 = By.xpath("//tr[@id='dspopt4']/td[4]");
	
	public static final By IssuePolicyPremium = By.id("revgwpv");
	
	
	public static final By btnAddOptionalForm = By.xpath("//img[@src='/VIS/images/cq_add.gif']");
	public static final By btnBillingMethodTab = By.xpath("//input[@name='agytyp' and @value='T']");
	
	public static final By chkBinderAbsSpecificForm = By.xpath("//input[@name,'Absolute Specific Litigation Exclusion']");
	public static final By chkBinderAbsTieForm = By.xpath("//input[@name,'Absolute Tie-In Endorsement']");
	public static final By chkBinderAntiStackForm = By.xpath("//input[@name,'Anti-Stacking Endorsement']");
	public static final By chkBinderBrokerRecForm = By.xpath("//input[@name,'Broker of Record Endorsement']");
	
	public static final By chkBinderAmendDecForm = By.xpath("//input[@name='UX00M04300|Amend Declarations - Policy Period|THED|N|C|N|']");
	public static final By chkBinderAmendExtForm = By.xpath("//input[@name='UX00M00900|Amend Extended Reporting Period - Amend Underlying Requirement|THED|N| |N|']");
	
	public static final By IssuePolicyTab = By.xpath("//td[@id='t_ip1']");
	public static final By btnFillInIssuePolicy = By.xpath("//input[@class='bookbill' and @value='Fill-In']");
	
	public static final By btnPrintDraftCopy = By.xpath("//input[@name='prtquality' and @value='D']");
	public static final By btnPrintFinalCopy = By.xpath("//input[@name='prtquality' and @value='F']");
	public static final By btnEmailDraftCopy = By.xpath("//input[@name='prtquality' and @value='E']");
	public static final By btnEmailFinCopy = By.xpath("//input[@name='prtquality' and @value='M']");
	
	
	//co25156
	
	public static final By btnRenewalSolicitation = By.xpath("//img[@title='Renewal Solicitation Required Docs']");
	public static final By btnPolicyNumber = By.xpath("//img[@src='http://hfdev.thehartford.com:17777/VIS/images/cb_getnew.gif']");
	public static final By txtPolicyNumber = By.xpath("//span[@id='policyId']");
	public static final By btnBillingMethod = By.xpath("//input[@name='agytyp' and @value='B']");

	//book and bill
	public static final By BookPremiumOpt1 = By.xpath("//td[@id='revnwpv']/b");

	public static final By lstInsuredType = By.xpath("//select[@name='instyp']");
	public static final By lstIndustryClass = By.xpath("//select[@name='rnicls']");
	public static final By lstIndustrySubclass = By.xpath("//select[@name='rnicsb']");
	public static final By lstISO_ClsCode = By.xpath("//select[@name='clasx']");
	public static final By imgTerritoryCode = By.xpath("//input[@name='']");
	public static final By lstPaymentPlan = By.xpath("//select[@name='paypln']");
	public static final By txtRecDate = By.xpath("//input[@name='apprcvdt']");
	public static final By lstPCRelation = By.xpath("//select[@name='higreltyp']");

	//issue policy
	public static final By btnCompleteIssue = By.xpath("//input[@onclick='setOpt(2);']");
	public static final By btnPrintMyPolicy = By.xpath("//input[@value='Print/E-Mail My Policy']");

	//public static final By lstReviewerSig = By.xpath("//input[@name='']");
	public static final By lstNo_Copies = By.xpath("//select[@id='opt2a_1']");
	public static final By lstPrintLocation = By.xpath("//select[@name='prtloc']");
	public static final By btnEmailFinalCopy = By.xpath("//input[@id='emalfnalcpy' and @value='M']");
	public static final By btnIssueUpdate = By.xpath("//img[@src='/VIS/images/action/ic_update.gif']");

	//CrimeshieldThirdParty - UW-Crimeshield
	public static final By btnBlanket = By.xpath("//input[@name='blnktschd' and @value='B']");
	public static final By btnDiscoveryForm = By.xpath("//input[@name='discvfrmc' and @value='D']");
	//rating
	public static final By txtExpRedFactor = By.xpath("//input[@name='redcom']");
	public static final By PremiumOpt1TCP = By.xpath("//input[@name='psubtotal1']");
	public static final By PremiumOpt2TCP = By.xpath("//input[@name='psubtotal2']");
	public static final By PremiumOpt3TCP = By.xpath("//input[@name='psubtotal3']");
	public static final By PremiumOpt4TCP = By.xpath("//input[@name='psubtotal4']");

	//quote
	public static final By btnMandatoryFormCTP = By.xpath("//img[contains(@src,'gif')]");
	public static final By form1CTP = By.xpath("//td[@onclick='showOptForm('CA00H00200')']");
	public static final By form2CTP = By.xpath("//td[@onclick='showOptForm('CA00H00300')']");
	//bind
	public static final By Binderform1TCP = By.xpath("//td[@onclick='showOptForm('CA00H00300')']");
	public static final By btnBindMandFormCTP = By.xpath("//img[@src='/VIS/images/icons/TPMax2.gif']");

	//TechEO

	public static final By lstPolicySystemEO = By.xpath("//select[@name='chgPosition']");
	//UW-General Info
	public static final By lnkGeneralInfo = By.xpath("//td[@id='txtGEN']"); 
	public static final By txtCompetitiveInfo = By.xpath("//textarea[@id='cmptinfo']");
	public static final By txtYrsBusiness = By.xpath("//input[@id='yrsbus']");
	public static final By txtRetroDateTechEO = By.xpath("//input[@id='retdte']");
	public static final By txtPriorAct = By.xpath("//input[@id='noyrsprior']");
	public static final By txtNAIC = By.xpath("//input[@id='classificationLookup']");
	public static final By lstHazardGroup = By.xpath("//select[@id='hazgrp']");
	public static final By lstCyberGroupCLass = By.xpath("//select[@id='cybgrpcl']");
	public static final By txtUSSales = By.xpath("//input[@id='ussales']");
	public static final By txtTotalExpenses = By.xpath("//input[@id='totexp']");
	public static final By txtTotalEmp = By.xpath("//input[@id='emplcnt']");
	public static final By Rd_NamedInsured = By.xpath("//input[@id='subsid' and @value='N']");
	public static final By lstSubsidiaries = By.xpath("//select[@id='subsidn']");
	public static final By lstForeignLoc = By.xpath("//select[@id='frgnofc']");
	public static final By Rd_AppMerger = By.xpath("//input[@id='mrgacq' and @value='N']");
	public static final By Rd_AppSubcontract = By.xpath("//input[@id='subcntact' and @value='N']");
	public static final By lstNoOfWeb = By.xpath("//select[@id='website']");
	public static final By Rd_Subjectivities1 = By.xpath("//input[@name='EOPX00OTH0031' and @value='N']");
	public static final By Rd_Subjectivities2 = By.xpath("//input[@name='EOPX00OTH0034' and @value='X']");
	public static final By Rd_Subjectivities3 = By.xpath("//input[@name='EOPX00OTH0035' and @value='N']");
	public static final By Rd_Subjectivities4 = By.xpath("//input[@name='EOPX00OTH0038' and @value='N']");
	public static final By Rd_Subjectivities5 = By.xpath("//input[@name='EOPX00OTH0039' and @value='N']");
	public static final By Rd_Subjectivities6 = By.xpath("//input[@name='EOPX00OTH0053' and @value='N']");
	public static final By Rd_Subjectivities7 = By.xpath("//input[@name='EOPX00OTH0060' and @value='N']");
	public static final By Rd_Subjectivities8 = By.xpath("//input[@name='EOPE00GEN0019' and @value='N']");
	public static final By Rd_AddSub1 = By.xpath("//input[@name='X00ADS9901YESNO' and @value='N']");
	public static final By Rd_AddSub2 = By.xpath("//input[@name='X00ADS9902YESNO' and @value='N']");
	public static final By Rd_AddSub3 = By.xpath("//input[@name='X00ADS9903YESNO' and @value='N']");
	public static final By Rd_AddSub4 = By.xpath("//input[@name='X00ADS9904YESNO' and @value='N']");
	public static final By Rd_AddSub5 = By.xpath("//input[@name='X00ADS9905YESNO' and @value='N']");

	public static final By priorLitigationDt = By.xpath("//*[@name='prlitdte']");
	public static final By priorActsNo = By.xpath("//*[@name='priact' and @value='N']");
	public static final By priorActsYes = By.xpath("//*[@name='priact' and @value='Y']");


	//UW-Prev Insurance
	public static final By lnkPrevInsTEO = By.xpath("//td[@id='txtPRI']"); 
	public static final By RdInsuranceCov = By.xpath("//input[@id='curcov' and @value='N']");

	//UW-Claims
	public static final By lnkClaimTEO = By.xpath("//td[@id='txtCLM']"); 

	public static final By Rd_AppInsuredCustomer = By.xpath("//input[@id='custcmpl' and @value='N']");
	public static final By Rd_DeleiveryLate = By.xpath("//input[@id='delvrind' and @value='N']");
	public static final By Rd_AppInsuredContent = By.xpath("//input[@id='actlfact' and @value='N']");
	public static final By Rd_AppVoilations = By.xpath("//input[@id='invstgt' and @value='N']");
	public static final By Rd_AppClaimsMade = By.xpath("//input[@id='clmsmade' and @value='N']");
	public static final By Rd_AppPredecessors = By.xpath("//input[@id='prdssrcl' and @value='N']");
	public static final By Rd_AppAffiliates = By.xpath("//input[@id='affltcl' and @value='N']");
	public static final By Rd_AppPastPartners = By.xpath("//input[@id='emplcl' and @value='N']");
	public static final By Rd_AppSued = By.xpath("//input[@id='nonpaysd' and @value='N']");
	public static final By Rd_AppDiscontinuedService = By.xpath("//input[@id='dscntsprt' and @value='N']");
	public static final By Rd_AppResult = By.xpath("//input[@id='cmplndspt' and @value='N']");
	public static final By Rd_AppSecurityBreach = By.xpath("//input[@id='secbrch' and @value='N']");
	public static final By Rd_AppPrivacyViolation = By.xpath("//input[@id='prvcyvltn' and @value='N']");
	public static final By Rd_AppReceivedNotice = By.xpath("//input[@id='cmplprvp' and @value='N']");

	//UW-ERO
	public static final By lnkERO = By.xpath("//td[@id='txtERO']");
	public static final By txtWhatYouDo = By.xpath("//textarea[@id='svcprovide']");
	public static final By txtMfgDesignProduct = By.xpath("//input[@id='mnftdsgn']");
	public static final By txtResaleHPs = By.xpath("//input[@id='resalehrdw']");
	public static final By txtInstallMaintHPs = By.xpath("//input[@id='insthrdw']");
	public static final By txtPrepackageSPs = By.xpath("//input[@id='sftwdevsl']");
	public static final By txtCustomSps = By.xpath("//input[@id='cstmprgm']");
	public static final By txtInstallMaintSPs = By.xpath("//input[@id='sftwinst']");
	public static final By txtASPSPs = By.xpath("//input[@id='aspsrvc']");
	public static final By txtWebsiteSPs = By.xpath("//input[@id='webdssrvc']");
	public static final By txtInternetAccessCCS = By.xpath("//input[@id='webaccess']");
	public static final By txtTeleCommServiceCCS = By.xpath("//input[@id='telecmsrvc']");
	public static final By txtIESeracgCCS = By.xpath("//input[@id='websearch']");
	public static final By txtITNetworking = By.xpath("//input[@id='sysmngmt']");
	public static final By txtITSecurity = By.xpath("//input[@id='secsrvc']");
	public static final By txtITConsulting = By.xpath("//input[@id='cnsltsrvs']");
	public static final By txtITStaffing = By.xpath("//input[@id='staffsrvc']");
	public static final By txtWhoDoYouDoItFor1 = By.xpath("//input[@id='fedgvrnm']");
	public static final By txtWhoDoYouDoItFor2 = By.xpath("//input[@id='lclgvrnm']");
	public static final By txtWhoDoYouDoItFor3 = By.xpath("//input[@id='biotech']");
	public static final By txtWhoDoYouDoItFor4 = By.xpath("//input[@id='hlthcare']");
	public static final By txtWhoDoYouDoItFor5 = By.xpath("//input[@id='entrtmnt']");
	public static final By txtWhoDoYouDoItFor6 = By.xpath("//input[@id='infotech']");
	public static final By txtWhoDoYouDoItFor7 = By.xpath("//input[@id='aviation']");
	public static final By txtWhoDoYouDoItFor8 = By.xpath("//input[@id='finsrvcs']");
	public static final By txtWhoDoYouDoItFor9 = By.xpath("//input[@id='insurnce']");
	public static final By txtWhoDoYouDoItFor10 = By.xpath("//input[@id='industrl']");
	public static final By txtWhoDoYouDoItFor11 = By.xpath("//input[@id='lawfrms']");
	public static final By txtWhoDoYouDoItFor12 = By.xpath("//input[@id='othrindr']");
	public static final By txtWhatDoesItDo = By.xpath("//textarea[@id='widprsvc']");
	public static final By txtWWhatItDoes1 = By.xpath("//input[@id='medprps']");
	public static final By txtWWhatItDoes2 = By.xpath("//input[@id='aerospapp']");
	public static final By txtWWhatItDoes3 = By.xpath("//input[@id='dfnsapp']");
	public static final By txtWWhatItDoes4 = By.xpath("//input[@id='edctnprps']");
	public static final By txtWWhatItDoes5 = By.xpath("//input[@id='firesec']");
	public static final By txtWWhatItDoes6 = By.xpath("//input[@id='syssecur']");
	public static final By txtWWhatItDoes7 = By.xpath("//input[@id='sysadmin']");
	public static final By txtWWhatItDoes8 = By.xpath("//input[@id='busintlg']");
	public static final By txtWWhatItDoes9 = By.xpath("//input[@id='commctapp']");
	public static final By txtWWhatItDoes10 = By.xpath("//input[@id='fintrapp']");
	public static final By txtWWhatItDoes11 = By.xpath("//input[@id='acctgapp']");
	public static final By txtWWhatItDoes12 = By.xpath("//input[@id='adminapp']");
	public static final By txtWWhatItDoes13 = By.xpath("//input[@id='physcprc']");
	public static final By txtWWhatItDoes14 = By.xpath("//input[@id='multimed']");
	public static final By txtWWhatItDoes15 = By.xpath("//input[@id='sclntwk']");

	public static final By txtRiskMgmControl1 = By.xpath("//input[@id='custcnmdn']");
	public static final By txtRiskMgmControl2 = By.xpath("//input[@id='custcnmd']");
	public static final By txtRiskMgmControl3 = By.xpath("//input[@id='custpcmdn']");
	public static final By txtRiskMgmControl4 = By.xpath("//input[@id='custpcmd']");
	public static final By txtRiskMgmControl5 = By.xpath("//input[@id='nocntrct']");
	public static final By txtRiskMgmControlDescp = By.xpath("//textarea[@id='custuafd']");

	public static final By Rd_AppNegContractCus = By.xpath("//input[@id='cntrctlbl' and @value='N']");
	public static final By Rd_AppNegContractLiab = By.xpath("//input[@id='cntrnolbl' and @value='N']");
	public static final By lstLargContractSize = By.xpath("//select[@id='cntrlrg']");
	public static final By lstAvgContractSize = By.xpath("//select[@id='cntravg']");
	public static final By lstLargContractSizeClass = By.xpath("//select[@id='cntrlrgcls']");
	public static final By lstAvgContractSizeClass = By.xpath("//select[@id='cntravgcls']");
	public static final By lstLargContractSizeTermLength = By.xpath("//select[@id='cntrlrglen']");
	public static final By lstAvgContractSizeTermLength = By.xpath("//select[@id='cntravglen']");
	public static final By Rd_AppPurchEOIns = By.xpath("//input[@id='prchins' and @value='N']");
	public static final By Lst_EOlimit = By.xpath("//select[@id='mpllmt']");
	public static final By Lst_DataPrivacyLimit = By.xpath("//select[@id='dnlmt']");
	public static final By Lst_IntPropLimit = By.xpath("//select[@id='intproplmt']");
	public static final By Lst_FirstPartyExpLim = By.xpath("//select[@id='teclmt']");

	public static final By chkSSNIR = By.xpath("//input[@id='ssnbr']");
	public static final By chkHealthcareRecordsIR = By.xpath("//input[@id='crdtcrd']");
	public static final By chkPaymentCardInfoIR = By.xpath("//input[@id='drvrlic']");
	public static final By chkMedicalIdIR = By.xpath("//input[@id='finacct']");
	public static final By chkDriverLicenseIR = By.xpath("//input[@id='gvrnmid']");
	public static final By chkCreditRatingInfoIR = By.xpath("//input[@id='bmtrcd']");
	public static final By chkFinancialAccIR = By.xpath("//input[@id='medhlth']");
	public static final By chkUserNamePwdsIR = By.xpath("//input[@id='medid']");
	public static final By chkOtherGovtIdIR = By.xpath("//input[@id='crdrtg']");
	public static final By chkThirdPartyConfiDataIR = By.xpath("//input[@id='usrpsw']");
	public static final By chkBioMetricDataIR = By.xpath("//input[@id='trdpcnf']");

	public static final By txtSSNIR = By.xpath("//input[@id='ssnbrrn']");
	public static final By txtHealthcareRecordsIR = By.xpath("//input[@id='crdtcrdrn']");
	public static final By txtPaymentCardInfoIR = By.xpath("//input[@id='drvrlicrn']");	
	public static final By txtMedicalIdIR = By.xpath("//input[@id='finacctrn']");
	public static final By txtDriverLicenseIR = By.xpath("//input[@id='gvrnmidrn']");
	public static final By txtFinancialAccIR = By.xpath("//input[@id='bmtrcdrn']");
	public static final By txtCreditRatingInfoIR = By.xpath("//input[@id='medhlthrn']");
	public static final By txtUserNamePwdsIR = By.xpath("//input[@id='medidrn']");
	public static final By txtOtherGovtIdIR = By.xpath("//input[@id='crdrtgrn']");
	public static final By txtThirdPartyConfiDataIR = By.xpath("//input[@id='usrpswrn']");
	public static final By txtBioMetricDataIR = By.xpath("//input[@id='trdpcnfrn']");

	public static final By Rd_PHI = By.xpath("//input[@id='cypiictl' and @value='N']");
	public static final By Rd_AppBAHIPAA = By.xpath("//input[@id='cyhipaa' and @value='N']");
	public static final By Rd_AppOutsourceIT = By.xpath("//input[@id='itoutsrc' and @value='N']");
	public static final By chkContentAgg = By.xpath("//input[@id='cntntagg']");
	public static final By chkeCommerce = By.xpath("//input[@id='ecommerce']");
	//rating
	public static final By Rd_CyberScore = By.xpath("//input[@name='cyberind' and @value='Y']");
	public static final By Rd_BitSightScore = By.xpath("//input[@name='bitsgtind' and @value='Y']");
	public static final By Rd_CyenceScore = By.xpath("//input[@name='cycncind' and @value='Y']");
	public static final By Edt_CyberScore = By.xpath("//input[@id='cybersc']");
	public static final By Edt_BitSightScore = By.xpath("//input[@id='bitsgtsc']");
	public static final By Edt_CyenceScore = By.xpath("//input[@id='cycncsc']");
	public static final By Edt_ExpenseReduction = By.xpath("//input[@name='redcom']");
	public static final By Rd_Opt1Product = By.xpath("//input[@id='gigatera1' and @value='G']");
	public static final By Rd_Opt2Product = By.xpath("//input[@id='gigatera2' and @value='T']");
	public static final By Rd_Opt3Product = By.xpath("//input[@id='gigatera3' and @value='G']");
	public static final By Rd_Opt4Product = By.xpath("//input[@id='gigatera4' and @value='T']");
	public static final By Chk_QuoteOpt1 = By.xpath("//input[@id='optsel1']");
	public static final By Chk_QuoteOpt2 = By.xpath("//input[@id='optsel2']");
	//rating page - option 1
	public static final By txtOpt1LiabAgg = By.xpath("//input[@id='limagg1']");
	public static final By lstOpt1LiabAgg = By.xpath("//select[@id='dlimagg1']");
	public static final By txtOpt1WrgActLim = By.xpath("//input[@id='erolmt1']");
	public static final By lstOpt1WrgActLim = By.xpath("//select[@id='derolmt1']");
	public static final By txtOpt1WrgActRet = By.xpath("//input[@id='eroret1']");
	public static final By lstOpt1WrgActRet = By.xpath("//select[@id='deroret1']");

	public static final By Chk_Opt1FPCov = By.xpath("//input[@name='fppcybi1']");

	public static final By Edt_Opt1FPAggLim = By.xpath("//input[@id='fppagg1']");
	public static final By lstOpt1FPAggLim = By.xpath("//select[@id='dfppagg1']");

	public static final By Edt_Opt1CME_Lim = By.xpath("//input[@id='cmelmt1']");
	public static final By Edt_Opt1CME_Ret = By.xpath("//input[@id='cmeret1']");
	public static final By Edt_Opt1CIE_Lim = By.xpath("//input[@id='cielmt1']");
	public static final By Edt_Opt1CIE_Ret = By.xpath("//input[@id='cieret1']");
	public static final By Edt_Opt1DPRE_Lim = By.xpath("//input[@id='dpelmt1']");
	public static final By Edt_Opt1DPRE_Ret = By.xpath("//input[@id='dperet1']");
	public static final By Edt_Opt1NIPE_Lim = By.xpath("//input[@id='niplmt1']");
	public static final By Edt_Opt1NIPE_Ret = By.xpath("//input[@id='nipret1']");
	public static final By Edt_Opt1PCIE_Lim = By.xpath("//input[@id='pcilmt1']");
	public static final By Edt_Opt1PCIE_Ret = By.xpath("//input[@id='pciret1']");
	public static final By Edt_Opt1CEE_Lim = By.xpath("//input[@id='cellmt1']");
	public static final By Edt_Opt1CEE_Ret = By.xpath("//input[@id='celret1']");
	public static final By Edt_Opt1BIL_Lim = By.xpath("//input[@id='billmt1']");
	public static final By Edt_Opt1BIL_Ret = By.xpath("//input[@id='bilret1']");
	public static final By lstOpt1RP = By.xpath("//select[@id='birstrpd1']");
	public static final By lstOpt1WP = By.xpath("//select[@id='biwprdh1']");
	public static final By Edt_Opt1DBIL_Lim = By.xpath("//input[@id='dbilmt1']");
	public static final By Edt_Opt1DBIL_Ret = By.xpath("//input[@id='dbiret1']");
	public static final By lstOpt1RP1 = By.xpath("//select[@id='dbirstrpd1']");
	public static final By lstOpt1WP1 = By.xpath("//select[@id='dbiwprdh1']");
	public static final By Edt_Opt1DRE_Lim = By.xpath("//input[@id='drelmt1']");
	public static final By Edt_Opt1DRE_Ret = By.xpath("//input[@id='dreret1']");
	public static final By Edt_Opt1TLDE_Lim = By.xpath("//input[@id='tldlmt1']");
	public static final By Edt_Opt1TLDE_Ret = By.xpath("//input[@id='tldret1']");
	public static final By lstOpt1TLDE_Lim = By.xpath("//select[@id='dtldlmt1']");
	public static final By lstOpt1CME_Ret = By.xpath("//select[@id='dtldret1']");

	//option 2
	public static final By txtOpt2LiabAgg = By.xpath("//input[@id='limagg2']");
	public static final By lstOpt2LiabAgg = By.xpath("//select[@id='dlimagg2']");
	public static final By txtOpt2WrgActLim = By.xpath("//input[@id='erolmt2']");
	public static final By lstOpt2WrgActLim = By.xpath("//select[@id='derolmt2']");
	public static final By txtOpt2WrgActRet = By.xpath("//input[@id='eroret2']");
	public static final By lstOpt2WrgActRet = By.xpath("//select[@id='deroret2']");

	public static final By Chk_Opt2FPCov = By.xpath("//input[@name='fppcybi2']");

	public static final By Edt_Opt2FPAggLim = By.xpath("//input[@id='fppagg2']");
	public static final By lstOpt2FPAggLim = By.xpath("//select[@id='dfppagg2']");

	public static final By Edt_Opt2CME_Lim = By.xpath("//input[@id='cmelmt2']");
	public static final By Edt_Opt2CME_Ret = By.xpath("//input[@id='cmeret2']");
	public static final By Edt_Opt2CIE_Lim = By.xpath("//input[@id='cielmt2']");
	public static final By Edt_Opt2CIE_Ret = By.xpath("//input[@id='cieret2']");
	public static final By Edt_Opt2DPRE_Lim = By.xpath("//input[@id='dpelmt2']");
	public static final By Edt_Opt2DPRE_Ret = By.xpath("//input[@id='dperet2']");
	public static final By Edt_Opt2NIPE_Lim = By.xpath("//input[@id='niplmt2']");
	public static final By Edt_Opt2NIPE_Ret = By.xpath("//input[@id='nipret2']");
	public static final By Edt_Opt2PCIE_Lim = By.xpath("//input[@id='pcilmt2']");
	public static final By Edt_Opt2PCIE_Ret = By.xpath("//input[@id='pciret2']");
	public static final By Edt_Opt2CEE_Lim = By.xpath("//input[@id='cellmt2']");
	public static final By Edt_Opt2CEE_Ret = By.xpath("//input[@id='celret2']");
	public static final By Edt_Opt2BIL_Lim = By.xpath("//input[@id='billmt2']");
	public static final By Edt_Opt2BIL_Ret = By.xpath("//input[@id='bilret2']");
	public static final By lstOpt2RP = By.xpath("//select[@id='birstrpd2']");
	public static final By lstOpt2WP = By.xpath("//select[@id='biwprdh2']");
	public static final By Edt_Opt2DBIL_Lim = By.xpath("//input[@id='dbilmt2']");
	public static final By Edt_Opt2DBIL_Ret = By.xpath("//input[@id='dbiret2']");
	public static final By lstOpt2RP1 = By.xpath("//select[@id='dbirstrpd2']");
	public static final By lstOpt2WP1 = By.xpath("//select[@id='dbiwprdh2']");
	public static final By Edt_Opt2DRE_Lim = By.xpath("//input[@id='drelmt2']");
	public static final By Edt_Opt2DRE_Ret = By.xpath("//input[@id='dreret2']");
	public static final By Edt_Opt2TLDE_Lim = By.xpath("//input[@id='tldlmt2']");
	public static final By Edt_Opt2TLDE_Ret = By.xpath("//input[@id='tldret2']");
	public static final By lstOpt2TLDE_Lim = By.xpath("//select[@id='dtldlmt2']");
	public static final By lstOpt2CME_Ret = By.xpath("//select[@id='dtldret2']");
	//option 3
	public static final By txtOpt3LiabAgg = By.xpath("//input[@id='limagg3']");
	public static final By lstOpt3LiabAgg = By.xpath("//select[@id='dlimagg3']");
	public static final By txtOpt3WrgActLim = By.xpath("//input[@id='erolmt3']");
	public static final By lstOpt3WrgActLim = By.xpath("//select[@id='derolmt3']");
	public static final By txtOpt3WrgActRet = By.xpath("//input[@id='eroret3']");
	public static final By lstOpt3WrgActRet = By.xpath("//select[@id='deroret3']");

	public static final By Chk_Opt3FPCov = By.xpath("//input[@name='fppcybi3']");

	public static final By Edt_Opt3FPAggLim = By.xpath("//input[@id='fppagg3']");
	public static final By lstOpt3FPAggLim = By.xpath("//select[@id='dfppagg3']");

	public static final By Edt_Opt3CME_Lim = By.xpath("//input[@id='cmelmt3']");
	public static final By Edt_Opt3CME_Ret = By.xpath("//input[@id='cmeret3']");
	public static final By Edt_Opt3CIE_Lim = By.xpath("//input[@id='cielmt3']");
	public static final By Edt_Opt3CIE_Ret = By.xpath("//input[@id='cieret3']");
	public static final By Edt_Opt3DPRE_Lim = By.xpath("//input[@id='dpelmt3']");
	public static final By Edt_Opt3DPRE_Ret = By.xpath("//input[@id='dperet3']");
	public static final By Edt_Opt3NIPE_Lim = By.xpath("//input[@id='niplmt3']");
	public static final By Edt_Opt3NIPE_Ret = By.xpath("//input[@id='nipret3']");
	public static final By Edt_Opt3PCIE_Lim = By.xpath("//input[@id='pcilmt3']");
	public static final By Edt_Opt3PCIE_Ret = By.xpath("//input[@id='pciret3']");
	public static final By Edt_Opt3CEE_Lim = By.xpath("//input[@id='cellmt3']");
	public static final By Edt_Opt3CEE_Ret = By.xpath("//input[@id='celret3']");
	public static final By Edt_Opt3BIL_Lim = By.xpath("//input[@id='billmt3']");
	public static final By Edt_Opt3BIL_Ret = By.xpath("//input[@id='bilret3']");
	public static final By lstOpt3RP = By.xpath("//select[@id='birstrpd3']");
	public static final By lstOpt3WP = By.xpath("//select[@id='biwprdh3']");
	public static final By Edt_Opt3DBIL_Lim = By.xpath("//input[@id='dbilmt3']");
	public static final By Edt_Opt3DBIL_Ret = By.xpath("//input[@id='dbiret3']");
	public static final By lstOpt3RP1 = By.xpath("//select[@id='dbirstrpd3']");
	public static final By lstOpt3WP1 = By.xpath("//select[@id='dbiwprdh3']");
	public static final By Edt_Opt3DRE_Lim = By.xpath("//input[@id='drelmt3']");
	public static final By Edt_Opt3DRE_Ret = By.xpath("//input[@id='dreret3']");
	public static final By Edt_Opt3TLDE_Lim = By.xpath("//input[@id='tldlmt3']");
	public static final By Edt_Opt3TLDE_Ret = By.xpath("//input[@id='tldret3']");
	public static final By lstOpt3TLDE_Lim = By.xpath("//select[@id='dtldlmt3']");
	public static final By lstOpt3CME_Ret = By.xpath("//select[@id='dtldret3']");
	//option 4
	public static final By txtOpt4LiabAgg = By.xpath("//input[@id='limagg4']");
	public static final By lstOpt4LiabAgg = By.xpath("//select[@id='dlimagg4']");
	public static final By txtOpt4WrgActLim = By.xpath("//input[@id='erolmt4']");
	public static final By lstOpt4WrgActLim = By.xpath("//select[@id='derolmt4']");
	public static final By txtOpt4WrgActRet = By.xpath("//input[@id='eroret4']");
	public static final By lstOpt4WrgActRet = By.xpath("//select[@id='deroret4']");

	public static final By Chk_Opt4FPCov = By.xpath("//input[@name='fppcybi4']");

	public static final By Edt_Opt4FPAggLim = By.xpath("//input[@id='fppagg4']");
	public static final By lstOpt4FPAggLim = By.xpath("//select[@id='dfppagg4']");

	public static final By Edt_Opt4CME_Lim = By.xpath("//input[@id='cmelmt4']");
	public static final By Edt_Opt4CME_Ret = By.xpath("//input[@id='cmeret4']");
	public static final By Edt_Opt4CIE_Lim = By.xpath("//input[@id='cielmt4']");
	public static final By Edt_Opt4CIE_Ret = By.xpath("//input[@id='cieret4']");
	public static final By Edt_Opt4DPRE_Lim = By.xpath("//input[@id='dpelmt4']");
	public static final By Edt_Opt4DPRE_Ret = By.xpath("//input[@id='dperet4']");
	public static final By Edt_Opt4NIPE_Lim = By.xpath("//input[@id='niplmt4']");
	public static final By Edt_Opt4NIPE_Ret = By.xpath("//input[@id='nipret4']");
	public static final By Edt_Opt4PCIE_Lim = By.xpath("//input[@id='pcilmt4']");
	public static final By Edt_Opt4PCIE_Ret = By.xpath("//input[@id='pciret4']");
	public static final By Edt_Opt4CEE_Lim = By.xpath("//input[@id='cellmt4']");
	public static final By Edt_Opt4CEE_Ret = By.xpath("//input[@id='celret4']");
	public static final By Edt_Opt4BIL_Lim = By.xpath("//input[@id='billmt4']");
	public static final By Edt_Opt4BIL_Ret = By.xpath("//input[@id='bilret4']");
	public static final By lstOpt4RP = By.xpath("//select[@id='birstrpd4']");
	public static final By lstOpt4WP = By.xpath("//select[@id='biwprdh4']");
	public static final By Edt_Opt4DBIL_Lim = By.xpath("//input[@id='dbilmt4']");
	public static final By Edt_Opt4DBIL_Ret = By.xpath("//input[@id='dbiret4']");
	public static final By lstOpt4RP1 = By.xpath("//select[@id='dbirstrpd4']");
	public static final By lstOpt4WP1 = By.xpath("//select[@id='dbiwprdh4']");
	public static final By Edt_Opt4DRE_Lim = By.xpath("//input[@id='drelmt4']");
	public static final By Edt_Opt4DRE_Ret = By.xpath("//input[@id='dreret4']");
	public static final By Edt_Opt4TLDE_Lim = By.xpath("//input[@id='tldlmt4']");
	public static final By Edt_Opt4TLDE_Ret = By.xpath("//input[@id='tldret4']");
	public static final By lstOpt4TLDE_Lim = By.xpath("//select[@id='dtldlmt4']");
	public static final By lstOpt4CME_Ret = By.xpath("//select[@id='dtldret4']");
	//retro date and coverage
	public static final By txtCME = By.xpath("//input[@id='cmeretdt']");
	public static final By txtCIE = By.xpath("//input[@id='cieretdt']");
	public static final By txtDPRE = By.xpath("//input[@id='dperetdt']");
	public static final By txtNIPE = By.xpath("//input[@id='nipretdt']");
	public static final By txtPCIE = By.xpath("//input[@id='pciretdt']");

	public static final By txtCMEYPA = By.xpath("//input[@id='cmepract']");
	public static final By txtCIEYPA = By.xpath("//input[@id='ciepract']");
	public static final By txtDPREYPA = By.xpath("//input[@id='dpepract']");
	public static final By txtNIPEYPA = By.xpath("//input[@id='nippract']");
	public static final By txtPCIEYPA = By.xpath("//input[@id='pcipract']");

	//forms impact
	public static final By chkFPEE1 = By.xpath("//input[@id='FPPEDSCHK1']");
	public static final By chkFPEE2 = By.xpath("//input[@id='FPPEDSCHK2']");
	public static final By chkFPEE3 = By.xpath("//input[@id='FPPEDSCHK3']");
	public static final By chkFPEE4 = By.xpath("//input[@id='FPPEDSCHK4']");
	public static final By chkIPEOG1 = By.xpath("//input[@id='PRVCEDSCHK1']");
	public static final By chkIPEOG3 = By.xpath("//input[@id='PRVCEDSCHK3']");
	public static final By chkICEOG1 = By.xpath("//input[@id='CNTEDSCHK1']");
	public static final By chkICEOG3 = By.xpath("//input[@id='CNTEDSCHK3']");
	public static final By chkFPTLDSE1 = By.xpath("//input[@id='TLDEDSCHK1']");
	public static final By chkFPTLDSE2 = By.xpath("//input[@id='TLDEDSCHK2']");
	public static final By chkFPTLDSE3 = By.xpath("//input[@id='TLDEDSCHK3']");
	public static final By chkFPTLDSE4 = By.xpath("//input[@id='TLDEDSCHK4']");

	public static final By lstTLDSC = By.xpath("//select[@id='TLDSRVCLD']");
	public static final By Edt_TLDUWJ = By.xpath("//input[@name='TLDJSFCTFCT']");
	public static final By Rd_rate = By.xpath("//input[@name='ratebutton']");
	//premium
	public static final By PremiumOpt1TEO = By.xpath("//input[@name='ratedprm1']");
	public static final By PremiumOpt2TEO = By.xpath("//input[@name='ratedprm2']");
	public static final By PremiumOpt3TEO = By.xpath("//input[@name='ratedprm3']");
	public static final By PremiumOpt4TEO = By.xpath("//input[@name='ratedprm4']");
	//quote
	public static final By btnManFromTEO = By.xpath("//img[@src='http://hfdev.thehartford.com:17777/VIS/images/icons/TPMax2.gif']");
	public static final By ManformTEO = By.xpath("//td[@onclick='showOptForm('FS00G00200')']");

	public static final By txtExpReduction = By.xpath("//input[@name='']");
	public static final By txtFinalBrokerComm = By.xpath("//input[@name='']");
	public static final By btnQuoteLetter = By.xpath("//input[@name='objletter2']");

	//bind
	public static final By btnTieIn = By.xpath("//input[@name='abstien' and @value='Y']");
	public static final By btnPolicyNum = By.xpath("//input[@name='']");
	public static final By txtPolicyNum = By.xpath("//span[@id='policyId']");
	public static final By btnBillMethod = By.xpath("//input[@name='agytyp' and @value='B']");
	
	public static final By btnManFormBind = By.xpath("//img[contains(@src,'/VIS/images/icons/TPMax2.gif')]");
	
	
	public static final By btnBindLetter = By.xpath("//input[@name='objletter']");
	public static final By lstManagerApp = By.xpath("//select[@name='finlaprv']");
	
	public static final By lstInsuredType_Bill = By.xpath("//select[@name='instyp']");
	public static final By lstISOClassCode = By.xpath("//select[@name='clasx']");
	public static final By lstPaymentPlan_Bill = By.xpath("//select[@name='paypln']");
	
	/**********************EPL Excess Underwriter********************************/
	//Previous Insurance
	public static final By lstCurrentCarrier1 = By.xpath("//select[@name='carrier']");
	public static final By txtPolicyPeriodFrom = By.xpath("//input[@name='prveff']");
	public static final By txtPolicyPeriodTo = By.xpath("//input[@name='prvexp']");
	public static final By txtPremiumEPL = By.xpath("//input[@name='prvprem']");
	public static final By txtLimitsEPL = By.xpath("//input[@name='plimits']");
	public static final By txtPartOfLimits = By.xpath("//input[@name='ppartof']");
	public static final By txtRetentionEPL = By.xpath("//input[@name='pdsamt']");
	public static final By txtTermsCond = By.xpath("//textarea[@name='termcond']");
	
	//General Information
	public static final By txtSubNoticeStartDate = By.xpath("//input[@name='subjincdte']");
	public static final By btnPublicEPL = By.xpath("//input[@name='pubpri']");
	public static final By btnAdmittedEPL = By.xpath("//input[@name='admitted']");
	public static final By txtSICCOdeEPL = By.xpath("//input[@name='siccod']");
	public static final By txtBusinessDesc = By.xpath("//textarea[@name='busdesc']");
	
	//Marketing Information
	public static final By btnWriteForDNOYes = By.xpath("//input[@name='linedo' and @value='Y']");
	public static final By btnWriteForDNONo = By.xpath("//input[@name='linedo' and @value='N']");
	public static final By btnWriteForENOYes = By.xpath("//input[@name='lineeo' and @value='Y']");
	public static final By btnWriteForENONo = By.xpath("//input[@name='lineeo' and @value='N']");
	public static final By btnWriteForFidYes = By.xpath("//input[@name='linefid' and @value='Y']");
	public static final By btnWriteForFidNo = By.xpath("//input[@name='linefid' and @value='N']");
	public static final By btnWriteForOtherYes = By.xpath("//input[@name='lineotr' and @value='Y']");
	public static final By btnWriteForOtherNo = By.xpath("//input[@name='lineotr' and @value='N']");
	public static final By btnWriteForOtherUnknown = By.xpath("//input[@name='lineotr' and @value='O']");
	
	//Employee Information
	public static final By txtCurrentYear = By.xpath("//input[@name='currempl']");
	public static final By txtLastYear = By.xpath("//input[@name='lastempl']");
	public static final By txtFullTimeEmpl = By.xpath("//input[@name='fullempl']");
	public static final By txtPartTimeEmpl = By.xpath("//input[@name='partempl']");
	public static final By btnAnyEmpContractYes = By.xpath("//input[@name='emplcntr' and @value='Y']");
	public static final By btnAnyEmpContractNo = By.xpath("//input[@name='emplcntr' and @value='N']");
	
	//Human Resources Information
	public static final By txtNumOfEmpInHR = By.xpath("//input[@name='humrempl']");
	public static final By txtHRReport = By.xpath("//input[@name='hrrept']");
	public static final By btnCentralizedDiv = By.xpath("//input[@name='centrldv' and @value='Y']");
	public static final By btnDecDiv = By.xpath("//input[@name='centrldv' and @value='N']");
	public static final By btnEmpHandbookYes = By.xpath("//input[@name='emplhdbk' and @value='Y']");
	public static final By btnEmpHandbookNo = By.xpath("//input[@name='emplhdbk' and @value='N']");
	public static final By btnTerPolicyYes = By.xpath("//input[@name='termintn' and @value='Y']");
	public static final By btnTerPolicyNo = By.xpath("//input[@name='termintn' and @value='N']");
	public static final By btnHRTermYes = By.xpath("//input[@name='hrtermin' and @value='Y']");
	public static final By btnHRTermNo = By.xpath("//input[@name='hrtermin' and @value='N']");
	public static final By btnInHouseCounselYes = By.xpath("//input[@name='ihtermin' and @value='Y']");
	public static final By btnInHouseCounselNo = By.xpath("//input[@name='ihtermin' and @value='N']");
	public static final By btnOutsideCouncilYes = By.xpath("//input[@name='octermin' and @value='Y']");
	public static final By btnOutsideCouncilNo = By.xpath("//input[@name='octermin' and @value='N']");
	public static final By txtOutCouncilComment = By.xpath("//textarea[@name='octerminn']");
	public static final By btnAffrPolicyYes = By.xpath("//input[@name='affrmact' and @value='Y']");
	public static final By btnAffrPolicyNo = By.xpath("//input[@name='affrmact' and @value='N']");
	public static final By btnMandArbitrationYes = By.xpath("//input[@name='marbritn' and @value='Y']");
	public static final By btnMandArbitrationNo = By.xpath("//input[@name='marbritn' and @value='N']");
	public static final By btnMandArbitrationNA = By.xpath("//input[@name='marbritn' and @value='X']");
	
	public static final By btnAllApplicantsYes = By.xpath("//input[@name='allapplc' and @value='Y']");
	public static final By btnAllApplicantsNo = By.xpath("//input[@name='allapplc' and @value='N']");
	public static final By btnUniformOperationsYes = By.xpath("//input[@name='unfapplc' and @value='Y']");
	public static final By btnUniformOperationsNo = By.xpath("//input[@name='unfapplc' and @value='N']");
	public static final By btnInappQuesYes = By.xpath("//input[@name='inapprqu' and @value='Y']");
	public static final By btnInappQuesNo = By.xpath("//input[@name='inapprqu' and @value='N']");
	public static final By btnPreEmpTestingYes = By.xpath("//input[@name='pstemplm' and @value='Y']");
	public static final By btnPreEmpTestingNo = By.xpath("//input[@name='pstemplm' and @value='N']");
	
	public static final By btnOrientationPrgmYes = By.xpath("//input[@name='trnorien' and @value='Y']");
	public static final By btnOrientationPrgmNo = By.xpath("//input[@name='trnorien' and @value='N']");
	public static final By btnSexHarrassmentYes = By.xpath("//input[@name='trnsexhs' and @value='Y']");
	public static final By btnSexHarrassmentNo = By.xpath("//input[@name='trnsexhs' and @value='N']");
	public static final By txtSexTrainCmnt = By.xpath("//textarea[@name='trnsexhsn']");
	public static final By btnMngmtTrainYes = By.xpath("//input[@name='trnmangm' and @value='Y']");
	public static final By btnMngmtTrainNo = By.xpath("//input[@name='trnmangm' and @value='N']");
	public static final By txtMngmtTrainCmnt = By.xpath("//textarea[@name='trnmangmn']");
	
	public static final By btnCondForAllEmpYes = By.xpath("//input[@name='annperfm' and @value='Y']");
	public static final By btnCondForAllEmpNo = By.xpath("//input[@name='annperfm' and @value='N']");
	public static final By btnStandRatingsYes = By.xpath("//input[@name='stdratng' and @value='Y']");
	public static final By btnStandRatingsNo = By.xpath("//input[@name='stdratng' and @value='N']");
	
	public static final By btnChangesInMgmtYes = By.xpath("//input[@name='mngmtchg' and @value='Y']");
	public static final By btnChangesInMgmtNo = By.xpath("//input[@name='mngmtchg' and @value='N']");
	public static final By btnWrkfrceRedYes = By.xpath("//input[@name='wfreduce' and @value='Y']");
	public static final By btnWrkfrceRedNo = By.xpath("//input[@name='wfreduce' and @value='N']");
	public static final By btnRedPlannedYes = By.xpath("//input[@name='wfplanrd' and @value='Y']");
	public static final By btnRedPlannedNo = By.xpath("//input[@name='wfplanrd' and @value='N']");
	public static final By btnMergerYes = By.xpath("//input[@name='wfmerger' and @value='Y']");
	public static final By btnMergerNo = By.xpath("//input[@name='wfmerger' and @value='N']");
	
	public static final By txtEmpTurnCurrYear = By.xpath("//input[@name='trnovrcu']");
	public static final By txtEmpTurnPriorYear = By.xpath("//input[@name='trnovrpr']");
	public static final By txtEmpTurnTwoYear = By.xpath("//input[@name='trnovrpv']");
	public static final By txtempComp50k = By.xpath("//input[@name='cmps000k']");
	public static final By txtempComp050k = By.xpath("//input[@name='cmps050k']");
	public static final By txtempComp100k = By.xpath("//input[@name='cmps100k']");
	public static final By txtempComp250k = By.xpath("//input[@name='cmps250k']");
	
	public static final By txtMarketCapFin = By.xpath("//input[@name='mrkcap']");
	public static final By txtTotAssetFin = By.xpath("//input[@name='asssiz']");
	public static final By txtRevenueFin = By.xpath("//input[@name='totrev']");
	public static final By btnGoingConcernYes = By.xpath("//input[@name='goconcrn' and @value='Y']");
	public static final By btnGoingConcernNo = By.xpath("//input[@name='goconcrn' and @value='N']");
	public static final By txtFinAssessment = By.xpath("//textarea[@name='finassmnt']");
	
	public static final By btnClassActionYes = By.xpath("//input[@name='classact' and @value='Y']");
	public static final By btnClassActionNo = By.xpath("//input[@name='classact' and @value='N']");
	public static final By btnOfccAuditYes = By.xpath("//input[@name='ofccpinv' and @value='Y']");
	public static final By btnOfccAuditNo = By.xpath("//input[@name='ofccpinv' and @value='N']");
	
	public static final By btnWarrantyStatementYes = By.xpath("//input[@name='EPLX00OTH0029' and @value='Y']");
	public static final By btnWarrantyStatementNo = By.xpath("//input[@name='EPLX00OTH0029' and @value='N']");
	public static final By btnWarrantyStatementNA = By.xpath("//input[@name='EPLX00OTH0029' and @value='X']");
	public static final By btnSignApplicationYes = By.xpath("//input[@name='EPLX00EPL0001' and @value='Y']");
	public static final By btnSignApplicationNo = By.xpath("//input[@name='EPLX00EPL0001' and @value='N']");
	public static final By btnSignApplicationNA = By.xpath("//input[@name='EPLX00EPL0001' and @value='X']");
	public static final By btnNexusInfoYes = By.xpath("//input[@name='EPLX00EPL0003' and @value='Y']");
	public static final By btnNexusInfoNo = By.xpath("//input[@name='EPLX00EPL0003' and @value='N']");
	public static final By btnNexusInfoNA = By.xpath("//input[@name='EPLX00EPL0003' and @value='X']");
	public static final By btnHandbookProcYes = By.xpath("//input[@name='EPLX00EPL0004' and @value='Y']");
	public static final By btnHandbookProcNo = By.xpath("//input[@name='EPLX00EPL0004' and @value='N']");
	public static final By btnHandbookProcNA = By.xpath("//input[@name='EPLX00EPL0004' and @value='X']");
	public static final By btnJobApplicationYes = By.xpath("//input[@name='EPLX00EPL0005' and @value='Y']");
	public static final By btnJobApplicationNo = By.xpath("//input[@name='EPLX00EPL0005' and @value='N']");
	public static final By btnJobApplicationNA = By.xpath("//input[@name='EPLX00EPL0005' and @value='X']");
	public static final By btnEEOReportYes = By.xpath("//input[@name='EPLX00EPL0006' and @value='Y']");
	public static final By btnEEOReportNo = By.xpath("//input[@name='EPLX00EPL0006' and @value='N']");
	public static final By btnEEOReportNA = By.xpath("//input[@name='EPLX00EPL0006' and @value='X']");
	public static final By btnClaimsHistoryYes = By.xpath("//input[@name='EPLX00EPL0009' and @value='Y']");
	public static final By btnClaimsHistoryNo = By.xpath("//input[@name='EPLX00EPL0009' and @value='N']");
	public static final By btnClaimsHistoryNA = By.xpath("//input[@name='EPLX00EPL0009' and @value='X']");
	public static final By btnSurplusLineProdFormYes = By.xpath("//input[@name='EPLX00OTH8000' and @value='Y']");
	public static final By btnSurplusLineProdFormNo = By.xpath("//input[@name='EPLX00OTH8000' and @value='N']");
	public static final By btnSurplusLineProdFormNA = By.xpath("//input[@name='EPLX00OTH8000' and @value='X']");
	public static final By btnInsuredSignAckYes = By.xpath("//input[@name='EPLE00GEN0019' and @value='Y']");
	public static final By btnInsuredSignAckNo = By.xpath("//input[@name='EPLE00GEN0019' and @value='N']");
	public static final By btnInsuredSignAckNA = By.xpath("//input[@name='EPLE00GEN0019' and @value='X']");
	
	public static final By btnThirdPartyYes = By.xpath("//input[@name='at3rdpty' and @value='Y']");
	public static final By btnThirdPartyNo = By.xpath("//input[@name='at3rdpty' and @value='N']");
	public static final By btnPriorActsCovYes = By.xpath("//input[@name='atpracts' and @value='Y']");
	public static final By btnPriorActsCovNo = By.xpath("//input[@name='atpracts' and @value='N']");
	
	public static final By txtLimOfLiability = By.xpath("//input[@name='exrlimit1']");
	public static final By txtLimOfLiability1 = By.xpath("//input[@name='exrlimag1']");
	public static final By txtPremiumEpl = By.xpath("//input[@name='exrpremp1']");
	public static final By txtPPLitiDate = By.xpath("//input[@name='ppdate1']");
	public static final By txtUnderlyingRetentionEPL = By.xpath("//input[@name='prisir']");
	public static final By chkFollowPol = By.xpath("//input[@name='priflwpol']");
	public static final By txtLitiDate = By.xpath("//input[@name='prippdate']");
	public static final By txtPrimaryCarr = By.xpath("//input[@name='pricarco']");
	
	public static final By txtPaper = By.xpath("//input[@name='pripaper']");
	public static final By txtLimitOfLiability = By.xpath("//input[@name='prilimit']");
	public static final By txtUnderlyingPremium = By.xpath("//input[@name='pripremp']");
	public static final By txt3rdPartySubLimit = By.xpath("//input[@name='sublim1']");
	public static final By tx3rdPartySubRetention = By.xpath("//input[@name='subrent1']");
	public static final By tx3rdPartyClsActionRet = By.xpath("//input[@name='carent1']");

	/**********************Primary Fid Private, MultiEmployer********************************/
	//General Insurance
	public static final By lstYearInBussiness = By.xpath("//select[@name='yrsbus']");
	
	public static final By btnAuditorsStmt1 = By.xpath("//input[@name='audsttyp1' and @value='D']");
	public static final By btnTypeOfPlan1 = By.xpath("//input[@name='plantype1' and @value='D']");
	public static final By btnCashBalance1Yes = By.xpath("//input[@name='cshbalpl1' and @value='Y']");
	public static final By btnCashBalance1No = By.xpath("//input[@name='cshbalpl1' and @value='N']");
	public static final By btnFundType1 = By.xpath("//input[@name='fundtype1' and @value='Y']");
	
	public static final By btnDelContribution1Yes = By.xpath("//input[@name='delcontr1' and @value='Y']");
	public static final By btnDelContribution1No = By.xpath("//input[@name='delcontr1' and @value='N']");
	
	public static final By btnInvChosen1 = By.xpath("//input[@name='invchoic1' and @value='T']");
	public static final By btnMasterTrust1Yes = By.xpath("//input[@name='mstrtrus1' and @value='Y']");
	public static final By btnMasterTrust1No = By.xpath("//input[@name='mstrtrus1' and @value='N']");
	
	public static final By btnAuditorsStmt2 = By.xpath("//input[@name='audsttyp2' and @value='D']");
	public static final By btnTypeOfPlan2 = By.xpath("//input[@name='plantype2' and @value='D']");
	public static final By btnTypeOfPlan401K2 = By.xpath("//input[@name='plantype2' and @value='K']");
	public static final By btnCashBalance2Yes = By.xpath("//input[@name='cshbalpl2' and @value='Y']");
	public static final By btnCashBalance2No = By.xpath("//input[@name='cshbalpl2' and @value='N']");
	public static final By btnFundType2 = By.xpath("//input[@name='fundtype2' and @value='Y']");
	
	public static final By btnDelContribution2Yes = By.xpath("//input[@name='delcontr2' and @value='Y']");
	public static final By btnDelContribution2No = By.xpath("//input[@name='delcontr2' and @value='N']");
	
	public static final By btnInvChosen2 = By.xpath("//input[@name='invchoic2' and @value='T']");
	public static final By btnMasterTrust2Yes = By.xpath("//input[@name='mstrtrus2' and @value='Y']");
	public static final By btnMasterTrust2No = By.xpath("//input[@name='mstrtrus2' and @value='N']");
	
	public static final By btnInvOptnsForEmp2Yes = By.xpath("//input[@name='empinvop2' and @value='Y']");
	public static final By btnInvOptnsForEmp2No = By.xpath("//input[@name='empinvop2' and @value='N']");
	
	public static final By btnInvMixChngFreq2 = By.xpath("//input[@name='planchgs2' and @value='A']");
	
	/**********************Primary Equity Choice Primary********************************/
	public static final By btnFreeZoneYesEquity = By.xpath("//input[@name='frtrzn' and @value='Y']");
	public static final By btnFreeZoneNoEquity = By.xpath("//input[@name='frtrzn' and @value='N']");
	public static final By txtNaicEquity = By.xpath("//input[@name='naiccode']");
	public static final By btnIndusFocusGroup4Equity = By.xpath("//input[@name='indfoc' and @value='4']");
	public static final By lstSubclassEquity = By.xpath("//select[@name='grpsub']");
	
	public static final By btnPreviousInsEquity = By.xpath("//td[text()='Previous Insurance']");
	public static final By btnProfServicesNoEquity = By.xpath("//input[@name='prfsrv' and @value='N']");
	
	public static final By btnDNOEquity = By.xpath("//td[@id='nbDNO']/span");
	public static final By btnEPLEquity = By.xpath("//td[@id='nbEPL']/span");
	public static final By btnFIDEquity = By.xpath("//td[@id='nbFID']/span");
	
}
