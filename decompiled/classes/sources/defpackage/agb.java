package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class agb implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ agb(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r12v12, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v56, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v68, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v79, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v81, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v83, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v88, types: [aonj, java.lang.Object] */
    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        java.lang.Object obj2 = null;
        int i = 0;
        boolean z = false;
        i = 0;
        switch (this.$cid) {
            case 0:
                defpackage.alc alcVar = (defpackage.alc) obj;
                defpackage.afr afrVar = defpackage.afr.a;
                defpackage.afr afrVar2 = defpackage.afr.b;
                boolean zD = alcVar.d(afrVar, afrVar2);
                java.lang.Object obj3 = this.a;
                if (zD) {
                    defpackage.afm afmVar = ((defpackage.agd) obj3).b.b.c;
                    if (afmVar != null) {
                        obj2 = afmVar.c;
                    }
                } else if (alcVar.d(afrVar2, defpackage.afr.c)) {
                    defpackage.afm afmVar2 = ((defpackage.agd) obj3).c.b.c;
                    if (afmVar2 != null) {
                        obj2 = afmVar2.c;
                    }
                } else {
                    obj2 = defpackage.aga.g;
                }
                return obj2 == null ? defpackage.aga.g : obj2;
            case 1:
                long j = ((defpackage.dpp) obj).a;
                long j2 = j >> 32;
                defpackage.aonj aonjVar = defpackage.aga.a;
                return new defpackage.dpp((((long) ((int) j2)) << 32) | (((long) ((java.lang.Number) this.a.a(java.lang.Integer.valueOf((int) (j & 4294967295L)))).intValue()) & 4294967295L));
            case 2:
                defpackage.alc alcVar2 = (defpackage.alc) obj;
                defpackage.afr afrVar3 = defpackage.afr.a;
                defpackage.afr afrVar4 = defpackage.afr.b;
                boolean zD2 = alcVar2.d(afrVar3, afrVar4);
                java.lang.Object obj4 = this.a;
                if (zD2) {
                    ahv ahvVar = ((defpackage.agd) obj4).b.b.b;
                    return ahvVar != null ? ahvVar.b : defpackage.aga.f;
                }
                if (!alcVar2.d(afrVar4, defpackage.afr.c)) {
                    return defpackage.aga.f;
                }
                ahv ahvVar2 = ((defpackage.agd) obj4).c.b.b;
                return ahvVar2 != null ? ahvVar2.b : defpackage.aga.f;
            case 3:
                return defpackage.mni.bp((defpackage.czc) this.a, (defpackage.czb) obj);
            case 4:
                return defpackage.mni.bp((defpackage.czc) this.a, (defpackage.czb) obj);
            case 5:
                ((defpackage.dbm) this.a).D();
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.alc alcVar3 = (defpackage.alc) obj;
                defpackage.afr afrVar5 = defpackage.afr.a;
                defpackage.afr afrVar6 = defpackage.afr.b;
                boolean zD3 = alcVar3.d(afrVar5, afrVar6);
                java.lang.Object obj5 = this.a;
                if (zD3) {
                    defpackage.afs afsVar = ((aic) obj5).a.b;
                    return defpackage.aga.e;
                }
                if (!alcVar3.d(afrVar6, defpackage.afr.c)) {
                    return defpackage.aga.e;
                }
                defpackage.afs afsVar2 = ((aic) obj5).b.b;
                return defpackage.aga.e;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                ((akr) this.a).f = ((java.lang.Long) obj).longValue();
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                long jLongValue = ((java.lang.Long) obj).longValue();
                akr akrVar = (akr) this.a;
                long j3 = akrVar.f;
                long j4 = 0;
                long j5 = j3 == Long.MIN_VALUE ? 0L : jLongValue - j3;
                akrVar.f = jLongValue;
                float f = akrVar.i;
                if (f > 0.0f && !java.lang.Float.isNaN(f)) {
                    j4 = defpackage.aopc.j(j5 / ((double) akrVar.i));
                }
                defpackage.adq adqVar = akrVar.k;
                if (adqVar.g()) {
                    java.lang.Object[] objArr = adqVar.a;
                    int i2 = adqVar.b;
                    for (int i3 = 0; i3 < i2; i3++) {
                        akh akhVar = (akh) objArr[i3];
                        akr.u(akhVar, j4);
                        akhVar.c = true;
                    }
                    defpackage.alg algVar = akrVar.c;
                    if (algVar != null) {
                        algVar.x();
                    }
                    int i4 = adqVar.b;
                    java.lang.Object[] objArr2 = adqVar.a;
                    defpackage.aopq aopqVarC = defpackage.aooc.C(0, i4);
                    int i5 = aopqVarC.a;
                    int i6 = aopqVarC.b;
                    if (i5 <= i6) {
                        while (true) {
                            objArr2[i5 - i] = objArr2[i5];
                            if (((akh) objArr2[i5]).c) {
                                i++;
                            }
                            if (i5 != i6) {
                                i5++;
                            }
                        }
                    }
                    int i7 = i4 - i;
                    if (objArr2 == null) {
                        defpackage.aooh.i("<this>");
                    }
                    java.util.Arrays.fill(objArr2, i7, i4, (java.lang.Object) null);
                    adqVar.b -= i;
                }
                akh akhVar2 = akrVar.g;
                if (akhVar2 != null) {
                    akhVar2.g = akrVar.d;
                    akr.u(akhVar2, j4);
                    akrVar.q(akhVar2.d);
                    if (akhVar2.d == 1.0f) {
                        akrVar.g = null;
                    }
                    akrVar.p();
                }
                return defpackage.aojh.a;
            case 9:
                java.lang.Long l = (java.lang.Long) obj;
                l.longValue();
                return this.a.a(l);
            case 10:
                return new ali(this.a, 0);
            case 11:
                java.lang.Object obj6 = this.a;
                defpackage.dip dipVar = defpackage.din.a;
                java.util.List listSingletonList = java.util.Collections.singletonList(obj6);
                defpackage.aooh.e(listSingletonList, "singletonList(...)");
                ((defpackage.diq) obj).a(dipVar, listSingletonList);
                return defpackage.aojh.a;
            case 12:
                defpackage.anj anjVar = (defpackage.anj) obj;
                if (defpackage.aooh.n(anjVar.b(), "waiting")) {
                    ((defpackage.aoot) this.a).a = anjVar;
                } else {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 13:
                ank ankVar = (defpackage.ddh) obj;
                if (!(ankVar instanceof ank)) {
                    throw new java.lang.IllegalStateException("Node is not a GestureNode instance");
                }
                defpackage.anj anjVar2 = ankVar.a;
                obj2 = true == (anjVar2 instanceof defpackage.anj) ? anjVar2 : null;
                return java.lang.Boolean.valueOf(obj2 != null ? ((java.lang.Boolean) this.a.a(obj2)).booleanValue() : true);
            case 14:
                java.lang.Object obj7 = this.a;
                defpackage.diq diqVar = (defpackage.diq) obj;
                defpackage.dip dipVar2 = defpackage.din.a;
                java.util.List listSingletonList2 = java.util.Collections.singletonList(obj7);
                defpackage.aooh.e(listSingletonList2, "singletonList(...)");
                diqVar.a(dipVar2, listSingletonList2);
                diqVar.a(defpackage.din.A, new defpackage.dib(5));
                return defpackage.aojh.a;
            case 15:
                float fFloatValue = ((java.lang.Float) obj).floatValue();
                aon aonVar = (aon) this.a;
                float fC = aonVar.c() + fFloatValue + aonVar.c;
                float fS = defpackage.aooc.s(fC, 0.0f, aonVar.b());
                float fC2 = fS - aonVar.c();
                int iRound = java.lang.Math.round(fC2);
                aonVar.e(aonVar.c() + iRound);
                aonVar.c = fC2 - iRound;
                if (fC != fS) {
                    fFloatValue = fC2;
                }
                return java.lang.Float.valueOf(fFloatValue);
            case 16:
                this.a.a();
                return defpackage.aojh.a;
            case 17:
                cvm cvmVar = (cvm) obj;
                this.a.a(cvmVar, new defpackage.cpm(defpackage.uu.x(cvmVar)));
                cvmVar.b();
                return defpackage.aojh.a;
            case 18:
                java.lang.Float f2 = (java.lang.Float) obj;
                f2.floatValue();
                defpackage.aono aonoVar = arp.a;
                ((defpackage.aonj) this.a.a()).a(f2);
                return defpackage.aojh.a;
            case 19:
                defpackage.anj anjVar3 = (defpackage.anj) obj;
                defpackage.aono aonoVar2 = arp.a;
                return java.lang.Boolean.valueOf(anjVar3 instanceof defpackage.arn ? ((java.lang.Boolean) this.a.a(anjVar3)).booleanValue() : true);
            default:
                return java.lang.Boolean.valueOf(rr.d((defpackage.ato) this.a, java.lang.Float.intBitsToFloat((int) (((asw) obj).a & 4294967295L))));
        }
    }
}
