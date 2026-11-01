package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mxk extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public mxk(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new amzw(defpackage.mxk.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        java.lang.String str = (java.lang.String) list.get(1);
        ipc ipcVar = (ipc) list.get(2);
        defpackage.nmo nmoVar = (defpackage.nmo) list.get(3);
        aooh.f(context, "appContext");
        aooh.f(str, "callId");
        aooh.f(ipcVar, "inCallActivityIntent");
        aooh.f(nmoVar, "lifecycleState");
        int iOrdinal = nmoVar.ordinal();
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable((iOrdinal == 10 || iOrdinal == 12) ? null : afap.b(context, 0, ipcVar.bk(new otd(false, false, false, false, true, qit.b, (abvz) null, str, (java.lang.Long) null, 335)), 201326592));
        aooh.e(optionalOfNullable, "ofNullable(...)");
        return aiql.z(optionalOfNullable);
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
