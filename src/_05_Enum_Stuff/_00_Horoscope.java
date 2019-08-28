package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	static // 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	void horiscope(Zodiac sign) {
		switch (sign) {
		case ARIES:
			JOptionPane.showMessageDialog(null, "The symbol for this sign is that of a ram for good reason. Aries is full of life and possesses high energy, which makes this sign always looking for a challenge. The typical Aries person is full of vitality, curiosity, and has a heightened sense of justice. They often excel at anything where a bit of competition is involved, whether this is of a cognitive nature or physical. The challenge is the thing. If there is a chance to win, to best someone, to show off abilities, Aries is in it to win it. The Aries person feels most alive when they are in control and leading others. They are often impatient and abrupt with those whom they feel are not their equals and are in a leadership position. Most Aries do not like being told what to do if the person in charge is less talented than they.");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "Tarus’s symbol is the bull because this sign’s characteristic is to be peaceful and methodical. This sign is often very deliberate in their actions, relaxed, and enjoys all of the sensual pleasures that abound in this dimension. Food, drink, sex, luxury, are all sought after by the typical taruean. Because this sign loves luxury they are willing to work hard to obtain it. They are slow to anger, but once disturbed it can be volatile. Taurus signs look for stability in their lives and in their partners and co-workers. Taurus people are not in a hurry, typically, and it can take them many years to decide what it is that they would like to do for a living, or where they’d like to go on vacation. Many of this sign prefer to live in the country as they are drawn to the earth and the natural world. Earth signs tend to have solid, reputable natures, which coincides with the Earth.");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "The Gemini symbol is that of a pair of twins. This is because this sign rarely likes to do anything alone. Gemini are never happier than when they are sharing ideas and concepts with someone else. Communication is a key element for this sign, so many of this sign go into occupations that include some communication in some large capacity. Curiosity is a key characteristic of this sign, and they are people persons. Gemini are great at parties because they can find almost anything to talk about with anyone. Gemini are adventurous by nature and so engage in traveling as often as they can as it affords them the opportunity to meet new people, experience new ideas, and to learn new concepts.");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "The crab symbolizes this sign for good reason. Just as the crab carries its own shell on its back, so too, does the typical cancerian…so to speak. The typical cancer person is all about home and family and is very dedicated and loyal to friends and family. Crabs often move sideways instead of moving in a straight line, and so will the person of this sign. Often, if it will avoid a fight, or achieve the goal, then moving in alternative directions to arrive at the destination is typical. They tend to grasp and hold tightly those things that make them happy, and never let go. The key characteristic of this sign is that Cancer people need to be needed. They need to know that they matter to someone and that they are secure in that love. Brave, courageous, protective, all describe the best possible traits of this sign. Shy, reserved, brooding, and moody, do not serve the cancer person well, but may surface if their needs are not being met");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null, "The lion is the symbol for this sign because the lion embodies the best characteristics of the leo; proud, regal, relaxed, and in charge. Leo people know they are in charge, even when it may seem outwardly that they are not.");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null, "The cool, calm, clarity that this sign exudes is why the symbol of the Maiden was chosen. Virgo people are mild mannered on the surface, but underneath there is a flurry of activity. Their minds are never quiet; always thinking, calculating, assessing. They loves making something out of nothing, nurturing and growing small things. They tend to be extremely detail oriented and particularly like producing something that is not only useful, but beautiful and skillful.");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "Libra people tend to need balance in their lives like no other sign of the zodiac, which makes the symbol of the scales particularly appropriate for this sign. Libra people need to keep a balance between work lives and recreational lives and an equal balance in their emotional and spiritual/physical lives. Because of this need Libra signs can sometimes seem wishy-washy when they are asked to make a decision. This is because they must ‘weigh’ all of their options. However, rest assured, that when a Libra makes up their mind the decision is likely to be the best win/win for all involved; benefiting the most people. This sign does not like to see people unhappy.");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "The symbol for Scorpio is the scorpion. This creature was chosen because it typifies many of the characteristics of this sign. The scorpio person is not necessarily aggressive on its own, unless provoked and in general would rather be contemplative. They crave alone time and often become extremely annoyed when they don’t get it. Scorpio people are great secret keepers and feel each emotion more intensely than other signs. Perhaps because of this they are able to be quite discerning when assisting people with their problems. They are able to cut to the bottom line and show others the best and the worst in their lives.");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "The centaur is the symbol for this sign. In mythology, the centaur was half man and half horse, given to pursing pleasure. The centaur is shown with a bow, which he shoots. Wherever the arrow lands, the centaur follows, retrieves the arrow and shoots again. Those born under this sign will love travelling, discovering new things, meeting new people, and learning new things.");
			break;
		default:
			JOptionPane.showMessageDialog(null, "ERROR");
		
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		Zodiac z = Zodiac.SCORPIO;
		horiscope(z);
	}
	
}
