import java.util.Scanner;
public class Empat{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int umur, jumlahTanggungan, pendapatan, biayaHidup, status, sekolah;
		
		
		System.out.println ("Masukkan umur Anda:");
		umur=sc.nextInt();
	
		
		
		
		if (umur >=18){
			System.out.println ("Apakah Anda sudah bekerja (0=tidak, 1=iya?)");
			status=sc.nextInt();
			if (status==1){
				System.out.println ("Masukkan pendapatan per bulan:");
				pendapatan=sc.nextInt();
				System.out.println ("Masukkan jumlah tanggungan:");
				jumlahTanggungan=sc.nextInt();
				biayaHidup=pendapatan/jumlahTanggungan;
				System.out.println ("Biaya hidup anda adalah:" + biayaHidup);
				if (biayaHidup <300000){
					System.out.println ("Penduduk miskin");
				}else{
					System.out.println ("Bukan penduduk miskin");
				}
			}else if(status==0){
				System.out.println ("Penduduk miskin");
			}
		}else{
			System.out.println ("Apakah Anda masih sekolah(0=tidak, 1=iya?)");
			sekolah=sc.nextInt();
			if (sekolah==1){
				System.out.println ("Bukan penduduk miskin");
			}else{
				System.out.println ("Penduduk miskin");
			}
			
			}
			}
			}
			

	