package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dqy implements cye {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Enum b;

    public dqy(aso asoVar, defpackage.bun bunVar, int i) {
        this.$cid = i;
        this.b = asoVar;
        this.a = bunVar;
    }

    public final /* synthetic */ int a(cxf cxfVar, java.util.List list, int i) {
        return this.$cid != 0 ? vn.f(this, cxfVar, list, i) : vn.f(this, cxfVar, list, i);
    }

    public final /* synthetic */ int b(cxf cxfVar, java.util.List list, int i) {
        return this.$cid != 0 ? vn.g(this, cxfVar, list, i) : vn.g(this, cxfVar, list, i);
    }

    public final /* synthetic */ int c(cxf cxfVar, java.util.List list, int i) {
        return this.$cid != 0 ? vn.h(this, cxfVar, list, i) : vn.h(this, cxfVar, list, i);
    }

    public final /* synthetic */ int d(cxf cxfVar, java.util.List list, int i) {
        return this.$cid != 0 ? vn.i(this, cxfVar, list, i) : vn.i(this, cxfVar, list, i);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aoiq */
    public final cyf e(cyi cyiVar, java.util.List list, long j) throws aoiq {
        int i;
        final int i2;
        final int i3;
        int i4;
        if (this.$cid == 0) {
            ((defpackage.drq) this.a).f = this.b;
            return den.z(cyiVar, 0, 0, new defpackage.dkq(12));
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            cyd cydVar = (cyd) list.get(i5);
            if (cwh.j(cydVar) == defpackage.btx.a) {
                final czc czcVarV = cydVar.v(j);
                int size2 = list.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    cyd cydVar2 = (cyd) list.get(i6);
                    if (cwh.j(cydVar2) == defpackage.btx.b) {
                        aso asoVar = this.b;
                        aso asoVar2 = aso.a;
                        final czc czcVarV2 = asoVar == asoVar2 ? cydVar2.v(dpd.k(dpe.g(j, 0, -czcVarV.b), 0, 0, 0, 0, 14)) : cydVar2.v(dpd.k(dpe.g(j, -czcVarV.a, 0), 0, 0, 0, 0, 11));
                        czcVarV2.dm(defpackage.bul.a);
                        int i7 = czcVarV.a;
                        int i8 = czcVarV.b;
                        if (asoVar == asoVar2) {
                            int iMax = java.lang.Math.max(czcVarV2.a, i7);
                            i4 = czcVarV2.b + i8;
                            i = (iMax - czcVarV2.a) / 2;
                            i3 = iMax;
                            i2 = i8 / 2;
                        } else {
                            int i9 = czcVarV2.a + i7;
                            int iMax2 = java.lang.Math.max(czcVarV2.b, i8);
                            i = i7 / 2;
                            i2 = (iMax2 - czcVarV2.b) / 2;
                            i3 = i9;
                            i4 = iMax2;
                        }
                        final int i10 = i;
                        final defpackage.bun bunVar = (defpackage.bun) this.a;
                        bunVar.g.h(i3);
                        bunVar.h.h(i4);
                        final aso asoVar3 = asoVar;
                        final int i11 = i4;
                        return den.z(cyiVar, i3, i11, new aonj() { // from class: buf
                            public final java.lang.Object a(java.lang.Object obj) {
                                int i12;
                                int i13;
                                czb czbVar = (czb) obj;
                                defpackage.bun bunVar2 = bunVar;
                                float fB = bunVar2.b();
                                float[] fArr = bunVar2.a;
                                if (!aooh.k(fB, (java.lang.Float) null)) {
                                    aooh.k(fB, (java.lang.Float) null);
                                }
                                int i14 = i10;
                                int i15 = i2;
                                czc czcVar = czcVarV2;
                                czc czcVar2 = czcVarV;
                                if (asoVar3 == aso.a) {
                                    i13 = (i3 - czcVar2.a) / 2;
                                    i12 = aopc.i(czcVar.b * fB) + (i15 - (czcVar2.b / 2));
                                } else {
                                    int i16 = i11;
                                    int i17 = (aopc.i(czcVar.a * fB) + i14) - (czcVar2.a / 2);
                                    i12 = (i16 - czcVar2.b) / 2;
                                    i13 = i17;
                                }
                                czbVar.u(czcVar, i14, i15, 0.0f);
                                czbVar.u(czcVar2, i13, i12, 0.0f);
                                return aojh.a;
                            }
                        });
                    }
                }
                dpy.a("Collection contains no element matching the predicate.");
                throw new aoiq();
            }
        }
        dpy.a("Collection contains no element matching the predicate.");
        throw new aoiq();
    }

    public dqy(defpackage.drq drqVar, dpq dpqVar, int i) {
        this.$cid = i;
        this.a = drqVar;
        this.b = dpqVar;
    }
}
