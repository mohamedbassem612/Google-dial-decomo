package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class tym extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.typ b;
    final /* synthetic */ defpackage.ajxi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tym(defpackage.typ typVar, defpackage.ajxi ajxiVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = typVar;
        this.c = ajxiVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.afbz afbzVarK;
        defpackage.afcb afcbVarJ;
        defpackage.afbu afbuVar;
        int iAS;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            defpackage.typ typVar = this.b;
            typVar.A = this.c;
            aimz aimzVar = defpackage.typ.a;
            aimzVar.b().l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession", "createRecognitionRequestStartAction", 268, "SodaOnDeviceGrpcSession.kt").v("Creating Recognition Request Start Action");
            akzx akzxVarM = defpackage.afcw.a.m();
            aooh.f(akzxVarM, "builder");
            xtq xtqVarL = defpackage.afcd.l(defpackage.afby.a.m());
            java.lang.String packageName = typVar.c.getPackageName();
            aooh.e(packageName, "getPackageName(...)");
            xtqVarL.N(packageName);
            defpackage.afby afbyVarM = xtqVarL.M();
            aooh.f(afbyVarM, "value");
            akzxVarM.u();
            defpackage.afcw afcwVar = (defpackage.afcw) akzxVarM.b;
            j$.util.Objects.requireNonNull(afbyVarM);
            afcwVar.c = afbyVarM;
            afcwVar.b |= 1;
            int i2 = true != typVar.n ? 3 : 2;
            akzxVarM.u();
            defpackage.afcw afcwVar2 = (defpackage.afcw) akzxVarM.b;
            afcwVar2.f = i2 - 1;
            afcwVar2.b |= 8;
            akzxVarM.u();
            defpackage.afcw afcwVar3 = (defpackage.afcw) akzxVarM.b;
            afcwVar3.d = 4;
            afcwVar3.b |= 2;
            defpackage.twd twdVar = typVar.l;
            java.lang.String strG = typVar.g(twdVar);
            akff akffVar = akff.p;
            aooh.e(akffVar, "US");
            if (!aooh.n(strG, "mul")) {
                strG = ((akff) j$.util.Map.-EL.getOrDefault(defpackage.typ.b, typVar.g(twdVar), akffVar)).q;
                aooh.e(strG, "toString(...)");
            }
            aooh.f(strG, "value");
            akzxVarM.u();
            defpackage.afcw afcwVar4 = (defpackage.afcw) akzxVarM.b;
            j$.util.Objects.requireNonNull(strG);
            afcwVar4.b |= 4;
            afcwVar4.e = strG;
            if ((twdVar.b & 256) != 0 && (iAS = a.aS(twdVar.k)) != 0 && iAS == 5) {
                java.lang.String str = ((defpackage.afcw) akzxVarM.b).e;
                aooh.e(str, "getPrimaryLocale(...)");
                aooh.f(str, "value");
                akzxVarM.u();
                defpackage.afcw afcwVar5 = (defpackage.afcw) akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                afcwVar5.b |= 64;
                afcwVar5.h = str;
                aimw aimwVarL = aimzVar.b().l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession", "createRecognitionRequestStartAction$<anonymous>", 286, "SodaOnDeviceGrpcSession.kt");
                java.lang.String str2 = ((defpackage.afcw) akzxVarM.b).h;
                aooh.e(str2, "getTargetLocale(...)");
                aimwVarL.y("Using target_locale: %s", str2);
            }
            akzz akzzVarM = defpackage.afca.a.m();
            aooh.f(akzzVarM, "builder");
            akzzVarM.u();
            defpackage.afca afcaVar = akzzVarM.b;
            afcaVar.b |= 1;
            afcaVar.c = 1;
            akzzVarM.u();
            defpackage.afca afcaVar2 = akzzVarM.b;
            afcaVar2.b |= 2;
            afcaVar2.d = true;
            if ((twdVar.b & 64) != 0) {
                defpackage.twb twbVar = twdVar.i;
                if (twbVar == null) {
                    twbVar = defpackage.twb.a;
                }
                aooh.e(twbVar, "getSodaDiarizationConfig(...)");
                aooh.f(twbVar, "<this>");
                int iAN = a.aN(twbVar.d);
                if (iAN == 0) {
                    iAN = 1;
                }
                if (iAN == 2) {
                    aimzVar.b().l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession$Companion", "toDiarizationConfig", 862, "SodaOnDeviceGrpcSession.kt").v("Disabling diarization");
                    xtq xtqVarK = defpackage.afcd.k(defpackage.afbz.a.m());
                    xtqVarK.L(false);
                    afbzVarK = xtqVarK.K();
                } else {
                    aimzVar.b().l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession$Companion", "toDiarizationConfig", 867, "SodaOnDeviceGrpcSession.kt").z("Requesting Diarization with minSpeakerCount: %s and maxSpeakerCount: %s", twbVar.b, twbVar.c);
                    xtq xtqVarK2 = defpackage.afcd.k(defpackage.afbz.a.m());
                    xtqVarK2.L(true);
                    int iAN2 = a.aN(twbVar.d);
                    if (iAN2 == 0) {
                        iAN2 = 1;
                    }
                    int i3 = iAN2 - 1;
                    int i4 = (i3 == 0 || i3 == 1 || i3 == 2) ? 1 : 2;
                    akzx akzxVar = (akzx) xtqVarK2.a;
                    akzxVar.u();
                    defpackage.afbz afbzVar = (defpackage.afbz) akzxVar.b;
                    afbzVar.d = i4 - 1;
                    afbzVar.b |= 2;
                    int i5 = twbVar.b;
                    akzxVar.u();
                    defpackage.afbz afbzVar2 = (defpackage.afbz) akzxVar.b;
                    afbzVar2.b |= 4;
                    afbzVar2.e = i5;
                    int i6 = twbVar.c;
                    akzxVar.u();
                    defpackage.afbz afbzVar3 = (defpackage.afbz) akzxVar.b;
                    afbzVar3.b |= 8;
                    afbzVar3.f = i6;
                    afbzVarK = xtqVarK2.K();
                }
            } else {
                afbzVarK = defpackage.afcd.k(defpackage.afbz.a.m()).K();
            }
            aooh.f(afbzVarK, "value");
            akzzVarM.u();
            defpackage.afca afcaVar3 = akzzVarM.b;
            j$.util.Objects.requireNonNull(afbzVarK);
            afcaVar3.h = afbzVarK;
            afcaVar3.b |= 1024;
            akzx akzxVarM2 = defpackage.afci.a.m();
            aooh.f(akzxVarM2, "builder");
            boolean z = twdVar.h;
            akzxVarM2.u();
            defpackage.afci afciVar = (defpackage.afci) akzxVarM2.b;
            afciVar.b |= 1;
            afciVar.c = z;
            alad aladVarP = akzxVarM2.p();
            aooh.e(aladVarP, "build(...)");
            defpackage.afci afciVar2 = (defpackage.afci) aladVarP;
            aooh.f(afciVar2, "value");
            akzzVarM.u();
            defpackage.afca afcaVar4 = akzzVarM.b;
            j$.util.Objects.requireNonNull(afciVar2);
            afcaVar4.g = afciVar2;
            afcaVar4.b |= 64;
            if (twdVar.l.size() > 0) {
                akzx akzxVarM3 = defpackage.afbx.a.m();
                aooh.f(akzxVarM3, "builder");
                java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.afbx) akzxVarM3.b).b);
                aooh.e(listUnmodifiableList, "getBiasingStringsList(...)");
                new alct(listUnmodifiableList);
                alat alatVar = twdVar.l;
                aooh.e(alatVar, "getBiasingStringsList(...)");
                aooh.f(alatVar, "values");
                akzxVarM3.u();
                defpackage.afbx afbxVar = (defpackage.afbx) akzxVarM3.b;
                alat alatVar2 = afbxVar.b;
                if (!alatVar2.c()) {
                    afbxVar.b = alad.J(alatVar2);
                }
                akyl.i(alatVar, afbxVar.b);
                alad aladVarP2 = akzxVarM3.p();
                aooh.e(aladVarP2, "build(...)");
                defpackage.afbx afbxVar2 = (defpackage.afbx) aladVarP2;
                aooh.f(afbxVar2, "value");
                akzzVarM.u();
                defpackage.afca afcaVar5 = akzzVarM.b;
                j$.util.Objects.requireNonNull(afbxVar2);
                afcaVar5.l = afbxVar2;
                afcaVar5.b |= 131072;
            }
            akzx akzxVarM4 = defpackage.afbw.a.m();
            aooh.f(akzxVarM4, "builder");
            int i7 = twdVar.d;
            akzxVarM4.u();
            defpackage.afbw afbwVar = (defpackage.afbw) akzxVarM4.b;
            afbwVar.b |= 1;
            afbwVar.c = i7;
            boolean z2 = !twdVar.f;
            akzxVarM4.u();
            defpackage.afbw afbwVar2 = (defpackage.afbw) akzxVarM4.b;
            afbwVar2.b |= 8;
            afbwVar2.d = z2;
            boolean z3 = twdVar.m;
            akzxVarM4.u();
            defpackage.afbw afbwVar3 = (defpackage.afbw) akzxVarM4.b;
            afbwVar3.b |= 16;
            afbwVar3.e = z3;
            alad aladVarP3 = akzxVarM4.p();
            aooh.e(aladVarP3, "build(...)");
            defpackage.afbw afbwVar4 = (defpackage.afbw) aladVarP3;
            aooh.f(afbwVar4, "value");
            akzzVarM.u();
            defpackage.afca afcaVar6 = akzzVarM.b;
            j$.util.Objects.requireNonNull(afbwVar4);
            afcaVar6.i = afbwVar4;
            afcaVar6.b |= 2048;
            akzx akzxVarM5 = defpackage.afct.a.m();
            aooh.f(akzxVarM5, "builder");
            akzxVarM5.u();
            defpackage.afct afctVar = (defpackage.afct) akzxVarM5.b;
            afctVar.b = 1;
            afctVar.c = java.lang.Boolean.TRUE;
            alad aladVarP4 = akzxVarM5.p();
            aooh.e(aladVarP4, "build(...)");
            defpackage.afct afctVar2 = (defpackage.afct) aladVarP4;
            aooh.f(afctVar2, "value");
            akzzVarM.u();
            defpackage.afca afcaVar7 = akzzVarM.b;
            j$.util.Objects.requireNonNull(afctVar2);
            afcaVar7.e = afctVar2;
            afcaVar7.b |= 16;
            if (twdVar.e) {
                akzx akzxVarM6 = defpackage.afdh.a.m();
                aooh.f(akzxVarM6, "builder");
                akzxVarM6.u();
                defpackage.afdh afdhVar = (defpackage.afdh) akzxVarM6.b;
                afdhVar.b |= 1;
                afdhVar.c = true;
                alad aladVarP5 = akzxVarM6.p();
                aooh.e(aladVarP5, "build(...)");
                defpackage.afdh afdhVar2 = (defpackage.afdh) aladVarP5;
                aooh.f(afdhVar2, "value");
                akzzVarM.u();
                defpackage.afca afcaVar8 = akzzVarM.b;
                j$.util.Objects.requireNonNull(afdhVar2);
                afcaVar8.m = afdhVar2;
                afcaVar8.b |= 262144;
            }
            boolean z4 = twdVar.e;
            akzzVarM.u();
            defpackage.afca afcaVar9 = akzzVarM.b;
            afcaVar9.b |= 32768;
            afcaVar9.j = z4;
            int iAQ = a.aQ(twdVar.j);
            if (iAQ == 0) {
                iAQ = 1;
            }
            int i8 = iAQ - 1;
            if (i8 == 0) {
                defpackage.zoe zoeVarN = defpackage.afcd.n(defpackage.afcb.a.m());
                zoeVarN.K(false);
                afcbVarJ = zoeVarN.J();
            } else if (i8 != 1) {
                defpackage.zoe zoeVarN2 = defpackage.afcd.n(defpackage.afcb.a.m());
                zoeVarN2.K(true);
                zoeVarN2.L(2);
                afcbVarJ = zoeVarN2.J();
            } else {
                defpackage.zoe zoeVarN3 = defpackage.afcd.n(defpackage.afcb.a.m());
                zoeVarN3.K(true);
                zoeVarN3.L(1);
                afcbVarJ = zoeVarN3.J();
            }
            aooh.f(afcbVarJ, "value");
            akzzVarM.u();
            defpackage.afca afcaVar10 = akzzVarM.b;
            j$.util.Objects.requireNonNull(afcbVarJ);
            afcaVar10.f = afcbVarJ;
            afcaVar10.b |= 32;
            if ((twdVar.b & 256) != 0) {
                akzx akzxVarM7 = defpackage.afbv.a.m();
                aooh.f(akzxVarM7, "builder");
                int iAS2 = a.aS(twdVar.k);
                if (iAS2 == 0) {
                    iAS2 = 1;
                }
                int i9 = iAS2 - 1;
                if (i9 == 0 || i9 == 1) {
                    afbuVar = defpackage.afbu.DEFAULT;
                } else {
                    afbuVar = i9 != 2 ? defpackage.afbu.FALLBACK_ALWAYS : defpackage.afbu.FALLBACK_ON_LOW_CONFIDENCE;
                }
                akzxVarM7.u();
                defpackage.afbv afbvVar = (defpackage.afbv) akzxVarM7.b;
                afbvVar.c = afbuVar.e;
                afbvVar.b |= 1;
                aimw aimwVarL2 = aimzVar.b().l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession", "createRecognitionRequestStartAction$<anonymous>$<anonymous>$<anonymous>", 317, "SodaOnDeviceGrpcSession.kt");
                defpackage.afbu afbuVarB = defpackage.afbu.b(((defpackage.afbv) akzxVarM7.b).c);
                if (afbuVarB == null) {
                    afbuVarB = defpackage.afbu.DEFAULT;
                }
                aimwVarL2.y("Using SODA AsrEnhancementPolicy: %s", afbuVarB);
                alad aladVarP6 = akzxVarM7.p();
                aooh.e(aladVarP6, "build(...)");
                defpackage.afbv afbvVar2 = (defpackage.afbv) aladVarP6;
                aooh.f(afbvVar2, "value");
                akzzVarM.u();
                defpackage.afca afcaVar11 = akzzVarM.b;
                j$.util.Objects.requireNonNull(afbvVar2);
                afcaVar11.k = afbvVar2;
                afcaVar11.b |= 65536;
            }
            defpackage.afca afcaVarP = akzzVarM.p();
            aooh.e(afcaVarP, "build(...)");
            defpackage.afca afcaVar12 = afcaVarP;
            aooh.f(afcaVar12, "value");
            akzxVarM.u();
            defpackage.afcw afcwVar6 = (defpackage.afcw) akzxVarM.b;
            j$.util.Objects.requireNonNull(afcaVar12);
            afcwVar6.g = afcaVar12;
            afcwVar6.b |= 16;
            alad aladVarP7 = akzxVarM.p();
            aooh.e(aladVarP7, "build(...)");
            this.a = 1;
            java.lang.Object objAj = aoov.aj(typVar.f, new defpackage.txm((defpackage.afcw) aladVarP7, typVar, (aoln) null, 5), this);
            if (objAj != aoluVar) {
                objAj = aojh.a;
            }
            if (objAj == aoluVar) {
                return aoluVar;
            }
        }
        defpackage.typ typVar2 = this.b;
        return new defpackage.tyg(typVar2, typVar2);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.tym(this.b, this.c, aolnVar);
    }
}
