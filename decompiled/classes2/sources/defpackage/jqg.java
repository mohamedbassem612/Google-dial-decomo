package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jqg extends amzm {
    private final amzg b;

    public jqg(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.jqg.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        uio uioVarK;
        udm udmVar;
        j$.util.Optional optional = (j$.util.Optional) obj;
        java.util.Set set = defpackage.jpk.a;
        aooh.f(optional, "spamStatus");
        uip uipVar = (uip) aooh.q(optional);
        boolean zC = false;
        if (uipVar != null && (uioVarK = uipVar.k()) != null && (udmVar = uioVarK.b) != null) {
            udm udmVar2 = udn.a;
            zC = udn.c(udmVar);
        }
        return aiql.z(java.lang.Boolean.valueOf(zC));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
