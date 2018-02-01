package cn.liusf.gwt.ui.client;


import cn.liusf.gwt.ui.client.uibinder.index;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;



/**
 * Created by liusf on 2018/1/26.
 */
public class GwtDemo implements EntryPoint {
    public void onModuleLoad() {
        RootLayoutPanel.get().add(new index());

    }
}
