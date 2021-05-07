package adapters;

import java.rmi.RemoteException;

import business.abstracts.GamerCheckService;
import day4_task3.entities.concretes.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter implements GamerCheckService{

	@Override
	public boolean save(Gamer gamer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result=  client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalID()), gamer.getName().toUpperCase(), gamer.getSurname().toUpperCase(), Integer.parseInt(gamer.getDateOfBirth()));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
