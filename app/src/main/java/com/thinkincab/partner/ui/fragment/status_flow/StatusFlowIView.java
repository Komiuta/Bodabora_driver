package com.thinkincab.partner.ui.fragment.status_flow;

import com.thinkincab.partner.base.MvpView;
import com.thinkincab.partner.data.network.model.TimerResponse;
import com.thinkincab.partner.data.network.model.TripResponse;

public interface StatusFlowIView extends MvpView {

    void onSuccess(Object object);

    void onWaitingTimeSuccess(TimerResponse object);
    void onSuccess(TripResponse tripResponse);
    void onError(Throwable e);
}
