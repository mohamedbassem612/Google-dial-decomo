package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jmv implements defpackage.jmt {
    private static final defpackage.jms a = new defpackage.jms(2132020604, ajsz.bb(new java.lang.Integer[]{2132020599, 2132020598, 2132020601, 2132020600, 2132020602, 2132020603}), 50, ajsz.aO(new aoiu[]{new aoiu(defpackage.jmr.a, rmx.uZ), new aoiu(defpackage.jmr.b, rmx.va), new aoiu(defpackage.jmr.c, rmx.vd), new aoiu(defpackage.jmr.d, rmx.vb), new aoiu(defpackage.jmr.e, rmx.vc), new aoiu(defpackage.jmr.f, rmx.ve), new aoiu(defpackage.jmr.g, rmx.vf), new aoiu(defpackage.jmr.h, rmx.vg)}), "checked_trusted_call_selectors_key", "custom_trusted_call_key");
    private static final defpackage.jms b = new defpackage.jms(2132019125, ajsz.bb(new java.lang.Integer[]{2132019123, 2132019121, 2132019127, 2132019124, 2132019122, 2132019120, 2132019126}), 100, ajsz.aO(new aoiu[]{new aoiu(defpackage.jmr.a, rmx.vh), new aoiu(defpackage.jmr.b, rmx.vi), new aoiu(defpackage.jmr.c, rmx.vl), new aoiu(defpackage.jmr.d, rmx.vj), new aoiu(defpackage.jmr.e, rmx.vk), new aoiu(defpackage.jmr.f, rmx.vm), new aoiu(defpackage.jmr.g, rmx.vn), new aoiu(defpackage.jmr.h, rmx.vo)}), "checked_info_requested_selectors_key", "custom_info_requested_key");
    private final defpackage.jjw c;

    public jmv(defpackage.jjw jjwVar) {
        this.c = jjwVar;
    }

    @Override // defpackage.jmt
    public final defpackage.jjx a(defpackage.jjx jjxVar, java.util.Map map) {
        aooh.f(jjxVar, "spamDialogInfo");
        defpackage.jhw jhwVarD = defpackage.hht.d(jjxVar.p());
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            if (aooh.n(str, a.e)) {
                akzx akzxVar = (akzx) jhwVarD.a;
                java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.jjx) akzxVar.b).o);
                aooh.e(listUnmodifiableList, "getUserSuggestedTrustedCallReasonsList(...)");
                new alct(listUnmodifiableList);
                aooh.f(list, "values");
                akzxVar.u();
                defpackage.jjx jjxVar2 = (defpackage.jjx) akzxVar.b;
                alat alatVar = jjxVar2.o;
                if (!alatVar.c()) {
                    jjxVar2.o = alad.J(alatVar);
                }
                akyl.i(list, jjxVar2.o);
            } else {
                if (!aooh.n(str, b.e)) {
                    throw new java.lang.IllegalArgumentException("Unsupported key: ".concat(java.lang.String.valueOf(str)));
                }
                akzx akzxVar2 = (akzx) jhwVarD.a;
                java.util.List listUnmodifiableList2 = j$.util.DesugarCollections.unmodifiableList(((defpackage.jjx) akzxVar2.b).p);
                aooh.e(listUnmodifiableList2, "getUserSuggestedInfoRequestedList(...)");
                new alct(listUnmodifiableList2);
                aooh.f(list, "values");
                akzxVar2.u();
                defpackage.jjx jjxVar3 = (defpackage.jjx) akzxVar2.b;
                alat alatVar2 = jjxVar3.p;
                if (!alatVar2.c()) {
                    jjxVar3.p = alad.J(alatVar2);
                }
                akyl.i(list, jjxVar3.p);
            }
        }
        return jhwVarD.b();
    }

    @Override // defpackage.jmt
    public final java.lang.Object b(android.content.Context context, defpackage.jlw jlwVar, aoln aolnVar) {
        defpackage.jjx jjxVar = jlwVar.c;
        if (jjxVar == null) {
            jjxVar = defpackage.jjx.a;
        }
        defpackage.jjw jjwVar = this.c;
        aooh.e(jjxVar, "getSpamDialogInfo(...)");
        java.lang.Object objB = jjwVar.b(jjxVar, aolnVar);
        return objB != aolu.a ? aojh.a : objB;
    }

    @Override // defpackage.jmt
    public final java.util.List c() {
        return ajsz.bb(new defpackage.jms[]{a, b});
    }
}
