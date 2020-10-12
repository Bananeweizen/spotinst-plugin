package hudson.plugins.spotinst.slave;

import hudson.model.TaskListener;
import hudson.slaves.JNLPLauncher;
import hudson.slaves.SlaveComputer;

/**
 * Created by ohadmuchnik on 25/05/2016.
 */
public class SpotinstComputerLauncher extends JNLPLauncher {

    public SpotinstComputerLauncher(String tunnel, String vmargs, Boolean shouldUseWebsocket) {
        super(tunnel, vmargs);

        if (shouldUseWebsocket != null) {
            setWebSocket(shouldUseWebsocket);
        }
    }

    @Override
    public void launch(SlaveComputer computer, TaskListener listener) {
        super.launch(computer, listener);
    }
}
