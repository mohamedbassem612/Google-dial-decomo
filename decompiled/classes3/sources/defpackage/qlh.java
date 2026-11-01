package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qlh extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public qlh(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.qlh.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalEmpty;
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        defpackage.qix qixVar = (defpackage.qix) list.get(1);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(2)).booleanValue();
        ipc ipcVar = (ipc) list.get(3);
        aooh.f(context, "appContext");
        aooh.f(qixVar, "notificationType");
        aooh.f(ipcVar, "inCallActivityIntent");
        if (qixVar != defpackage.qix.c || zBooleanValue) {
            optionalEmpty = j$.util.Optional.empty();
            aooh.c(optionalEmpty);
        } else {
            optionalEmpty = j$.util.Optional.ofNullable(defpackage.afap.b(context, 1, ipcVar.bk(new defpackage.otd(false, false, true, false, false, null, null, null, null, 507)), 67108864));
            aooh.c(optionalEmpty);
        }
        return aiql.z(optionalEmpty);
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
