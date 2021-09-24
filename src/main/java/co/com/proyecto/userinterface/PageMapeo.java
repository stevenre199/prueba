package co.com.proyecto.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.apache.tools.ant.taskdefs.Tar;


@DefaultUrl("https://serenity.is/demo/Account/Login/?ReturnUrl=%2Fdemo%2F")
public class PageMapeo extends PageObject {


    public static final Target USER_NAME = Target.the("El ingresa el usuario ").located(By.xpath("//*[@id=\"StartSharp_Membership_LoginPanel0_Username\"]"));
    public static final Target PASSWORD = Target.the("ingrese la contraseña").located(By.xpath("//*[@id=\"StartSharp_Membership_LoginPanel0_Password\"]"));
    public static final Target SIGN_IN = Target.the("Click en Sing").located(By.xpath("//*[@id=\"StartSharp_Membership_LoginPanel0_LoginButton\"]"));
    public static final Target ORGANIZATION = Target.the(" click en organization").located(By.xpath("//*[@id=\"SidebarMenu\"]/li[6]/a/span"));
    public static final Target BUSINESS_UNIT = Target.the("click en business unit ").located(By.xpath("//*[@id=\"SidebarMenu\"]/li[6]/ul/li[1]/a/span"));
    public static final Target NEW_BUSINESS = Target.the(" click en new business").located(By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div/span"));
    public static final Target NAME_BUSINESS = Target.the(" digite el name de business").located(By.xpath("//*[@id=\"StartSharp_Organization_BusinessUnitDialog7_Name\"]"));
    public static final Target SAVE_NEWBUS = Target.the(" Click en SAVE").located(By.xpath("(//SPAN[@class='button-inner'])[4]"));
    public static final Target MEETING_ON = Target.the("click en meeting ").located(By.xpath("//*[@id=\"SidebarMenu\"]/li[5]/a"));
    public static final Target MEETING = Target.the("click en meeting ").located(By.xpath("//*[@id=\"SidebarMenu\"]/li[5]/ul/li[1]/a"));
    public static final Target NEW_MEETING = Target.the("click en NEW meeting ").located(By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div/span"));
    public static final Target MEETING_NAME = Target.the("digite nombre de la reunion ").located(By.xpath("//*[@id=\"StartSharp_Meeting_MeetingDialog14_MeetingName\"]"));
    public static final Target CAL_START = Target.the("click en start date ").located(By.xpath("//*[@id=\"StartSharp_Meeting_MeetingDialog14_PropertyGrid\"]/div/div/div[4]/button/i"));
    public static final Target MES = Target.the("click en mes ").located(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]/option[2]"));
    public static final Target AÑO = Target.the("click en año ").located(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[2]/option[102]"));
    public static final Target DIA = Target.the("click en dia ").located(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[3]/a"));
    public static final Target HORA = Target.the("click hora ").located(By.xpath("//option[@value='14:00' and text()='14:00']"));
    public static final Target END_DATE = Target.the("Click en end date ").located(By.xpath("(//I[@class='fa fa-calendar'])[2]"));
    public static final Target MES_END = Target.the("seleccione mes ").located(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]/option[3]"));
    public static final Target AÑO_END = Target.the("seleccione año ").located(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[2]/option[103]"));
    public static final Target DIA_END = Target.the("seleccione dia ").located(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[5]/a"));
    public static final Target HORA_END = Target.the("seleccione hora ").located(By.xpath("//*[@id=\"StartSharp_Meeting_MeetingDialog14_PropertyGrid\"]/div/div/div[5]/select/option[174]"));
    public static final Target CLICK = Target.the("click meeting type").located(By.xpath("//SPAN[@id='select2-chosen-6']"));
    public static final Target CLICK_ON = Target.the("click en todos").located(By.xpath("//div[@class='select2-result-label' and text()='Todos' ]"));
    public static final Target SAVE_MEETING = Target.the("guarde reunion ").located(By.xpath("(//SPAN[@class='button-inner'])[4]"));
    public static final Target ID_MEETING = Target.the("finalize la reunion").located(By.xpath("//*[@id=\"GridDiv\"]/div[3]/div[4]/div[3]/div/div/div[2]/a"));


}







