import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ChessJFrame extends JFrame {
    private ChessBoard chessboard; // 声明一个棋盘对象
    private Panel tool;            // 声明一个面板对象
    private Button StartButton; // 声明开始按钮
    private Button BackButton; // 声明悔棋按钮
    private Button exitButton; // 声明退出按钮

    public ChessJFrame() { // 构造函数
        setTitle("五子棋"); // 设置标题
        MyButtonLister mb = new MyButtonLister(); // 按钮事件处理对象
        tool = new Panel(); // 面板对象
        chessboard = new ChessBoard(); // 棋盘对象
        StartButton = new Button("Reopen"); // 设置开始按钮
        BackButton = new Button("Regret"); // 设置悔棋按钮
        tool.setLayout(new FlowLayout(FlowLayout.CENTER)); // 流式布局
        tool.add(StartButton);
        tool.add(BackButton);
        StartButton.addActionListener(mb);
        BackButton.addActionListener(mb);
        add(tool, BorderLayout.SOUTH); // 按钮所在的位置
        add(chessboard); // 添加棋盘对象
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置关闭
        pack(); // 自适应
    }

    private class MyButtonLister implements ActionListener {
        // 按钮处理事件类
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            Object obj = e.getSource(); // 获取事件源
            if (obj == StartButton) { // 事件源是重新开始按钮
                System.out.println("重新开始");
                chessboard.restartGame();
            } else if (obj == BackButton) { // 事件源是悔棋按钮
                System.out.println("悔棋！");
                chessboard.goback();
            } else if (obj == exitButton) { // 事件源是退出按钮
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        ChessJFrame jf = new ChessJFrame(); // 声明框架对象
        jf.setResizable(false);
        jf.setLocationRelativeTo(null); // 居中显示
        jf.setVisible(true); // 设置为可见
    }
}
