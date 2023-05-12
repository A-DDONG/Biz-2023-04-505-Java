package com.callor.blackjack;

import java.util.Scanner;

public class BlackJack {
	private Deck deck;
	private Scanner scanner;
	private int playerScore;
	private int dealerScore;

	public BlackJack() {
		deck = new Deck();
		scanner = new Scanner(System.in);
		playerScore = 0;
		dealerScore = 0;
	}

	public void play() {
		System.out.println("블랙잭 게임을 시작합니다!");
		while (true) {
			// 플레이어가 카드를 뽑는다.
			Card playerCard1 = deck.drawCard();
			Card playerCard2 = deck.drawCard();
			System.out.println("당신이 뽑은 카드 " + playerCard1.getSuit() + " " + playerCard1.getRank() + " 그리고 "
					+ playerCard2.getSuit() + " " + playerCard2.getRank() + ".");
			playerScore += playerCard1.getValue() + playerCard2.getValue();
			System.out.println("당신의 현재 점수 " + playerScore + " 점.");

			// 딜러가 카드를 뽑는다.
			Card dealerCard1 = deck.drawCard();
			dealerScore += dealerCard1.getValue();
			System.out.println("딜러가 뽑은 카드 " + dealerCard1.getSuit() + " " + dealerCard1.getRank() + ".");
			System.out.println("딜러의 현재 점수 " + dealerScore + " 점.");

			// 플레이어가 카드를 더 뽑을지 묻는다.
			while (true) {
				System.out.print("카드를 더 뽑으시겠습니까? (y/n) ");
				String answer = scanner.nextLine();
				if (answer.equals("y")) {
					Card playerCard = deck.drawCard();
					System.out.println("당신이 뽑은 카드 " + playerCard.getSuit() + " " + playerCard.getRank()  + ".");
					playerScore += playerCard.getValue();
					System.out.println("당신의 현재 점수 " + playerScore + ".");
					if (playerScore > 21) {
						System.out.println("패배!");
						return;
					}
				} else if(answer.equals("n")){
					break;
				} else if(!answer.equals("y") && !answer.equals("n") ) {
					System.out.println("y 또는 n만 입력해주세요");
					continue;
				}
			}

			// 딜러가 카드를 더 뽑는다.
			while (dealerScore < 17) {
				Card dealerCard = deck.drawCard();
				dealerScore += dealerCard.getValue();
				System.out.println("딜러가 뽑은 카드 " + dealerCard.getSuit() + " " + dealerCard.getRank()  + ".");
				System.out.println("딜러의 현재 점수 " + dealerScore + " 점.");
			}

			// 결과를 비교한다.
			if (dealerScore > 21) {
				System.out.println("승리!");
			} else if (playerScore > dealerScore) {
				System.out.println("승리!");
			} else if (playerScore == dealerScore) {
				System.out.println("무승부");
			} else {
				System.out.println("패배!");
			}

			// 다시 게임을 할지 묻는다.
			System.out.print("게임을 다시 하겠습니까? (y/n) ");
			String answer = scanner.nextLine();
			while (true) {
				if (!answer.equals("y") && !answer.equals("n") ) {
					System.out.println("y 또는 n만 입력해주세요");
					System.out.print("게임을 다시 하겠습니까? (y/n) ");
					answer = scanner.nextLine();
					continue;
				}
				break;
			}
			
			if (answer.equals("y")) {
				// 점수를 초기화한다.
				playerScore = 0;
				dealerScore = 0;
				continue;
			} else if(answer.equals("n")) {
				System.out.println("게임 종료");
				return;
			}
			
		}
	}

	public static void main(String[] args) {
		BlackJack game = new BlackJack();
		game.play();
	}
}
