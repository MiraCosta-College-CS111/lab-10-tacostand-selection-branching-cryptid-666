// DATE: Apr/9/2025

public class Main
{

	/**
	 * ALGORITHM:
	 * - Add total funds to taco stand
	 * - Order supplies
	 * - Print status of stand (when it opens)
	 * - Print welcome message
	 * - Take customer order
	 * - Print status of stand (when its closed)
	 */
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		TacoStand.initialize();

		//INPUT + CALCULATION + OUTPUT SECTION
		TacoStand.addTotalFunds(20);
		TacoStand.orderSupplies(15);

		System.out.println("OPENING UP THE STAND...");
		System.out.println(TacoStand.getStatus() +"\n\n");

		Main.printWelcome();
		System.out.println("\n");
		
		Main.takeOrder();
		//can call multiple times

		System.out.println("--------CART IS CLOSED---------\n\n" + TacoStand.getStatus());
	}

	/**
	 * Prints a welcome message for the user
	 */
	public static void printWelcome()
	{
		UtilityBelt.printCentered(50, "Welcome to MCC Taco Stand!");
		UtilityBelt.printCentered(50, "┈┈┈┈╭╯╭╯╭╯┈┈┈┈┈");
		UtilityBelt.printCentered(50, "┈┈┈╱▔▔▔▔▔╲▔╲┈┈┈");
		UtilityBelt.printCentered(50, "┈┈╱┈╭╮┈╭╮┈╲╮╲┈┈");
		UtilityBelt.printCentered(50, "┈┈▏┈▂▂▂▂▂┈▕╮▕┈┈");
		UtilityBelt.printCentered(50, "┈┈▏┈╲▂▂▂╱┈▕╮▕┈┈");
		UtilityBelt.printCentered(50, "┈┈╲▂▂▂▂▂▂▂▂╲╱┈┈");
		//ascii art credit:
		//https://mizbizbby.tumblr.com/post/12937794639/happy-taco-ascii-art-for-taco-thursday
	}
	
	/**
	 * Prints the menu, asks the user for the taco option and number of tacos,
	 * updates total funds based on user input and prints an order confirmation
	 */
	public static void takeOrder()
	{
		//DECLARATION + INITIALIZATION SECTION
		int option, numTacosOrdered;

		//INPUT SECTION
		TacoStand.printMenu();
		option = UtilityBelt.readInt("Enter choice> ", 1, 4);
		numTacosOrdered = UtilityBelt.readInt("Enter number of tacos you want> ", 1, 50);

		//CALCULATION + OUTPUT SECTION
		if (TacoStand.areTacosAvailable(option, numTacosOrdered))
		{
			TacoStand.updateTotalFunds(option, numTacosOrdered);
			Main.printConfirmation(numTacosOrdered);
		}
		else
		{
			System.out.println("We don't have that many tacos, sorry! Try again :(");
		}
	}

	/**
	 * Prints a confirmation message that varies based on the number of tacos in the order
	 * 
	 * @param numTacos
	 */
	public static void printConfirmation(int numTacos)
	{
		System.out.println("Here you go, buen provecho!");
		if(numTacos >0 && numTacos <2)
		{
			System.out.println("🌮");
		}
		else
		{
			if(numTacos >1 && numTacos <3)
			{
				System.out.println("🌮🌮");
			}
			else
			{
				if(numTacos >2 && numTacos <4)
				{
					System.out.println("🌮🌮🌮");
				}
				else
				{
					if(numTacos >3 && numTacos <5)
					{
						System.out.println("🌮🌮🌮🌮");
					}
					else
					{
						if(numTacos >4 && numTacos <6)
						{
							System.out.println("🌮🌮🌮🌮🌮");
						}
						else
						{
							if(numTacos >5 && numTacos <7)
							{
								System.out.println("🌮🌮🌮🌮🌮🌮");
							}
							else
							{
								if(numTacos >6 && numTacos <8)
								{
									System.out.println("🌮🌮🌮🌮🌮🌮🌮");
								}
								else
								{
									if(numTacos >7 && numTacos <9)
									{
										System.out.println("🌮🌮🌮🌮🌮🌮🌮🌮");
									}
									else
									{
										if(numTacos >8 && numTacos <10)
										{
											System.out.println("🌮🌮🌮🌮🌮🌮🌮🌮🌮");
										}
										else
										{
											if(numTacos >9 && numTacos <11)
											{
												System.out.println("🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮");
											}
											else
											{
												if(numTacos >10 && numTacos <12)
												{
													System.out.println("🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮");
												}
												else
												{
													if(numTacos >11 && numTacos <13)
													{
														System.out.println("🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮");
													}
													else
													{
														if(numTacos >12 && numTacos <14)
														{
															System.out.println("🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮");
														}
														else
														{
															if(numTacos >13 && numTacos <15)
															{
																System.out.println("🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮");
															}
															else
															{
																if(numTacos >14 && numTacos <16)
																{
																	System.out.println("🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮");
																}
																else
																{
																	if(numTacos >15 && numTacos <17)
																	{
																		System.out.println("🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮");
																	}
																	else
																	{
																		if(numTacos >16 && numTacos <18)
																		{
																			System.out.println("🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮");
																		}
																		else
																		{
																			if(numTacos >17 && numTacos <19)
																			{
																				System.out.println("🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮");
																			}
																			else
																			{
																				if(numTacos >18 && numTacos <20)
																				{
																					System.out.println("🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮");
																				}
																				else
																				{
																					if(numTacos >19 && numTacos <21)
																					{
																						System.out.println("🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮🌮");
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}