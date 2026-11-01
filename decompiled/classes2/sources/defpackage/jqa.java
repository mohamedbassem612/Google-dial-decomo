package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jqa extends amzm {
    private final amzg b;

    public jqa(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.jqa.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalEmpty;
        uio uioVarK;
        defpackage.aiyh aiyhVarBT;
        j$.util.Optional optional = (j$.util.Optional) obj;
        java.util.Set set = defpackage.jpk.a;
        aooh.f(optional, "spamStatus");
        uip uipVar = (uip) aooh.q(optional);
        if (uipVar == null || (uioVarK = uipVar.k()) == null) {
            optionalEmpty = j$.util.Optional.empty();
            aooh.e(optionalEmpty, "empty(...)");
        } else {
            udm udmVar = uioVarK.e;
            if (udmVar != null) {
                int iAQ = a.aQ(udmVar.g);
                aiyhVarBT = wsc.bT(iAQ != 0 ? iAQ : 1);
            } else {
                udm udmVar2 = uioVarK.d;
                if (udmVar2 != null) {
                    int iAQ2 = a.aQ(udmVar2.g);
                    aiyhVarBT = wsc.bT(iAQ2 != 0 ? iAQ2 : 1);
                } else {
                    aiyhVarBT = null;
                }
            }
            optionalEmpty = j$.util.Optional.ofNullable(aiyhVarBT);
            aooh.e(optionalEmpty, "ofNullable(...)");
        }
        return aiql.z(optionalEmpty);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
