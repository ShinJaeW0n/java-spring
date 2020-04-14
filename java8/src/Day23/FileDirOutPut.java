package Day23;

import java.io.File;
	//스트림 예제-6
public class FileDirOutPut {

		static String dir;
		public static void main(String[] args) {
//			if(args.length != 1) {
//				System.out.println("main() 매개변수를 입력하세요");
//				System.exit(1);
//			}
			
			dir="c:/java";	//경로는 /로 구분(리눅스), \로 구분(윈도우즈)
							//윈도우도 /로 구분가능합니다.
							//윈도우에서 \는 특수문자 입력이므로 \\처럼 2개를 입력해야 하나로 인식합니다.
			File myFile = new File(dir);
			String[] flist = myFile.list(); //배열로 리스트됨.
			System.out.println("검색 디렉토리 : " + dir);
			System.out.println("-------------------");
			for(int i=0; i<flist.length; i++) {
				File cfile = new File(dir+ "/" + flist[i]);
				if(cfile.isDirectory()) {
					System.out.println("디렉토리: " + flist[i]); //디렉토리라면 이걸로 출력
					}else {
						System.out.println("파일: " + flist[i]);//아니면 파일로 출력
					}
			}
		}
}
