package cn.liusf.gwt.ui.client.uibinder;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;

/**
 * Created by liusf on 2018/1/29.
 */
public class index  extends Composite{
    interface indexUiBinder extends UiBinder<Widget, index> {
    }

    private static indexUiBinder ourUiBinder = GWT.create(indexUiBinder.class);

    public index() {
        initWidget(ourUiBinder.createAndBindUi(this));
        for (int i= 0;i<10;i++){
            listbox.addItem(i+"");
        }
    }
    @UiField
    ListBox listbox;

}