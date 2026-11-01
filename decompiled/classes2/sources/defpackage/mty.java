package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class mty extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.mua d;
    final /* synthetic */ utu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mty(defpackage.mua muaVar, utu utuVar, aoln aolnVar) {
        super(2, aolnVar);
        this.d = muaVar;
        this.e = utuVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:71:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x02df  */
    /* JADX WARN: Code duplicated, block: B:76:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object objH;
        java.lang.String str;
        aift aiftVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object objM;
        java.lang.Object obj4;
        java.lang.Object objB;
        java.lang.Object obj5;
        java.lang.Object obj6;
        defpackage.kor korVar;
        aolu aoluVar = aolu.a;
        int i = this.c;
        int i2 = 2;
        java.lang.String str2 = "build(...)";
        int i3 = 1;
        if (i != 0) {
            if (i == 1) {
                aooc.af(obj);
                objH = obj;
            } else {
                if (i == 2) {
                    java.lang.Object obj7 = this.b;
                    java.lang.Object obj8 = this.a;
                    aooc.af(obj);
                    obj3 = obj7;
                    obj4 = obj8;
                    obj2 = null;
                    objM = obj;
                    obj6 = aiftVar;
                    obj4 = aiftVar;
                    obj6 = obj4;
                    if (((java.lang.Boolean) objM).booleanValue()) {
                        long j = this.e.c;
                        this.a = obj4;
                        this.b = obj2;
                        this.c = 3;
                        objB = ((defpackage.irl) obj3).b(j, this);
                        if (objB != aoluVar) {
                            return aoluVar;
                        }
                        obj5 = obj4;
                    }
                    obj6 = aiftVar;
                    aify aifyVarH = ((aift) obj6).h();
                    aooh.e(aifyVarH, str2);
                    return aifyVarH;
                }
                java.lang.Object obj9 = this.a;
                aooc.af(obj);
                objB = obj;
                obj5 = obj9;
            }
            korVar = (defpackage.kor) objB;
            if (korVar != null) {
                utu utuVar = this.e;
                vqf vqfVarBw = wsc.bw(uva.a.m());
                alcf alcfVarE = aldi.e(utuVar.c);
                aooh.e(alcfVarE, "fromMillis(...)");
                vqfVarBw.t(alcfVarE);
                akzx akzxVarM = uuc.a.m();
                aooh.f(akzxVarM, "builder");
                akzxVarM.u();
                uuc uucVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(korVar);
                uucVar.c = korVar;
                uucVar.b |= 1;
                uuc uucVarP = akzxVarM.p();
                aooh.e(uucVarP, str2);
                uuc uucVar2 = uucVarP;
                aooh.f(uucVar2, "value");
                akzx akzxVar = (akzx) vqfVarBw.a;
                akzxVar.u();
                uva uvaVar = akzxVar.b;
                j$.util.Objects.requireNonNull(uucVar2);
                uvaVar.d = uucVar2;
                uvaVar.c = 21;
                ((aift) obj5).i(vqfVarBw.s());
            }
            obj6 = obj5;
            obj6 = aiftVar;
            aify aifyVarH2 = ((aift) obj6).h();
            aooh.e(aifyVarH2, str2);
            return aifyVarH2;
        }
        aooc.af(obj);
        defpackage.mua muaVar = this.d;
        long j2 = this.e.c;
        this.c = 1;
        objH = muaVar.a.h(j2, this);
        if (objH == aoluVar) {
            return aoluVar;
        }
        defpackage.nsp nspVar = (defpackage.nsp) objH;
        if (nspVar == null) {
            str = null;
        } else {
            defpackage.nsq nsqVar = nspVar.e;
            if (nsqVar == null) {
                nsqVar = defpackage.nsq.a;
            }
            if (nsqVar == null) {
                str = null;
            } else {
                defpackage.nss nssVar = nsqVar.d;
                if (nssVar == null) {
                    nssVar = defpackage.nss.a;
                }
                if (nssVar != null) {
                    str = nssVar.c;
                } else {
                    str = null;
                }
            }
        }
        java.lang.String str3 = "getTranscriptData$<anonymous>";
        java.lang.String str4 = "com/android/dialer/dobby/impl/feedback/DobbyFeedbackIntegration";
        if (str == null || str.length() == 0) {
            this.d.c.b().l("com/android/dialer/dobby/impl/feedback/DobbyFeedbackIntegration", "getTranscriptData$<anonymous>", 83, "DobbyFeedbackIntegration.kt").v("transcript path is not present");
            aify aifyVar = aike.a;
            aooh.e(aifyVar, "of(...)");
            return aifyVar;
        }
        try {
            alat alatVar = ((defpackage.nst) alad.x(defpackage.nst.a, new java.io.FileInputStream(new java.io.File(str)))).b;
            aooh.e(alatVar, "getEntriesList(...)");
            aiftVar = new aift(4);
            java.util.Iterator it = alatVar.iterator();
            while (it.hasNext()) {
                defpackage.nsj nsjVar = (defpackage.nsj) it.next();
                int iAr = mni.ar(nsjVar.c);
                if (iAr == 0) {
                    throw null;
                }
                int i4 = iAr - 1;
                if (i4 != 0) {
                    if (i4 == i3) {
                        vqf vqfVarBw2 = wsc.bw(uva.a.m());
                        java.lang.String str5 = str3;
                        java.lang.String str6 = str4;
                        alcf alcfVarE2 = aldi.e(nsjVar.e);
                        aooh.e(alcfVarE2, "fromMillis(...)");
                        vqfVarBw2.t(alcfVarE2);
                        akzx akzxVarM2 = uui.a.m();
                        aooh.f(akzxVarM2, "builder");
                        java.util.Iterator it2 = it;
                        java.lang.String str7 = (nsjVar.c == 4 ? (defpackage.nsh) nsjVar.d : defpackage.nsh.a).c;
                        aooh.e(str7, "getText(...)");
                        aooh.f(str7, "value");
                        akzxVarM2.u();
                        uui uuiVar = akzxVarM2.b;
                        j$.util.Objects.requireNonNull(str7);
                        uuiVar.b |= 1;
                        uuiVar.c = str7;
                        uui uuiVarP = akzxVarM2.p();
                        aooh.e(uuiVarP, str2);
                        uui uuiVar2 = uuiVarP;
                        aooh.f(uuiVar2, "value");
                        akzx akzxVar2 = (akzx) vqfVarBw2.a;
                        akzxVar2.u();
                        uva uvaVar2 = akzxVar2.b;
                        j$.util.Objects.requireNonNull(uuiVar2);
                        uvaVar2.d = uuiVar2;
                        uvaVar2.c = 13;
                        aiftVar.i(vqfVarBw2.s());
                        str3 = str5;
                        str4 = str6;
                        it = it2;
                    } else if (i4 != i2) {
                        this.d.c.d().i(zct.b).l(str4, str3, 126, "DobbyFeedbackIntegration.kt").v("invalid ConversationItem type");
                    } else {
                        vqf vqfVarBw3 = wsc.bw(uva.a.m());
                        java.lang.String str8 = str2;
                        alcf alcfVarE3 = aldi.e(nsjVar.e);
                        aooh.e(alcfVarE3, "fromMillis(...)");
                        vqfVarBw3.t(alcfVarE3);
                        akzx akzxVarM3 = uuk.a.m();
                        aooh.f(akzxVarM3, "builder");
                        java.lang.String str9 = (nsjVar.c == 5 ? (defpackage.nsu) nsjVar.d : defpackage.nsu.a).c;
                        aooh.e(str9, "getText(...)");
                        aooh.f(str9, "value");
                        akzxVarM3.u();
                        uuk uukVar = akzxVarM3.b;
                        j$.util.Objects.requireNonNull(str9);
                        uukVar.b |= 1;
                        uukVar.c = str9;
                        uuk uukVarP = akzxVarM3.p();
                        str2 = str8;
                        aooh.e(uukVarP, str2);
                        uuk uukVar2 = uukVarP;
                        aooh.f(uukVar2, "value");
                        akzx akzxVar3 = (akzx) vqfVarBw3.a;
                        akzxVar3.u();
                        uva uvaVar3 = akzxVar3.b;
                        j$.util.Objects.requireNonNull(uukVar2);
                        uvaVar3.d = uukVar2;
                        uvaVar3.c = 14;
                        aiftVar.i(vqfVarBw3.s());
                    }
                    i2 = i2;
                } else {
                    java.util.Iterator it3 = it;
                    int i5 = i2;
                    i3 = i3;
                    java.lang.String str10 = str3;
                    java.lang.String str11 = str4;
                    utu utuVar2 = this.e;
                    vqf vqfVarBw4 = wsc.bw(uva.a.m());
                    alcf alcfVarE4 = aldi.e(nsjVar.e);
                    aooh.e(alcfVarE4, "fromMillis(...)");
                    vqfVarBw4.t(alcfVarE4);
                    akzx akzxVarM4 = uuj.a.m();
                    aooh.f(akzxVarM4, "builder");
                    java.lang.String str12 = (nsjVar.c == 3 ? (defpackage.nsi) nsjVar.d : defpackage.nsi.a).c;
                    aooh.e(str12, "getText(...)");
                    aooh.f(str12, "value");
                    akzxVarM4.u();
                    uuj uujVar = akzxVarM4.b;
                    j$.util.Objects.requireNonNull(str12);
                    uujVar.b |= 1;
                    uujVar.c = str12;
                    abwd abwdVar = utuVar2.d;
                    if (abwdVar == null) {
                        abwdVar = abwd.a;
                    }
                    aooh.e(abwdVar, "getPhotoInfo(...)");
                    aooh.f(abwdVar, "value");
                    akzxVarM4.u();
                    uuj uujVar2 = akzxVarM4.b;
                    j$.util.Objects.requireNonNull(abwdVar);
                    uujVar2.d = abwdVar;
                    uujVar2.b |= 2;
                    boolean z = (nsjVar.c == 3 ? (defpackage.nsi) nsjVar.d : defpackage.nsi.a).e;
                    akzxVarM4.u();
                    uuj uujVar3 = akzxVarM4.b;
                    uujVar3.b |= 4;
                    uujVar3.e = z;
                    uuj uujVarP = akzxVarM4.p();
                    aooh.e(uujVarP, str2);
                    uuj uujVar4 = uujVarP;
                    aooh.f(uujVar4, "value");
                    akzx akzxVar4 = (akzx) vqfVarBw4.a;
                    akzxVar4.u();
                    uva uvaVar4 = akzxVar4.b;
                    j$.util.Objects.requireNonNull(uujVar4);
                    uvaVar4.d = uujVar4;
                    uvaVar4.c = 12;
                    aiftVar.i(vqfVarBw4.s());
                    it = it3;
                    i2 = i5;
                    str3 = str10;
                    str4 = str11;
                }
                i3 = i3;
            }
            int i6 = i2;
            obj2 = null;
            defpackage.mua muaVar2 = this.d;
            j$.util.Optional optionalG = muaVar2.d.g();
            aooh.e(optionalG, "getFeature(...)");
            obj3 = (defpackage.irl) aooh.q(optionalG);
            obj6 = aiftVar;
            if (obj3 != null && ((java.lang.Boolean) muaVar2.b.a()).booleanValue()) {
                long j3 = this.e.c;
                this.a = aiftVar;
                this.b = obj3;
                this.c = i6;
                objM = muaVar2.m(j3, this);
                if (objM == aoluVar) {
                    obj6 = aiftVar;
                    obj4 = aiftVar;
                    return aoluVar;
                }
                obj6 = aiftVar;
                obj4 = aiftVar;
                obj6 = obj4;
                if (((java.lang.Boolean) objM).booleanValue()) {
                    long j4 = this.e.c;
                    this.a = obj4;
                    this.b = obj2;
                    this.c = 3;
                    objB = ((defpackage.irl) obj3).b(j4, this);
                    if (objB != aoluVar) {
                        return aoluVar;
                    }
                    obj5 = obj4;
                    korVar = (defpackage.kor) objB;
                    if (korVar != null) {
                        utu utuVar3 = this.e;
                        vqf vqfVarBw5 = wsc.bw(uva.a.m());
                        alcf alcfVarE5 = aldi.e(utuVar3.c);
                        aooh.e(alcfVarE5, "fromMillis(...)");
                        vqfVarBw5.t(alcfVarE5);
                        akzx akzxVarM5 = uuc.a.m();
                        aooh.f(akzxVarM5, "builder");
                        akzxVarM5.u();
                        uuc uucVar3 = akzxVarM5.b;
                        j$.util.Objects.requireNonNull(korVar);
                        uucVar3.c = korVar;
                        uucVar3.b |= 1;
                        uuc uucVarP2 = akzxVarM5.p();
                        aooh.e(uucVarP2, str2);
                        uuc uucVar4 = uucVarP2;
                        aooh.f(uucVar4, "value");
                        akzx akzxVar5 = (akzx) vqfVarBw5.a;
                        akzxVar5.u();
                        uva uvaVar5 = akzxVar5.b;
                        j$.util.Objects.requireNonNull(uucVar4);
                        uvaVar5.d = uucVar4;
                        uvaVar5.c = 21;
                        ((aift) obj5).i(vqfVarBw5.s());
                    }
                    obj6 = obj5;
                }
            }
            obj6 = aiftVar;
            aify aifyVarH3 = ((aift) obj6).h();
            aooh.e(aifyVarH3, str2);
            return aifyVarH3;
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalStateException("Failed to read file", e);
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.mty(this.d, this.e, aolnVar);
    }
}
