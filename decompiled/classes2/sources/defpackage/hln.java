package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hln {
    public final jyz a;
    private final aoir b;
    private final aoir c;
    private final aoir d;
    private final aeqx e;
    private final tkl f;
    private final ahbv g;

    public hln(ahbv ahbvVar, tkl tklVar, aeqx aeqxVar, jyz jyzVar, zjm zjmVar, aoin aoinVar, aoin aoinVar2) {
        aooh.f(jyzVar, "coalescedRowsUpdatedNotifier");
        aooh.f(aoinVar, "enableHalo");
        this.g = ahbvVar;
        this.f = tklVar;
        this.e = aeqxVar;
        this.a = jyzVar;
        this.b = aooc.ag(new defpackage.hll(zjmVar, 1));
        this.c = aooc.ag(new defpackage.hll(aoinVar, 0));
        this.d = aooc.ag(new defpackage.hll(aoinVar2, 2));
    }

    private final kgu b(kiu kiuVar) {
        kgz kgzVar = (kgz) this.b.a();
        if (kgzVar != null) {
            return kgzVar.b(kiuVar);
        }
        return null;
    }

    private final boolean c() {
        java.lang.Object objA = this.c.a();
        aooh.e(objA, "getValue(...)");
        return ((java.lang.Boolean) objA).booleanValue();
    }

    private final boolean d() {
        java.lang.Object objA = this.d.a();
        aooh.e(objA, "getValue(...)");
        return ((java.lang.Boolean) objA).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:52:0x012f  */
    /* JADX WARN: Code duplicated, block: B:55:0x013e  */
    /* JADX WARN: Code duplicated, block: B:58:0x014b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0158  */
    /* JADX WARN: Code duplicated, block: B:63:0x015f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0165  */
    /* JADX WARN: Code duplicated, block: B:67:0x016c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0173  */
    /* JADX WARN: Code duplicated, block: B:73:0x019e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a0 A[SYNTHETIC] */
    public final java.lang.Object a(long j, aoln aolnVar) {
        defpackage.hlm hlmVar;
        long j2;
        aokc aokcVarBY;
        defpackage.hls hlrVar;
        defpackage.hlq hlqVar;
        defpackage.hkd hkdVar;
        defpackage.kiw kiwVar;
        defpackage.kiw kiwVar2;
        defpackage.kiw kiwVar3;
        defpackage.kiw kiwVar4;
        defpackage.kiw kiwVar5;
        defpackage.kis kisVar;
        if (aolnVar instanceof defpackage.hlm) {
            hlmVar = (defpackage.hlm) aolnVar;
            int i = hlmVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hlmVar.d = i - Integer.MIN_VALUE;
            } else {
                hlmVar = new defpackage.hlm(this, aolnVar);
            }
        } else {
            hlmVar = new defpackage.hlm(this, aolnVar);
        }
        java.lang.Object objD = hlmVar.b;
        aolu aoluVar = aolu.a;
        int i2 = hlmVar.d;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.g.x();
            hlmVar.a = j;
            hlmVar.d = 1;
            objD = aosv.D(ajcqVarX, hlmVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
            j2 = j;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = hlmVar.a;
            aooc.af(objD);
        }
        aooh.e(objD, "await(...)");
        kiv kivVar = (kiv) aooh.q((j$.util.Optional) objD);
        if (kivVar == null || (aokcVarBY = kivVar.b) == null) {
            return aokc.a;
        }
        if (!c()) {
            aopq aopqVarC = aooc.C(0, java.lang.Math.min((int) j2, kivVar.b.size()));
            aooh.f(aopqVarC, "indices");
            aokcVarBY = aopqVarC.d() ? aokc.a : ajsz.bZ(aokcVarBY.subList(aopqVarC.c().intValue(), aopqVarC.b().intValue() + 1));
        }
        if (!d()) {
            aokc arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : aokcVarBY) {
                kiu kiuVar = (kiu) obj;
                aooh.c(kiuVar);
                if (b(kiuVar) == null) {
                    arrayList.add(obj);
                }
            }
            aokcVarBY = arrayList;
        }
        if (c()) {
            aokcVarBY = ajsz.bY(aokcVarBY, (int) j2);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(aokcVarBY, 10));
        for (java.util.Iterator it = aokcVarBY.iterator(); it.hasNext(); it = it) {
            kiu kiuVar2 = (kiu) it.next();
            j$.time.Instant instantOfEpochMilli = j$.time.Instant.ofEpochMilli(kiuVar2.e);
            aooh.e(instantOfEpochMilli, "ofEpochMilli(...)");
            aooh.c(kiuVar2);
            if (d()) {
                kgu kguVarB = b(kiuVar2);
                if (kguVarB == null) {
                    java.lang.String str = kiuVar2.g;
                    aooh.e(str, "getRawNumber(...)");
                    hlqVar = new defpackage.hlq(str);
                } else {
                    java.lang.String str2 = kguVarB.c;
                    aooh.e(str2, "getUuid(...)");
                    hlrVar = new defpackage.hlr(str2);
                }
                hkdVar = kiuVar2.f;
                if (hkdVar == null) {
                    hkdVar = defpackage.hkd.a;
                }
                defpackage.hkd hkdVar2 = hkdVar;
                long j3 = kiuVar2.H;
                boolean z = kiuVar2.k;
                int i3 = kiuVar2.q;
                kiwVar = kiuVar2.r;
                if (kiwVar == null) {
                    kiwVar = defpackage.kiw.a;
                }
                java.lang.String str3 = kiwVar.c;
                aooh.e(str3, "getName(...)");
                kiwVar2 = kiuVar2.r;
                if (kiwVar2 == null) {
                    kiwVar2 = defpackage.kiw.a;
                }
                java.lang.String str4 = kiwVar2.e;
                aooh.e(str4, "getPhotoUri(...)");
                kiwVar3 = kiuVar2.r;
                if (kiwVar3 == null) {
                    kiwVar4 = defpackage.kiw.a;
                } else {
                    kiwVar4 = kiwVar3;
                }
                long j4 = kiwVar4.f;
                if (kiwVar3 == null) {
                    kiwVar5 = defpackage.kiw.a;
                } else {
                    kiwVar5 = kiwVar3;
                }
                java.lang.String str5 = kiwVar5.h;
                if (kiwVar3 == null) {
                    kiwVar3 = defpackage.kiw.a;
                }
                java.lang.String str6 = kiwVar3.g;
                aooh.e(str6, "getLookupUri(...)");
                defpackage.hmh hmhVar = new defpackage.hmh(str3, str4, j4, str5, str6);
                tkl tklVar = this.f;
                boolean zV = tklVar.v(kiuVar2);
                boolean zT = tklVar.t(kiuVar2);
                aeqx aeqxVar = this.e;
                java.lang.CharSequence charSequenceD = aeqxVar.d(kiuVar2, true);
                java.lang.String strG = aeqxVar.g(kiuVar2);
                kisVar = kiuVar2.u;
                if (kisVar == null) {
                    kisVar = defpackage.kis.a;
                }
                arrayList2.add(new defpackage.hlt(instantOfEpochMilli, hlrVar, j3, z, i3, hkdVar2, hmhVar, zV, zT, charSequenceD, strG, kisVar.b.size()));
            } else {
                java.lang.String str7 = kiuVar2.g;
                aooh.e(str7, "getRawNumber(...)");
                hlqVar = new defpackage.hlq(str7);
            }
            hlrVar = hlqVar;
            hkdVar = kiuVar2.f;
            if (hkdVar == null) {
                hkdVar = defpackage.hkd.a;
            }
            defpackage.hkd hkdVar3 = hkdVar;
            long j5 = kiuVar2.H;
            boolean z2 = kiuVar2.k;
            int i4 = kiuVar2.q;
            kiwVar = kiuVar2.r;
            if (kiwVar == null) {
                kiwVar = defpackage.kiw.a;
            }
            java.lang.String str8 = kiwVar.c;
            aooh.e(str8, "getName(...)");
            kiwVar2 = kiuVar2.r;
            if (kiwVar2 == null) {
                kiwVar2 = defpackage.kiw.a;
            }
            java.lang.String str9 = kiwVar2.e;
            aooh.e(str9, "getPhotoUri(...)");
            kiwVar3 = kiuVar2.r;
            if (kiwVar3 == null) {
                kiwVar4 = defpackage.kiw.a;
            } else {
                kiwVar4 = kiwVar3;
            }
            long j6 = kiwVar4.f;
            if (kiwVar3 == null) {
                kiwVar5 = defpackage.kiw.a;
            } else {
                kiwVar5 = kiwVar3;
            }
            java.lang.String str10 = kiwVar5.h;
            if (kiwVar3 == null) {
                kiwVar3 = defpackage.kiw.a;
            }
            java.lang.String str11 = kiwVar3.g;
            aooh.e(str11, "getLookupUri(...)");
            defpackage.hmh hmhVar2 = new defpackage.hmh(str8, str9, j6, str10, str11);
            tkl tklVar2 = this.f;
            boolean zV2 = tklVar2.v(kiuVar2);
            boolean zT2 = tklVar2.t(kiuVar2);
            aeqx aeqxVar2 = this.e;
            java.lang.CharSequence charSequenceD2 = aeqxVar2.d(kiuVar2, true);
            java.lang.String strG2 = aeqxVar2.g(kiuVar2);
            kisVar = kiuVar2.u;
            if (kisVar == null) {
                kisVar = defpackage.kis.a;
            }
            arrayList2.add(new defpackage.hlt(instantOfEpochMilli, hlrVar, j5, z2, i4, hkdVar3, hmhVar2, zV2, zT2, charSequenceD2, strG2, kisVar.b.size()));
        }
        return arrayList2;
    }
}
