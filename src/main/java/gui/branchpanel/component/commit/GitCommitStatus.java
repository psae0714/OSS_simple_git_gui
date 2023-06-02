package gui.branchpanel.component.commit;

import file.GitBranchData;

import javax.swing.*;
import java.awt.*;

public class GitCommitStatus extends JPanel {
    private GitBranchData gitBranchData;
    public GitCommitStatus(GitBranchData gitBranchData){
        JPanel CommitDetailLabel=new JPanel(new GridLayout(0,1,2,2));
        this.add(CommitDetailLabel,BorderLayout.WEST);

        JPanel CommitDetailValue=new JPanel(new GridLayout(0,1,2,2));
        this.add(CommitDetailValue,BorderLayout.CENTER);

        CommitDetailLabel.add(new JLabel("COMMIT",JLabel.TRAILING));
        //COMMIT 내용 입력
        

    }

}
