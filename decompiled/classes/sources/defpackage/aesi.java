package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aesi extends defpackage.aeso implements defpackage.aepj, defpackage.aeqv {
    public final defpackage.aesp a;
    private final android.content.Context b;
    private final defpackage.aesu c;
    private final defpackage.aesf d;
    private final defpackage.aesh e;
    private final android.util.ArrayMap f;
    private final defpackage.aequ g;
    private final defpackage.aoin h;
    private final defpackage.tvn i;

    /* JADX WARN: Type inference failed for: r4v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [aoin, java.lang.Object] */
    public aesi(defpackage.gou gouVar, android.content.Context context, defpackage.tvn tvnVar, defpackage.amwu amwuVar, defpackage.aesf aesfVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, java.util.concurrent.Executor executor, defpackage.adag adagVar, defpackage.aoin aoinVar3, defpackage.aesp aespVar) {
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        this.f = arrayMap;
        this.g = gouVar.D(executor, amwuVar, aoinVar2);
        this.b = context;
        this.i = tvnVar;
        this.h = aoinVar;
        this.d = aesfVar;
        defpackage.aesh aeshVar = new defpackage.aesh(context, arrayMap, aoinVar3);
        this.e = aeshVar;
        ?? A = adagVar.b.a();
        A.getClass();
        ((defpackage.ajcu) adagVar.a.a()).getClass();
        this.c = new defpackage.aesu(A, aeshVar);
        this.a = aespVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ahzr */
    /* JADX WARN: Type inference failed for: r3v38, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v46, types: [amwu, java.lang.Object] */
    public final defpackage.ajcq a(defpackage.aesk aeskVar) throws ahzr {
        defpackage.aesj aesjVar;
        apgq apgqVarR;
        int i;
        if (!this.g.c()) {
            return defpackage.ajcm.a;
        }
        android.util.ArrayMap arrayMap = this.f;
        synchronized (arrayMap) {
            aesjVar = (defpackage.aesj) arrayMap.remove(aeskVar.a);
            if (arrayMap.isEmpty()) {
                this.c.j();
            }
        }
        if (aesjVar == null) {
            ((defpackage.aimw) ((defpackage.aimw) aenr.a.b()).l("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "stopAsFuture", 215, "FrameMetricServiceImpl.java")).y("Measurement not found: %s", new defpackage.aepg(aeskVar.a.a));
            return defpackage.ajcm.a;
        }
        defpackage.aesp aespVar = this.a;
        defpackage.aesr aesrVar = aeskVar.a;
        java.lang.String strB = aesrVar.b();
        if (da$.ExternalSyntheticApiModelOutline0.m()) {
            defpackage.aesp.a(strB, "FT#end", 0L);
            da$.ExternalSyntheticApiModelOutline0.m(java.lang.String.format(java.util.Locale.US, "J<%s>", strB), 352691800);
            for (aess aessVar : ((defpackage.aest) aespVar.a.a()).c) {
                int iAP = defpackage.a.aP(aessVar.b);
                if (iAP == 0) {
                    iAP = 1;
                }
                switch (iAP - 1) {
                    case 1:
                        i = 0;
                        break;
                    case 2:
                        i = aesjVar.f;
                        break;
                    case 3:
                        i = aesjVar.h;
                        break;
                    case 4:
                        i = aesjVar.i;
                        break;
                    case 5:
                        i = aesjVar.j;
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        i = aesjVar.k;
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        i = aesjVar.m;
                        break;
                    default:
                        java.lang.String str = aessVar.c;
                        continue;
                }
                da$.ExternalSyntheticApiModelOutline0.m(aessVar.c.replace("%EVENT_NAME%", strB), i);
            }
        }
        if (aesjVar.h == 0) {
            return defpackage.ajcm.a;
        }
        defpackage.aoin aoinVar = aespVar.a;
        if (((defpackage.aest) aoinVar.a()).d) {
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
            java.lang.Long l = 9000L;
            l.getClass();
            if (aesjVar.m <= 9000 && aesjVar.f != 0) {
                defpackage.aerb aerbVar = (defpackage.aerb) aespVar.b.a();
                defpackage.ahwt ahwtVar = defpackage.ahwt.a;
                java.lang.String strReplace = ((defpackage.aest) aoinVar.a()).b.replace("%PACKAGE_NAME%", ((android.content.Context) aespVar.d).getPackageName());
                ahwtVar.d(strReplace);
                aerbVar.a(strReplace);
            }
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - aesjVar.c;
        defpackage.akzz akzzVar = (defpackage.akzz) defpackage.apgm.a.m();
        akzzVar.u();
        defpackage.apgm apgmVar = (defpackage.apgm) akzzVar.b;
        apgmVar.b |= 16;
        apgmVar.g = ((int) jElapsedRealtime) + 1;
        int i2 = aesjVar.f;
        akzzVar.u();
        defpackage.apgm apgmVar2 = (defpackage.apgm) akzzVar.b;
        apgmVar2.b |= 1;
        apgmVar2.c = i2;
        int i3 = aesjVar.h;
        akzzVar.u();
        defpackage.apgm apgmVar3 = (defpackage.apgm) akzzVar.b;
        apgmVar3.b |= 2;
        apgmVar3.d = i3;
        int i4 = aesjVar.i;
        akzzVar.u();
        defpackage.apgm apgmVar4 = (defpackage.apgm) akzzVar.b;
        apgmVar4.b |= 4;
        apgmVar4.e = i4;
        int i5 = aesjVar.k;
        akzzVar.u();
        defpackage.apgm apgmVar5 = (defpackage.apgm) akzzVar.b;
        apgmVar5.b |= 32;
        apgmVar5.h = i5;
        int i6 = aesjVar.m;
        akzzVar.u();
        defpackage.apgm apgmVar6 = (defpackage.apgm) akzzVar.b;
        apgmVar6.b |= 64;
        apgmVar6.i = i6;
        int i7 = aesjVar.j;
        akzzVar.u();
        defpackage.apgm apgmVar7 = (defpackage.apgm) akzzVar.b;
        apgmVar7.b |= 8;
        apgmVar7.f = i7;
        int i8 = aesjVar.n;
        if (i8 != Integer.MIN_VALUE) {
            int[] iArr = aesjVar.e;
            int[] iArr2 = defpackage.aesj.b;
            defpackage.akzx akzxVarM = apgq.a.m();
            int i9 = 0;
            while (true) {
                if (i9 >= 52) {
                    if (iArr[51] > 0) {
                        akzxVarM.bL(i8 + 1);
                        akzxVarM.bM(0);
                    }
                    apgqVarR = akzxVarM.r();
                } else if (iArr2[i9] > i8) {
                    akzxVarM.bM(0);
                    akzxVarM.bL(i8 + 1);
                    apgqVarR = (apgq) akzxVarM.r();
                } else {
                    int i10 = iArr[i9];
                    if (i10 > 0 || (i9 > 0 && iArr[i9 - 1] > 0)) {
                        akzxVarM.bM(i10);
                        akzxVarM.bL(iArr2[i9]);
                    }
                    i9++;
                }
            }
            akzzVar.u();
            defpackage.apgm apgmVar8 = (defpackage.apgm) akzzVar.b;
            j$.util.Objects.requireNonNull(apgqVarR);
            apgmVar8.p = apgqVarR;
            apgmVar8.b |= 2048;
            int i11 = aesjVar.g;
            akzzVar.u();
            defpackage.apgm apgmVar9 = (defpackage.apgm) akzzVar.b;
            apgmVar9.b |= 512;
            apgmVar9.m = i11;
            int i12 = aesjVar.l;
            akzzVar.u();
            defpackage.apgm apgmVar10 = (defpackage.apgm) akzzVar.b;
            apgmVar10.b |= 1024;
            apgmVar10.o = i12;
        }
        int i13 = 0;
        while (i13 < 29) {
            int i14 = i13 + 1;
            int[] iArr3 = aesjVar.d;
            if (iArr3[i13] > 0) {
                defpackage.akzx akzxVarM2 = apgl.a.m();
                int i15 = iArr3[i13];
                akzxVarM2.u();
                apgl apglVar = akzxVarM2.b;
                apglVar.b |= 1;
                apglVar.c = i15;
                int[] iArr4 = defpackage.aesj.a;
                int i16 = iArr4[i13];
                akzxVarM2.u();
                apgl apglVar2 = akzxVarM2.b;
                apglVar2.b |= 2;
                apglVar2.d = i16;
                if (i14 < 29) {
                    int i17 = iArr4[i14] - 1;
                    akzxVarM2.u();
                    apgl apglVar3 = akzxVarM2.b;
                    apglVar3.b |= 4;
                    apglVar3.e = i17;
                }
                akzzVar.u();
                defpackage.apgm apgmVar11 = (defpackage.apgm) akzzVar.b;
                apgl apglVarR = akzxVarM2.r();
                j$.util.Objects.requireNonNull(apglVarR);
                defpackage.alat alatVar = apgmVar11.k;
                if (!alatVar.c()) {
                    apgmVar11.k = alatVar.d(alatVar.size() << 1);
                }
                apgmVar11.k.add(apglVarR);
            }
            i13 = i14;
        }
        defpackage.akzz akzzVar2 = (defpackage.akzz) ((defpackage.apgm) akzzVar.r()).L();
        defpackage.ahyn ahynVarA = defpackage.aesg.a(this.b);
        if (ahynVarA.f()) {
            int iIntValue = ((java.lang.Float) ahynVarA.b()).intValue();
            akzzVar2.u();
            defpackage.apgm apgmVar12 = (defpackage.apgm) akzzVar2.b;
            apgmVar12.b |= 256;
            apgmVar12.l = iIntValue;
        }
        defpackage.aequ aequVar = this.g;
        defpackage.apgm apgmVar13 = (defpackage.apgm) akzzVar2.r();
        defpackage.aeqq aeqqVarA = defpackage.aeqr.a();
        defpackage.akzx akzxVarM3 = defpackage.apgu.a.m();
        akzxVarM3.u();
        defpackage.apgu apguVar = (defpackage.apgu) akzxVarM3.b;
        j$.util.Objects.requireNonNull(apgmVar13);
        apguVar.l = apgmVar13;
        apguVar.b |= 512;
        aeqqVarA.f((defpackage.apgu) akzxVarM3.r());
        aeqqVarA.b = null;
        aeqqVarA.c = true == aesrVar.b ? "Activity" : null;
        aeqqVarA.a = aesrVar.b();
        aeqqVarA.c(aesrVar.a != null);
        return aequVar.a(aeqqVarA.a());
    }

    @Override // defpackage.aeso
    public final defpackage.ajcq b(defpackage.aesm aesmVar) {
        defpackage.aenj aenjVar = aesmVar.b;
        return a(new defpackage.aesk(aenjVar != null ? new defpackage.aesr(null, aenjVar, false) : new defpackage.aesr(aesmVar.a, null, false), aesmVar.c, aesmVar.d, aesmVar.e, aesmVar.f));
    }

    @Override // defpackage.aeso
    public final void c(defpackage.aenj aenjVar) {
        android.util.ArrayMap arrayMap = this.f;
        synchronized (arrayMap) {
            defpackage.aesr aesrVar = new defpackage.aesr(null, aenjVar, false);
            if (((defpackage.aesj) arrayMap.remove(aesrVar)) != null) {
                defpackage.aesp.b(aesrVar.b());
            }
        }
    }

    @Override // defpackage.aeso
    public final void d(defpackage.aenj aenjVar) {
        e(new defpackage.aesr(null, aenjVar, false));
    }

    public final void e(defpackage.aesr aesrVar) {
        if (this.g.b(aesrVar.b())) {
            android.util.ArrayMap arrayMap = this.f;
            synchronized (arrayMap) {
                if (arrayMap.size() >= 25) {
                    ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).l("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "start", 158, "FrameMetricServiceImpl.java")).y("Too many concurrent measurements, ignoring %s", aesrVar);
                    return;
                }
                defpackage.aesj aesjVar = (defpackage.aesj) arrayMap.put(aesrVar, (defpackage.aesj) this.h.a());
                if (aesjVar != null) {
                    arrayMap.put(aesrVar, aesjVar);
                    ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).l("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "start", 172, "FrameMetricServiceImpl.java")).y("measurement already started: %s", aesrVar);
                    return;
                }
                if (arrayMap.size() == 1) {
                    this.c.g();
                }
                java.lang.String strB = aesrVar.b();
                if (da$.ExternalSyntheticApiModelOutline0.m()) {
                    java.lang.String str = java.lang.String.format(java.util.Locale.US, "J<%s>", strB);
                    da$.ExternalSyntheticApiModelOutline0.m$1(str, 352691800);
                    if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
                        java.lang.String strConcat = java.lang.String.valueOf(str).concat("#UIThread");
                        if (strConcat.length() <= 127) {
                            android.os.Trace.beginSection(strConcat);
                            android.os.Trace.endSection();
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.aepj
    public final void g(defpackage.aenj aenjVar) {
        android.util.ArrayMap arrayMap = this.f;
        synchronized (arrayMap) {
            j$.util.Map.-EL.forEach(arrayMap, new ldo(6));
            arrayMap.clear();
        }
    }

    @Override // defpackage.aeqv
    public final void n() {
        defpackage.tvn tvnVar = this.i;
        tvnVar.w(this.c);
        tvnVar.w(this.d);
    }

    @Override // defpackage.aepj
    public final /* synthetic */ void j(defpackage.aenj aenjVar) {
    }
}
