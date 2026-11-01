package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bud implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ bud(java.lang.Object obj, boolean z, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = z;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v13, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.List] */
    public final java.lang.Object a(java.lang.Object obj) {
        boolean z;
        int i = this.$cid;
        if (i == 0) {
            diq diqVar = (diq) obj;
            if (!this.a) {
                dfb.d(diqVar);
            }
            java.lang.Object obj2 = this.b;
            defpackage.bun bunVar = (defpackage.bun) obj2;
            aopm aopmVar = bunVar.f;
            if (((java.lang.Number) aopmVar.b()).floatValue() < 0.0f) {
                dfb.q(diqVar, java.lang.String.valueOf(aopc.i(bunVar.d() * 100.0f) / 100.0f));
            }
            diqVar.a(did.i, new dhr((java.lang.String) null, new bly(obj2, this.c, 11)));
            dfb.n(diqVar, new defpackage.dia(aooc.s(bunVar.d(), ((java.lang.Number) aopmVar.b()).floatValue(), ((java.lang.Number) aopmVar.a()).floatValue()), new aopm(((java.lang.Number) aopmVar.b()).floatValue(), ((java.lang.Number) aopmVar.a()).floatValue())));
            return aojh.a;
        }
        int i2 = 0;
        if (i == 1) {
            czb czbVar = (czb) obj;
            ?? r0 = this.b;
            int size = r0.size();
            int i3 = 0;
            while (true) {
                z = this.a;
                if (i3 >= size) {
                    break;
                }
                ((defpackage.bcc) r0.get(i3)).n(czbVar, z);
                i3++;
            }
            ?? r8 = this.c;
            int size2 = r8.size();
            while (i2 < size2) {
                ((defpackage.bcc) r8.get(i2)).n(czbVar, z);
                i2++;
            }
            return aojh.a;
        }
        if (i == 2) {
            diq diqVar2 = (diq) obj;
            if (this.a) {
                dfb.l(diqVar2, 0);
            }
            java.lang.Object obj3 = this.b;
            java.lang.Object obj4 = this.c;
            dfb.e(diqVar2, (java.lang.String) null, new defpackage.bup(obj3, i2));
            dfb.m(diqVar2, (java.lang.String) obj4);
            return aojh.a;
        }
        if (i == 3) {
            final ?? r9 = this.c;
            final boolean z2 = this.a;
            java.lang.Object obj5 = this.b;
            final defpackage.fvs fvsVar = (defpackage.fvs) obj5;
            emv emvVar = new emv() { // from class: fxe
                public final void a(emx emxVar, emp empVar) {
                    java.util.List list = r9;
                    boolean z3 = z2;
                    defpackage.fvs fvsVar2 = fvsVar;
                    if (z3 && !list.contains(fvsVar2)) {
                        list.add(fvsVar2);
                    }
                    if (empVar == emp.ON_START && !list.contains(fvsVar2)) {
                        list.add(fvsVar2);
                    }
                    if (empVar == emp.ON_STOP) {
                        list.remove(fvsVar2);
                    }
                }
            };
            fvsVar.f.c(emvVar);
            return new oc(obj5, emvVar, 9);
        }
        dpf dpfVar = (dpf) obj;
        aooh.f(dpfVar, "$this$absoluteOffset");
        float f = ((dpi) this.b.a()).a;
        float fFloatValue = ((java.lang.Number) this.c.a()).floatValue();
        float fBs = afsq.bs(1.0f, java.lang.Math.abs(fFloatValue), 0.0f, 0.5f, 32);
        ajh ajhVar = defpackage.abft.a;
        int i4 = (fFloatValue > 0.0f ? 1 : (fFloatValue == 0.0f ? 0 : -1)) ^ (-1);
        int i5 = i4 >>> 31;
        float fA = (defpackage.abft.a.a(fBs) * defpackage.abft.d) + 0.0f;
        float f2 = i4 < 0 ? 0.0f : fA;
        boolean z3 = this.a;
        if (1 != i5) {
            fA = 0.0f;
        }
        if (true != z3) {
            f2 = fA;
        }
        int iDp = dpfVar.dp((f - f2) + 0.0f);
        if (!z3) {
            iDp = -iDp;
        }
        return new dpn(((long) iDp) << 32);
    }

    public /* synthetic */ bud(java.util.List list, java.util.List list2, boolean z, int i) {
        this.$cid = i;
        this.b = list;
        this.c = list2;
        this.a = z;
    }

    public /* synthetic */ bud(boolean z, defpackage.bun bunVar, aonj aonjVar, int i) {
        this.$cid = i;
        this.a = z;
        this.b = bunVar;
        this.c = aonjVar;
    }

    public /* synthetic */ bud(boolean z, java.lang.String str, defpackage.but butVar, int i) {
        this.$cid = i;
        this.a = z;
        this.c = str;
        this.b = butVar;
    }
}
