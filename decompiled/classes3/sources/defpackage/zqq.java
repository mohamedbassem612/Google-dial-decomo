package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zqq extends android.telephony.TelephonyCallback implements android.telephony.TelephonyCallback.ServiceStateListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public zqq(aows aowsVar, int i) {
        this.$cid = i;
        this.a = aowsVar;
    }

    @Override // android.telephony.TelephonyCallback.ServiceStateListener
    public final void onServiceStateChanged(android.telephony.ServiceState serviceState) {
        if (this.$cid != 0) {
            aooh.f(serviceState, "serviceState");
            ((aowj) this.a).b(java.lang.Integer.valueOf(serviceState.getState()));
            return;
        }
        aooh.f(serviceState, "serviceState");
        defpackage.zqu.a.b().l("com/google/android/dialershared/incall/dialingconnectivity/DialingConnectivity$createTelephonyCallback$<anonymous>", "onServiceStateChanged", 141, "DialingConnectivity.kt").w("service state %s", serviceState.getState());
        if (serviceState.getState() == 1) {
            defpackage.zqu zquVar = (defpackage.zqu) this.a;
            aoov.an(zquVar.d, (aolr) null, 0, new defpackage.ryc(zquVar, (aoln) null, 7), 3);
        }
        if (serviceState.getState() == 0 || serviceState.getState() == 2) {
            defpackage.zqu zquVar2 = (defpackage.zqu) this.a;
            aoov.an(zquVar2.d, (aolr) null, 0, new defpackage.xtn(zquVar2, (aoln) null, 19, (byte[]) null), 3);
        }
    }

    public zqq(defpackage.zqu zquVar, int i) {
        this.$cid = i;
        this.a = zquVar;
    }
}
