package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Video;
import entities.Task;

public class TeachingPlatform {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Lesson> list = new ArrayList<>();
		
		System.out.print("Quantas aulas tem o curso? ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		for(int i=0; i<n; i++) {
			System.out.println("Dados da " + (i + 1) + "a aula:");
			System.out.print("Conteudo ou tarefa (c/t)? ");
			char ch = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
			if(ch == 'c') {
				System.out.print("Titulo: ");
				String title = sc.nextLine();
				System.out.print("URL do video: ");
				String url = sc.nextLine();
				System.out.print("Duração em segudos: ");
				int seconds = sc.nextInt();
				sc.nextLine();
				list.add(new Video(title, url, seconds));
			}else {
				System.out.print("Titulo: ");
				String title = sc.nextLine();
				System.out.print("Descrição: ");
				String description = sc.nextLine();
				System.out.print("Quantidade de questões: ");
				int questionCount = sc.nextInt();
				sc.nextLine();
				list.add(new Task(title, description, questionCount));
			}
			System.out.println();
		}
		int sum = 0;
		for(Lesson lesson : list) {
			sum += lesson.duration();
		}
		System.out.println("DURAÇÃO TOTAL DO CURSO: " + sum + " segundos");
		sc.close();
	}

}