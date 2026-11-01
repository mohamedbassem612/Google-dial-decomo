package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jds extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public jds(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new amzw(defpackage.jds.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        iqm iqmVar = (iqm) list.get(1);
        java.lang.String str = (java.lang.String) list.get(2);
        ipc ipcVar = (ipc) list.get(3);
        aooh.f(context, "appContext");
        aooh.f(iqmVar, "beeslyEnabledFn");
        aooh.f(str, "callId");
        aooh.f(ipcVar, "inCallActivityIntent");
        return aiql.z(iqmVar.f() ? afap.b(context, 0, ipcVar.bk(new otd(false, false, false, false, true, qit.f, (abvz) null, str, (java.lang.Long) null, 335)), 201326592) : null);
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
