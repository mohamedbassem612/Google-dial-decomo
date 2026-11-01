package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mxn extends amzm {
    private final amzg b;
    private final amzg c;

    public mxn(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.mxn.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        defpackage.nmo nmoVar = (defpackage.nmo) list.get(0);
        tkl tklVar = (tkl) list.get(1);
        aooh.f(nmoVar, "lifecycleState");
        aooh.f(tklVar, "inCallUiVisibilityProvider");
        java.lang.String str = "phone_ongoing_call";
        if (nmoVar != defpackage.nmo.BAM && !defpackage.mwt.b(nmoVar, tklVar)) {
            str = "phone_incoming_call";
        }
        j$.util.Optional optionalOf = j$.util.Optional.of(str);
        aooh.e(optionalOf, "of(...)");
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
