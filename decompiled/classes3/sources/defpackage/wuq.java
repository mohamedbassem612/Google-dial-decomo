package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wuq extends android.telecom.Call.Callback {
    final /* synthetic */ defpackage.wur a;

    public wuq(defpackage.wur wurVar) {
        j$.util.Objects.requireNonNull(wurVar);
        this.a = wurVar;
    }

    @Override // android.telecom.Call.Callback
    public final void onCallDestroyed(android.telecom.Call call) {
        this.a.a(ruc.ad);
    }

    @Override // android.telecom.Call.Callback
    public final void onCannedTextResponsesLoaded(android.telecom.Call call, java.util.List list) {
        this.a.a(ruc.aa);
    }

    @Override // android.telecom.Call.Callback
    public final void onChildrenChanged(android.telecom.Call call, java.util.List list) {
        this.a.a(ruc.Y);
    }

    @Override // android.telecom.Call.Callback
    public final void onConferenceableCallsChanged(android.telecom.Call call, java.util.List list) {
        this.a.a(ruc.ae);
    }

    @Override // android.telecom.Call.Callback
    public final void onConnectionEvent(android.telecom.Call call, java.lang.String str, android.os.Bundle bundle) {
        this.a.a(ruc.af);
    }

    @Override // android.telecom.Call.Callback
    public final void onDetailsChanged(android.telecom.Call call, android.telecom.Call.Details details) {
        this.a.a(ruc.Z);
    }

    @Override // android.telecom.Call.Callback
    public final void onHandoverComplete(android.telecom.Call call) {
        this.a.a(ruc.ak);
    }

    @Override // android.telecom.Call.Callback
    public final void onHandoverFailed(android.telecom.Call call, int i) {
        this.a.a(ruc.al);
    }

    @Override // android.telecom.Call.Callback
    public final void onParentChanged(android.telecom.Call call, android.telecom.Call call2) {
        this.a.a(ruc.X);
    }

    @Override // android.telecom.Call.Callback
    public final void onPostDialWait(android.telecom.Call call, java.lang.String str) {
        this.a.a(ruc.ab);
    }

    @Override // android.telecom.Call.Callback
    public final void onRttInitiationFailure(android.telecom.Call call, int i) {
        this.a.a(ruc.aj);
    }

    @Override // android.telecom.Call.Callback
    public final void onRttModeChanged(android.telecom.Call call, int i) {
        this.a.a(ruc.ag);
    }

    @Override // android.telecom.Call.Callback
    public final void onRttRequest(android.telecom.Call call, int i) {
        this.a.a(ruc.ai);
    }

    @Override // android.telecom.Call.Callback
    public final void onRttStatusChanged(android.telecom.Call call, boolean z, android.telecom.Call.RttCall rttCall) {
        this.a.a(ruc.ah);
    }

    @Override // android.telecom.Call.Callback
    public final void onStateChanged(android.telecom.Call call, int i) {
        this.a.a(ruc.W);
    }

    @Override // android.telecom.Call.Callback
    public final void onVideoCallChanged(android.telecom.Call call, android.telecom.InCallService.VideoCall videoCall) {
        this.a.a(ruc.ac);
    }
}
