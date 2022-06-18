package darsh;

import javax.swing.JOptionPane;

public class Fever {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "𝘐𝘯 𝘵𝘩𝘪𝘴 𝘱𝘳𝘰𝘨𝘳𝘢𝘮, 𝘪𝘧 𝘺𝘰𝘶 𝘸𝘪𝘭𝘭 𝘦𝘯𝘵𝘦𝘳 𝘺𝘰𝘶𝘳 𝘣𝘰𝘥𝘺 𝘵𝘦𝘮𝘱𝘦𝘳𝘢𝘵𝘶𝘳𝘦, 𝘪𝘵 𝘸𝘪𝘭𝘭 𝘵𝘦𝘭𝘭 𝘺𝘰𝘶 𝘸𝘩𝘦𝘵𝘩𝘦𝘳 𝘺𝘰𝘶 𝘩𝘢𝘷𝘦 𝘧𝘦𝘷𝘦𝘳 𝘰𝘳 𝘯𝘰𝘵");
		
		double bt = Double.parseDouble(JOptionPane.showInputDialog("𝑬𝒏𝒕𝒆𝒓 𝒚𝒐𝒖𝒓 𝒃𝒐𝒅𝒚 𝒕𝒆𝒎𝒑𝒆𝒓𝒂𝒕𝒖𝒓𝒆(𝙞𝙣 𝙛𝙖𝙝𝙧𝙚𝙣𝙝𝙚𝙞𝙩)"));
		
		if(bt <= 98.6) {
			JOptionPane.showMessageDialog(null, "𝙔𝙤𝙪'𝙧𝙚 𝙣𝙤𝙩 𝙝𝙖𝙫𝙞𝙣𝙜 𝙛𝙚𝙫𝙚𝙧");
		}
		
		else if(bt > 98.6 && bt <= 99.0) {
			JOptionPane.showMessageDialog(null, "𝙔𝙤𝙪'𝙧𝙚 𝙝𝙖𝙫𝙞𝙣𝙜 𝙡𝙞𝙩𝙩𝙡𝙚 𝙗𝙞𝙩 𝙛𝙚𝙫𝙚𝙧");
		}
		
		else if(bt >= 99.0 && bt <= 101.0) {
			JOptionPane.showMessageDialog(null, "𝙔𝙤𝙪'𝙧𝙚 𝙝𝙖𝙫𝙞𝙣𝙜 𝙛𝙚𝙫𝙚𝙧");
		}
		
		else if(bt > 101.0) {
			JOptionPane.showMessageDialog(null, "𝙔𝙤𝙪'𝙧𝙚 𝙝𝙖𝙫𝙞𝙣𝙜 𝙝𝙞𝙜𝙝 𝙛𝙚𝙫𝙚𝙧");
		}
	}

}
