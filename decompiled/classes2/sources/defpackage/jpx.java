package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jpx extends amzm {
    private final amzg b;

    public jpx(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.jpx.class), amyzVar);
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
            udj udjVarB = udj.b(udmVar.d);
            if (udjVarB == null) {
                udjVarB = udj.a;
            }
            boolValueOf = java.lang.Boolean.valueOf(udjVarB == udj.e);
        }
        return aiql.z(boolValueOf);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
