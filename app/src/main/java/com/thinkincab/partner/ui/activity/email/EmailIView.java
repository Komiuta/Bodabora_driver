package com.thinkincab.partner.ui.activity.email;

import com.thinkincab.partner.base.MvpView;
import com.thinkincab.partner.data.network.model.ForgotResponse;
import com.thinkincab.partner.data.network.model.User;

public interface EmailIView extends MvpView {
    void onSuccess(User object);
    void onSuccess(ForgotResponse forgotResponse);



    void onError(Throwable e);
}
