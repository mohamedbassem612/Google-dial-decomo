package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qet implements defpackage.qia {
    public final android.content.Context a;
    public final ipc b;
    private final rlv c;
    private final ajct d;
    private final mba e;
    private final defpackage.qen f;

    public qet(android.content.Context context, defpackage.qen qenVar, rlv rlvVar, ajct ajctVar, ipc ipcVar, mba mbaVar) {
        this.a = context;
        this.f = qenVar;
        this.c = rlvVar;
        this.d = ajctVar;
        this.b = ipcVar;
        this.e = mbaVar;
    }

    @Override // defpackage.qia
    public final void a() {
        this.c.n(rmw.kF);
        this.e.b(mce.aG);
        agsm.i(596, ahvr.H(this.f.a(), new defpackage.phr(this, 15), this.d), "Failed to answer rtt call.", new java.lang.Object[0]);
    }
}
