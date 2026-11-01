package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class viw implements java.lang.AutoCloseable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ viw(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws android.os.RemoteException {
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj = this.a;
            vix vixVar = (vix) obj;
            if (vixVar.i == null) {
                vix.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/network/impl/VvmNetworkRequestImpl", "releaseNetworkCallback", 322, "VvmNetworkRequestImpl.java").v("skipping release VVM network since the callback not assigned yet");
                return;
            } else {
                vix.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/network/impl/VvmNetworkRequestImpl", "releaseNetworkCallback", 325, "VvmNetworkRequestImpl.java").v("releasing VVM network request callback");
                vixVar.e.g(ahvr.O(new defpackage.vet(obj, 3), vixVar.d), 5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
                return;
            }
        }
        if (i == 1) {
            ((vew) this.a).b();
            return;
        }
        java.util.Set set = defpackage.xkp.a;
        set.remove(this);
        defpackage.xkp xkpVar = (defpackage.xkp) this.a;
        defpackage.xox.b("KeepAliveManager", "[KeepAlive] Client " + xkpVar.a().getPackageName() + " requested to close KeepAliveToken. Tokens size: " + set.size());
        if (set.isEmpty()) {
            xkpVar.c();
        }
    }

    public viw(defpackage.xkp xkpVar, int i) {
        this.$cid = i;
        this.a = xkpVar;
    }
}
