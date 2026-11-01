package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jmw implements defpackage.jmt {
    private static final defpackage.jms a = new defpackage.jms(2132020031, ajsz.bb(new java.lang.Integer[]{2132020030, 2132020029, 2132020028, 2132020027, 2132020026}), 50, ajsz.aO(new aoiu[]{new aoiu(defpackage.jmr.a, rmx.uJ), new aoiu(defpackage.jmr.b, rmx.uK), new aoiu(defpackage.jmr.c, rmx.uN), new aoiu(defpackage.jmr.d, rmx.uL), new aoiu(defpackage.jmr.e, rmx.uM), new aoiu(defpackage.jmr.f, rmx.uO), new aoiu(defpackage.jmr.g, rmx.uP), new aoiu(defpackage.jmr.h, rmx.uQ)}), "checked_scam_type_selectors_key", "custom_scam_type_key");
    private static final defpackage.jms b = new defpackage.jms(2132020025, ajsz.bb(new java.lang.Integer[]{2132020024, 2132020023, 2132020022, 2132020021, 2132020020, 2132020019, 2132020018}), 100, ajsz.aO(new aoiu[]{new aoiu(defpackage.jmr.a, rmx.uR), new aoiu(defpackage.jmr.b, rmx.uS), new aoiu(defpackage.jmr.c, rmx.uV), new aoiu(defpackage.jmr.d, rmx.uT), new aoiu(defpackage.jmr.e, rmx.uU), new aoiu(defpackage.jmr.f, rmx.uW), new aoiu(defpackage.jmr.g, rmx.uX), new aoiu(defpackage.jmr.h, rmx.uY)}), "checked_scam_identity_selectors_key", "custom_scam_identity_key");
    private final defpackage.jjw c;

    public jmw(defpackage.jjw jjwVar) {
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
                java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.jjx) akzxVar.b).m);
                aooh.e(listUnmodifiableList, "getUserSuggestedScamTypesList(...)");
                new alct(listUnmodifiableList);
                aooh.f(list, "values");
                akzxVar.u();
                defpackage.jjx jjxVar2 = (defpackage.jjx) akzxVar.b;
                alat alatVar = jjxVar2.m;
                if (!alatVar.c()) {
                    jjxVar2.m = alad.J(alatVar);
                }
                akyl.i(list, jjxVar2.m);
            } else {
                if (!aooh.n(str, b.e)) {
                    throw new java.lang.IllegalArgumentException("Unsupported key: ".concat(java.lang.String.valueOf(str)));
                }
                akzx akzxVar2 = (akzx) jhwVarD.a;
                java.util.List listUnmodifiableList2 = j$.util.DesugarCollections.unmodifiableList(((defpackage.jjx) akzxVar2.b).n);
                aooh.e(listUnmodifiableList2, "getUserSuggestedScamIdentitiesList(...)");
                new alct(listUnmodifiableList2);
                aooh.f(list, "values");
                akzxVar2.u();
                defpackage.jjx jjxVar3 = (defpackage.jjx) akzxVar2.b;
                alat alatVar2 = jjxVar3.n;
                if (!alatVar2.c()) {
                    jjxVar3.n = alad.J(alatVar2);
                }
                akyl.i(list, jjxVar3.n);
            }
        }
        return jhwVarD.b();
    }

    @Override // defpackage.jmt
    public final java.lang.Object b(android.content.Context context, defpackage.jlw jlwVar, aoln aolnVar) {
        boolean z = jlwVar.e;
        defpackage.jjw jjwVar = this.c;
        if (z) {
            defpackage.jjx jjxVar = jlwVar.c;
            if (jjxVar == null) {
                jjxVar = defpackage.jjx.a;
            }
            aooh.e(jjxVar, "getSpamDialogInfo(...)");
            java.lang.Object objA = jjwVar.a(context, jjxVar, aolnVar);
            if (objA == aolu.a) {
                return objA;
            }
        } else {
            defpackage.jjx jjxVar2 = jlwVar.c;
            if (jjxVar2 == null) {
                jjxVar2 = defpackage.jjx.a;
            }
            aooh.e(jjxVar2, "getSpamDialogInfo(...)");
            java.lang.Object objC = jjwVar.c(jjxVar2, aolnVar);
            if (objC == aolu.a) {
                return objC;
            }
        }
        return aojh.a;
    }

    @Override // defpackage.jmt
    public final java.util.List c() {
        return ajsz.bb(new defpackage.jms[]{a, b});
    }
}
