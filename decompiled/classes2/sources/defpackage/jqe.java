package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jqe extends amzm {
    private final amzg b;

    public jqe(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.jqe.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.aiyn aiynVarBS;
        j$.util.Optional optionalOfNullable;
        j$.util.Optional optional = (j$.util.Optional) obj;
        java.util.Set set = defpackage.jpk.a;
        aooh.f(optional, "spamStatus");
        uip uipVar = (uip) aooh.q(optional);
        if (uipVar == null) {
            optionalOfNullable = j$.util.Optional.empty();
            aooh.e(optionalOfNullable, "empty(...)");
        } else {
            udm udmVar = uipVar.k().a;
            if (udmVar != null) {
                udk udkVarB = udk.b(udmVar.f);
                if (udkVarB == null) {
                    udkVarB = udk.a;
                }
                aiynVarBS = wsc.bS(udkVarB);
            } else {
                aiynVarBS = null;
            }
            optionalOfNullable = j$.util.Optional.ofNullable(aiynVarBS);
            aooh.e(optionalOfNullable, "ofNullable(...)");
        }
        return aiql.z(optionalOfNullable);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
