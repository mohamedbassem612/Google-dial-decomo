package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acrg extends dap implements dan, dcp, dbd {
    public defpackage.acrc[] a;
    public crd b;
    public long c;
    public boolean d;
    public long e;
    public dpq f;
    public cqx g;
    public crd h;
    public cqx i;
    public int j;
    public int k;
    public final cpx l;
    public defpackage.vqy m;
    private final cnv n;

    public acrg(defpackage.acrc[] acrcVarArr, crd crdVar, long j) {
        aooh.f(crdVar, "shape");
        this.a = acrcVarArr;
        this.b = crdVar;
        this.c = j;
        this.d = true;
        this.e = 9205357640488583168L;
        this.l = new cpx((byte[]) null);
        this.j = Integer.MIN_VALUE;
        this.k = Integer.MIN_VALUE;
        cnv cnvVarN = ru.n(new aonj() { // from class: acrd
            /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v8, types: [aoss, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
            public final java.lang.Object a(java.lang.Object obj) throws aois {
                float fIntBitsToFloat;
                float fIntBitsToFloat2;
                cqx cqxVar;
                final dpf dpfVar = (cnw) obj;
                aooh.f(dpfVar, "$this$CacheDrawModifierNode");
                final defpackage.acrg acrgVar = this.a;
                if (acrgVar.k != Integer.MIN_VALUE) {
                    float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (dpfVar.n() & 4294967295L));
                    float f = acrgVar.k;
                    fIntBitsToFloat = fIntBitsToFloat3 - (f + f);
                } else {
                    fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (dpfVar.n() & 4294967295L));
                }
                if (acrgVar.j != Integer.MIN_VALUE) {
                    float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (dpfVar.n() >> 32));
                    float f2 = acrgVar.j;
                    fIntBitsToFloat2 = fIntBitsToFloat4 - (f2 + f2);
                } else {
                    fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (dpfVar.n() >> 32));
                }
                int i = acrgVar.j;
                float f3 = i != Integer.MIN_VALUE ? i : 0.0f;
                int i2 = acrgVar.k;
                float f4 = i2 != Integer.MIN_VALUE ? i2 : 0.0f;
                final long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                defpackage.vqy vqyVar = null;
                if (anty.ah(jFloatToRawIntBits, acrgVar.e) && dpfVar.o() == acrgVar.f && aooh.n(acrgVar.h, acrgVar.b)) {
                    cqxVar = acrgVar.g;
                    aooh.c(cqxVar);
                } else {
                    den.u(acrgVar, new aomy() { // from class: acrf
                        public final java.lang.Object a() {
                            defpackage.acrg acrgVar2 = acrgVar;
                            crd crdVar2 = acrgVar2.b;
                            long j2 = jFloatToRawIntBits;
                            cnw cnwVar = dpfVar;
                            acrgVar2.i = crdVar2.a(j2, cnwVar.o(), cnwVar);
                            return aojh.a;
                        }
                    });
                    cqxVar = acrgVar.i;
                    acrgVar.i = null;
                }
                acrgVar.g = cqxVar;
                acrgVar.e = jFloatToRawIntBits;
                acrgVar.f = dpfVar.o();
                acrgVar.h = acrgVar.b;
                aooh.c(cqxVar);
                cpx cpxVar = acrgVar.l;
                aooh.f(cqxVar, "<this>");
                cpxVar.l();
                j$.util.Objects.checkIndex(0, 4);
                if (cqxVar != null) {
                    if (cqxVar instanceof cqv) {
                        cpxVar.t(((cqv) cqxVar).a);
                    } else if (cqxVar instanceof cqw) {
                        cpxVar.q(((cqw) cqxVar).a, 1);
                    } else if (cqxVar instanceof cqu) {
                        cpxVar.s(((cqu) cqxVar).a);
                    }
                    if (f3 != 0.0f || f4 != 0.0f) {
                        cpxVar.o((((long) java.lang.Float.floatToRawIntBits(f3)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f4)) & 4294967295L));
                    }
                    defpackage.vqy vqyVar2 = acrgVar.m;
                    if (vqyVar2 == null) {
                        aooh.j("effectsController");
                    } else {
                        vqyVar = vqyVar2;
                    }
                    long jN = dpfVar.n();
                    defpackage.acrc[] acrcVarArr2 = acrgVar.a;
                    aooh.f(dpfVar, "density");
                    aooh.f(acrcVarArr2, "effects");
                    int length = acrcVarArr2.length;
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(aooc.t(ajsz.aL(length), 16));
                    for (int i3 = 0; i3 < length; i3 = 1) {
                        defpackage.acrc acrcVar = acrcVarArr2[0];
                        linkedHashMap.put(acrcVar.b(), acrcVar);
                    }
                    ?? r4 = vqyVar.c;
                    clg clgVar = (clg) r4;
                    for (java.lang.Object obj2 : ajsz.aH(clgVar.c, linkedHashMap.keySet())) {
                        defpackage.acrh acrhVar = (defpackage.acrh) clgVar.get(obj2);
                        if (acrhVar != null) {
                            acrhVar.b(new acri(vqyVar, obj2, acrhVar, 0));
                        }
                        vqyVar.a.remove(obj2);
                    }
                    for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                        java.lang.Object key = entry.getKey();
                        defpackage.acrc acrcVar2 = (defpackage.acrc) entry.getValue();
                        java.lang.Object objA = r4.get(key);
                        if (objA == null) {
                            objA = acrcVar2.a(vqyVar.b);
                            r4.put(key, objA);
                        }
                        defpackage.acrh acrhVar2 = (defpackage.acrh) objA;
                        ?? r15 = vqyVar.a;
                        if (r15.get(key) != acrcVar2) {
                            acrhVar2.a(acrcVar2);
                            r15.put(key, acrcVar2);
                        }
                    }
                    java.util.Iterator it = clgVar.d.iterator();
                    while (it.hasNext()) {
                        ((defpackage.acrh) it.next()).c(cpxVar, jN, dpfVar);
                    }
                    return dpfVar.q(new defpackage.acre(acrgVar, f3, f4, 0));
                }
                throw new aois();
            }
        });
        V(cnvVarN);
        this.n = cnvVarN;
    }

    private final void g() {
        this.e = 9205357640488583168L;
        this.f = null;
        this.g = null;
        this.h = null;
        this.n.b();
    }

    public final cyf cX(cyi cyiVar, cyd cydVar, long j) {
        aooh.f(cydVar, "measurable");
        czc czcVarV = cydVar.v(j);
        int iDp = cyiVar.dp(((dpi) cfo.G(this, bqd.c)).a);
        int iDm = czcVarV.a == iDp ? czcVarV.dm(bqd.b) : Integer.MIN_VALUE;
        int iDm2 = czcVarV.b == iDp ? czcVarV.dm(bqd.a) : Integer.MIN_VALUE;
        if (iDm != this.j || iDm2 != this.k) {
            this.j = iDm;
            this.k = iDm2;
            this.n.b();
        }
        return den.z(cyiVar, czcVarV.a, czcVarV.b, new defpackage.abph(czcVarV, 5));
    }

    public final void d(defpackage.acrc[] acrcVarArr, crd crdVar, long j, boolean z) {
        aooh.f(crdVar, "shape");
        if (java.util.Arrays.equals(this.a, acrcVarArr) && aooh.n(this.b, crdVar) && anty.ah(this.c, j) && this.d == z) {
            return;
        }
        this.a = acrcVarArr;
        this.b = crdVar;
        this.c = j;
        this.d = z;
        g();
    }

    public final void dc() {
        this.m = new defpackage.vqy(M());
    }

    public final /* synthetic */ int e(cxf cxfVar, cxe cxeVar, int i) {
        return wo.f(this, cxfVar, cxeVar, i);
    }

    public final /* synthetic */ int f(cxf cxfVar, cxe cxeVar, int i) {
        return wo.g(this, cxfVar, cxeVar, i);
    }

    public final /* synthetic */ int i(cxf cxfVar, cxe cxeVar, int i) {
        return wo.h(this, cxfVar, cxeVar, i);
    }

    public final /* synthetic */ int j(cxf cxfVar, cxe cxeVar, int i) {
        return wo.i(this, cxfVar, cxeVar, i);
    }

    public final void v() {
        g();
    }
}
