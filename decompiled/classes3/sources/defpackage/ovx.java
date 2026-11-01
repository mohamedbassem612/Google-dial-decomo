package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ovx implements defpackage.ahjd {
    private final /* synthetic */ int $cid;
    public final java.lang.Object a;
    public final java.lang.Object b;

    public ovx(ipc ipcVar, aoin aoinVar, int i) {
        this.$cid = i;
        aooh.f(aoinVar, "enableIncomingCallGesturePostCallBottomSheet");
        this.b = ipcVar;
        this.a = aoinVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [aoin, java.lang.Object] */
    @Override // defpackage.ahjd
    public final defpackage.ahjc a(apjb apjbVar) {
        if (this.$cid != 0) {
            return new iwz(this, 1);
        }
        if (((java.lang.Boolean) this.a.a()).booleanValue()) {
            return new iwz(this, 6);
        }
        return null;
    }

    public ovx(ipc ipcVar, rlv rlvVar, int i) {
        this.$cid = i;
        aooh.f(rlvVar, "loggingBindings");
        this.a = ipcVar;
        this.b = rlvVar;
    }
}
