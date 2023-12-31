import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.UIManager;

public class ClassBlackjack extends JFrame {
	
	static Random random = new Random();
	
	static int cards [] = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
	static int counter = 0;
	static int playerCard1;
	static int playerCard2;
	static int playerCard3;
	static int playerCard4;
	static int playerCard5;
	
	// dealer's hand
	static int cardsTwo [] = new int [] {1, 2, 3, 4, 5};
	static int dealerCards = cardsTwo[random.nextInt(5)];
	static int dealerCard1;
	static int dealerCard2;
	static int dealerCard3;
	static int dealerCard4;
	static int dealerCard5;
	

	private JPanel contentPane;

	public static int hit() {
		
		int player = cards[random.nextInt(11)];
		
		return player;
	}
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClassBlackjack frame = new ClassBlackjack();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClassBlackjack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 984, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Blackjack");
		lblTitle.setFont(new Font("Stencil", Font.PLAIN, 60));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(282, 32, 408, 76);
		contentPane.add(lblTitle);
		
		JLabel lblYourHand = new JLabel("Your Hand:");
		lblYourHand.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblYourHand.setHorizontalAlignment(SwingConstants.CENTER);
		lblYourHand.setBounds(120, 155, 136, 37);
		contentPane.add(lblYourHand);
		
		JLabel lblDealerHand = new JLabel("Dealer's Hand:");
		lblDealerHand.setHorizontalAlignment(SwingConstants.CENTER);
		lblDealerHand.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblDealerHand.setBounds(669, 155, 200, 37);
		contentPane.add(lblDealerHand);
		
		JLabel lblLine = new JLabel("----------------------------------------------------------------------------------------------------------------------");
		lblLine.setHorizontalAlignment(SwingConstants.CENTER);
		lblLine.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblLine.setBounds(134, 108, 667, 37);
		contentPane.add(lblLine);
		
		JLabel lblPlayerCard1 = new JLabel("[Card 1]");
		lblPlayerCard1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerCard1.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblPlayerCard1.setBounds(35, 202, 302, 22);
		contentPane.add(lblPlayerCard1);
		
		JLabel lblPlayerCard2 = new JLabel("[Card 2]");
		lblPlayerCard2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerCard2.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblPlayerCard2.setBounds(35, 234, 302, 22);
		contentPane.add(lblPlayerCard2);
		
		JLabel lblPlayerCard3 = new JLabel("[Card 3]");
		lblPlayerCard3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerCard3.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblPlayerCard3.setBounds(35, 266, 302, 22);
		contentPane.add(lblPlayerCard3);
		
		JLabel lblPlayerCard4 = new JLabel("[Card 4]");
		lblPlayerCard4.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerCard4.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblPlayerCard4.setBounds(35, 298, 302, 22);
		contentPane.add(lblPlayerCard4);
		
		JLabel lblPlayerCard5 = new JLabel("[Card 5]");
		lblPlayerCard5.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerCard5.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblPlayerCard5.setBounds(35, 330, 302, 22);
		contentPane.add(lblPlayerCard5);
		
		JLabel lblDealerCard1 = new JLabel("[Card 1]");
		lblDealerCard1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDealerCard1.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblDealerCard1.setBounds(595, 202, 346, 22);
		contentPane.add(lblDealerCard1);
		
		JLabel lblDealerCard2 = new JLabel("[Card 2]");
		lblDealerCard2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDealerCard2.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblDealerCard2.setBounds(595, 234, 346, 22);
		contentPane.add(lblDealerCard2);
		
		JLabel lblDealerCard3 = new JLabel("[Card 3]");
		lblDealerCard3.setHorizontalAlignment(SwingConstants.CENTER);
		lblDealerCard3.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblDealerCard3.setBounds(595, 266, 346, 22);
		contentPane.add(lblDealerCard3);
		
		JLabel lblDealerCard4 = new JLabel("[Card 4]");
		lblDealerCard4.setHorizontalAlignment(SwingConstants.CENTER);
		lblDealerCard4.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblDealerCard4.setBounds(595, 298, 346, 22);
		contentPane.add(lblDealerCard4);
		
		JLabel lblDealerCard5 = new JLabel("[Card 5]");
		lblDealerCard5.setHorizontalAlignment(SwingConstants.CENTER);
		lblDealerCard5.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblDealerCard5.setBounds(595, 330, 346, 22);
		contentPane.add(lblDealerCard5);
		
		JLabel lblLine2 = new JLabel("----------------------------------------------------------------------------------------------------------------------");
		lblLine2.setHorizontalAlignment(SwingConstants.CENTER);
		lblLine2.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblLine2.setBounds(134, 461, 667, 37);
		contentPane.add(lblLine2);
		
		JLabel lblResults = new JLabel("Results:");
		lblResults.setHorizontalAlignment(SwingConstants.CENTER);
		lblResults.setFont(new Font("Stencil", Font.PLAIN, 30));
		lblResults.setBounds(371, 508, 213, 37);
		contentPane.add(lblResults);
		
		JLabel lblWinner = new JLabel("[winner]");
		lblWinner.setHorizontalAlignment(SwingConstants.CENTER);
		lblWinner.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblWinner.setBounds(399, 544, 152, 33);
		contentPane.add(lblWinner);
		
		JLabel lblYourTotalTitle = new JLabel("Your Total:");
		lblYourTotalTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblYourTotalTitle.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblYourTotalTitle.setBounds(120, 375, 136, 37);
		contentPane.add(lblYourTotalTitle);
		
		JLabel lblDealerTotalTitle = new JLabel("Dealer's Total:");
		lblDealerTotalTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblDealerTotalTitle.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblDealerTotalTitle.setBounds(669, 375, 200, 37);
		contentPane.add(lblDealerTotalTitle);
		
		JLabel lblPlayerTotal = new JLabel("[total]");
		lblPlayerTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerTotal.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblPlayerTotal.setBounds(35, 418, 302, 22);
		contentPane.add(lblPlayerTotal);
		
		JLabel lblDealerTotal = new JLabel("[total]");
		lblDealerTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblDealerTotal.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblDealerTotal.setBounds(615, 418, 302, 22);
		contentPane.add(lblDealerTotal);
		
		JButton btnHit = new JButton("Hit");
		JButton btnStand = new JButton("Stand");
		JButton btnReset = new JButton("Reset");
		btnHit.setVisible(false);
		btnStand.setVisible(false);
		btnReset.setVisible(false);
		
		btnHit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (counter == 0) {
					playerCard3 = hit();
					lblPlayerCard3.setText(String.valueOf(playerCard3));
					counter += 1;	
					
					if ((playerCard1 + playerCard2 + playerCard3) > 21) {
						lblPlayerTotal.setText(String.valueOf("Bust!"));
						lblWinner.setText(String.valueOf("Dealer wins!"));
						btnHit.setVisible(false);
						btnStand.setVisible(false);
						btnReset.setVisible(true);
					}
				}
				else if (counter == 1) {
					playerCard4 = hit();
					lblPlayerCard4.setText(String.valueOf(playerCard4));
					counter += 1;		
				
					if ((playerCard1 + playerCard2 + playerCard3 + playerCard4) > 21) {
						lblPlayerTotal.setText(String.valueOf("Bust!"));
						lblWinner.setText(String.valueOf("Dealer wins!"));
						btnHit.setVisible(false);
						btnStand.setVisible(false);
						btnReset.setVisible(true);
					}
				}
				else if (counter == 2) {
					playerCard5 = hit();
					lblPlayerCard5.setText(String.valueOf(playerCard5));
					counter += 1;
					
					if ((playerCard1 + playerCard2 + playerCard3 + playerCard4 + playerCard5) > 21) {
						lblPlayerTotal.setText(String.valueOf("Bust!"));
						lblWinner.setText(String.valueOf("Dealer wins!"));
						btnHit.setVisible(false);
						btnStand.setVisible(false);
						btnReset.setVisible(true);
					}
				}
			
				
			}
		});
		
		btnHit.setForeground(Color.WHITE);
		btnHit.setFont(new Font("Stencil", Font.PLAIN, 20));
		btnHit.setBackground(Color.BLACK);
		btnHit.setBounds(417, 227, 123, 33);
		contentPane.add(btnHit);
		
		btnStand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHit.setVisible(false);
				btnReset.setVisible(true);
				
				int playerTotal = 0;
				int dealerTotal = 0;
				
				playerTotal = playerCard1 + playerCard2 + playerCard3 + playerCard4 + playerCard5;
				
				lblPlayerTotal.setText(String.valueOf(playerTotal));
				
				dealerTotal = dealerCard1 + dealerCard2 + dealerCard3 + dealerCard4 + dealerCard5;
				
				lblDealerTotal.setText(String.valueOf(dealerTotal));
				
				lblDealerCard2.setText(String.valueOf(dealerCard2));
				
				
				if (dealerCard3 != 0) {
					lblDealerCard3.setText(String.valueOf(dealerCard3));
				}
				
				if (dealerCard4 != 0) {
					lblDealerCard4.setText(String.valueOf(dealerCard4));
				}
				
				if (dealerCard5 != 0) {
					lblDealerCard5.setText(String.valueOf(dealerCard5));
				}
				
				if (playerTotal > 21) {
					lblPlayerTotal.setText(String.valueOf("Bust!"));
					
					if (dealerTotal > 21) {
						lblDealerTotal.setText(String.valueOf("Bust!"));
						lblWinner.setText(String.valueOf("No winner!"));
					}
					else if (dealerTotal < 21) {
						lblWinner.setText(String.valueOf("Dealer wins!"));
					}
					
					btnStand.setVisible(false);

				}
				
				if (dealerTotal > 21) {
					lblDealerTotal.setText(String.valueOf("Bust!"));
					
					if (playerTotal > 21) {
						lblPlayerTotal.setText(String.valueOf("Bust!"));
						lblWinner.setText(String.valueOf("No winner!"));
					}
					else if (playerTotal < 21) {
						lblWinner.setText(String.valueOf("You win!"));
					}
					
					btnStand.setVisible(false);
				}
				if (dealerTotal > 21) {
                    lblDealerTotal.setText(String.valueOf("Bust!"));

                    if (playerTotal > 21) {
                        lblPlayerTotal.setText(String.valueOf("Bust!"));
                        lblWinner.setText(String.valueOf("No winner!"));
                    }
                    else if (playerTotal < 21) {
                        lblWinner.setText(String.valueOf("You win!"));
                    }

                    btnStand.setVisible(false);
                }

                if (playerTotal == 21) {

                    if (dealerTotal == 21) {
                        lblWinner.setText(String.valueOf("Tie!"));
                        btnStand.setVisible(false);
                    }
                    else {
                        lblWinner.setText(String.valueOf("You win!"));
                        btnStand.setVisible(false);
                    }
                }

                if (dealerTotal == 21) {

                    if (playerTotal == 21) {
                        lblWinner.setText(String.valueOf("Tie!"));
                        btnStand.setVisible(false);
                    }
                    else {
                        lblWinner.setText(String.valueOf("Dealer wins!"));
                        btnStand.setVisible(false);
                    }
                }
			
				
				if ((playerTotal < 21) && (dealerTotal < 21) && (playerTotal > dealerTotal)) {
					lblWinner.setText(String.valueOf("You win!"));
					btnStand.setVisible(false);
				}
				else if ((dealerTotal < 21) && (playerTotal < 21) && (dealerTotal > playerTotal)) {
					lblWinner.setText(String.valueOf("Dealer wins!"));
					btnStand.setVisible(false);
				}
				else if ((playerTotal <= 21) && (dealerTotal <= 21) && (playerTotal == dealerTotal)) {
					lblWinner.setText(String.valueOf("Tie!"));
					btnStand.setVisible(false);
				}
				
				
				
			}
		});
		btnStand.setForeground(Color.WHITE);
		btnStand.setFont(new Font("Stencil", Font.PLAIN, 20));
		btnStand.setBackground(Color.BLACK);
		btnStand.setBounds(417, 280, 123, 33);
		contentPane.add(btnStand);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				playerCard1 = hit();
				playerCard2 = hit();
				
				lblPlayerCard1.setText(String.valueOf(playerCard1));
				lblPlayerCard2.setText(String.valueOf(playerCard2));
				
				btnStart.setVisible(false);
				btnHit.setVisible(true);
				btnStand.setVisible(true);
				
				int amountOfCards = 1;
				
				if (amountOfCards <= dealerCards) {
					dealerCard1 = hit();
					lblDealerCard1.setText(String.valueOf(dealerCard1));
					amountOfCards += 1;
				} 
				if (amountOfCards <= dealerCards) {
					 dealerCard2 = hit();
					 amountOfCards += 1;
				 }
				if (amountOfCards <= dealerCards) {
					dealerCard3 = hit();
					amountOfCards += 1;
				}
				if (amountOfCards <= dealerCards) {
					dealerCard4 = hit();
					amountOfCards += 1;
				}
				if (amountOfCards <= dealerCards) {
					dealerCard5 = hit();
					amountOfCards += 1;
					
				}
			}
		});
		btnStart.setForeground(new Color(255, 255, 255));
		btnStart.setFont(new Font("Stencil", Font.PLAIN, 35));
		btnStart.setBackground(new Color(51, 204, 0));
		btnStart.setBounds(395, 243, 166, 58);
		contentPane.add(btnStart);
		
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnStart.setVisible(true);
				btnStand.setVisible(false);
				btnReset.setVisible(false);
				counter = 0;
				
				lblPlayerCard1.setText("[Card 1]");
				lblPlayerCard2.setText("[Card 2]");
				lblPlayerCard3.setText("[Card 3]");
				lblPlayerCard4.setText("[Card 4]");
				lblPlayerCard5.setText("[Card 5]");
				
				lblDealerCard1.setText("[Card 1]");
				lblDealerCard2.setText("[Card 2]");
				lblDealerCard3.setText("[Card 3]");
				lblDealerCard4.setText("[Card 4]");
				lblDealerCard5.setText("[Card 5]");
				
				lblPlayerTotal.setText("[total]");
				lblDealerTotal.setText("[total]");
				lblWinner.setText("[Winner]");
				
				playerCard3 = 0;
				playerCard4 = 0;
				playerCard5 = 0;
				
				
			}
		});
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Stencil", Font.PLAIN, 30));
		btnReset.setBackground(Color.BLACK);
		btnReset.setBounds(415, 373, 136, 37);
		contentPane.add(btnReset);
	}
}


