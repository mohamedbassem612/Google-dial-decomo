package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jpy extends amzm {
    private final amzg b;

    public jpy(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.jpy.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        uio uioVarK;
        udm udmVar;
        j$.util.Optional optional = (j$.util.Optional) obj;
        java.util.Set set = defpackage.jpk.a;
        aooh.f(optional, "spamStatus");
        uip uipVar = (uip) aooh.q(optional);
        java.lang.Boolean boolValueOf = null;
        if (uipVar != null && (uioVarK = uipVar.k()) != null && (udmVar = uioVarK.c) != null) {
            udm udmVar2 = udn.a;
            boolValueOf = java.lang.Boolean.valueOf(udn.c(udmVar));
        }
        return aiql.z(boolValueOf);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
