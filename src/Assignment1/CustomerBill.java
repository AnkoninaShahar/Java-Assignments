package Assignment1;

import java.util.Scanner;

public class CustomerBill
{
	public static void main(String[] args)
	{
		final float TV_PRICE = 400.00f;
		final float VCR_PRICE = 220.00f;
		final float REMOTE_CONTROLLER_PRICE = 35.20f;
		final float CD_PRICE = 300.00f;
		final float TAPE_RECORDER_PRICE = 150.00f;
		final float TAX_RATE = 0.0825f;
		
		int TVQuantity = 0;
		int VCRQuantity = 0;
		int remoteQuantity = 0;
		int CDQuantity = 0;
		int recorderQuantity = 0;
		
		float TVTotal = 0f;
		float VCRTotal = 0f;
		float remoteTotal = 0f;
		float CDTotal = 0f;
		float recorderTotal = 0f;
		
		float subtotal = 0f;
		float tax = 0f;
		float total = 0f;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many TV's were sold?");
		TVQuantity = in.nextInt();
		TVTotal = TVQuantity * TV_PRICE;
		
		System.out.println("How many VCR's were sold?");
		VCRQuantity = in.nextInt();
		VCRTotal = VCRQuantity * VCR_PRICE;
		
		System.out.println("How many remote controller's were sold?");
		remoteQuantity = in.nextInt();
		remoteTotal = remoteQuantity * REMOTE_CONTROLLER_PRICE;
		
		System.out.println("How many CD's were sold?");
		CDQuantity = in.nextInt();
		CDTotal = CDQuantity * CD_PRICE;
		
		System.out.println("How many Tape Recorder's were sold?");
		recorderQuantity = in.nextInt();
		recorderTotal = recorderQuantity * TAPE_RECORDER_PRICE;
		
		subtotal = TVTotal + VCRTotal + remoteTotal + CDTotal + recorderTotal;
		tax = subtotal * TAX_RATE;
		total = subtotal + tax;
		
		System.out.printf("QTY\t\tDESCRIPTION\t\tUNIT PRICE\t\tTOTAL PRICE\n");
		System.out.printf("%d\t\tTV\t\t\t$%.2f\t\t\t$%.2f\n", TVQuantity, TV_PRICE, TVTotal);
		System.out.printf("%d\t\tVCR\t\t\t$%.2f\t\t\t$%.2f\n", VCRQuantity, VCR_PRICE, VCRTotal);
		System.out.printf("%d\t\tRemote Controller\t$%.2f\t\t\t$%.2f\n", remoteQuantity, REMOTE_CONTROLLER_PRICE, remoteTotal);
		System.out.printf("%d\t\tCD\t\t\t$%.2f\t\t\t$%.2f\n", CDQuantity, CD_PRICE, CDTotal);
		System.out.printf("%d\t\tTape Recorder\t\t$%.2f\t\t\t$%.2f\n", recorderQuantity, TAPE_RECORDER_PRICE, recorderTotal);
		System.out.printf("\nSubtotal:\t$%.2f\n", subtotal);
		System.out.printf("Tax:\t\t$%.2f\n", tax);
		System.out.printf("Total:\t\t$%.2f\n", total);
		
		in.close();
	}
}
