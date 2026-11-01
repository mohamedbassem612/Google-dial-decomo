package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeuf extends defpackage.agab implements defpackage.aeqv, defpackage.aepj {
    private final defpackage.aepm a;
    private final defpackage.aoin b;
    private final defpackage.aoin c;
    private final defpackage.aoin d;
    private final java.util.concurrent.atomic.AtomicBoolean e = new java.util.concurrent.atomic.AtomicBoolean();
    private final defpackage.aoin f;
    private final defpackage.aoin g;

    public aeuf(defpackage.aepm aepmVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.amwu amwuVar) {
        this.g = aoinVar4;
        this.a = aepmVar;
        this.b = aoinVar;
        this.c = aoinVar2;
        this.d = aoinVar3;
        this.f = new defpackage.aeur(amwuVar, 1);
    }

    private static long cF(java.lang.Long l, long j) {
        return l != null ? java.lang.Math.min(l.longValue(), j) : j;
    }

    private static defpackage.apfi cG(defpackage.aetz aetzVar) {
        defpackage.akzx akzxVarM = defpackage.apfi.a.m();
        if (aetzVar.a != null) {
            java.lang.String str = aetzVar.a;
            akzxVarM.u();
            defpackage.apfi apfiVar = (defpackage.apfi) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            apfiVar.b |= 1;
            apfiVar.c = str;
        }
        if (aetzVar.b != null) {
            long j = aetzVar.b.a;
            akzxVarM.u();
            defpackage.apfi apfiVar2 = (defpackage.apfi) akzxVarM.b;
            apfiVar2.b |= 2;
            apfiVar2.d = j;
        }
        if (aetzVar.c != null) {
            long j2 = aetzVar.c.a;
            akzxVarM.u();
            defpackage.apfi apfiVar3 = (defpackage.apfi) akzxVarM.b;
            apfiVar3.b |= 4;
            apfiVar3.e = j2;
        }
        if (aetzVar.d != null) {
            long j3 = aetzVar.d.a;
            akzxVarM.u();
            defpackage.apfi apfiVar4 = (defpackage.apfi) akzxVarM.b;
            apfiVar4.b |= 8;
            apfiVar4.f = j3;
        }
        return (defpackage.apfi) akzxVarM.r();
    }

    @Override // defpackage.aepj
    public final void g(defpackage.aenj aenjVar) {
        java.lang.Long lValueOf;
        this.a.b(this);
        defpackage.aeud aeudVar = defpackage.aeud.a;
        defpackage.aera aeraVar = aeudVar.i;
        defpackage.aera aeraVar2 = aeudVar.j;
        defpackage.aoin aoinVar = this.f;
        ((java.lang.Boolean) aoinVar.a()).booleanValue();
        if ((aeraVar == null || aeraVar.a <= 0) && (aeraVar2 == null || aeraVar2.a <= 0)) {
            ((defpackage.aimw) ((defpackage.aimw) aenr.a.b()).l("com/google/android/libraries/performance/primes/metrics/startup/StartupMetricServiceImpl", "onAppToBackground", 291, "StartupMetricServiceImpl.java")).v("missing firstDraw timestamp");
            return;
        }
        defpackage.aoin aoinVar2 = this.g;
        defpackage.aera aeraVar3 = aeudVar.d(((java.lang.Long) aoinVar2.a()).longValue()) ? aeudVar.b : aeudVar.g;
        if (aeraVar3 != null) {
            long j = aeraVar3.a;
            if (j > 0) {
                if ((aeraVar == null || aeraVar.a < j) && (aeraVar2 == null || aeraVar2.a < j)) {
                    return;
                }
                ((java.lang.Boolean) aoinVar.a()).booleanValue();
                defpackage.akzx akzxVarM = defpackage.apfj.a.m();
                boolean zD = aeudVar.d(((java.lang.Long) aoinVar2.a()).longValue());
                akzxVarM.u();
                defpackage.apfj apfjVar = (defpackage.apfj) akzxVarM.b;
                apfjVar.b |= 65536;
                apfjVar.r = zD;
                int i = true != zD ? 3 : 2;
                akzxVarM.u();
                defpackage.apfj apfjVar2 = (defpackage.apfj) akzxVarM.b;
                apfjVar2.s = i - 1;
                apfjVar2.b |= 131072;
                defpackage.aera aeraVar4 = aeudVar.b;
                defpackage.aera aeraVar5 = null;
                if (aeraVar4 != null) {
                    akzxVarM.u();
                    defpackage.apfj apfjVar3 = (defpackage.apfj) akzxVarM.b;
                    apfjVar3.b |= 16;
                    long j2 = aeraVar4.a;
                    apfjVar3.f = j2;
                    lValueOf = java.lang.Long.valueOf(j2);
                } else {
                    lValueOf = null;
                }
                defpackage.aera aeraVar6 = aeudVar.c;
                if (aeraVar6 != null) {
                    akzxVarM.u();
                    defpackage.apfj apfjVar4 = (defpackage.apfj) akzxVarM.b;
                    apfjVar4.b |= 128;
                    long j3 = aeraVar6.a;
                    apfjVar4.i = j3;
                    lValueOf = java.lang.Long.valueOf(cF(lValueOf, j3));
                }
                defpackage.aera aeraVar7 = aeudVar.d;
                defpackage.aera aeraVar8 = aeudVar.e;
                defpackage.aera aeraVar9 = aeudVar.f;
                defpackage.aera aeraVar10 = aeudVar.g;
                if (aeraVar10 != null) {
                    akzxVarM.u();
                    defpackage.apfj apfjVar5 = (defpackage.apfj) akzxVarM.b;
                    apfjVar5.b |= 512;
                    long j4 = aeraVar10.a;
                    apfjVar5.k = j4;
                    lValueOf = java.lang.Long.valueOf(cF(lValueOf, j4));
                }
                defpackage.aera aeraVar11 = aeudVar.j;
                defpackage.aera aeraVar12 = aeudVar.k;
                defpackage.aera aeraVar13 = aeudVar.i;
                defpackage.aera aeraVar14 = aeudVar.h;
                int iIntValue = ((java.lang.Long) this.d.a()).intValue();
                if (iIntValue == 1) {
                    aeraVar5 = aeraVar11;
                } else if (iIntValue == 2) {
                    aeraVar5 = aeraVar12;
                } else if (iIntValue == 3) {
                    aeraVar5 = aeraVar13;
                } else if (iIntValue == 4) {
                    aeraVar5 = aeraVar14;
                }
                if (aeraVar5 != null) {
                    akzxVarM.u();
                    defpackage.apfj apfjVar6 = (defpackage.apfj) akzxVarM.b;
                    apfjVar6.b |= 1024;
                    long j5 = aeraVar5.a;
                    apfjVar6.l = j5;
                    lValueOf = java.lang.Long.valueOf(cF(lValueOf, j5));
                }
                if (aeraVar13 != null) {
                    akzxVarM.u();
                    defpackage.apfj apfjVar7 = (defpackage.apfj) akzxVarM.b;
                    apfjVar7.b |= 8192;
                    long j6 = aeraVar13.a;
                    apfjVar7.o = j6;
                    lValueOf = java.lang.Long.valueOf(cF(lValueOf, j6));
                }
                if (aeraVar14 != null) {
                    akzxVarM.u();
                    defpackage.apfj apfjVar8 = (defpackage.apfj) akzxVarM.b;
                    apfjVar8.b |= 16384;
                    long j7 = aeraVar14.a;
                    apfjVar8.p = j7;
                    lValueOf = java.lang.Long.valueOf(cF(lValueOf, j7));
                }
                if (aeraVar11 != null) {
                    akzxVarM.u();
                    defpackage.apfj apfjVar9 = (defpackage.apfj) akzxVarM.b;
                    apfjVar9.b |= 2048;
                    long j8 = aeraVar11.a;
                    apfjVar9.m = j8;
                    lValueOf = java.lang.Long.valueOf(cF(lValueOf, j8));
                }
                if (aeraVar12 != null) {
                    akzxVarM.u();
                    defpackage.apfj apfjVar10 = (defpackage.apfj) akzxVarM.b;
                    apfjVar10.b |= 4096;
                    long j9 = aeraVar12.a;
                    apfjVar10.n = j9;
                    lValueOf = java.lang.Long.valueOf(cF(lValueOf, j9));
                }
                defpackage.aera aeraVar15 = aeudVar.l;
                if (aeraVar15 != null) {
                    akzxVarM.u();
                    defpackage.apfj apfjVar11 = (defpackage.apfj) akzxVarM.b;
                    apfjVar11.b |= 32768;
                    long j10 = aeraVar15.a;
                    apfjVar11.q = j10;
                    lValueOf = java.lang.Long.valueOf(cF(lValueOf, j10));
                }
                defpackage.aetz aetzVar = aeudVar.n;
                if (aetzVar.b != null) {
                    defpackage.apfi apfiVarCG = cG(aetzVar);
                    akzxVarM.u();
                    defpackage.apfj apfjVar12 = (defpackage.apfj) akzxVarM.b;
                    j$.util.Objects.requireNonNull(apfiVarCG);
                    apfjVar12.u = apfiVarCG;
                    apfjVar12.b |= 524288;
                    if ((apfiVarCG.b & 2) != 0) {
                        lValueOf = java.lang.Long.valueOf(cF(lValueOf, apfiVarCG.d));
                    }
                    if ((apfiVarCG.b & 4) != 0) {
                        lValueOf = java.lang.Long.valueOf(cF(lValueOf, apfiVarCG.e));
                    }
                    if ((apfiVarCG.b & 8) != 0) {
                        lValueOf = java.lang.Long.valueOf(cF(lValueOf, apfiVarCG.f));
                    }
                }
                defpackage.aetz aetzVar2 = aeudVar.o;
                if (aetzVar2.b != null) {
                    defpackage.apfi apfiVarCG2 = cG(aetzVar2);
                    akzxVarM.u();
                    defpackage.apfj apfjVar13 = (defpackage.apfj) akzxVarM.b;
                    j$.util.Objects.requireNonNull(apfiVarCG2);
                    apfjVar13.v = apfiVarCG2;
                    apfjVar13.b |= 1048576;
                    if ((apfiVarCG2.b & 2) != 0) {
                        lValueOf = java.lang.Long.valueOf(cF(lValueOf, apfiVarCG2.d));
                    }
                    if ((apfiVarCG2.b & 4) != 0) {
                        lValueOf = java.lang.Long.valueOf(cF(lValueOf, apfiVarCG2.e));
                    }
                    if ((apfiVarCG2.b & 8) != 0) {
                        lValueOf = java.lang.Long.valueOf(cF(lValueOf, apfiVarCG2.f));
                    }
                }
                defpackage.ahyn ahynVarA = defpackage.aeug.a;
                if (ahynVarA == null) {
                    ahynVarA = defpackage.aeug.a();
                    defpackage.aeug.a = ahynVarA;
                }
                if (ahynVarA.f()) {
                    java.lang.Long l = (java.lang.Long) ahynVarA.b();
                    long jLongValue = l.longValue();
                    akzxVarM.u();
                    defpackage.apfj apfjVar14 = (defpackage.apfj) akzxVarM.b;
                    apfjVar14.b |= 2;
                    apfjVar14.d = jLongValue;
                    lValueOf = java.lang.Long.valueOf(cF(lValueOf, l.longValue()));
                }
                long jM = aa$.ExternalSyntheticApiModelOutline1.m();
                akzxVarM.u();
                defpackage.apfj apfjVar15 = (defpackage.apfj) akzxVarM.b;
                apfjVar15.b |= 4;
                apfjVar15.e = jM;
                long jCF = cF(lValueOf, jM);
                java.lang.Long lValueOf2 = java.lang.Long.valueOf(jCF);
                akzxVarM.u();
                defpackage.apfj apfjVar16 = (defpackage.apfj) akzxVarM.b;
                apfjVar16.b |= 262144;
                apfjVar16.t = true;
                lValueOf2.getClass();
                boolean zBooleanValue = ((java.lang.Boolean) this.c.a()).booleanValue();
                if (jCF != 0) {
                    if (!zBooleanValue) {
                        akzxVarM.u();
                        defpackage.apfj apfjVar17 = (defpackage.apfj) akzxVarM.b;
                        apfjVar17.b |= 1;
                        apfjVar17.c = jCF;
                    }
                    defpackage.apfj apfjVar18 = (defpackage.apfj) akzxVarM.b;
                    if ((apfjVar18.b & 16) != 0) {
                        long j11 = apfjVar18.f - jCF;
                        akzxVarM.u();
                        defpackage.apfj apfjVar19 = (defpackage.apfj) akzxVarM.b;
                        apfjVar19.b |= 16;
                        apfjVar19.f = j11;
                    }
                    defpackage.apfj apfjVar20 = (defpackage.apfj) akzxVarM.b;
                    if ((apfjVar20.b & 128) != 0) {
                        long j12 = apfjVar20.i - jCF;
                        akzxVarM.u();
                        defpackage.apfj apfjVar21 = (defpackage.apfj) akzxVarM.b;
                        apfjVar21.b |= 128;
                        apfjVar21.i = j12;
                    }
                    defpackage.apfj apfjVar22 = (defpackage.apfj) akzxVarM.b;
                    if ((apfjVar22.b & 256) != 0) {
                        long j13 = apfjVar22.j - jCF;
                        akzxVarM.u();
                        defpackage.apfj apfjVar23 = (defpackage.apfj) akzxVarM.b;
                        apfjVar23.b |= 256;
                        apfjVar23.j = j13;
                    }
                    defpackage.apfj apfjVar24 = (defpackage.apfj) akzxVarM.b;
                    if ((apfjVar24.b & 32) != 0) {
                        long j14 = apfjVar24.g - jCF;
                        akzxVarM.u();
                        defpackage.apfj apfjVar25 = (defpackage.apfj) akzxVarM.b;
                        apfjVar25.b |= 32;
                        apfjVar25.g = j14;
                    }
                    defpackage.apfj apfjVar26 = (defpackage.apfj) akzxVarM.b;
                    if ((apfjVar26.b & 64) != 0) {
                        long j15 = apfjVar26.h - jCF;
                        akzxVarM.u();
                        defpackage.apfj apfjVar27 = (defpackage.apfj) akzxVarM.b;
                        apfjVar27.b |= 64;
                        apfjVar27.h = j15;
                    }
                    defpackage.apfj apfjVar28 = (defpackage.apfj) akzxVarM.b;
                    if ((apfjVar28.b & 512) != 0) {
                        long j16 = apfjVar28.k - jCF;
                        akzxVarM.u();
                        defpackage.apfj apfjVar29 = (defpackage.apfj) akzxVarM.b;
                        apfjVar29.b |= 512;
                        apfjVar29.k = j16;
                    }
                    defpackage.apfj apfjVar30 = (defpackage.apfj) akzxVarM.b;
                    if ((apfjVar30.b & 1024) != 0) {
                        long j17 = apfjVar30.l - jCF;
                        akzxVarM.u();
                        defpackage.apfj apfjVar31 = (defpackage.apfj) akzxVarM.b;
                        apfjVar31.b |= 1024;
                        apfjVar31.l = j17;
                    }
                    defpackage.apfj apfjVar32 = (defpackage.apfj) akzxVarM.b;
                    if ((apfjVar32.b & 2048) != 0) {
                        long j18 = apfjVar32.m - jCF;
                        akzxVarM.u();
                        defpackage.apfj apfjVar33 = (defpackage.apfj) akzxVarM.b;
                        apfjVar33.b |= 2048;
                        apfjVar33.m = j18;
                    }
                    defpackage.apfj apfjVar34 = (defpackage.apfj) akzxVarM.b;
                    if ((apfjVar34.b & 4096) != 0) {
                        long j19 = apfjVar34.n - jCF;
                        akzxVarM.u();
                        defpackage.apfj apfjVar35 = (defpackage.apfj) akzxVarM.b;
                        apfjVar35.b |= 4096;
                        apfjVar35.n = j19;
                    }
                    defpackage.apfj apfjVar36 = (defpackage.apfj) akzxVarM.b;
                    if ((apfjVar36.b & 8192) != 0) {
                        long j20 = apfjVar36.o - jCF;
                        akzxVarM.u();
                        defpackage.apfj apfjVar37 = (defpackage.apfj) akzxVarM.b;
                        apfjVar37.b |= 8192;
                        apfjVar37.o = j20;
                    }
                    defpackage.apfj apfjVar38 = (defpackage.apfj) akzxVarM.b;
                    if ((apfjVar38.b & 16384) != 0) {
                        long j21 = apfjVar38.p - jCF;
                        akzxVarM.u();
                        defpackage.apfj apfjVar39 = (defpackage.apfj) akzxVarM.b;
                        apfjVar39.b |= 16384;
                        apfjVar39.p = j21;
                    }
                    defpackage.apfj apfjVar40 = (defpackage.apfj) akzxVarM.b;
                    if ((apfjVar40.b & 32768) != 0) {
                        long j22 = apfjVar40.q - jCF;
                        akzxVarM.u();
                        defpackage.apfj apfjVar41 = (defpackage.apfj) akzxVarM.b;
                        apfjVar41.b |= 32768;
                        apfjVar41.q = j22;
                    }
                    defpackage.apfj apfjVar42 = (defpackage.apfj) akzxVarM.b;
                    if ((apfjVar42.b & 524288) != 0) {
                        defpackage.apfi apfiVar = apfjVar42.u;
                        if (apfiVar == null) {
                            apfiVar = defpackage.apfi.a;
                        }
                        defpackage.apfi apfiVarB = defpackage.aesg.b(apfiVar, jCF);
                        akzxVarM.u();
                        defpackage.apfj apfjVar43 = (defpackage.apfj) akzxVarM.b;
                        j$.util.Objects.requireNonNull(apfiVarB);
                        apfjVar43.u = apfiVarB;
                        apfjVar43.b |= 524288;
                    }
                    defpackage.apfj apfjVar44 = (defpackage.apfj) akzxVarM.b;
                    if ((apfjVar44.b & 1048576) != 0) {
                        defpackage.apfi apfiVar2 = apfjVar44.v;
                        if (apfiVar2 == null) {
                            apfiVar2 = defpackage.apfi.a;
                        }
                        defpackage.apfi apfiVarB2 = defpackage.aesg.b(apfiVar2, jCF);
                        akzxVarM.u();
                        defpackage.apfj apfjVar45 = (defpackage.apfj) akzxVarM.b;
                        j$.util.Objects.requireNonNull(apfiVarB2);
                        apfjVar45.v = apfiVarB2;
                        apfjVar45.b |= 1048576;
                    }
                    defpackage.apfj apfjVar46 = (defpackage.apfj) akzxVarM.b;
                    if ((apfjVar46.b & 4) != 0) {
                        long j23 = apfjVar46.e - jCF;
                        akzxVarM.u();
                        defpackage.apfj apfjVar47 = (defpackage.apfj) akzxVarM.b;
                        apfjVar47.b |= 4;
                        apfjVar47.e = j23;
                    }
                    defpackage.apfj apfjVar48 = (defpackage.apfj) akzxVarM.b;
                    if ((apfjVar48.b & 2) != 0) {
                        long j24 = apfjVar48.d - jCF;
                        akzxVarM.u();
                        defpackage.apfj apfjVar49 = (defpackage.apfj) akzxVarM.b;
                        apfjVar49.b |= 2;
                        apfjVar49.d = j24;
                    }
                }
                defpackage.aenj aenjVar2 = aeudVar.m;
                if (this.e.getAndSet(true)) {
                    defpackage.ajcq ajcqVar = defpackage.ajcm.a;
                } else {
                    defpackage.aeue aeueVar = (defpackage.aeue) this.b.a();
                    defpackage.aiql.E(new defpackage.vto(aeueVar, akzxVarM, defpackage.aenj.d(aenjVar2), 10), aeueVar.c);
                }
            }
        }
    }

    @Override // defpackage.aeqv
    public final void n() {
        this.a.a(this);
    }

    @Override // defpackage.aepj
    public final /* synthetic */ void j(defpackage.aenj aenjVar) {
    }
}
