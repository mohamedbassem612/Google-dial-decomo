package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mxa extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public mxa(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new amzw(defpackage.mxa.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        qke qkeVar = (qke) list.get(2);
        aooh.f(optional, "isSuspiciousCall");
        aooh.f(qkeVar, "callStatusTextGenerator");
        j$.util.Optional optionalOf = j$.util.Optional.of((zBooleanValue || ((java.lang.Boolean) aooh.p(optional, java.lang.Boolean.FALSE)).booleanValue()) ? qkeVar.b(2132018214, 2132018213) : qkeVar.b(2132018212, 2132018211));
        aooh.e(optionalOf, "of(...)");
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
