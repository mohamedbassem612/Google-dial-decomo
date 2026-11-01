package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tzb {
    private static final aimz c = aimz.i("com/android/dialer/sodatranscription/statusbanner/data/SodaStatusRetriever");
    public final aoss a;
    public final android.content.Context b;
    private final twp d;

    public tzb(twp twpVar, aoss aossVar, android.content.Context context) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(context, "appContext");
        this.d = twpVar;
        this.a = aossVar;
        this.b = context;
    }

    public final java.lang.Object a(aoln aolnVar) {
        return b(akff.a(gus.ae(this.b).toLanguageTag()), null, aolnVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:39:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:48:0x0110  */
    /* JADX WARN: Code duplicated, block: B:50:0x0118  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0124 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0126 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0128  */
    /* JADX WARN: Code duplicated, block: B:59:0x014f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0155  */
    /* JADX WARN: Code duplicated, block: B:62:0x017c  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(akff akffVar, java.lang.Integer num, aoln aolnVar) throws aois {
        defpackage.tza tzaVar;
        aoot aootVar;
        aoot aootVar2;
        defpackage.tyy tyyVar;
        akff akffVar2;
        aoot aootVar3;
        aoot aootVar4;
        defpackage.vaa vaaVarCg;
        defpackage.tyy tyyVar2;
        defpackage.tyz tyzVarW;
        akff akffVar3;
        defpackage.tyz tyzVar;
        defpackage.tyy tyyVar3;
        defpackage.twf twfVar;
        java.lang.Object objI;
        defpackage.twf twfVar2;
        defpackage.tvz tvzVar;
        java.lang.String str;
        defpackage.tvy tvyVarB;
        int iOrdinal;
        if (aolnVar instanceof defpackage.tza) {
            tzaVar = (defpackage.tza) aolnVar;
            int i = tzaVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                tzaVar.e = i - Integer.MIN_VALUE;
            } else {
                tzaVar = new defpackage.tza(this, aolnVar);
            }
        } else {
            tzaVar = new defpackage.tza(this, aolnVar);
        }
        java.lang.Object objJ = tzaVar.c;
        aolu aoluVar = aolu.a;
        int i2 = tzaVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                aootVar3 = tzaVar.f;
                aootVar4 = (aoot) tzaVar.b;
                akffVar2 = (akff) tzaVar.a;
                aooc.af(objJ);
            } else if (i2 == 2) {
                tyzVar = (defpackage.tyz) tzaVar.b;
                akffVar3 = (akff) tzaVar.a;
                aooc.af(objJ);
                twp twpVar = this.d;
                twfVar = (defpackage.twf) objJ;
                tzaVar.a = tyzVar;
                tzaVar.b = twfVar;
                tzaVar.e = 3;
                objI = twpVar.i(akffVar3, tzaVar);
                if (objI == aoluVar) {
                    return aoluVar;
                }
                objJ = objI;
                twfVar2 = twfVar;
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                twfVar2 = (defpackage.twf) tzaVar.b;
                tyzVar = (defpackage.tyz) tzaVar.a;
                aooc.af(objJ);
            }
            tvzVar = (defpackage.tvz) objJ;
            str = tvzVar.e;
            aooh.e(str, "getLanguageCode(...)");
            if (twfVar2 == defpackage.twf.SODA_HOST_APP_STATUS_NEEDS_UPDATE) {
                c.b().l("com/android/dialer/sodatranscription/statusbanner/data/SodaStatusRetriever", "fetch", 73, "SodaStatusRetriever.kt").v("Google Search app outdated.");
                defpackage.vaa vaaVarCg2 = wsc.cg(tyzVar.p());
                vaaVarCg2.y(8);
                vaaVarCg2.x(str);
                return vaaVarCg2.w();
            }
            tvyVarB = defpackage.tvy.b(tvzVar.c);
            if (tvyVarB == null) {
                tvyVarB = defpackage.tvy.UNKNOWN;
            }
            iOrdinal = tvyVarB.ordinal();
            if (iOrdinal == 0) {
                throw new java.lang.IllegalStateException("Should not be unknown");
            }
            if (iOrdinal == 1) {
                c.b().l("com/android/dialer/sodatranscription/statusbanner/data/SodaStatusRetriever", "fetch", 102, "SodaStatusRetriever.kt").v("Soda already working");
                defpackage.vaa vaaVarCg3 = wsc.cg(tyzVar.p());
                vaaVarCg3.y(6);
                vaaVarCg3.x(str);
                return vaaVarCg3.w();
            }
            if (iOrdinal == 2) {
                c.b().l("com/android/dialer/sodatranscription/statusbanner/data/SodaStatusRetriever", "fetch", 81, "SodaStatusRetriever.kt").v("Language model needs download.");
                defpackage.vaa vaaVarCg4 = wsc.cg(tyzVar.p());
                vaaVarCg4.y(4);
                vaaVarCg4.x(str);
                return vaaVarCg4.w();
            }
            if (iOrdinal == 3) {
                c.b().l("com/android/dialer/sodatranscription/statusbanner/data/SodaStatusRetriever", "fetch", 88, "SodaStatusRetriever.kt").y("Unsupported Soda language: %s", str);
                defpackage.vaa vaaVarCg5 = wsc.cg(tyzVar.p());
                vaaVarCg5.y(7);
                vaaVarCg5.x(str);
                return vaaVarCg5.w();
            }
            if (iOrdinal != 4) {
                throw new aois();
            }
            c.b().l("com/android/dialer/sodatranscription/statusbanner/data/SodaStatusRetriever", "fetch", 95, "SodaStatusRetriever.kt").v("Language pack is downloading");
            defpackage.vaa vaaVarCg6 = wsc.cg(tyzVar.p());
            vaaVarCg6.y(5);
            vaaVarCg6.x(str);
            return vaaVarCg6.w();
        }
        aooc.af(objJ);
        aootVar = new aoot();
        if (num != null) {
            twp twpVar2 = this.d;
            int iIntValue = num.intValue();
            tzaVar.a = akffVar;
            tzaVar.b = aootVar;
            tzaVar.f = aootVar;
            tzaVar.e = 1;
            java.lang.Object objF = twpVar2.f(iIntValue, tzaVar);
            if (objF == aoluVar) {
                return aoluVar;
            }
            akffVar2 = akffVar;
            aootVar3 = aootVar;
            objJ = objF;
            aootVar4 = aootVar3;
        } else {
            aootVar2 = aootVar;
            tyyVar = null;
        }
        aootVar.a = tyyVar;
        vaaVarCg = wsc.cg(defpackage.tyz.a.m());
        tyyVar2 = (defpackage.tyy) aootVar2.a;
        if (tyyVar2 != null) {
            akzx akzxVar = (akzx) vaaVarCg.a;
            akzxVar.u();
            defpackage.tyz tyzVar2 = (defpackage.tyz) akzxVar.b;
            tyzVar2.e = tyyVar2.a();
            tyzVar2.b |= 1;
        }
        tyzVarW = vaaVarCg.w();
        twp twpVar3 = this.d;
        tzaVar.a = akffVar;
        tzaVar.b = tyzVarW;
        tzaVar.f = null;
        tzaVar.e = 2;
        objJ = twpVar3.j(tzaVar);
        if (objJ != aoluVar) {
            return aoluVar;
        }
        akffVar3 = akffVar;
        tyzVar = tyzVarW;
        twp twpVar4 = this.d;
        twfVar = (defpackage.twf) objJ;
        tzaVar.a = tyzVar;
        tzaVar.b = twfVar;
        tzaVar.e = 3;
        objI = twpVar4.i(akffVar3, tzaVar);
        if (objI == aoluVar) {
            return aoluVar;
        }
        objJ = objI;
        twfVar2 = twfVar;
        tvzVar = (defpackage.tvz) objJ;
        str = tvzVar.e;
        aooh.e(str, "getLanguageCode(...)");
        if (twfVar2 == defpackage.twf.SODA_HOST_APP_STATUS_NEEDS_UPDATE) {
            c.b().l("com/android/dialer/sodatranscription/statusbanner/data/SodaStatusRetriever", "fetch", 73, "SodaStatusRetriever.kt").v("Google Search app outdated.");
            defpackage.vaa vaaVarCg7 = wsc.cg(tyzVar.p());
            vaaVarCg7.y(8);
            vaaVarCg7.x(str);
            return vaaVarCg7.w();
        }
        tvyVarB = defpackage.tvy.b(tvzVar.c);
        if (tvyVarB == null) {
            tvyVarB = defpackage.tvy.UNKNOWN;
        }
        iOrdinal = tvyVarB.ordinal();
        if (iOrdinal == 0) {
            throw new java.lang.IllegalStateException("Should not be unknown");
        }
        if (iOrdinal == 1) {
            c.b().l("com/android/dialer/sodatranscription/statusbanner/data/SodaStatusRetriever", "fetch", 102, "SodaStatusRetriever.kt").v("Soda already working");
            defpackage.vaa vaaVarCg8 = wsc.cg(tyzVar.p());
            vaaVarCg8.y(6);
            vaaVarCg8.x(str);
            return vaaVarCg8.w();
        }
        if (iOrdinal == 2) {
            c.b().l("com/android/dialer/sodatranscription/statusbanner/data/SodaStatusRetriever", "fetch", 81, "SodaStatusRetriever.kt").v("Language model needs download.");
            defpackage.vaa vaaVarCg9 = wsc.cg(tyzVar.p());
            vaaVarCg9.y(4);
            vaaVarCg9.x(str);
            return vaaVarCg9.w();
        }
        if (iOrdinal == 3) {
            c.b().l("com/android/dialer/sodatranscription/statusbanner/data/SodaStatusRetriever", "fetch", 88, "SodaStatusRetriever.kt").y("Unsupported Soda language: %s", str);
            defpackage.vaa vaaVarCg10 = wsc.cg(tyzVar.p());
            vaaVarCg10.y(7);
            vaaVarCg10.x(str);
            return vaaVarCg10.w();
        }
        if (iOrdinal != 4) {
            throw new aois();
        }
        c.b().l("com/android/dialer/sodatranscription/statusbanner/data/SodaStatusRetriever", "fetch", 95, "SodaStatusRetriever.kt").v("Language pack is downloading");
        defpackage.vaa vaaVarCg11 = wsc.cg(tyzVar.p());
        vaaVarCg11.y(5);
        vaaVarCg11.x(str);
        return vaaVarCg11.w();
        defpackage.tvw tvwVar = (defpackage.tvw) objJ;
        aooh.f(tvwVar, "<this>");
        int iOrdinal2 = tvwVar.ordinal();
        if (iOrdinal2 == 0) {
            tyyVar3 = defpackage.tyy.AICORE_MODEL_UNKNOWN;
        } else if (iOrdinal2 == 1) {
            tyyVar3 = defpackage.tyy.AICORE_MODEL_DOWNLOADABLE;
        } else if (iOrdinal2 == 2) {
            tyyVar3 = defpackage.tyy.AICORE_MODEL_DOWNLOADING;
        } else if (iOrdinal2 != 3) {
            if (iOrdinal2 != 4) {
                throw new aois();
            }
            tyyVar3 = defpackage.tyy.AICORE_MODEL_UNKNOWN;
        } else {
            tyyVar3 = defpackage.tyy.AICORE_MODEL_DOWNLOADED;
        }
        defpackage.tyy tyyVar4 = tyyVar3;
        aootVar = aootVar3;
        akffVar = akffVar2;
        aootVar2 = aootVar4;
        tyyVar = tyyVar4;
        aootVar.a = tyyVar;
        vaaVarCg = wsc.cg(defpackage.tyz.a.m());
        tyyVar2 = (defpackage.tyy) aootVar2.a;
        if (tyyVar2 != null) {
            akzx akzxVar2 = (akzx) vaaVarCg.a;
            akzxVar2.u();
            defpackage.tyz tyzVar3 = (defpackage.tyz) akzxVar2.b;
            tyzVar3.e = tyyVar2.a();
            tyzVar3.b |= 1;
        }
        tyzVarW = vaaVarCg.w();
        twp twpVar5 = this.d;
        tzaVar.a = akffVar;
        tzaVar.b = tyzVarW;
        tzaVar.f = null;
        tzaVar.e = 2;
        objJ = twpVar5.j(tzaVar);
        if (objJ != aoluVar) {
            return aoluVar;
        }
        akffVar3 = akffVar;
        tyzVar = tyzVarW;
        twp twpVar6 = this.d;
        twfVar = (defpackage.twf) objJ;
        tzaVar.a = tyzVar;
        tzaVar.b = twfVar;
        tzaVar.e = 3;
        objI = twpVar6.i(akffVar3, tzaVar);
        if (objI == aoluVar) {
            return aoluVar;
        }
        objJ = objI;
        twfVar2 = twfVar;
        tvzVar = (defpackage.tvz) objJ;
        str = tvzVar.e;
        aooh.e(str, "getLanguageCode(...)");
        if (twfVar2 == defpackage.twf.SODA_HOST_APP_STATUS_NEEDS_UPDATE) {
            c.b().l("com/android/dialer/sodatranscription/statusbanner/data/SodaStatusRetriever", "fetch", 73, "SodaStatusRetriever.kt").v("Google Search app outdated.");
            defpackage.vaa vaaVarCg12 = wsc.cg(tyzVar.p());
            vaaVarCg12.y(8);
            vaaVarCg12.x(str);
            return vaaVarCg12.w();
        }
        tvyVarB = defpackage.tvy.b(tvzVar.c);
        if (tvyVarB == null) {
            tvyVarB = defpackage.tvy.UNKNOWN;
        }
        iOrdinal = tvyVarB.ordinal();
        if (iOrdinal == 0) {
            throw new java.lang.IllegalStateException("Should not be unknown");
        }
        if (iOrdinal == 1) {
            c.b().l("com/android/dialer/sodatranscription/statusbanner/data/SodaStatusRetriever", "fetch", 102, "SodaStatusRetriever.kt").v("Soda already working");
            defpackage.vaa vaaVarCg13 = wsc.cg(tyzVar.p());
            vaaVarCg13.y(6);
            vaaVarCg13.x(str);
            return vaaVarCg13.w();
        }
        if (iOrdinal == 2) {
            c.b().l("com/android/dialer/sodatranscription/statusbanner/data/SodaStatusRetriever", "fetch", 81, "SodaStatusRetriever.kt").v("Language model needs download.");
            defpackage.vaa vaaVarCg14 = wsc.cg(tyzVar.p());
            vaaVarCg14.y(4);
            vaaVarCg14.x(str);
            return vaaVarCg14.w();
        }
        if (iOrdinal == 3) {
            c.b().l("com/android/dialer/sodatranscription/statusbanner/data/SodaStatusRetriever", "fetch", 88, "SodaStatusRetriever.kt").y("Unsupported Soda language: %s", str);
            defpackage.vaa vaaVarCg15 = wsc.cg(tyzVar.p());
            vaaVarCg15.y(7);
            vaaVarCg15.x(str);
            return vaaVarCg15.w();
        }
        if (iOrdinal != 4) {
            throw new aois();
        }
        c.b().l("com/android/dialer/sodatranscription/statusbanner/data/SodaStatusRetriever", "fetch", 95, "SodaStatusRetriever.kt").v("Language pack is downloading");
        defpackage.vaa vaaVarCg16 = wsc.cg(tyzVar.p());
        vaaVarCg16.y(5);
        vaaVarCg16.x(str);
        return vaaVarCg16.w();
    }
}
