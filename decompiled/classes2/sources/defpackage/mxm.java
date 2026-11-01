package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mxm extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public mxm(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new amzw(defpackage.mxm.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        mnk mnkVar = (mnk) list.get(0);
        defpackage.nmo nmoVar = (defpackage.nmo) list.get(1);
        tkl tklVar = (tkl) list.get(2);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(3)).booleanValue();
        aooh.f(mnkVar, "enabledFn");
        aooh.f(nmoVar, "lifecycleState");
        aooh.f(tklVar, "inCallUiVisibilityProvider");
        return aiql.z(new uyg(new defpackage.iwm(mnkVar, 14), new defpackage.iet(nmoVar, zBooleanValue, tklVar, 2)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
