package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qlg extends amzm {
    private final amzg b;
    private final amzg c;

    public qlg(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.qlg.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        ipc ipcVar = (ipc) list.get(1);
        aooh.f(context, "appContext");
        aooh.f(ipcVar, "inCallActivityIntent");
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(defpackage.afap.b(context, 0, ipcVar.bk(new defpackage.otd(false, false, false, false, false, null, null, null, null, 511)), 67108864));
        aooh.e(optionalOfNullable, "ofNullable(...)");
        return aiql.z(optionalOfNullable);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
