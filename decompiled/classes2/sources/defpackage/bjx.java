package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bjx implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ bjx(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, boolean z, int i) {
        this.$cid = i;
        this.d = obj;
        this.c = obj2;
        this.b = obj3;
        this.a = z;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00af  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e0  */
    /* JADX WARN: Type inference failed for: r0v1, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v4, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [aonj, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            dbm dbmVar = (dbm) obj;
            dbmVar.D();
            if (((java.lang.Boolean) this.b.a()).booleanValue()) {
                java.lang.Object obj2 = this.c;
                java.lang.Object obj3 = this.d;
                if (this.a) {
                    long jN = dbmVar.n();
                    csg csgVarQ = dbmVar.q();
                    long jA = csgVarQ.a();
                    csgVarQ.b().g();
                    try {
                        csgVarQ.c.q(-1.0f, 1.0f, jN);
                        den.K(dbmVar, (cpu) obj3, (cqh) obj2, 46);
                    } finally {
                        csgVarQ.b().e();
                        csgVarQ.h(jA);
                    }
                } else {
                    den.K(dbmVar, (cpu) obj3, (cqh) obj2, 46);
                }
            }
            return aojh.a;
        }
        if (i == 1) {
            ((czb) obj).x(new defpackage.bud((java.util.List) this.c, (java.util.List) this.b, this.a, 1));
            this.d.a();
            return aojh.a;
        }
        if (i == 2) {
            boolean z = this.a;
            ?? r4 = this.b;
            return new defpackage.btt(this.d, this.c, (defpackage.btu) obj, r4, z);
        }
        dkw dkwVar = (dkw) obj;
        ?? r0 = this.b;
        int i2 = abew.a;
        aooh.f(dkwVar, "it");
        this.d.b(dkwVar);
        aooh.f(dkwVar, "<this>");
        aooh.f((java.lang.Object) r0, "annotations");
        java.util.ArrayList<abeq> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj4 : r0) {
            abeo abeoVar = (abeq) obj4;
            if ((abeoVar instanceof abeo) && abeoVar.a == abex.s) {
                arrayList.add(obj4);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (abeq abeqVar : arrayList) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            int iA = abeqVar.a();
            for (int iB = abeqVar.b(); iB < iA; iB++) {
                cpn cpnVarJ = dkwVar.j(iB);
                if (arrayList3.isEmpty()) {
                    arrayList3.add(new defpackage.abfa(abeqVar, cpnVarJ, true, true));
                }
                boolean z2 = this.a;
                defpackage.abfa abfaVar = (defpackage.abfa) arrayList3.remove(arrayList3.size() - 1);
                cpn cpnVar = abfaVar.b;
                float f = cpnVar.e;
                float f2 = cpnVarJ.e;
                if (f == f2) {
                    if (f == f2) {
                        arrayList3.add(defpackage.abfa.a(abfaVar, cpnVar, 5));
                        arrayList3.add(defpackage.abfa.a(abfaVar, cpnVarJ, 9));
                    } else if (z2) {
                        arrayList3.add(defpackage.abfa.a(abfaVar, cpn.j(cpnVar, java.lang.Math.min(cpnVar.b, cpnVarJ.b), 0.0f, 0.0f, 14), 13));
                    } else {
                        arrayList3.add(defpackage.abfa.a(abfaVar, cpn.j(cpnVar, 0.0f, java.lang.Math.max(cpnVar.d, cpnVarJ.d), 0.0f, 11), 13));
                    }
                } else if (z2) {
                    arrayList3.add(defpackage.abfa.a(abfaVar, cpnVar, 9));
                    arrayList3.add(defpackage.abfa.a(abfaVar, cpnVarJ, 5));
                } else {
                    z2 = false;
                    if (f == f2) {
                        arrayList3.add(defpackage.abfa.a(abfaVar, cpnVar, 5));
                        arrayList3.add(defpackage.abfa.a(abfaVar, cpnVarJ, 9));
                    } else if (z2) {
                        arrayList3.add(defpackage.abfa.a(abfaVar, cpn.j(cpnVar, java.lang.Math.min(cpnVar.b, cpnVarJ.b), 0.0f, 0.0f, 14), 13));
                    } else {
                        arrayList3.add(defpackage.abfa.a(abfaVar, cpn.j(cpnVar, 0.0f, java.lang.Math.max(cpnVar.d, cpnVarJ.d), 0.0f, 11), 13));
                    }
                }
            }
            ajsz.bv(arrayList2, arrayList3);
        }
        this.c.b(arrayList2);
        return aojh.a;
    }

    public /* synthetic */ bjx(java.lang.Object obj, boolean z, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = z;
        this.d = obj2;
        this.c = obj3;
    }
}
