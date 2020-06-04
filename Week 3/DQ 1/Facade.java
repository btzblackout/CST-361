
public class Facade 
{
	private static String blade, handle, hilt;
	public static void blackSmith(String weaponType)
	{
		 switch(weaponType)
		 {
		 	case "SWORD":
		 	{
		 		blade = Materials.getBlade(weaponType);
		 		handle = Materials.getHandle(weaponType);
		 		hilt = Materials.getHilt(weaponType);
		 		System.out.println(CreateSword.ForgeSword(blade, handle, hilt));
		 		break;
		 	}
		 	case "MACE":
		 	{
		 		blade = Materials.getBlade(weaponType);
		 		handle = Materials.getHandle(weaponType);
		 		hilt = Materials.getHilt(weaponType);
		 		System.out.println(CreateMace.ForgeMace(blade, handle, hilt));
		 		break;
		 	}
		 	case "AXE":
		 	{
		 		blade = Materials.getBlade(weaponType);
		 		handle = Materials.getHandle(weaponType);
		 		hilt = Materials.getHilt(weaponType);
		 		System.out.println(CreateAxe.ForgeAxe(blade, handle, hilt));
		 		break;
		 	}
		 	default:
		 	{
		 		System.out.print("Invalid choice, please choose between an axe, mace, or sword.");
		 	}
		 }
	}

}
