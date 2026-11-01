package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lzz implements agyz {
    public static final aimz a = aimz.i("com/android/dialer/conversationhistorycalldetails/dataservice/UiModelDataSource");
    public static final agxj b = new agxj("CALL_DETAILS_UI_MODEL_CONTENT_KEY");
    public final defpackage.lzs c;
    public final aolr d;
    public final ojo e;
    private final defpackage.lzm f;
    private final defpackage.lzv g;
    private final aoss h;
    private final sqo i;
    private final defpackage.lzt j;

    public lzz(defpackage.lzm lzmVar, defpackage.lzv lzvVar, aoss aossVar, defpackage.lzs lzsVar, aolr aolrVar, sqo sqoVar, ojo ojoVar, defpackage.lzt lztVar) {
        this.f = lzmVar;
        this.g = lzvVar;
        this.h = aossVar;
        this.c = lzsVar;
        this.d = aolrVar;
        this.i = sqoVar;
        this.e = ojoVar;
        this.j = lztVar;
    }

    public final agxk a() {
        return b;
    }

    public final ajcq b() {
        return aosv.F(this.h, 0, new defpackage.lve(this, (aoln) null, 3), 3);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:41:0x0127  */
    /* JADX WARN: Code duplicated, block: B:44:0x013e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0151  */
    /* JADX WARN: Code duplicated, block: B:47:0x0159  */
    /* JADX WARN: Code duplicated, block: B:51:0x0189  */
    /* JADX WARN: Code duplicated, block: B:55:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:61:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r9v11, types: [aoss, java.lang.Object] */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.lzx lzxVar;
        defpackage.lzm lzmVar;
        kiu kiuVar;
        j$.util.Optional optionalG;
        j$.util.Optional optionalG2;
        ajcq ajcqVarZ;
        defpackage.kiw kiwVar;
        long j;
        ajcq ajcqVarH;
        java.lang.Object objD;
        kiu kiuVar2;
        defpackage.lzv lzvVar;
        defpackage.lzl lzlVar;
        kgz kgzVar;
        defpackage.hkd hkdVar;
        ajcq ajcqVarF;
        java.lang.Object objD2;
        defpackage.lzl lzlVar2;
        kiu kiuVar3;
        java.util.ArrayList arrayList;
        defpackage.lzz lzzVar = this;
        if (aolnVar instanceof defpackage.lzx) {
            lzxVar = (defpackage.lzx) aolnVar;
            int i = lzxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lzxVar.c = i - Integer.MIN_VALUE;
            } else {
                lzxVar = new defpackage.lzx(lzzVar, aolnVar);
            }
        } else {
            lzxVar = new defpackage.lzx(lzzVar, aolnVar);
        }
        java.lang.Object objD3 = lzxVar.a;
        aolu aoluVar = aolu.a;
        int i2 = lzxVar.c;
        int i3 = 6;
        int i4 = 4;
        byte[] bArr = null;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objD3);
            } else if (i2 == 2) {
                aooc.af(objD3);
                lzmVar = lzzVar.f;
                zjm zjmVar = lzmVar.d;
                kiuVar = (kiu) objD3;
                optionalG = lzmVar.c.g();
                optionalG2 = zjmVar.g();
                if (optionalG.isPresent()) {
                    ajcqVarZ = ahvr.H(((tcv) ((aogc) optionalG.orElseThrow()).a).a(), new lix(6), lzmVar.b);
                } else {
                    ajcqVarZ = aiql.z(java.lang.Boolean.FALSE);
                }
                kiwVar = kiuVar.r;
                if (kiwVar == null) {
                    kiwVar = defpackage.kiw.a;
                }
                j = kiwVar.t;
                if (!optionalG2.isPresent()) {
                    if (j <= 0) {
                        ajcqVarH = ((zzx) optionalG2.orElseThrow()).r();
                    } else {
                        java.lang.String strValueOf = java.lang.String.valueOf(j);
                        ajcqVarH = ahvr.H(((zzx) optionalG2.orElseThrow()).q(new aile(strValueOf)), new defpackage.lgd(strValueOf, 20), lzmVar.b);
                    }
                    ajcq ajcqVarO = ahvr.ak(new ajcq[]{ajcqVarZ, ajcqVarH}).o(new defpackage.lly(ajcqVarZ, ajcqVarH, i4), lzmVar.b);
                    lzxVar.d = kiuVar;
                    lzxVar.c = 3;
                    objD = aosv.D(ajcqVarO, lzxVar);
                    if (objD != aoluVar) {
                        return aoluVar;
                    }
                    kiuVar2 = kiuVar;
                    objD3 = objD;
                    lzvVar = lzzVar.g;
                    lzlVar = (defpackage.lzl) objD3;
                    kgzVar = (kgz) lzvVar.h.g().orElse((java.lang.Object) null);
                    if (kgzVar != null) {
                        aooh.f(kiuVar2, "coalescedRow");
                        ajcqVarF = aosv.F(kgzVar.c, 0, new defpackage.jpj(kgzVar, kiuVar2, (aoln) null, 18), 3);
                    } else {
                        defpackage.ifb ifbVar = lzvVar.i;
                        int i5 = kiuVar2.i;
                        hkdVar = kiuVar2.f;
                        if (hkdVar == null) {
                            hkdVar = defpackage.hkd.a;
                        }
                        defpackage.hkd hkdVar2 = hkdVar;
                        aooh.f(hkdVar2, "number");
                        ajcqVarF = aosv.F((aoss) ifbVar.d, 0, new defpackage.kgx(ifbVar, i5, hkdVar2, (aoln) null, 3), 3);
                    }
                    ajcq ajcqVarI = ahvr.I(ajcqVarF, new defpackage.ljp(lzvVar, kiuVar2, i3, bArr), lzvVar.d);
                    lzxVar.d = kiuVar2;
                    lzxVar.f = lzlVar;
                    lzxVar.e = lzzVar;
                    lzxVar.c = 4;
                    objD2 = aosv.D(ajcqVarI, lzxVar);
                    if (objD2 == aoluVar) {
                        return aoluVar;
                    }
                    lzlVar2 = lzlVar;
                    objD3 = objD2;
                    kiuVar3 = kiuVar2;
                } else {
                    ajcqVarH = aiql.z(wgi.a);
                }
                ajcq ajcqVarO2 = ahvr.ak(new ajcq[]{ajcqVarZ, ajcqVarH}).o(new defpackage.lly(ajcqVarZ, ajcqVarH, i4), lzmVar.b);
                lzxVar.d = kiuVar;
                lzxVar.c = 3;
                objD = aosv.D(ajcqVarO2, lzxVar);
                if (objD != aoluVar) {
                    return aoluVar;
                }
                kiuVar2 = kiuVar;
                objD3 = objD;
                lzvVar = lzzVar.g;
                lzlVar = (defpackage.lzl) objD3;
                kgzVar = (kgz) lzvVar.h.g().orElse((java.lang.Object) null);
                if (kgzVar != null) {
                    aooh.f(kiuVar2, "coalescedRow");
                    ajcqVarF = aosv.F(kgzVar.c, 0, new defpackage.jpj(kgzVar, kiuVar2, (aoln) null, 18), 3);
                } else {
                    defpackage.ifb ifbVar2 = lzvVar.i;
                    int i6 = kiuVar2.i;
                    hkdVar = kiuVar2.f;
                    if (hkdVar == null) {
                        hkdVar = defpackage.hkd.a;
                    }
                    defpackage.hkd hkdVar3 = hkdVar;
                    aooh.f(hkdVar3, "number");
                    ajcqVarF = aosv.F((aoss) ifbVar2.d, 0, new defpackage.kgx(ifbVar2, i6, hkdVar3, (aoln) null, 3), 3);
                }
                ajcq ajcqVarI2 = ahvr.I(ajcqVarF, new defpackage.ljp(lzvVar, kiuVar2, i3, bArr), lzvVar.d);
                lzxVar.d = kiuVar2;
                lzxVar.f = lzlVar;
                lzxVar.e = lzzVar;
                lzxVar.c = 4;
                objD2 = aosv.D(ajcqVarI2, lzxVar);
                if (objD2 == aoluVar) {
                    return aoluVar;
                }
                lzlVar2 = lzlVar;
                objD3 = objD2;
                kiuVar3 = kiuVar2;
            } else if (i2 == 3) {
                kiuVar2 = lzxVar.d;
                aooc.af(objD3);
                lzvVar = lzzVar.g;
                lzlVar = (defpackage.lzl) objD3;
                kgzVar = (kgz) lzvVar.h.g().orElse((java.lang.Object) null);
                if (kgzVar != null) {
                    aooh.f(kiuVar2, "coalescedRow");
                    ajcqVarF = aosv.F(kgzVar.c, 0, new defpackage.jpj(kgzVar, kiuVar2, (aoln) null, 18), 3);
                } else {
                    defpackage.ifb ifbVar3 = lzvVar.i;
                    int i7 = kiuVar2.i;
                    hkdVar = kiuVar2.f;
                    if (hkdVar == null) {
                        hkdVar = defpackage.hkd.a;
                    }
                    defpackage.hkd hkdVar4 = hkdVar;
                    aooh.f(hkdVar4, "number");
                    ajcqVarF = aosv.F((aoss) ifbVar3.d, 0, new defpackage.kgx(ifbVar3, i7, hkdVar4, (aoln) null, 3), 3);
                }
                ajcq ajcqVarI3 = ahvr.I(ajcqVarF, new defpackage.ljp(lzvVar, kiuVar2, i3, bArr), lzvVar.d);
                lzxVar.d = kiuVar2;
                lzxVar.f = lzlVar;
                lzxVar.e = lzzVar;
                lzxVar.c = 4;
                objD2 = aosv.D(ajcqVarI3, lzxVar);
                if (objD2 == aoluVar) {
                    return aoluVar;
                }
                lzlVar2 = lzlVar;
                objD3 = objD2;
                kiuVar3 = kiuVar2;
            } else {
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lzzVar = lzxVar.e;
                lzlVar2 = lzxVar.f;
                kiuVar3 = lzxVar.d;
                aooc.af(objD3);
            }
            aooh.e(objD3, "await(...)");
            defpackage.jhw jhwVarE = defpackage.hgt.E(defpackage.kiq.a.m());
            jhwVarE.r();
            alat alatVar = ((defpackage.kiq) objD3).b;
            aooh.e(alatVar, "getCallDetailsList(...)");
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : alatVar) {
                if (!lzzVar.j.f.contains(java.lang.Long.valueOf(((defpackage.kip) obj).c))) {
                    arrayList.add(obj);
                }
            }
            jhwVarE.q(arrayList);
            defpackage.kiq kiqVarP = jhwVarE.p();
            aooh.c(lzlVar2);
            return new defpackage.lzw(kiuVar3, lzlVar2, kiqVarP);
        }
        aooc.af(objD3);
        defpackage.lzt lztVar = lzzVar.j;
        defpackage.loe loeVar = new defpackage.loe(lzzVar, (aoln) null, 5);
        lzxVar.c = 1;
        ajcq ajcqVarH2 = lztVar.g.h(new defpackage.ibi(lztVar, loeVar, 17), lztVar.b);
        aooh.e(ajcqVarH2, "submitAsync(...)");
        if (aosv.D(ajcqVarH2, lzxVar) == aoluVar) {
            return aoluVar;
        }
        kiu kiuVar4 = lzzVar.j.e;
        lzxVar.c = 2;
        objD3 = lzzVar.d(kiuVar4, lzxVar);
        if (objD3 == aoluVar) {
            return aoluVar;
        }
        lzmVar = lzzVar.f;
        zjm zjmVar2 = lzmVar.d;
        kiuVar = (kiu) objD3;
        optionalG = lzmVar.c.g();
        optionalG2 = zjmVar2.g();
        if (optionalG.isPresent()) {
            ajcqVarZ = ahvr.H(((tcv) ((aogc) optionalG.orElseThrow()).a).a(), new lix(6), lzmVar.b);
        } else {
            ajcqVarZ = aiql.z(java.lang.Boolean.FALSE);
        }
        kiwVar = kiuVar.r;
        if (kiwVar == null) {
            kiwVar = defpackage.kiw.a;
        }
        j = kiwVar.t;
        if (!optionalG2.isPresent()) {
            if (j <= 0) {
                ajcqVarH = ((zzx) optionalG2.orElseThrow()).r();
            } else {
                java.lang.String strValueOf2 = java.lang.String.valueOf(j);
                ajcqVarH = ahvr.H(((zzx) optionalG2.orElseThrow()).q(new aile(strValueOf2)), new defpackage.lgd(strValueOf2, 20), lzmVar.b);
            }
            ajcq ajcqVarO3 = ahvr.ak(new ajcq[]{ajcqVarZ, ajcqVarH}).o(new defpackage.lly(ajcqVarZ, ajcqVarH, i4), lzmVar.b);
            lzxVar.d = kiuVar;
            lzxVar.c = 3;
            objD = aosv.D(ajcqVarO3, lzxVar);
            if (objD != aoluVar) {
                return aoluVar;
            }
            kiuVar2 = kiuVar;
            objD3 = objD;
            lzvVar = lzzVar.g;
            lzlVar = (defpackage.lzl) objD3;
            kgzVar = (kgz) lzvVar.h.g().orElse((java.lang.Object) null);
            if (kgzVar != null) {
                aooh.f(kiuVar2, "coalescedRow");
                ajcqVarF = aosv.F(kgzVar.c, 0, new defpackage.jpj(kgzVar, kiuVar2, (aoln) null, 18), 3);
            } else {
                defpackage.ifb ifbVar4 = lzvVar.i;
                int i8 = kiuVar2.i;
                hkdVar = kiuVar2.f;
                if (hkdVar == null) {
                    hkdVar = defpackage.hkd.a;
                }
                defpackage.hkd hkdVar5 = hkdVar;
                aooh.f(hkdVar5, "number");
                ajcqVarF = aosv.F((aoss) ifbVar4.d, 0, new defpackage.kgx(ifbVar4, i8, hkdVar5, (aoln) null, 3), 3);
            }
            ajcq ajcqVarI4 = ahvr.I(ajcqVarF, new defpackage.ljp(lzvVar, kiuVar2, i3, bArr), lzvVar.d);
            lzxVar.d = kiuVar2;
            lzxVar.f = lzlVar;
            lzxVar.e = lzzVar;
            lzxVar.c = 4;
            objD2 = aosv.D(ajcqVarI4, lzxVar);
            if (objD2 == aoluVar) {
                return aoluVar;
            }
            lzlVar2 = lzlVar;
            objD3 = objD2;
            kiuVar3 = kiuVar2;
            aooh.e(objD3, "await(...)");
            defpackage.jhw jhwVarE2 = defpackage.hgt.E(defpackage.kiq.a.m());
            jhwVarE2.r();
            alat alatVar2 = ((defpackage.kiq) objD3).b;
            aooh.e(alatVar2, "getCallDetailsList(...)");
            arrayList = new java.util.ArrayList();
            while (r1.hasNext()) {
                if (!lzzVar.j.f.contains(java.lang.Long.valueOf(((defpackage.kip) obj).c))) {
                    arrayList.add(obj);
                }
            }
            jhwVarE2.q(arrayList);
            defpackage.kiq kiqVarP2 = jhwVarE2.p();
            aooh.c(lzlVar2);
            return new defpackage.lzw(kiuVar3, lzlVar2, kiqVarP2);
        }
        ajcqVarH = aiql.z(wgi.a);
        ajcq ajcqVarO4 = ahvr.ak(new ajcq[]{ajcqVarZ, ajcqVarH}).o(new defpackage.lly(ajcqVarZ, ajcqVarH, i4), lzmVar.b);
        lzxVar.d = kiuVar;
        lzxVar.c = 3;
        objD = aosv.D(ajcqVarO4, lzxVar);
        if (objD != aoluVar) {
            return aoluVar;
        }
        kiuVar2 = kiuVar;
        objD3 = objD;
        lzvVar = lzzVar.g;
        lzlVar = (defpackage.lzl) objD3;
        kgzVar = (kgz) lzvVar.h.g().orElse((java.lang.Object) null);
        if (kgzVar != null) {
            aooh.f(kiuVar2, "coalescedRow");
            ajcqVarF = aosv.F(kgzVar.c, 0, new defpackage.jpj(kgzVar, kiuVar2, (aoln) null, 18), 3);
        } else {
            defpackage.ifb ifbVar5 = lzvVar.i;
            int i9 = kiuVar2.i;
            hkdVar = kiuVar2.f;
            if (hkdVar == null) {
                hkdVar = defpackage.hkd.a;
            }
            defpackage.hkd hkdVar6 = hkdVar;
            aooh.f(hkdVar6, "number");
            ajcqVarF = aosv.F((aoss) ifbVar5.d, 0, new defpackage.kgx(ifbVar5, i9, hkdVar6, (aoln) null, 3), 3);
        }
        ajcq ajcqVarI5 = ahvr.I(ajcqVarF, new defpackage.ljp(lzvVar, kiuVar2, i3, bArr), lzvVar.d);
        lzxVar.d = kiuVar2;
        lzxVar.f = lzlVar;
        lzxVar.e = lzzVar;
        lzxVar.c = 4;
        objD2 = aosv.D(ajcqVarI5, lzxVar);
        if (objD2 == aoluVar) {
            return aoluVar;
        }
        lzlVar2 = lzlVar;
        objD3 = objD2;
        kiuVar3 = kiuVar2;
        aooh.e(objD3, "await(...)");
        defpackage.jhw jhwVarE3 = defpackage.hgt.E(defpackage.kiq.a.m());
        jhwVarE3.r();
        alat alatVar3 = ((defpackage.kiq) objD3).b;
        aooh.e(alatVar3, "getCallDetailsList(...)");
        arrayList = new java.util.ArrayList();
        while (r1.hasNext()) {
            if (!lzzVar.j.f.contains(java.lang.Long.valueOf(((defpackage.kip) obj).c))) {
                arrayList.add(obj);
            }
        }
        jhwVarE3.q(arrayList);
        defpackage.kiq kiqVarP3 = jhwVarE3.p();
        aooh.c(lzlVar2);
        return new defpackage.lzw(kiuVar3, lzlVar2, kiqVarP3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(kiu kiuVar, aoln aolnVar) {
        defpackage.lzy lzyVar;
        aosy aosyVarAm;
        spe speVar;
        if (aolnVar instanceof defpackage.lzy) {
            lzyVar = (defpackage.lzy) aolnVar;
            int i = lzyVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lzyVar.d = i - Integer.MIN_VALUE;
            } else {
                lzyVar = new defpackage.lzy(this, aolnVar);
            }
        } else {
            lzyVar = new defpackage.lzy(this, aolnVar);
        }
        java.lang.Object objA = lzyVar.b;
        aolu aoluVar = aolu.a;
        int i2 = lzyVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                aosyVarAm = (aosy) lzyVar.a;
                kiuVar = lzyVar.e;
                aooc.af(objA);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                speVar = (spe) lzyVar.a;
                kiuVar = lzyVar.e;
                aooc.af(objA);
            }
            ryu ryuVarH = sns.h(((spn) objA).p());
            aooh.c(speVar);
            aooh.f(speVar, "value");
            akzx akzxVar = (akzx) ryuVarH.a;
            akzxVar.u();
            spn spnVar = akzxVar.b;
            j$.util.Objects.requireNonNull(speVar);
            spnVar.c = speVar;
            spnVar.b |= 1;
            spn spnVarC = ryuVarH.c();
            defpackage.ni niVarJ = defpackage.hgt.J(kiuVar.p());
            alad aladVarP = gus.aK(spnVarC).p();
            aooh.e(aladVarP, "build(...)");
            niVarJ.F((defpackage.kiw) aladVarP);
            return niVarJ.E();
        }
        aooc.af(objA);
        aoss aossVar = this.h;
        sqo sqoVar = this.i;
        defpackage.hkd hkdVar = kiuVar.f;
        if (hkdVar == null) {
            hkdVar = defpackage.hkd.a;
        }
        ajcq ajcqVarC = sqoVar.c(hkdVar);
        aosy aosyVarAm2 = aoov.am(aossVar, 0, new defpackage.lve(ajcqVarC, (aoln) null, 4), 3);
        aosyVarAm2.p(new lwl(ajcqVarC, 2));
        aosyVarAm = aoov.am(aossVar, 0, new defpackage.kqd(this, kiuVar, (aoln) null, 15), 3);
        lzyVar.e = kiuVar;
        lzyVar.a = aosyVarAm;
        lzyVar.d = 1;
        objA = aosyVarAm2.a(lzyVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        spe speVar2 = (spe) objA;
        lzyVar.e = kiuVar;
        lzyVar.a = speVar2;
        lzyVar.d = 2;
        java.lang.Object objA2 = aosyVarAm.a(lzyVar);
        if (objA2 == aoluVar) {
            return aoluVar;
        }
        objA = objA2;
        speVar = speVar2;
        ryu ryuVarH2 = sns.h(((spn) objA).p());
        aooh.c(speVar);
        aooh.f(speVar, "value");
        akzx akzxVar2 = (akzx) ryuVarH2.a;
        akzxVar2.u();
        spn spnVar2 = akzxVar2.b;
        j$.util.Objects.requireNonNull(speVar);
        spnVar2.c = speVar;
        spnVar2.b |= 1;
        spn spnVarC2 = ryuVarH2.c();
        defpackage.ni niVarJ2 = defpackage.hgt.J(kiuVar.p());
        alad aladVarP2 = gus.aK(spnVarC2).p();
        aooh.e(aladVarP2, "build(...)");
        niVarJ2.F((defpackage.kiw) aladVarP2);
        return niVarJ2.E();
    }
}
