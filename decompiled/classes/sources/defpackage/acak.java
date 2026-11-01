package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acak implements defpackage.acab {
    public static final defpackage.aiof a = defpackage.aiof.i("GnpSdk");
    private final java.lang.String b;
    private final defpackage.acgr c;
    private final defpackage.amwu d;
    private final defpackage.abce e;

    public acak(java.lang.String str, defpackage.acgr acgrVar, defpackage.abce abceVar, defpackage.amwu amwuVar) {
        if (str == null) {
            defpackage.aooh.i("packageName");
        }
        if (acgrVar == null) {
            defpackage.aooh.i("cappedPromotionStore");
        }
        if (amwuVar == null) {
            defpackage.aooh.i("clientStreamz");
        }
        this.b = str;
        this.c = acgrVar;
        this.e = abceVar;
        this.d = amwuVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.acab
    public final java.lang.Object a(akhi akhiVar, akhp akhpVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        acaj acajVar;
        akhg akhgVar;
        int iAO;
        akhq akhqVar;
        if (aolnVar instanceof acaj) {
            acajVar = (acaj) aolnVar;
            int i = acajVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                acajVar.c = i - Integer.MIN_VALUE;
            } else {
                acajVar = new acaj(this, aolnVar);
            }
        } else {
            acajVar = new acaj(this, aolnVar);
        }
        java.lang.Object objD = acajVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = acajVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            int iAO2 = defpackage.a.aO(akhiVar.d);
            if (iAO2 == 0) {
                iAO2 = 1;
            }
            j$.time.Duration durationZ = abxl.z(akhpVar, iAO2);
            if (durationZ != null) {
                defpackage.akzx akzxVarM = akhg.a.m();
                defpackage.aooh.f(akzxVarM, "builder");
                defpackage.alcf alcfVar = akhiVar.e;
                if (alcfVar == null) {
                    alcfVar = defpackage.alcf.a;
                }
                defpackage.aooh.e(alcfVar, "getImpressionTime(...)");
                j$.time.Instant instantPlus = defpackage.aooc.aw(alcfVar).plus(durationZ);
                defpackage.alcf alcfVar2 = defpackage.aldi.a;
                defpackage.aooh.e(alcfVar2, "MAX_VALUE");
                j$.time.Instant instantA = defpackage.aooc.A(instantPlus, defpackage.aooc.aw(alcfVar2));
                defpackage.aooh.e(instantA, "coerceAtMost(...)");
                defpackage.alcf alcfVarAu = defpackage.aooc.au(instantA);
                defpackage.aooh.f(alcfVarAu, "value");
                akzxVarM.u();
                akhg akhgVar2 = akzxVarM.b;
                j$.util.Objects.requireNonNull(alcfVarAu);
                akhgVar2.d = alcfVarAu;
                akhgVar2.b |= 1;
                akhq akhqVar2 = akhiVar.c;
                if (akhqVar2 == null) {
                    akhqVar2 = akhq.a;
                }
                int i3 = akhqVar2.b;
                akzxVarM.u();
                akzxVarM.b.c = i3;
                akhg akhgVarR = akzxVarM.r();
                defpackage.aooh.e(akhgVarR, "build(...)");
                akhgVar = akhgVarR;
            } else {
                akhgVar = null;
            }
            if (akhgVar != null) {
                defpackage.ajcq ajcqVarD = this.c.d(java.lang.String.valueOf(akhgVar.c), akhgVar);
                defpackage.aooh.e(ajcqVarD, "put(...)");
                acajVar.d = akhiVar;
                acajVar.e = akhpVar;
                acajVar.c = 1;
                objD = defpackage.aosv.D(ajcqVarD, acajVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
            }
            iAO = defpackage.a.aO(akhiVar.d);
            if (iAO != 0 && iAO == 2) {
                defpackage.aooh.f(akhpVar, "onDeviceImpressionCap");
                if (anfk.c() && akhpVar.e) {
                    akhqVar = akhiVar.c;
                    if (akhqVar == null) {
                        akhqVar = akhq.a;
                    }
                    long j = akhqVar.b;
                    j$.time.Instant instantNow = j$.time.Instant.now();
                    defpackage.aooh.e(instantNow, "now(...)");
                    defpackage.aooh.f(instantNow, "timestamp");
                    defpackage.abce abceVar = this.e;
                    long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    defpackage.aaum aaumVarO = abceVar.o(j, instantNow);
                    aaumVarO.a(new riw(new aev(this, jElapsedRealtime, 12), 2));
                    aaumVarO.q(new acai(this, jElapsedRealtime, 0));
                }
            }
            return defpackage.aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        akhp akhpVar2 = acajVar.e;
        akhi akhiVar2 = acajVar.d;
        defpackage.aooc.af(objD);
        akhpVar = akhpVar2;
        akhiVar = akhiVar2;
        iAO = defpackage.a.aO(akhiVar.d);
        if (iAO != 0) {
            defpackage.aooh.f(akhpVar, "onDeviceImpressionCap");
            if (anfk.c()) {
                akhqVar = akhiVar.c;
                if (akhqVar == null) {
                    akhqVar = akhq.a;
                }
                long j2 = akhqVar.b;
                j$.time.Instant instantNow2 = j$.time.Instant.now();
                defpackage.aooh.e(instantNow2, "now(...)");
                defpackage.aooh.f(instantNow2, "timestamp");
                defpackage.abce abceVar2 = this.e;
                long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                defpackage.aaum aaumVarO2 = abceVar2.o(j2, instantNow2);
                aaumVarO2.a(new riw(new aev(this, jElapsedRealtime2, 12), 2));
                aaumVarO2.q(new acai(this, jElapsedRealtime2, 0));
            }
        }
        return defpackage.aojh.a;
    }

    public final void b(long j, boolean z) {
        ((defpackage.afim) ((defpackage.aeey) this.d.a()).m.eZ()).b(android.os.SystemClock.elapsedRealtime() - j, this.b, java.lang.Boolean.valueOf(z));
    }
}
