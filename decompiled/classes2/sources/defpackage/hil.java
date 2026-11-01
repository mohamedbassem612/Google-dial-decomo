package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hil implements amyz {
    public final defpackage.him a;
    private final int b;

    public hil(defpackage.him himVar, int i) {
        this.a = himVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v263, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v46, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v49, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v52, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12, types: [aoin, java.lang.Object] */
    private final java.lang.Object b() {
        abqj ahqmVar;
        abrn abrdVar;
        aevo aescVar;
        int i = this.b;
        ahcc ahccVar = null;
        switch (i) {
            case 0:
                defpackage.him himVar = this.a;
                return achn.s((ahqj) himVar.E.a(), himVar.nQ(), aikn.a);
            case 1:
                defpackage.him himVar2 = this.a;
                java.lang.Object objA = himVar2.k.a();
                amyz amyzVar = himVar2.r;
                amyz amyzVar2 = himVar2.AW;
                ahnt ahntVar = ahnt.a;
                if (ahntVar == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                aigf aigfVar = aikj.b;
                ahqmVar = new ahqm((ahoh) objA, amyzVar, amyzVar2, ahntVar, aigfVar, aigfVar);
                return ahqmVar;
            case 2:
                return new ahoh((java.util.concurrent.ExecutorService) this.a.j.a());
            case 3:
                defpackage.him himVar3 = this.a;
                ahqmVar = new abqj(himVar3.fJ(), himVar3.i);
                return ahqmVar;
            case 4:
                defpackage.him himVar4 = this.a;
                return new abqi(aiql.r(new abpz(java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), (java.util.concurrent.ThreadFactory) new ahys(new abrg((defpackage.abrj) himVar4.ee().a.a, (abrn) himVar4.g.a(), agab.cA("Blocking", new abqo(new abqo((java.util.concurrent.ThreadFactory) himVar4.c.a(), 0), 1)))).a)), (ajcu) himVar4.d.a());
            case 5:
                return new abrr(11);
            case 6:
                abpy abpyVar = new abpy(agab.cA("Scheduler", new abpw()));
                abpyVar.setRemoveOnCancelPolicy(true);
                ajcu ajcuVarS = aiql.s(abpyVar);
                if (ajcuVarS == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return ajcuVarS;
            case 7:
                return new java.util.HashSet();
            case 8:
                aikj aikjVarK = aigf.k(new defpackage.abrc(java.util.concurrent.TimeUnit.MINUTES), this.a.f);
                int i2 = aikjVarK.d;
                if (i2 == 0) {
                    abrdVar = new abrd();
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalArgumentException("More than 1 ThreadMonitoringConfiguration");
                    }
                    abrdVar = (abrn) ahvr.aZ(aikjVarK.f().k());
                }
                abrn abrnVar = abrdVar;
                abrnVar.d();
                abrnVar.d();
                abrnVar.d();
                abrnVar.e();
                abrnVar.e();
                abrnVar.a();
                abrnVar.a();
                abrnVar.a();
                abrnVar.b();
                abrnVar.b();
                abrnVar.c();
                abrnVar.c();
                abrnVar.c();
                abrnVar.f();
                abrnVar.f();
                if (abrnVar == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return abrnVar;
            case 9:
                throw new java.lang.AssertionError("This function body will never execute");
            case 10:
                java.lang.Boolean.TRUE.booleanValue();
                return ahyn.h(java.lang.Boolean.TRUE);
            case 11:
                return new aazc((byte[]) null);
            case 12:
                defpackage.him himVar5 = this.a;
                ahqmVar = new abqj(himVar5.fK(), himVar5.i);
                return ahqmVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.him himVar6 = this.a;
                java.util.concurrent.ThreadFactory threadFactory = (java.util.concurrent.ThreadFactory) himVar6.m.a();
                ajcu ajcuVar = (ajcu) himVar6.d.a();
                int iMax = java.lang.Math.max(2, java.lang.Runtime.getRuntime().availableProcessors() - 2);
                java.lang.Object objGJ = himVar6.gJ();
                abri abriVarEe = himVar6.ee();
                adae adaeVar = (adae) himVar6.o.a();
                abrn abrnVarEf = himVar6.ef();
                java.lang.Boolean.FALSE.booleanValue();
                absg absgVar = new absg("Lite", iMax, false, absi.a);
                return new abqi(aiql.r(agab.cz(absgVar, abriVarEe, ((adae) objGJ).D(agab.cA(absgVar.a, new abqo(threadFactory, 0))), agab.cD(adaeVar, absgVar), abrnVarEf)), ajcuVar);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return new abrr(0);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return new adae((byte[]) null);
            case 16:
                throw new java.lang.AssertionError("This function body will never execute");
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                defpackage.him himVar7 = this.a;
                aihb aihbVarI = aihd.i(4);
                defpackage.him himVar8 = himVar7.b;
                aooc.ap((agab) himVar8.ap.a());
                aikn aiknVar = aikn.a;
                aooc.ap(aiknVar);
                aihbVarI.k(aiknVar);
                aihbVarI.i(himVar8.AV.a());
                aihbVarI.i(new zjw((zjv) himVar8.cf.a()));
                aihbVarI.i(himVar8.gv());
                return aihbVarI.h();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                defpackage.him himVar9 = this.a;
                gou gouVar = (gou) himVar9.ae.a();
                amwu amwuVarB = amyu.b(himVar9.af);
                ahyn.h(defpackage.him.iM());
                aescVar = new aesc(gouVar, amwuVarB, (java.util.concurrent.Executor) himVar9.U.a(), himVar9.ai);
                return aescVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                defpackage.him himVar10 = this.a;
                return new gou(himVar10.w, himVar10.H, himVar10.I, himVar10.ad, himVar10.x);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_RIGHT /* 20 */:
                return new aeqs(amyu.b(this.a.v));
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_LEFT /* 21 */:
                return new aile((ahex) this.a.u.a());
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_RIGHT /* 22 */:
                defpackage.him himVar11 = this.a;
                aescVar = new ahex((android.content.Context) himVar11.s.a(), ahyn.h((java.lang.Boolean) himVar11.t.a()), (aevz) himVar11.gl(), new com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter());
                return aescVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_LEFT /* 23 */:
                return this.a.Tx.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return java.lang.Boolean.valueOf(ania.a.b().f((android.content.Context) this.a.s.a()));
            case androidx.car.app.navigation.model.Maneuver.TYPE_FORK_LEFT /* 25 */:
                defpackage.him himVar12 = this.a;
                return new aeqx((android.content.Context) himVar12.s.a(), (ahyn) himVar12.x.a(), (java.lang.String) himVar12.z.a(), himVar12.A, himVar12.B, himVar12.ny(), ahyn.h((adai) himVar12.D.a()), ahyn.h(himVar12.rS()), ahyn.h((aprf) himVar12.G.a()));
            case androidx.car.app.navigation.model.Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ahwt.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((ahcc) this.a.y.a()).b;
            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                android.content.Context context = (android.content.Context) this.a.s.a();
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                java.lang.String packageName = context.getPackageName();
                try {
                    android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                    return new ahcc(packageInfo.versionName, packageInfo.versionCode);
                } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                    aenr.a.d().k(e).l("com/google/android/libraries/performance/primes/metrics/core/PrimesCoreMetricDaggerModule", "provideVersionNameAndCode", 92, "PrimesCoreMetricDaggerModule.java").y("Failed to get PackageInfo for: %s", packageName);
                    ahccVar = new ahcc((java.lang.Object) null, 0);
                    return ahccVar;
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                return java.lang.Boolean.valueOf(anim.a.b().f((android.content.Context) this.a.s.a()));
            case 30:
                return java.lang.Boolean.valueOf(anis.a.b().c((android.content.Context) this.a.s.a()));
            case 31:
                return java.lang.Boolean.valueOf(anis.a.b().b((android.content.Context) this.a.s.a()));
            case 32:
                return new adai((byte[]) null);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                acoo acooVar = (acoo) this.a.F.a();
                j$.util.Objects.requireNonNull(acooVar);
                return new aprf(acooVar);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                return new acoo();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                return new aent();
            case androidx.car.app.navigation.model.Maneuver.TYPE_STRAIGHT /* 36 */:
                defpackage.him himVar13 = this.a;
                return new ahbz(himVar13.s, himVar13.U, himVar13.Z, himVar13.aa, himVar13.ab, himVar13.ac);
            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                defpackage.him himVar14 = this.a;
                java.util.concurrent.Executor executor = ((aens) himVar14.M.a()).d ? (java.util.concurrent.Executor) himVar14.T.a() : (java.util.concurrent.Executor) himVar14.N.a();
                if (executor == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return executor;
            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                defpackage.him himVar15 = this.a;
                return new aeni((ajcu) himVar15.N.a(), (tvn) himVar15.R.a(), himVar15.S);
            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                aens aensVar = (aens) this.a.M.a();
                ajcu ajcuVarS2 = aensVar.a;
                if (ajcuVarS2 == null) {
                    int i3 = aensVar.c;
                    java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(i3, new aenq(aensVar.b), new defpackage.aenp());
                    scheduledThreadPoolExecutor.setMaximumPoolSize(i3);
                    ajcuVarS2 = aiql.s(scheduledThreadPoolExecutor);
                }
                if (ajcuVarS2 == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return ajcuVarS2;
            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                ajcu ajcuVar2 = (ajcu) this.a.L.a();
                aesw aeswVarA = aens.a();
                java.lang.Boolean.TRUE.booleanValue();
                aeswVarA.c();
                aeswVarA.e = new abqi(new abqp(new ajdc(ajcuVar2), ajcuVar2), ajcuVar2);
                ahys ahysVarH = ahyn.h(aeswVarA.b());
                aens.a().b();
                return (aens) ahysVarH.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                defpackage.him himVar16 = this.a;
                ajcu ajcuVar3 = (ajcu) himVar16.K.a();
                if (ajcuVar3 == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                ahqmVar = new abqj(ajcuVar3, himVar16.i);
                return ahqmVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                defpackage.him himVar17 = this.a;
                java.util.concurrent.ThreadFactory threadFactory2 = (java.util.concurrent.ThreadFactory) himVar17.J.a();
                ajcu ajcuVar4 = (ajcu) himVar17.d.a();
                java.lang.Integer num = 4;
                num.getClass();
                absi absiVar = absi.a;
                java.lang.Object objGJ2 = himVar17.gJ();
                abri abriVarEe2 = himVar17.ee();
                adae adaeVar2 = (adae) himVar17.o.a();
                abrn abrnVar2 = (abrn) himVar17.g.a();
                java.lang.Boolean.FALSE.booleanValue();
                absg absgVar2 = new absg("BG", 4, false, absiVar);
                return new abqi(aiql.r(agab.cz(absgVar2, abriVarEe2, new abqb((adae) objGJ2, agab.cA(absgVar2.a, new abqo(threadFactory2, 0)), new android.os.StrictMode.ThreadPolicy.Builder()), agab.cD(adaeVar2, absgVar2), abrnVar2)), ajcuVar4);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                return new abrr(10);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                defpackage.him himVar18 = this.a;
                ahqmVar = new tvn((android.content.Context) himVar18.s.a(), (aepr) himVar18.Q.a());
                return ahqmVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                return new aepr((aepq) this.a.P.a());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                return new aepq((aeqs) this.a.O.a());
            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                return new aeqs((android.content.Context) this.a.s.a());
            case 48:
                defpackage.him himVar19 = this.a;
                ahwt ahwtVar = ahwt.a;
                java.util.Random random = (java.util.Random) himVar19.W.a();
                aeuy aeuyVar = (aeuy) himVar19.X.a();
                aizr aizrVar = (aizr) himVar19.Y.a();
                ahwtVar.d(random);
                aescVar = new aevo(random, aeuyVar, aizrVar);
                return aescVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return new java.util.Random(android.os.SystemClock.elapsedRealtime());
            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                return (aazc) ahyn.h((aazc) this.a.l.a()).a;
            case 51:
                defpackage.him himVar20 = this.a;
                ahwt ahwtVar2 = ahwt.a;
                java.util.Random random2 = (java.util.Random) himVar20.W.a();
                ahwtVar2.d(random2);
                ahqmVar = new aeuy(random2);
                return ahqmVar;
            case 52:
                return new aeva();
            case 53:
                return java.lang.Boolean.TRUE;
            case 54:
                defpackage.him himVar21 = this.a;
                return new ahbm((ahyn) himVar21.ab.b);
            case 55:
                aery aeryVarBu = agab.bu(ahwt.a, new kuq(18));
                aooc.ap(aeryVarBu);
                return aeryVarBu;
            case 56:
                return new adao((tvn) this.a.R.a());
            case 57:
                return new android.os.Handler((android.os.Looper) ahyn.h((android.os.Looper) this.a.ag.a()).a);
            case 58:
                defpackage.him himVar22 = this.a;
                java.lang.Object objGJ3 = himVar22.gJ();
                java.util.concurrent.ThreadFactory threadFactory3 = (java.util.concurrent.ThreadFactory) himVar22.m.a();
                ajdd ajddVar = new ajdd();
                ((adae) objGJ3).D(agab.cA("Lite", new abqo(threadFactory3, 0))).newThread(new abpx(ajddVar)).start();
                try {
                    android.os.Looper looper = (android.os.Looper) a.h(ajddVar);
                    if (looper == null) {
                        throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                    }
                    return looper;
                } catch (java.util.concurrent.ExecutionException e2) {
                    throw new java.lang.RuntimeException(e2);
                }
            case 59:
                return aihd.o(this.a.hm());
            case 60:
                defpackage.him himVar23 = this.a;
                java.util.concurrent.Executor executor2 = (java.util.concurrent.Executor) himVar23.U.a();
                aeof aeofVar = new aeof();
                aeog aeogVar = new aeog(amyu.b(himVar23.aj));
                aihd aihdVarS = aihd.s(aeofVar, aeogVar, new aeoj(himVar23.z, himVar23.ak, himVar23.al));
                java.lang.Object objGs = himVar23.gs();
                return new aeod(executor2, aihdVarS, (aevd) objGs);
            case 61:
                aert aertVarBu = agab.bu(ahwt.a, new kuq(19));
                aooc.ap(aertVarBu);
                return aertVarBu;
            case 62:
                return java.lang.Integer.valueOf(((ahcc) this.a.y.a()).a);
            case 63:
                android.content.Context context2 = (android.content.Context) this.a.s.a();
                int i4 = aaby.c;
                return java.lang.Integer.valueOf(aacn.a(context2));
            case androidx.car.app.hardware.common.CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                defpackage.him himVar24 = this.a;
                ahyn.h((aeod) himVar24.am.a());
                return new aesg((char[]) null);
            case 65:
                return java.lang.Boolean.valueOf(anhr.a.b().i((android.content.Context) this.a.s.a()));
            case 66:
                return new agab();
            case 67:
                defpackage.him himVar25 = this.a;
                amyz amyzVar3 = himVar25.AU;
                ajxm ajxmVar = (ajxm) himVar25.eG.a();
                amyzVar3.getClass();
                ((ahvr) ajxmVar.f.a()).getClass();
                ahyn ahynVar = (ahyn) ajxmVar.c.a();
                ahynVar.getClass();
                ?? r6 = ajxmVar.d;
                ?? r5 = ajxmVar.a;
                java.lang.Object obj = ajxmVar.e;
                return new ahss(amyzVar3, (aoin) ajxmVar.b, ahynVar, (aoin) r5, (aoin) r6);
            case 68:
                return ahyn.h((aeuu) this.a.dQ.a());
            case 69:
                defpackage.him himVar26 = this.a;
                amyz amyzVar4 = himVar26.AS;
                amyz amyzVar5 = himVar26.AT;
                aeus aeusVarD = aeuu.d();
                aeusVarD.c = true == ((java.lang.Boolean) amyzVar4.a()).booleanValue() ? 3 : 2;
                aeusVarD.d = new aeut(((java.lang.Double) amyzVar5.a()).floatValue());
                return aeusVarD.a();
            case 70:
                return java.lang.Boolean.valueOf(((apnt) this.a.rL().a.a()).b("com.google.android.dialer", "PrimesMetrics__enable_tiktok_tracing_primes_integration").e());
            case 71:
                ahbq ahbqVar = (ahbq) this.a.AJ.a();
                if (ahbqVar == null) {
                    aooh.i("state");
                }
                return new apnt(ahbqVar, (byte[]) null);
            case 72:
                defpackage.him himVar27 = this.a;
                rai raiVar = (rai) himVar27.bA.a();
                ahbt ahbtVar = (ahbt) himVar27.bD.a();
                ajwr ajwrVar = (ajwr) himVar27.bE.a();
                ajct ajctVar = (ajct) himVar27.as.a();
                ahbz ahbzVar = (ahbz) himVar27.AG.a();
                aigf aigfVarFm = himVar27.fm();
                aikn aiknVar2 = aikn.a;
                zzx zzxVarPk = himVar27.pk();
                if (raiVar == null) {
                    aooh.i("factory");
                }
                if (ahbtVar == null) {
                    aooh.i("deviceCommitterFactory");
                }
                if (ajwrVar == null) {
                    aooh.i("pathFactory");
                }
                if (ajctVar == null) {
                    aooh.i("blockingExecutor");
                }
                if (ahbzVar == null) {
                    aooh.i("updater");
                }
                if (aiknVar2 == null) {
                    aooh.i("flagRecorders");
                }
                return raiVar.o(ahav.a, new nxi(zzxVarPk, ajwrVar, 7), ajctVar, aigfVarFm, ahbu.a, new dsm(ahbtVar, 9, (short[][]) null), new afgz(ahbzVar, 11), new abnb(15), aiknVar2);
            case 73:
                return new rai(this, (char[]) null, (char[]) null);
            case 74:
                return new rai(this, (short[]) null);
            case 75:
                defpackage.him himVar28 = this.a;
                try {
                    android.content.pm.PackageInfo packageInfo2 = ((android.content.pm.PackageManager) himVar28.aq.a()).getPackageInfo(((android.content.Context) himVar28.s.a()).getPackageName(), 0);
                    if (packageInfo2 == null) {
                        throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                    }
                    return packageInfo2;
                } catch (android.content.pm.PackageManager.NameNotFoundException e3) {
                    throw new java.lang.IllegalStateException("Can't find our own package", e3);
                }
            case 76:
                android.content.pm.PackageManager packageManager2 = ((android.content.Context) this.a.s.a()).getPackageManager();
                if (packageManager2 == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return packageManager2;
            case 77:
                defpackage.him himVar29 = this.a;
                ahqmVar = new abqj(himVar29.fJ(), himVar29.i);
                return ahqmVar;
            case 78:
                defpackage.him himVar30 = this.a;
                aikj aikjVarGX = himVar30.gX();
                apnt apntVar = (apnt) himVar30.aG.a();
                if (apntVar == null) {
                    aooh.i("subpackager");
                }
                aikj aikjVar = aikjVarGX;
                int i5 = aikjVar.d;
                ahvr.bC(i5, "expectedSize");
                aihb aihbVar = new aihb(i5, true);
                ailj ailjVarK = aikjVar.f().k();
                while (ailjVarK.hasNext()) {
                    java.lang.String str = (java.lang.String) ailjVarK.next();
                    aihbVar.i(str);
                    aihbVar.i(apntVar.c(str));
                }
                aihd aihdVarH = aihbVar.h();
                aooh.e(aihdVarH, "build(...)");
                if (aihdVarH == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return aihdVarH;
            case 79:
                throw new java.lang.RuntimeException();
            case androidx.car.app.hardware.common.CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                throw new java.lang.RuntimeException();
            case 81:
                throw new java.lang.RuntimeException();
            case 82:
                throw new java.lang.RuntimeException();
            case 83:
                throw new java.lang.RuntimeException();
            case 84:
                java.util.Map map = (java.util.Map) this.a.aF.a();
                if (map == null) {
                    aooh.i("subpackagerMap");
                }
                return new apnt(map, (byte[]) null);
            case 85:
                defpackage.him himVar31 = this.a;
                aikj aikjVarFz = himVar31.fz();
                aigf aigfVarFB = himVar31.fB();
                aigb aigbVar = new aigb(4);
                ailj ailjVarK2 = aikjVarFz.f().k();
                while (ailjVarK2.hasNext()) {
                    java.lang.String str2 = (java.lang.String) ailjVarK2.next();
                    java.lang.String str3 = (java.lang.String) aigfVarFB.get(str2);
                    if (str3 != null) {
                        java.lang.String strBE = a.bE(str3, (byte) 35, str2);
                        aigbVar.i(str2, strBE);
                        aigbVar.i(strBE, strBE);
                    } else {
                        aigbVar.i(str2, str2);
                    }
                }
                return aigbVar.e(true);
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
                return ahav.a;
            case 93:
                android.content.Context context3 = (android.content.Context) this.a.s.a();
                if (context3 == null) {
                    aooh.i("context");
                }
                java.util.List listAsList = java.util.Arrays.asList(new afeh(new ajxw(context3)), new afel());
                aooh.e(listAsList, "asList(...)");
                return new aogc(listAsList);
            case 94:
                android.content.Context context4 = (android.content.Context) this.a.s.a();
                aooh.f(context4, "context");
                try {
                    return context4.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    return ahccVar;
                }
            case 95:
                defpackage.him himVar32 = this.a;
                android.content.Context context5 = (android.content.Context) himVar32.s.a();
                amwu amwuVarB2 = amyu.b(himVar32.as);
                amyz amyzVar6 = himVar32.aL;
                amyz amyzVar7 = himVar32.bp;
                amyz amyzVar8 = himVar32.bq;
                java.util.concurrent.atomic.AtomicReference atomicReference = aewq.a;
                ajje ajjeVar = new ajje((char[]) null);
                ajjeVar.d = context5;
                j$.util.Objects.requireNonNull(amwuVarB2);
                ajjeVar.f = new aeex(amwuVarB2, 13);
                j$.util.Objects.requireNonNull(amyzVar6);
                ajjeVar.c = new jvu(ajjeVar, new aeex(amyzVar6, 14), 10);
                j$.util.Objects.requireNonNull(amyzVar7);
                ajjeVar.b = new aeex(amyzVar7, 14);
                j$.util.Objects.requireNonNull(amyzVar8);
                ajjeVar.e = new aeex(amyzVar8, 15);
                return ajjeVar.g();
            case androidx.car.app.hardware.common.CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                return ahyn.h((aexi) this.a.aK.a());
            case 97:
                android.content.Context context6 = (android.content.Context) this.a.s.a();
                acxg acxgVar = aasr.a;
                return new aexl(new aata(context6));
            case 98:
                return ahyn.h((ahde) this.a.bo.a());
            case 99:
                defpackage.him himVar33 = this.a;
                return new ahde((android.content.Context) himVar33.s.a(), (agsm) himVar33.aT.a(), (aazc) himVar33.l.a(), (aoss) himVar33.aV.a(), (ajcu) himVar33.L.a(), j$.util.Optional.empty(), himVar33.aW, himVar33.aX, aikj.b, j$.util.Optional.empty(), himVar33.aY, himVar33.ba, himVar33.bb, himVar33.bc, (rai) himVar33.bd.a(), new ahco((android.content.Context) himVar33.s.a(), himVar33.aY, himVar33.ba, amyu.b(himVar33.bm)), new ahdl((aazc) himVar33.l.a(), (aolr) himVar33.bg.a(), j$.util.Optional.empty(), (aolr) himVar33.bn.a(), amyu.b(himVar33.bm)));
            default:
                throw new java.lang.AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [ahlx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v195, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v205, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v212, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v219, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v226, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v233, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v241, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v249, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v298, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v314, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v322, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v330, types: [aoin, java.lang.Object] */
    private final java.lang.Object c() {
        ahbz agsmVar;
        ahbz adagVar;
        java.lang.Object obj;
        int i = this.b;
        boolean z = false;
        switch (i) {
            case 100:
                defpackage.him himVar = this.a;
                agsmVar = new agsm((android.content.Context) himVar.s.a(), himVar.k(), (agsn) himVar.aM.a(), (ajcu) himVar.aN.a(), aigf.k("main_process_service_key", himVar.aO), himVar.hi(), (aogc) himVar.aS.a(), himVar.eQ(), (ajcu) himVar.L.a(), (ajcu) himVar.as.a(), himVar.oC());
                return agsmVar;
            case androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                agsmVar = new agsn((android.content.Context) this.a.s.a());
                return agsmVar;
            case 102:
                agsmVar = new abqx(new android.os.Handler(android.os.Looper.getMainLooper()));
                return agsmVar;
            case 103:
                return com.google.apps.tiktok.concurrent.AndroidFuturesService.class;
            case 104:
                return com.google.apps.tiktok.concurrent.InternalForegroundService.class;
            case 105:
                agsmVar = new aogc((rai) this.a.aR.a());
                return agsmVar;
            case 106:
                agsmVar = new rai(this, (byte[]) null, (byte[]) null);
                return agsmVar;
            case 107:
                return new agsp();
            case 108:
                aolr aolrVar = (aolr) this.a.aU.a();
                if (aolrVar == null) {
                    aooh.i("unconfinedContext");
                }
                agsmVar = new apbj(aolrVar, 1, (byte[]) null);
                return agsmVar;
            case 109:
                aolr aolrVarPlus = new agwd((ajcu) this.a.d.a()).plus(agvw.a).plus(ahre.b((ahpn) null, 3));
                obj = aolrVarPlus;
                if (aolrVarPlus == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return obj;
            case 110:
                aooh.f((android.content.Context) this.a.s.a(), "applicationContext");
                return agab.ap();
            case 111:
                return j$.util.Optional.of(java.lang.Boolean.valueOf(this.a.is()));
            case 112:
                return j$.util.Optional.of(java.lang.Boolean.valueOf(this.a.it()));
            case 113:
                agsmVar = new rai(this, (char[]) null);
                return agsmVar;
            case 114:
                defpackage.him himVar2 = this.a;
                agsmVar = new ahea((apdi) himVar2.bf.a(), (aolr) himVar2.bg.a(), (android.content.Context) himVar2.s.a(), (aazc) himVar2.l.a(), himVar2.bh, himVar2.bi, himVar2.bj, j$.util.Optional.of((ahid) himVar2.bl.a()));
                return agsmVar;
            case 115:
                defpackage.him himVar3 = this.a;
                android.app.Application application = (android.app.Application) himVar3.be.a();
                java.util.concurrent.ScheduledExecutorService scheduledExecutorService = (java.util.concurrent.ScheduledExecutorService) himVar3.L.a();
                zzd zzdVar = new zzd(application, "STREAMZ_TIKTOK", (java.lang.String) null);
                ((zyx) zzdVar).k = 3;
                return new apdi(scheduledExecutorService, new ajxw(zzdVar, "STREAMZ_TIKTOK"), application);
            case 116:
                android.app.Application applicationAA = anty.aA((android.content.Context) this.a.Tx.a);
                aooc.ap(applicationAA);
                return applicationAA;
            case 117:
                defpackage.him himVar4 = this.a;
                zzx zzxVarPv = himVar4.pv();
                ajcu ajcuVar = (ajcu) himVar4.L.a();
                if (ajcuVar == null) {
                    aooh.i("backgroundExecutor");
                }
                aolr aolrVarV = zzxVarPv.v(ajcuVar);
                obj = aolrVarV;
                if (aolrVarV == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return obj;
            case 118:
                android.content.Context context = (android.content.Context) this.a.s.a();
                aooh.f(context, "context");
                j$.nio.file.Path path = j$.io.FileRetargetClass.toPath(context.getFilesDir());
                aooh.e(path, "toPath(...)");
                j$.nio.file.Path pathResolve = path.resolve("reaper_wal_files");
                aooh.e(pathResolve, "resolve(...)");
                aooc.ap(pathResolve);
                return pathResolve;
            case 119:
                j$.nio.file.Path path2 = (j$.nio.file.Path) this.a.bh.a();
                aooh.f(path2, "walDir");
                j$.nio.file.Path pathResolve2 = path2.resolve("done");
                aooh.e(pathResolve2, "resolve(...)");
                aooc.ap(pathResolve2);
                return pathResolve2;
            case 120:
                j$.util.Optional optionalOf = j$.util.Optional.of(java.lang.Boolean.valueOf(this.a.iu()));
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                j$.util.Optional optionalOf2 = j$.util.Optional.of(bool);
                j$.util.Optional optionalOf3 = j$.util.Optional.of(bool);
                aooh.f(optionalOf, "experimentEnabled");
                aooh.f(optionalOf2, "loggerInstalled");
                aooh.f(optionalOf3, "syncletInstalled");
                java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                if (((java.lang.Boolean) aooh.p(optionalOf2, bool2)).booleanValue() && ((java.lang.Boolean) aooh.p(optionalOf3, bool2)).booleanValue() && ((java.lang.Boolean) aooh.p(optionalOf, bool2)).booleanValue()) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 121:
                agsmVar = new ahid((abce) this.a.bk.a());
                return agsmVar;
            case 122:
                return aavl.a((android.content.Context) this.a.s.a());
            case 123:
                defpackage.him himVar5 = this.a;
                zzx zzxVarPv2 = himVar5.pv();
                ajcu ajcuVar2 = (ajcu) himVar5.aN.a();
                if (ajcuVar2 == null) {
                    aooh.i("uiThreadExecutor");
                }
                aolr aolrVarV2 = zzxVarPv2.v(ajcuVar2);
                obj = aolrVarV2;
                if (aolrVarV2 == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return obj;
            case 124:
                android.content.Context context2 = (android.content.Context) this.a.s.a();
                abyl.g();
                agsmVar = new aogc(aify.q(new afeh(new ajxw(context2)), new afel()));
                return agsmVar;
            case 125:
                return new zzx((short[]) null);
            case 126:
                defpackage.him himVar6 = this.a;
                agsmVar = new ajxm((ajct) himVar6.as.a(), himVar6.bt, himVar6.jw(), (zzx) himVar6.bs.a(), (aewq) himVar6.br.a());
                return agsmVar;
            case 127:
                return j$.util.Optional.of((ahde) this.a.bo.a());
            case 128:
                defpackage.him himVar7 = this.a;
                aikj aikjVarFz = himVar7.fz();
                int i2 = aikjVarFz.d;
                aigf aigfVarFB = himVar7.fB();
                ahvr.bC(i2, "expectedSize");
                aigb aigbVar = new aigb(i2);
                ailj ailjVarK = aikjVarFz.e().k();
                while (ailjVarK.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) ailjVarK.next();
                    java.lang.String str = (java.lang.String) entry.getKey();
                    ahav ahavVar = (ahav) entry.getValue();
                    java.lang.String str2 = (java.lang.String) aigfVarFB.get(str);
                    if (str2 != null) {
                        aigbVar.i(a.bE(str2, (byte) 35, str), ahavVar);
                    } else {
                        aigbVar.i(str, ahavVar);
                    }
                }
                return aigbVar.e(true);
            case 129:
                return aewm.a((android.content.Context) this.a.s.a());
            case 130:
                defpackage.him himVar8 = this.a;
                aikj aikjVar = aikj.b;
                aigf aigfVarFB2 = himVar8.fB();
                java.util.Map map = (java.util.Map) himVar8.bx.a();
                if (map == null) {
                    aooh.i("allSubpackaged");
                }
                aigb aigbVar2 = new aigb(4);
                aikj aikjVar2 = aikjVar;
                ailj ailjVarK2 = aikjVar2.e().k();
                while (ailjVarK2.hasNext()) {
                    java.util.Map.Entry entry2 = (java.util.Map.Entry) ailjVarK2.next();
                    aigbVar2.i(agab.aM(aigfVarFB2, (ahcg) entry2.getKey()), new adbi((aoin) entry2.getValue(), 12));
                }
                ailj ailjVarK3 = aikjVar2.e().k();
                while (ailjVarK3.hasNext()) {
                    java.util.Map.Entry entry3 = (java.util.Map.Entry) ailjVarK3.next();
                    aigbVar2.i(agab.aM(aigfVarFB2, (ahcg) entry3.getKey()), new adbi((aoin) entry3.getValue(), 13));
                }
                agsmVar = aigbVar2.e(true);
                aikj aikjVar3 = (aikj) agsmVar;
                if (!map.keySet().containsAll(aikjVar3.f())) {
                    throw new java.lang.IllegalStateException("Parameters provided for mendel package not in use. Known packages: " + map.keySet() + ", params provided: " + aikjVar3.f());
                }
                return agsmVar;
            case 131:
                agsmVar = new defpackage.hik(this);
                return agsmVar;
            case 132:
                defpackage.him himVar9 = this.a;
                agsmVar = new ahbz(himVar9.aK, himVar9.bB, (ajct) himVar9.L.a(), (aewq) himVar9.br.a(), himVar9.pk());
                return agsmVar;
            case 133:
                return this.a.fA();
            case 134:
                agsmVar = new ajwr((android.content.Context) this.a.s.a());
                return agsmVar;
            case 135:
                defpackage.him himVar10 = this.a;
                agsmVar = new ahbz(j$.util.Optional.of(himVar10.pW()), (apnt) himVar10.aG.a(), himVar10.AK, himVar10.fz(), (java.util.Map) himVar10.bx.a(), j$.util.Optional.empty());
                return agsmVar;
            case 136:
                defpackage.him himVar11 = this.a;
                adag adagVar2 = (adag) himVar11.bM.a();
                agov agovVarEK = himVar11.eK();
                himVar11.rX();
                amyz amyzVar = himVar11.AI;
                return new agop(adagVar2, agovVarEK, amyzVar);
            case 137:
                defpackage.him himVar12 = this.a;
                adagVar = new adag(himVar12.fV(), himVar12.fW());
                return adagVar;
            case 138:
                defpackage.him himVar13 = this.a;
                return himVar13.pX().t(himVar13.ff(), (aogc) himVar13.bq.a());
            case 139:
                defpackage.him himVar14 = this.a;
                adagVar = new agqe((adnp) himVar14.bG.a(), (java.util.concurrent.Executor) himVar14.bF.a(), 0);
                return adagVar;
            case 140:
                agsmVar = new adnp((java.util.concurrent.Executor) this.a.bF.a());
                return agsmVar;
            case 141:
                amyz amyzVar2 = this.a.L;
                java.lang.Boolean.FALSE.booleanValue();
                java.util.concurrent.Executor executor = (java.util.concurrent.Executor) amyzVar2.a();
                obj = executor;
                if (executor == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return obj;
            case 142:
                defpackage.him himVar15 = this.a;
                java.util.concurrent.Executor executor2 = (java.util.concurrent.Executor) himVar15.bH.a();
                ahkn ahknVarA = ahko.a();
                ahknVarA.a = "TikTokAccountStoreMigration";
                ahknVarA.c(agql.a);
                ahknVarA.d = executor2;
                return himVar15.pX().t(ahknVarA.a(), (aogc) himVar15.bq.a());
            case 143:
                return new aile(new aprf(this.a.ok()));
            case 144:
                return this.a.fC();
            case 145:
                if (this.a.oC().r()) {
                    z = true;
                } else {
                    java.lang.Boolean.FALSE.booleanValue();
                }
                return java.lang.Boolean.valueOf(z);
            case 146:
                defpackage.him himVar16 = this.a;
                agsmVar = new ahlt((android.content.Context) himVar16.s.a(), (ajcu) himVar16.L.a(), (ajct) himVar16.r.a(), himVar16.oC(), (agsm) himVar16.aT.a(), ahyn.h((adag) himVar16.bM.a()), ahyn.h(java.lang.Boolean.valueOf(himVar16.iv())), (ahlm) himVar16.bN.a(), himVar16.fl(), aikj.b, himVar16.hj(), himVar16.iH(), (ahlx) himVar16.gK());
                return agsmVar;
            case 147:
                defpackage.him himVar17 = this.a;
                android.content.Context context3 = (android.content.Context) himVar17.s.a();
                ajct ajctVar = (ajct) himVar17.L.a();
                adag adagVarOC = himVar17.oC();
                return new ahlm(context3, ajctVar, adagVarOC);
            case 148:
                amyz amyzVar3 = this.a.xa;
                aooh.f(amyzVar3, "synclet");
                wcx wcxVar = new wcx(amyzVar3, 19);
                ahkv ahkvVar = new ahkv();
                ahkvVar.c(6L, java.util.concurrent.TimeUnit.HOURS);
                ahkx ahkxVar = new ahkx();
                ahkxVar.a = ahkz.b;
                ahkvVar.b(ahkxVar.a());
                return agab.aB(ahkvVar.a(), wcxVar);
            case 149:
                defpackage.him himVar18 = this.a;
                agsmVar = new yti(himVar18.nX(), himVar18.dB(), (aoss) himVar18.cb.a(), himVar18.oq());
                return agsmVar;
            case 150:
                return this.a.fo();
            case 151:
                return java.lang.Boolean.valueOf(((apnt) this.a.qf().b.a()).b("com.google.android.dialer.directboot", "45819707").e());
            case 152:
                defpackage.him himVar19 = this.a;
                agsmVar = new kpa(himVar19.bP, himVar19.bQ, himVar19.bR, himVar19.bS);
                return agsmVar;
            case 153:
                java.lang.String strD = ((apnt) this.a.sh().a.a()).b("com.google.android.dialer.directboot", "45663965").d();
                aooc.ap(strD);
                return strD;
            case 154:
                return java.lang.Long.valueOf(((apnt) this.a.sh().a.a()).b("com.google.android.dialer.directboot", "45656815").b());
            case 155:
                return java.lang.Long.valueOf(((apnt) this.a.sh().a.a()).b("com.google.android.dialer.directboot", "45668028").b());
            case 156:
                return java.lang.Long.valueOf(((apnt) this.a.sh().a.a()).b("com.google.android.dialer.directboot", "45668029").b());
            case 157:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45629794").e());
            case 158:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45684179").e());
            case 159:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45799675").e());
            case 160:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45837532").e());
            case 161:
                defpackage.him himVar20 = this.a;
                agsmVar = new rln((zjs) himVar20.cn.a(), himVar20.be(), 5, (ruc) himVar20.eK.a(), himVar20.eL);
                return agsmVar;
            case 162:
                defpackage.him himVar21 = this.a;
                agsmVar = new zjs((aoss) himVar21.bZ.a(), (aoss) himVar21.cb.a(), (aolr) himVar21.bY.a(), (android.content.Context) himVar21.s.a(), (ajct) himVar21.as.a(), (zjv) himVar21.cf.a(), (mgu) himVar21.ch.a(), (android.telecom.TelecomManager) himVar21.ci.a(), himVar21.dT(), (zjp) himVar21.cl.a(), himVar21.cm);
                return agsmVar;
            case 163:
                aolr aolrVar2 = (aolr) this.a.bY.a();
                if (aolrVar2 == null) {
                    aooh.i("blockingContext");
                }
                agsmVar = new apbj(aolrVar2, 1, (byte[]) null);
                return agsmVar;
            case 164:
                defpackage.him himVar22 = this.a;
                zzx zzxVarPv3 = himVar22.pv();
                ajcu ajcuVar3 = (ajcu) himVar22.as.a();
                if (ajcuVar3 == null) {
                    aooh.i("blockingExecutor");
                }
                aolr aolrVarV3 = zzxVarPv3.v(ajcuVar3);
                obj = aolrVarV3;
                if (aolrVarV3 == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return obj;
            case 165:
                aolr aolrVar3 = (aolr) this.a.ca.a();
                if (aolrVar3 == null) {
                    aooh.i("lightweightContext");
                }
                agsmVar = new apbj(aolrVar3, 1, (byte[]) null);
                return agsmVar;
            case 166:
                defpackage.him himVar23 = this.a;
                zzx zzxVarPv4 = himVar23.pv();
                ajcu ajcuVar4 = (ajcu) himVar23.r.a();
                if (ajcuVar4 == null) {
                    aooh.i("lightweightExecutor");
                }
                aolr aolrVarV4 = zzxVarPv4.v(ajcuVar4);
                obj = aolrVarV4;
                if (aolrVarV4 == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return obj;
            case 167:
                zth zthVar = (zth) this.a.cd.a();
                if (zthVar == null) {
                    aooh.i("factory");
                }
                return zthVar.c((ainp) null);
            case 168:
                defpackage.him himVar24 = this.a;
                agsmVar = new zth(himVar24.cc, himVar24.cd, himVar24.r, himVar24.ce);
                return agsmVar;
            case 169:
                agsmVar = new mgw(j$.util.Optional.empty());
                return agsmVar;
            case 170:
                return new aais();
            case 171:
                defpackage.him himVar25 = this.a;
                return himVar25.qU().P((mgw) himVar25.cc.a(), j$.util.function.Function.-CC.identity());
            case 172:
                return java.lang.Boolean.valueOf(((apnt) this.a.sg().a.a()).b("com.google.android.dialershared.directboot", "45614579").e());
            case 173:
                android.telecom.TelecomManager telecomManager = (android.telecom.TelecomManager) ((android.content.Context) this.a.s.a()).getSystemService("telecom");
                obj = telecomManager;
                if (telecomManager == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return obj;
            case 174:
                defpackage.him himVar26 = this.a;
                agsmVar = new zjp((android.telecom.TelecomManager) himVar26.ci.a(), (android.content.Context) himVar26.s.a(), (ahpz) himVar26.bb.a(), himVar26.cj, himVar26.ck);
                return agsmVar;
            case 175:
                return java.lang.Boolean.valueOf(((apnt) this.a.rZ().a.a()).b("com.google.android.dialershared.directboot", "45787415").e());
            case 176:
                return java.lang.Boolean.valueOf(((apnt) this.a.rZ().a.a()).b("com.google.android.dialershared.directboot", "45813716").e());
            case 177:
                return java.lang.Boolean.valueOf(((apnt) this.a.rZ().a.a()).b("com.google.android.dialershared.directboot", "45645758").e());
            case 178:
                defpackage.him himVar27 = this.a;
                adagVar = new rug((aenl) himVar27.eJ.a(), (aeso) himVar27.ew.a());
                return adagVar;
            case 179:
                aenl aenlVar = (aenl) this.a.eI.a();
                aenl.c(aenlVar);
                obj = aenlVar;
                if (aenlVar == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return obj;
            case 180:
                defpackage.him himVar28 = this.a;
                return achn.n(himVar28.eH, himVar28.O);
            case 181:
                defpackage.him himVar29 = this.a;
                agsmVar = new aenn((aent) himVar29.I.a(), himVar29.eu, himVar29.dx, himVar29.ev, himVar29.en, himVar29.ex, himVar29.ey, himVar29.eA, himVar29.sO());
                return agsmVar;
            case 182:
                return this.a.fD();
            case 183:
                defpackage.him himVar30 = this.a;
                agsmVar = new aerx((gou) himVar30.ae.a(), (android.content.Context) himVar30.s.a(), (java.util.concurrent.Executor) himVar30.U.a(), (aerv) himVar30.fZ(), himVar30.cz, amyu.b(himVar30.aj), (aeod) himVar30.am.a(), (ahbz) himVar30.cI.a(), himVar30.cJ, himVar30.cK, himVar30.cL);
                return agsmVar;
            case 184:
                return java.lang.Boolean.valueOf(anig.a.b().a((android.content.Context) this.a.s.a()));
            case 185:
                return java.lang.Boolean.valueOf(anhr.a.b().h((android.content.Context) this.a.s.a()));
            case 186:
                return java.lang.Long.valueOf(anhr.a.b().c((android.content.Context) this.a.s.a()));
            case 187:
                return java.lang.Long.valueOf(anhr.a.b().d((android.content.Context) this.a.s.a()));
            case 188:
                return java.lang.Boolean.valueOf(anhr.a.b().k((android.content.Context) this.a.s.a()));
            case 189:
                return java.lang.Long.valueOf(anhr.a.b().a((android.content.Context) this.a.s.a()));
            case 190:
                return java.lang.Long.valueOf(anhr.a.b().b((android.content.Context) this.a.s.a()));
            case 191:
                return java.lang.Long.valueOf(anjn.a.b().d((android.content.Context) this.a.s.a()));
            case 192:
                return java.lang.Long.valueOf(anjn.a.b().b((android.content.Context) this.a.s.a()));
            case 193:
                return java.lang.Boolean.valueOf(anhr.a.b().j((android.content.Context) this.a.s.a()));
            case 194:
                return java.lang.Long.valueOf(anhr.a.b().e((android.content.Context) this.a.s.a()));
            case 195:
                java.lang.Object objEZ = new aeex((android.content.Context) this.a.s.a(), 4).eZ();
                obj = objEZ;
                if (objEZ == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return obj;
            case 196:
                defpackage.him himVar31 = this.a;
                adagVar = new ahbz((ahbz) himVar31.cE.a(), (ajcu) himVar31.N.a(), (java.util.Random) himVar31.W.a(), himVar31.cF, himVar31.cG, himVar31.cH);
                return adagVar;
            case 197:
                defpackage.him himVar32 = this.a;
                aeod aeodVar = (aeod) himVar32.am.a();
                ahyn ahynVarH = ahyn.h(himVar32.rS());
                agsmVar = new ahbz(aeodVar, ahynVarH, himVar32.cA, himVar32.cB, himVar32.cC, himVar32.cD);
                return agsmVar;
            case 198:
                return java.lang.Boolean.valueOf(anjn.a.b().k((android.content.Context) this.a.s.a()));
            case 199:
                return java.lang.Long.valueOf(anjn.a.b().c((android.content.Context) this.a.s.a()));
            default:
                throw new java.lang.AssertionError(i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Type inference failed for: r0v156, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v166, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v173, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v180, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v195, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v202, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v209, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v216, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v227, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v238, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v263, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v270, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v282, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v289, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v296, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v303, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v313, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v320, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v330, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v343, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v350, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v356, types: [aoin, java.lang.Object] */
    private final java.lang.Object d() throws aois {
        ahwt ahwtVar;
        adai aesgVar;
        int i = this.b;
        switch (i) {
            case 1000:
                android.content.Context context = (android.content.Context) this.a.s.a();
                int i2 = abzx.a;
                aooh.f(context, "context");
                try {
                    return ahyn.g(java.lang.Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                    hgb.b(abzw.a.d(), "Did not find own package, this should be impossible.", e);
                    ahwtVar = ahwt.a;
                    return ahwtVar;
                }
            case 1001:
                android.content.Context context2 = (android.content.Context) this.a.s.a();
                int i3 = abzx.a;
                aooh.f(context2, "context");
                try {
                    return ahyn.g(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName);
                } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                    hgb.b(abzw.a.d(), "Did not find own package, this should be impossible.", e2);
                    ahwtVar = ahwt.a;
                    return ahwtVar;
                }
            case 1002:
                android.content.Context context3 = (android.content.Context) this.a.s.a();
                acxg acxgVar = aatj.a;
                return new tvn(new abce(context3, (byte[]) null), (byte[]) null);
            case 1003:
                defpackage.him himVar = this.a;
                return new acjt((android.content.Context) himVar.s.a(), (wsk) himVar.sb.a(), (aolr) himVar.ca.a());
            case 1004:
                defpackage.him himVar2 = this.a;
                return new wsk((ahhp) himVar2.rU.a(), (adzn) himVar2.sa.a(), (aolr) himVar2.bY.a());
            case 1005:
                return new ahhp(new aeur((android.content.Context) this.a.s.a(), 3), new ahhs(), false);
            case 1006:
                defpackage.him himVar3 = this.a;
                return new adzp((aesg) himVar3.rV.a(), (aesg) himVar3.rX.a(), (ajct) himVar3.rY.a(), (vqf) himVar3.rZ.a());
            case 1007:
                defpackage.him himVar4 = this.a;
                aesgVar = new aesg((adym) himVar4.rE.a(), (aoss) himVar4.cb.a());
                return aesgVar;
            case 1008:
                return new aesg();
            case 1009:
                ahys ahysVarH = ahyn.h(this.a.as);
                int i4 = adxs.a;
                ajcu ajcuVar = (ajcu) ((aoin) ahysVarH.a).a();
                if (ajcuVar != null) {
                    return ajcuVar;
                }
                annk annkVar = new annk((byte[]) null, (byte[]) null, (byte[]) null);
                annkVar.o("gnp-blocking-thread-%d");
                aesgVar = new aduq(aiql.r(java.util.concurrent.Executors.newCachedThreadPool(annk.p(annkVar))), aiql.s(java.util.concurrent.Executors.newSingleThreadScheduledExecutor()));
                return aesgVar;
            case 1010:
                ahyj ahyjVar = akvx.a;
                return new vqf();
            case 1011:
                defpackage.him himVar5 = this.a;
                return new aclg((acgt) himVar5.se.a(), (ajct) himVar5.rY.a(), (java.lang.String) himVar5.sf.a(), (aazc) himVar5.l.a(), himVar5.eI(), (aoss) himVar5.cb.a(), (aolr) himVar5.ca.a());
            case 1012:
                defpackage.him himVar6 = this.a;
                aesgVar = new achh(amyu.b(himVar6.qL), himVar6.eI());
                return aesgVar;
            case 1013:
                return "ANDROID_DIALER";
            case 1014:
                defpackage.him himVar7 = this.a;
                return new aebs(ahyn.h((aegf) himVar7.rH.a()), ahyn.h(new oqc()), (aogc) himVar7.sh.a(), himVar7.sP(), himVar7.eC(), (adzw) himVar7.rc.a(), (aolr) himVar7.bg.a(), (adao) himVar7.rk.a(), amyu.b(himVar7.sj), (adzx) himVar7.sp.a(), (adzf) himVar7.sx.a(), (adzh) himVar7.st.a(), (adag) himVar7.sq.a(), amyu.b(himVar7.sr), (aazc) himVar7.l.a(), (aduu) himVar7.qJ.a(), himVar7.so, (adzq) himVar7.rb.a(), (android.content.Context) himVar7.s.a(), (aeey) himVar7.qK.a(), himVar7.nx(), himVar7.rK, himVar7.sv);
            case 1015:
                defpackage.him himVar8 = this.a;
                return new aogc(himVar8.sP(), (aolr) himVar8.bg.a());
            case 1016:
                defpackage.him himVar9 = this.a;
                amwu amwuVarB = amyu.b(himVar9.qY);
                aolr aolrVar = (aolr) himVar9.bY.a();
                aooh.f(amwuVarB, "registrationDataStore");
                aooh.f(aolrVar, "blockingContext");
                aesgVar = new adao(amwuVarB, aolrVar);
                return aesgVar;
            case 1017:
                defpackage.him himVar10 = this.a;
                return new aeam(himVar10.eD(), himVar10.sP(), (adao) himVar10.rk.a(), amyu.b(himVar10.sj), (aolr) himVar10.ca.a(), (aolr) himVar10.bg.a(), (aduu) himVar10.qJ.a(), (aeey) himVar10.qK.a(), (android.content.Context) himVar10.s.a(), (aazc) himVar10.l.a(), himVar10.nx(), himVar10.so);
            case 1018:
                defpackage.him himVar11 = this.a;
                return new adxo((android.content.Context) himVar11.s.a(), (tvn) himVar11.qV.a(), new aefw());
            case 1019:
                defpackage.him himVar12 = this.a;
                return new gat((aazc) himVar12.l.a(), (aduu) himVar12.qJ.a(), (adxz) himVar12.rd.a(), (aedq) himVar12.sm.a(), (aefe) himVar12.rL.a());
            case 1020:
                defpackage.him himVar13 = this.a;
                return new aeed((android.content.Context) himVar13.s.a(), (aduu) himVar13.qJ.a(), (adzq) himVar13.rb.a(), (aedp) himVar13.sl.a());
            case 1021:
                defpackage.him himVar14 = this.a;
                aduu aduuVar = (aduu) himVar14.qJ.a();
                ahyn.h(new oqc());
                return new aeec(aduuVar, (adao) himVar14.rk.a(), himVar14.rK);
            case 1022:
                java.lang.String strGW = this.a.gW();
                int i5 = adxy.a;
                java.lang.String host = new java.net.URL(strGW).getHost();
                aooh.e(host, "getHost(...)");
                aooc.ap(host);
                return host;
            case 1023:
                defpackage.him himVar15 = this.a;
                return new aebz((adzx) himVar15.sp.a(), (aeee) himVar15.rh.a(), (aolr) himVar15.bg.a(), (adag) himVar15.sq.a(), (adao) himVar15.rk.a(), himVar15.eC(), (aeey) himVar15.qK.a(), (android.content.Context) himVar15.s.a(), (aecj) himVar15.sr.a(), (adzq) himVar15.rb.a(), (adzw) himVar15.rc.a(), (adzh) himVar15.st.a(), himVar15.eB(), (aduu) himVar15.qJ.a(), himVar15.nx());
            case 1024:
                defpackage.him himVar16 = this.a;
                return new adag(himVar16.sP(), (aolr) himVar16.bg.a());
            case 1025:
                return new aecj(ahyn.h((tvn) this.a.rT.a()));
            case 1026:
                defpackage.him himVar17 = this.a;
                return new adzm((android.content.Context) himVar17.s.a(), (aolr) himVar17.ca.a(), himVar17.eA(), (aduu) himVar17.qJ.a());
            case 1027:
                return com.google.android.libraries.notifications.platform.entrypoints.job.GnpWorker.class;
            case 1028:
                defpackage.him himVar18 = this.a;
                return new aegn((adzz) himVar18.su.a(), (aolr) himVar18.bg.a(), (adao) himVar18.rk.a(), (android.content.Context) himVar18.s.a(), new aefw(), ((java.lang.Boolean) himVar18.sv.a()).booleanValue(), himVar18.rK);
            case 1029:
                return java.lang.Boolean.FALSE;
            case 1030:
                return new acgz(new ache(amyu.b(this.a.qL), new vkl(19)));
            case 1031:
                defpackage.him himVar19 = this.a;
                return new afpl(amyu.b(himVar19.sG), (acal) himVar19.rm.a());
            case 1032:
                defpackage.him himVar20 = this.a;
                return new vqy(amyu.b(himVar20.sD), amyu.b(himVar20.sE), amyu.b(himVar20.sF));
            case 1033:
                return new acdb((acbd) this.a.rp.a());
            case 1034:
                return new accx((acbd) this.a.rp.a());
            case 1035:
                defpackage.him himVar21 = this.a;
                return new acde((acbd) himVar21.rp.a(), (android.content.Context) himVar21.s.a());
            case 1036:
                defpackage.him himVar22 = this.a;
                achv achvVar = (achv) himVar22.sz.a();
                aoss aossVar = (aoss) himVar22.cb.a();
                aooh.f(achvVar, "delegate");
                aooh.f(aossVar, "lightweightScope");
                aesgVar = new afpl(achvVar, aossVar);
                return aesgVar;
            case 1037:
                defpackage.him himVar23 = this.a;
                aesgVar = new afpl((afpl) himVar23.tM.a(), (aoss) himVar23.cb.a());
                return aesgVar;
            case 1038:
                afpl afplVar = (afpl) this.a.tL.a();
                aooc.ap(afplVar);
                return afplVar;
            case 1039:
                defpackage.him himVar24 = this.a;
                return new afpl(himVar24.fn(), (aolr) himVar24.ca.a());
            case 1040:
                defpackage.him himVar25 = this.a;
                return new wzx((android.content.Context) himVar25.s.a(), (ajct) himVar25.L.a(), (ajct) himVar25.r.a(), himVar25.nW, himVar25.qD(), himVar25.sJ, himVar25.st());
            case 1041:
                defpackage.him himVar26 = this.a;
                aesgVar = new afpl((ajct) himVar26.L.a(), java.util.Arrays.asList(new afeh(new ajxw((android.content.Context) himVar26.s.a()))));
                return aesgVar;
            case 1042:
                defpackage.him himVar27 = this.a;
                return new ahbv(himVar27.nd(), himVar27.nU(), (ajct) himVar27.L.a(), (ajct) himVar27.r.a(), (ajct) himVar27.as.a(), (aogc) himVar27.sL.a(), (mgu) himVar27.ch.a());
            case 1043:
                defpackage.him himVar28 = this.a;
                return new aogc(himVar28.qU(), (mgw) himVar28.cc.a());
            case 1044:
                return java.lang.Boolean.valueOf(((apnt) this.a.pD().a.a()).b("com.google.android.dialer", "use_headset_as_default_enabled_state").e());
            case 1045:
                defpackage.him himVar29 = this.a;
                return himVar29.qc().h(himVar29.eW());
            case 1046:
                return new defpackage.hij(this, 2, (char[]) null);
            case 1047:
                defpackage.him himVar30 = this.a;
                return new defpackage.jns((android.content.Context) himVar30.s.a(), (ajcu) himVar30.r.a(), (ajct) himVar30.L.a(), himVar30.sP, himVar30.sQ, himVar30.kO, himVar30.pP());
            case 1048:
                return java.lang.Long.valueOf(((apnt) this.a.pD().a.a()).b("com.google.android.dialer", "CallAnnouncer__prewarm_tts_worker_initial_delay_hours").b());
            case 1049:
                return java.lang.Long.valueOf(((apnt) this.a.pD().a.a()).b("com.google.android.dialer", "CallAnnouncer__prewarm_tts_worker_run_frequency_hours").b());
            case 1050:
                return java.lang.Boolean.valueOf(((apnt) this.a.qJ().a.a()).b("com.google.android.dialer", "GrowthKitIntegration__pixel_2019_and_beyond").e());
            case 1051:
                defpackage.him himVar31 = this.a;
                return himVar31.qc().h(himVar31.fa());
            case 1052:
                defpackage.him himVar32 = this.a;
                return new nni(himVar32.aM(), (iqe) himVar32.sU.a(), himVar32.sV, (rlv) himVar32.fq.a());
            case 1053:
                return new defpackage.hij(this, 3, (short[]) null);
            case 1054:
                return this.a.qc().h(jsl.f());
            case 1055:
                return java.lang.Long.valueOf(((apnt) this.a.pq().b.a()).b("com.google.android.dialer.directboot", "45384177").b());
            case 1056:
                return java.lang.Long.valueOf(((apnt) this.a.pq().b.a()).b("com.google.android.dialer.directboot", "45389846").b());
            case 1057:
                alfa alfaVarC = ((apnt) this.a.qw().a.a()).b("com.google.android.dialer.directboot", "45418604").c();
                aooc.ap(alfaVarC);
                return alfaVarC;
            case 1058:
                return java.lang.Boolean.valueOf(((apnt) this.a.qu().a.a()).b("com.google.android.dialer.directboot", "45739149").e());
            case 1059:
                return new defpackage.iml();
            case 1060:
                defpackage.him himVar33 = this.a;
                return himVar33.qc().h(himVar33.fb());
            case 1061:
                defpackage.him himVar34 = this.a;
                return himVar34.qc().h(himVar34.eS());
            case 1062:
                return java.lang.Boolean.valueOf(((apnt) this.a.sc().a.a()).b("com.google.android.dialershared.directboot", "45834490").e());
            case 1063:
                defpackage.him himVar35 = this.a;
                return himVar35.qc().h(himVar35.eT());
            case 1064:
                defpackage.him himVar36 = this.a;
                return new owx((iqe) himVar36.tg.a(), (rlv) himVar36.fq.a(), himVar36.th);
            case 1065:
                return new defpackage.hij(this, 4, (int[]) null);
            case 1066:
                return java.lang.Boolean.valueOf(((apnt) this.a.rg().a.a()).b("com.google.android.dialer.directboot", "45664502").e());
            case 1067:
                return new wbx(this.a.nV());
            case 1068:
                defpackage.him himVar37 = this.a;
                android.content.Context context4 = (android.content.Context) himVar37.s.a();
                agth agthVar = (agth) himVar37.qb.a();
                amdx amdxVar = new amdx();
                amdxVar.a = agthVar.getLooper();
                aawf aawfVar = new aawf(amdxVar);
                acxg acxgVar2 = aawg.a;
                aesgVar = new aavx(context4, aawfVar.a(), (byte[]) null);
                return aesgVar;
            case 1069:
                defpackage.him himVar38 = this.a;
                android.content.Context context5 = (android.content.Context) himVar38.s.a();
                agth agthVar2 = (agth) himVar38.qb.a();
                amdx amdxVar2 = new amdx();
                amdxVar2.a = agthVar2.getLooper();
                aawf aawfVar2 = new aawf(amdxVar2);
                acxg acxgVar3 = aawg.a;
                aesgVar = new aawd(context5, aawfVar2.a(), (byte[]) null);
                return aesgVar;
            case 1070:
                return this.a.qc().h(zja.a("CallScreenAppStates", defpackage.led.a).a());
            case 1071:
                return java.lang.Boolean.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45684622").e());
            case 1072:
                return java.lang.Boolean.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45728331").e());
            case 1073:
                ajct ajctVar = (ajct) this.a.as.a();
                if (ajctVar == null) {
                    aooh.i("executor");
                }
                return new aotu(ajctVar);
            case 1074:
                aabx aabxVar = aabx.a;
                if (aabxVar == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return aabxVar;
            case 1075:
                return java.lang.Boolean.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45773235").e());
            case 1076:
                return java.lang.Boolean.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45767914").e());
            case 1077:
                return java.lang.Boolean.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45791327").e());
            case 1078:
                return java.lang.Boolean.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45854522").e());
            case 1079:
                defpackage.him himVar39 = this.a;
                return himVar39.qc().h(himVar39.eX());
            case 1080:
                defpackage.him himVar40 = this.a;
                return new seq((rlv) himVar40.fq.a(), himVar40.iZ(), (agpq) himVar40.rx.a(), (agoo) himVar40.tw.a(), (adag) himVar40.bM.a(), himVar40.eg(), (aolr) himVar40.bY.a(), (aoss) himVar40.cb.a(), himVar40.tx, himVar40.ty);
            case 1081:
                return java.lang.Boolean.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45819438").e());
            case 1082:
                return java.lang.Boolean.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45836846").e());
            case 1083:
                defpackage.him himVar41 = this.a;
                return himVar41.qc().h(himVar41.fe());
            case 1084:
                return new defpackage.hij(this, 5, (boolean[]) null);
            case 1085:
                defpackage.him himVar42 = this.a;
                return new wjf((ajcu) himVar42.r.a(), himVar42.tC, (wkc) himVar42.tE.a(), (wkd) himVar42.tG.a(), himVar42.co(), himVar42.kD, himVar42.tH);
            case 1086:
                yqa yqaVarC = ((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417216").c();
                aooc.ap(yqaVarC);
                return yqaVarC;
            case 1087:
                defpackage.him himVar43 = this.a;
                return new wkc((ajct) himVar43.r.a(), himVar43.tD, himVar43.qD());
            case 1088:
                acux acuxVar = (acux) this.a.nX.a();
                aooc.ap(acuxVar);
                return acuxVar;
            case 1089:
                defpackage.him himVar44 = this.a;
                return new wkd((android.content.Context) himVar44.s.a(), (ajct) himVar44.L.a(), (ajct) himVar44.r.a(), himVar44.tD, himVar44.tF, himVar44.qD(), (aogc) himVar44.iV.a(), himVar44.st());
            case 1090:
                return java.lang.Long.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417182").b());
            case 1091:
                java.lang.String strD = ((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417194").d();
                aooc.ap(strD);
                return strD;
            case 1092:
                return java.lang.Boolean.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417223").e());
            case 1093:
                defpackage.him himVar45 = this.a;
                acit acitVar = (acit) himVar45.sC.a();
                aoss aossVar2 = (aoss) himVar45.cb.a();
                aooh.f(acitVar, "delegate");
                aooh.f(aossVar2, "lightweightScope");
                aesgVar = new afpl(acitVar, aossVar2);
                return aesgVar;
            case 1094:
                defpackage.him himVar46 = this.a;
                acim acimVar = (acim) himVar46.sd.a();
                aoss aossVar3 = (aoss) himVar46.cb.a();
                aooh.f(acimVar, "delegate");
                aooh.f(aossVar3, "lightweightScope");
                aesgVar = new afpl(acimVar, aossVar3);
                return aesgVar;
            case 1095:
                defpackage.him himVar47 = this.a;
                aeee aeeeVar = (aeee) himVar47.rf.a();
                aoss aossVar4 = (aoss) himVar47.bZ.a();
                aooh.f(aeeeVar, "delegate");
                aooh.f(aossVar4, "blockingScope");
                aesgVar = new adai(aeeeVar, aossVar4);
                return aesgVar;
            case 1096:
                defpackage.him himVar48 = this.a;
                aeee aeeeVar2 = (aeee) himVar48.rh.a();
                aoss aossVar5 = (aoss) himVar48.bZ.a();
                if (aeeeVar2 == null) {
                    aooh.i("delegate");
                }
                if (aossVar5 == null) {
                    aooh.i("blockingScope");
                }
                aesgVar = new adai(aeeeVar2, aossVar5);
                return aesgVar;
            case 1097:
                return this.a.sS();
            case 1098:
                return this.a.em();
            case 1099:
                defpackage.him himVar49 = this.a;
                return new afpl(himVar49.ej(), (aoss) himVar49.fh.a());
            default:
                throw new java.lang.AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v117, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v124, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v131, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v145, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v152, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v159, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v166, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v173, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v185, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v192, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v199, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v214, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v221, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v244, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v252, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v272, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v279, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v286, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v293, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v300, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v307, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v314, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v359, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v366, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v396, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v403, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v422, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v78, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v85, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v92, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v99, types: [aoin, java.lang.Object] */
    private final java.lang.Object e() {
        kgl afplVar;
        jyy uddVar;
        int i = this.b;
        switch (i) {
            case 1100:
                defpackage.him himVar = this.a;
                acak acakVarEk = himVar.ek();
                aoss aossVar = (aoss) himVar.fh.a();
                aooh.f(aossVar, "scope");
                afplVar = new afpl(acakVarEk, aossVar);
                return afplVar;
            case 1101:
                defpackage.him himVar2 = this.a;
                acds acdsVarEn = himVar2.en();
                aoss aossVar2 = (aoss) himVar2.cb.a();
                aooh.f(aossVar2, "lightweightScope");
                afplVar = new afpl(acdsVarEn, aossVar2);
                return afplVar;
            case 1102:
                defpackage.him himVar3 = this.a;
                return new acja(himVar3.hz(), (acip) himVar3.tW.a());
            case 1103:
                defpackage.him himVar4 = this.a;
                return new acjf((aolr) himVar4.bg.a(), (aolr) himVar4.bn.a(), (java.lang.String) himVar4.qH.a(), (acbd) himVar4.rp.a(), (acal) himVar4.rm.a(), (acit) himVar4.sC.a(), himVar4.rv, (adye) himVar4.rQ.a(), himVar4.tX);
            case 1104:
                defpackage.him himVar5 = this.a;
                return new acjm((acip) himVar5.tW.a(), (aoss) himVar5.fh.a(), (acit) himVar5.sC.a(), (acal) himVar5.rm.a());
            case 1105:
                return new afpl((char[]) null);
            case 1106:
                acdp acdpVar = (acdp) this.a.ub.a();
                aooc.ap(acdpVar);
                return acdpVar;
            case 1107:
                return new acdp();
            case 1108:
                defpackage.him himVar6 = this.a;
                android.content.Context context = (android.content.Context) himVar6.s.a();
                aefw aefwVar = new aefw();
                aduu aduuVar = (aduu) himVar6.qJ.a();
                if (context == null) {
                    aooh.i("context");
                }
                if (aduuVar == null) {
                    aooh.i("gnpConfig");
                }
                aefwVar.a(context);
                return java.lang.Boolean.valueOf(anfn.a.b().c() && aduuVar.i);
            case 1109:
                return new tvn();
            case 1110:
                defpackage.him himVar7 = this.a;
                android.content.Context context2 = (android.content.Context) himVar7.s.a();
                himVar7.tb();
                return new ueu(context2, new aogc((aoss) himVar7.fh.a(), himVar7.iZ(), (rlv) himVar7.fq.a()));
            case 1111:
                return java.lang.Boolean.valueOf(((apnt) new xtq(this.a.aZ, (byte[]) null).a.a()).b("com.google.android.dialer", "G__enable_phone_number_classification_spam").e());
            case 1112:
                return new ufo(this.a.sN());
            case 1113:
                alfc alfcVarC = ((apnt) this.a.sr().a.a()).b("com.google.android.dialer.directboot", "45750040").c();
                aooc.ap(alfcVarC);
                return alfcVarC;
            case 1114:
                ucw ucwVarX = ((com.android.dialer.spam.call.database.SpamCallDatabase) this.a.un.a()).x();
                if (ucwVarX == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return ucwVarX;
            case 1115:
                defpackage.him himVar8 = this.a;
                android.content.Context context3 = (android.content.Context) himVar8.s.a();
                ajct ajctVar = (ajct) himVar8.L.a();
                gfv gfvVarD = gfz.d(context3, com.android.dialer.spam.call.database.SpamCallDatabase.class, "spam_call_database");
                gfvVarD.f(ajctVar);
                com.android.dialer.spam.call.database.SpamCallDatabase spamCallDatabaseA = gfvVarD.a();
                if (spamCallDatabaseA == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return spamCallDatabaseA;
            case 1116:
                return new lpb();
            case 1117:
                defpackage.him himVar9 = this.a;
                return ajec.b(new ajeb(2), himVar9.oD().x((ahjz) himVar9.ur.a()));
            case 1118:
                rsr rsrVarNT = this.a.nT();
                ajni ajniVar = new ajni((byte[]) null);
                ajniVar.c = rsrVarNT.k();
                ajniVar.a = 443;
                ajniVar.e(defpackage.ajeg.g);
                return ajniVar.d();
            case 1119:
                java.lang.String strD = ((apnt) this.a.qC().a.a()).b("com.google.android.dialer.directboot", "45414195").d();
                aooc.ap(strD);
                return strD;
            case 1120:
                return java.lang.Long.valueOf(((apnt) this.a.qC().a.a()).b("com.google.android.dialer.directboot", "45629277").b());
            case 1121:
                return java.lang.Long.valueOf(((apnt) this.a.qC().a.a()).b("com.google.android.dialer.directboot", "45629278").b());
            case 1122:
                return java.lang.Long.valueOf(((apnt) this.a.qC().a.a()).b("com.google.android.dialer.directboot", "45407304").b());
            case 1123:
                return java.lang.Long.valueOf(((apnt) this.a.qC().a.a()).b("com.google.android.dialer.directboot", "45407317").b());
            case 1124:
                return new apnt(this.a.ux);
            case 1125:
                android.content.Context context4 = (android.content.Context) this.a.s.a();
                zxw zxwVar = new zxw(new android.os.Bundle());
                acxg acxgVar = zxv.a;
                return new abce(context4, zxwVar);
            case 1126:
                return new android.util.LruCache(5);
            case 1127:
                android.content.Context context5 = (android.content.Context) this.a.s.a();
                java.util.List list = zzd.m;
                zza zzaVar = new zza(context5, "SCOOBY_SPAM_REPORT_LOG");
                ((zyw) zzaVar).f = new rma(1, (byte[]) null);
                return zzaVar.b();
            case 1128:
                return java.lang.Boolean.valueOf(((apnt) this.a.qC().a.a()).b("com.google.android.dialer.directboot", "45407941").e());
            case 1129:
                return java.lang.Boolean.valueOf(((apnt) this.a.qC().a.a()).b("com.google.android.dialer.directboot", "45407319").e());
            case 1130:
                return java.lang.Double.valueOf(((apnt) this.a.qC().a.a()).b("com.google.android.dialer.directboot", "45407318").a());
            case 1131:
                defpackage.him himVar10 = this.a;
                return new uhz((zzx) himVar10.gq(), (aais) himVar10.ce.a(), (abce) himVar10.uE.a(), himVar10.tb(), (aoss) himVar10.cb.a(), himVar10.uF, himVar10.uG, himVar10.uH, (ruc) himVar10.eK.a(), (rlv) himVar10.fq.a());
            case 1132:
                android.content.Context context6 = (android.content.Context) this.a.s.a();
                if (context6 == null) {
                    aooh.i("context");
                    aooh.i("context");
                }
                return new abce(context6);
            case 1133:
                return java.lang.Boolean.valueOf(((apnt) this.a.ry().a.a()).b("com.google.android.dialer.directboot", "45780022").e());
            case 1134:
                return java.lang.Long.valueOf(((apnt) this.a.ry().a.a()).b("com.google.android.dialer.directboot", "45854537").b());
            case 1135:
                return java.lang.Long.valueOf(((apnt) this.a.ry().a.a()).b("com.google.android.dialer.directboot", "45856559").b());
            case 1136:
                return java.lang.Boolean.valueOf(((apnt) this.a.ry().a.a()).b("com.google.android.dialer.directboot", "45805821").e());
            case 1137:
                return java.lang.Boolean.valueOf(((apnt) this.a.sr().a.a()).b("com.google.android.dialer.directboot", "45825194").e());
            case 1138:
                defpackage.him himVar11 = this.a;
                return new swc((swa) himVar11.uL.a(), himVar11.nw(), himVar11.uM);
            case 1139:
                defpackage.him himVar12 = this.a;
                return himVar12.js().b(new uij(himVar12.cx()), "SingletonSpamStatusCache");
            case 1140:
                return java.lang.Long.valueOf(((apnt) this.a.qQ().a.a()).b("com.google.android.dialer.directboot", "45641926").b());
            case 1141:
                return java.lang.Boolean.valueOf(((apnt) this.a.rz().a.a()).b("com.google.android.dialer.directboot", "45687674").e());
            case 1142:
                return java.lang.Boolean.valueOf(((apnt) this.a.rz().a.a()).b("com.google.android.dialer.directboot", "45632797").e());
            case 1143:
                defpackage.him himVar13 = this.a;
                return new olc(amyu.b(himVar13.uR), (aoss) himVar13.cb.a(), (aolr) himVar13.ca.a(), (aolr) himVar13.bg.a(), (aolr) himVar13.bY.a(), himVar13.uS, himVar13.uT, (zjv) himVar13.cf.a(), (mgu) himVar13.ch.a(), (aais) himVar13.ce.a(), (android.content.pm.PackageManager) himVar13.aq.a(), (rlv) himVar13.fq.a());
            case 1144:
                defpackage.him himVar14 = this.a;
                android.content.Context context7 = (android.content.Context) himVar14.s.a();
                ahyn ahynVarH = ahyn.h((java.util.concurrent.Executor) himVar14.L.a());
                acxg acxgVar2 = aakg.b;
                afplVar = new gat(context7, ahynVarH);
                return afplVar;
            case 1145:
                return java.lang.Long.valueOf(((apnt) this.a.rz().a.a()).b("com.google.android.dialer.directboot", "45654078").b());
            case 1146:
                return java.lang.Boolean.valueOf(((apnt) this.a.rz().a.a()).b("com.google.android.dialer.directboot", "45823810").e());
            case 1147:
                defpackage.him himVar15 = this.a;
                return new nxg((aolr) himVar15.ca.a(), (aoss) himVar15.cb.a(), himVar15.aT(), (nxh) himVar15.uX.a(), (rlv) himVar15.fq.a(), (aazc) himVar15.l.a());
            case 1148:
                nxh nxhVarX = ((com.android.dialer.duo.data.database.MeetInfoDatabase) this.a.uW.a()).x();
                if (nxhVarX == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return nxhVarX;
            case 1149:
                defpackage.him himVar16 = this.a;
                com.android.dialer.duo.data.database.MeetInfoDatabase meetInfoDatabaseO = himVar16.pQ().o((ahku) himVar16.uV.a(), com.android.dialer.duo.data.database.MeetInfoDatabase.class, new java.lang.Object[0]);
                if (meetInfoDatabaseO == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return meetInfoDatabaseO;
            case 1150:
                ahkt ahktVarA = ahku.a();
                ahktVarA.a = "meet_info.db";
                ahktVarA.d = new ahkp(0);
                return ahktVarA.a();
            case 1151:
                defpackage.him himVar17 = this.a;
                return new nyh((android.content.Context) himVar17.s.a(), (ajcu) himVar17.aN.a(), (ajcu) himVar17.r.a(), (ajcu) himVar17.as.a(), (rlv) himVar17.fq.a(), (gpd) himVar17.fD.a(), himVar17.uQ, himVar17.uP, (olc) himVar17.uU.a(), himVar17.jF(), (ahbv) himVar17.fg.a(), (zjv) himVar17.cf.a(), himVar17.ts(), himVar17.oy());
            case 1152:
                return this.a.qc().h(zja.b("MeetInfo", gus.aN(nwy.a.m()).x(), (java.lang.Iterable) null, (aonj) null, 12));
            case 1153:
                return java.lang.Boolean.valueOf(((apnt) this.a.su().a.a()).b("com.google.android.dialer.directboot", "45389915").e());
            case 1154:
                defpackage.him himVar18 = this.a;
                return new srl((android.content.Context) himVar18.s.a(), (aolr) himVar18.bg.a(), (zzx) himVar18.gq(), (ojo) himVar18.oF.a(), (aogc) himVar18.fo.a(), himVar18.vd);
            case 1155:
                return java.lang.Boolean.valueOf(((apnt) new tvn(this.a.aZ, (byte[]) null).a.a()).b("com.google.android.dialer.directboot", "45793293").e());
            case 1156:
                return this.a.qc().h(zja.b("PhoneLookupDataSourceMetadata", ttj.Z(sqd.a.m()).at(), (java.lang.Iterable) null, (aonj) null, 12));
            case 1157:
                return new gus((char[]) null);
            case 1158:
                return new defpackage.hgz(this);
            case 1159:
                defpackage.him himVar19 = this.a;
                uddVar = new udd(himVar19.cx(), himVar19.sa(), (ajct) himVar19.r.a(), himVar19.pC);
                return uddVar;
            case 1160:
                defpackage.him himVar20 = this.a;
                android.content.Context context8 = (android.content.Context) himVar20.s.a();
                ajct ajctVar2 = (ajct) himVar20.as.a();
                zjs zjsVar = (zjs) himVar20.cn.a();
                oko okoVarBe = himVar20.be();
                return new uzp(context8, ajctVar2, zjsVar, okoVarBe, himVar20.vs);
            case 1161:
                defpackage.him himVar21 = this.a;
                jwk jwkVarV = himVar21.V();
                java.lang.Object objGt = himVar21.gt();
                return new sou(jwkVarV, (sor) objGt, (zjs) himVar21.cn.a(), himVar21.vp, himVar21.vq);
            case 1162:
                defpackage.him himVar22 = this.a;
                afplVar = new kgl((ajcu) himVar22.r.a(), himVar22.vk);
                return afplVar;
            case 1163:
                return java.lang.Boolean.valueOf(((apnt) this.a.pN().b.a()).b("com.google.android.dialer.directboot", "45728339").e());
            case 1164:
                return java.lang.Boolean.valueOf(((apnt) this.a.po().a.a()).b("com.google.android.dialer", "enable_shared_data_call_icon").e());
            case 1165:
                return java.lang.Boolean.valueOf(((apnt) this.a.po().a.a()).b("com.google.android.dialer", "enable_wifi_technology_icons").e());
            case 1166:
                return java.lang.Boolean.valueOf(((apnt) this.a.po().a.a()).b("com.google.android.dialer", "enable_lte_technology_icons").e());
            case 1167:
                return java.lang.Boolean.valueOf(((apnt) this.a.rZ().a.a()).b("com.google.android.dialershared.directboot", "45794643").e());
            case 1168:
                return java.lang.Boolean.valueOf(((apnt) this.a.qk().b.a()).b("com.google.android.dialer.directboot", "45757992").e());
            case 1169:
                return java.lang.Boolean.valueOf(((apnt) this.a.ql().b.a()).b("com.google.android.dialer.directboot", "45752047").e());
            case 1170:
                defpackage.him himVar23 = this.a;
                return new whj((ajct) himVar23.r.a(), dpy.p((ecx) himVar23.vu.a(), (ajct) himVar23.r.a()), himVar23.oy(), (wqr) himVar23.vv.a(), himVar23.sa());
            case 1171:
                return this.a.qc().h(zja.a("XatuStatus", whk.a).a());
            case 1172:
                defpackage.him himVar24 = this.a;
                ajct ajctVar3 = (ajct) himVar24.r.a();
                aogc aogcVarSN = himVar24.sN();
                return new wqr(ajctVar3, aogcVarSN, himVar24.pn);
            case 1173:
                defpackage.him himVar25 = this.a;
                uddVar = new jyy((afhf) himVar25.vy.a(), (ajct) himVar25.r.a(), (ruc) himVar25.eK.a(), (aogc) himVar25.fo.a());
                return uddVar;
            case 1174:
                defpackage.him himVar26 = this.a;
                return himVar26.pX().t(defpackage.him.iL(), (aogc) himVar26.bq.a());
            case 1175:
                defpackage.him himVar27 = this.a;
                zjm zjmVarKj = himVar27.kj();
                amyz amyzVar = himVar27.vI;
                lrb lrbVarAw = himVar27.aw();
                aooh.f(amyzVar, "impl");
                zjm zjmVar = new zjm(amyzVar, new defpackage.len(lrbVarAw, 3));
                amyz amyzVar2 = himVar27.px;
                mnk mnkVarAE = himVar27.aE();
                amyz amyzVar3 = himVar27.vJ;
                aooh.f(amyzVar2, "enableCallLogIntegration");
                aooh.f(amyzVar3, "impl");
                zjm zjmVar2 = new zjm(amyzVar3, new defpackage.jhz(mnkVarAE, amyzVar2, 5));
                amyz amyzVar4 = himVar27.vP;
                oev oevVarAX = himVar27.aX();
                aooh.f(amyzVar4, "impl");
                zjm zjmVar3 = new zjm(amyzVar4, new defpackage.odv(oevVarAX, 0));
                khr khrVarAa = himVar27.aa();
                amyz amyzVar5 = himVar27.wa;
                aooh.f(amyzVar5, "haloCallLogDataIntegration");
                zjm zjmVar4 = new zjm(amyzVar5, new defpackage.jnz(khrVarAa, 8));
                amyz amyzVar6 = himVar27.wb;
                tkk tkkVarCj = himVar27.cj();
                aooh.f(amyzVar6, "impl");
                return aihd.v(zjmVarKj, zjmVar, zjmVar2, zjmVar3, zjmVar4, new zjm(amyzVar6, new tee(tkkVarCj, 3)), new zjm[]{anar.z(himVar27.wc)});
            case 1176:
                return new isj((kgl) this.a.pv.a(), new kcq());
            case 1177:
                defpackage.him himVar28 = this.a;
                return new lqz(himVar28.rc(), himVar28.aw(), himVar28.nC(), 0);
            case 1178:
                defpackage.him himVar29 = this.a;
                return new gpd((lsx) himVar29.vD.a(), (ltd) himVar29.vE.a());
            case 1179:
                lsx lsxVarX = ((com.android.dialer.contactchecker.receiver.impl.service.db.ContactCheckerCallLogDatabase) this.a.vC.a()).x();
                aooc.ap(lsxVarX);
                return lsxVarX;
            case 1180:
                defpackage.him himVar30 = this.a;
                com.android.dialer.contactchecker.receiver.impl.service.db.ContactCheckerCallLogDatabase contactCheckerCallLogDatabaseO = himVar30.pQ().o((ahku) himVar30.vB.a(), com.android.dialer.contactchecker.receiver.impl.service.db.ContactCheckerCallLogDatabase.class, new java.lang.Object[0]);
                aooc.ap(contactCheckerCallLogDatabaseO);
                return contactCheckerCallLogDatabaseO;
            case 1181:
                ahkt ahktVarA2 = ahku.a();
                ahktVarA2.a = "contact_checker_call_log_database";
                ahktVarA2.d = new ahkp(0);
                return ahktVarA2.a();
            case 1182:
                ltd ltdVarY = ((com.android.dialer.contactchecker.receiver.impl.service.db.ContactCheckerCallLogDatabase) this.a.vC.a()).y();
                aooc.ap(ltdVarY);
                return ltdVarY;
            case 1183:
                return java.lang.Boolean.valueOf(((apnt) this.a.rF().a.a()).b("com.google.android.dialer.directboot", "45762659").e());
            case 1184:
                return java.lang.Boolean.valueOf(((apnt) this.a.rF().a.a()).b("com.google.android.dialer.directboot", "45769494").e());
            case 1185:
                return new moe(this.a.td(), 0);
            case 1186:
                defpackage.him himVar31 = this.a;
                return new moe((android.content.Context) himVar31.s.a(), himVar31.qI(), 2);
            case 1187:
                defpackage.him himVar32 = this.a;
                return new gpd((oef) himVar32.vM.a(), (oem) himVar32.vN.a());
            case 1188:
                oef oefVarX = ((com.android.dialer.expresso.calllog.db.ExpressoCallLogDatabase) this.a.vL.a()).x();
                if (oefVarX == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return oefVarX;
            case 1189:
                defpackage.him himVar33 = this.a;
                com.android.dialer.expresso.calllog.db.ExpressoCallLogDatabase expressoCallLogDatabaseO = himVar33.pQ().o((ahku) himVar33.vK.a(), com.android.dialer.expresso.calllog.db.ExpressoCallLogDatabase.class, new java.lang.Object[0]);
                if (expressoCallLogDatabaseO == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return expressoCallLogDatabaseO;
            case 1190:
                ahkt ahktVarA3 = ahku.a();
                ahktVarA3.a = "expresso_call_log_database";
                ahktVarA3.d = new ahkp(0);
                return ahktVarA3.a();
            case 1191:
                oem oemVarY = ((com.android.dialer.expresso.calllog.db.ExpressoCallLogDatabase) this.a.vL.a()).y();
                if (oemVarY == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return oemVarY;
            case 1192:
                return java.lang.Boolean.valueOf(((apnt) this.a.sx().a.a()).b("com.google.android.dialer.directboot", "45664158").e());
            case 1193:
                return java.lang.Boolean.valueOf(((apnt) this.a.rT().a.a()).b("com.google.android.dialer.directboot", "45800846").e());
            case 1194:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45820974").e());
            case 1195:
                defpackage.him himVar34 = this.a;
                return new lqz(himVar34.oF(), (gpd) himVar34.vZ.a(), (aolr) himVar34.ca.a(), 1);
            case 1196:
                defpackage.him himVar35 = this.a;
                return new khc(himVar35.rP(), new kaw(himVar35.vT));
            case 1197:
                ypy ypyVarC = ((apnt) this.a.rT().a.a()).b("com.google.android.dialer.directboot", "45735260").c();
                aooc.ap(ypyVarC);
                return ypyVarC;
            case 1198:
                defpackage.him himVar36 = this.a;
                return new gpd(himVar36.sa(), (android.content.Context) himVar36.s.a(), himVar36.aa(), (aolr) himVar36.ca.a(), (tkl) himVar36.vY.a());
            case 1199:
                defpackage.him himVar37 = this.a;
                return new tkl((khw) himVar37.vX.a(), (aolr) himVar37.ca.a());
            default:
                throw new java.lang.AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v137, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v149, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v198, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v210, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v251, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v259, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v267, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v275, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v283, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v291, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v298, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v305, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v312, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v323, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v331, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v339, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v347, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v355, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v363, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v371, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v379, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v387, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v395, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v403, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v411, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v419, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v427, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v435, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v443, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v451, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v459, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v467, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v475, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v483, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v491, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v499, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v507, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v515, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v523, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v538, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v546, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v554, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v74, types: [aoin, java.lang.Object] */
    private final java.lang.Object f() {
        iwc moeVar;
        java.lang.Object hyoVar;
        sgf kziVar;
        int i = this.b;
        switch (i) {
            case 1200:
                khw khwVarX = ((com.android.dialer.calllog.halo.impl.storage.database.PeopleDirectoryContactDatabase) this.a.vW.a()).x();
                if (khwVarX != null) {
                    return khwVarX;
                }
                throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case 1201:
                defpackage.him himVar = this.a;
                com.android.dialer.calllog.halo.impl.storage.database.PeopleDirectoryContactDatabase peopleDirectoryContactDatabaseO = himVar.pQ().o((ahku) himVar.vV.a(), com.android.dialer.calllog.halo.impl.storage.database.PeopleDirectoryContactDatabase.class, new java.lang.Object[0]);
                if (peopleDirectoryContactDatabaseO == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return peopleDirectoryContactDatabaseO;
            case 1202:
                ahkt ahktVarA = ahku.a();
                ahktVarA.a = "people_directory_contact_database.db";
                ahktVarA.d = new ahkp(0);
                return ahktVarA.a();
            case 1203:
                moeVar = new moe(this.a.cl(), 3);
                return moeVar;
            case 1204:
                moeVar = new moe((kgl) this.a.pQ.a(), 1);
                return moeVar;
            case 1205:
                defpackage.him himVar2 = this.a;
                moeVar = new jyz((android.content.Context) himVar2.s.a(), (aoss) himVar2.cb.a());
                return moeVar;
            case 1206:
                return java.lang.Long.valueOf(((apnt) this.a.ql().b.a()).b("com.google.android.dialer.directboot", "45864572").b());
            case 1207:
                return java.lang.Long.valueOf(((apnt) this.a.ql().b.a()).b("com.google.android.dialer.directboot", "45753580").b());
            case 1208:
                return java.lang.Boolean.valueOf(((apnt) this.a.ql().b.a()).b("com.google.android.dialer.directboot", "45855760").e());
            case 1209:
                alfc alfcVarC = ((apnt) this.a.rT().a.a()).b("com.google.android.dialer.directboot", "45769760").c();
                aooc.ap(alfcVarC);
                return alfcVarC;
            case 1210:
                defpackage.him himVar3 = this.a;
                defpackage.kun kunVar = defpackage.kun.BEEP_SOUND;
                defpackage.kuw kuwVarAe = himVar3.ae();
                amyz amyzVar = himVar3.wl;
                aooh.f(amyzVar, "beepSoundCallRecordingDisclosure");
                zjm zjmVar = new zjm(amyzVar, new defpackage.kpr(kuwVarAe, 9));
                defpackage.kun kunVar2 = defpackage.kun.TTS;
                amyz amyzVar2 = himVar3.wq;
                kwt kwtVarAk = himVar3.ak();
                aooh.f(amyzVar2, "ttsCallRecordingDisclosure");
                zjm zjmVar2 = new zjm(amyzVar2, new defpackage.kpr(kwtVarAk, 7));
                defpackage.kun kunVar3 = defpackage.kun.BUILT_IN;
                amyz amyzVar3 = himVar3.wr;
                kwt kwtVarAk2 = himVar3.ak();
                aooh.f(amyzVar3, "builtInCallRecordingDisclosure");
                return aigf.m(kunVar, zjmVar, kunVar2, zjmVar2, kunVar3, new zjm(amyzVar3, new defpackage.kpr(kwtVarAk2, 6)));
            case 1211:
                defpackage.him himVar4 = this.a;
                moeVar = new defpackage.kuv((aoss) himVar4.cb.a(), himVar4.ad(), (rlv) himVar4.fq.a());
                return moeVar;
            case 1212:
                defpackage.him himVar5 = this.a;
                moeVar = new defpackage.kus((aoss) himVar5.cb.a(), (lbq) himVar5.wm.a(), (rlv) himVar5.fq.a(), himVar5.z(), (izg) himVar5.wp.a());
                return moeVar;
            case 1213:
                defpackage.him himVar6 = this.a;
                return new lbq((android.content.Context) himVar6.s.a(), himVar6.ak(), (ajct) himVar6.L.a(), (java.util.concurrent.ScheduledExecutorService) himVar6.r.a());
            case 1214:
                return java.lang.Boolean.valueOf(((apnt) this.a.rm().a.a()).b("com.google.android.dialer.directboot", "45663897").e());
            case 1215:
                defpackage.him himVar7 = this.a;
                moeVar = new izg((aolr) himVar7.ca.a(), himVar7.A(), (defpackage.hyo) himVar7.wo.a());
                return moeVar;
            case 1216:
                defpackage.him himVar8 = this.a;
                android.content.Context context = (android.content.Context) himVar8.s.a();
                rlv rlvVar = (rlv) himVar8.fq.a();
                aooh.f(context, "appContext");
                aooh.f(rlvVar, "loggingBindings");
                hyoVar = new defpackage.hyo(context, rlvVar);
                return hyoVar;
            case 1217:
                defpackage.him himVar9 = this.a;
                moeVar = new defpackage.kup((aolr) himVar9.bg.a(), (aoss) himVar9.cb.a(), himVar9.ad(), himVar9.ak(), (rlv) himVar9.fq.a());
                return moeVar;
            case 1218:
                defpackage.him himVar10 = this.a;
                defpackage.kun kunVar4 = defpackage.kun.BEEP_SOUND;
                zjm zjmVar3 = new zjm(new kuq(2), new defpackage.kpr(himVar10.ae(), 8));
                defpackage.kun kunVar5 = defpackage.kun.TTS;
                zjm zjmVar4 = new zjm(new kuq(0), new defpackage.kpr(himVar10.ak(), 5));
                defpackage.kun kunVar6 = defpackage.kun.BUILT_IN;
                kwt kwtVarAk3 = himVar10.ak();
                return aigf.m(kunVar4, zjmVar3, kunVar5, zjmVar4, kunVar6, new zjm(new defpackage.jsp(kwtVarAk3, 20), new defpackage.kpr(kwtVarAk3, 4)));
            case 1219:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45633987").e());
            case 1220:
                defpackage.him himVar11 = this.a;
                kziVar = new defpackage.kzi((android.content.Context) himVar11.s.a(), (ajct) himVar11.r.a(), himVar11.mK());
                return kziVar;
            case 1221:
                defpackage.him himVar12 = this.a;
                kziVar = new sgf((android.content.Context) himVar12.s.a(), himVar12.ca(), (ajct) himVar12.r.a(), 1);
                return kziVar;
            case 1222:
                defpackage.him himVar13 = this.a;
                hyoVar = new defpackage.oop((android.content.Context) himVar13.s.a(), (ajct) himVar13.as.a());
                return hyoVar;
            case 1223:
                defpackage.him himVar14 = this.a;
                moeVar = new ows((android.content.Context) himVar14.s.a(), (aoss) himVar14.cb.a());
                return moeVar;
            case 1224:
                defpackage.him himVar15 = this.a;
                moeVar = new defpackage.jcr((android.content.Context) himVar15.s.a(), (rlv) himVar15.fq.a());
                return moeVar;
            case 1225:
                moeVar = new defpackage.mmt(this.a.mY(), 1);
                return moeVar;
            case 1226:
                defpackage.him himVar16 = this.a;
                moeVar = new defpackage.lvf((android.content.Context) himVar16.s.a(), (aolr) himVar16.bY.a(), (aoss) himVar16.cb.a(), (java.util.concurrent.Executor) himVar16.r.a());
                return moeVar;
            case 1227:
                moeVar = new defpackage.mmt((android.content.Context) this.a.s.a(), 0);
                return moeVar;
            case 1228:
                moeVar = new defpackage.mmt((android.content.Context) this.a.s.a(), 2, (byte[]) null);
                return moeVar;
            case 1229:
                return java.lang.Boolean.valueOf(((apnt) this.a.sx().a.a()).b("com.google.android.dialer.directboot", "45740418").e());
            case 1230:
                moeVar = new defpackage.mmt((android.content.Context) this.a.s.a(), 3, (char[]) null);
                return moeVar;
            case 1231:
                alfc alfcVarC2 = ((apnt) this.a.sb().a.a()).b("com.google.android.dialer.directboot", "45778681").c();
                if (alfcVarC2 == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return alfcVarC2;
            case 1232:
                defpackage.him himVar17 = this.a;
                moeVar = new tef((android.content.Context) himVar17.s.a(), (aoss) himVar17.cb.a());
                return moeVar;
            case 1233:
                defpackage.him himVar18 = this.a;
                moeVar = new sgf((android.content.Context) himVar18.s.a(), himVar18.bA(), (aoss) himVar18.cb.a(), 0);
                return moeVar;
            case 1234:
                return new tdp(1);
            case 1235:
                moeVar = new defpackage.mmt((android.content.Context) this.a.s.a(), 4, (short[]) null);
                return moeVar;
            case 1236:
                moeVar = new defpackage.mmt((android.content.Context) this.a.s.a(), 5);
                return moeVar;
            case 1237:
                defpackage.him himVar19 = this.a;
                return new vqp((android.content.Context) himVar19.s.a(), (ajct) himVar19.r.a(), (zjs) himVar19.cn.a(), new vnx((aoss) himVar19.cb.a(), (aolr) himVar19.bY.a(), himVar19.dT(), himVar19.l(), (zjs) himVar19.cn.a()));
            case 1238:
                moeVar = new swj((android.content.Context) this.a.s.a(), 3);
                return moeVar;
            case 1239:
                return new tdp(0);
            case 1240:
                moeVar = new defpackage.mmt((android.content.Context) this.a.s.a(), 6);
                return moeVar;
            case 1241:
                moeVar = new defpackage.mmt((android.content.Context) this.a.s.a(), 7);
                return moeVar;
            case 1242:
                defpackage.him himVar20 = this.a;
                return aigf.k(ruv.a, defpackage.lhj.j(himVar20.az(), himVar20.wS));
            case 1243:
                defpackage.him himVar21 = this.a;
                moeVar = new defpackage.lyt((android.content.Context) himVar21.s.a(), (aoss) himVar21.cb.a(), himVar21.aA());
                return moeVar;
            case 1244:
                return java.lang.Long.valueOf(((apnt) this.a.pn().b.a()).b("com.google.android.dialer.directboot", "45818055").b());
            case 1245:
                defpackage.him himVar22 = this.a;
                moeVar = new defpackage.nkk(himVar22.aL(), himVar22.iI);
                return moeVar;
            case 1246:
                defpackage.him himVar23 = this.a;
                moeVar = new yvj((tmi) himVar23.lh.a(), himVar23.wX, himVar23.nQ, himVar23.dF());
                return moeVar;
            case 1247:
                return java.lang.Long.valueOf(((apnt) this.a.qd().a.a()).b("com.google.android.callcoreshared.directboot", "45710869").b());
            case 1248:
                amyz amyzVar4 = this.a.xh;
                aooh.f(amyzVar4, "impl");
                ahkv ahkvVar = new ahkv();
                ahkvVar.c(6L, java.util.concurrent.TimeUnit.HOURS);
                return agab.aB(ahkvVar.a(), amyzVar4);
            case 1249:
                defpackage.him himVar24 = this.a;
                moeVar = new defpackage.iqd((aoss) himVar24.fh.a(), (ecx) himVar24.xc.a(), (rlv) himVar24.fq.a(), himVar24.xd, new defpackage.ipz((android.content.Context) himVar24.s.a(), (ecx) himVar24.xc.a(), himVar24.od(), (rlv) himVar24.fq.a()));
                return moeVar;
            case 1250:
                return this.a.qc().h(zja.b("UnboundedRestore", defpackage.hgu.n(defpackage.iqa.a.m()).f(), (java.lang.Iterable) null, (aonj) null, 12));
            case 1251:
                return java.lang.Long.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45809186").b());
            case 1252:
                defpackage.him himVar25 = this.a;
                return aigf.l(defpackage.ipf.PHONE_LOOKUP, anar.z(himVar25.xe), defpackage.ipf.SPEED_DIAL, anar.z(himVar25.xf));
            case 1253:
                moeVar = new sps(this.a.nu());
                return moeVar;
            case 1254:
                defpackage.him himVar26 = this.a;
                moeVar = new ups((android.content.Context) himVar26.s.a(), (ojo) himVar26.oF.a(), himVar26.oE);
                return moeVar;
            case 1255:
                defpackage.him himVar27 = this.a;
                iqm iqmVarE = himVar27.E();
                iwg iwgVar = new iwg((aoss) himVar27.cb.a(), himVar27.qD(), (ish) himVar27.ya.a(), (rlv) himVar27.fq.a(), himVar27.K(), himVar27.E(), himVar27.I(), himVar27.nf(), himVar27.O());
                if (!iqmVarE.a()) {
                    return ahlc.a;
                }
                defpackage.irh irhVar = new defpackage.irh(iwgVar, 8);
                ahkv ahkvVar2 = new ahkv();
                ahkvVar2.c(6L, java.util.concurrent.TimeUnit.HOURS);
                ahkx ahkxVar = new ahkx();
                ahkxVar.a = ahkz.b;
                ahkvVar2.b(ahkxVar.a());
                return agab.aB(ahkvVar2.a(), irhVar);
            case 1256:
                defpackage.him himVar28 = this.a;
                moeVar = new ish(himVar28.J(), himVar28.xr, himVar28.L(), (iwc) himVar28.xY.a(), himVar28.dk(), himVar28.oo(), (zpm) himVar28.fn.a(), (android.content.Context) himVar28.s.a(), (aolr) himVar28.bY.a());
                return moeVar;
            case 1257:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45667177").e());
            case 1258:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45676588").e());
            case 1259:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45676586").e());
            case 1260:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45676587").e());
            case 1261:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45676589").e());
            case 1262:
                java.lang.String strD = ((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45698934").d();
                aooc.ap(strD);
                return strD;
            case 1263:
                java.lang.String strD2 = ((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45716559").d();
                aooc.ap(strD2);
                return strD2;
            case 1264:
                java.lang.String strD3 = ((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45727034").d();
                aooc.ap(strD3);
                return strD3;
            case 1265:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45842780").e());
            case 1266:
                ahkl ahklVarA = ahkm.a();
                ahklVarA.a = "BeeslyGreetingsData";
                ahklVarA.c(ixh.a);
                return this.a.qc().h(ahklVarA.a());
            case 1267:
                acux acuxVarC = ((apnt) this.a.rf().a.a()).b("com.google.android.dialer.directboot", "45752077").c();
                aooc.ap(acuxVarC);
                return acuxVarC;
            case 1268:
                acux acuxVarC2 = ((apnt) this.a.rf().a.a()).b("com.google.android.dialer.directboot", "45752078").c();
                aooc.ap(acuxVarC2);
                return acuxVarC2;
            case 1269:
                acux acuxVarC3 = ((apnt) this.a.rf().a.a()).b("com.google.android.dialer.directboot", "45752079").c();
                aooc.ap(acuxVarC3);
                return acuxVarC3;
            case 1270:
                acux acuxVarC4 = ((apnt) this.a.rf().a.a()).b("com.google.android.dialer.directboot", "45752080").c();
                aooc.ap(acuxVarC4);
                return acuxVarC4;
            case 1271:
                acux acuxVarC5 = ((apnt) this.a.rf().a.a()).b("com.google.android.dialer.directboot", "45752081").c();
                aooc.ap(acuxVarC5);
                return acuxVarC5;
            case 1272:
                acux acuxVarC6 = ((apnt) this.a.rf().a.a()).b("com.google.android.dialer.directboot", "45758891").c();
                aooc.ap(acuxVarC6);
                return acuxVarC6;
            case 1273:
                acux acuxVarC7 = ((apnt) this.a.rf().a.a()).b("com.google.android.dialer.directboot", "45752082").c();
                aooc.ap(acuxVarC7);
                return acuxVarC7;
            case 1274:
                acux acuxVarC8 = ((apnt) this.a.rf().a.a()).b("com.google.android.dialer.directboot", "45752083").c();
                aooc.ap(acuxVarC8);
                return acuxVarC8;
            case 1275:
                acux acuxVarC9 = ((apnt) this.a.rf().a.a()).b("com.google.android.dialer.directboot", "45752084").c();
                aooc.ap(acuxVarC9);
                return acuxVarC9;
            case 1276:
                acux acuxVarC10 = ((apnt) this.a.rf().a.a()).b("com.google.android.dialer.directboot", "45768936").c();
                aooc.ap(acuxVarC10);
                return acuxVarC10;
            case 1277:
                acux acuxVarC11 = ((apnt) this.a.rf().a.a()).b("com.google.android.dialer.directboot", "45752085").c();
                aooc.ap(acuxVarC11);
                return acuxVarC11;
            case 1278:
                acux acuxVarC12 = ((apnt) this.a.rf().a.a()).b("com.google.android.dialer.directboot", "45752086").c();
                aooc.ap(acuxVarC12);
                return acuxVarC12;
            case 1279:
                acux acuxVarC13 = ((apnt) this.a.rf().a.a()).b("com.google.android.dialer.directboot", "45752087").c();
                aooc.ap(acuxVarC13);
                return acuxVarC13;
            case 1280:
                acux acuxVarC14 = ((apnt) this.a.rf().a.a()).b("com.google.android.dialer.directboot", "45752088").c();
                aooc.ap(acuxVarC14);
                return acuxVarC14;
            case 1281:
                acux acuxVarC15 = ((apnt) this.a.rf().a.a()).b("com.google.android.dialer.directboot", "45752089").c();
                aooc.ap(acuxVarC15);
                return acuxVarC15;
            case 1282:
                acux acuxVarC16 = ((apnt) this.a.rf().a.a()).b("com.google.android.dialer.directboot", "45752090").c();
                aooc.ap(acuxVarC16);
                return acuxVarC16;
            case 1283:
                acux acuxVarC17 = ((apnt) this.a.rf().a.a()).b("com.google.android.dialer.directboot", "45752091").c();
                aooc.ap(acuxVarC17);
                return acuxVarC17;
            case 1284:
                acux acuxVarC18 = ((apnt) this.a.rf().a.a()).b("com.google.android.dialer.directboot", "45752092").c();
                aooc.ap(acuxVarC18);
                return acuxVarC18;
            case 1285:
                acux acuxVarC19 = ((apnt) this.a.rf().a.a()).b("com.google.android.dialer.directboot", "45752093").c();
                aooc.ap(acuxVarC19);
                return acuxVarC19;
            case 1286:
                acux acuxVarC20 = ((apnt) this.a.rf().a.a()).b("com.google.android.dialer.directboot", "45752094").c();
                aooc.ap(acuxVarC20);
                return acuxVarC20;
            case 1287:
                acux acuxVarC21 = ((apnt) this.a.rf().a.a()).b("com.google.android.dialer.directboot", "45752095").c();
                aooc.ap(acuxVarC21);
                return acuxVarC21;
            case 1288:
                acux acuxVarC22 = ((apnt) this.a.rf().a.a()).b("com.google.android.dialer.directboot", "45752096").c();
                aooc.ap(acuxVarC22);
                return acuxVarC22;
            case 1289:
                acux acuxVarC23 = ((apnt) this.a.rf().a.a()).b("com.google.android.dialer.directboot", "45752097").c();
                aooc.ap(acuxVarC23);
                return acuxVarC23;
            case 1290:
                acux acuxVarC24 = ((apnt) this.a.rf().a.a()).b("com.google.android.dialer.directboot", "45752098").c();
                aooc.ap(acuxVarC24);
                return acuxVarC24;
            case 1291:
                acux acuxVarC25 = ((apnt) this.a.rf().a.a()).b("com.google.android.dialer.directboot", "45752099").c();
                aooc.ap(acuxVarC25);
                return acuxVarC25;
            case 1292:
                acux acuxVarC26 = ((apnt) this.a.rf().a.a()).b("com.google.android.dialer.directboot", "45752100").c();
                aooc.ap(acuxVarC26);
                return acuxVarC26;
            case 1293:
                defpackage.him himVar29 = this.a;
                iqm iqmVarE2 = himVar29.E();
                amyz amyzVar5 = himVar29.xT;
                aooh.f(amyzVar5, "listener");
                return new aile(new zjm(amyzVar5, new defpackage.hle(iqmVarE2, 13)));
            case 1294:
                defpackage.him himVar30 = this.a;
                moeVar = new defpackage.kvt(himVar30.M(), himVar30.L());
                return moeVar;
            case 1295:
                defpackage.him himVar31 = this.a;
                moeVar = new iwc((android.content.Context) himVar31.s.a(), himVar31.xj, himVar31.xl, himVar31.xk, himVar31.xm, himVar31.xn, himVar31.xV, himVar31.xW, himVar31.xX, himVar31.bl(), himVar31.E());
                return moeVar;
            case 1296:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45766101").e());
            case 1297:
                return java.lang.Boolean.valueOf(((apnt) this.a.qs().b.a()).b("com.google.android.dialer.directboot", "45858440").e());
            case 1298:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45766094").e());
            case 1299:
                ahko ahkoVarA = zte.a("VoicemailGreetingsData", vpk.a).a();
                defpackage.him himVar32 = this.a;
                return himVar32.pX().t(ahkoVarA, (aogc) himVar32.bq.a());
            default:
                throw new java.lang.AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v110, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v147, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v154, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v175, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v182, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v189, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v196, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v203, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v210, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v217, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v224, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v231, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v238, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v245, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v252, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v259, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v266, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v273, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v280, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v287, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v294, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v301, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v308, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v315, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v322, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v329, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v336, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v343, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v350, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v357, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v364, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v375, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v399, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v406, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v413, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v420, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v427, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v440, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v448, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v455, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v462, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v469, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v81, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v90, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v97, types: [aoin, java.lang.Object] */
    private final java.lang.Object g() {
        rai raiVar;
        int i = this.b;
        switch (i) {
            case 1300:
                defpackage.him himVar = this.a;
                return jsl.q(himVar.E(), himVar.jn());
            case 1301:
                defpackage.him himVar2 = this.a;
                return jsl.u(himVar2.oR(), himVar2.dW(), himVar2.yi);
            case 1302:
                defpackage.him himVar3 = this.a;
                ztn ztnVarDV = himVar3.dV();
                himVar3.oL();
                return new uzx(ztnVarDV, (byte[]) null);
            case 1303:
                defpackage.him himVar4 = this.a;
                aikj aikjVar = aikj.b;
                aikj aikjVarHh = himVar4.hh();
                aigf aigfVarFB = himVar4.fB();
                java.util.Map map = (java.util.Map) himVar4.bx.a();
                java.util.Map map2 = (java.util.Map) himVar4.bz.a();
                aooh.f(map, "allSubpackaged");
                aooh.f(map2, "legacyProperties");
                aigb aigbVar = new aigb(4);
                ailj ailjVarK = aikjVar.e().k();
                while (ailjVarK.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) ailjVarK.next();
                    aigbVar.i(agab.aN(aigfVarFB, (ahch) entry.getKey()), new adbi((aoin) entry.getValue(), 14));
                }
                ailj ailjVarK2 = aikjVarHh.e().k();
                while (ailjVarK2.hasNext()) {
                    java.util.Map.Entry entry2 = (java.util.Map.Entry) ailjVarK2.next();
                    aigbVar.i(agab.aN(aigfVarFB, (ahch) entry2.getKey()), new nya((aoin) entry2.getValue(), 17));
                }
                aikj aikjVarE = aigbVar.e(true);
                aikj aikjVar2 = aikjVarE;
                if (!map.keySet().containsAll(aikjVar2.f())) {
                    throw new java.lang.IllegalStateException("Parameters provided for mendel package not in use. Known packages: " + map.keySet() + ", params provided: " + aikjVar2.f());
                }
                aikh aikhVarF = aikjVar2.f();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                ailj ailjVarK3 = aikhVarF.k();
                while (ailjVarK3.hasNext()) {
                    java.lang.Object next = ailjVarK3.next();
                    if (map2.keySet().contains((java.lang.String) next)) {
                        arrayList.add(next);
                    }
                }
                if (arrayList.isEmpty()) {
                    return aikjVarE;
                }
                arrayList.toString();
                throw new java.lang.IllegalStateException("Packages cannot use both @PhenotypeApplicationSpecificProperties and @PhenotypeRuntimeProperties. Conflicting packages: ".concat(arrayList.toString()));
            case 1304:
                defpackage.him himVar5 = this.a;
                return new lkf(himVar5.mA(), (ajct) himVar5.r.a(), 2);
            case 1305:
                defpackage.him himVar6 = this.a;
                aikj aikjVar3 = aikj.b;
                aigf aigfVarFB2 = himVar6.fB();
                java.util.Map map3 = (java.util.Map) himVar6.bx.a();
                java.util.Map map4 = (java.util.Map) himVar6.bz.a();
                aooh.f(map3, "allSubpackaged");
                aooh.f(map4, "legacyProperties");
                aigb aigbVar2 = new aigb(4);
                ailj ailjVarK4 = aikjVar3.e().k();
                while (ailjVarK4.hasNext()) {
                    java.util.Map.Entry entry3 = (java.util.Map.Entry) ailjVarK4.next();
                    aigbVar2.i(agab.aN(aigfVarFB2, (ahch) entry3.getKey()), ((aoin) entry3.getValue()).a());
                }
                aikj aikjVarE2 = aigbVar2.e(true);
                aikj aikjVar4 = aikjVarE2;
                if (!map3.keySet().containsAll(aikjVar4.f())) {
                    throw new java.lang.IllegalStateException("Parameters provided for mendel package not in use. Known packages: " + map3.keySet() + ", params provided: " + aikjVar4.f());
                }
                aikh aikhVarF2 = aikjVar4.f();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                ailj ailjVarK5 = aikhVarF2.k();
                while (ailjVarK5.hasNext()) {
                    java.lang.Object next2 = ailjVarK5.next();
                    if (map4.keySet().contains((java.lang.String) next2)) {
                        arrayList2.add(next2);
                    }
                }
                if (arrayList2.isEmpty()) {
                    return aikjVarE2;
                }
                arrayList2.toString();
                throw new java.lang.IllegalStateException("Packages cannot use both @PhenotypeApplicationSpecificProperties and @PhenotypeRuntimeProperties. Conflicting packages: ".concat(arrayList2.toString()));
            case 1306:
                alfb alfbVarC = ((apnt) this.a.sz().a.a()).b("com.google.android.dialer.directboot", "45631280").c();
                aooc.ap(alfbVarC);
                return alfbVarC;
            case 1307:
                return java.lang.Long.valueOf(((apnt) this.a.sz().a.a()).b("com.google.android.dialer.directboot", "45631279").b());
            case 1308:
                return jsl.j(this.a.gr());
            case 1309:
                return this.a.qc().h(jsl.i());
            case 1310:
                return jsl.o(this.a.ym);
            case 1311:
                defpackage.him himVar7 = this.a;
                return new rjd((android.content.Context) himVar7.s.a(), (rjb) himVar7.lP.a(), (aoss) himVar7.cb.a());
            case 1312:
                return jsl.k(this.a.gu());
            case 1313:
                return this.a.qc().h(zja.a("CallSpecificPsdData", olw.a).a());
            case 1314:
                defpackage.him himVar8 = this.a;
                amyz amyzVar = himVar8.yw;
                smx smxVarBH = himVar8.bH();
                amyz amyzVar2 = himVar8.yx;
                aooh.f(amyzVar, "listPhoneNumbersSynclet");
                aooh.f(amyzVar2, "enablePatrickDarkLaunch");
                if (!((java.lang.Boolean) amyzVar2.a()).booleanValue() && !smxVarBH.a()) {
                    return ahlc.a;
                }
                rmg rmgVar = new rmg(amyzVar, 7);
                ahkv ahkvVar = new ahkv();
                ahkvVar.c(24L, java.util.concurrent.TimeUnit.HOURS);
                ahkvVar.b(new ahky(ahkz.a, -1L));
                ahkvVar.b(new ahky(ahkz.c, -1L));
                return agab.aB(ahkvVar.a(), rmgVar);
            case 1315:
                defpackage.him himVar9 = this.a;
                return new sdq((aoss) himVar9.cb.a(), himVar9.bC());
            case 1316:
                ajni ajniVar = new ajni((byte[]) null);
                ajniVar.e(akoe.O);
                return ajniVar.d();
            case 1317:
                sdg sdgVarX = ((com.android.dialer.patrick.impl.security.storage.room.WhitePagesDatabase) this.a.ys.a()).x();
                if (sdgVarX == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return sdgVarX;
            case 1318:
                defpackage.him himVar10 = this.a;
                com.android.dialer.patrick.impl.security.storage.room.WhitePagesDatabase whitePagesDatabaseO = himVar10.pQ().o((ahku) himVar10.yr.a(), com.android.dialer.patrick.impl.security.storage.room.WhitePagesDatabase.class, new java.lang.Object[0]);
                if (whitePagesDatabaseO == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return whitePagesDatabaseO;
            case 1319:
                ahkt ahktVarA = ahku.a();
                ahktVarA.a = "whitepages.db";
                return ahktVarA.a();
            case 1320:
                return new ipc((byte[]) null, (short[]) null);
            case 1321:
                return this.a.qc().h(jsl.p());
            case 1322:
                return java.lang.Boolean.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45746217").e());
            case 1323:
                defpackage.him himVar11 = this.a;
                return jsl.h(himVar11.uQ, himVar11.yz, himVar11.yA, himVar11.yB);
            case 1324:
                return java.lang.Boolean.valueOf(((apnt) this.a.rz().a.a()).b("com.google.android.dialer.directboot", "45725008").e());
            case 1325:
                return java.lang.Long.valueOf(((apnt) this.a.rz().a.a()).b("com.google.android.dialer.directboot", "45643487").b());
            case 1326:
                defpackage.him himVar12 = this.a;
                return new defpackage.nxq((zjx) himVar12.kO.a(), (ajct) himVar12.r.a());
            case 1327:
                defpackage.him himVar13 = this.a;
                return jsl.g(himVar13.uQ, himVar13.yz, himVar13.yD, himVar13.yE);
            case 1328:
                return java.lang.Long.valueOf(((apnt) this.a.rz().a.a()).b("com.google.android.dialer.directboot", "45692518").b());
            case 1329:
                defpackage.him himVar14 = this.a;
                return new defpackage.nxs((zjx) himVar14.kO.a(), (ajct) himVar14.r.a());
            case 1330:
                defpackage.him himVar15 = this.a;
                amyz amyzVar3 = himVar15.yQ;
                amyz amyzVar4 = himVar15.zK;
                amyz amyzVar5 = himVar15.zL;
                aooh.f(amyzVar3, "capabilityPublisherSyncletProvider");
                aooh.f(amyzVar4, "enableSyncletRegistration");
                aooh.f(amyzVar5, "syncletRunningFrequencyInHour");
                if (!((java.lang.Boolean) amyzVar4.a()).booleanValue()) {
                    return ahlc.a;
                }
                ahkv ahkvVar2 = new ahkv();
                java.lang.Object objA = amyzVar5.a();
                aooh.e(objA, "get(...)");
                ahkvVar2.c(((java.lang.Number) objA).longValue(), java.util.concurrent.TimeUnit.HOURS);
                return agab.aB(ahkvVar2.a(), amyzVar3);
            case 1331:
                defpackage.him himVar16 = this.a;
                return new sna(himVar16.dL(), (aoss) himVar16.cb.a(), himVar16.pu());
            case 1332:
                defpackage.him himVar17 = this.a;
                apni apniVarPa = himVar17.pa();
                android.content.Context context = (android.content.Context) himVar17.s.a();
                ajct ajctVar = (ajct) himVar17.L.a();
                aooh.f(context, "appContext");
                aooh.f(ajctVar, "backgroundExecutor");
                return apniVarPa.b(anrk.a(new android.content.ComponentName("com.google.android.apps.messaging", "com.google.android.apps.messaging.external.p2p.impl.ExternalRcsEndpointService")), anro.a, ajsz.Z(context, new aile("com.google.android.apps.messaging"), ajctVar), anrq.a);
            case 1333:
                defpackage.him himVar18 = this.a;
                return aigf.l(zdv.e, himVar18.kK(), zdv.d, himVar18.la());
            case 1334:
                defpackage.him himVar19 = this.a;
                return defpackage.lhj.o(himVar19.ax(), himVar19.pK(), himVar19.ij());
            case 1335:
                defpackage.him himVar20 = this.a;
                return new zgx((aolr) himVar20.bY.a(), (abtr) himVar20.yH.a(), himVar20.dz(), (rai) himVar20.yK.a(), himVar20.oq());
            case 1336:
                defpackage.him himVar21 = this.a;
                return new abtr((aolr) himVar21.bY.a(), (aoss) himVar21.cb.a(), (apni) himVar21.eY.a());
            case 1337:
                raiVar = new rai(this, (byte[]) null, (short[]) null);
                break;
            case 1338:
                raiVar = new rai(this, (int[]) null);
                break;
            case 1339:
                raiVar = new rai(this, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
                break;
            case 1340:
                return java.lang.Boolean.valueOf(((apnt) this.a.rF().a.a()).b("com.google.android.dialer.directboot", "45831347").e());
            case 1341:
                return java.lang.Boolean.valueOf(((apnt) this.a.rF().a.a()).b("com.google.android.dialer.directboot", "45854190").e());
            case 1342:
                defpackage.him himVar22 = this.a;
                return defpackage.lhj.p(himVar22.aY(), himVar22.pK());
            case 1343:
                return this.a.qc().h(defpackage.lhj.h());
            case 1344:
                defpackage.him himVar23 = this.a;
                return new sng((aoss) himVar23.cb.a(), himVar23.bI());
            case 1345:
                zer zerVarY = ((com.google.android.callingshared.peertopeer.capabilities.registrar.impl.cache.db.DialerCapabilityDatabase) this.a.yS.a()).y();
                aooc.ap(zerVarY);
                return zerVarY;
            case 1346:
                defpackage.him himVar24 = this.a;
                com.google.android.callingshared.peertopeer.capabilities.registrar.impl.cache.db.DialerCapabilityDatabase dialerCapabilityDatabaseO = himVar24.pQ().o((ahku) himVar24.yR.a(), com.google.android.callingshared.peertopeer.capabilities.registrar.impl.cache.db.DialerCapabilityDatabase.class, new java.lang.Object[0]);
                aooc.ap(dialerCapabilityDatabaseO);
                return dialerCapabilityDatabaseO;
            case 1347:
                ahkt ahktVarA2 = ahku.a();
                ahktVarA2.a = "peertopeer.cache.capability_db";
                ahktVarA2.d = new ahkp(0);
                ahktVarA2.e = new ahkk(3, 2);
                return ahktVarA2.a();
            case 1348:
                return java.lang.Boolean.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45803099").e());
            case 1349:
                return java.lang.Boolean.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45803107").e());
            case 1350:
                return java.lang.Boolean.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45813155").e());
            case 1351:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45794885").b());
            case 1352:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45794886").b());
            case 1353:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45794887").b());
            case 1354:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45794888").b());
            case 1355:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45794889").b());
            case 1356:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45803101").b());
            case 1357:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45803102").b());
            case 1358:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45803103").b());
            case 1359:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45803104").b());
            case 1360:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45803105").b());
            case 1361:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45803109").b());
            case 1362:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45803110").b());
            case 1363:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45803111").b());
            case 1364:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45803112").b());
            case 1365:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45803113").b());
            case 1366:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45813156").b());
            case 1367:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45813158").b());
            case 1368:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45813159").b());
            case 1369:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45813160").b());
            case 1370:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45813161").b());
            case 1371:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45803611").b());
            case 1372:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45803612").b());
            case 1373:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45803613").b());
            case 1374:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45813157").b());
            case 1375:
                return java.lang.Boolean.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45824578").e());
            case 1376:
                zek zekVarX = ((com.google.android.callingshared.peertopeer.capabilities.registrar.impl.cache.db.DialerCapabilityDatabase) this.a.yS.a()).x();
                aooc.ap(zekVarX);
                return zekVarX;
            case 1377:
                return java.lang.Boolean.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45794884").e());
            case 1378:
                defpackage.him himVar25 = this.a;
                return new snt((aoss) himVar25.fh.a(), himVar25.ou(), (zey) himVar25.zC.a(), himVar25.dM(), (aazc) himVar25.l.a());
            case 1379:
                defpackage.him himVar26 = this.a;
                return new zhp((android.telecom.TelecomManager) himVar26.ci.a(), (aolr) himVar26.bY.a());
            case 1380:
                zey zeyVarX = ((com.google.android.callingshared.peertopeer.capabilities.registrar.impl.cache.db.DialerHasRcsDatabase) this.a.zB.a()).x();
                aooc.ap(zeyVarX);
                return zeyVarX;
            case 1381:
                defpackage.him himVar27 = this.a;
                com.google.android.callingshared.peertopeer.capabilities.registrar.impl.cache.db.DialerHasRcsDatabase dialerHasRcsDatabaseO = himVar27.pQ().o((ahku) himVar27.zA.a(), com.google.android.callingshared.peertopeer.capabilities.registrar.impl.cache.db.DialerHasRcsDatabase.class, new java.lang.Object[0]);
                aooc.ap(dialerHasRcsDatabaseO);
                return dialerHasRcsDatabaseO;
            case 1382:
                ahkt ahktVarA3 = ahku.a();
                ahktVarA3.a = "peertopeer.cache.has_rcs_db";
                ahktVarA3.d = new ahkp(0);
                ahktVarA3.e = new ahkk(3, 2);
                return ahktVarA3.a();
            case 1383:
                defpackage.him himVar28 = this.a;
                return new rdp(himVar28.zv, himVar28.zG, himVar28.zH, himVar28.zI);
            case 1384:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45803761").b());
            case 1385:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45744986").b());
            case 1386:
                return java.lang.Boolean.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45752266").e());
            case 1387:
                return java.lang.Boolean.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45860934").e());
            case 1388:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45794890").b());
            case 1389:
                defpackage.him himVar29 = this.a;
                amyz amyzVar6 = himVar29.zD;
                amyz amyzVar7 = himVar29.zN;
                aooh.f(amyzVar6, "localNetworkIdentityHasRcsSyncletProvider");
                aooh.f(amyzVar7, "syncletRunningFrequencyInHour");
                ahkv ahkvVar3 = new ahkv();
                java.lang.Object objA2 = amyzVar7.a();
                aooh.e(objA2, "get(...)");
                ahkvVar3.c(((java.lang.Number) objA2).longValue(), java.util.concurrent.TimeUnit.HOURS);
                return agab.aB(ahkvVar3.a(), amyzVar6);
            case 1390:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45794891").b());
            case 1391:
                defpackage.him himVar30 = this.a;
                return ttj.K(himVar30.zy, himVar30.zP, himVar30.yU, himVar30.yV, himVar30.yW, himVar30.zQ, himVar30.zR, himVar30.zS);
            case 1392:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45794892").b());
            case 1393:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45803106").b());
            case 1394:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45803114").b());
            case 1395:
                return java.lang.Long.valueOf(((apnt) this.a.qW().a.a()).b("com.google.android.dialer.directboot", "45813162").b());
            case 1396:
                j$.util.Optional optionalOf = j$.util.Optional.of(this.a.fg());
                aooh.f(optionalOf, "synclet");
                ahlc ahlcVar = (ahlc) aooh.p(optionalOf, ahlc.a);
                aooc.ap(ahlcVar);
                return ahlcVar;
            case 1397:
                defpackage.him himVar31 = this.a;
                return new ahed((apdi) himVar31.bf.a(), himVar31.bi, himVar31.bj, (aoss) himVar31.fh.a(), j$.util.Optional.of((ahid) himVar31.bl.a()));
            case 1398:
                amyz amyzVar8 = this.a.Ad;
                aooh.f(amyzVar8, "synclet");
                ahkv ahkvVar4 = new ahkv();
                ahkvVar4.c(12L, java.util.concurrent.TimeUnit.HOURS);
                ahkx ahkxVar = new ahkx();
                ahkxVar.a = ahkz.b;
                ahkvVar4.b(ahkxVar.a());
                return agab.aB(ahkvVar4.a(), amyzVar8);
            case 1399:
                defpackage.him himVar32 = this.a;
                return new uxe((aoss) himVar32.cb.a(), himVar32.ng(), (rai) himVar32.Aa.a(), himVar32.jb(), (rlv) himVar32.fq.a(), himVar32.Ac);
            default:
                throw new java.lang.AssertionError(i);
        }
        return raiVar;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v152, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v181, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v193, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v234, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v241, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v248, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v255, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v262, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v269, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v282, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v289, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v296, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v310, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v319, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [aoin, java.lang.Object] */
    private final java.lang.Object h() {
        rwo agsaVar;
        pgi adaiVar;
        vew aileVar;
        rwq usjVar;
        int i = this.b;
        switch (i) {
            case 1400:
                return aihd.o(this.a.hs());
            case 1401:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45661540").e());
            case 1402:
                return java.lang.Boolean.valueOf(((apnt) this.a.pn().b.a()).b("com.google.android.dialer.directboot", "45781486").e());
            case 1403:
                return new rai(this, (char[]) null, (byte[]) null, (byte[]) null);
            case 1404:
                return java.lang.Boolean.valueOf(((apnt) this.a.rU().a.a()).b("com.google.android.dialer.directboot", "45752332").e());
            case 1405:
                return java.lang.Boolean.valueOf(((apnt) this.a.rU().a.a()).b("com.google.android.dialer.directboot", "45844105").e());
            case 1406:
                return java.lang.Boolean.valueOf(((apnt) this.a.rU().a.a()).b("com.google.android.dialer.directboot", "45824765").e());
            case 1407:
                return agwm.b(this.a.Af);
            case 1408:
                defpackage.him himVar = this.a;
                agsaVar = new agsa((android.content.Context) himVar.s.a(), aigf.k("SqliteKeyValueCache:PhoneLookupCp2DefaultDirectoryCache:Singleton.db", "SqliteKeyValueCache:PhoneLookupCp2DefaultDirectoryCache:Singleton.db"), (ajct) himVar.L.a(), (ajwr) himVar.bE.a());
                return agsaVar;
            case 1409:
                amyz amyzVar = this.a.Ao;
                ahkv ahkvVar = new ahkv();
                ahkvVar.c(3L, java.util.concurrent.TimeUnit.DAYS);
                ahkx ahkxVar = new ahkx();
                ahkxVar.a = ahkz.a;
                ahkxVar.b(4L, java.util.concurrent.TimeUnit.DAYS);
                ahkvVar.b(ahkxVar.a());
                return agab.aB(ahkvVar.a(), amyzVar);
            case 1410:
                defpackage.him himVar2 = this.a;
                return new agqp((adag) himVar2.bM.a(), (agpb) himVar2.Am.a(), himVar2.eK(), (ajct) himVar2.r.a(), (ajct) himVar2.L.a(), himVar2.or(), (ajwr) himVar2.An.a());
            case 1411:
                defpackage.him himVar3 = this.a;
                amyz amyzVar2 = himVar3.Aj;
                adag adagVar = (adag) himVar3.bM.a();
                afhf afhfVar = (afhf) himVar3.Ak.a();
                return new agpb(amyzVar2, adagVar, afhfVar, himVar3.Al, himVar3.a(), (java.util.concurrent.Executor) himVar3.r.a());
            case 1412:
                defpackage.him himVar4 = this.a;
                adaiVar = new adai(himVar4.Ai, (java.util.concurrent.Executor) himVar4.L.a());
                return adaiVar;
            case 1413:
                return aihd.o(this.a.ht());
            case 1414:
                throw new java.lang.IllegalStateException("TikTokGoogleOwnersProviderMarker not meant to be injected");
            case 1415:
                defpackage.him himVar5 = this.a;
                android.content.Context context = (android.content.Context) himVar5.s.a();
                ahys ahysVarH = ahyn.h((android.os.Handler) himVar5.qb.a());
                ahys ahysVarH2 = ahyn.h((java.util.concurrent.ExecutorService) himVar5.as.a());
                ahys ahysVarH3 = ahyn.h((java.util.concurrent.ScheduledExecutorService) himVar5.L.a());
                aemi aemiVar = new aemi();
                aemiVar.a = context.getApplicationContext();
                aemiVar.b = (java.util.concurrent.ExecutorService) ahysVarH2.a;
                aemiVar.c = (java.util.concurrent.ScheduledExecutorService) ahysVarH3.a;
                aemiVar.d = (android.os.Handler) ahysVarH.a;
                aemiVar.h = null;
                ahvr.ci(aemiVar.a);
                if (aemiVar.b == null) {
                    java.util.concurrent.ExecutorService executorServiceNewCachedThreadPool = aemiVar.c;
                    if (executorServiceNewCachedThreadPool == null) {
                        executorServiceNewCachedThreadPool = java.util.concurrent.Executors.newCachedThreadPool((java.util.concurrent.ThreadFactory) aemiVar.f.eZ());
                    }
                    aemiVar.b = executorServiceNewCachedThreadPool;
                }
                if (aemiVar.c == null) {
                    aemiVar.c = java.util.concurrent.Executors.newSingleThreadScheduledExecutor((java.util.concurrent.ThreadFactory) aemiVar.f.eZ());
                }
                return new aenc(aemiVar.b, new aeex(aemiVar, 3), 1);
            case 1416:
                defpackage.him himVar6 = this.a;
                return himVar6.pX().t(defpackage.him.iJ(), (aogc) himVar6.bq.a());
            case 1417:
                aileVar = new aile(new apnt((aogc) this.a.fo.a()));
                return aileVar;
            case 1418:
                return new ajwr();
            case 1419:
                return new ahle((android.content.Context) this.a.s.a(), 1);
            case 1420:
                defpackage.him himVar7 = this.a;
                adaiVar = new ahle((android.content.Context) himVar7.s.a(), himVar7.j(), 0);
                return adaiVar;
            case 1421:
                defpackage.him himVar8 = this.a;
                adaiVar = new ahle((android.content.Context) himVar8.s.a(), himVar8.j(), 2, (byte[]) null);
                return adaiVar;
            case 1422:
                return aihd.o(this.a.hq());
            case 1423:
                defpackage.him himVar9 = this.a;
                return new akxm((aogc) himVar9.kJ.a(), java.lang.Boolean.valueOf(himVar9.ix()), himVar9.At, (ajct) himVar9.r.a(), (ahid) himVar9.bl.a());
            case 1424:
                defpackage.him himVar10 = this.a;
                android.app.Application application = (android.app.Application) himVar10.be.a();
                java.util.concurrent.ScheduledExecutorService scheduledExecutorService = (java.util.concurrent.ScheduledExecutorService) himVar10.L.a();
                zzd zzdVar = new zzd(application, "STREAMZ_TIKTOK", (java.lang.String) null);
                ((zyx) zzdVar).k = 3;
                adaiVar = new ahiy(scheduledExecutorService, new ajxw(zzdVar, "STREAMZ_TIKTOK"), application);
                return adaiVar;
            case 1425:
                return aihd.o(this.a.hp());
            case 1426:
                defpackage.him himVar11 = this.a;
                aogc aogcVar = (aogc) himVar11.kJ.a();
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(himVar11.ix());
                return new akxm(aogcVar, boolValueOf, himVar11.At, (ajct) himVar11.r.a(), (ahid) himVar11.bl.a());
            case 1427:
                defpackage.him himVar12 = this.a;
                aile aileVar2 = ((java.lang.Boolean) ahyn.h(java.lang.Boolean.valueOf(himVar12.ix())).a).booleanValue() ? new aile((akxm) himVar12.Ay.a()) : aikn.a;
                aooc.ap(aileVar2);
                return aihd.o(aileVar2);
            case 1428:
                defpackage.him himVar13 = this.a;
                aogc aogcVar2 = (aogc) himVar13.kJ.a();
                ahyn ahynVarH = ahyn.h(java.lang.Boolean.valueOf(himVar13.ix()));
                return new akxm(aogcVar2, ahynVarH, (ajct) himVar13.r.a(), ahyn.h(himVar13.At), ahyn.h((ahid) himVar13.bl.a()));
            case 1429:
                return new java.security.SecureRandom();
            case 1430:
                defpackage.him himVar14 = this.a;
                aihb aihbVarI = aihd.i(4);
                defpackage.him himVar15 = himVar14.b;
                aihbVarI.i(new agpg((agno) himVar15.AD.a(), 1));
                aikn aileVar3 = !((java.lang.Boolean) himVar15.bL.a()).booleanValue() ? aikn.a : new aile(new agpg(himVar15.AB, 2));
                aooc.ap(aileVar3);
                aihbVarI.k(aileVar3);
                aihbVarI.i(new agpg((aogc) himVar15.fo.a(), 0));
                aihbVarI.i(himVar15.eH());
                return aihbVarI.h();
            case 1431:
                defpackage.him himVar16 = this.a;
                adaiVar = new agno((xtq) himVar16.fX(), (ajcu) himVar16.aN.a());
                return adaiVar;
            case 1432:
                defpackage.him himVar17 = this.a;
                return aihd.r(new agqq(himVar17.ok()), himVar17.eN());
            case 1433:
                ahbz ahbzVar = (ahbz) this.a.AG.a();
                aooh.f(ahbzVar, "configurationUpdater");
                aileVar = new aile(new ahbg(ahbzVar, 0));
                return aileVar;
            case 1434:
                defpackage.him himVar18 = this.a;
                adaiVar = new agow((adag) himVar18.bM.a(), (agpb) himVar18.Am.a());
                return adaiVar;
            case 1435:
                defpackage.him himVar19 = this.a;
                return new ahbv((j$.util.Optional) himVar19.bt.a(), (java.util.concurrent.ScheduledExecutorService) himVar19.r.a(), (ahbq) himVar19.AJ.a(), (java.util.Map) himVar19.bx.a(), (aexi) himVar19.aK.a(), himVar19.jw(), (aewq) himVar19.br.a());
            case 1436:
                adaiVar = new ahbc(defpackage.him.iP(), aikn.a);
                return adaiVar;
            case 1437:
                adaiVar = new ahbc(defpackage.him.iQ(), aikn.a);
                return adaiVar;
            case 1438:
                adaiVar = new ahbc(defpackage.him.iR(), aikn.a);
                return adaiVar;
            case 1439:
                adaiVar = new ahbc(defpackage.him.iS(), aikn.a);
                return adaiVar;
            case 1440:
                adaiVar = new ahbc(defpackage.him.iT(), aikn.a);
                return adaiVar;
            case 1441:
                adaiVar = new ahbc(defpackage.him.iU(), aikn.a);
                return adaiVar;
            case 1442:
                adaiVar = new ahbc(defpackage.him.iV(), aikn.a);
                return adaiVar;
            case 1443:
                return java.lang.Double.valueOf(((apnt) this.a.rL().a.a()).b("com.google.android.dialer", "tiktok_tracing_sampling_probability").a());
            case 1444:
                defpackage.him himVar20 = this.a;
                aihb aihbVarI2 = aihd.i(2);
                aikn aiknVar = aikn.a;
                if (aiknVar == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                aihbVarI2.k(aiknVar);
                defpackage.him himVar21 = himVar20.b;
                ahst ahstVar = new ahst(new aeur(ahyn.h(himVar21.dQ), 0), himVar21.dS);
                ahou ahouVarC = ahot.a.c();
                ahouVarC.a(ahst.f, ahstVar);
                aihbVarI2.i(ahouVarC.f());
                return aihbVarI2.h();
            case 1445:
                defpackage.him himVar22 = this.a;
                agsaVar = new lpe(himVar22.AY, (zzx) himVar22.gq(), (rlv) himVar22.fq.a(), (ajct) himVar22.r.a());
                return agsaVar;
            case 1446:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer", "flag_direct_boot_access_sentinel").e());
            case 1447:
                defpackage.him himVar23 = this.a;
                return new aeao(himVar23.sw, (aduu) himVar23.qJ.a(), (adao) himVar23.rk.a(), (adzh) himVar23.st.a());
            case 1448:
                return java.lang.Boolean.valueOf(((apnt) this.a.rq().a.a()).b("com.google.android.dialer", "enable_qresampler").e());
            case 1449:
                defpackage.him himVar24 = this.a;
                adaiVar = new aeha(himVar24.nK(), (ajct) himVar24.rJ.a());
                return adaiVar;
            case 1450:
                defpackage.him himVar25 = this.a;
                ysu ysuVar = (ysu) himVar25.ly.a();
                aoss aossVar = (aoss) himVar25.fh.a();
                aoss aossVar2 = (aoss) himVar25.cb.a();
                return new yui(ysuVar, aossVar, aossVar2, new defpackage.abds(), himVar25.he(), himVar25.oq());
            case 1451:
                return new yup(2);
            case 1452:
                return new yup(0);
            case 1453:
                return new yup(1);
            case 1454:
                return java.lang.Boolean.valueOf(((apnt) this.a.rQ().a.a()).b("com.google.android.callcoreshared.directboot", "45834485").e());
            case 1455:
                return new defpackage.jhw();
            case 1456:
                defpackage.him himVar26 = this.a;
                java.util.Map mapHg = himVar26.hg();
                java.util.Map mapHf = himVar26.hf();
                defpackage.him.jh();
                adaiVar = new aljf(mapHg, mapHf);
                return adaiVar;
            case 1457:
                return new alzz(new amae());
            case 1458:
                return aizq.a;
            case 1459:
                aimz aimzVar = alja.a;
                return new aliz();
            case 1460:
                return new alji();
            case 1461:
                aimz aimzVar2 = alja.a;
                return new aliz();
            case 1462:
                defpackage.him himVar27 = this.a;
                agsaVar = new defpackage.nzg(himVar27.sN(), (ajct) himVar27.L.a(), (ajct) himVar27.r.a(), himVar27.to());
                return agsaVar;
            case 1463:
                return this.a.qc().h(zja.a("EligibilityExpansionDataStore", defpackage.nzk.a).a());
            case 1464:
                defpackage.him himVar28 = this.a;
                return new rwi((android.content.Context) himVar28.s.a(), (ajct) himVar28.L.a(), (ajct) himVar28.r.a(), himVar28.d(), (rwo) himVar28.Br.a(), (mgu) himVar28.ch.a(), (zjv) himVar28.cf.a());
            case 1465:
                defpackage.him himVar29 = this.a;
                agsaVar = new rwo((android.content.Context) himVar29.s.a(), (ajct) himVar29.L.a(), himVar29.d(), himVar29.nO());
                return agsaVar;
            case 1466:
                defpackage.him himVar30 = this.a;
                return new utf((ajct) himVar30.L.a(), (ajct) himVar30.r.a(), himVar30.qD(), new usf((ajct) himVar30.L.a(), (ajct) himVar30.r.a(), (usj) himVar30.Bv.a()), (usj) himVar30.Bv.a(), himVar30.Bw, (android.content.Context) himVar30.s.a(), himVar30.st());
            case 1467:
                defpackage.him himVar31 = this.a;
                usjVar = new usj((ajcu) himVar31.r.a(), (usl) himVar31.Bt.a(), dpy.p((ecx) himVar31.Bu.a(), (ajct) himVar31.r.a()));
                return usjVar;
            case 1468:
                return new usl(this.a.sN());
            case 1469:
                return this.a.qc().h(zja.a("TimeKeeperDatabaseMetaData", usm.a).a());
            case 1470:
                defpackage.him himVar32 = this.a;
                adaiVar = new afpl((ajct) himVar32.L.a(), java.util.Arrays.asList(new afeh(new ajxw((android.content.Context) himVar32.s.a()))));
                return adaiVar;
            case 1471:
                defpackage.him himVar33 = this.a;
                return new vup((android.content.Context) himVar33.s.a(), (vze) himVar33.gO(), himVar33.bd(), (ajct) himVar33.r.a(), (zjs) himVar33.cn.a(), (sou) himVar33.vr.a(), himVar33.cn());
            case 1472:
                defpackage.him himVar34 = this.a;
                vyy vyyVar = new vyy((aolr) himVar34.bg.a(), (aoss) himVar34.cb.a(), himVar34.dn(), (ojo) himVar34.oF.a(), (android.content.Context) himVar34.s.a());
                ahkl ahklVarA = zja.a("VoicemailStatusData", vzj.a);
                ahklVarA.b(vyyVar);
                return himVar34.qc().h(ahklVarA.a());
            case 1473:
                defpackage.him himVar35 = this.a;
                return new vzc((ojo) himVar35.oF.a(), (aogc) himVar35.fo.a(), (ajct) himVar35.r.a(), (ahpz) himVar35.bb.a(), new vzd((aogc) himVar35.fo.a(), himVar35.tA()), himVar35.be());
            case 1474:
                return java.lang.Boolean.valueOf(((apnt) this.a.sw().a.a()).b("com.google.android.dialer.directboot", "45626716").e());
            case 1475:
                return java.lang.Boolean.valueOf(((apnt) this.a.sw().a.a()).b("com.google.android.dialer.directboot", "45858841").e());
            case 1476:
                return java.lang.Long.valueOf(((apnt) this.a.sw().a.a()).b("com.google.android.dialer.directboot", "45626718").b());
            case 1477:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45647457").e());
            case 1478:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45851135").e());
            case 1479:
                return java.lang.Boolean.valueOf(((apnt) this.a.rl().a.a()).b("com.google.android.dialer.directboot", "45833808").e());
            case 1480:
                defpackage.him himVar36 = this.a;
                usjVar = new rwq((android.content.Context) himVar36.s.a(), himVar36.d(), himVar36.nO());
                return usjVar;
            case 1481:
                defpackage.him himVar37 = this.a;
                ahhp ahhpVar = (ahhp) himVar37.rU.a();
                android.content.Context context2 = (android.content.Context) himVar37.s.a();
                java.lang.Object objGj = himVar37.gj();
                java.lang.Object objGk = himVar37.gk();
                aikn aiknVar2 = aikn.a;
                return new ops(ahhpVar, context2, (rsr) objGj, (ipc) objGk, (ajct) himVar37.r.a(), himVar37.BI, himVar37.BJ, himVar37.BK);
            case 1482:
                defpackage.him himVar38 = this.a;
                adaiVar = new pgi(himVar38.s, himVar38.ft);
                return adaiVar;
            case 1483:
                return java.lang.Boolean.valueOf(((apnt) this.a.rG().a.a()).b("com.google.android.dialer.directboot", "45780382").e());
            case 1484:
                return java.lang.Boolean.valueOf(((apnt) this.a.rG().a.a()).b("com.google.android.dialer.directboot", "45842755").e());
            case 1485:
                return java.lang.Boolean.valueOf(((apnt) this.a.rG().a.a()).b("com.google.android.dialer.directboot", "45855742").e());
            case 1486:
                defpackage.him himVar39 = this.a;
                aileVar = new kgl((ajct) himVar39.L.a(), (ojo) himVar39.oF.a(), himVar39.to, new zzx(himVar39.BP));
                return aileVar;
            case 1487:
                defpackage.him himVar40 = this.a;
                smx smxVarBH = himVar40.bH();
                amyz amyzVar3 = himVar40.BO;
                aooh.f(amyzVar3, "listenerProvider");
                aileVar = new aile(new zjm(amyzVar3, new pes(smxVarBH, 10)));
                return aileVar;
            case 1488:
                defpackage.him himVar41 = this.a;
                return new saf(himVar41.bF(), (aoss) himVar41.cb.a(), (sqo) himVar41.oJ.a(), (ahbv) himVar41.fg.a(), himVar41.jF(), himVar41.BN);
            case 1489:
                return java.lang.Boolean.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45811696").e());
            case 1490:
                zji zjiVar = zji.a;
                aooh.e(zjiVar, "getDefaultInstance(...)");
                return this.a.qc().h(zja.b("LastEmergencyCallTime", zjiVar, (java.lang.Iterable) null, (aonj) null, 12));
            case 1491:
                return java.lang.Long.valueOf(((apnt) this.a.qR().a.a()).b("com.google.android.dialershared.directboot", "45420185").b());
            case 1492:
                defpackage.him himVar42 = this.a;
                return himVar42.pX().t(zte.a("VvmNotificationData", vml.a).a(), (aogc) himVar42.bq.a());
            case 1493:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer", "prefer_offline_transcription_for_vvm_soda").e());
            case 1494:
                defpackage.him himVar43 = this.a;
                return himVar43.pX().t(zte.a("VvmJobStorage", vcl.a).a(), (aogc) himVar43.bq.a());
            case 1495:
                defpackage.him himVar44 = this.a;
                android.content.Context context3 = (android.content.Context) himVar44.s.a();
                java.lang.Object objGV = himVar44.gV();
                ahbv ahbvVarOz = himVar44.oz();
                vdq vdqVar = (vdq) himVar44.Cy.a();
                ajct ajctVar = (ajct) himVar44.r.a();
                ajct ajctVar2 = (ajct) himVar44.as.a();
                return new vea(context3, (vei) objGV, ahbvVarOz, vdqVar, ajctVar, ajctVar2, himVar44.be(), himVar44.DV, (vze) himVar44.gO(), (rlv) himVar44.fq.a(), himVar44.Dn, himVar44.DW, himVar44.dl(), himVar44.cM(), himVar44.DX, himVar44.DY);
            case 1496:
                return this.a.fx();
            case 1497:
                defpackage.him himVar45 = this.a;
                ajcu ajcuVar = (ajcu) himVar45.r.a();
                ahbv ahbvVarOz2 = himVar45.oz();
                zzx zzxVar = new zzx(himVar45.BY);
                aileVar = new vew(ajcuVar, ahbvVarOz2, zzxVar, new ven(new vej((ajct) himVar45.r.a()), (ajct) himVar45.r.a(), himVar45.BZ));
                return aileVar;
            case 1498:
                return this.a.fy();
            case 1499:
                defpackage.him himVar46 = this.a;
                return new vjr(himVar46.nU(), (ajct) himVar46.r.a(), (ajct) himVar46.as.a(), (zjs) himVar46.cn.a(), (rlv) himVar46.fq.a(), himVar46.BW, himVar46.cT(), (android.content.Context) himVar46.s.a());
            default:
                throw new java.lang.AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v105, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v113, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v121, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v140, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v149, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v177, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v189, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v197, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v205, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v236, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v267, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v275, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v283, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v291, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v303, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v311, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v337, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v345, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v353, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v361, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v376, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v384, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v392, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v400, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v415, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v422, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v430, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v438, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v446, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v454, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v462, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v491, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v499, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v507, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v515, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v523, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v531, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v539, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v547, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v555, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v563, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v571, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v579, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v73, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v81, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v89, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v97, types: [aoin, java.lang.Object] */
    private final java.lang.Object i() {
        aogc vglVar;
        vjv vdqVar;
        vkk vjyVar;
        int i = this.b;
        switch (i) {
            case 1500:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45653458").e());
            case 1501:
                return java.lang.Boolean.valueOf(this.a.qP().at());
            case 1502:
                defpackage.him himVar = this.a;
                vglVar = new vgl(himVar.Cb, himVar.Cc, himVar.Cd, himVar.Ce, himVar.Cf, (ajct) himVar.r.a(), defpackage.him.ni(), himVar.be(), new vgh(himVar.Cg, himVar.Ch, himVar.Ci, himVar.Cj, himVar.Ck, himVar.Cl, himVar.Cm, himVar.Cn, himVar.Co));
                return vglVar;
            case 1503:
                vbv vbvVarC = ((apnt) this.a.rA().a.a()).b("com.google.android.dialer.directboot", "45654087").c();
                aooc.ap(vbvVarC);
                return vbvVarC;
            case 1504:
                return java.lang.Boolean.valueOf(((apnt) this.a.qe().a.a()).b("com.google.android.dialer", "G__vvm_tmobile_us_allows_transcription").e());
            case 1505:
                alfa alfaVarC = ((apnt) this.a.ro().a.a()).b("com.google.android.dialer.directboot", "45726770").c();
                aooc.ap(alfaVarC);
                return alfaVarC;
            case 1506:
                return java.lang.Boolean.valueOf(((apnt) this.a.rA().a.a()).b("com.google.android.dialer.directboot", "45775499").e());
            case 1507:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45834501").e());
            case 1508:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45760935").e());
            case 1509:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45716057").e());
            case 1510:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45827492").e());
            case 1511:
                return java.lang.Boolean.valueOf(((apnt) this.a.rt().a.a()).b("com.google.android.dialer.directboot", "45785728").e());
            case 1512:
                return java.lang.Boolean.valueOf(((apnt) this.a.rt().a.a()).b("com.google.android.dialer.directboot", "45785729").e());
            case 1513:
                return java.lang.Boolean.valueOf(((apnt) this.a.rt().a.a()).b("com.google.android.dialer.directboot", "45785730").e());
            case 1514:
                return java.lang.Boolean.valueOf(((apnt) this.a.rt().a.a()).b("com.google.android.dialer.directboot", "45785731").e());
            case 1515:
                return java.lang.Boolean.valueOf(((apnt) this.a.rt().a.a()).b("com.google.android.dialer.directboot", "45785732").e());
            case 1516:
                return java.lang.Boolean.valueOf(((apnt) this.a.rt().a.a()).b("com.google.android.dialer.directboot", "45785733").e());
            case 1517:
                defpackage.him himVar2 = this.a;
                vglVar = new vdc(himVar2.Cq, himVar2.Cr, himVar2.Cs, (ajct) himVar2.as.a(), himVar2.be(), himVar2.cn(), defpackage.him.ni(), (vde) himVar2.Ct.a());
                return vglVar;
            case 1518:
                alfc alfcVarC = ((apnt) this.a.aZ.a()).b("com.google.android.dialer", "VisualVoicemailNonMvnoCarrierIdentifier__mccmnc_telus_canada").c();
                if (alfcVarC == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return alfcVarC;
            case 1519:
                yqf yqfVarC = ((apnt) this.a.pA().a.a()).b("com.google.android.dialer", "VisualVoicemailMvnoCarrierIdentifier__mccmnc_gid_el_telecom").c();
                if (yqfVarC == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return yqfVarC;
            case 1520:
                yqf yqfVarC2 = ((apnt) this.a.pA().a.a()).b("com.google.android.dialer", "VisualVoicemailMvnoCarrierIdentifier__mccmnc_gid_red_sim").c();
                if (yqfVarC2 == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return yqfVarC2;
            case 1521:
                return new vde();
            case 1522:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer", "G__vvm_network_capability_enabled").e());
            case 1523:
                ahko ahkoVarA = zte.a("VvmStatusSmsData", vgn.a).a();
                defpackage.him himVar3 = this.a;
                return himVar3.pX().t(ahkoVarA, (aogc) himVar3.bq.a());
            case 1524:
                return this.a.fu();
            case 1525:
                defpackage.him himVar4 = this.a;
                vglVar = new vjg((vgu) himVar4.CC.a(), himVar4.pt(), (aoss) himVar4.cb.a(), (aolr) himVar4.ca.a(), (ajct) himVar4.r.a(), himVar4.dk());
                return vglVar;
            case 1526:
                defpackage.him himVar5 = this.a;
                android.content.Context context = (android.content.Context) himVar5.s.a();
                ajcu ajcuVar = (ajcu) himVar5.as.a();
                ajct ajctVar = (ajct) himVar5.r.a();
                ajct ajctVar2 = (ajct) himVar5.L.a();
                rsr rsrVar = new rsr(himVar5.s, himVar5.Cx, (byte[]) null);
                java.lang.Object objGO = himVar5.gO();
                return new vgu(context, ajcuVar, ajctVar, ajctVar2, rsrVar, (vze) objGO, himVar5.cY(), (vdq) himVar5.Cy.a(), (zjv) himVar5.cf.a(), (aazc) himVar5.l.a(), (vix) himVar5.gS(), himVar5.BZ);
            case 1527:
                return java.lang.Boolean.valueOf(((apnt) this.a.ro().a.a()).b("com.google.android.dialer.directboot", "45841964").e());
            case 1528:
                defpackage.him himVar6 = this.a;
                vdqVar = new vdq(himVar6.fq, (ajct) himVar6.r.a());
                return vdqVar;
            case 1529:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45628578").e());
            case 1530:
                return java.lang.Long.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45628756").b());
            case 1531:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45787418").e());
            case 1532:
                defpackage.him himVar7 = this.a;
                vjyVar = new vjy((ajct) himVar7.r.a(), (vgu) himVar7.CC.a(), himVar7.dk());
                return vjyVar;
            case 1533:
                return this.a.fv();
            case 1534:
                defpackage.him himVar8 = this.a;
                vglVar = new vjm((android.content.Context) himVar8.s.a(), (aoss) himVar8.cb.a(), (aolr) himVar8.ca.a(), (aolr) himVar8.bY.a(), himVar8.bd(), himVar8.be());
                return vglVar;
            case 1535:
                return new vjt(1);
            case 1536:
                return new vjt(0);
            case 1537:
                defpackage.him himVar9 = this.a;
                vdqVar = new vjv(himVar9.cY(), (ajct) himVar9.r.a(), 1);
                return vdqVar;
            case 1538:
                defpackage.him himVar10 = this.a;
                vdqVar = new vjv(himVar10.cY(), (ajct) himVar10.r.a(), 0);
                return vdqVar;
            case 1539:
                return new vjt(2);
            case 1540:
                defpackage.him himVar11 = this.a;
                return aigf.m(vcs.g, anar.z(himVar11.CO), vcs.h, zjm.h(himVar11.CQ), vcs.i, zjm.h(himVar11.CQ));
            case 1541:
                defpackage.him himVar12 = this.a;
                vglVar = new vjj(himVar12.cZ(), (vjm) himVar12.CG.a(), himVar12.da(), (aolr) himVar12.ca.a(), (aoss) himVar12.cb.a(), (rlv) himVar12.fq.a());
                return vglVar;
            case 1542:
                return java.lang.Long.valueOf(((apnt) this.a.px().a.a()).b("com.google.android.dialer", "perform_provisioning_timeout_millis").b());
            case 1543:
                defpackage.him himVar13 = this.a;
                return sgg.g(new vkj((java.util.concurrent.ScheduledExecutorService) himVar13.r.a(), (ajct) himVar13.as.a(), himVar13.cY(), new defpackage.hgw(), himVar13.pt(), himVar13.dT(), (vix) himVar13.gS(), himVar13.bd(), himVar13.be(), himVar13.tc(), himVar13.CP), himVar13.cZ(), (ajct) himVar13.r.a(), (rlv) himVar13.fq.a(), (vgl) himVar13.Cp.a(), (vdc) himVar13.Cu.a(), himVar13.CL.a(), himVar13.da());
            case 1544:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45772877").e());
            case 1545:
                defpackage.him himVar14 = this.a.b;
                aigb aigbVarG = aigf.g(7);
                aigbVarG.i(vcs.g, anar.z(himVar14.CS));
                aigbVarG.i(vcs.c, zjm.h(himVar14.CT));
                aigbVarG.i(vcs.d, zjm.h(himVar14.CU));
                aigbVarG.i(vcs.e, zjm.h(himVar14.CU));
                aigbVarG.i(vcs.f, zjm.h(himVar14.CU));
                aigbVarG.i(vcs.h, zjm.h(himVar14.CV));
                aigbVarG.i(vcs.i, zjm.h(himVar14.CV));
                return aigbVarG.e(true);
            case 1546:
                return new vkd(1);
            case 1547:
                return new vjn();
            case 1548:
                return new vkd(0);
            case 1549:
                return new vkm();
            case 1550:
                return this.a.fw();
            case 1551:
                defpackage.him himVar15 = this.a;
                vglVar = new vji((android.content.Context) himVar15.s.a(), (aoss) himVar15.bZ.a(), (aolr) himVar15.bY.a(), himVar15.dT());
                return vglVar;
            case 1552:
                defpackage.him himVar16 = this.a;
                vglVar = new vke(himVar16.oz(), himVar16.cY(), (ajct) himVar16.as.a(), (ajcu) himVar16.r.a(), himVar16.be());
                return vglVar;
            case 1553:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45640217").e());
            case 1554:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45757540").e());
            case 1555:
                return java.lang.Long.valueOf(((apnt) this.a.px().a.a()).b("com.google.android.dialer", "VvmService__send_request_sms_timeout_millis").b());
            case 1556:
                return java.lang.Long.valueOf(((apnt) this.a.px().a.a()).b("com.google.android.dialer", "VvmService__get_response_sms_timeout_millis").b());
            case 1557:
                defpackage.him himVar17 = this.a;
                vjyVar = new vkx((jna) himVar17.gd(), himVar17.tg(), (ajct) himVar17.r.a());
                return vjyVar;
            case 1558:
                return java.lang.Long.valueOf(((apnt) this.a.rj().a.a()).b("com.google.android.dialer", "broadcast_receiver_strategy_inline_delay_foreground_millis").b());
            case 1559:
                return java.lang.Long.valueOf(((apnt) this.a.rj().a.a()).b("com.google.android.dialer", "broadcast_receiver_strategy_log_sampling_rate").b());
            case 1560:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialershared.directboot", "45822747").e());
            case 1561:
                return new tvn((byte[]) null);
            case 1562:
                ahko ahkoVarA2 = zte.a("VoicemailSettings", vtg.a).a();
                defpackage.him himVar18 = this.a;
                return himVar18.pX().t(ahkoVarA2, (aogc) himVar18.bq.a());
            case 1563:
                defpackage.him himVar19 = this.a;
                vglVar = new aogc((android.content.Context) himVar19.s.a(), (ajct) himVar19.as.a());
                return vglVar;
            case 1564:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45858854").e());
            case 1565:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45647423").e());
            case 1566:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45671577").e());
            case 1567:
                return java.lang.Double.valueOf(((apnt) this.a.ss().a.a()).b("com.google.android.dialer.directboot", "45430438").a());
            case 1568:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45776745").e());
            case 1569:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45760558").e());
            case 1570:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45799224").e());
            case 1571:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45760559").e());
            case 1572:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45815347").e());
            case 1573:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45778427").e());
            case 1574:
                java.lang.String strD = ((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45775519").d();
                aooc.ap(strD);
                return strD;
            case 1575:
                return java.lang.Long.valueOf(((apnt) this.a.px().a.a()).b("com.google.android.dialer", "max_tmo_rest_retrieving_voicemail_entries_per_page").b());
            case 1576:
                return java.lang.Long.valueOf(((apnt) this.a.px().a.a()).b("com.google.android.dialer", "max_tmo_rest_retrieving_voicemail_page").b());
            case 1577:
                return java.lang.Long.valueOf(((apnt) this.a.px().a.a()).b("com.google.android.dialer", "max_tmo_rest_voicemail_per_update_request").b());
            case 1578:
                return java.lang.Long.valueOf(((apnt) this.a.px().a.a()).b("com.google.android.dialer", "max_tmo_rest_voicemail_per_delete_request").b());
            case 1579:
                return java.lang.Long.valueOf(((apnt) this.a.rv().a.a()).b("com.google.android.dialer.directboot", "45388371").b());
            case 1580:
                return java.lang.Boolean.valueOf(((apnt) this.a.px().a.a()).b("com.google.android.dialer", "enable_auto_download_voicemail_over_cellular").e());
            case 1581:
                defpackage.him himVar20 = this.a;
                aigb aigbVarG2 = aigf.g(8);
                vcs vcsVar = vcs.c;
                defpackage.him himVar21 = himVar20.b;
                aigbVarG2.i(vcsVar, himVar21.lC());
                aigbVarG2.i(vcs.d, himVar21.lD());
                aigbVarG2.i(vcs.e, himVar21.lE());
                aigbVarG2.i(vcs.f, himVar21.lF());
                aigbVarG2.i(vcs.h, himVar21.lG());
                aigbVarG2.i(vcs.i, himVar21.lH());
                aigbVarG2.i(vcs.g, himVar21.lB());
                aigbVarG2.i(vcs.b, vfz.s(himVar21.de(), himVar21.dg()));
                return aigbVarG2.e(true);
            case 1582:
                defpackage.him himVar22 = this.a;
                aigb aigbVarG3 = aigf.g(7);
                vcs vcsVar2 = vcs.g;
                defpackage.him himVar23 = himVar22.b;
                amyz amyzVar = himVar23.DF;
                if (amyzVar == null) {
                    aooh.i("impl");
                }
                aigbVarG3.i(vcsVar2, new zjm(amyzVar, new vkc(2)));
                aigbVarG3.i(vcs.c, new zjm(himVar23.DF, new vkc(2)));
                aigbVarG3.i(vcs.d, new zjm(himVar23.DF, new vkc(2)));
                aigbVarG3.i(vcs.e, new zjm(himVar23.DF, new vkc(2)));
                aigbVarG3.i(vcs.f, new zjm(himVar23.DF, new vkc(2)));
                aigbVarG3.i(vcs.h, new zjm(himVar23.DG, new vkc(2)));
                aigbVarG3.i(vcs.i, new zjm(himVar23.DF, new vkc(2)));
                return aigbVarG3.e(true);
            case 1583:
                defpackage.him himVar24 = this.a;
                vjyVar = new vjs((android.content.Context) himVar24.s.a(), himVar24.cV(), himVar24.BD);
                return vjyVar;
            case 1584:
                defpackage.him himVar25 = this.a;
                vjyVar = new vkk((android.content.Context) himVar25.s.a(), (vjs) himVar25.DF.a(), himVar25.cV());
                return vjyVar;
            case 1585:
                defpackage.him himVar26 = this.a;
                aigb aigbVarG4 = aigf.g(8);
                vcs vcsVar3 = vcs.c;
                defpackage.him himVar27 = himVar26.b;
                aigbVarG4.i(vcsVar3, vfz.e(himVar27.gB()));
                aigbVarG4.i(vcs.d, vfz.d(himVar27.gB()));
                aigbVarG4.i(vcs.e, vfz.f(himVar27.gB()));
                aigbVarG4.i(vcs.f, vfz.g(himVar27.gB()));
                aigbVarG4.i(vcs.g, jsl.s(himVar27.gB()));
                aigbVarG4.i(vcs.h, vfz.h(himVar27.gB()));
                aigbVarG4.i(vcs.i, vfz.i(himVar27.gB()));
                aigbVarG4.i(vcs.b, vfz.q(himVar27.de(), himVar27.df()));
                return aigbVarG4.e(true);
            case 1586:
                return this.a.ft();
            case 1587:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45679083").e());
            case 1588:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45744096").e());
            case 1589:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45746830").e());
            case 1590:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45831486").e());
            case 1591:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45732562").e());
            case 1592:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45625356").e());
            case 1593:
                return java.lang.Boolean.valueOf(((apnt) this.a.ss().a.a()).b("com.google.android.dialer.directboot", "45477989").e());
            case 1594:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45644919").e());
            case 1595:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45774745").e());
            case 1596:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45658611").e());
            case 1597:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45729500").e());
            case 1598:
                return java.lang.Long.valueOf(((apnt) this.a.px().a.a()).b("com.google.android.dialer", "max_number_of_task_retries").b());
            case 1599:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45743958").e());
            default:
                throw new java.lang.AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v104, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v114, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v122, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v130, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v138, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v146, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v154, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v181, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v195, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v218, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v274, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v287, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v295, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v303, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v321, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v329, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v348, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v356, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v364, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v372, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v380, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v392, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v400, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v408, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v418, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v426, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v438, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v446, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v459, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v88, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v96, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [aoin, java.lang.Object] */
    private final java.lang.Object j() {
        rai aogcVar;
        gat adnrVar;
        int i = this.b;
        switch (i) {
            case 1600:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45757579").e());
            case 1601:
                return java.lang.Boolean.valueOf(((apnt) this.a.pp().a.a()).b("com.google.android.dialer.directboot", "45807074").e());
            case 1602:
                return java.lang.Boolean.valueOf(((apnt) this.a.pZ().b.a()).b("com.google.android.dialer.directboot", "45832511").e());
            case 1603:
                aogcVar = new aogc(this.a.DZ);
                return aogcVar;
            case 1604:
                defpackage.him himVar = this.a;
                aogcVar = new ljd(himVar.ar(), (rlv) himVar.fq.a(), (ajct) himVar.r.a(), (zpz) himVar.fz.a(), himVar.Ep);
                return aogcVar;
            case 1605:
                defpackage.him himVar2 = this.a;
                adnp adnpVar = (adnp) himVar2.Ej.a();
                adoc adocVar = (adoc) himVar2.jP.a();
                ajcu ajcuVar = (ajcu) himVar2.jO.a();
                amyz amyzVar = himVar2.jZ;
                adocVar.d(ajcuVar);
                adocVar.c(10);
                adocVar.e(((java.lang.Boolean) amyzVar.a()).booleanValue());
                adnpVar.e = adocVar.a();
                java.lang.Object obj = adnpVar.e;
                if (obj == null) {
                    throw new java.lang.IllegalStateException("Settings must be provided.");
                }
                aiyy aiyyVar = (aiyy) adnpVar.a;
                aiyyVar.a = obj;
                adnrVar = new adnr(aiyyVar, (aoin) adnpVar.b, (aoin) adnpVar.c, (aoin) adnpVar.d);
                return adnrVar;
            case 1606:
                defpackage.him himVar3 = this.a;
                adnrVar = new adnp(himVar3.Eh, (aiyy) himVar3.jQ.a(), himVar3.Ed, himVar3.jW);
                return adnrVar;
            case 1607:
                defpackage.him himVar4 = this.a;
                aogcVar = new alln(himVar4.Eb, himVar4.Ed, himVar4.Ef, himVar4.jW, himVar4.Eg, himVar4.jQ);
                return aogcVar;
            case 1608:
                return new agab((int[]) null);
            case 1609:
                defpackage.him himVar5 = this.a;
                android.content.Context context = (android.content.Context) himVar5.s.a();
                adqv adqvVar = (adqv) himVar5.Ec.a();
                adod adodVarB = ((aiyy) himVar5.jQ.a()).b();
                adodVarB.b.isPresent();
                adrw adrwVar = new adrw(context, adqvVar, adodVarB.a, adodVarB.c, adodVarB.d, adodVarB.e);
                aiyy aiyyVar2 = (aiyy) himVar5.jQ.a();
                adod adodVarB2 = aiyyVar2.b();
                return new ajwz(adrwVar, adodVarB2.a, adodVarB2.g);
            case 1610:
                aogcVar = new adqy((adrg) this.a.jT.a());
                return aogcVar;
            case 1611:
                defpackage.him himVar6 = this.a;
                aogcVar = new adsp(((aiyy) himVar6.jQ.a()).b().a);
                return aogcVar;
            case 1612:
                return new aesg();
            case 1613:
                aogcVar = new vqf((android.content.Context) this.a.s.a(), (byte[]) null);
                return aogcVar;
            case 1614:
                defpackage.him himVar7 = this.a;
                adoc adocVar2 = (adoc) himVar7.jP.a();
                aogc aogcVarSW = himVar7.sW();
                adom adomVarB = adocVar2.b();
                adomVarB.b(aaif.l(aogcVarSW));
                adomVarB.c(true);
                return adomVarB.a();
            case 1615:
                defpackage.him himVar8 = this.a;
                adnp adnpVarOs = himVar8.os();
                adoc adocVar3 = (adoc) himVar8.jP.a();
                ajcu ajcuVar2 = (ajcu) himVar8.jO.a();
                amyz amyzVar2 = himVar8.jZ;
                adocVar3.d(ajcuVar2);
                adocVar3.c(10);
                adocVar3.e(((java.lang.Boolean) amyzVar2.a()).booleanValue());
                adnpVarOs.e = adocVar3.a();
                java.lang.Object obj2 = adnpVarOs.e;
                if (obj2 == null) {
                    throw new java.lang.IllegalStateException("Settings must be provided.");
                }
                aiyy aiyyVar3 = (aiyy) adnpVarOs.c;
                aiyyVar3.a = obj2;
                adnrVar = new ljn(aiyyVar3, (aoin) adnpVarOs.b, (aoin) adnpVarOs.a, (lbw) adnpVarOs.d);
                return adnrVar;
            case 1616:
                defpackage.him himVar9 = this.a;
                aogcVar = new ljo(himVar9.Eb, himVar9.Ed, himVar9.Ef, himVar9.jW, himVar9.Eg, himVar9.jQ, himVar9.ka, himVar9.Em, (ajcu) himVar9.aN.a());
                return aogcVar;
            case 1617:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialershared.directboot", "45679524").e());
            case 1618:
                return java.lang.Long.valueOf(((apnt) this.a.pJ().a.a()).b("com.google.android.dialer", "retry_initialization_limit_per_call").b());
            case 1619:
                return java.lang.Boolean.valueOf(((apnt) this.a.pJ().a.a()).b("com.google.android.dialer", "G__speak_easy_enabled").e());
            case 1620:
                return java.lang.Boolean.valueOf(((apnt) this.a.qZ().a.a()).b("com.google.android.dialer.directboot", "45851650").e());
            case 1621:
                defpackage.him himVar10 = this.a;
                aogcVar = new maw((aoss) himVar10.cb.a(), (apni) himVar10.eY.a(), (aazc) himVar10.l.a(), himVar10.Et);
                return aogcVar;
            case 1622:
                return java.lang.Boolean.valueOf(((apnt) this.a.sA().a.a()).b("com.google.android.dialer.directboot", "45637716").e());
            case 1623:
                return java.lang.Boolean.valueOf(((apnt) this.a.so().a.a()).b("com.google.android.dialer.directboot", "45675097").e());
            case 1624:
                return java.lang.Boolean.valueOf(((apnt) this.a.so().a.a()).b("com.google.android.dialer.directboot", "45675098").e());
            case 1625:
                return java.lang.Boolean.valueOf(((apnt) this.a.so().a.a()).b("com.google.android.dialer.directboot", "45675099").e());
            case 1626:
                return java.lang.Boolean.valueOf(((apnt) this.a.so().a.a()).b("com.google.android.dialer.directboot", "45675100").e());
            case 1627:
                return java.lang.Boolean.valueOf(((apnt) this.a.so().a.a()).b("com.google.android.dialer.directboot", "45677038").e());
            case 1628:
                return new hpx();
            case 1629:
                defpackage.him himVar11 = this.a;
                adnrVar = new zms((zpz) himVar11.fz.a(), j$.util.Optional.of(himVar11.ri()), (zpm) himVar11.fn.a(), (ajct) himVar11.r.a());
                return adnrVar;
            case 1630:
                return new ipc((byte[]) null);
            case 1631:
                return new ipc((byte[]) null, (byte[]) null);
            case 1632:
                defpackage.him himVar12 = this.a;
                return aihd.r(anar.z(himVar12.EE), anar.z(himVar12.EF));
            case 1633:
                return new jxc(1);
            case 1634:
                return new jxc(0);
            case 1635:
                return this.a.fr();
            case 1636:
                defpackage.him himVar13 = this.a;
                aogcVar = new hul(himVar13.w(), himVar13.u(), (aoss) himVar13.cb.a(), (aolr) himVar13.bg.a());
                return aogcVar;
            case 1637:
                java.lang.String strD = ((apnt) this.a.pL().a.a()).b("com.google.android.dialer", "G__assisted_dialing_csv_country_codes").d();
                if (strD == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return strD;
            case 1638:
                aogcVar = new wui(this.a.pC(), 1);
                return aogcVar;
            case 1639:
                defpackage.him himVar14 = this.a;
                aogcVar = new myt(himVar14.pC(), himVar14.qN(), (aoss) himVar14.cb.a());
                return aogcVar;
            case 1640:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45814695").e());
            case 1641:
                defpackage.him himVar15 = this.a;
                aogcVar = new nwn((android.content.Context) himVar15.s.a(), (aoss) himVar15.cb.a(), (zjs) himVar15.cn.a(), himVar15.bS(), (rlv) himVar15.fq.a());
                return aogcVar;
            case 1642:
                return new rxm(1);
            case 1643:
                defpackage.him himVar16 = this.a;
                aogcVar = new rxl((android.content.Context) himVar16.s.a(), (rlv) himVar16.fq.a(), (aoss) himVar16.cb.a(), (aoss) himVar16.bZ.a(), himVar16.dT());
                return aogcVar;
            case 1644:
                return new rxm(0);
            case 1645:
                defpackage.him himVar17 = this.a;
                aogcVar = new sua((aazc) himVar17.l.a(), (gat) himVar17.ER.a(), (zpm) himVar17.fn.a(), 0);
                return aogcVar;
            case 1646:
                defpackage.him himVar18 = this.a;
                adnrVar = new gat(himVar18.gt, (ajcu) himVar18.r.a(), new gat(himVar18.r, himVar18.EQ, himVar18.eK, himVar18.fq, himVar18.fD), (rlv) himVar18.fq.a());
                return adnrVar;
            case 1647:
                return java.lang.Long.valueOf(((apnt) this.a.py().b.a()).b("com.google.android.dialer.directboot", "45616912").b());
            case 1648:
                defpackage.him himVar19 = this.a;
                aogcVar = new stz((android.content.Context) himVar19.s.a(), himVar19.dT(), (aoss) himVar19.cb.a(), (aoss) himVar19.eX.a());
                return aogcVar;
            case 1649:
                aogcVar = new sty((aoss) this.a.cb.a());
                return aogcVar;
            case 1650:
                aogcVar = new szh(this.a.mY());
                return aogcVar;
            case 1651:
                defpackage.him himVar20 = this.a;
                aogcVar = new sua(himVar20.jF(), (aoss) himVar20.cb.a(), 1);
                return aogcVar;
            case 1652:
                defpackage.him himVar21 = this.a;
                aogcVar = new jix((rlv) himVar21.fq.a(), (ssq) himVar21.qE.a());
                return aogcVar;
            case 1653:
                defpackage.him himVar22 = this.a;
                aogcVar = new wgt(himVar22.be(), (aoss) himVar22.cb.a());
                return aogcVar;
            case 1654:
                aogcVar = new wui(this.a.oB(), 0);
                return aogcVar;
            case 1655:
                defpackage.him himVar23 = this.a;
                return himVar23.qc().h(himVar23.eZ());
            case 1656:
                defpackage.him himVar24 = this.a;
                defpackage.jnn jnnVarP = himVar24.P();
                aogc aogcVarTi = himVar24.ti();
                rlv rlvVar = (rlv) himVar24.fq.a();
                j$.util.Objects.requireNonNull(jnnVarP);
                zjm zjmVar = new zjm(new defpackage.jhx(rlvVar, aogcVarTi, 2), new defpackage.jnz(jnnVarP, 2));
                kuz kuzVarAf = himVar24.af();
                aogc aogcVarTu = himVar24.tu();
                rlv rlvVar2 = (rlv) himVar24.fq.a();
                j$.util.Objects.requireNonNull(kuzVarAf);
                zjm zjmVar2 = new zjm(new defpackage.jhx(rlvVar2, aogcVarTu, 3), new defpackage.kpr(kuzVarAf, 12));
                zjm zjmVarJX = himVar24.jX();
                wyc wycVarDt = himVar24.dt();
                aogc aogcVarTh = himVar24.th();
                rlv rlvVar3 = (rlv) himVar24.fq.a();
                j$.util.Objects.requireNonNull(wycVarDt);
                zjm zjmVar3 = new zjm(new defpackage.jhx(rlvVar3, aogcVarTh, 17), new wks(wycVarDt, 9));
                zjm zjmVarH = zjm.h(new defpackage.irh(new defpackage.ips((android.content.Context) himVar24.s.a(), (android.content.pm.PackageManager) himVar24.aq.a(), (aazc) himVar24.l.a(), (aolr) himVar24.bY.a()), 1));
                iqm iqmVarE = himVar24.E();
                amyz amyzVar3 = himVar24.hh;
                aooh.f(amyzVar3, "beeslyBackup");
                zjm zjmVar4 = new zjm(new defpackage.irh(amyzVar3, 9), new defpackage.hle(iqmVarE, 14));
                amyz amyzVar4 = himVar24.tx;
                amyz amyzVar5 = himVar24.Fe;
                aooh.f(amyzVar4, "enableCallingCardBackupRestore");
                aooh.f(amyzVar5, "backupIntegration");
                mnk mnkVarAE = himVar24.aE();
                amyz amyzVar6 = himVar24.sW;
                aooh.f(amyzVar6, "dobbyBackup");
                amyz amyzVar7 = himVar24.Ff;
                aooh.f(amyzVar7, "spamBackup");
                tkk tkkVarCj = himVar24.cj();
                amyz amyzVar8 = himVar24.lM;
                aooh.f(amyzVar8, "sharpieBackup");
                tzc tzcVarCt = himVar24.ct();
                aogc aogcVarTw = himVar24.tw();
                rlv rlvVar4 = (rlv) himVar24.fq.a();
                j$.util.Objects.requireNonNull(tzcVarCt);
                tmw tmwVar = new tmw(tzcVarCt, 12);
                whh whhVarDr = himVar24.dr();
                aogc aogcVarTB = himVar24.tB();
                ajct ajctVar = (ajct) himVar24.r.a();
                rlv rlvVar5 = (rlv) himVar24.fq.a();
                j$.util.Objects.requireNonNull(whhVarDr);
                return aihd.v(zjmVar, zjmVar2, zjmVarJX, zjmVar3, zjmVarH, zjmVar4, new zjm[]{new zjm(amyzVar5, new pes(amyzVar4, 12)), new zjm(amyzVar6, new defpackage.mzr(mnkVarAE, 6)), zjm.h(amyzVar7), new zjm(amyzVar8, new tmw(tkkVarCj, 3)), new zjm(new defpackage.jhx(rlvVar4, aogcVarTw, 13), tmwVar), new zjm(new uce(rlvVar5, aogcVarTB, ajctVar, 2), new wks(whhVarDr, 5))});
            case 1657:
                defpackage.him himVar25 = this.a;
                return himVar25.qc().h(himVar25.eU());
            case 1658:
                aogcVar = new defpackage.hij(this, 6, (float[]) null);
                return aogcVar;
            case 1659:
                defpackage.him himVar26 = this.a;
                aogcVar = new sel((ecx) himVar26.tA.a(), (rlv) himVar26.fq.a());
                return aogcVar;
            case 1660:
                defpackage.him himVar27 = this.a;
                aogcVar = new ues((ueu) himVar27.uj.a(), (aolr) himVar27.bg.a(), (rlv) himVar27.fq.a());
                return aogcVar;
            case 1661:
                defpackage.him himVar28 = this.a;
                tzc tzcVarCt2 = himVar28.ct();
                iqe iqeVar = (iqe) himVar28.Fg.a();
                amyz amyzVar9 = himVar28.Fi;
                rlv rlvVar6 = (rlv) himVar28.fq.a();
                ahkl ahklVarA = zja.a("SonicSettings", uaw.a);
                ahklVarA.b(iqeVar.a(tzcVarCt2, ubb.a, new uax(rlvVar6, 0), new defpackage.iqh(new tge(amyzVar9, 3))));
                return himVar28.qc().h(ahklVarA.a());
            case 1662:
                aogcVar = new defpackage.hij(this, 7, (byte[][]) null);
                return aogcVar;
            case 1663:
                defpackage.him himVar29 = this.a;
                aogcVar = new ubj(himVar29.cv(), himVar29.cu(), (agsm) himVar29.aT.a(), (ajct) himVar29.r.a(), himVar29.Fh);
                return aogcVar;
            case 1664:
                return java.lang.Boolean.valueOf(((apnt) this.a.sI().a.a()).b("com.google.android.dialer.directboot", "45797841").e());
            case 1665:
                defpackage.him himVar30 = this.a;
                aogcVar = new aeqx(himVar30.bZ, himVar30.as, himVar30.cb, himVar30.bY, himVar30.s, himVar30.cf, himVar30.Fl, himVar30.ci, himVar30.aq, himVar30.sL, himVar30.Fm, himVar30.fq, himVar30.Fn);
                return aogcVar;
            case 1666:
                defpackage.him himVar31 = this.a;
                aogcVar = new okh((android.content.Context) himVar31.s.a(), (ahpz) himVar31.bb.a());
                return aogcVar;
            case 1667:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45837075").e());
            case 1668:
                return java.lang.Boolean.valueOf(((apnt) this.a.qe().a.a()).b("com.google.android.dialer", "G__enable_spam_blocking_promo").e());
            case 1669:
                return java.lang.Boolean.valueOf(((apnt) this.a.qe().a.a()).b("com.google.android.dialer", "G__enable_after_call_spam_blocking_promo").e());
            case 1670:
                akzm akzmVarC = ((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45611903").c();
                aooc.ap(akzmVarC);
                return akzmVarC;
            case 1671:
                defpackage.him himVar32 = this.a;
                uhm uhmVar = new uhm((rlv) himVar32.fq.a(), (android.content.Context) himVar32.s.a(), (ajct) himVar32.L.a());
                vaa vaaVarBI = wsc.bI(uhl.a.m());
                vaaVarBI.n(false);
                uhl uhlVarM = vaaVarBI.m();
                afgq afgqVarD = afgs.d(uhmVar.a, uhmVar.b);
                afgqVarD.d();
                afgqVarD.c(new java.lang.String[]{"spam_blocking_promo_last_show_millis"});
                afgqVarD.e(uhmVar);
                return himVar32.qc().h(zja.b("SpamBlockingPromo", uhlVarM, ajsz.aY(new ziz(afgqVarD.a())), (aonj) null, 8));
            case 1672:
                return java.lang.Boolean.valueOf(((apnt) this.a.rV().a.a()).b("com.google.android.dialershared.directboot", "45789708").e());
            case 1673:
                return java.lang.Boolean.valueOf(((apnt) this.a.rV().a.a()).b("com.google.android.dialershared.directboot", "45833737").e());
            case 1674:
                defpackage.him himVar33 = this.a;
                ted tedVar = ted.b;
                gpd gpdVarNo = himVar33.no();
                amyz amyzVar10 = himVar33.FA;
                aooh.f(amyzVar10, "impl");
                return aigf.k(tedVar, new zjm(new rey(amyzVar10, 19), new tee(gpdVarNo, 2)));
            case 1675:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45409694").e());
            case 1676:
                return java.lang.Boolean.valueOf(((apnt) this.a.se().a.a()).b("com.google.android.dialer.directboot", "45414791").e());
            case 1677:
                return java.lang.Boolean.valueOf(((apnt) this.a.se().a.a()).b("com.google.android.dialer.directboot", "45420256").e());
            case 1678:
                return java.lang.Boolean.valueOf(((apnt) this.a.se().a.a()).b("com.google.android.dialer.directboot", "45427124").e());
            case 1679:
                return java.lang.Boolean.valueOf(((apnt) this.a.se().a.a()).b("com.google.android.dialer.directboot", "45429922").e());
            case 1680:
                alfc alfcVarC = ((apnt) this.a.sb().a.a()).b("com.google.android.dialer.directboot", "45778682").c();
                if (alfcVarC == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return alfcVarC;
            case 1681:
                defpackage.him himVar34 = this.a;
                aogcVar = new rsr((android.content.Context) himVar34.s.a(), himVar34.sy());
                return aogcVar;
            case 1682:
                return new ipc();
            case 1683:
                return java.lang.Boolean.valueOf(((apnt) this.a.sm().a.a()).b("com.google.android.dialer.directboot", "45786600").e());
            case 1684:
                return java.lang.Boolean.valueOf(((apnt) this.a.sm().a.a()).b("com.google.android.dialer.directboot", "45773698").e());
            case 1685:
                return java.lang.Boolean.valueOf(((apnt) this.a.pn().b.a()).b("com.google.android.dialer.directboot", "45806868").e());
            case 1686:
                return new mtd();
            case 1687:
                return new kaw();
            case 1688:
                return java.lang.Boolean.valueOf(((apnt) new ajyk(this.a.aZ).b.a()).b("com.google.android.dialer.directboot", "45673656").e());
            case 1689:
                return java.lang.Boolean.valueOf(((apnt) new tvn(this.a.aZ, (byte[]) null).a.a()).b("com.google.android.dialer.directboot", "45838634").e());
            case 1690:
                defpackage.him himVar35 = this.a;
                aogcVar = new khh(himVar35.oF(), (gpd) himVar35.vZ.a(), (aolr) himVar35.ca.a());
                return aogcVar;
            case 1691:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45840628").e());
            case 1692:
                return java.lang.Boolean.valueOf(((apnt) this.a.sv().a.a()).b("com.google.android.dialer.directboot", "45689387").e());
            case 1693:
                defpackage.him himVar36 = this.a;
                aogcVar = new swi((rlv) himVar36.fq.a(), new zzx(himVar36.FS), (apni) himVar36.eY.a(), (aoss) himVar36.cb.a(), himVar36.FT);
                return aogcVar;
            case 1694:
                defpackage.him himVar37 = this.a;
                amyz amyzVar11 = himVar37.FN;
                amyz amyzVar12 = himVar37.FR;
                aooh.f(amyzVar11, "enablePhoneLookupPrefetching");
                aooh.f(amyzVar12, "integration");
                return aihd.r(new zjm(new ozw(amyzVar12, 5), new pes(amyzVar11, 5)), afsq.cL(himVar37.uN));
            case 1695:
                return java.lang.Boolean.valueOf(((apnt) this.a.qQ().a.a()).b("com.google.android.dialer.directboot", "45628398").e());
            case 1696:
                defpackage.him himVar38 = this.a;
                himVar38.bp();
                aogcVar = new phl((swa) himVar38.FQ.a());
                return aogcVar;
            case 1697:
                aogcVar = new rai(this, (byte[]) null, (char[]) null);
                return aogcVar;
            case 1698:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer", "enable_cp2_phone_lookup_before_full_lookup").e());
            case 1699:
                defpackage.him himVar39 = this.a;
                return himVar39.js().b(himVar39.bp(), "SingletonPhoneLookupCache");
            default:
                throw new java.lang.AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v115, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v123, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v131, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v139, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v148, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v156, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v179, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v199, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v207, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v215, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v223, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v235, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v254, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v262, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v270, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v278, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v286, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v294, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v302, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v330, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v342, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v357, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v393, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v426, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v463, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v474, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v482, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v514, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v522, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v530, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v538, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v95, types: [aoin, java.lang.Object] */
    private final java.lang.Object k() {
        rai ojuVar;
        vee tcsVar;
        java.lang.Object hzvVar;
        int i = this.b;
        switch (i) {
            case 1700:
                return java.lang.Long.valueOf(((apnt) this.a.qQ().a.a()).b("com.google.android.dialer.directboot", "45628384").b());
            case 1701:
                return java.lang.Boolean.valueOf(((apnt) this.a.pU().a.a()).b("com.google.android.dialer", "G__enable_revelio_on_bluetooth").e());
            case 1702:
                return java.lang.Boolean.valueOf(((apnt) this.a.pU().a.a()).b("com.google.android.dialer", "G__enable_revelio_on_wired_headset").e());
            case 1703:
                return java.lang.Long.valueOf(((apnt) this.a.pU().a.a()).b("com.google.android.dialer", "G__prefix_match_length").b());
            case 1704:
                return java.lang.Boolean.valueOf(((apnt) this.a.pU().a.a()).b("com.google.android.dialer", "G__enable_revelio_r_api").e());
            case 1705:
                yqc yqcVarC = ((apnt) this.a.pU().a.a()).b("com.google.android.dialer", "Revelio__supported_voices").c();
                aooc.ap(yqcVarC);
                return yqcVarC;
            case 1706:
                defpackage.him himVar = this.a;
                ojuVar = new oju((aoss) himVar.cb.a(), (aolr) himVar.bY.a(), (zjv) himVar.cf.a(), (mgu) himVar.ch.a(), himVar.i());
                return ojuVar;
            case 1707:
                ojuVar = new tbm((ajct) this.a.r.a());
                return ojuVar;
            case 1708:
                return java.lang.Boolean.valueOf(((apnt) this.a.pJ().a.a()).b("com.google.android.dialer", "G__enable_call_screen_deleting_old_recordings").e());
            case 1709:
                return java.lang.Boolean.valueOf(((apnt) this.a.qr().a.a()).b("com.google.android.dialer", "G__enable_call_screen_saving_audio").e());
            case 1710:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45682509").e());
            case 1711:
                return gus.V((android.content.Context) this.a.s.a(), "SCOOBY_EVENTS");
            case 1712:
                defpackage.him himVar2 = this.a;
                ojuVar = new vie((android.content.Context) himVar2.s.a(), (aolr) himVar2.ca.a(), (aazc) himVar2.l.a(), himVar2.jF(), (uhs) himVar2.iu.a(), new vaa((ecx) himVar2.Gg.a(), (aoss) himVar2.cb.a()), himVar2.dJ(), (zzx) himVar2.gq(), himVar2.be(), (rlv) himVar2.fq.a());
                return ojuVar;
            case 1713:
                defpackage.him himVar3 = this.a;
                return himVar3.qc().h(himVar3.fc());
            case 1714:
                return new ita();
            case 1715:
                return new defpackage.oq((int[]) null);
            case 1716:
                defpackage.him himVar4 = this.a;
                tcf tcfVar = new tcf((android.content.Context) himVar4.s.a(), (zzx) himVar4.gq());
                tch tchVarAk = ttj.X(tch.a.m()).ak();
                java.util.Set setCW = ajsz.cW(new java.lang.String[]{"google_caller_id", "spam_blocking"});
                tcd tcdVar = new tcd(tcfVar);
                java.util.List listSingletonList = java.util.Collections.singletonList(new efn(new mbe(tcfVar, 20), setCW, new tce(tcfVar, 0), tcdVar));
                aooh.e(listSingletonList, "singletonList(...)");
                return himVar4.qc().h(zja.b("ReverseLookupSettings", tchVarAk, listSingletonList, (aonj) null, 8));
            case 1717:
                return java.lang.Boolean.valueOf(((apnt) this.a.pl().a.a()).b("com.google.android.dialer", "G__enable_caller_id_and_spam").e());
            case 1718:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45861388").e());
            case 1719:
                defpackage.him himVar5 = this.a;
                ojuVar = new uyg((aolr) himVar5.bY.a(), himVar5.dz());
                return ojuVar;
            case 1720:
                return this.a.qc().h(zja.a("RevelioSettings", tbf.a).a());
            case 1721:
                alfc alfcVarC = ((apnt) this.a.pb().a.a()).b("com.google.android.dialer", "CarrierIdentifier__mccmnc_verizon").c();
                aooc.ap(alfcVarC);
                return alfcVarC;
            case 1722:
                alfc alfcVarC2 = ((apnt) this.a.pb().a.a()).b("com.google.android.dialer", "CarrierIdentifier__mccmnc_tmobile").c();
                aooc.ap(alfcVarC2);
                return alfcVarC2;
            case 1723:
                alfc alfcVarC3 = ((apnt) this.a.pb().a.a()).b("com.google.android.dialer", "CarrierIdentifier__mccmnc_sprint").c();
                aooc.ap(alfcVarC3);
                return alfcVarC3;
            case 1724:
                alfc alfcVarC4 = ((apnt) this.a.pb().a.a()).b("com.google.android.dialer", "CarrierIdentifier__mccmnc_orange_france").c();
                if (alfcVarC4 == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return alfcVarC4;
            case 1725:
                alfa alfaVarC = ((apnt) this.a.pb().a.a()).b("com.google.android.dialer", "CarrierIdentifier__carrier_id_kddi").c();
                aooc.ap(alfaVarC);
                return alfaVarC;
            case 1726:
                alfa alfaVarC2 = ((apnt) this.a.pb().a.a()).b("com.google.android.dialer", "CarrierIdentifier__carrier_id_orange_poland").c();
                aooc.ap(alfaVarC2);
                return alfaVarC2;
            case 1727:
                defpackage.him himVar6 = this.a;
                ojuVar = new defpackage.hli((defpackage.kvt) himVar6.Gs.a(), (aolr) himVar6.ca.a());
                return ojuVar;
            case 1728:
                defpackage.him himVar7 = this.a;
                ojuVar = new defpackage.kvt((zpm) himVar7.fn.a(), (aoss) himVar7.cb.a());
                return ojuVar;
            case 1729:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45833285").e());
            case 1730:
                return java.lang.Boolean.valueOf(((apnt) this.a.qV().a.a()).b("com.google.android.dialer.directboot", "45422901").e());
            case 1731:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45785806").e());
            case 1732:
                defpackage.him himVar8 = this.a;
                ojuVar = new tcv(himVar8.cc(), (ajct) himVar8.r.a(), himVar8.GB, new tcx((ajct) himVar8.as.a(), (zjs) himVar8.cn.a(), himVar8.bd(), himVar8.bc()), (ruc) himVar8.eK.a(), himVar8.dT());
                return ojuVar;
            case 1733:
                defpackage.him himVar9 = this.a;
                tcsVar = new tcs(himVar9.Gx, (rlv) himVar9.fq.a());
                return tcsVar;
            case 1734:
                alfc alfcVarC5 = ((apnt) this.a.qH().a.a()).b("com.google.android.dialer.directboot", "45707700").c();
                aooc.ap(alfcVarC5);
                return alfcVarC5;
            case 1735:
                alfa alfaVarC3 = ((apnt) this.a.qH().a.a()).b("com.google.android.dialer.directboot", "45708963").c();
                aooc.ap(alfaVarC3);
                return alfaVarC3;
            case 1736:
                return java.lang.Boolean.valueOf(((apnt) this.a.qH().a.a()).b("com.google.android.dialer.directboot", "45619074").e());
            case 1737:
                return java.lang.Boolean.valueOf(((apnt) this.a.pS().a.a()).b("com.google.android.dialer", "G__enable_rtt_visibility_setting").e());
            case 1738:
                defpackage.him himVar10 = this.a;
                amyz amyzVar = himVar10.GD;
                ajcu ajcuVar = (ajcu) himVar10.r.a();
                ahbv ahbvVar = (ahbv) himVar10.fg.a();
                usj usjVar = (usj) himVar10.Bv.a();
                utf utfVar = (utf) himVar10.Bx.a();
                ojuVar = new ute(amyzVar, ajcuVar, ahbvVar, usjVar, utfVar);
                return ojuVar;
            case 1739:
                return java.lang.Long.valueOf(((apnt) this.a.sB().a.a()).b("com.google.android.dialer.directboot", "45402585").b());
            case 1740:
                ojuVar = new abtr((rlv) this.a.fq.a());
                return ojuVar;
            case 1741:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45384536").e());
            case 1742:
                return java.lang.Boolean.valueOf(((apnt) this.a.qv().a.a()).b("com.google.android.dialer.directboot", "45684804").e());
            case 1743:
                return java.lang.Boolean.valueOf(((apnt) this.a.qv().a.a()).b("com.google.android.dialer.directboot", "45840178").e());
            case 1744:
                return java.lang.Boolean.valueOf(((apnt) this.a.qv().a.a()).b("com.google.android.dialer.directboot", "45841320").e());
            case 1745:
                return java.lang.Boolean.valueOf(((apnt) this.a.qv().a.a()).b("com.google.android.dialer.directboot", "45849239").e());
            case 1746:
                return java.lang.Boolean.valueOf(((apnt) this.a.qv().a.a()).b("com.google.android.dialer.directboot", "45850317").e());
            case 1747:
                return java.lang.Boolean.valueOf(((apnt) this.a.qv().a.a()).b("com.google.android.dialer.directboot", "45850327").e());
            case 1748:
                return java.lang.Boolean.valueOf(((apnt) this.a.qv().a.a()).b("com.google.android.dialer.directboot", "45850332").e());
            case 1749:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer", "kill_wps_warning_migration").e());
            case 1750:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45793097").e());
            case 1751:
                defpackage.him himVar11 = this.a;
                ahkn ahknVarA = zte.a("MwiData", vbg.a);
                ahknVarA.c = new ahkk(1, 1);
                return himVar11.pX().t(ahknVarA.a(), (aogc) himVar11.bq.a());
            case 1752:
                defpackage.him himVar12 = this.a;
                ojuVar = new uss((zjv) himVar12.cf.a(), (mgu) himVar12.ch.a(), (aolr) himVar12.bg.a(), (aolr) himVar12.bY.a(), (aoss) himVar12.cb.a(), himVar12.i());
                return ojuVar;
            case 1753:
                return java.lang.Boolean.valueOf(((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413174").e());
            case 1754:
                defpackage.him himVar13 = this.a;
                java.lang.Object objGQ = himVar13.gQ();
                zjx zjxVar = (zjx) himVar13.kO.a();
                vea veaVar = (vea) himVar13.Dm.a();
                ahbv ahbvVarOz = himVar13.oz();
                java.lang.Object objGP = himVar13.gP();
                amyz amyzVar2 = himVar13.fq;
                j$.util.Optional optionalEmpty = j$.util.Optional.empty();
                ajct ajctVar = (ajct) himVar13.r.a();
                amyz amyzVar3 = himVar13.Dn;
                amyz amyzVar4 = himVar13.Do;
                zzx zzxVar = (zzx) himVar13.gq();
                aogc aogcVar = (aogc) objGQ;
                tcsVar = new vee(aogcVar, zjxVar, veaVar, ahbvVarOz, (gpd) objGP, amyzVar2, optionalEmpty, ajctVar, amyzVar3, amyzVar4, zzxVar, himVar13.kN);
                return tcsVar;
            case 1755:
                ojuVar = new rsr(this.a.GU);
                return ojuVar;
            case 1756:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45672108").e());
            case 1757:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45804923").e());
            case 1758:
                return java.lang.Long.valueOf(((apnt) this.a.pz().a.a()).b("com.google.android.dialer", "CallRecording__call_recording_wait_for_metrics_timeout_millis").b());
            case 1759:
                defpackage.him himVar14 = this.a;
                ojuVar = new defpackage.ibd(himVar14.C(), (ajct) himVar14.GZ.a(), (ajcu) himVar14.r.a(), new defpackage.iay(himVar14.Ha, himVar14.GZ, himVar14.r, himVar14.Hw, himVar14.Hy, himVar14.Hb, himVar14.HA, himVar14.HB, himVar14.HC), (defpackage.ibs) himVar14.Hv.a(), (defpackage.hyv) himVar14.Hw.a());
                return ojuVar;
            case 1760:
                defpackage.him himVar15 = this.a;
                tcsVar = new defpackage.ibo((oju) himVar15.Ga.a(), (ajct) himVar15.as.a());
                return tcsVar;
            case 1761:
                ajcu ajcuVar2 = (ajcu) this.a.L.a();
                ojuVar = new abqi(new abqp(new ajdc(ajcuVar2), ajcuVar2), ajcuVar2);
                return ojuVar;
            case 1762:
                ajcu ajcuVarS = aiql.s(java.util.concurrent.Executors.newSingleThreadScheduledExecutor(new defpackage.ibm(0)));
                aooc.ap(ajcuVarS);
                return ajcuVarS;
            case 1763:
                defpackage.him himVar16 = this.a;
                agsm agsmVar = (agsm) himVar16.aT.a();
                java.lang.Object objA = himVar16.He.a();
                aigf aigfVarN = aigf.n(defpackage.hwy.c, defpackage.iaf.e(8000), defpackage.hwy.d, defpackage.iaf.e(16000), defpackage.hwy.a, (defpackage.hzi) himVar16.Hp.a(), defpackage.hwy.b, (defpackage.hzi) himVar16.Hu.a());
                defpackage.ibs ibsVar = (defpackage.ibs) himVar16.Hv.a();
                ajcu ajcuVar3 = (ajcu) himVar16.Ha.a();
                ojuVar = new defpackage.hyv(agsmVar, (defpackage.hyy) objA, aigfVarN, ibsVar, ajcuVar3);
                return ojuVar;
            case 1764:
                defpackage.him himVar17 = this.a;
                aigf aigfVar = (aigf) himVar17.Hb.a();
                ajcu ajcuVar4 = (ajcu) himVar17.Ha.a();
                return new defpackage.hyy(aigfVar, ajcuVar4, (defpackage.hzf) himVar17.Hd.a());
            case 1765:
                defpackage.him himVar18 = this.a;
                return aigf.m(defpackage.hzh.a, himVar18.B(), defpackage.hzh.c, himVar18.B(), defpackage.hzh.b, himVar18.B());
            case 1766:
                ojuVar = new defpackage.hzf(this.a.Hc);
                return ojuVar;
            case 1767:
                return java.lang.Boolean.valueOf(((apnt) this.a.rm().a.a()).b("com.google.android.dialer.directboot", "45724223").e());
            case 1768:
                defpackage.him himVar19 = this.a;
                defpackage.ifb ifbVarJy = himVar19.jy();
                defpackage.hzs hzsVar = new defpackage.hzs((aoin) himVar19.Hf, 4, (float[]) null);
                defpackage.hzs hzsVar2 = new defpackage.hzs(himVar19.Hg, 0);
                defpackage.hzs hzsVar3 = new defpackage.hzs((aoin) himVar19.Hh, 5, (float[]) null);
                defpackage.hzs hzsVar4 = new defpackage.hzs((aoin) himVar19.Hi, 2, (char[]) null);
                defpackage.hzs hzsVar5 = new defpackage.hzs((aoin) himVar19.Hj, 3, (float[]) null);
                defpackage.hzs hzsVar6 = new defpackage.hzs((aoin) himVar19.Hk, 1, (byte[]) null);
                defpackage.hzz hzzVar = new defpackage.hzz(amyu.b(himVar19.Hl), amyu.b(himVar19.Hm));
                himVar19.jj();
                defpackage.jyn jynVar = new defpackage.jyn(himVar19.Hn, himVar19.GY, himVar19.GR, himVar19.fq, null);
                amyz amyzVar5 = himVar19.as;
                amyz amyzVar6 = himVar19.Ga;
                amyzVar5.getClass();
                amyzVar6.getClass();
                amyz amyzVar7 = himVar19.Ho;
                hzvVar = new defpackage.hzv(ifbVarJy, hzsVar, hzsVar2, hzsVar3, hzsVar4, hzsVar5, hzsVar6, hzzVar, jynVar, amyzVar7);
                return hzvVar;
            case 1769:
                return new defpackage.hzy();
            case 1770:
                return new defpackage.hzt();
            case 1771:
                return new defpackage.iaa();
            case 1772:
                return new defpackage.hzu();
            case 1773:
                return new defpackage.hzw();
            case 1774:
                return new defpackage.hzr();
            case 1775:
                ojuVar = new defpackage.iac((oju) this.a.Ga.a());
                return ojuVar;
            case 1776:
                ojuVar = new defpackage.iab((android.content.Context) this.a.s.a());
                return ojuVar;
            case 1777:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45820751").e());
            case 1778:
                return java.lang.Boolean.valueOf(((apnt) this.a.rm().a.a()).b("com.google.android.dialer.directboot", "45715499").e());
            case 1779:
                defpackage.him himVar20 = this.a;
                defpackage.ifb ifbVarJy2 = himVar20.jy();
                rai raiVar = (rai) himVar20.Hr.a();
                amyz amyzVar8 = himVar20.Ht;
                defpackage.hzs hzsVar7 = new defpackage.hzs((aoin) amyzVar8, 6, (float[]) null);
                defpackage.iat iatVar = new defpackage.iat(new defpackage.ias((defpackage.iar) amyzVar8.a()), new defpackage.iap(himVar20.Hq, (ajcu) himVar20.Ha.a()));
                himVar20.jj();
                izg izgVar = new izg(himVar20.Ha, himVar20.Hq, himVar20.fq);
                hzvVar = new defpackage.iaq(ifbVarJy2, raiVar, hzsVar7, iatVar, izgVar);
                return hzvVar;
            case 1780:
                ojuVar = new rai(this, (byte[]) null, (byte[]) null, (byte[]) null);
                return ojuVar;
            case 1781:
                defpackage.him himVar21 = this.a;
                return new defpackage.iao((android.content.Context) himVar21.s.a(), (agsm) himVar21.aT.a(), (ajcu) himVar21.Ha.a(), (ajcu) himVar21.as.a());
            case 1782:
                defpackage.him himVar22 = this.a;
                tcsVar = new defpackage.iar(himVar22.i(), (defpackage.icx) himVar22.Hs.a());
                return tcsVar;
            case 1783:
                ojuVar = new defpackage.icx((android.content.Context) this.a.s.a());
                return ojuVar;
            case 1784:
                defpackage.him himVar23 = this.a;
                tcsVar = new defpackage.ibs((zpm) himVar23.fn.a(), new defpackage.hgw((aoin) himVar23.r), (ajct) himVar23.r.a());
                return tcsVar;
            case 1785:
                defpackage.him himVar24 = this.a;
                ojuVar = new defpackage.ifb(himVar24.He, himVar24.Hb, himVar24.Ha, himVar24.up, himVar24.Hx, null);
                return ojuVar;
            case 1786:
                ojuVar = new defpackage.hgw(this.a.up, null, null);
                return ojuVar;
            case 1787:
                defpackage.him himVar25 = this.a;
                ojuVar = new defpackage.ibk((ajcu) himVar25.as.a(), himVar25.Hz, (ajcu) himVar25.r.a(), (defpackage.hyv) himVar25.Hw.a(), (defpackage.hgw) himVar25.HB.a(), (zms) himVar25.EB.a(), (rlv) himVar25.fq.a());
                return ojuVar;
            case 1788:
                return java.lang.Long.valueOf(((apnt) this.a.rm().a.a()).b("com.google.android.dialer.directboot", "45709720").b());
            case 1789:
                ojuVar = new defpackage.hgw(this.a.HA, null);
                return ojuVar;
            case 1790:
                return java.lang.Boolean.valueOf(((apnt) this.a.rm().a.a()).b("com.google.android.dialer.directboot", "45623234").e());
            case 1791:
                return java.lang.Long.valueOf(((apnt) this.a.pz().a.a()).b("com.google.android.dialer", "call_audio_timeout_millis").b());
            case 1792:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45752409").e());
            case 1793:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45713473").e());
            case 1794:
                return this.a.qc().h(zja.a("CallRecordingStatusInfo", defpackage.lbm.a).a());
            case 1795:
                defpackage.him himVar26 = this.a;
                return akmq.b(new ajeb(3), himVar26.oD().x((ahjz) himVar26.qs.a()));
            case 1796:
                return java.lang.Long.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45760851").b());
            case 1797:
                return java.lang.Long.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45739581").b());
            case 1798:
                return java.lang.Long.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45739582").b());
            case 1799:
                return java.lang.Long.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45762213").b());
            default:
                throw new java.lang.AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v106, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v127, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v153, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v163, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v172, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v179, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v189, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v196, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v206, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v217, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v225, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v232, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v242, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v249, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v259, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v266, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v276, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v283, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v291, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v301, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v310, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v318, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v325, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v335, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v342, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v351, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v358, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v366, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v376, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v384, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v392, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v403, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v410, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v417, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v427, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v436, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v446, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v453, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v463, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v473, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v480, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v488, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v496, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v504, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v512, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v523, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v531, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v539, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v552, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v560, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v74, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v82, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v90, types: [aoin, java.lang.Object] */
    private final java.lang.Object l() {
        wiq qekVar;
        tla yyvVar;
        whs oqiVar;
        tzh tzgVar;
        wqo tzgVar2;
        int i = this.b;
        switch (i) {
            case 1800:
                return java.lang.Long.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45413438").b());
            case 1801:
                defpackage.him himVar = this.a;
                qekVar = new qek(himVar.tv(), (ajct) himVar.r.a());
                return qekVar;
            case 1802:
                defpackage.him himVar2 = this.a;
                android.content.Context context = (android.content.Context) himVar2.oC.a();
                ajct ajctVar = (ajct) himVar2.L.a();
                ahkl ahklVarA = zja.a("RttInfoDialogShown", qej.a);
                ahklVarA.b = new ahkk(1, 1);
                afgq afgqVarD = afgs.d(context, ajctVar);
                afgqVarD.d();
                afgqVarD.c(new java.lang.String[]{"rtt_info_dialog_shown"});
                afgqVarD.e(new qes(1));
                ahklVarA.b(new ziz(afgqVarD.a()));
                return himVar2.qc().h(ahklVarA.a());
            case 1803:
                defpackage.him himVar3 = this.a;
                return aigf.l(yuv.a, afsq.cJ(himVar3.HT), yuv.b, afsq.cJ(himVar3.HV));
            case 1804:
                defpackage.him himVar4 = this.a;
                yyvVar = new yyv(himVar4.HQ, himVar4.HR, himVar4.HS, himVar4.oq(), 0);
                return yyvVar;
            case 1805:
                return java.lang.Long.valueOf(((apnt) this.a.qd().a.a()).b("com.google.android.callcoreshared.directboot", "45710875").b());
            case 1806:
                return java.lang.Long.valueOf(((apnt) this.a.qd().a.a()).b("com.google.android.callcoreshared.directboot", "45710876").b());
            case 1807:
                return java.lang.Long.valueOf(((apnt) this.a.qd().a.a()).b("com.google.android.callcoreshared.directboot", "45710877").b());
            case 1808:
                defpackage.him himVar5 = this.a;
                yyvVar = new yyv(himVar5.HU, himVar5.oq(), j$.util.Optional.empty(), himVar5.dF(), 1);
                return yyvVar;
            case 1809:
                return java.lang.Long.valueOf(((apnt) this.a.qd().a.a()).b("com.google.android.callcoreshared.directboot", "45728832").b());
            case 1810:
                defpackage.him himVar6 = this.a;
                return aigf.l(yuv.a, afsq.cJ(himVar6.HX), yuv.b, afsq.cJ(himVar6.HY));
            case 1811:
                defpackage.him himVar7 = this.a;
                yyvVar = new yyt(himVar7.cC(), himVar7.oq(), (tmi) himVar7.lh.a());
                return yyvVar;
            case 1812:
                defpackage.him himVar8 = this.a;
                yyvVar = new yyk(himVar8.cC(), himVar8.oq(), new yzk((aoss) himVar8.cb.a(), (aoss) himVar8.fh.a(), (ysu) himVar8.ly.a()), (tmi) himVar8.lh.a(), himVar8.dA(), himVar8.dF(), (aenl) himVar8.eJ.a());
                return yyvVar;
            case 1813:
                return java.lang.Boolean.valueOf(((apnt) this.a.sl().a.a()).b("com.google.android.dialer.directboot", "45673874").e());
            case 1814:
                return java.lang.Boolean.valueOf(((apnt) this.a.sl().a.a()).b("com.google.android.dialer.directboot", "45674016").e());
            case 1815:
                return java.lang.Double.valueOf(((apnt) this.a.sl().a.a()).b("com.google.android.dialer.directboot", "45674026").a());
            case 1816:
                return java.lang.Double.valueOf(((apnt) this.a.sl().a.a()).b("com.google.android.dialer.directboot", "45678798").a());
            case 1817:
                defpackage.him himVar9 = this.a;
                oqiVar = new oqi((android.content.Context) himVar9.s.a(), himVar9.Ie, himVar9.If, (ajct) himVar9.r.a(), (ajcu) himVar9.aN.a(), new zzx(himVar9.Im), j$.util.Optional.of(new ipc((char[]) null, (char[]) null)), j$.util.Optional.of(himVar9.sC()), new zzx(himVar9.Jv), himVar9.aW());
                return oqiVar;
            case 1818:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer", "enable_hats_proof_mode").e());
            case 1819:
                java.lang.String strD = ((apnt) new vqf(this.a.aZ, (byte[]) null).a.a()).b("com.google.android.dialershared.directboot", "45723201").d();
                aooc.ap(strD);
                return strD;
            case 1820:
                defpackage.him himVar10 = this.a;
                defpackage.oqu oquVar = defpackage.oqu.DIALER_HATS_PSD_DEFAULT;
                zjm zjmVarH = zjm.h(himVar10.Ig);
                defpackage.oqu oquVar2 = defpackage.oqu.DIALER_HATS_PSD_DOBBY;
                zjm zjmVarZ = anar.z(himVar10.Ih);
                defpackage.oqu oquVar3 = defpackage.oqu.DIALER_HATS_PSD_SHARPIE;
                gat gatVarOT = himVar10.oT();
                tkk tkkVarCj = himVar10.cj();
                amyz amyzVar = himVar10.Ik;
                aooh.f(amyzVar, "impl");
                return aigf.n(oquVar, zjmVarH, oquVar2, zjmVarZ, oquVar3, new zjm(amyzVar, new defpackage.jhz(gatVarOT, tkkVarCj, 12, null)), defpackage.oqu.DIALER_HATS_PSD_XATU, zjm.h(himVar10.Il));
            case 1821:
                yyvVar = new defpackage.oqn(this.a.sR());
                return yyvVar;
            case 1822:
                defpackage.him himVar11 = this.a;
                yyvVar = new defpackage.mvl(himVar11.aK(), himVar11.aL(), (aoss) himVar11.cb.a());
                return yyvVar;
            case 1823:
                defpackage.him himVar12 = this.a;
                yyvVar = new wip((aoss) himVar12.cb.a(), himVar12.jH(), 1);
                return yyvVar;
            case 1824:
                return this.a.qc().h(zja.b("SharpieHatsData", snl.ax(tkp.a.m()).j(), (java.lang.Iterable) null, (aonj) null, 12));
            case 1825:
                return java.lang.Long.valueOf(((apnt) this.a.qy().a.a()).b("com.google.android.dialer.directboot", "45645905").b());
            case 1826:
                defpackage.him himVar13 = this.a;
                qekVar = new wip(himVar13.ds(), (ajct) himVar13.r.a(), 0);
                return qekVar;
            case 1827:
                defpackage.him himVar14 = this.a;
                android.content.Context context2 = (android.content.Context) himVar14.s.a();
                zoe zoeVar = new zoe((org.chromium.net.CronetEngine) himVar14.jn.a());
                ahvr.ci(context2);
                afjh afjhVar = afjh.a;
                aehj aehjVar = new aehj();
                ahvr.ci(context2);
                if (afjy.b == null) {
                    synchronized (afjy.a) {
                        if (afjy.b == null) {
                            afjy.b = context2;
                        }
                        break;
                    }
                }
                afjy.c = aehjVar;
                long j = afjz.a;
                zoe zoeVar2 = new zoe(context2);
                defpackage.afjg afjgVar = defpackage.afjg.a;
                afjgVar.d = zoeVar2;
                amac.t().b = new amdx();
                afjgVar.c = zoeVar;
                return new aehj();
            case 1828:
                defpackage.him himVar15 = this.a;
                zjm zjmVarKD = himVar15.kD();
                zjm zjmVarKb = himVar15.kb();
                zjm zjmVarKe = himVar15.ke();
                zjm zjmVarKf = himVar15.kf();
                zjm zjmVarKw = himVar15.kw();
                zjm zjmVarKE = himVar15.kE();
                amyz amyzVar2 = himVar15.Ja;
                amyz amyzVar3 = himVar15.Jc;
                aooh.f(amyzVar2, "enableSurvey");
                aooh.f(amyzVar3, "impl");
                amyz amyzVar4 = himVar15.Et;
                amyz amyzVar5 = himVar15.Jf;
                aooh.f(amyzVar4, "enableHappinessSurvey");
                aooh.f(amyzVar5, "impl");
                gat gatVarOT2 = himVar15.oT();
                tkk tkkVarCj2 = himVar15.cj();
                amyz amyzVar6 = himVar15.Jj;
                aooh.f(amyzVar6, "impl");
                tzc tzcVarCt = himVar15.ct();
                amyz amyzVar7 = himVar15.Jl;
                j$.util.Objects.requireNonNull(tzcVarCt);
                tzc tzcVarCt2 = himVar15.ct();
                amyz amyzVar8 = himVar15.Jn;
                j$.util.Objects.requireNonNull(tzcVarCt2);
                tzc tzcVarCt3 = himVar15.ct();
                amyz amyzVar9 = himVar15.Jq;
                j$.util.Objects.requireNonNull(tzcVarCt3);
                whh whhVarDr = himVar15.dr();
                amyz amyzVar10 = himVar15.Js;
                j$.util.Objects.requireNonNull(whhVarDr);
                whi whiVar = new whi(himVar15.dr(), himVar15.tK);
                amyz amyzVar11 = himVar15.Ju;
                j$.util.Objects.requireNonNull(whiVar);
                return aihd.v(zjmVarKD, zjmVarKb, zjmVarKe, zjmVarKf, zjmVarKw, zjmVarKE, new zjm[]{himVar15.kF(), himVar15.kG(), himVar15.kH(), himVar15.kW(), himVar15.lc(), himVar15.ld(), himVar15.le(), new zjm(amyzVar3, new defpackage.jnz(amyzVar2, 18)), new zjm(amyzVar5, new defpackage.len(amyzVar4, 17)), new zjm(amyzVar6, new defpackage.jhz(gatVarOT2, tkkVarCj2, 11, null)), new zjm(amyzVar7, new tmw(tzcVarCt, 9)), new zjm(amyzVar8, new tmw(tzcVarCt2, 9)), new zjm(amyzVar9, new tmw(tzcVarCt3, 9)), new zjm(amyzVar10, new wks(whhVarDr, 1)), new zjm(amyzVar11, new uzh(whiVar, 20))});
            case 1829:
                return java.lang.Boolean.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45810531").e());
            case 1830:
                defpackage.him himVar16 = this.a;
                yyvVar = new sbf((aoss) himVar16.cb.a(), himVar16.Io, himVar16.Ip);
                return yyvVar;
            case 1831:
                java.lang.String strD2 = ((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45810532").d();
                aooc.ap(strD2);
                return strD2;
            case 1832:
                defpackage.him himVar17 = this.a;
                qekVar = new wzu((ajct) himVar17.r.a(), himVar17.Ir);
                return qekVar;
            case 1833:
                java.lang.String strD3 = ((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45417718").d();
                aooc.ap(strD3);
                return strD3;
            case 1834:
                return java.lang.Boolean.valueOf(((apnt) this.a.rH().a.a()).b("com.google.android.dialer.directboot", "45700657").e());
            case 1835:
                defpackage.him himVar18 = this.a;
                yyvVar = new defpackage.knc(himVar18.Iu, himVar18.It, 5);
                return yyvVar;
            case 1836:
                java.lang.String strD4 = ((apnt) this.a.rH().a.a()).b("com.google.android.dialer.directboot", "45700654").d();
                aooc.ap(strD4);
                return strD4;
            case 1837:
                return java.lang.Boolean.valueOf(((apnt) this.a.rH().a.a()).b("com.google.android.dialer.directboot", "45700717").e());
            case 1838:
                defpackage.him himVar19 = this.a;
                yyvVar = new defpackage.knd(himVar19.Ix, himVar19.Iw, 5);
                return yyvVar;
            case 1839:
                java.lang.String strD5 = ((apnt) this.a.rH().a.a()).b("com.google.android.dialer.directboot", "45700716").d();
                aooc.ap(strD5);
                return strD5;
            case 1840:
                defpackage.him himVar20 = this.a;
                tzgVar = new tzg(himVar20.Iz, himVar20.IA, (ajct) himVar20.r.a(), 1);
                return tzgVar;
            case 1841:
                return java.lang.Boolean.valueOf(((apnt) this.a.pw().a.a()).b("com.google.android.dialer", "enable_call_screen_hats").e());
            case 1842:
                java.lang.String strD6 = ((apnt) this.a.pw().a.a()).b("com.google.android.dialer", "call_screen_hats_trigger_id").d();
                aooc.ap(strD6);
                return strD6;
            case 1843:
                return java.lang.Boolean.valueOf(((apnt) this.a.pF().b.a()).b("com.google.android.dialer.directboot", "45841330").e());
            case 1844:
                defpackage.him himVar21 = this.a;
                yyvVar = new defpackage.kne(himVar21.ID, himVar21.IC, 5);
                return yyvVar;
            case 1845:
                java.lang.String strD7 = ((apnt) this.a.pF().b.a()).b("com.google.android.dialer.directboot", "45841331").d();
                aooc.ap(strD7);
                return strD7;
            case 1846:
                return java.lang.Boolean.valueOf(((apnt) this.a.pF().b.a()).b("com.google.android.dialer.directboot", "45841281").e());
            case 1847:
                defpackage.him himVar22 = this.a;
                yyvVar = new defpackage.knf(himVar22.IG, himVar22.IF, 5);
                return yyvVar;
            case 1848:
                java.lang.String strD8 = ((apnt) this.a.pF().b.a()).b("com.google.android.dialer.directboot", "45841282").d();
                aooc.ap(strD8);
                return strD8;
            case 1849:
                return java.lang.Boolean.valueOf(((apnt) this.a.pF().b.a()).b("com.google.android.dialer.directboot", "45841400").e());
            case 1850:
                defpackage.him himVar23 = this.a;
                yyvVar = new defpackage.kng(himVar23.IJ, himVar23.II, himVar23.mN(), 5);
                return yyvVar;
            case 1851:
                java.lang.String strD9 = ((apnt) this.a.pF().b.a()).b("com.google.android.dialer.directboot", "45841401").d();
                aooc.ap(strD9);
                return strD9;
            case 1852:
                return java.lang.Boolean.valueOf(((apnt) this.a.pF().b.a()).b("com.google.android.dialer.directboot", "45812800").e());
            case 1853:
                return java.lang.Boolean.valueOf(((apnt) this.a.pF().b.a()).b("com.google.android.dialer.directboot", "45841398").e());
            case 1854:
                defpackage.him himVar24 = this.a;
                yyvVar = new defpackage.knh(himVar24.IN, himVar24.IM, himVar24.mN(), 5);
                return yyvVar;
            case 1855:
                java.lang.String strD10 = ((apnt) this.a.pF().b.a()).b("com.google.android.dialer.directboot", "45841399").d();
                aooc.ap(strD10);
                return strD10;
            case 1856:
                defpackage.him himVar25 = this.a;
                aoss aossVar = (aoss) himVar25.cb.a();
                himVar25.jm();
                amyz amyzVar12 = himVar25.IP;
                himVar25.aK();
                yyvVar = new defpackage.mvk(aossVar, amyzVar12, himVar25.aE());
                return yyvVar;
            case 1857:
                java.lang.String strD11 = ((apnt) this.a.pq().b.a()).b("com.google.android.dialer.directboot", "45401705").d();
                aooc.ap(strD11);
                return strD11;
            case 1858:
                defpackage.him himVar26 = this.a;
                yyvVar = new defpackage.ogz((aoss) himVar26.cb.a(), (aoin) himVar26.IR, (aoin) himVar26.IS, 1, (byte[]) null);
                return yyvVar;
            case 1859:
                java.lang.String strD12 = ((apnt) this.a.sx().a.a()).b("com.google.android.dialer.directboot", "45654409").d();
                aooc.ap(strD12);
                return strD12;
            case 1860:
                return java.lang.Boolean.valueOf(((apnt) this.a.sx().a.a()).b("com.google.android.dialer.directboot", "45654408").e());
            case 1861:
                defpackage.him himVar27 = this.a;
                yyvVar = new defpackage.ogz((aoss) himVar27.cb.a(), himVar27.IU, himVar27.IV, 0);
                return yyvVar;
            case 1862:
                java.lang.String strD13 = ((apnt) this.a.sx().a.a()).b("com.google.android.dialer.directboot", "45653949").d();
                aooc.ap(strD13);
                return strD13;
            case 1863:
                return java.lang.Boolean.valueOf(((apnt) this.a.sx().a.a()).b("com.google.android.dialer.directboot", "45653946").e());
            case 1864:
                defpackage.him himVar28 = this.a;
                yyvVar = new defpackage.ogz((aoss) himVar28.cb.a(), (aoin) himVar28.IX, (aoin) himVar28.IY, 2, (char[]) null);
                return yyvVar;
            case 1865:
                java.lang.String strD14 = ((apnt) this.a.sx().a.a()).b("com.google.android.dialer.directboot", "45653948").d();
                aooc.ap(strD14);
                return strD14;
            case 1866:
                return java.lang.Boolean.valueOf(((apnt) this.a.sx().a.a()).b("com.google.android.dialer.directboot", "45653947").e());
            case 1867:
                return java.lang.Boolean.valueOf(((apnt) this.a.rH().a.a()).b("com.google.android.dialer.directboot", "45701512").e());
            case 1868:
                defpackage.him himVar29 = this.a;
                yyvVar = new defpackage.kni(himVar29.Jb, himVar29.Ja);
                return yyvVar;
            case 1869:
                java.lang.String strD15 = ((apnt) this.a.rH().a.a()).b("com.google.android.dialer.directboot", "45701511").d();
                aooc.ap(strD15);
                return strD15;
            case 1870:
                defpackage.him himVar30 = this.a;
                yyvVar = new defpackage.mav((aoss) himVar30.cb.a(), (aazc) himVar30.l.a(), (maw) himVar30.Eu.a(), himVar30.Jd, himVar30.Je, himVar30.Et);
                return yyvVar;
            case 1871:
                return java.lang.Long.valueOf(((apnt) this.a.sA().a.a()).b("com.google.android.dialer.directboot", "45637721").b());
            case 1872:
                java.lang.String strD16 = ((apnt) this.a.sA().a.a()).b("com.google.android.dialer.directboot", "45637720").d();
                aooc.ap(strD16);
                return strD16;
            case 1873:
                defpackage.him himVar31 = this.a;
                yyvVar = new tla((aoss) himVar31.cb.a(), himVar31.Jg, himVar31.Jh, himVar31.Ji, 5, (aazc) himVar31.l.a(), himVar31.jH(), (apni) himVar31.eY.a());
                return yyvVar;
            case 1874:
                java.lang.String strD17 = ((apnt) this.a.so().a.a()).b("com.google.android.dialer.directboot", "45685890").d();
                aooc.ap(strD17);
                return strD17;
            case 1875:
                java.lang.String strD18 = ((apnt) this.a.so().a.a()).b("com.google.android.dialer.directboot", "45685891").d();
                aooc.ap(strD18);
                return strD18;
            case 1876:
                return java.lang.Long.valueOf(((apnt) this.a.so().a.a()).b("com.google.android.dialer.directboot", "45660319").b());
            case 1877:
                defpackage.him himVar32 = this.a;
                qekVar = new tzi((ajct) himVar32.r.a(), himVar32.Jk);
                return qekVar;
            case 1878:
                java.lang.String strD19 = ((apnt) this.a.sM().a.a()).b("com.google.android.dialer.directboot", "45613684").d();
                aooc.ap(strD19);
                return strD19;
            case 1879:
                defpackage.him himVar33 = this.a;
                tzgVar2 = new tzg((ajct) himVar33.r.a(), himVar33.Jm, himVar33.cv(), 0);
                return tzgVar2;
            case 1880:
                java.lang.String strD20 = ((apnt) this.a.sM().a.a()).b("com.google.android.dialer.directboot", "45615903").d();
                aooc.ap(strD20);
                return strD20;
            case 1881:
                defpackage.him himVar34 = this.a;
                tzgVar = new tzh((ajct) himVar34.r.a(), himVar34.Jo, himVar34.Jp);
                return tzgVar;
            case 1882:
                java.lang.String strD21 = ((apnt) this.a.sM().a.a()).b("com.google.android.dialer.directboot", "45615902").d();
                aooc.ap(strD21);
                return strD21;
            case 1883:
                return java.lang.Boolean.valueOf(((apnt) this.a.sM().a.a()).b("com.google.android.dialer.directboot", "45614998").e());
            case 1884:
                defpackage.him himVar35 = this.a;
                qekVar = new wio((ajct) himVar35.r.a(), himVar35.Jr);
                return qekVar;
            case 1885:
                java.lang.String strD22 = ((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417196").d();
                aooc.ap(strD22);
                return strD22;
            case 1886:
                defpackage.him himVar36 = this.a;
                qekVar = new wiq((ajct) himVar36.r.a(), himVar36.Jt);
                return qekVar;
            case 1887:
                java.lang.String strD23 = ((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417199").d();
                aooc.ap(strD23);
                return strD23;
            case 1888:
                return java.lang.Long.valueOf(((apnt) this.a.qy().a.a()).b("com.google.android.dialer.directboot", "45673273").b());
            case 1889:
                return java.lang.Boolean.valueOf(((apnt) this.a.qw().a.a()).b("com.google.android.dialer.directboot", "45415569").e());
            case 1890:
                return java.lang.Long.valueOf(((apnt) this.a.qw().a.a()).b("com.google.android.dialer.directboot", "45381808").b());
            case 1891:
                return java.lang.Double.valueOf(((apnt) this.a.pq().b.a()).b("com.google.android.dialer.directboot", "45399983").a());
            case 1892:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45848934").e());
            case 1893:
                defpackage.him himVar37 = this.a;
                android.content.Context context3 = (android.content.Context) himVar37.s.a();
                ajct ajctVar2 = (ajct) himVar37.L.a();
                tzgVar2 = new wqo(context3, ajctVar2, himVar37.JC, himVar37.JD);
                return tzgVar2;
            case 1894:
                return java.lang.Long.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417213").b());
            case 1895:
                return java.lang.Long.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417214").b());
            case 1896:
                return java.lang.Long.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417215").b());
            case 1897:
                defpackage.him himVar38 = this.a;
                java.util.concurrent.ScheduledExecutorService scheduledExecutorService = (java.util.concurrent.ScheduledExecutorService) himVar38.r.a();
                voc vocVar = new voc((ajct) himVar38.r.a(), (byte[]) null);
                wsk wskVar = new wsk((ajct) himVar38.r.a(), himVar38.JG);
                voc vocVar2 = new voc((ajct) himVar38.r.a());
                amyz amyzVar13 = himVar38.JH;
                oqiVar = new whs(scheduledExecutorService, vocVar, wskVar, vocVar2, amyzVar13);
                return oqiVar;
            case 1898:
                return java.lang.Long.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417225").b());
            case 1899:
                return java.lang.Long.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417212").b());
            default:
                throw new java.lang.AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v107, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v115, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v123, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v131, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v153, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v168, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v176, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v186, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v194, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v202, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v210, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v218, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v226, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v234, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v242, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v250, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v258, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v266, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v274, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v282, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v290, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v298, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v306, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v314, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v322, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v330, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v345, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v353, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v361, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v369, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v377, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v385, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v395, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v403, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v411, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v419, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v427, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v435, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v443, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v451, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v459, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v467, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v475, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v483, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v491, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v499, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v507, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v515, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v531, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v538, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v546, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v554, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v562, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v570, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v578, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v586, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v594, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v602, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v624, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v632, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v640, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v648, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v656, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v668, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v676, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v695, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v706, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v714, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v722, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v730, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v83, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v91, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v99, types: [aoin, java.lang.Object] */
    private final java.lang.Object m() {
        yyr nldVar;
        int i = this.b;
        switch (i) {
            case 1900:
                return java.lang.Long.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417209").b());
            case 1901:
                return java.lang.Long.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417210").b());
            case 1902:
                return java.lang.Long.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417211").b());
            case 1903:
                return java.lang.Long.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45420892").b());
            case 1904:
                return java.lang.Long.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417197").b());
            case 1905:
                return java.lang.Double.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417198").a());
            case 1906:
                return java.lang.Boolean.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417171").e());
            case 1907:
                return java.lang.Boolean.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417178").e());
            case 1908:
                return java.lang.Boolean.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417172").e());
            case 1909:
                return java.lang.Boolean.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417173").e());
            case 1910:
                return java.lang.Boolean.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417174").e());
            case 1911:
                return java.lang.Double.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417175").a());
            case 1912:
                return java.lang.Long.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417176").b());
            case 1913:
                return java.lang.Long.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417177").b());
            case 1914:
                return java.lang.Boolean.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417180").e());
            case 1915:
                return java.lang.Boolean.valueOf(((apnt) this.a.sm().a.a()).b("com.google.android.dialer.directboot", "45773699").e());
            case 1916:
                return java.lang.Long.valueOf(((apnt) this.a.pq().b.a()).b("com.google.android.dialer.directboot", "45384773").b());
            case 1917:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45750569").e());
            case 1918:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45817790").e());
            case 1919:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45825767").e());
            case 1920:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45672999").e());
            case 1921:
                return java.lang.Boolean.valueOf(((apnt) this.a.qZ().a.a()).b("com.google.android.dialer.directboot", "45839370").e());
            case 1922:
                return java.lang.Long.valueOf(((apnt) this.a.qZ().a.a()).b("com.google.android.dialer.directboot", "45844220").b());
            case 1923:
                defpackage.him himVar = this.a;
                nldVar = new defpackage.nld((android.content.Context) himVar.s.a(), (aolr) himVar.ca.a(), (aoss) himVar.cb.a(), (ajcu) himVar.r.a(), (aazc) himVar.l.a(), (ysy) himVar.lA.a(), himVar.dD(), himVar.Kg, himVar.Kh, himVar.nX(), himVar.Ki, himVar.Kj, himVar.Kk, himVar.Kl, himVar.Km);
                break;
            case 1924:
                return java.lang.Long.valueOf(((apnt) this.a.pn().b.a()).b("com.google.android.dialer.directboot", "45781507").b());
            case 1925:
                return java.lang.Long.valueOf(((apnt) this.a.pn().b.a()).b("com.google.android.dialer.directboot", "45782258").b());
            case 1926:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45820727").e());
            case 1927:
                return java.lang.Boolean.valueOf(((apnt) this.a.pn().b.a()).b("com.google.android.dialer.directboot", "45820817").e());
            case 1928:
                return java.lang.Boolean.valueOf(((apnt) this.a.pn().b.a()).b("com.google.android.dialer.directboot", "45817505").e());
            case 1929:
                return java.lang.Boolean.valueOf(((apnt) this.a.pn().b.a()).b("com.google.android.dialer.directboot", "45822406").e());
            case 1930:
                return java.lang.Boolean.valueOf(((apnt) this.a.pn().b.a()).b("com.google.android.dialer.directboot", "45837273").e());
            case 1931:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45848408").e());
            case 1932:
                return java.lang.Long.valueOf(((apnt) this.a.pn().b.a()).b("com.google.android.dialer.directboot", "45798404").b());
            case 1933:
                return java.lang.Boolean.valueOf(((apnt) this.a.pn().b.a()).b("com.google.android.dialer.directboot", "45798498").e());
            case 1934:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45838710").e());
            case 1935:
                return java.lang.Long.valueOf(((apnt) this.a.pq().b.a()).b("com.google.android.dialer.directboot", "45382104").b());
            case 1936:
                return java.lang.Long.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45699108").b());
            case 1937:
                return java.lang.Long.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45800649").b());
            case 1938:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45801220").e());
            case 1939:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45801994").e());
            case 1940:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45820144").e());
            case 1941:
                return java.lang.Boolean.valueOf(((apnt) this.a.pn().b.a()).b("com.google.android.dialer.directboot", "45831648").e());
            case 1942:
                return java.lang.Boolean.valueOf(((apnt) this.a.pn().b.a()).b("com.google.android.dialer.directboot", "45843026").e());
            case 1943:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45744993").e());
            case 1944:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45727050").e());
            case 1945:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45671716").e());
            case 1946:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45794747").e());
            case 1947:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45813892").e());
            case 1948:
                return java.lang.Long.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45818827").b());
            case 1949:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45851088").e());
            case 1950:
                defpackage.him himVar2 = this.a;
                nldVar = new defpackage.jgm((iwc) himVar2.xY.a(), himVar2.E());
                break;
            case 1951:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45780844").e());
            case 1952:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45785743").e());
            case 1953:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45834155").e());
            case 1954:
                return java.lang.Long.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45842397").b());
            case 1955:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45835895").e());
            case 1956:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45848409").e());
            case 1957:
                return java.lang.Long.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45645684").b());
            case 1958:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45836098").e());
            case 1959:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45791410").e());
            case 1960:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45853023").e());
            case 1961:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45803919").e());
            case 1962:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45825336").e());
            case 1963:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45858065").e());
            case 1964:
                return java.lang.Boolean.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417195").e());
            case 1965:
                ypz ypzVarC = ((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417217").c();
                aooc.ap(ypzVarC);
                return ypzVarC;
            case 1966:
                return java.lang.Long.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417222").b());
            case 1967:
                defpackage.him himVar3 = this.a;
                nldVar = new wjb((ajct) himVar3.r.a(), (aazc) himVar3.l.a());
                break;
            case 1968:
                defpackage.him himVar4 = this.a;
                android.content.Context context = (android.content.Context) himVar4.s.a();
                amyz amyzVar = himVar4.KZ;
                amyz amyzVar2 = himVar4.La;
                amyz amyzVar3 = himVar4.Lb;
                ajct ajctVar = (ajct) himVar4.r.a();
                ahbv ahbvVar = (ahbv) himVar4.fg.a();
                defpackage.nze nzeVarAU = himVar4.aU();
                nldVar = new wmy(context, amyzVar, amyzVar2, amyzVar3, ajctVar, ahbvVar, nzeVarAU);
                break;
            case 1969:
                java.lang.String strD = ((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417193").d();
                aooc.ap(strD);
                return strD;
            case 1970:
                alfc alfcVarC = ((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45629950").c();
                aooc.ap(alfcVarC);
                return alfcVarC;
            case 1971:
                alfc alfcVarC2 = ((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45420311").c();
                aooc.ap(alfcVarC2);
                return alfcVarC2;
            case 1972:
                ypx ypxVarC = ((apnt) this.a.rh().a.a()).b("com.google.android.dialer.directboot", "45415741").c();
                aooc.ap(ypxVarC);
                return ypxVarC;
            case 1973:
                return java.lang.Boolean.valueOf(((apnt) this.a.rN().a.a()).b("com.google.android.dialer.directboot", "45817089").e());
            case 1974:
                return java.lang.Long.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417191").b());
            case 1975:
                return java.lang.Long.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417190").b());
            case 1976:
                return java.lang.Long.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417218").b());
            case 1977:
                return java.lang.Boolean.valueOf(((apnt) this.a.pn().b.a()).b("com.google.android.dialer.directboot", "45795544").e());
            case 1978:
                return java.lang.Boolean.valueOf(((apnt) this.a.qu().a.a()).b("com.google.android.dialer.directboot", "45654820").e());
            case 1979:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45723736").e());
            case 1980:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45715582").e());
            case 1981:
                return java.lang.Boolean.valueOf(((apnt) this.a.qu().a.a()).b("com.google.android.dialer.directboot", "45766995").e());
            case 1982:
                return java.lang.Long.valueOf(((apnt) this.a.qu().a.a()).b("com.google.android.dialer.directboot", "45766996").b());
            case 1983:
                alfc alfcVarC3 = ((apnt) this.a.si().a.a()).b("com.google.android.dialer.directboot", "45724527").c();
                aooc.ap(alfcVarC3);
                return alfcVarC3;
            case 1984:
                return java.lang.Long.valueOf(((apnt) this.a.si().a.a()).b("com.google.android.dialer.directboot", "45752202").b());
            case 1985:
                return java.lang.Boolean.valueOf(((apnt) this.a.si().a.a()).b("com.google.android.dialer.directboot", "45752942").e());
            case 1986:
                nldVar = new aile(afsq.cJ(this.a.Lt));
                break;
            case 1987:
                defpackage.him himVar5 = this.a;
                nldVar = new yxh((tmi) himVar5.lh.a(), (aolr) himVar5.ca.a(), j$.util.Optional.empty(), himVar5.Lr, himVar5.Ls);
                break;
            case 1988:
                return java.lang.Boolean.valueOf(((apnt) this.a.rw().a.a()).b("com.google.android.callcoreshared.directboot", "45767232").e());
            case 1989:
                return java.lang.Boolean.valueOf(((apnt) this.a.rw().a.a()).b("com.google.android.callcoreshared.directboot", "45823606").e());
            case 1990:
                nldVar = new ywt(new zzx(this.a.Lx));
                break;
            case 1991:
                defpackage.him himVar6 = this.a;
                yuv yuvVar = yuv.a;
                amyz amyzVar4 = himVar6.Lv;
                aooh.f(amyzVar4, "provider");
                return aigf.l(yuvVar, zjm.h(amyzVar4), yuv.b, afsq.cJ(himVar6.Lw));
            case 1992:
                nldVar = new yyz(this.a.cC());
                break;
            case 1993:
                nldVar = new yyr(this.a.cC());
                break;
            case 1994:
                return java.lang.Long.valueOf(((apnt) this.a.sM().a.a()).b("com.google.android.dialer.directboot", "45477789").b());
            case 1995:
                return this.a.qc().h(zja.a("SonicPromo", ubk.a).a());
            case 1996:
                return java.lang.Boolean.valueOf(((apnt) this.a.sI().a.a()).b("com.google.android.dialer.directboot", "45711086").e());
            case 1997:
                return java.lang.Long.valueOf(((apnt) this.a.rk().a.a()).b("com.google.android.dialer", "video_call_camera_resolution").b());
            case 1998:
                return java.lang.Boolean.valueOf(((apnt) this.a.sE().a.a()).b("com.google.android.dialer.directboot", "45373354").e());
            case 1999:
                return java.lang.Boolean.valueOf(((apnt) this.a.rO().a.a()).b("com.google.android.dialer.directboot", "45375122").e());
            default:
                throw new java.lang.AssertionError(i);
        }
        return nldVar;
    }

    /* JADX WARN: Type inference failed for: r0v118, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v162, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v219, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v282, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v290, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v344, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v404, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v96, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v0, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v0, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [ahzi, java.lang.Object] */
    private final java.lang.Object n() {
        aety aeqgVar;
        aljf aepmVar;
        aeok aesfVar;
        int i = this.b;
        switch (i) {
            case 200:
                return java.lang.Long.valueOf(anjn.a.b().a((android.content.Context) this.a.s.a()));
            case 201:
                return java.lang.Boolean.valueOf(anjn.a.b().h((android.content.Context) this.a.s.a()));
            case 202:
                return java.lang.Boolean.valueOf(anjn.a.b().i((android.content.Context) this.a.s.a()));
            case 203:
                return java.lang.Long.valueOf(anjn.a.b().f((android.content.Context) this.a.s.a()));
            case 204:
                return java.lang.Long.valueOf(anjn.a.b().g((android.content.Context) this.a.s.a()));
            case 205:
                return java.lang.Boolean.valueOf(anhr.a.b().g((android.content.Context) this.a.s.a()));
            case 206:
                return anhr.a.b().f((android.content.Context) this.a.s.a());
            case 207:
                return java.lang.Boolean.valueOf(anig.a.b().b((android.content.Context) this.a.s.a()));
            case 208:
                amyz amyzVar = this.a.cN;
                aeqb aeqbVarD = aeqc.d();
                aeqbVarD.b = true == ((java.lang.Boolean) amyzVar.a()).booleanValue() ? 3 : 2;
                return aeqbVarD.a();
            case 209:
                return java.lang.Boolean.valueOf(((apnt) this.a.rL().a.a()).b("com.google.android.dialer", "G__enable_tiktok_primes_battery_metric").e());
            case 210:
                defpackage.him himVar = this.a;
                aeqgVar = new aeqg((gou) himVar.ae.a(), (android.content.Context) himVar.s.a(), (tvn) himVar.R.a(), (aepm) himVar.cS.a(), (ajcu) himVar.N.a(), amyu.b(himVar.cT), new tvn(new aevd((android.content.Context) himVar.s.a(), himVar.cz)), himVar.cU, himVar.cV, (java.util.concurrent.Executor) himVar.U.a());
                return aeqgVar;
            case 211:
                defpackage.him himVar2 = this.a;
                aepmVar = new aepm((tvn) himVar2.R.a(), (aepu) himVar2.cP.a(), himVar2.cQ, himVar2.cR);
                return aepmVar;
            case 212:
                aeqgVar = new aepu((android.content.Context) this.a.s.a());
                return aeqgVar;
            case 213:
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                bool.booleanValue();
                return bool;
            case 214:
                java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                bool2.booleanValue();
                return bool2;
            case 215:
                aeqc aeqcVar = (aepy) ((aoin) ahyn.h(this.a.cO).a).a();
                if (aeqcVar == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return aeqcVar;
            case 216:
                defpackage.him himVar3 = this.a;
                java.lang.String str = (java.lang.String) himVar3.z.a();
                adao adaoVar = new adao((android.content.Context) himVar3.s.a());
                aazc aazcVar = (aazc) himVar3.V.a();
                aepmVar = new aesp(str, adaoVar, aazcVar, himVar3.cT);
                return aepmVar;
            case 217:
                return anhu.a.b().a((android.content.Context) this.a.s.a());
            case 218:
                amyz amyzVar2 = this.a.cX;
                alto altoVarD = aesl.d();
                altoVarD.b = true == ((java.lang.Boolean) amyzVar2.a()).booleanValue() ? 3 : 2;
                return altoVarD.d();
            case 219:
                return java.lang.Boolean.valueOf(((apnt) this.a.rL().a.a()).b("com.google.android.dialer", "G__enable_tiktok_primes_jank_metric").e());
            case 220:
                defpackage.him himVar4 = this.a;
                gou gouVar = (gou) himVar4.ae.a();
                android.content.Context context = (android.content.Context) himVar4.s.a();
                tvn tvnVar = (tvn) himVar4.R.a();
                amyz amyzVar3 = himVar4.cZ;
                amwu amwuVarB = amyu.b(amyzVar3);
                java.lang.Object objA = himVar4.dd.a();
                java.util.concurrent.Executor executor = (java.util.concurrent.Executor) himVar4.U.a();
                adag adagVar = new adag(amza.b(himVar4.ah), himVar4.N);
                amza.b(himVar4.ah);
                android.content.Context context2 = (android.content.Context) himVar4.s.a();
                amwu amwuVarB2 = amyu.b(himVar4.dj);
                aeqgVar = new aesi(gouVar, context, tvnVar, amwuVarB, (aesf) objA, himVar4.de, himVar4.df, executor, adagVar, himVar4.dg, new aesp(context2, himVar4.dh, amwuVarB2, amyu.b(amyzVar3)));
                return aeqgVar;
            case 221:
                aesl aeslVarBu = agab.bu(ahyn.h(this.a.cY), new kuq(20));
                aooc.ap(aeslVarBu);
                return aeslVarBu;
            case 222:
                defpackage.him himVar5 = this.a;
                aesfVar = new aesf(amyu.b(himVar5.da), ahyn.h(himVar5.dc), (java.util.concurrent.Executor) himVar5.U.a());
                return aesfVar;
            case 223:
                java.lang.Boolean bool3 = (java.lang.Boolean) this.a.db.a();
                aooc.ap(bool3);
                return bool3;
            case 224:
                return java.lang.Boolean.valueOf(((apnt) this.a.rL().a.a()).b("com.google.android.dialer", "G__enable_tiktok_primes_jank_monitor_all_activities").e());
            case 225:
                return new aesj();
            case 226:
                return anij.a.b().b((android.content.Context) this.a.s.a());
            case 227:
                return java.lang.Boolean.valueOf(anij.a.b().c((android.content.Context) this.a.s.a()));
            case 228:
                return anij.a.b().a((android.content.Context) this.a.s.a());
            case 229:
                aeqgVar = new aerb((ahzp) this.a.di.a());
                return aeqgVar;
            case 230:
                return new defpackage.aeno();
            case 231:
                amyz amyzVar4 = this.a.dk;
                aerf aerfVarD = aerg.d();
                aerfVarD.d = true == ((java.lang.Boolean) amyzVar4.a()).booleanValue() ? 3 : 2;
                return aerfVarD.a();
            case 232:
                return java.lang.Boolean.valueOf(((apnt) this.a.sD().a.a()).b("com.google.android.dialer.directboot", "45421560").e());
            case 233:
                defpackage.him himVar6 = this.a;
                gou gouVar2 = (gou) himVar6.ae.a();
                java.util.concurrent.Executor executor2 = (java.util.concurrent.Executor) himVar6.U.a();
                amyz amyzVar5 = himVar6.dm;
                aepmVar = new aero(gouVar2, executor2, amyu.b(amyzVar5), (tvn) himVar6.R.a(), (aepm) himVar6.cS.a(), himVar6.qp(), himVar6.dn, himVar6.f3do, himVar6.dp, new ahbv(new aerr((ahzi) himVar6.gI(), (ahzi) himVar6.gD(), himVar6.dp), (ahzi) himVar6.gI(), (ahzi) himVar6.gD(), (java.util.concurrent.Executor) himVar6.U.a(), amyu.b(amyzVar5), (gou) himVar6.ae.a(), himVar6.dp), new aevd((adao) himVar6.dq.a(), amyu.b(amzb.a)), ahyn.h((adai) himVar6.D.a()), himVar6.dr, himVar6.ds, new tvn(himVar6.dt, (byte[]) null));
                return aepmVar;
            case 234:
                aerg aergVarBu = agab.bu(ahyn.h(this.a.dl), new aenh(5));
                aooc.ap(aergVarBu);
                return aergVarBu;
            case 235:
                return ania.a.b().c((android.content.Context) this.a.s.a());
            case 236:
                return ania.a.b().d((android.content.Context) this.a.s.a());
            case 237:
                return ania.a.b().b((android.content.Context) this.a.s.a());
            case 238:
                defpackage.him himVar7 = this.a;
                aeqgVar = new adao(new aogc((android.content.Context) himVar7.s.a(), (aepm) himVar7.cS.a(), himVar7.cQ), (android.content.Context) himVar7.s.a());
                return aeqgVar;
            case 239:
                return java.lang.Boolean.valueOf(ania.a.b().e((android.content.Context) this.a.s.a()));
            case 240:
                return java.lang.Long.valueOf(ania.a.b().a((android.content.Context) this.a.s.a()));
            case 241:
                return java.lang.Boolean.valueOf(anis.a.b().a((android.content.Context) this.a.s.a()));
            case 242:
                amyz amyzVar6 = this.a.dv;
                aetm aetmVarD = aetn.d();
                aetmVarD.d = true == ((java.lang.Boolean) amyzVar6.a()).booleanValue() ? 3 : 2;
                aetmVarD.b(true);
                return aetmVarD.a();
            case 243:
                return java.lang.Boolean.valueOf(((apnt) this.a.rL().a.a()).b("com.google.android.dialer", "G__enable_tiktok_primes_network_metric").e());
            case 244:
                defpackage.him himVar8 = this.a;
                aeqgVar = new aetr((gou) himVar8.ae.a(), (android.content.Context) himVar8.s.a(), (aepm) himVar8.cS.a(), (ajcu) himVar8.N.a(), amyu.b(himVar8.dx), amyu.b(himVar8.dz), himVar8.dA, (java.util.concurrent.Executor) himVar8.U.a(), (adao) himVar8.dq.a());
                return aeqgVar;
            case 245:
                aetn aetnVarBu = agab.bu(ahyn.h(this.a.dw), new aenh(2));
                aooc.ap(aetnVarBu);
                return aetnVarBu;
            case 246:
                defpackage.him himVar9 = this.a;
                return new aetp(himVar9.dx, himVar9.dy);
            case 247:
                return java.lang.Boolean.valueOf(aniv.a.b().b((android.content.Context) this.a.s.a()));
            case 248:
                return aniv.a.b().a((android.content.Context) this.a.s.a());
            case 249:
                defpackage.him himVar10 = this.a;
                gou gouVar3 = (gou) himVar10.ae.a();
                android.content.Context context3 = (android.content.Context) himVar10.s.a();
                ajcu ajcuVar = (ajcu) himVar10.N.a();
                amwu amwuVarB3 = amyu.b(himVar10.dC);
                amyz amyzVar7 = himVar10.dD;
                aeqgVar = new aerd(gouVar3, context3, ajcuVar, amwuVarB3, amyzVar7, himVar10.dE);
                return aeqgVar;
            case 250:
                aerc aercVarBu = agab.bu(ahwt.a, new aenh(6));
                aooc.ap(aercVarBu);
                return aercVarBu;
            case 251:
                return anhx.a.b().a((android.content.Context) this.a.s.a());
            case 252:
                defpackage.him himVar11 = this.a;
                aeqgVar = new aere((android.content.Context) himVar11.s.a());
                return aeqgVar;
            case 253:
                defpackage.him himVar12 = this.a;
                gou gouVar4 = (gou) himVar12.ae.a();
                android.content.Context context4 = (android.content.Context) himVar12.s.a();
                aepm aepmVar2 = (aepm) himVar12.cS.a();
                java.util.concurrent.Executor executor3 = (java.util.concurrent.Executor) himVar12.U.a();
                amwu amwuVarB4 = amyu.b(himVar12.dG);
                android.content.Context context5 = (android.content.Context) himVar12.s.a();
                aeqgVar = new aeuk(gouVar4, context4, aepmVar2, executor3, amwuVarB4, new aevd(context5, himVar12.cz), himVar12.dH);
                return aeqgVar;
            case 254:
                aeui aeuiVarBu = agab.bu(ahyn.h(this.a.dF), new aenh(0));
                aooc.ap(aeuiVarBu);
                return aeuiVarBu;
            case 255:
                aeuh aeuhVarD = aeui.d();
                aeuhVarD.b = 3;
                return aeuhVarD.a();
            case 256:
                return anje.a.b().a((android.content.Context) this.a.s.a());
            case 257:
                defpackage.him himVar13 = this.a;
                amyz amyzVar8 = himVar13.dJ;
                amyz amyzVar9 = himVar13.dK;
                aeul aeulVarD = aeum.d();
                aeulVarD.d = true == ((java.lang.Boolean) amyzVar8.a()).booleanValue() ? 3 : 2;
                aeulVarD.b(((java.lang.Long) amyzVar9.a()).intValue());
                return aeulVarD.a();
            case 258:
                return java.lang.Boolean.valueOf(((apnt) this.a.rL().a.a()).b("com.google.android.dialer", "G__enable_tiktok_primes_timer_metric").e());
            case 259:
                return java.lang.Long.valueOf(((apnt) this.a.rL().a.a()).b("com.google.android.dialer", "G__tiktok_primes_timer_sample_rate_per_second").b());
            case 260:
                defpackage.him himVar14 = this.a;
                aeqgVar = new aeuq((gou) himVar14.ae.a(), (java.util.concurrent.Executor) himVar14.U.a(), amyu.b(himVar14.dM), amyu.b(himVar14.x), himVar14.dN, himVar14.dO, himVar14.qp());
                return aeqgVar;
            case 261:
                aeum aeumVarBu = agab.bu(ahyn.h(this.a.dL), new aenh(3));
                aooc.ap(aeumVarBu);
                return aeumVarBu;
            case 262:
                return anjh.a.b().a((android.content.Context) this.a.s.a());
            case 263:
                return java.lang.Boolean.valueOf(anjh.a.b().b((android.content.Context) this.a.s.a()));
            case 264:
                defpackage.him himVar15 = this.a;
                aeqgVar = new aeux((gou) himVar15.ae.a(), (ajcu) himVar15.N.a(), amyu.b(himVar15.dR), himVar15.dS, himVar15.dT, himVar15.dU);
                return aeqgVar;
            case 265:
                aeuu aeuuVarBu = agab.bu(ahyn.h(this.a.dQ), new aenh(4));
                aooc.ap(aeuuVarBu);
                return aeuuVarBu;
            case 266:
                return anjk.a.b().b((android.content.Context) this.a.s.a());
            case 267:
                return anjk.a.b().a((android.content.Context) this.a.s.a());
            case 268:
                return java.lang.Boolean.valueOf(anjk.a.b().c((android.content.Context) this.a.s.a()));
            case 269:
                amyz amyzVar10 = this.a.dW;
                aify aifyVarN = aify.n(aify.r(1000, 2500, 5000));
                int i2 = true == ((java.lang.Boolean) amyzVar10.a()).booleanValue() ? 3 : 2;
                if (aifyVarN != null) {
                    return new defpackage.aett(aifyVarN, i2);
                }
                throw new java.lang.IllegalStateException("Missing required properties:".concat(" stallThresholdsMs"));
            case 270:
                return java.lang.Boolean.valueOf(((apnt) this.a.sD().a.a()).b("com.google.android.dialer.directboot", "45414328").e());
            case 271:
                defpackage.him himVar16 = this.a;
                aepmVar = new aljf(himVar16.V, himVar16.N, himVar16.ea, himVar16.eb);
                return aepmVar;
            case 272:
                defpackage.him himVar17 = this.a;
                aesfVar = new aeok((ahbz) himVar17.cE.a(), himVar17.dY, himVar17.dZ);
                return aesfVar;
            case 273:
                return java.lang.Boolean.valueOf(anjn.a.b().j((android.content.Context) this.a.s.a()));
            case 274:
                return java.lang.Long.valueOf(anjn.a.b().e((android.content.Context) this.a.s.a()));
            case 275:
                return java.lang.Boolean.valueOf(aniy.a.b().b((android.content.Context) this.a.s.a()));
            case 276:
                return aniy.a.b().a((android.content.Context) this.a.s.a());
            case 277:
                defpackage.him himVar18 = this.a;
                gou gouVar5 = (gou) himVar18.ae.a();
                aeqgVar = new aeth(gouVar5, (aetc) himVar18.ei.a(), (ajcu) himVar18.N.a(), amyu.b(himVar18.eg), (aetl) himVar18.el.a(), (aent) himVar18.I.a(), himVar18.em, (java.util.concurrent.Executor) himVar18.U.a());
                return aeqgVar;
            case 278:
                defpackage.him himVar19 = this.a;
                aepm aepmVar3 = (aepm) himVar19.cS.a();
                ajcu ajcuVar2 = (ajcu) himVar19.N.a();
                java.util.concurrent.Executor executor4 = (java.util.concurrent.Executor) himVar19.U.a();
                amwu amwuVarB5 = amyu.b(himVar19.eg);
                amwu amwuVarB6 = amyu.b(himVar19.eh);
                aeqgVar = new aetc(aepmVar3, ajcuVar2, executor4, amwuVarB5, amwuVarB6);
                return aeqgVar;
            case 279:
                aesx aesxVar = (aesx) ((aoin) ahyn.h(this.a.ef).a).a();
                aooc.ap(aesxVar);
                return aesxVar;
            case 280:
                amyz amyzVar11 = this.a.ee;
                aesw aeswVarD = aesx.d();
                aeswVarD.d = true == ((java.lang.Boolean) amyzVar11.a()).booleanValue() ? 3 : 2;
                return aeswVarD.a();
            case 281:
                return java.lang.Boolean.valueOf(((apnt) this.a.rL().a.a()).b("com.google.android.dialer", "G__enable_tiktok_primes_memory_metric").e());
            case 282:
                return java.lang.Long.valueOf(anim.a.b().b((android.content.Context) this.a.s.a()));
            case 283:
                return java.lang.Long.valueOf(anim.a.b().a((android.content.Context) this.a.s.a()));
            case 284:
                defpackage.him himVar20 = this.a;
                aeqgVar = new aetl(himVar20.eg, (android.content.Context) himVar20.s.a(), himVar20.A, himVar20.ej, himVar20.ek, (adao) himVar20.dq.a());
                return aeqgVar;
            case 285:
                return java.lang.Boolean.valueOf(anim.a.b().d((android.content.Context) this.a.s.a()));
            case 286:
                return java.lang.Boolean.valueOf(anim.a.b().e((android.content.Context) this.a.s.a()));
            case 287:
                return anim.a.b().c((android.content.Context) this.a.s.a());
            case 288:
                defpackage.him himVar21 = this.a;
                aeqgVar = new aeue((gou) himVar21.ae.a(), (ajcu) himVar21.N.a(), (java.util.concurrent.Executor) himVar21.U.a(), amyu.b(himVar21.eo), himVar21.ep);
                return aeqgVar;
            case 289:
                ahwt ahwtVar = ahwt.a;
                aeqgVar = new aety(ahwtVar, ahwtVar);
                return aeqgVar;
            case 290:
                return anjb.a.b().c((android.content.Context) this.a.s.a());
            case 291:
                return java.lang.Boolean.valueOf(anjb.a.b().d((android.content.Context) this.a.s.a()));
            case 292:
                return java.lang.Long.valueOf(anjb.a.b().b((android.content.Context) this.a.s.a()));
            case 293:
                return java.lang.Long.valueOf(anjb.a.b().a((android.content.Context) this.a.s.a()));
            case 294:
                defpackage.him himVar22 = this.a;
                ahyn.h(himVar22.cO);
                aeqd aeqdVar = (aeqd) himVar22.cW.a();
                aooc.ap(aeqdVar);
                return aeqdVar;
            case 295:
                defpackage.him himVar23 = this.a;
                ahyn.h(himVar23.cY);
                aeso aesoVar = (aeso) himVar23.da.a();
                if (aesoVar == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return aesoVar;
            case 296:
                defpackage.him himVar24 = this.a;
                return new agab((int[]) null);
            case 297:
                aesv aesvVarBu = agab.bu(ahwt.a, new aenh(1));
                aooc.ap(aesvVarBu);
                return aesvVarBu;
            case 298:
                defpackage.him himVar25 = this.a;
                ahyn.h(himVar25.dw);
                aetq aetqVar = (aetq) himVar25.dB.a();
                aooc.ap(aetqVar);
                return aetqVar;
            case 299:
                agab agabVar = (agab) this.a.dI.a();
                aooc.ap(agabVar);
                return agabVar;
            default:
                throw new java.lang.AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r13v105, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v112, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v120, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v127, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v134, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v141, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v149, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v15, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v157, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v169, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v176, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v183, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v190, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v197, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v213, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v22, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v221, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v236, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v243, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v250, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v257, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v264, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v275, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v292, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v299, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v313, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v320, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v328, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v335, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v350, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v357, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v364, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v371, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v378, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v386, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v434, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v445, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v452, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v459, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v466, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v474, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v481, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v489, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v497, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v505, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v513, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v521, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v529, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v536, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v551, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v568, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v575, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v582, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v589, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v596, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v604, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v612, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v67, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v74, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v82, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v89, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v97, types: [aoin, java.lang.Object] */
    private final java.lang.Object o() {
        wvq kugVar;
        pxm tclVar;
        rdp tckVar;
        wxc oodVar;
        int i = this.b;
        switch (i) {
            case 2000:
                return java.lang.Long.valueOf(((apnt) this.a.pS().a.a()).b("com.google.android.dialer", "audio_detector_threshold").b());
            case 2001:
                defpackage.him himVar = this.a;
                kugVar = new defpackage.kug((android.content.Context) himVar.s.a(), (ahpz) himVar.bb.a(), (ajct) himVar.r.a());
                return kugVar;
            case 2002:
                defpackage.him himVar2 = this.a;
                tclVar = new tcl((android.content.Context) himVar2.s.a(), himVar2.LG, himVar2.LH, (tck) himVar2.LJ.a(), (rlv) himVar2.fq.a(), himVar2.pG(), (ajct) himVar2.r.a(), himVar2.dS(), (zms) himVar2.EB.a(), (rwi) himVar2.Bs.a(), (oju) himVar2.Ga.a(), himVar2.jD());
                return tclVar;
            case 2003:
                return java.lang.Long.valueOf(((apnt) this.a.rD().a.a()).b("com.google.android.dialer", "G__ramping_ringer_dialer_duration").b());
            case 2004:
                return java.lang.Long.valueOf(((apnt) this.a.rD().a.a()).b("com.google.android.dialer", "G__ramping_ringer_dialer_vibration_duration").b());
            case 2005:
                defpackage.him himVar3 = this.a;
                tckVar = new tck((android.content.Context) himVar3.s.a(), himVar3.LI);
                return tckVar;
            case 2006:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer", "G__enable_oslo_integration").e());
            case 2007:
                tclVar = new abdo((android.content.Context) this.a.s.a());
                return tclVar;
            case 2008:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45364396").e());
            case 2009:
                return java.lang.Double.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer", "face_down_threshold").a());
            case 2010:
                tclVar = new defpackage.ojz((android.content.Context) this.a.s.a());
                return tclVar;
            case 2011:
                tclVar = new pgi((ajct) this.a.r.a());
                return tclVar;
            case 2012:
                defpackage.him himVar4 = this.a;
                kugVar = new defpackage.hze((defpackage.hyy) himVar4.He.a(), (aigf) himVar4.Hb.a(), (lpb) himVar4.up.a());
                return kugVar;
            case 2013:
                return java.lang.Long.valueOf(((apnt) this.a.pw().a.a()).b("com.google.android.dialer", "call_avatar_session_manager_producer_timeout_millis").b());
            case 2014:
                return java.lang.Boolean.valueOf(((apnt) this.a.pJ().a.a()).b("com.google.android.dialer", "G__enable_speakeasy_details").e());
            case 2015:
                return java.lang.Double.valueOf(((apnt) this.a.pw().a.a()).b("com.google.android.dialer", "call_screen_survey_chance").a());
            case 2016:
                return java.lang.Boolean.valueOf(((apnt) this.a.pJ().a.a()).b("com.google.android.dialer", "G__speakeasy_postcall_survey_enabled").e());
            case 2017:
                return java.lang.Boolean.valueOf(((apnt) this.a.pU().a.a()).b("com.google.android.dialer", "show_survey_for_revelio").e());
            case 2018:
                return java.lang.Double.valueOf(((apnt) this.a.pJ().a.a()).b("com.google.android.dialer", "G__call_screen_audio_stitching_downlink_volume_multiplier").a());
            case 2019:
                return java.lang.Boolean.valueOf(((apnt) this.a.rz().a.a()).b("com.google.android.dialer.directboot", "45855776").e());
            case 2020:
                return java.lang.Long.valueOf(((apnt) this.a.sx().a.a()).b("com.google.android.dialer.directboot", "45757391").b());
            case 2021:
                return java.lang.Long.valueOf(((apnt) this.a.sx().a.a()).b("com.google.android.dialer.directboot", "45757392").b());
            case 2022:
                return java.lang.Long.valueOf(((apnt) this.a.sx().a.a()).b("com.google.android.dialer.directboot", "45806436").b());
            case 2023:
                return java.lang.Boolean.valueOf(((apnt) this.a.sx().a.a()).b("com.google.android.dialer.directboot", "45806435").e());
            case 2024:
                return java.lang.Boolean.valueOf(((apnt) this.a.sx().a.a()).b("com.google.android.dialer.directboot", "45776460").e());
            case 2025:
                return java.lang.Long.valueOf(((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413180").b());
            case 2026:
                defpackage.him himVar5 = this.a;
                ajct ajctVar = (ajct) himVar5.r.a();
                return new wxm(ajctVar);
            case 2027:
                java.lang.String strD = ((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45426856").d();
                aooc.ap(strD);
                return strD;
            case 2028:
                java.lang.String strD2 = ((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413216").d();
                aooc.ap(strD2);
                return strD2;
            case 2029:
                return java.lang.Long.valueOf(((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413193").b());
            case 2030:
                return java.lang.Long.valueOf(((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413194").b());
            case 2031:
                return java.lang.Long.valueOf(((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413195").b());
            case 2032:
                defpackage.him himVar6 = this.a;
                tclVar = new otq((ruc) himVar6.eK.a(), (zpm) himVar6.fn.a(), himVar6.Mk, (ajct) himVar6.r.a(), (ajcu) himVar6.r.a());
                return tclVar;
            case 2033:
                return java.lang.Long.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer", "G__incallactivity_jank_record_duration_millis").b());
            case 2034:
                return java.lang.Boolean.valueOf(((apnt) this.a.sE().a.a()).b("com.google.android.dialer.directboot", "45372456").e());
            case 2035:
                return java.lang.Boolean.valueOf(((apnt) this.a.sE().a.a()).b("com.google.android.dialer.directboot", "45372457").e());
            case 2036:
                defpackage.him himVar7 = this.a;
                tclVar = new swy(himVar7.i(), (ajct) himVar7.L.a(), (ahpz) himVar7.bb.a(), (tcl) himVar7.LO.a(), (defpackage.ood) himVar7.Mo.a());
                return tclVar;
            case 2037:
                defpackage.him himVar8 = this.a;
                oodVar = new defpackage.ood(himVar8.sG(), himVar8.bj(), (ajct) himVar8.r.a(), (oju) himVar8.Ga.a());
                return oodVar;
            case 2038:
                return java.lang.Long.valueOf(((apnt) this.a.pU().a.a()).b("com.google.android.dialer", "G__maximum_revelio_voicemail_duration_in_seconds").b());
            case 2039:
                return java.lang.Long.valueOf(((apnt) this.a.pU().a.a()).b("com.google.android.dialer", "maximum_revelio_ringing_sound_to_caller_loop_count").b());
            case 2040:
                return java.lang.Long.valueOf(((apnt) this.a.pU().a.a()).b("com.google.android.dialer", "revelio_screening_timeout_millis").b());
            case 2041:
                return java.lang.Long.valueOf(((apnt) this.a.qE().a.a()).b("com.google.android.dialer.directboot", "45655975").b());
            case 2042:
                return java.lang.Long.valueOf(((apnt) this.a.qE().a.a()).b("com.google.android.dialer.directboot", "45655976").b());
            case 2043:
                defpackage.him himVar9 = this.a;
                oodVar = new wys(himVar9.Mv, (ajcu) himVar9.r.a(), (wxm) himVar9.Me.a(), (wzd) himVar9.oX.a());
                return oodVar;
            case 2044:
                return java.lang.Long.valueOf(((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413181").b());
            case 2045:
                defpackage.him himVar10 = this.a;
                ajct ajctVar2 = (ajct) himVar10.L.a();
                ajct ajctVar3 = (ajct) himVar10.as.a();
                ajct ajctVar4 = (ajct) himVar10.r.a();
                wyw wywVar = new wyw((ajct) himVar10.r.a(), (wvq) himVar10.My.a(), himVar10.Mz);
                defpackage.wvm wvmVar = new defpackage.wvm(ajctVar2, ajctVar3, ajctVar4, wywVar, (wvq) himVar10.My.a());
                uss ussVar = new uss(himVar10.L, himVar10.r, himVar10.MA, himVar10.MD, himVar10.MG, himVar10.MM, (byte[]) null);
                tckVar = new wvl(wvmVar, new wwk(ussVar));
                return tckVar;
            case 2046:
                defpackage.him himVar11 = this.a;
                amyz amyzVar = himVar11.Mx;
                ajct ajctVar5 = (ajct) himVar11.r.a();
                kugVar = new wvq(amyzVar, ajctVar5, (wxm) himVar11.Me.a());
                return kugVar;
            case 2047:
                return java.lang.Long.valueOf(((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413208").b());
            case 2048:
                return java.lang.Boolean.valueOf(((apnt) this.a.qB().a.a()).b("com.google.android.dialer.directboot", "45859482").e());
            case 2049:
                defpackage.him himVar12 = this.a;
                tclVar = new ahdv(himVar12.L, himVar12.as, himVar12.r, himVar12.l, himVar12.My, himVar12.Bo, himVar12.sK);
                return tclVar;
            case 2050:
                defpackage.him himVar13 = this.a;
                amyz amyzVar2 = himVar13.MB;
                amyz amyzVar3 = himVar13.MC;
                oodVar = new wxc(amyzVar2, amyzVar3, (wvq) himVar13.My.a(), (ajct) himVar13.r.a());
                return oodVar;
            case 2051:
                return java.lang.Long.valueOf(((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413206").b());
            case 2052:
                return java.lang.Double.valueOf(((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413207").a());
            case 2053:
                defpackage.him himVar14 = this.a;
                tclVar = new wwd((android.content.Context) himVar14.s.a(), (ajct) himVar14.r.a(), himVar14.ja(), himVar14.co(), new taq(himVar14.r, himVar14.ME), himVar14.MF);
                return tclVar;
            case 2054:
                return java.lang.Long.valueOf(((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413217").b());
            case 2055:
                return java.lang.Long.valueOf(((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413204").b());
            case 2056:
                defpackage.him himVar15 = this.a;
                tclVar = new uss(himVar15.MH, himVar15.l, himVar15.MI, himVar15.L, himVar15.ML, himVar15.My);
                return tclVar;
            case 2057:
                tclVar = new taq((android.content.Context) this.a.s.a());
                return tclVar;
            case 2058:
                return new wvr();
            case 2059:
                defpackage.him himVar16 = this.a;
                tclVar = new taq(himVar16.MJ, himVar16.MK, (byte[]) null);
                return tclVar;
            case 2060:
                return java.lang.Long.valueOf(((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413202").b());
            case 2061:
                return java.lang.Long.valueOf(((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413203").b());
            case 2062:
                return java.lang.Long.valueOf(((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413200").b());
            case 2063:
                return java.lang.Long.valueOf(((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413201").b());
            case 2064:
                return java.lang.Boolean.valueOf(((apnt) this.a.qB().a.a()).b("com.google.android.dialer.directboot", "45857875").e());
            case 2065:
                return java.lang.Boolean.valueOf(((apnt) this.a.rg().a.a()).b("com.google.android.dialer.directboot", "45692626").e());
            case 2066:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45633411").e());
            case 2067:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45826302").e());
            case 2068:
                defpackage.him himVar17 = this.a;
                tckVar = new rdp((zjm) himVar17.gf.a(), (aazc) himVar17.l.a());
                return tckVar;
            case 2069:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45843456").e());
            case 2070:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialershared.directboot", "45843448").e());
            case 2071:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45846402").e());
            case 2072:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45834456").e());
            case 2073:
                ahkl ahklVarA = zja.a("videoPersistent", pvs.a);
                ahklVarA.b = new ahkk(1, 1);
                return this.a.qc().h(ahklVarA.a());
            case 2074:
                return java.lang.Long.valueOf(((apnt) this.a.pE().a.a()).b("com.google.android.dialer", "notification_shown_timeout_millis").b());
            case 2075:
                return java.lang.Long.valueOf(((apnt) this.a.rF().a.a()).b("com.google.android.dialer.directboot", "45762918").b());
            case 2076:
                return java.lang.Long.valueOf(((apnt) this.a.rF().a.a()).b("com.google.android.dialer.directboot", "45762919").b());
            case 2077:
                return java.lang.Boolean.valueOf(((apnt) this.a.rF().a.a()).b("com.google.android.dialer.directboot", "45818082").e());
            case 2078:
                return java.lang.Long.valueOf(((apnt) this.a.rF().a.a()).b("com.google.android.dialer.directboot", "45765586").b());
            case 2079:
                return java.lang.Boolean.valueOf(((apnt) this.a.rF().a.a()).b("com.google.android.dialer.directboot", "45797766").e());
            case 2080:
                return java.lang.Boolean.valueOf(((apnt) this.a.rF().a.a()).b("com.google.android.dialer.directboot", "45800562").e());
            case 2081:
                return java.lang.Boolean.valueOf(((apnt) this.a.rF().a.a()).b("com.google.android.dialer.directboot", "45835556").e());
            case 2082:
                return java.lang.Boolean.valueOf(((apnt) this.a.rF().a.a()).b("com.google.android.dialer.directboot", "45854191").e());
            case 2083:
                return java.lang.Boolean.valueOf(((apnt) this.a.rF().a.a()).b("com.google.android.dialer.directboot", "45797908").e());
            case 2084:
                return java.lang.Boolean.valueOf(((apnt) this.a.rF().a.a()).b("com.google.android.dialer.directboot", "45797909").e());
            case 2085:
                return java.lang.Double.valueOf(((apnt) this.a.rF().a.a()).b("com.google.android.dialer.directboot", "45797910").a());
            case 2086:
                return java.lang.Double.valueOf(((apnt) this.a.rF().a.a()).b("com.google.android.dialer.directboot", "45797911").a());
            case 2087:
                tclVar = new pxm((aogc) this.a.fo.a());
                return tclVar;
            case 2088:
                defpackage.him himVar18 = this.a;
                afgq afgqVarD = afgs.d((android.content.Context) himVar18.oC.a(), (ajct) himVar18.L.a());
                afgqVarD.d();
                afgqVarD.c(new java.lang.String[]{"ALWAYS_SHOW_INTERNATIONAL_CALL_ON_WIFI_WARNING"});
                afgqVarD.e(new qes(2));
                afgs afgsVarA = afgqVarD.a();
                ahkl ahklVarA2 = zja.a("InternationalCallOnWifiDialogData", rhq.a);
                ahklVarA2.b = new ahkk(1, 1);
                ahklVarA2.b(new ziz(afgsVarA));
                return himVar18.qc().h(ahklVarA2.a());
            case 2089:
                return java.lang.Long.valueOf(((apnt) this.a.qA().a.a()).b("com.google.android.dialer", "postcall_last_call_threshold").b());
            case 2090:
                return this.a.qc().h(zja.a("PostCall", ste.a).a());
            case 2091:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialershared.directboot", "45853293").e());
            case 2092:
                return java.lang.Long.valueOf(((apnt) this.a.rO().a.a()).b("com.google.android.dialer.directboot", "45391098").b());
            case 2093:
                return java.lang.Long.valueOf(((apnt) this.a.qB().a.a()).b("com.google.android.dialer.directboot", "45657555").b());
            case 2094:
                return java.lang.Long.valueOf(((apnt) this.a.qB().a.a()).b("com.google.android.dialer.directboot", "45657556").b());
            case 2095:
                return java.lang.Long.valueOf(((apnt) this.a.rb().a.a()).b("com.google.android.dialer.directboot", "45657559").b());
            case 2096:
                return java.lang.Long.valueOf(((apnt) this.a.rb().a.a()).b("com.google.android.dialer.directboot", "45657560").b());
            case 2097:
                return new qvf(1);
            case 2098:
                return java.lang.Boolean.valueOf(((apnt) this.a.qF().a.a()).b("com.google.android.dialer.directboot", "45768913").e());
            case 2099:
                return java.lang.Long.valueOf(((apnt) this.a.sI().a.a()).b("com.google.android.dialer.directboot", "45657557").b());
            default:
                throw new java.lang.AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r14v104, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v112, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v120, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v131, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v141, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v161, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v185, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v193, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v20, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v201, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v209, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v216, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v262, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v270, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v278, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v290, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v298, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v3, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v306, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v314, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v355, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v363, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v379, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v419, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v429, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v436, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v443, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v450, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v457, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v464, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v507, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v52, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v72, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v79, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v90, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v97, types: [aoin, java.lang.Object] */
    private final java.lang.Object p() {
        aogc qvxVar;
        rds svmVar;
        usu otjVar;
        lnr ussVar;
        int i = this.b;
        switch (i) {
            case 2100:
                return java.lang.Long.valueOf(((apnt) this.a.sI().a.a()).b("com.google.android.dialer.directboot", "45657558").b());
            case 2101:
                ahkl ahklVarA = ahkm.a();
                ahklVarA.a = "VoicePromoStorage";
                ahklVarA.c(rab.a);
                return this.a.qc().h(ahklVarA.a());
            case 2102:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45462418").e());
            case 2103:
                return java.lang.Boolean.valueOf(((apnt) new vqf(this.a.aZ, (byte[]) null).a.a()).b("com.google.android.dialershared.directboot", "45856135").e());
            case 2104:
                defpackage.him himVar = this.a;
                android.content.Context context = (android.content.Context) himVar.oC.a();
                ajct ajctVar = (ajct) himVar.L.a();
                ahkl ahklVarA2 = zja.a("SuppressRttMergeDialog", qer.a);
                ahklVarA2.b = new ahkk(1, 1);
                afgq afgqVarD = afgs.d(context, ajctVar);
                afgqVarD.d();
                afgqVarD.c(new java.lang.String[]{"suppress_rtt_merge_dialog"});
                afgqVarD.e(new qes(0));
                ahklVarA2.b(new ziz(afgqVarD.a()));
                return himVar.qc().h(ahklVarA2.a());
            case 2105:
                defpackage.him himVar2 = this.a;
                ajct ajctVar2 = (ajct) himVar2.L.a();
                ajcu ajcuVar = (ajcu) himVar2.r.a();
                svm svmVar2 = (svm) himVar2.NF.a();
                qba qbaVar = (qba) himVar2.gU.a();
                zpz zpzVar = (zpz) himVar2.fz.a();
                zrw zrwVarDT = himVar2.dT();
                zpm zpmVar = (zpm) himVar2.fn.a();
                qvxVar = new qvx(ajctVar2, ajcuVar, svmVar2, qbaVar, zpzVar, zrwVarDT, zpmVar, (zjs) himVar2.cn.a());
                return qvxVar;
            case 2106:
                defpackage.him himVar3 = this.a;
                svmVar = new svm((android.content.Context) himVar3.s.a(), (ajct) himVar3.L.a(), (ajcu) himVar3.r.a(), (ojo) himVar3.oF.a());
                return svmVar;
            case 2107:
                defpackage.him himVar4 = this.a;
                qvxVar = new rah((zpz) himVar4.fz.a(), (apni) himVar4.eY.a(), (aoss) himVar4.cb.a());
                return qvxVar;
            case 2108:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialershared.directboot", "45842392").e());
            case 2109:
                defpackage.him himVar5 = this.a;
                qvxVar = new defpackage.ooc((ajct) himVar5.r.a(), (rlv) himVar5.fq.a(), himVar5.pG(), (defpackage.ood) himVar5.Mo.a(), (zjs) himVar5.cn.a());
                return qvxVar;
            case 2110:
                return java.lang.Boolean.valueOf(((apnt) this.a.sm().a.a()).b("com.google.android.dialer.directboot", "45793132").e());
            case 2111:
                qvxVar = new aavb((android.content.Context) this.a.s.a());
                return qvxVar;
            case 2112:
                return gus.V((android.content.Context) this.a.s.a(), "CALLER_ID_EVENT");
            case 2113:
                return this.a.qc().h(zja.a("HistoricFeedback", defpackage.jtz.a).a());
            case 2114:
                return java.lang.Long.valueOf(((apnt) this.a.qX().a.a()).b("com.google.android.dialer", "CallerIdFeedback__rate_limit_days").b());
            case 2115:
                return java.lang.Long.valueOf(((apnt) this.a.qX().a.a()).b("com.google.android.dialer", "CallerIdFeedback__rate_limit_count").b());
            case 2116:
                defpackage.him himVar6 = this.a;
                otjVar = new otj((qba) himVar6.gU.a(), (rlv) himVar6.fq.a());
                return otjVar;
            case 2117:
                return java.lang.Long.valueOf(((apnt) this.a.pE().a.a()).b("com.google.android.dialer", "emergency_location_lookup_battery_threshold_percent").b());
            case 2118:
                return java.lang.Long.valueOf(((apnt) this.a.sv().a.a()).b("com.google.android.dialer.directboot", "45664419").b());
            case 2119:
                return java.lang.Boolean.valueOf(((apnt) this.a.sv().a.a()).b("com.google.android.dialer.directboot", "45858054").e());
            case 2120:
                return java.lang.Boolean.valueOf(((apnt) this.a.sc().a.a()).b("com.google.android.dialershared.directboot", "45826636").e());
            case 2121:
                return java.lang.Boolean.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45760883").e());
            case 2122:
                return new defpackage.obk(1);
            case 2123:
                qvxVar = new qnx(this.a.NX);
                return qvxVar;
            case 2124:
                return java.lang.Boolean.valueOf(((apnt) this.a.sb().a.a()).b("com.google.android.dialer.directboot", "45861049").e());
            case 2125:
                defpackage.him himVar7 = this.a;
                qvxVar = new pbr(himVar7.NZ, himVar7.Oa, (qzn) himVar7.Od.a());
                return qvxVar;
            case 2126:
                return java.lang.Boolean.valueOf(((apnt) new zoe(this.a.aZ, (byte[]) null).a.a()).b("com.google.android.dialer.directboot", "45793167").e());
            case 2127:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45863517").e());
            case 2128:
                defpackage.him himVar8 = this.a;
                qvxVar = new qzn(afsq.cM(j$.util.Optional.of(new defpackage.vk(himVar8.aD(), (byte[]) null)), j$.util.Optional.of(new defpackage.mmm((zzx) himVar8.gq()))), (zpz) himVar8.fz.a(), (aoss) himVar8.cb.a(), himVar8.Ob);
                return qvxVar;
            case 2129:
                defpackage.him himVar9 = this.a;
                amyz amyzVar = himVar9.Ob;
                aooh.f(amyzVar, "enableAutoRotateByDefault");
                ahkl ahklVarA3 = ahkm.a();
                ahklVarA3.a = "DisplayOptionsSettingsData";
                defpackage.vk vkVarAa = mni.aa(defpackage.mmg.a.m());
                vkVarAa.N(!((java.lang.Boolean) amyzVar.a()).booleanValue());
                ahklVarA3.c(vkVarAa.M());
                return himVar9.qc().h(ahklVarA3.a());
            case 2130:
                return java.lang.Boolean.valueOf(((apnt) new vaa(this.a.aZ, (byte[]) null).a.a()).b("com.google.android.dialer.directboot", "45862480").e());
            case 2131:
                return new defpackage.obk(0);
            case 2132:
                qvxVar = new qsp(this.a.NX);
                return qvxVar;
            case 2133:
                defpackage.him himVar10 = this.a;
                svmVar = new rds(himVar10.Oh, (defpackage.her) himVar10.Oi.a(), (android.content.Context) himVar10.s.a(), (qzn) himVar10.Od.a());
                return svmVar;
            case 2134:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45827782").e());
            case 2135:
                return new defpackage.her();
            case 2136:
                return new wtp();
            case 2137:
                return new defpackage.obk(2);
            case 2138:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45687675").e());
            case 2139:
                return java.lang.Boolean.valueOf(((apnt) this.a.qC().a.a()).b("com.google.android.dialer.directboot", "45414200").e());
            case 2140:
                return java.lang.Long.valueOf(((apnt) this.a.qC().a.a()).b("com.google.android.dialer.directboot", "45414201").b());
            case 2141:
                defpackage.him himVar11 = this.a;
                qvxVar = new sbo((aolr) himVar11.bY.a(), (android.content.Context) himVar11.s.a(), himVar11.bd(), himVar11.dT(), (aazc) himVar11.l.a(), (ojo) himVar11.oF.a(), (zjs) himVar11.cn.a(), (ajct) himVar11.r.a(), himVar11.oE);
                return qvxVar;
            case 2142:
                return java.lang.Long.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45731176").b());
            case 2143:
                return java.lang.Boolean.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45827252").e());
            case 2144:
                ahkl ahklVarA4 = zja.a("videoScreenPersistent", qrx.a);
                ahklVarA4.b = new ahkk(1, 1);
                return this.a.qc().h(ahklVarA4.a());
            case 2145:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45618142").e());
            case 2146:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45818029").e());
            case 2147:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45759573").e());
            case 2148:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer", "enable_video_handover_dialog").e());
            case 2149:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialershared.directboot", "45773117").e());
            case 2150:
                return java.lang.Long.valueOf(((apnt) this.a.qM().a.a()).b("com.google.android.dialershared.directboot", "45619326").b());
            case 2151:
                return new afpl((byte[]) null, (byte[]) null, (byte[]) null);
            case 2152:
                return java.lang.Boolean.valueOf(((apnt) this.a.qe().a.a()).b("com.google.android.dialer", "G__answer_proximity_sensor_enabled").e());
            case 2153:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45853753").e());
            case 2154:
                return new defpackage.heq((byte[]) null);
            case 2155:
                return this.a.qc().h(zja.b("PostCallPromoData", pez.aN(owl.a.m()).O(), (java.lang.Iterable) null, (aonj) null, 12));
            case 2156:
                return java.lang.Boolean.valueOf(((apnt) this.a.sc().a.a()).b("com.google.android.dialershared.directboot", "45833722").e());
            case 2157:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45740436").e());
            case 2158:
                return java.lang.Boolean.valueOf(((apnt) this.a.sE().a.a()).b("com.google.android.dialer.directboot", "45386943").e());
            case 2159:
                return java.lang.Boolean.valueOf(((apnt) this.a.rF().a.a()).b("com.google.android.dialer.directboot", "45843226").e());
            case 2160:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialershared.directboot", "45678291").e());
            case 2161:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45388278").e());
            case 2162:
                defpackage.him himVar12 = this.a;
                qvxVar = new wai(himVar12.m92do(), himVar12.mV(), 1);
                return qvxVar;
            case 2163:
                defpackage.him himVar13 = this.a;
                qvxVar = new wai(himVar13.H(), himVar13.mH(), 0);
                return qvxVar;
            case 2164:
                defpackage.him himVar14 = this.a;
                qvxVar = new wai(himVar14.iI, himVar14.Es, 2);
                return qvxVar;
            case 2165:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45844086").e());
            case 2166:
                defpackage.him himVar15 = this.a;
                qvxVar = new wai(new wby(himVar15.cj()), himVar15.mQ(), 3);
                return qvxVar;
            case 2167:
                return new vzw();
            case 2168:
                defpackage.him himVar16 = this.a;
                qvxVar = new wcv(new defpackage.mnj(himVar16.FE, himVar16.JY, himVar16.FD, himVar16.OQ, himVar16.OR), himVar16.aE(), himVar16.io, himVar16.iI, (ysb) himVar16.lH.a(), (aolr) himVar16.bY.a());
                return qvxVar;
            case 2169:
                return java.lang.Boolean.valueOf(((apnt) this.a.sm().a.a()).b("com.google.android.dialer.directboot", "45791908").e());
            case 2170:
                return java.lang.Boolean.valueOf(((apnt) this.a.sm().a.a()).b("com.google.android.dialer.directboot", "45806311").e());
            case 2171:
                rai raiVar = (rai) this.a.OT.a();
                aooh.f(raiVar, "featurePlatformRequestClientFactory");
                qvxVar = new aile(zjm.h(new zlk(raiVar, 2)));
                return qvxVar;
            case 2172:
                qvxVar = new rai(this, (char[]) null, (byte[]) null);
                return qvxVar;
            case 2173:
                defpackage.him himVar17 = this.a;
                qvxVar = new qdp(himVar17.on(), (zpz) himVar17.fz.a(), (ajct) himVar17.r.a(), (agth) himVar17.qb.a(), (ahpz) himVar17.bb.a());
                return qvxVar;
            case 2174:
                return java.lang.Double.valueOf(((apnt) this.a.ru().a.a()).b("com.google.android.dialer", "UnifiedFeedback__post_call_notification_probability").a());
            case 2175:
                defpackage.him himVar18 = this.a;
                qvxVar = new wzp((ajct) himVar18.r.a(), new wzl(), (wzn) himVar18.gb(), new wzq(), himVar18.nP(), new wzr((ops) himVar18.BM.a()), (wzd) himVar18.oX.a());
                return qvxVar;
            case 2176:
                defpackage.him himVar19 = this.a;
                qvxVar = new defpackage.jdf((android.content.Context) himVar19.s.a(), new defpackage.jdg((ops) himVar19.BM.a()), (kgl) himVar19.pv.a(), himVar19.FL, (aoss) himVar19.cb.a(), (aoss) himVar19.fh.a());
                return qvxVar;
            case 2177:
                defpackage.him himVar20 = this.a;
                lkk lkkVar = (lkk) himVar20.pc.a();
                ajct ajctVar3 = (ajct) himVar20.r.a();
                defpackage.lcv lcvVar = new defpackage.lcv();
                defpackage.lcs lcsVar = new defpackage.lcs((ops) himVar20.BM.a());
                defpackage.lcw lcwVar = new defpackage.lcw();
                return new defpackage.lcu(lkkVar, ajctVar3, lcvVar, lcsVar, lcwVar, new pgi((ajct) himVar20.r.a(), (lkk) himVar20.pc.a(), (byte[]) null));
            case 2178:
                defpackage.him himVar21 = this.a;
                qvxVar = new defpackage.mua((nri) himVar21.py.a(), new defpackage.mtx((nri) himVar21.py.a(), (aoss) himVar21.cb.a()), new defpackage.mtw((ops) himVar21.BM.a(), himVar21.ps()), new defpackage.mtv(), new defpackage.mub(), (defpackage.mtu) himVar21.Pb.a(), himVar21.mH(), himVar21.bV, (aoss) himVar21.cb.a(), (aoss) himVar21.fh.a());
                return qvxVar;
            case 2179:
                defpackage.him himVar22 = this.a;
                qvxVar = new defpackage.mtu((android.content.Context) himVar22.s.a(), himVar22.ac(), (rlv) himVar22.fq.a(), himVar22.Pa);
                return qvxVar;
            case 2180:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45771309").e());
            case 2181:
                defpackage.him himVar23 = this.a;
                otjVar = new usu((ajct) himVar23.r.a(), (usj) himVar23.Bv.a());
                return otjVar;
            case 2182:
                defpackage.him himVar24 = this.a;
                qvxVar = new wih((ajct) himVar24.L.a(), (ajct) himVar24.r.a(), (ops) himVar24.BM.a(), (wqr) himVar24.vv.a(), new wif((ajct) himVar24.r.a(), (wqr) himVar24.vv.a()), new wib((android.content.Context) himVar24.s.a()));
                return qvxVar;
            case 2183:
                return java.lang.Boolean.valueOf(((apnt) this.a.sE().a.a()).b("com.google.android.dialer.directboot", "45390636").e());
            case 2184:
                defpackage.him himVar25 = this.a;
                ussVar = new uss((aazc) himVar25.l.a(), (ajcu) himVar25.as.a(), himVar25.Pg, himVar25.Ph);
                return ussVar;
            case 2185:
                return java.lang.Long.valueOf(((apnt) this.a.sE().a.a()).b("com.google.android.dialer.directboot", "45381590").b());
            case 2186:
                return java.lang.Long.valueOf(((apnt) this.a.sE().a.a()).b("com.google.android.dialer.directboot", "45381609").b());
            case 2187:
                return java.lang.Long.valueOf(((apnt) this.a.sE().a.a()).b("com.google.android.dialer.directboot", "45364399").b());
            case 2188:
                return java.lang.Long.valueOf(((apnt) this.a.sE().a.a()).b("com.google.android.dialer.directboot", "45364400").b());
            case 2189:
                return java.lang.Long.valueOf(((apnt) this.a.sE().a.a()).b("com.google.android.dialer.directboot", "45364401").b());
            case 2190:
                return java.lang.Boolean.valueOf(((apnt) this.a.sE().a.a()).b("com.google.android.dialer.directboot", "45364402").e());
            case 2191:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialershared.directboot", "45417936").e());
            case 2192:
                defpackage.him himVar26 = this.a;
                return jsl.r(himVar26.o(), (aeqx) himVar26.Fl.a());
            case 2193:
                defpackage.him himVar27 = this.a;
                ussVar = new lnr(himVar27.Gp, himVar27.Gq, himVar27.Gr);
                return ussVar;
            case 2194:
                defpackage.him himVar28 = this.a;
                qvxVar = new tkk(himVar28.GH, himVar28.kt, himVar28.ku, himVar28.kv, himVar28.kw, himVar28.GI, himVar28.GJ, himVar28.GK, himVar28.GL, himVar28.GM, himVar28.GN, (zzx) himVar28.gq());
                return qvxVar;
            case 2195:
                return java.lang.Long.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45364397").b());
            case 2196:
                defpackage.him himVar29 = this.a;
                qvxVar = new lrb(himVar29.vG, himVar29.vH, (zzx) himVar29.gq());
                return qvxVar;
            case 2197:
                qvxVar = new kaw((defpackage.jrn) this.a.iw.a());
                return qvxVar;
            case 2198:
                defpackage.him himVar30 = this.a;
                qvxVar = new aogc((android.content.Context) himVar30.s.a(), (aolr) himVar30.bg.a(), (aoss) himVar30.fh.a());
                return qvxVar;
            case 2199:
                return java.lang.Boolean.valueOf(((apnt) this.a.qM().a.a()).b("com.google.android.dialershared.directboot", "45800715").e());
            default:
                throw new java.lang.AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v105, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v162, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v261, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v73, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v81, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v89, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v97, types: [aoin, java.lang.Object] */
    private final java.lang.Object q() {
        mbo aeufVar;
        qdo zdkVar;
        acor zpzVar;
        int i = this.b;
        switch (i) {
            case 300:
                defpackage.him himVar = this.a;
                ahyn.h(himVar.dL);
                aeuo aeuoVar = (aeuo) himVar.dP.a();
                if (aeuoVar != null) {
                    return aeuoVar;
                }
                throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case 301:
                defpackage.him himVar2 = this.a;
                ahyn.h(himVar2.dQ);
                aeuv aeuvVar = (aeuv) himVar2.dV.a();
                aooc.ap(aeuvVar);
                return aeuvVar;
            case 302:
                defpackage.him himVar3 = this.a;
                ahyn.h(himVar3.dL);
                aeuq aeuqVar = (aeuq) himVar3.dP.a();
                if (aeuqVar == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return aeuqVar;
            case 303:
                defpackage.him himVar4 = this.a;
                aeufVar = new aeuf((aepm) himVar4.cS.a(), himVar4.eq, himVar4.er, himVar4.es, himVar4.et, amyu.b(himVar4.x));
                return aeufVar;
            case 304:
                defpackage.him himVar5 = this.a;
                aeufVar = new ajxm(himVar5.eB, himVar5.ez, himVar5.eA, himVar5.eD, himVar5.eE, himVar5.eF);
                return aeufVar;
            case 305:
                return new ahvr();
            case 306:
                return ahyn.h((aesg) this.a.eC.a());
            case 307:
                return new aesg();
            case 308:
                return new aesg();
            case 309:
                return java.lang.Boolean.valueOf(anjk.a.b().d((android.content.Context) this.a.s.a()));
            case 310:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45729276").e());
            case 311:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45767762").e());
            case 312:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45782689").e());
            case 313:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45771985").e());
            case 314:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45771986").e());
            case 315:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45771987").e());
            case 316:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45771988").e());
            case 317:
                return java.lang.Boolean.valueOf(((apnt) this.a.qs().b.a()).b("com.google.android.dialer.directboot", "45858244").e());
            case 318:
                return java.lang.Boolean.valueOf(((apnt) this.a.qs().b.a()).b("com.google.android.dialer.directboot", "45858245").e());
            case 319:
                return java.lang.Boolean.valueOf(((apnt) this.a.qs().b.a()).b("com.google.android.dialer.directboot", "45858246").e());
            case 320:
                defpackage.him himVar6 = this.a;
                aeufVar = new irq((jbm) himVar6.eW.a(), (kpa) himVar6.bT.a(), himVar6.E());
                return aeufVar;
            case 321:
                defpackage.him himVar7 = this.a;
                aeufVar = new jbm((android.content.Context) himVar7.s.a(), (aolr) himVar7.bg.a(), (ecx) himVar7.hi.a(), (zjs) himVar7.cn.a(), himVar7.nd(), defpackage.him.nk(), himVar7.hj, himVar7.bd(), himVar7.be(), himVar7.N(), himVar7.ic, himVar7.id, himVar7.ie, himVar7.f4if, himVar7.ig, himVar7.ih, himVar7.ii, himVar7.ij);
                return aeufVar;
            case 322:
                defpackage.him himVar8 = this.a;
                return himVar8.qc().h(himVar8.eV());
            case 323:
                defpackage.him himVar9 = this.a;
                aeufVar = new jax(himVar9.eW, (iqe) himVar9.eZ.a(), himVar9.E(), (rlv) himVar9.fq.a());
                return aeufVar;
            case 324:
                aeufVar = new defpackage.hij(this, 8, (char[][]) null);
                return aeufVar;
            case 325:
                defpackage.him himVar10 = this.a;
                aeufVar = new apni((aoss) himVar10.eX.a(), (aoss) himVar10.cb.a());
                return aeufVar;
            case 326:
                aolr aolrVar = (aolr) this.a.bn.a();
                if (aolrVar == null) {
                    aooh.i("mainContext");
                }
                aeufVar = new apbj(aolrVar, 1, (byte[]) null);
                return aeufVar;
            case 327:
                defpackage.him himVar11 = this.a;
                aeufVar = new rmo((ajct) himVar11.r.a(), (android.content.Context) himVar11.s.a(), (zzd) himVar11.fa.a(), new rmp(), (rmb) himVar11.fe.a(), new adnp((ajcu) himVar11.r.a(), (ahbv) himVar11.fg.a(), dpy.p((ecx) himVar11.fi.a(), (ajct) himVar11.r.a())), (ipc) himVar11.fj.a(), himVar11.qo(), j$.util.Optional.of(himVar11.oJ()), himVar11.dK(), himVar11.sq(), (agsm) himVar11.aT.a());
                return aeufVar;
            case 328:
                return gus.V((android.content.Context) this.a.s.a(), "ANDROID_DIALER");
            case 329:
                defpackage.him himVar12 = this.a;
                android.content.Context context = (android.content.Context) himVar12.s.a();
                zdk zdkVar2 = (zdk) himVar12.fd.a();
                return new rmb(context, zdkVar2, 3, 5);
            case 330:
                defpackage.him himVar13 = this.a;
                zdkVar = new zdk(himVar13.o(), himVar13.fb, himVar13.fc, himVar13.n());
                return zdkVar;
            case 331:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.callingshared.directboot", "45771268").e());
            case 332:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.callingshared.directboot", "45804862").e());
            case 333:
                defpackage.him himVar14 = this.a;
                aeufVar = new ahbv((android.content.Context) himVar14.s.a(), (ajct) himVar14.L.a(), (ajct) himVar14.r.a(), (ajct) himVar14.as.a(), himVar14.ff);
                return aeufVar;
            case 334:
                return java.lang.Boolean.valueOf(((apnt) this.a.ql().b.a()).b("com.google.android.dialer.directboot", "45722836").e());
            case 335:
                return this.a.qc().h(zja.a("RemoteNumberLoggingSeed", rno.a).a());
            case 336:
                aolr aolrVar2 = (aolr) this.a.bg.a();
                if (aolrVar2 == null) {
                    aooh.i("backgroundContext");
                }
                aeufVar = new apbj(aolrVar2, 1, (byte[]) null);
                return aeufVar;
            case 337:
                aeufVar = new ipc((aazc) this.a.l.a());
                return aeufVar;
            case 338:
                gqg gqgVarB = gqg.a.b();
                if (gqgVarB != null) {
                    return new wgn(gqgVarB);
                }
                throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case 339:
                android.content.Context context2 = (android.content.Context) this.a.s.a();
                acxg acxgVar = aavl.a;
                aeufVar = new abce(context2, new aavk());
                return aeufVar;
            case 340:
                defpackage.him himVar15 = this.a;
                aeufVar = new hrj((aoss) himVar15.eX.a(), (aoss) himVar15.cb.a(), himVar15.nR(), (zpm) himVar15.fn.a(), (apni) himVar15.eY.a());
                return aeufVar;
            case 341:
                defpackage.him himVar16 = this.a;
                aeufVar = new zpm(himVar16.fm, (zpz) himVar16.fz.a(), (zjm) himVar16.gf.a(), new zzx(himVar16.he), new zzx(himVar16.hf), new zph(), (ajct) himVar16.r.a(), (aazc) himVar16.l.a(), (ajcu) himVar16.aN.a());
                return aeufVar;
            case 342:
                aeufVar = new aaha(this.a);
                return aeufVar;
            case 343:
                defpackage.him himVar17 = this.a;
                zpzVar = new zpz((zpy) himVar17.fv.a(), (ajct) himVar17.r.a());
                return zpzVar;
            case 344:
                defpackage.him himVar18 = this.a;
                return new zpy(himVar18.fn, new zzx(himVar18.gK));
            case 345:
                defpackage.him himVar19 = this.a;
                zjm zjmVarH = zjm.h(himVar19.fp);
                zjm zjmVarJR = himVar19.jR();
                amyz amyzVar = himVar19.fx;
                aooh.f(amyzVar, "impl");
                return aihd.u(zjmVarH, zjmVarJR, new zjm(amyzVar, new defpackage.hqc(3)), himVar19.jS(), zjm.h(himVar19.gJ));
            case 346:
                aeufVar = new zqa((aogc) this.a.fo.a());
                return aeufVar;
            case 347:
                return new aogc((byte[]) null);
            case 348:
                defpackage.him himVar20 = this.a;
                aeufVar = new pff(himVar20.mI(), (zpm) himVar20.fn.a(), (android.content.Context) himVar20.s.a(), (zpy) himVar20.fv.a(), (rlv) himVar20.fq.a(), (ajcu) himVar20.aN.a());
                return aeufVar;
            case 349:
                defpackage.him himVar21 = this.a;
                aeufVar = new wdx((android.content.Context) himVar21.s.a(), (rlv) himVar21.fq.a(), (urg) himVar21.ft.a(), (ajcu) himVar21.aN.a(), himVar21.on());
                return aeufVar;
            case 350:
                defpackage.him himVar22 = this.a;
                zdkVar = new urg((android.content.Context) himVar22.s.a(), (apdi) himVar22.fr.a(), himVar22.fs, himVar22.mS());
                return zdkVar;
            case 351:
                defpackage.him himVar23 = this.a;
                zdkVar = new apdi((android.content.Context) himVar23.s.a(), (ajct) himVar23.L.a(), (ajcu) himVar23.aN.a(), ahyn.h(ahua.b));
                return zdkVar;
            case 352:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer", "enable_oneplus_color_palette").e());
            case 353:
                return new hpy();
            case 354:
                defpackage.him himVar24 = this.a;
                aeufVar = new qdu((tkl) himVar24.fy.a(), (ajct) himVar24.r.a(), (zpy) himVar24.fv.a(), (zpm) himVar24.fn.a(), (qdo) himVar24.fB.a(), (zjv) himVar24.cf.a(), (qed) himVar24.gC.a());
                return aeufVar;
            case 355:
                defpackage.him himVar25 = this.a;
                aeufVar = new tkl((aoss) himVar25.cb.a(), (aolr) himVar25.bY.a(), (zjv) himVar25.cf.a(), (mgu) himVar25.ch.a(), himVar25.k());
                return aeufVar;
            case 356:
                defpackage.him himVar26 = this.a;
                zdkVar = new qdo(himVar26.f(), (zpz) himVar26.fz.a(), (ajcu) himVar26.r.a(), himVar26.fA);
                return zdkVar;
            case 357:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45477284").e());
            case 358:
                defpackage.him himVar27 = this.a;
                aeufVar = new qed(himVar27.f(), (aoss) himVar27.bZ.a(), (rlv) himVar27.fq.a(), (aazc) himVar27.l.a(), (tkl) himVar27.gv.a(), (apni) himVar27.eY.a(), (gpd) himVar27.fD.a(), himVar27.gB, (mgw) himVar27.cc.a());
                return aeufVar;
            case 359:
                defpackage.him himVar28 = this.a;
                zpzVar = new tkl((zpz) himVar28.fz.a(), new zzx(himVar28.gA), (ajcu) himVar28.aN.a());
                return zpzVar;
            case 360:
                amyz amyzVar2 = this.a.gz;
                aooh.f(amyzVar2, "wearAudioTransferListenerProvider");
                aeufVar = new aile(zjm.h(amyzVar2));
                return aeufVar;
            case 361:
                defpackage.him himVar29 = this.a;
                aeufVar = new wad((oud) himVar29.gw.a(), (aoss) himVar29.cb.a(), (apni) himVar29.eY.a(), himVar29.dS(), (zpm) himVar29.fn.a(), (gpd) himVar29.fD.a(), himVar29.gy);
                return aeufVar;
            case 362:
                defpackage.him himVar30 = this.a;
                aeufVar = new oud((ajct) himVar30.r.a(), (agsm) himVar30.aT.a(), (gpd) himVar30.fD.a(), (tkl) himVar30.gv.a());
                return aeufVar;
            case 363:
                defpackage.him himVar31 = this.a;
                aeufVar = new gpd(himVar31.fC, (zth) himVar31.gq.a(), (mca) himVar31.gu.a(), (zpm) himVar31.fn.a());
                return aeufVar;
            case 364:
                return java.lang.Boolean.valueOf(((apnt) this.a.py().b.a()).b("com.google.android.dialer.directboot", "45828449").e());
            case 365:
                defpackage.him himVar32 = this.a;
                aeufVar = new zth((rai) himVar32.gp.a(), (zpm) himVar32.fn.a());
                return aeufVar;
            case 366:
                aeufVar = new rai(this, (byte[]) null);
                return aeufVar;
            case 367:
                defpackage.him himVar33 = this.a;
                aeufVar = new zbm((aoss) himVar33.cb.a(), (aazc) himVar33.l.a(), (agqj) himVar33.gn.a(), himVar33.oq(), (ahbv) himVar33.gm.a(), new zzx(himVar33.oq(), (byte[]) null), j$.util.Optional.empty());
                return aeufVar;
            case 368:
                defpackage.him himVar34 = this.a;
                aeufVar = new agqj((ahbv) himVar34.gm.a(), himVar34.hv());
                return aeufVar;
            case 369:
                defpackage.him himVar35 = this.a;
                aeufVar = new ahbv(himVar35.oq(), (ajct) himVar35.r.a(), himVar35.hv(), himVar35.hl());
                return aeufVar;
            case 370:
                defpackage.him himVar36 = this.a;
                zjm zjmVarJT = himVar36.jT();
                amyz amyzVar3 = himVar36.ge;
                amyz amyzVar4 = himVar36.fC;
                if (amyzVar3 == null) {
                    aooh.i("impl");
                }
                if (amyzVar4 == null) {
                    aooh.i("enableMigration");
                }
                zjm zjmVar = new zjm(amyzVar3, new isk(amyzVar4, 17));
                amyz amyzVar5 = himVar36.gg;
                amyz amyzVar6 = himVar36.fC;
                if (amyzVar5 == null) {
                    aooh.i("impl");
                }
                if (amyzVar6 == null) {
                    aooh.i("enableMigration");
                }
                zjm zjmVar2 = new zjm(amyzVar5, new isk(amyzVar6, 16));
                amyz amyzVar7 = himVar36.gh;
                amyz amyzVar8 = himVar36.fC;
                if (amyzVar7 == null) {
                    aooh.i("impl");
                }
                if (amyzVar8 == null) {
                    aooh.i("enableMigration");
                }
                zjm zjmVar3 = new zjm(amyzVar7, new isk(amyzVar8, 15));
                amyz amyzVar9 = himVar36.gi;
                amyz amyzVar10 = himVar36.fC;
                aooh.f(amyzVar9, "impl");
                aooh.f(amyzVar10, "enableMigration");
                return aihd.u(zjmVarJT, zjmVar, zjmVar2, zjmVar3, new zjm(amyzVar9, new defpackage.len(amyzVar10, 18)));
            case 371:
                android.content.Context context3 = (android.content.Context) this.a.s.a();
                java.util.List list = zzd.m;
                zza zzaVar = new zza(context3, "ANDROID_DIALER_ANONYMOUS");
                zzaVar.a(zzv.b);
                ((zyw) zzaVar).f = new rma(2, (char[]) null);
                return zzaVar.b();
            case 372:
                defpackage.him himVar37 = this.a;
                aeufVar = new mbr((aoss) himVar37.cb.a(), (acxg) himVar37.fY.a(), j$.util.Optional.of(himVar37.qg()));
                return aeufVar;
            case 373:
                defpackage.him himVar38 = this.a;
                zpzVar = new acxg((aclt) himVar38.fW.a(), (adae) himVar38.fX.a());
                return zpzVar;
            case 374:
                defpackage.him himVar39 = this.a;
                aclr aclrVarEq = himVar39.eq();
                ajct ajctVar = (ajct) himVar39.L.a();
                amyz amyzVar11 = himVar39.fV;
                aiof aiofVar = acop.a;
                aile aileVar = new aile(new aaoo());
                return new aclt(ajctVar, amyzVar11, aileVar, aclrVarEq);
            case 375:
                defpackage.him himVar40 = this.a;
                return aihd.s(himVar40.er(), himVar40.es(), new acon(new aile((acom) himVar40.F.a())));
            case 376:
                zpzVar = new acor(new acoq(1), aigf.l("onegoogle-android", new aelq((android.content.Context) this.a.s.a()), "obake_android", new afmx()));
                return zpzVar;
            case 377:
                defpackage.him himVar41 = this.a;
                return new acly((android.content.Context) himVar41.s.a(), himVar41.fG, (ajct) himVar41.L.a());
            case 378:
                return (java.lang.Boolean) ahyn.h(java.lang.Boolean.TRUE).a;
            case 379:
                defpackage.him himVar42 = this.a;
                aigb aigbVarG = aigf.g(7);
                aigbVarG.i(200000050, himVar42.fI);
                aigbVarG.i(200000013, himVar42.fJ);
                aigbVarG.i(200000017, himVar42.fK);
                aigbVarG.i(200000028, himVar42.fL);
                aigbVarG.i(200000043, himVar42.fM);
                aigbVarG.i(200000076, himVar42.fN);
                aigbVarG.i(200000034, himVar42.fO);
                aigf aigfVarE = aigbVarG.e(true);
                aiof aiofVar2 = acop.a;
                aeufVar = new afpl(aigfVarE);
                return aeufVar;
            case 380:
                return new acoe(5);
            case 381:
                return new acoe(1);
            case 382:
                return new acoe(3);
            case 383:
                return new acoe(4);
            case 384:
                return new acoe(0);
            case 385:
                return new acoe(2);
            case 386:
                return new acoe(7);
            case 387:
                defpackage.him himVar43 = this.a;
                aigf aigfVarM = aigf.m(100000012, himVar43.fQ, 100000016, himVar43.fR, 100000037, himVar43.fS);
                aiof aiofVar3 = acop.a;
                aeufVar = new afpl(aigfVarM);
                return aeufVar;
            case 388:
                return new acoe(6);
            case 389:
                apdi apdiVar = aivq.d;
                int i2 = acnq.a;
                aeufVar = new acno(apdiVar);
                return aeufVar;
            case 390:
                apdi apdiVar2 = aivp.h;
                int i3 = acnq.a;
                aeufVar = new acno(apdiVar2);
                return aeufVar;
            case 391:
                aigf aigfVar = aikj.b;
                aiof aiofVar4 = acop.a;
                aeufVar = new afpl(aigfVar);
                return aeufVar;
            case 392:
                aeufVar = new adae((aclo) ahyn.h(new defpackage.aclp()).a);
                return aeufVar;
            case 393:
                defpackage.him himVar44 = this.a;
                amyz amyzVar12 = himVar44.fZ;
                if (amyzVar12 == null) {
                    aooh.i("androidAutoCuiMetadataPopulatorProvider");
                }
                zjm zjmVar4 = new zjm(amyzVar12, new vkc(2));
                amyz amyzVar13 = himVar44.ga;
                if (amyzVar13 == null) {
                    aooh.i("windowLayoutCuiMetadataPopulatorProvider");
                }
                zjm zjmVar5 = new zjm(amyzVar13, new vkc(2));
                amyz amyzVar14 = himVar44.gb;
                if (amyzVar14 == null) {
                    aooh.i("sessionCuiMetadataPopulatorProvider");
                }
                zjm zjmVar6 = new zjm(amyzVar14, new vkc(2));
                amyz amyzVar15 = himVar44.gc;
                if (amyzVar15 == null) {
                    aooh.i("tiktokTracingCuiMetadataPopulatorProvider");
                }
                return aihd.t(zjmVar4, zjmVar5, zjmVar6, new zjm(amyzVar15, new vkc(2)));
            case 394:
                aeufVar = new hra(this.a.sq());
                return aeufVar;
            case 395:
                aeufVar = new rmq(j$.util.Optional.of(this.a.oJ()));
                return aeufVar;
            case 396:
                aeufVar = new rnp((ipc) this.a.fj.a());
                return aeufVar;
            case 397:
                return new rnq();
            case 398:
                defpackage.him himVar45 = this.a;
                aeufVar = new mbo((rlv) himVar45.fq.a(), (zpm) himVar45.fn.a(), (zjm) himVar45.gf.a());
                return aeufVar;
            case 399:
                return new zjm();
            default:
                throw new java.lang.AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v100, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v107, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v114, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v121, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v128, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v146, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v153, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v160, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v167, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v180, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v187, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v194, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v201, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v208, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v215, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v222, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v229, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v236, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v243, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v250, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v257, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v264, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v271, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v278, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v285, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v292, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v299, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v306, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v313, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v320, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v327, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v334, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v341, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v348, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v355, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v362, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v369, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v376, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v383, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v390, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v397, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v404, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v411, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v418, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v425, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v432, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v439, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v446, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v453, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v460, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v467, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v474, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v481, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v488, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v495, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v502, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v509, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v516, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v523, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v530, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v543, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v554, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v563, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71, types: [aoin, java.lang.Object] */
    private final java.lang.Object r() {
        qmt mcaVar;
        int i = this.b;
        switch (i) {
            case 400:
                return new mbs(this.a.rp());
            case 401:
                return new defpackage.mbp(this.a.qn());
            case 402:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45843196").e());
            case 403:
                alfa alfaVarC = ((apnt) this.a.py().b.a()).b("com.google.android.dialer.directboot", "45430335").c();
                if (alfaVarC == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return alfaVarC;
            case 404:
                defpackage.him himVar = this.a;
                mcaVar = new mca((aoss) himVar.cb.a(), (aazc) himVar.l.a(), (mbl) himVar.gs.a(), (acxg) himVar.fY.a(), himVar.gt, j$.util.Optional.of(himVar.qg()), himVar.rp(), (adak) himVar.gr.a(), j$.util.Optional.empty(), himVar.qn(), new kaw(himVar.qn(), (byte[]) null));
                break;
            case 405:
                defpackage.him himVar2 = this.a;
                return new mbl((adak) himVar2.gr.a(), himVar2.hv());
            case 406:
                defpackage.him himVar3 = this.a;
                return new adak((rlv) himVar3.fq.a(), (ajct) himVar3.r.a(), himVar3.hv(), himVar3.gl, (zpm) himVar3.fn.a(), (zjm) himVar3.gf.a());
            case 407:
                return java.lang.Long.valueOf(((apnt) this.a.py().b.a()).b("com.google.android.dialer.directboot", "45386738").b());
            case 408:
                return new zzx((byte[]) null);
            case 409:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45830394").e());
            case 410:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45653997").e());
            case 411:
                defpackage.him himVar4 = this.a;
                android.content.Context context = (android.content.Context) himVar4.s.a();
                zpm zpmVar = (zpm) himVar4.fn.a();
                zpy zpyVar = (zpy) himVar4.fv.a();
                ajcu ajcuVar = (ajcu) himVar4.r.a();
                ajct ajctVar = (ajct) himVar4.L.a();
                zzx zzxVar = (zzx) himVar4.gx.a();
                java.lang.Object objGy = himVar4.gy();
                ipc ipcVar = new ipc((zpm) himVar4.fn.a(), (byte[]) null);
                qmm qmmVar = new qmm((android.content.Context) himVar4.s.a(), (qkj) himVar4.gy());
                ruc rucVar = (ruc) himVar4.eK.a();
                mcaVar = new qmt(context, zpmVar, zpyVar, ajcuVar, ajctVar, zzxVar, (qkj) objGy, ipcVar, qmmVar, rucVar, himVar4.gE, himVar4.gF, (zpz) himVar4.fz.a(), (rlv) himVar4.fq.a(), (gpd) himVar4.fD.a(), afsq.cM(j$.util.Optional.of(new defpackage.heq((android.content.Context) himVar4.s.a())), j$.util.Optional.of(new hrc(1))), himVar4.gG, himVar4.gH, new qkl(himVar4.gI));
                break;
            case 412:
                return java.lang.Long.valueOf(((apnt) this.a.sE().a.a()).b("com.google.android.dialer.directboot", "45379391").b());
            case 413:
                return java.lang.Double.valueOf(((apnt) this.a.sE().a.a()).b("com.google.android.dialer.directboot", "45385877").a());
            case 414:
                return java.lang.Boolean.valueOf(((apnt) this.a.pm().a.a()).b("com.google.android.dialer.directboot", "45732708").e());
            case 415:
                return java.lang.Boolean.valueOf(((apnt) this.a.pm().a.a()).b("com.google.android.dialer.directboot", "45806239").e());
            case 416:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45778932").e());
            case 417:
                defpackage.him himVar5 = this.a;
                zjm zjmVarH = zjm.h(new ozw((php) himVar5.gL.a(), 6));
                zjm zjmVarH2 = zjm.h(himVar5.gM);
                amyz amyzVar = himVar5.fw;
                aooh.f(amyzVar, "impl");
                zjm zjmVarH3 = zjm.h(new ozw(amyzVar, 4));
                oac oacVar = (oac) himVar5.gT.a();
                aooh.f(oacVar, "emergencyLocationUpdater");
                zjm zjmVarH4 = zjm.h(new defpackage.nzq(oacVar, 2));
                zjm zjmVarH5 = zjm.h(new defpackage.omm(new otg((qba) himVar5.gU.a()), 15));
                amyz amyzVar2 = himVar5.gV;
                aooh.f(amyzVar2, "impl");
                zjm zjmVar = new zjm(amyzVar2, new defpackage.hqc(2));
                amyz amyzVar3 = himVar5.gW;
                aooh.f(amyzVar3, "motorolaInCallUiNotifier");
                hvy hvyVar = (hvy) himVar5.hb.a();
                aooh.f(hvyVar, "voiceAssistAudioGenerator");
                return aihd.v(zjmVarH, zjmVarH2, zjmVarH3, zjmVarH4, zjmVarH5, zjmVar, new zjm[]{himVar5.jN(), zjm.h(new qdh(amyzVar3, 1)), zjm.h(new defpackage.hqd(hvyVar, 7)), zjm.h(new pvn(himVar5.hc, 12)), zjm.h(new qwe((qqm) himVar5.hd.a(), 1))});
            case 418:
                return new php();
            case 419:
                defpackage.him himVar6 = this.a;
                return new mef((android.content.Context) himVar6.s.a(), (ajct) himVar6.L.a());
            case 420:
                defpackage.him himVar7 = this.a;
                aanj aanjVar = (aanj) himVar7.gN.a();
                ajct ajctVar2 = (ajct) himVar7.r.a();
                amyz amyzVar4 = himVar7.gO;
                amyz amyzVar5 = himVar7.gP;
                amyz amyzVar6 = himVar7.gQ;
                return new oac(aanjVar, ajctVar2, new jxo(amyzVar4, amyzVar5, amyzVar6, himVar7.gR), himVar7.gS, amyzVar4, amyzVar5, amyzVar6, (zpm) himVar7.fn.a(), (gpd) himVar7.fD.a(), himVar7.dT(), (rlv) himVar7.fq.a(), (aoss) himVar7.cb.a(), (zjv) himVar7.cf.a());
            case 421:
                android.content.Context context2 = (android.content.Context) this.a.s.a();
                int i2 = defpackage.aanr.a;
                return new aany(context2);
            case 422:
                return java.lang.Long.valueOf(((apnt) this.a.sF().a.a()).b("com.google.android.dialer.directboot", "45426331").b());
            case 423:
                return java.lang.Boolean.valueOf(((apnt) this.a.sF().a.a()).b("com.google.android.dialer.directboot", "45839358").e());
            case 424:
                return java.lang.Long.valueOf(((apnt) this.a.sF().a.a()).b("com.google.android.dialer.directboot", "45839359").b());
            case 425:
                return java.lang.Long.valueOf(((apnt) this.a.sF().a.a()).b("com.google.android.dialer.directboot", "45426377").b());
            case 426:
                return java.lang.Long.valueOf(((apnt) this.a.sF().a.a()).b("com.google.android.dialer.directboot", "45426330").b());
            case 427:
                defpackage.him himVar8 = this.a;
                return new qba((aogc) himVar8.fo.a(), (ajct) himVar8.r.a(), (gpd) himVar8.fD.a());
            case 428:
                return new hps();
            case 429:
                return new qbx((android.content.Context) this.a.s.a());
            case 430:
                defpackage.him himVar9 = this.a;
                return new hvy(himVar9.x(), (gpd) himVar9.fD.a(), (aolr) himVar9.bg.a(), (aoss) himVar9.cb.a(), (android.content.Context) himVar9.s.a());
            case 431:
                return java.lang.Boolean.valueOf(((apnt) this.a.pI().a.a()).b("com.google.android.dialer", "G__enable_emergency_panel").e());
            case 432:
                return java.lang.Boolean.valueOf(((apnt) this.a.pI().a.a()).b("com.google.android.dialer", "G__enable_voice_assist_on_emergency_panel").e());
            case 433:
                return java.lang.Boolean.valueOf(((apnt) this.a.pI().a.a()).b("com.google.android.dialer", "force_enable_assisted_emergency_dialing_for_testing").e());
            case 434:
                ypt yptVarC = ((apnt) this.a.pI().a.a()).b("com.google.android.dialer", "AssistedEmergencyDialing__assisted_emergency_dialing_countries").c();
                aooc.ap(yptVarC);
                return yptVarC;
            case 435:
                return new pvk();
            case 436:
                return new qqm();
            case 437:
                return new aile(zjm.h(new defpackage.lwt(new defpackage.vk((gpd) this.a.fD.a()), 8)));
            case 438:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45740435").e());
            case 439:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45776236").b());
            case 440:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45776235").b());
            case 441:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45776237").b());
            case 442:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45776238").b());
            case 443:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45776239").b());
            case 444:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45776240").b());
            case 445:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45776241").b());
            case 446:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45776242").b());
            case 447:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45776243").b());
            case 448:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45776299").b());
            case 449:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45776244").b());
            case 450:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45776245").b());
            case 451:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45776246").b());
            case 452:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45776247").b());
            case 453:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45776691").b());
            case 454:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45776692").b());
            case 455:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45777518").b());
            case 456:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45777519").b());
            case 457:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45777520").b());
            case 458:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45777521").b());
            case 459:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45777522").b());
            case 460:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45777523").b());
            case 461:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45777524").b());
            case 462:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45777525").b());
            case 463:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45777526").b());
            case 464:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45777527").b());
            case 465:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45777528").b());
            case 466:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45777529").b());
            case 467:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45793531").b());
            case 468:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45777530").b());
            case 469:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45777531").b());
            case 470:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45777532").b());
            case 471:
                return java.lang.Long.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45720269").b());
            case 472:
                return java.lang.Long.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45720268").b());
            case 473:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45862518").e());
            case 474:
                return java.lang.Long.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45720270").b());
            case 475:
                return java.lang.Long.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45720850").b());
            case 476:
                return java.lang.Long.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45720851").b());
            case 477:
                return java.lang.Long.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45720852").b());
            case 478:
                return java.lang.Long.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45720853").b());
            case 479:
                return java.lang.Long.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45720854").b());
            case 480:
                return java.lang.Long.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45744366").b());
            case 481:
                return java.lang.Long.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45750311").b());
            case 482:
                return java.lang.Long.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45670363").b());
            case 483:
                return java.lang.Long.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45790001").b());
            case 484:
                return java.lang.Long.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45790002").b());
            case 485:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45823785").b());
            case 486:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45823799").b());
            case 487:
                return java.lang.Double.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45823800").a());
            case 488:
                return java.lang.Long.valueOf(((apnt) this.a.qY().a.a()).b("com.google.android.dialer.directboot", "45823805").b());
            case 489:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45823090").e());
            case 490:
                return java.lang.Boolean.valueOf(((apnt) this.a.rE().a.a()).b("com.google.android.dialer.directboot", "45839905").e());
            case 491:
                defpackage.him himVar10 = this.a;
                return new defpackage.jcz(himVar10.il, himVar10.E(), (jbm) himVar10.eW.a());
            case 492:
                return java.lang.Long.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45837571").b());
            case 493:
                return new defpackage.jnl(this.a.bX);
            case 494:
                return java.lang.Boolean.valueOf(((apnt) this.a.pn().b.a()).b("com.google.android.dialer.directboot", "45784736").e());
            case 495:
                return new defpackage.nkh();
            case 496:
                defpackage.him himVar11 = this.a;
                return new defpackage.nki(himVar11.aL(), himVar11.wU);
            case 497:
                return this.a.qc().h(zja.b("DarpaData", gus.aS(mfd.a.m()).R(), (java.lang.Iterable) null, (aonj) null, 12));
            case 498:
                defpackage.him himVar12 = this.a;
                return aihd.r(zjm.h(himVar12.iw), himVar12.kT());
            case 499:
                defpackage.him himVar13 = this.a;
                return new defpackage.jrn(new defpackage.jrp((uhs) himVar13.iu.a(), himVar13.mF(), (aoss) himVar13.cb.a(), himVar13.mO(), himVar13.ca()), himVar13.ca(), (aogc) himVar13.fo.a());
            default:
                throw new java.lang.AssertionError(i);
        }
        return mcaVar;
    }

    /* JADX WARN: Type inference failed for: r0v106, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v114, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v122, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v130, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v138, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v145, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v152, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v159, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v167, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v175, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v183, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v191, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v199, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v207, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v244, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v252, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v260, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v268, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v276, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v284, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v292, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v300, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v308, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v316, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v324, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v332, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v340, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v348, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v356, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v364, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v385, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v393, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v401, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v409, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v417, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v425, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v433, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v441, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v449, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v457, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v465, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v473, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v481, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v489, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v497, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v505, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v513, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v521, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v529, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v537, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v581, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v589, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v598, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v606, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v621, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v637, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v645, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v74, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v82, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v90, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v98, types: [aoin, java.lang.Object] */
    private final java.lang.Object s() {
        aazk uhsVar;
        xeh ahbzVar;
        int i = this.b;
        switch (i) {
            case 500:
                defpackage.him himVar = this.a;
                uhsVar = new uhs((android.content.Context) himVar.s.a(), (java.util.concurrent.ScheduledExecutorService) himVar.r.a(), (ajct) himVar.r.a(), himVar.ir, himVar.is, himVar.it, himVar.re(), himVar.bc(), himVar.ca(), himVar.mO());
                return uhsVar;
            case 501:
                return java.lang.Long.valueOf(((apnt) this.a.rx().a.a()).b("com.google.android.dialer", "G__percentage_of_spam_notifications_to_show").b());
            case 502:
                return java.lang.Long.valueOf(((apnt) this.a.rx().a.a()).b("com.google.android.dialer", "G__percentage_of_non_spam_notifications_to_show").b());
            case 503:
                return java.lang.Long.valueOf(((apnt) this.a.pU().a.a()).b("com.google.android.dialer", "revelio_fi_spam_option_update_timeout_millis").b());
            case 504:
                return java.lang.Boolean.valueOf(((apnt) new vaa(this.a.aZ, (byte[]) null).a.a()).b("com.google.android.dialer.directboot", "45624590").e());
            case 505:
                defpackage.him himVar2 = this.a;
                uhsVar = new defpackage.nnk(himVar2.aM(), (aogc) himVar2.fo.a());
                return uhsVar;
            case 506:
                defpackage.him himVar3 = this.a;
                uhsVar = new mns(himVar3.ix, (rlv) himVar3.fq.a(), (mvy) himVar3.iG.a(), himVar3.aI(), himVar3.iJ, himVar3.iK, himVar3.iL, himVar3.iM, himVar3.iN, himVar3.iO, himVar3.iP, himVar3.iI, himVar3.iQ, himVar3.iR, himVar3.iS, himVar3.iT);
                return uhsVar;
            case 507:
                java.lang.String strD = ((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45622926").d();
                aooc.ap(strD);
                return strD;
            case 508:
                defpackage.him himVar4 = this.a;
                uhsVar = new mvy((android.content.Context) himVar4.s.a(), himVar4.iy, himVar4.iz, himVar4.iA, himVar4.iB, himVar4.iC, himVar4.iD, himVar4.iE, himVar4.iF);
                return uhsVar;
            case 509:
                return java.lang.Boolean.valueOf(((apnt) this.a.pd().b.a()).b("com.google.android.dialer.directboot", "45628184").e());
            case 510:
                return java.lang.Boolean.valueOf(((apnt) this.a.pd().b.a()).b("com.google.android.dialer.directboot", "45628185").e());
            case 511:
                return java.lang.Boolean.valueOf(((apnt) this.a.pd().b.a()).b("com.google.android.dialer.directboot", "45633861").e());
            case 512:
                return java.lang.Boolean.valueOf(((apnt) this.a.pd().b.a()).b("com.google.android.dialer.directboot", "45645737").e());
            case 513:
                return java.lang.Boolean.valueOf(((apnt) this.a.pd().b.a()).b("com.google.android.dialer.directboot", "45667116").e());
            case 514:
                return java.lang.Boolean.valueOf(((apnt) this.a.pd().b.a()).b("com.google.android.dialer.directboot", "45667117").e());
            case 515:
                return java.lang.Boolean.valueOf(((apnt) this.a.pd().b.a()).b("com.google.android.dialer.directboot", "45667118").e());
            case 516:
                return java.lang.Long.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45690158").b());
            case 517:
                java.lang.String strD2 = ((apnt) this.a.pd().b.a()).b("com.google.android.dialer.directboot", "45628211").d();
                if (strD2 == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return strD2;
            case 518:
                return java.lang.Boolean.valueOf(((apnt) this.a.qZ().a.a()).b("com.google.android.dialer.directboot", "45770994").e());
            case 519:
                return java.lang.Boolean.valueOf(((apnt) this.a.rg().a.a()).b("com.google.android.dialer.directboot", "45628748").e());
            case 520:
                java.lang.String strD3 = ((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45657947").d();
                aooc.ap(strD3);
                return strD3;
            case 521:
                java.lang.String strD4 = ((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45658370").d();
                aooc.ap(strD4);
                return strD4;
            case 522:
                java.lang.String strD5 = ((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45658640").d();
                aooc.ap(strD5);
                return strD5;
            case 523:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45663785").e());
            case 524:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45848927").e());
            case 525:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45664634").e());
            case 526:
                return java.lang.Long.valueOf(((apnt) this.a.qZ().a.a()).b("com.google.android.dialer.directboot", "45785690").b());
            case 527:
                return java.lang.Long.valueOf(((apnt) this.a.qZ().a.a()).b("com.google.android.dialer.directboot", "45785691").b());
            case 528:
                return java.lang.Long.valueOf(((apnt) this.a.qZ().a.a()).b("com.google.android.dialer.directboot", "45801072").b());
            case 529:
                return java.lang.Long.valueOf(((apnt) this.a.qZ().a.a()).b("com.google.android.dialer.directboot", "45787920").b());
            case 530:
                defpackage.him himVar5 = this.a;
                android.content.Context context = (android.content.Context) himVar5.s.a();
                ajct ajctVar = (ajct) himVar5.L.a();
                aify aifyVar = (aify) himVar5.lm.a();
                aogc aogcVar = (aogc) himVar5.ob.a();
                aogc aogcVar2 = (aogc) himVar5.iV.a();
                adch adchVar = (adch) himVar5.oc.a();
                ahyn ahynVarH = ahyn.h((adce) himVar5.jo.a());
                ahzi ahziVar = (ahzi) himVar5.jq.a();
                ahyn ahynVarH2 = ahyn.h((adae) himVar5.od.a());
                adae adaeVar = (adae) himVar5.oe.a();
                adae adaeVar2 = (adae) himVar5.jt.a();
                acxa acxaVar = (acxa) himVar5.of.a();
                ahbz ahbzVar2 = (ahbz) himVar5.js.a();
                ahwt ahwtVar = ahwt.a;
                return abrz.ag(context, ajctVar, aifyVar, aogcVar, aogcVar2, adchVar, ahynVarH, ahziVar, ahynVarH2, adaeVar, adaeVar2, acxaVar, ahbzVar2, ahwtVar, ahwtVar, (acvl) himVar5.jp.a(), ahwtVar, ahwtVar);
            case 531:
                aify aifyVarG = new zzx(this.a.nZ).e().g();
                aooc.ap(aifyVarG);
                return aifyVarG;
            case 532:
                defpackage.him himVar6 = this.a;
                return aihd.v(himVar6.lf(), himVar6.lg(), himVar6.lh(), himVar6.li(), (zjm) himVar6.kp.a(), himVar6.lj(), new zjm[]{himVar6.lk(), himVar6.ll(), himVar6.ln(), himVar6.lm(), himVar6.lo(), zjm.h(new vfy(himVar6.nW, 14)), himVar6.lp()});
            case 533:
                defpackage.him himVar7 = this.a;
                android.content.Context context2 = (android.content.Context) himVar7.s.a();
                ahzi ahziVarBI = ahvr.bI(new acxt((java.util.concurrent.ScheduledExecutorService) himVar7.as.a(), (acvl) himVar7.jp.a(), amyu.b(himVar7.jn), context2, ahyn.h((adce) himVar7.jo.a()), (aogc) himVar7.iV.a()));
                aooc.ap(ahziVarBI);
                return ahziVarBI;
            case 534:
                android.content.Context context3 = (android.content.Context) this.a.s.a();
                uhsVar = new aogc(java.util.Arrays.asList(new afeh(new ajxw(context3))), java.util.Arrays.asList(new afgb(context3, afgb.b), new afga()));
                return uhsVar;
            case 535:
                java.lang.Object obj = ((ajyk) this.a.jm.a()).b;
                aooc.ap(obj);
                return obj;
            case 536:
                defpackage.him himVar8 = this.a;
                return agwm.u((ulw) himVar8.gn(), himVar8.hy());
            case 537:
                return java.lang.Long.valueOf(((apnt) this.a.rI().a.a()).b("tiktok.directboot", "45764475").b());
            case 538:
                return java.lang.Boolean.valueOf(((apnt) this.a.rI().a.a()).b("tiktok.directboot", "45816215").e());
            case 539:
                return java.lang.Boolean.valueOf(((apnt) this.a.rI().a.a()).b("tiktok.directboot", "45782422").e());
            case 540:
                return java.lang.Boolean.valueOf(((apnt) this.a.rI().a.a()).b("tiktok.directboot", "45716810").e());
            case 541:
                return java.lang.Boolean.valueOf(((apnt) this.a.rI().a.a()).b("tiktok.directboot", "45786469").e());
            case 542:
                return java.lang.Boolean.valueOf(((apnt) this.a.rI().a.a()).b("tiktok.directboot", "45724893").e());
            case 543:
                return java.lang.Boolean.valueOf(((apnt) this.a.rI().a.a()).b("tiktok.directboot", "45864994").e());
            case 544:
                return java.lang.Boolean.valueOf(((apnt) this.a.rI().a.a()).b("tiktok.directboot", "45814620").e());
            case 545:
                return java.lang.Boolean.valueOf(((apnt) this.a.rI().a.a()).b("tiktok.directboot", "45776417").e());
            case 546:
                return java.lang.Boolean.valueOf(((apnt) this.a.rI().a.a()).b("tiktok.directboot", "45786470").e());
            case 547:
                return java.lang.Boolean.valueOf(((apnt) this.a.rI().a.a()).b("tiktok.directboot", "45846409").e());
            case 548:
                return java.lang.Boolean.valueOf(((apnt) this.a.rI().a.a()).b("tiktok.directboot", "45776432").e());
            case 549:
                return java.lang.Boolean.valueOf(((apnt) this.a.rI().a.a()).b("tiktok.directboot", "45776448").e());
            case 550:
                return java.lang.Boolean.valueOf(((apnt) this.a.rI().a.a()).b("tiktok.directboot", "45780225").e());
            case 551:
                return java.lang.Long.valueOf(((apnt) this.a.rI().a.a()).b("tiktok.directboot", "45777917").b());
            case 552:
                return java.lang.Long.valueOf(((apnt) this.a.rI().a.a()).b("tiktok.directboot", "45780221").b());
            case 553:
                defpackage.him himVar9 = this.a;
                uhsVar = new adce((ajct) himVar9.L.a());
                return uhsVar;
            case 554:
                return new acwy();
            case 555:
                defpackage.him himVar10 = this.a;
                java.util.concurrent.Executor executor = (java.util.concurrent.Executor) himVar10.jr.a();
                aogc aogcVar3 = (aogc) himVar10.iV.a();
                afhj afhjVar = afhj.a;
                java.util.HashMap map = new java.util.HashMap();
                agab.ag(afha.a, map);
                ahbzVar = new ahbz(executor, aogcVar3, afhjVar, map);
                return ahbzVar;
            case 556:
                uhsVar = new adae((android.content.Context) this.a.s.a(), (byte[]) null);
                return uhsVar;
            case 557:
                return java.lang.Boolean.valueOf(((apnt) this.a.pw().a.a()).b("com.google.android.dialer", "enable_call_screen_i18n_tidepods").e());
            case 558:
                return java.lang.Boolean.valueOf(((apnt) this.a.pi().b.a()).b("com.google.android.dialer.directboot", "45623627").e());
            case 559:
                return java.lang.Boolean.valueOf(((apnt) this.a.pi().b.a()).b("com.google.android.dialer.directboot", "45630269").e());
            case 560:
                return java.lang.Boolean.valueOf(((apnt) this.a.pi().b.a()).b("com.google.android.dialer.directboot", "45650120").e());
            case 561:
                return java.lang.Boolean.valueOf(((apnt) this.a.pi().b.a()).b("com.google.android.dialer.directboot", "45624401").e());
            case 562:
                return java.lang.Boolean.valueOf(((apnt) this.a.pi().b.a()).b("com.google.android.dialer.directboot", "45633349").e());
            case 563:
                return java.lang.Boolean.valueOf(((apnt) this.a.pi().b.a()).b("com.google.android.dialer.directboot", "45661658").e());
            case 564:
                return java.lang.Boolean.valueOf(((apnt) this.a.pi().b.a()).b("com.google.android.dialer.directboot", "45661659").e());
            case 565:
                return java.lang.Boolean.valueOf(((apnt) this.a.pi().b.a()).b("com.google.android.dialer.directboot", "45648240").e());
            case 566:
                return java.lang.Boolean.valueOf(((apnt) this.a.pi().b.a()).b("com.google.android.dialer.directboot", "45670773").e());
            case 567:
                return java.lang.Boolean.valueOf(((apnt) this.a.pi().b.a()).b("com.google.android.dialer.directboot", "45730929").e());
            case 568:
                return java.lang.Boolean.valueOf(((apnt) this.a.pi().b.a()).b("com.google.android.dialer.directboot", "45723023").e());
            case 569:
                return java.lang.Boolean.valueOf(((apnt) this.a.pi().b.a()).b("com.google.android.dialer.directboot", "45721382").e());
            case 570:
                return java.lang.Boolean.valueOf(((apnt) this.a.pi().b.a()).b("com.google.android.dialer.directboot", "45723022").e());
            case 571:
                return java.lang.Boolean.valueOf(((apnt) this.a.pi().b.a()).b("com.google.android.dialer.directboot", "45723093").e());
            case 572:
                return java.lang.Boolean.valueOf(((apnt) this.a.pi().b.a()).b("com.google.android.dialer.directboot", "45723102").e());
            case 573:
                acve acveVarC = ((apnt) this.a.pw().a.a()).b("com.google.android.dialer", "CallScreenI18n__default_manifest_file_flag").c();
                aooc.ap(acveVarC);
                return acveVarC;
            case 574:
                ypq ypqVarC = ((apnt) this.a.pw().a.a()).b("com.google.android.dialer", "CallScreenI18n__call_screen_i18n_config").c();
                aooc.ap(ypqVarC);
                return ypqVarC;
            case 575:
                ypo ypoVarC = ((apnt) this.a.pw().a.a()).b("com.google.android.dialer", "CallScreenI18n__call_screen_device_specific_asr_model_override").c();
                aooc.ap(ypoVarC);
                return ypoVarC;
            case 576:
                return java.lang.Boolean.valueOf(((apnt) this.a.pJ().a.a()).b("com.google.android.dialer", "G__speak_easy_use_soda_asr").e());
            case 577:
                defpackage.him himVar11 = this.a;
                return himVar11.qc().h(himVar11.eY());
            case 578:
                java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(7);
                annk annkVar = new annk((byte[]) null, (byte[]) null, (byte[]) null);
                annkVar.o("call-screen-listening-scheduled-executor-service-%d");
                scheduledThreadPoolExecutor.setThreadFactory(annk.p(annkVar));
                ajcu ajcuVarS = aiql.s(scheduledThreadPoolExecutor);
                if (ajcuVarS == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return ajcuVarS;
            case 579:
                adoc adocVar = new adoc((byte[]) null);
                j$.util.Optional optionalEmpty = j$.util.Optional.empty();
                if (optionalEmpty == null) {
                    throw new java.lang.NullPointerException("Null customTerseModel");
                }
                adocVar.a = optionalEmpty;
                adocVar.f = 1;
                adocVar.b = "dogfood_dialer_asr_engine_en_us_v13";
                adocVar.c = 1;
                adocVar.e = (byte) (adocVar.e | 1);
                adocVar.d = "model/dictation_int.config";
                adocVar.c(0);
                adocVar.e(false);
                adocVar.e = (byte) (adocVar.e | 4);
                return adocVar;
            case 580:
                defpackage.him himVar12 = this.a;
                ahbzVar = new xeh((android.content.Context) himVar12.s.a(), (adqn) himVar12.jW.a(), (ajct) himVar12.r.a(), himVar12.jX);
                return ahbzVar;
            case 581:
                defpackage.him himVar13 = this.a;
                return new adqn((android.content.Context) himVar13.s.a(), (adnu) himVar13.jV.a());
            case 582:
                defpackage.him himVar14 = this.a;
                return new adqe((android.content.Context) himVar14.s.a(), (adsg) himVar14.jS.a(), (adqb) himVar14.jU.a());
            case 583:
                defpackage.him himVar15 = this.a;
                uhsVar = new adsd((adoy) himVar15.jR.a());
                return uhsVar;
            case 584:
                defpackage.him himVar16 = this.a;
                android.content.Context context4 = (android.content.Context) himVar16.s.a();
                return new adoy(context4, j$.util.Optional.empty());
            case 585:
                return new aiyy();
            case 586:
                uhsVar = new adqb((adrg) this.a.jT.a());
                return uhsVar;
            case 587:
                return new adrg();
            case 588:
                return java.lang.Boolean.valueOf(((apnt) this.a.pJ().a.a()).b("com.google.android.dialer", "G__donation_based_intro_message_enabled").e());
            case 589:
                return java.lang.Boolean.valueOf(((apnt) this.a.pJ().a.a()).b("com.google.android.dialer", "G__speakeasy_audio_donation_enabled").e());
            case 590:
                defpackage.him himVar17 = this.a;
                uhsVar = new ljb((android.content.Context) himVar17.s.a(), (ajct) himVar17.as.a(), (ajct) himVar17.L.a(), (ajct) himVar17.r.a(), (ajcu) himVar17.aN.a(), himVar17.al(), himVar17.aq());
                return uhsVar;
            case 591:
                acux acuxVarC = ((apnt) this.a.pU().a.a()).b("com.google.android.dialer", "audio_download_group_config").c();
                aooc.ap(acuxVarC);
                return acuxVarC;
            case 592:
                return java.lang.Boolean.valueOf(((apnt) this.a.pE().a.a()).b("com.google.android.dialer", "G__enable_tidepods_revelio").e());
            case 593:
                uhsVar = new jdh(this.a.E());
                return uhsVar;
            case 594:
                uhsVar = new aazk((android.content.Context) this.a.s.a());
                return uhsVar;
            case 595:
                java.lang.String strD6 = ((apnt) this.a.rn().a.a()).b("com.google.android.dialer.directboot", "45765931").d();
                aooc.ap(strD6);
                return strD6;
            case 596:
                return new adae(defpackage.him.iX(), (byte[]) null);
            case 597:
                defpackage.him himVar18 = this.a;
                abar abarVarEb = himVar18.eb();
                abaw abawVar = new abaw((adae) himVar18.kh.a(), j$.util.Optional.empty(), j$.util.Optional.empty());
                j$.util.Optional optionalOf = j$.util.Optional.of(java.lang.Boolean.valueOf(himVar18.iq()));
                j$.util.Optional optionalOf2 = j$.util.Optional.of(java.lang.Boolean.valueOf(himVar18.io()));
                j$.util.Optional optionalEmpty2 = j$.util.Optional.empty();
                aooh.f(optionalOf, "enableWestworldLogging");
                aooh.f(optionalOf2, "enableMigrationClearcutLogging");
                aooh.f(optionalEmpty2, "enableHadesEventStartedLogging");
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                if (((java.lang.Boolean) aooh.p(optionalOf, bool)).booleanValue()) {
                    linkedHashSet.add(abawVar);
                }
                if (((java.lang.Boolean) aooh.p(optionalOf2, bool)).booleanValue()) {
                    linkedHashSet.add(abarVarEb);
                }
                return new abat(linkedHashSet, optionalEmpty2);
            case 598:
                return java.lang.Boolean.valueOf(((apnt) this.a.rn().a.a()).b("com.google.android.dialer.directboot", "45782260").e());
            case 599:
                return java.lang.Boolean.valueOf(((apnt) this.a.rn().a.a()).b("com.google.android.dialer.directboot", "45782694").e());
            default:
                throw new java.lang.AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r15v101, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v107, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v113, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v165, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v184, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v192, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v199, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v206, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v213, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v219, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v24, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v289, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v3, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v31, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v311, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v321, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v328, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v336, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v342, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v348, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v354, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v360, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v366, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v375, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v381, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v387, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v393, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v399, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v405, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v41, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v54, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v61, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v68, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v75, types: [aoin, java.lang.Object] */
    private final java.lang.Object t() {
        anro anroVarA;
        abbr abajVar;
        ajct ajctVarR;
        int i = this.b;
        switch (i) {
            case 600:
                return java.lang.Long.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45813352").b());
            case 601:
                defpackage.him himVar = this.a;
                return java.lang.Boolean.valueOf(mwd.a((rlv) himVar.fq.a(), himVar.aI()));
            case 602:
                acux acuxVarA = this.a.aI().a();
                mwd.b.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/mdd/impl/DobbyMddModule$Companion", "provideMddConfigToDownload$<anonymous>", 54, "DobbyMddModule.kt").w("providing new file group to MDD infra: %s", acuxVarA.e);
                aooc.ap(acuxVarA);
                return acuxVarA;
            case 603:
                defpackage.him himVar2 = this.a;
                return zjm.h(new ldr((aogc) himVar2.iV.a(), (ajct) himVar2.L.a(), (android.content.Context) himVar2.s.a(), (ahzi) himVar2.jq.a(), (ahbz) himVar2.js.a(), (adae) himVar2.jt.a(), himVar2.ko, (jvp) himVar2.gi(), 1));
            case 604:
                acve acveVarC = ((apnt) this.a.pg().a.a()).b("com.google.android.dialer", "CallerTag__manifest_file_flag").c();
                aooc.ap(acveVarC);
                return acveVarC;
            case 605:
                acve acveVarC2 = ((apnt) this.a.rh().a.a()).b("com.google.android.dialer.directboot", "45414667").c();
                aooc.ap(acveVarC2);
                return acveVarC2;
            case 606:
                defpackage.him himVar3 = this.a;
                return new tmi(himVar3.kr, himVar3.ks, himVar3.kt, himVar3.ku, himVar3.kv, himVar3.kw, himVar3.be(), himVar3.ck(), (aogc) himVar3.kz.a());
            case 607:
                return java.lang.Boolean.valueOf(((apnt) this.a.qy().a.a()).b("com.google.android.dialer.directboot", "45677101").e());
            case 608:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45814618").e());
            case 609:
                return java.lang.Boolean.valueOf(((apnt) this.a.qv().a.a()).b("com.google.android.dialer.directboot", "45807444").e());
            case 610:
                return java.lang.Boolean.valueOf(((apnt) this.a.qv().a.a()).b("com.google.android.dialer.directboot", "45806275").e());
            case 611:
                return java.lang.Boolean.valueOf(((apnt) this.a.qv().a.a()).b("com.google.android.dialer.directboot", "45806276").e());
            case 612:
                return java.lang.Boolean.valueOf(((apnt) this.a.qv().a.a()).b("com.google.android.dialer.directboot", "45843854").e());
            case 613:
                defpackage.him himVar4 = this.a;
                return new aogc((ecx) himVar4.lO.a(), (rlv) himVar4.fq.a(), himVar4.mP());
            case 614:
                defpackage.him himVar5 = this.a;
                return himVar5.qc().h(himVar5.fd());
            case 615:
                defpackage.him himVar6 = this.a;
                return aihd.r(himVar6.lT(), himVar6.kh());
            case 616:
                defpackage.him himVar7 = this.a;
                return new tlq(himVar7.iZ(), (rlv) himVar7.fq.a(), (ecx) himVar7.kx.a());
            case 617:
                return this.a.qc().h(zja.b("SharpieJoyballData", wsc.cx(tlf.a.m()).ah(), (java.lang.Iterable) null, (aonj) null, 12));
            case 618:
                defpackage.him himVar8 = this.a;
                return new tsc(himVar8.kz, himVar8.lK, (iqe) himVar8.lL.a());
            case 619:
                defpackage.him himVar9 = this.a;
                return new tsg((aoss) himVar9.cb.a(), (aoss) himVar9.bZ.a(), (aogc) himVar9.fo.a(), (aogc) himVar9.kz.a(), new tsj((android.content.Context) himVar9.s.a(), (aoss) himVar9.cb.a(), (aazc) himVar9.l.a(), (aogc) himVar9.kz.a(), himVar9.cs(), (ajxw) himVar9.ld.a(), (rlv) himVar9.fq.a(), himVar9.ck(), himVar9.dE()), himVar9.co(), (tmi) himVar9.lh.a(), himVar9.bf(), (ajxw) himVar9.ld.a(), himVar9.nq(), himVar9.dE(), (apni) himVar9.eY.a(), himVar9.j());
            case 620:
                return this.a.qc().h(zja.a("PersistedLanguagePackInfo", twk.a).a());
            case 621:
                return java.lang.Long.valueOf(((apnt) this.a.pM().a.a()).b("com.google.android.dialer", "SodaTranscription__persisted_language_pack_info_refresh_frequency_hours").b());
            case 622:
                return java.lang.Long.valueOf(((apnt) this.a.pM().a.a()).b("com.google.android.dialer", "SodaTranscription__persisted_language_pack_info_refresh_initial_delay_hours").b());
            case 623:
                return java.lang.Boolean.valueOf(((apnt) this.a.pM().a.a()).b("com.google.android.dialer", "skip_soda_availability_check_for_emulator_tests").e());
            case 624:
                defpackage.him himVar10 = this.a;
                return new zjx(amyu.b(himVar10.kM), (zzx) himVar10.gq(), himVar10.kN, (zjv) himVar10.cf.a(), (ajct) himVar10.r.a());
            case 625:
                defpackage.him himVar11 = this.a;
                return new ahbz((android.content.Context) himVar11.s.a(), (agvb) himVar11.kH.a(), defpackage.him.iW(), (java.util.concurrent.Executor) himVar11.r.a(), ahyn.h(aikj.b), himVar11.qm());
            case 626:
                defpackage.him himVar12 = this.a;
                ahyn.h(defpackage.him.jk());
                agvb agvbVar = (agvb) himVar12.kG.a();
                if (agvbVar == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return agvbVar;
            case 627:
                defpackage.him himVar13 = this.a;
                gzd gzdVar = (gzd) himVar13.kF.a();
                return new agvc(gzdVar, 1);
            case 628:
                defpackage.him himVar14 = this.a;
                try {
                    return gzd.a((android.content.Context) himVar14.s.a());
                } catch (java.lang.IllegalStateException e) {
                    throw new java.lang.IllegalStateException("RemoteWorkManager instantiation failed. You might be missing a dependency on\n\"//third_party/java/androidx/work:multiprocess\",", e);
                }
            case 629:
                try {
                    return gus.w((android.content.Context) this.a.s.a());
                } catch (java.lang.IllegalStateException e2) {
                    throw new java.lang.IllegalStateException("WorkManager instantiation failed. If you are in a test, add a dependency on\n\"//java/com/google/apps/tiktok/contrib/work/testing\",", e2);
                }
            case 630:
                return new agvc((gsy) this.a.kE.a(), 0);
            case 631:
                return this.a.fE();
            case 632:
                defpackage.him himVar15 = this.a;
                return new agvm(ahyn.h(java.lang.Boolean.valueOf(himVar15.iw())), ahyn.h(himVar15.kI), (ajct) himVar15.r.a(), ahyn.h((ahid) himVar15.bl.a()), (aogc) himVar15.kJ.a());
            case 633:
                defpackage.him himVar16 = this.a;
                android.app.Application application = (android.app.Application) himVar16.be.a();
                java.util.concurrent.ScheduledExecutorService scheduledExecutorService = (java.util.concurrent.ScheduledExecutorService) himVar16.L.a();
                zzd zzdVar = new zzd(application, "STREAMZ_TIKTOK", (java.lang.String) null);
                ((zyx) zzdVar).k = 3;
                return new aljf(scheduledExecutorService, new ajxw(zzdVar, "STREAMZ_TIKTOK"), application);
            case 634:
                return new aogc((android.content.Context) this.a.s.a(), (byte[]) null);
            case 635:
                return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialershared.directboot", "45817472").e());
            case 636:
                return java.lang.Boolean.valueOf(((apnt) this.a.sf().a.a()).b("com.google.android.dialer.directboot", "45618307").e());
            case 637:
                return new defpackage.hji(this, 1);
            case 638:
                defpackage.him himVar17 = this.a;
                apni apniVarPa = himVar17.pa();
                anrk anrkVarA = anrk.a(new android.content.ComponentName("com.google.android.tts", "com.google.android.libraries.speech.transcription.recognition.grpc.GoogleAsrService"));
                if (android.os.Build.VERSION.SDK_INT >= 34) {
                    anrn anrnVarA = anro.a.a();
                    anrnVarA.b(4096);
                    anrnVarA.b(512);
                    anroVarA = anrnVarA.a();
                } else if (android.os.Build.VERSION.SDK_INT >= 31) {
                    anrn anrnVarA2 = anro.a.a();
                    anrnVarA2.b(4096);
                    anroVarA = anrnVarA2.a();
                } else {
                    anroVarA = anro.a;
                }
                android.content.Context context = (android.content.Context) himVar17.s.a();
                ajct ajctVar = (ajct) himVar17.L.a();
                if (context == null) {
                    aooh.i("context");
                }
                if (ajctVar == null) {
                    aooh.i("backgroundExecutor");
                }
                return apniVarPa.b(anrkVarA, anroVarA, new anrm(new ahgh(context, 2), context.getPackageManager(), new aile("com.google.android.tts"), ajctVar), anrq.a);
            case 639:
                java.lang.Object[] objArr = {new ahsc(0)};
                ahvr.ay(objArr, 1);
                aify aifyVarI = aify.i(objArr, 1);
                if (aifyVarI == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return aifyVarI;
            case 640:
                return java.lang.Long.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45637707").b());
            case 641:
                return java.lang.Boolean.valueOf(((apnt) this.a.sf().a.a()).b("com.google.android.dialer.directboot", "45744327").e());
            case 642:
                defpackage.him himVar18 = this.a;
                return new txc((aoss) himVar18.cb.a(), himVar18.cq(), (rai) himVar18.kW.a(), (rai) himVar18.kZ.a(), (ruc) himVar18.eK.a(), (rlv) himVar18.fq.a(), himVar18.la, himVar18.lb);
            case 643:
                return new rai(this);
            case 644:
                return java.lang.Boolean.valueOf(((apnt) this.a.sf().a.a()).b("com.google.android.dialer.directboot", "45851264").e());
            case 645:
                return new rai(this, (boolean[]) null);
            case 646:
                return java.lang.Boolean.valueOf(((apnt) this.a.sf().a.a()).b("com.google.android.dialer.directboot", "45855810").e());
            case 647:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45808158").e());
            case 648:
                return java.lang.Long.valueOf(((apnt) this.a.qL().a.a()).b("com.google.android.dialer.directboot", "45633976").b());
            case 649:
                return java.lang.Long.valueOf(((apnt) this.a.qL().a.a()).b("com.google.android.dialer.directboot", "45633977").b());
            case 650:
                return new ajxw((aolr) this.a.ca.a());
            case 651:
                uha uhaVarX = ((com.android.dialer.spam.moirai.storage.room.MoiraiDatabase) this.a.lf.a()).x();
                if (uhaVarX == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return uhaVarX;
            case 652:
                defpackage.him himVar19 = this.a;
                com.android.dialer.spam.moirai.storage.room.MoiraiDatabase moiraiDatabaseO = himVar19.pQ().o((ahku) himVar19.le.a(), com.android.dialer.spam.moirai.storage.room.MoiraiDatabase.class, new java.lang.Object[0]);
                if (moiraiDatabaseO == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return moiraiDatabaseO;
            case 653:
                ahkt ahktVarA = ahku.a();
                ahktVarA.a = "moirai.db";
                return ahktVarA.a();
            case 654:
                defpackage.him himVar20 = this.a;
                amyz amyzVar = himVar20.ke;
                aooh.f(amyzVar, "availability");
                zjm zjmVarH = zjm.h(amyzVar);
                zjm zjmVarH2 = zjm.h(new wcx(himVar20.dH(), 20));
                amyz amyzVar2 = himVar20.li;
                aooh.f(amyzVar2, "sharpieScamIntentMoiraiAvailability");
                zjm zjmVarH3 = zjm.h(amyzVar2);
                amyz amyzVar3 = himVar20.lj;
                aooh.f(amyzVar3, "spamDenylistDialerMoiraiAvailability");
                return aigf.n("2980497257637671193", zjmVarH, "4029226380118366774", zjmVarH2, "17870033684663524689", zjmVarH3, "14093167251235428823", zjm.h(amyzVar3));
            case 655:
                defpackage.him himVar21 = this.a;
                return new ywg(himVar21.jI(), (tmi) himVar21.lh.a());
            case 656:
                return new ugu(this.a.be());
            case 657:
                defpackage.him himVar22 = this.a;
                return new ahbq((android.content.Context) himVar22.s.a(), (rai) himVar22.lw.a(), (rai) himVar22.lo.a());
            case 658:
                return new rai(this, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            case 659:
                return new rai(this, (char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            case 660:
                j$.util.Optional optionalEmpty = j$.util.Optional.empty();
                j$.util.Optional optionalEmpty2 = j$.util.Optional.empty();
                aooh.f(optionalEmpty, "optionalDownloadConfig");
                aooh.f(optionalEmpty2, "enableVmClassification");
                defpackage.abac abacVar = (defpackage.abac) aooh.p(optionalEmpty, new defpackage.abac(null));
                abajVar = new defpackage.abaj(true, true, true, abacVar.a, abacVar.b, ((java.lang.Boolean) aooh.p(optionalEmpty2, java.lang.Boolean.FALSE)).booleanValue(), androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, 641);
                break;
            case 661:
                defpackage.him himVar23 = this.a;
                j$.util.Optional optionalEmpty3 = j$.util.Optional.empty();
                abbr abbrVarEc = himVar23.ec();
                aooh.f(optionalEmpty3, "secureClassificationServiceProvider");
                aoin aoinVar = (aoin) aooh.q(optionalEmpty3);
                if (aoinVar != null) {
                }
                abajVar = new abbr(abbrVarEc, 1);
                break;
            case 662:
                java.util.concurrent.Executor executor = (java.util.concurrent.Executor) this.a.lq.a();
                aooh.f(executor, "executor");
                return aooc.ac(executor);
            case 663:
                j$.util.Optional optionalOf = j$.util.Optional.of(this.a.L);
                aooh.f(optionalOf, "clientExecutor");
                aoin aoinVar2 = (aoin) aooh.q(optionalOf);
                if (aoinVar2 == null || (ajctVarR = (ajct) aoinVar2.a()) == null) {
                    java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                    java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = new java.util.concurrent.LinkedBlockingQueue();
                    annk annkVar = new annk((byte[]) null, (byte[]) null, (byte[]) null);
                    annkVar.o("moirai-thread-%d");
                    ajctVarR = aiql.r(new java.util.concurrent.ThreadPoolExecutor(1, 4, 10L, timeUnit, linkedBlockingQueue, annk.p(annkVar)));
                    aooh.e(ajctVarR, "listeningDecorator(...)");
                }
                ajct ajctVar2 = ajctVarR;
                aooc.ap(ajctVar2);
                return ajctVar2;
            case 664:
                defpackage.him himVar24 = this.a;
                j$.util.Optional optionalEmpty4 = j$.util.Optional.empty();
                amyz amyzVar4 = himVar24.lr;
                aooh.f(optionalEmpty4, "clientProvidedExecutor");
                aooh.f(amyzVar4, "fallbackDispatcher");
                optionalEmpty4.isPresent();
                aooh.e(optionalEmpty4, "map(...)");
                optionalEmpty4.isPresent();
                aosp aospVar = (aosp) amyzVar4.a();
                aooh.e(aospVar, "getOrElse(...)");
                aooc.ap(aospVar);
                return aospVar;
            case 665:
                return this.a.ed();
            case 666:
                defpackage.him himVar25 = this.a;
                aogc aogcVar = (aogc) himVar25.lt.a();
                java.util.concurrent.Executor executor2 = (java.util.concurrent.Executor) himVar25.lq.a();
                aooh.f(aogcVar, "storage");
                aooh.f(executor2, "ioExecutor");
                afhj afhjVar = afhj.a;
                java.util.HashMap map = new java.util.HashMap();
                agab.ag(afha.a, map);
                return new ahbz(executor2, aogcVar, afhjVar, map);
            case 667:
                android.content.Context context2 = (android.content.Context) this.a.s.a();
                j$.util.Optional optionalEmpty5 = j$.util.Optional.empty();
                aooh.f(context2, "context");
                aooh.f(optionalEmpty5, "clientSynchronousFileStorage");
                optionalEmpty5.isPresent();
                return new aogc(ajsz.aY(new afeh(new ajxw(context2))), ajsz.aY(new afgb(context2, afgb.b)));
            case 668:
                defpackage.him himVar26 = this.a;
                return new ysu((android.content.Context) himVar26.s.a(), (ajct) himVar26.as.a(), (ajct) himVar26.r.a(), (aoss) himVar26.cb.a(), himVar26.oq());
            case 669:
                defpackage.him himVar27 = this.a;
                return new ysy((ysu) himVar27.ly.a(), himVar27.nX(), (aolr) himVar27.ca.a(), himVar27.dC(), himVar27.dA());
            case 670:
                return java.lang.Boolean.valueOf(((apnt) this.a.rQ().a.a()).b("com.google.android.callcoreshared.directboot", "45828088").e());
            case 671:
                defpackage.him himVar28 = this.a;
                return aigf.n(yse.j, himVar28.lV(), yse.k, himVar28.lU(), yse.l, himVar28.lW(), yse.i, himVar28.ls());
            case 672:
                return new rai(this, (byte[]) null, (char[]) null, (byte[]) null);
            case 673:
                return new defpackage.ni();
            case 674:
                return new defpackage.nnl((aogc) this.a.fo.a());
            case 675:
                defpackage.him himVar29 = this.a;
                return new ucm((ysy) himVar29.lA.a(), (aolr) himVar29.ca.a());
            case 676:
                return new uyg((aolr) this.a.ca.a());
            case 677:
                defpackage.him himVar30 = this.a;
                return new ysb(himVar30.nX(), (ysy) himVar30.lA.a(), (aolr) himVar30.ca.a(), (aoss) himVar30.cb.a(), (apni) himVar30.eY.a(), himVar30.dC(), himVar30.oq());
            case 678:
                defpackage.him himVar31 = this.a;
                return new ytm((android.content.Context) himVar31.s.a(), (aolr) himVar31.ca.a(), himVar31.dC(), (ahpz) himVar31.bb.a(), himVar31.lI);
            case 679:
                return java.lang.Boolean.valueOf(((apnt) this.a.rQ().a.a()).b("com.google.android.callcoreshared.directboot", "45828035").e());
            case 680:
                return new defpackage.hij(this, 1, (byte[]) null);
            case 681:
                defpackage.him himVar32 = this.a;
                return new rjb((android.content.Context) himVar32.s.a(), (aolr) himVar32.bY.a(), himVar32.ns(), (aolr) himVar32.ca.a(), (android.content.pm.PackageManager) himVar32.aq.a());
            case 682:
                return java.lang.Long.valueOf(((apnt) this.a.qd().a.a()).b("com.google.android.callcoreshared.directboot", "45720772").b());
            case 683:
                return this.a.fq();
            case 684:
                return java.lang.Boolean.valueOf(((apnt) this.a.qd().a.a()).b("com.google.android.callcoreshared.directboot", "45850343").e());
            case 685:
                defpackage.him himVar33 = this.a;
                return new yvr(himVar33.lS, himVar33.lT, himVar33.lU, himVar33.lV, himVar33.lW);
            case 686:
                return java.lang.Long.valueOf(((apnt) this.a.rK().a.a()).b("com.google.android.callcoreshared.directboot", "45850417").b());
            case 687:
                return java.lang.Long.valueOf(((apnt) this.a.rK().a.a()).b("com.google.android.callcoreshared.directboot", "45850418").b());
            case 688:
                return java.lang.Long.valueOf(((apnt) this.a.rK().a.a()).b("com.google.android.callcoreshared.directboot", "45850419").b());
            case 689:
                return java.lang.Long.valueOf(((apnt) this.a.rK().a.a()).b("com.google.android.callcoreshared.directboot", "45850420").b());
            case 690:
                return java.lang.Long.valueOf(((apnt) this.a.rK().a.a()).b("com.google.android.callcoreshared.directboot", "45850421").b());
            case 691:
                return java.lang.Boolean.valueOf(((apnt) this.a.qd().a.a()).b("com.google.android.callcoreshared.directboot", "45841285").e());
            case 692:
                return new yvs(this.a.dG());
            case 693:
                return java.lang.Long.valueOf(((apnt) this.a.qd().a.a()).b("com.google.android.callcoreshared.directboot", "45712054").b());
            case 694:
                return java.lang.Long.valueOf(((apnt) this.a.qd().a.a()).b("com.google.android.callcoreshared.directboot", "45714268").b());
            case 695:
                return java.lang.Long.valueOf(((apnt) this.a.qd().a.a()).b("com.google.android.callcoreshared.directboot", "45717358").b());
            case 696:
                return java.lang.Long.valueOf(((apnt) this.a.qd().a.a()).b("com.google.android.callcoreshared.directboot", "45710873").b());
            case 697:
                return java.lang.Long.valueOf(((apnt) this.a.qd().a.a()).b("com.google.android.callcoreshared.directboot", "45710872").b());
            case 698:
                return java.lang.Boolean.valueOf(((apnt) this.a.qd().a.a()).b("com.google.android.callcoreshared.directboot", "45840425").e());
            case 699:
                defpackage.him himVar34 = this.a;
                return new yvt(himVar34.mg, himVar34.mh, himVar34.mi, himVar34.mj, himVar34.mk);
            default:
                throw new java.lang.AssertionError(i);
        }
        return abajVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v104, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v111, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v118, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v125, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v132, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v139, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v146, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v153, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v160, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v167, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v174, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v181, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v188, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v195, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v202, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v209, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v216, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v223, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v230, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v237, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v244, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v251, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v258, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v265, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v272, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v279, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v286, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v293, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v300, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v307, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v314, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v321, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v328, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v335, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v342, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v349, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v356, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v363, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v370, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v377, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v384, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v391, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v398, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v405, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v412, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v419, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v426, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v433, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v440, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v447, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v455, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v462, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v469, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v476, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v483, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v490, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v498, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v505, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v512, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v519, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v526, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v533, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v541, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v548, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v555, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v562, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v569, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v576, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v583, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v590, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v597, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v604, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v611, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v618, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v625, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v632, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v69, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v83, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v90, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v97, types: [aoin, java.lang.Object] */
    private final java.lang.Object u() {
        int i = this.b;
        switch (i) {
            case 700:
                return java.lang.Long.valueOf(((apnt) this.a.rC().a.a()).b("com.google.android.callcoreshared.directboot", "45850436").b());
            case 701:
                return java.lang.Long.valueOf(((apnt) this.a.rC().a.a()).b("com.google.android.callcoreshared.directboot", "45850437").b());
            case 702:
                return java.lang.Long.valueOf(((apnt) this.a.rC().a.a()).b("com.google.android.callcoreshared.directboot", "45850438").b());
            case 703:
                return java.lang.Long.valueOf(((apnt) this.a.rC().a.a()).b("com.google.android.callcoreshared.directboot", "45850439").b());
            case 704:
                return java.lang.Long.valueOf(((apnt) this.a.rC().a.a()).b("com.google.android.callcoreshared.directboot", "45850440").b());
            case 705:
                defpackage.him himVar = this.a;
                return new yvv(himVar.lZ, himVar.ma, himVar.mb, himVar.mc, himVar.md, himVar.mm, himVar.mn, himVar.mo, himVar.mp);
            case 706:
                alfc alfcVarC = ((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45757382").c();
                aooc.ap(alfcVarC);
                return alfcVarC;
            case 707:
                alfc alfcVarC2 = ((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45757383").c();
                aooc.ap(alfcVarC2);
                return alfcVarC2;
            case 708:
                alfc alfcVarC3 = ((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45843935").c();
                aooc.ap(alfcVarC3);
                return alfcVarC3;
            case 709:
                alfc alfcVarC4 = ((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45811222").c();
                aooc.ap(alfcVarC4);
                return alfcVarC4;
            case 710:
                defpackage.him himVar2 = this.a;
                return new yvx(himVar2.mr, himVar2.ms, himVar2.mt, himVar2.mu, himVar2.mv, j$.util.Optional.empty(), himVar2.mw, himVar2.mx, himVar2.my, himVar2.mz, himVar2.mA, himVar2.mB, himVar2.mC, himVar2.mD, himVar2.mE, himVar2.mF, himVar2.mG, himVar2.mH, himVar2.mI, himVar2.mJ, himVar2.mK, himVar2.mL, himVar2.mM, himVar2.mN, himVar2.mO, himVar2.mP, himVar2.mQ, himVar2.mR, himVar2.mS, himVar2.mT, himVar2.mU, himVar2.mV, himVar2.mW, himVar2.mX, himVar2.mY, himVar2.mZ, himVar2.na, himVar2.nb, himVar2.nc, himVar2.nd, himVar2.ne, himVar2.nf, himVar2.ng, himVar2.nh, himVar2.ni, himVar2.nj, himVar2.nk, himVar2.nl, himVar2.nm, himVar2.nn, himVar2.no, himVar2.np, himVar2.nq, himVar2.nr, himVar2.ns);
            case 711:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45733912").b());
            case 712:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45733913").b());
            case 713:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45733914").b());
            case 714:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45733915").b());
            case 715:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45733916").b());
            case 716:
                alfc alfcVarC5 = ((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45757381").c();
                aooc.ap(alfcVarC5);
                return alfcVarC5;
            case 717:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45831976").b());
            case 718:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45831977").b());
            case 719:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45831978").b());
            case 720:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45831979").b());
            case 721:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45831980").b());
            case 722:
                alfc alfcVarC6 = ((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45831981").c();
                aooc.ap(alfcVarC6);
                return alfcVarC6;
            case 723:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45769170").b());
            case 724:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45769171").b());
            case 725:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45769172").b());
            case 726:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45769173").b());
            case 727:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45769174").b());
            case 728:
                alfc alfcVarC7 = ((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45769175").c();
                aooc.ap(alfcVarC7);
                return alfcVarC7;
            case 729:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45775160").b());
            case 730:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45775161").b());
            case 731:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45775162").b());
            case 732:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45775163").b());
            case 733:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45775164").b());
            case 734:
                alfc alfcVarC8 = ((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45775165").c();
                aooc.ap(alfcVarC8);
                return alfcVarC8;
            case 735:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45830669").b());
            case 736:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45830670").b());
            case 737:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45830671").b());
            case 738:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45830672").b());
            case 739:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45830673").b());
            case 740:
                alfc alfcVarC9 = ((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45830674").c();
                aooc.ap(alfcVarC9);
                return alfcVarC9;
            case 741:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45830704").b());
            case 742:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45830705").b());
            case 743:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45830706").b());
            case 744:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45830707").b());
            case 745:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45830708").b());
            case 746:
                alfc alfcVarC10 = ((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45830709").c();
                aooc.ap(alfcVarC10);
                return alfcVarC10;
            case 747:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45834997").b());
            case 748:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45834998").b());
            case 749:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45834999").b());
            case 750:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45835000").b());
            case 751:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45835001").b());
            case 752:
                alfc alfcVarC11 = ((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45835002").c();
                aooc.ap(alfcVarC11);
                return alfcVarC11;
            case 753:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45836123").b());
            case 754:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45836124").b());
            case 755:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45836125").b());
            case 756:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45836126").b());
            case 757:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45836127").b());
            case 758:
                alfc alfcVarC12 = ((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45836128").c();
                aooc.ap(alfcVarC12);
                return alfcVarC12;
            case 759:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45836178").b());
            case 760:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45836179").b());
            case 761:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45836180").b());
            case 762:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45836181").b());
            case 763:
                return java.lang.Long.valueOf(((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45836182").b());
            case 764:
                alfc alfcVarC13 = ((apnt) this.a.qi().a.a()).b("com.google.android.callcoreshared.directboot", "45836183").c();
                aooc.ap(alfcVarC13);
                return alfcVarC13;
            case 765:
                return java.lang.Boolean.valueOf(((apnt) this.a.qd().a.a()).b("com.google.android.callcoreshared.directboot", "45850391").e());
            case 766:
                defpackage.him himVar3 = this.a;
                return new yvy(himVar3.nv, himVar3.nw, himVar3.nx, himVar3.ny, himVar3.nz);
            case 767:
                return java.lang.Long.valueOf(((apnt) this.a.pY().a.a()).b("com.google.android.callcoreshared.directboot", "45850386").b());
            case 768:
                return java.lang.Long.valueOf(((apnt) this.a.pY().a.a()).b("com.google.android.callcoreshared.directboot", "45850387").b());
            case 769:
                return java.lang.Long.valueOf(((apnt) this.a.pY().a.a()).b("com.google.android.callcoreshared.directboot", "45850388").b());
            case 770:
                return java.lang.Long.valueOf(((apnt) this.a.pY().a.a()).b("com.google.android.callcoreshared.directboot", "45850389").b());
            case 771:
                return java.lang.Long.valueOf(((apnt) this.a.pY().a.a()).b("com.google.android.callcoreshared.directboot", "45850390").b());
            case 772:
                return java.lang.Boolean.valueOf(((apnt) this.a.qd().a.a()).b("com.google.android.callcoreshared.directboot", "45823685").e());
            case 773:
                defpackage.him himVar4 = this.a;
                return new ywa(himVar4.nC, himVar4.nD, himVar4.nE, himVar4.nF, himVar4.nG);
            case 774:
                return java.lang.Long.valueOf(((apnt) this.a.pT().a.a()).b("com.google.android.callcoreshared.directboot", "45849609").b());
            case 775:
                return java.lang.Long.valueOf(((apnt) this.a.pT().a.a()).b("com.google.android.callcoreshared.directboot", "45849610").b());
            case 776:
                return java.lang.Long.valueOf(((apnt) this.a.pT().a.a()).b("com.google.android.callcoreshared.directboot", "45849611").b());
            case 777:
                return java.lang.Long.valueOf(((apnt) this.a.pT().a.a()).b("com.google.android.callcoreshared.directboot", "45849612").b());
            case 778:
                return java.lang.Long.valueOf(((apnt) this.a.pT().a.a()).b("com.google.android.callcoreshared.directboot", "45849613").b());
            case 779:
                return java.lang.Boolean.valueOf(((apnt) this.a.qd().a.a()).b("com.google.android.callcoreshared.directboot", "45824852").e());
            case 780:
                defpackage.him himVar5 = this.a;
                return new ywb(himVar5.nJ, himVar5.nK, himVar5.nL, himVar5.nM, himVar5.nN);
            case 781:
                return java.lang.Long.valueOf(((apnt) this.a.pR().a.a()).b("com.google.android.callcoreshared.directboot", "45848829").b());
            case 782:
                return java.lang.Long.valueOf(((apnt) this.a.pR().a.a()).b("com.google.android.callcoreshared.directboot", "45848830").b());
            case 783:
                return java.lang.Long.valueOf(((apnt) this.a.pR().a.a()).b("com.google.android.callcoreshared.directboot", "45848831").b());
            case 784:
                return java.lang.Long.valueOf(((apnt) this.a.pR().a.a()).b("com.google.android.callcoreshared.directboot", "45848832").b());
            case 785:
                return java.lang.Long.valueOf(((apnt) this.a.pR().a.a()).b("com.google.android.callcoreshared.directboot", "45848833").b());
            case 786:
                return java.lang.Boolean.valueOf(((apnt) this.a.qd().a.a()).b("com.google.android.callcoreshared.directboot", "45839213").e());
            case 787:
                return java.lang.Boolean.valueOf(((apnt) this.a.qd().a.a()).b("com.google.android.callcoreshared.directboot", "45855126").e());
            case 788:
                return java.lang.Boolean.valueOf(((apnt) this.a.sM().a.a()).b("com.google.android.dialer.directboot", "45408594").e());
            case 789:
                return java.lang.Long.valueOf(((apnt) this.a.qC().a.a()).b("com.google.android.dialer.directboot", "45407303").b());
            case 790:
                return java.lang.Boolean.valueOf(((apnt) this.a.sB().a.a()).b("com.google.android.dialer.directboot", "45402581").e());
            case 791:
                acux acuxVarC = ((apnt) this.a.sB().a.a()).b("com.google.android.dialer.directboot", "45402582").c();
                aooc.ap(acuxVarC);
                return acuxVarC;
            case 792:
                acux acuxVarC2 = ((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413189").c();
                aooc.ap(acuxVarC2);
                return acuxVarC2;
            case 793:
                acux acuxVarC3 = ((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417183").c();
                aooc.ap(acuxVarC3);
                return acuxVarC3;
            case 794:
                return java.lang.Boolean.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417169").e());
            case 795:
                defpackage.him himVar6 = this.a;
                return new aogc((afhf) himVar6.oa.a(), (ahbz) himVar6.kM.a(), ahwt.a, (float[]) null);
            case 796:
                defpackage.him himVar7 = this.a;
                ahkn ahknVarA = ahko.a();
                ahknVarA.a = "TaskPeriods";
                ahknVarA.b = ahyn.h(new kve(6));
                ahknVarA.c(adct.a);
                return himVar7.pX().t(ahknVarA.a(), (aogc) himVar7.bq.a());
            case 797:
                return new adch((android.content.Context) this.a.s.a());
            case 798:
                return new adae((android.content.Context) this.a.s.a());
            case 799:
                return new adae((android.content.Context) this.a.s.a(), (short[]) null);
            default:
                throw new java.lang.AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v103, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v126, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v140, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v170, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v177, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v188, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v195, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v234, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v287, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v296, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v316, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v82, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v89, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v96, types: [aoin, java.lang.Object] */
    private final java.lang.Object v() {
        ons hkzVar;
        jwu urbVar;
        int i = this.b;
        switch (i) {
            case 800:
                defpackage.him himVar = this.a;
                return new adcr();
            case 801:
                return this.a.fs();
            case 802:
                defpackage.him himVar2 = this.a;
                hkzVar = new hkz((android.content.Context) himVar2.s.a(), himVar2.mX(), (ajct) himVar2.r.a(), (zjs) himVar2.cn.a(), himVar2.be(), himVar2.l());
                return hkzVar;
            case 803:
                defpackage.him himVar3 = this.a;
                urbVar = new urb((android.content.Context) himVar3.s.a(), himVar3.u(), (ajct) himVar3.r.a(), 1);
                return urbVar;
            case 804:
                return new xaw((android.content.Context) this.a.s.a(), 0);
            case 805:
                defpackage.him himVar4 = this.a;
                return new jiy((android.content.Context) himVar4.s.a(), (ajct) himVar4.L.a());
            case 806:
                defpackage.him himVar5 = this.a;
                urbVar = new urb((android.content.Context) himVar5.s.a(), (ajct) himVar5.r.a(), (zlr) himVar5.gg(), 0);
                return urbVar;
            case 807:
                defpackage.him himVar6 = this.a;
                urbVar = new urb((android.content.Context) himVar6.s.a(), (ajct) himVar6.r.a(), (zlr) himVar6.gg(), 2);
                return urbVar;
            case 808:
                return new xaw((android.content.Context) this.a.s.a(), 1);
            case 809:
                alfc alfcVarC = ((apnt) this.a.pD().a.a()).b("com.google.android.dialer", "CallAnnouncer__on_device_tts_supported_languages").c();
                aooc.ap(alfcVarC);
                return alfcVarC;
            case 810:
                ypt yptVarC = ((apnt) this.a.pz().a.a()).b("com.google.android.dialer", "CallRecording__call_recording_countries_with_built_in_audio_file").c();
                if (yptVarC == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return yptVarC;
            case 811:
                alfc alfcVarC2 = ((apnt) this.a.pV().b.a()).b("com.google.android.dialer.directboot", "45415793").c();
                aooc.ap(alfcVarC2);
                return alfcVarC2;
            case 812:
                ypt yptVarC2 = ((apnt) this.a.pz().a.a()).b("com.google.android.dialer", "CallRecording__call_recording_countries").c();
                if (yptVarC2 == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return yptVarC2;
            case 813:
                return java.lang.Boolean.valueOf(((apnt) this.a.pz().a.a()).b("com.google.android.dialer", "G__use_call_recording_geofence_overrides").e());
            case 814:
                return java.lang.Boolean.valueOf(((apnt) this.a.pz().a.a()).b("com.google.android.dialer", "G__force_within_call_recording_geofence_value").e());
            case 815:
                return java.lang.Boolean.valueOf(((apnt) this.a.pV().b.a()).b("com.google.android.dialer.directboot", "45415795").e());
            case 816:
                return java.lang.Boolean.valueOf(((apnt) this.a.pz().a.a()).b("com.google.android.dialer", "G__enable_call_recording").e());
            case 817:
                return java.lang.Boolean.valueOf(((apnt) this.a.pz().a.a()).b("com.google.android.dialer", "enable_call_recording_system_feature").e());
            case 818:
                ypv ypvVarC = ((apnt) this.a.pz().a.a()).b("com.google.android.dialer", "G__call_recording_force_enable_device_models").c();
                aooc.ap(ypvVarC);
                return ypvVarC;
            case 819:
                return java.lang.Boolean.valueOf(((apnt) this.a.sh().a.a()).b("com.google.android.dialer.directboot", "45858428").e());
            case 820:
                defpackage.him himVar7 = this.a;
                kvw kvwVarAh = himVar7.ah();
                iqe iqeVar = (iqe) himVar7.oA.a();
                rlv rlvVar = (rlv) himVar7.fq.a();
                ahkl ahklVarA = zja.a("CallRecordingSettingsData", kwy.a);
                j$.util.Objects.requireNonNull(kvwVarAh);
                ahklVarA.b(iqeVar.a(new kxb(kvwVarAh), kxh.a, new kxc(rlvVar), iqi.a));
                return himVar7.qc().h(ahklVarA.a());
            case 821:
                return new defpackage.hij(this, 0);
            case 822:
                defpackage.him himVar8 = this.a;
                android.content.Context context = (android.content.Context) himVar8.s.a();
                amyz amyzVar = himVar8.oD;
                ajct ajctVar = (ajct) himVar8.L.a();
                ajct ajctVar2 = (ajct) himVar8.r.a();
                java.lang.Object objGx = himVar8.gx();
                android.content.Context context2 = (android.content.Context) himVar8.s.a();
                ajct ajctVar3 = (ajct) himVar8.L.a();
                ssr ssrVar = (ssr) himVar8.oH.a();
                ruc rucVar = (ruc) himVar8.eK.a();
                hkzVar = new sqo(context, amyzVar, ajctVar, ajctVar2, (sqv) objGx, new sqw(context2, ajctVar3, ssrVar, rucVar, (ojo) himVar8.oF.a(), himVar8.be(), himVar8.nD(), (rlv) himVar8.fq.a()), (ipc) himVar8.gm());
                return hkzVar;
            case 823:
                defpackage.him himVar9 = this.a;
                return new zth((android.content.Context) himVar9.oC.a(), (android.content.Context) himVar9.s.a(), (aolr) himVar9.bg.a(), (aoss) himVar9.cb.a());
            case 824:
                android.content.Context contextM = aa$.ExternalSyntheticApiModelOutline1.m((android.content.Context) this.a.s.a());
                if (contextM == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return contextM;
            case 825:
                defpackage.him himVar10 = this.a;
                hkzVar = new ojo((android.content.Context) himVar10.s.a(), himVar10.qh(), himVar10.qt(), himVar10.nr(), himVar10.oq(), himVar10.oE);
                return hkzVar;
            case 826:
                return java.lang.Boolean.valueOf(((apnt) this.a.pB().b.a()).b("com.google.android.dialer.directboot", "45856488").e());
            case 827:
                defpackage.him himVar11 = this.a;
                sss sssVar = new sss(himVar11.oG);
                hkzVar = new ssr(sssVar, himVar11.tb());
                return hkzVar;
            case 828:
                java.lang.String strD = ((apnt) this.a.aZ.a()).b("com.google.android.dialer", "G__phone_number_variations_json_corrected").d();
                aooc.ap(strD);
                return strD;
            case 829:
                return java.lang.Boolean.valueOf(((apnt) this.a.sL().a.a()).b("com.google.android.dialer.directboot", "45831740").e());
            case 830:
                defpackage.him himVar12 = this.a;
                android.content.Context context3 = (android.content.Context) himVar12.s.a();
                aogc aogcVarSN = himVar12.sN();
                kvj kvjVarAg = himVar12.ag();
                amyz amyzVar2 = himVar12.pn;
                hkzVar = new lbl(context3, aogcVarSN, kvjVarAg, amyzVar2, (ajct) himVar12.L.a(), (ajct) himVar12.r.a());
                return hkzVar;
            case 831:
                return new zzx((byte[]) null, (char[]) null);
            case 832:
                return this.a.qc().h(zja.a("CallRecordingDataSourceStatus", kvi.a).a());
            case 833:
                return new kjr((kjq) this.a.wk.a());
            case 834:
                defpackage.him himVar13 = this.a;
                hkzVar = new kjq((android.content.Context) himVar13.s.a(), (kjw) himVar13.wj.a(), (rlv) himVar13.fq.a(), (ruc) himVar13.eK.a(), (ajct) himVar13.r.a());
                return hkzVar;
            case 835:
                defpackage.him himVar14 = this.a;
                hkzVar = new kjw(himVar14.rW(), himVar14.rJ(), new kka((android.content.Context) himVar14.s.a(), (ajct) himVar14.L.a(), himVar14.rJ(), himVar14.jA(), (ojo) himVar14.oF.a(), himVar14.oT, himVar14.oU, himVar14.mZ()), (ajct) himVar14.L.a(), (ajct) himVar14.r.a(), new zzx(himVar14.vx), himVar14.X(), defpackage.him.iK(), new kfm((android.content.Context) himVar14.s.a(), (aoss) himVar14.fh.a(), himVar14.oD, himVar14.sa(), (ojo) himVar14.oF.a(), defpackage.him.iK(), (rlv) himVar14.fq.a(), (ssq) himVar14.qE.a(), himVar14.dT(), himVar14.oT, himVar14.wi, himVar14.mZ()), himVar14.oy(), (ruc) himVar14.eK.a());
                return hkzVar;
            case 836:
                defpackage.him himVar15 = this.a;
                hkzVar = new kdw((android.content.Context) himVar15.s.a(), (aolr) himVar15.bg.a(), (aoss) himVar15.cb.a(), (kdx) himVar15.oM.a(), new zzx(himVar15.oQ));
                return hkzVar;
            case 837:
                return new kdx((android.content.Context) this.a.s.a());
            case 838:
                return new aile(this.a.kp());
            case 839:
                return java.lang.Boolean.valueOf(((apnt) this.a.qG().a.a()).b("com.google.android.dialer.directboot", "45744108").e());
            case 840:
                return java.lang.Boolean.valueOf(((apnt) this.a.rs().a.a()).b("com.google.android.dialer.directboot", "45793289").e());
            case 841:
                return new defpackage.kkl();
            case 842:
                return new lvs((android.content.Context) this.a.s.a());
            case 843:
                return java.lang.Boolean.valueOf(((apnt) this.a.rT().a.a()).b("com.google.android.dialer.directboot", "45729268").e());
            case 844:
                alfc alfcVarC3 = ((apnt) this.a.rT().a.a()).b("com.google.android.dialer.directboot", "45823718").c();
                if (alfcVarC3 == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return alfcVarC3;
            case 845:
                return this.a.fp();
            case 846:
                return this.a.qc().h(zja.a("AtlasStatus", wyp.a).a());
            case 847:
                defpackage.him himVar16 = this.a;
                ajct ajctVar4 = (ajct) himVar16.L.a();
                amyz amyzVar3 = himVar16.oW;
                return new wzd(ajctVar4, amyzVar3);
            case 848:
                defpackage.him himVar17 = this.a;
                android.content.Context context4 = (android.content.Context) himVar17.s.a();
                ajct ajctVar5 = (ajct) himVar17.L.a();
                gfv gfvVarD = gfz.d(context4, com.android.incallui.atlas.ui.impl.database.AtlasDatabase.class, "atlas_database");
                gfvVarD.f(ajctVar5);
                gfvVarD.c();
                com.android.incallui.atlas.ui.impl.database.AtlasDatabase atlasDatabaseA = gfvVarD.a();
                aooc.ap(atlasDatabaseA);
                return atlasDatabaseA;
            case 849:
                defpackage.him himVar18 = this.a;
                hkzVar = new lbu((ajct) himVar18.L.a(), (ajct) himVar18.r.a(), himVar18.tl(), himVar18.sa(), (lkk) himVar18.pc.a(), himVar18.mY());
                return hkzVar;
            case 850:
                return this.a.qc().h(zja.a("CallScreenStatus", lbv.a).a());
            case 851:
                defpackage.him himVar19 = this.a;
                return new lkk((ajct) himVar19.r.a(), j$.util.Optional.of((lkr) himVar19.pb.a()));
            case 852:
                lkr lkrVarX = ((com.android.dialer.callscreen.impl.storage.database.TranscriptDatabase) this.a.pa.a()).x();
                if (lkrVarX == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return lkrVarX;
            case 853:
                defpackage.him himVar20 = this.a;
                com.android.dialer.callscreen.impl.storage.database.TranscriptDatabase transcriptDatabaseO = himVar20.pQ().o((ahku) himVar20.oZ.a(), com.android.dialer.callscreen.impl.storage.database.TranscriptDatabase.class, new java.lang.Object[0]);
                if (transcriptDatabaseO == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return transcriptDatabaseO;
            case 854:
                ahkt ahktVarA = ahku.a();
                ahktVarA.e = new ahkk(3, 2);
                ahktVarA.a = "callscreen_transcripts";
                ghg[] ghgVarArr = lla.f;
                for (int i2 = 0; i2 < 4; i2++) {
                    ghg ghgVar = ghgVarArr[i2];
                    if (ahktVarA.c == null) {
                        ahktVarA.c = new aift(4);
                    }
                    ahktVarA.c.i(ghgVar);
                }
                return ahktVarA.a();
            case 855:
                return java.lang.Boolean.valueOf(((apnt) this.a.qr().a.a()).b("com.google.android.dialer", "G__enable_call_screen_data_in_call_log").e());
            case 856:
                defpackage.him himVar21 = this.a;
                hkzVar = new kvh((lbi) himVar21.pf.a(), himVar21.ag(), himVar21.sa(), (ajct) himVar21.r.a(), (ajct) himVar21.L.a());
                return hkzVar;
            case 857:
                defpackage.him himVar22 = this.a;
                urbVar = new jwu(himVar22.sN(), (aazc) himVar22.l.a(), (zzx) himVar22.gq());
                return urbVar;
            case 858:
                return this.a.qc().h(zja.a("CallingNetworksDataSourceStatus", jwh.a).a());
            case 859:
                defpackage.him himVar23 = this.a;
                hkzVar = new kek((aoss) himVar23.cb.a(), himVar23.sa(), new zzx(himVar23.pA), defpackage.hgu.b(), new zzx(himVar23.pS));
                return hkzVar;
            case 860:
                defpackage.him himVar24 = this.a;
                return aihd.r(himVar24.jP(), himVar24.kS());
            case 861:
                defpackage.him himVar25 = this.a;
                return new defpackage.iso((kgl) himVar25.pv.a(), (ojo) himVar25.oF.a());
            case 862:
                defpackage.him himVar26 = this.a;
                return new kgl((android.content.Context) himVar26.s.a(), (aolr) himVar26.bg.a(), (aolr) himVar26.ca.a(), (itf) himVar26.pu.a());
            case 863:
                defpackage.him himVar27 = this.a;
                return new itf((iue) himVar27.pl.a(), (aoss) himVar27.cb.a(), (aolr) himVar27.ca.a(), new zzx(himVar27.pt));
            case 864:
                iue iueVarX = ((com.android.dialer.beesly.impl.data.database.BeeslyDatabase) this.a.pk.a()).x();
                if (iueVarX == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return iueVarX;
            case 865:
                defpackage.him himVar28 = this.a;
                com.android.dialer.beesly.impl.data.database.BeeslyDatabase beeslyDatabaseO = himVar28.pQ().o((ahku) himVar28.pj.a(), com.android.dialer.beesly.impl.data.database.BeeslyDatabase.class, new java.lang.Object[0]);
                if (beeslyDatabaseO == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return beeslyDatabaseO;
            case 866:
                ahkt ahktVarA2 = ahku.a();
                ahktVarA2.a = "beesly.db";
                ahktVarA2.d = new ahkp(0);
                return ahktVarA2.a();
            case 867:
                defpackage.him himVar29 = this.a;
                zjm zjmVarKi = himVar29.ki();
                zjm zjmVarJQ = himVar29.jQ();
                zjm zjmVarKk = himVar29.kk();
                iqm iqmVarE = himVar29.E();
                amyz amyzVar4 = himVar29.pr;
                aooh.f(amyzVar4, "listener");
                zjm zjmVar = new zjm(amyzVar4, new defpackage.hle(iqmVarE, 11));
                iqm iqmVarE2 = himVar29.E();
                amyz amyzVar5 = himVar29.ps;
                aooh.f(amyzVar5, "listener");
                return aihd.u(zjmVarKi, zjmVarJQ, zjmVarKk, zjmVar, new zjm(amyzVar5, new defpackage.jer(iqmVarE2, 5)));
            case 868:
                return new defpackage.jhj((zjx) this.a.kO.a());
            case 869:
                return new tko((kjr) this.a.pn.a(), 1, (byte[]) null);
            case 870:
                return new defpackage.itd();
            case 871:
                defpackage.him himVar30 = this.a;
                return new defpackage.ivo(himVar30.pq, (zjx) himVar30.kO.a());
            case 872:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45687730").e());
            case 873:
                defpackage.him himVar31 = this.a;
                return new defpackage.jfs((zjx) himVar31.kO.a(), himVar31.sa(), defpackage.him.nj());
            case 874:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45775101").e());
            case 875:
                defpackage.him himVar32 = this.a;
                return new defpackage.moi((nri) himVar32.py.a(), (ojo) himVar32.oF.a());
            case 876:
                defpackage.him himVar33 = this.a;
                return new nri((aoss) himVar33.cb.a(), himVar33.sN(), (aazc) himVar33.l.a(), himVar33.pn);
            case 877:
                defpackage.him himVar34 = this.a;
                zjm zjmVarJO = himVar34.jO();
                zjm zjmVarKv = himVar34.kv();
                zjm zjmVarKR = himVar34.kR();
                amyz amyzVar6 = himVar34.pF;
                if (amyzVar6 == null) {
                    aooh.i("listener");
                }
                zjm zjmVar2 = new zjm(amyzVar6, new vkc(2));
                amyz amyzVar7 = himVar34.pM;
                tkk tkkVarCj = himVar34.cj();
                if (amyzVar7 == null) {
                    aooh.i("impl");
                }
                zjm zjmVar3 = new zjm(amyzVar7, new sxz(tkkVarCj, 3));
                amyz amyzVar8 = himVar34.pR;
                if (amyzVar8 == null) {
                    aooh.i("listener");
                }
                return aihd.v(zjmVarJO, zjmVarKv, zjmVarKR, zjmVar2, zjmVar3, new zjm(amyzVar8, new vkc(2)), new zjm[0]);
            case 878:
                defpackage.him himVar35 = this.a;
                return new defpackage.ism((kgl) himVar35.pv.a(), himVar35.bz());
            case 879:
                defpackage.him himVar36 = this.a;
                return new lcz(himVar36.fS(), himVar36.pC);
            case 880:
                return java.lang.Boolean.valueOf(((apnt) this.a.qx().a.a()).b("com.google.android.dialer.directboot", "45857161").e());
            case 881:
                return new defpackage.mog((nri) this.a.py.a());
            case 882:
                defpackage.him himVar37 = this.a;
                return new tds((android.content.Context) himVar37.s.a(), himVar37.cd(), himVar37.pC);
            case 883:
                return new tkn(this.a.cl(), 0);
            case 884:
                defpackage.him himVar38 = this.a;
                return new zth(new zzx(himVar38.pH), (ttx) himVar38.pK.a());
            case 885:
                defpackage.him himVar39 = this.a;
                tkk tkkVarCj2 = himVar39.cj();
                amyz amyzVar9 = himVar39.pG;
                aooh.f(amyzVar9, "refresher");
                return new aile(new zjm(amyzVar9, new tee(tkkVarCj2, 4)));
            case 886:
                return new tko((kjr) this.a.pn.a(), 0);
            case 887:
                ttx ttxVarX = ((com.android.dialer.sharpie.impl.storage.database.SharpieDatabase) this.a.pJ.a()).x();
                if (ttxVarX == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return ttxVarX;
            case 888:
                defpackage.him himVar40 = this.a;
                com.android.dialer.sharpie.impl.storage.database.SharpieDatabase sharpieDatabaseO = himVar40.pQ().o((ahku) himVar40.pI.a(), com.android.dialer.sharpie.impl.storage.database.SharpieDatabase.class, new java.lang.Object[0]);
                if (sharpieDatabaseO == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return sharpieDatabaseO;
            case 889:
                ahkt ahktVarA3 = ahku.a();
                ahktVarA3.a = "sharpie.db";
                return ahktVarA3.a();
            case 890:
                return new tkn((kgl) this.a.pQ.a(), 1);
            case 891:
                defpackage.him himVar41 = this.a;
                return new kgl((jrd) himVar41.pP.a(), (aoss) himVar41.cb.a());
            case 892:
                jrd jrdVarX = ((com.android.dialer.callclassification.stirshaken.calllog.storage.database.StirShakenDatabase) this.a.pO.a()).x();
                if (jrdVarX == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return jrdVarX;
            case 893:
                defpackage.him himVar42 = this.a;
                com.android.dialer.callclassification.stirshaken.calllog.storage.database.StirShakenDatabase stirShakenDatabaseO = himVar42.pQ().o((ahku) himVar42.pN.a(), com.android.dialer.callclassification.stirshaken.calllog.storage.database.StirShakenDatabase.class, new java.lang.Object[0]);
                if (stirShakenDatabaseO == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return stirShakenDatabaseO;
            case 894:
                ahkt ahktVarA4 = ahku.a();
                ahktVarA4.a = "stir_shaken.db";
                ahktVarA4.d = new ahkp(0);
                return ahktVarA4.a();
            case 895:
                defpackage.him himVar43 = this.a;
                hkzVar = new mnz((aoss) himVar43.cb.a(), (ecx) himVar43.pU.a(), himVar43.sa(), (nri) himVar43.py.a(), (ojo) himVar43.oF.a());
                return hkzVar;
            case 896:
                return this.a.qc().h(zja.b("DobbyCalllogDataSourceStatus", mni.X(defpackage.moc.a.m()).F(), (java.lang.Iterable) null, (aonj) null, 12));
            case 897:
                defpackage.him himVar44 = this.a;
                hkzVar = new ons((ajct) himVar44.L.a(), (ajct) himVar44.r.a(), himVar44.tp(), himVar44.oy(), (onv) himVar44.pX.a(), himVar44.sa());
                return hkzVar;
            case 898:
                return this.a.qc().h(zja.a("FidesCallLogDataSourceStatus", ont.a).a());
            case 899:
                defpackage.him himVar45 = this.a;
                return new onv(himVar45.sN(), (ajct) himVar45.r.a());
            default:
                throw new java.lang.AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v104, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v126, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v134, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v144, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v85, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v96, types: [aoin, java.lang.Object] */
    private final java.lang.Object w() {
        rai sqcVar;
        adao zcwVar;
        agpq akamVar;
        ahbq ajyzVar;
        int i = this.b;
        switch (i) {
            case 900:
                return java.lang.Boolean.valueOf(((apnt) this.a.qj().a.a()).b("com.google.android.dialer", "enable_fides").e());
            case 901:
                defpackage.him himVar = this.a;
                sqcVar = new sqc(himVar.bN(), himVar.nu(), himVar.sa(), (ecx) himVar.vf.a(), (aoss) himVar.cb.a(), (gus) himVar.vh.a());
                return sqcVar;
            case 902:
                defpackage.him himVar2 = this.a;
                return aihd.v(himVar2.kg(), himVar2.ko(), himVar2.kz(), himVar2.kI(), himVar2.kJ(), himVar2.kM(), new zjm[]{himVar2.kN(), himVar2.kO(), himVar2.kZ(), himVar2.lq(), himVar2.lt(), himVar2.mc(), defpackage.him.mx(), himVar2.md(), himVar2.lx()});
            case 903:
                defpackage.him himVar3 = this.a;
                return defpackage.achr.e(himVar3.hk(), (aec) himVar3.ql.a());
            case 904:
                defpackage.him himVar4 = this.a;
                zcwVar = new zcw((android.content.Context) himVar4.s.a(), (zcu) himVar4.qi.a());
                return zcwVar;
            case 905:
                defpackage.him himVar5 = this.a;
                ajct ajctVar = (ajct) himVar5.as.a();
                zzx zzxVarOq = himVar5.oq();
                akab akabVar = (akab) himVar5.qh.a();
                return new zcx(ajctVar, zzxVarOq, akabVar);
            case 906:
                defpackage.him himVar6 = this.a;
                android.content.Context context = (android.content.Context) himVar6.s.a();
                akae akaeVar = (akae) himVar6.qa.a();
                aazc aazcVar = (aazc) himVar6.l.a();
                ahys ahysVarH = ahyn.h((android.os.Handler) himVar6.qb.a());
                akcg akcgVar = (akcg) himVar6.qg.a();
                akaw akawVarFO = himVar6.fO();
                if (context == null) {
                    aooh.i("context");
                }
                if (akaeVar == null) {
                    aooh.i("tokenProvider");
                }
                if (aazcVar == null) {
                    aooh.i("clock");
                }
                if (akcgVar == null) {
                    aooh.i("streamz");
                }
                java.lang.Boolean.TRUE.booleanValue();
                java.lang.Boolean.FALSE.booleanValue();
                akamVar = new akam(context, akaeVar, (android.os.Handler) ahysVarH.a, akcgVar, akawVarFO);
                return akamVar;
            case 907:
                defpackage.him himVar7 = this.a;
                j$.util.Optional optionalOf = j$.util.Optional.of((java.util.concurrent.Executor) himVar7.as.a());
                android.content.Context context2 = (android.content.Context) himVar7.s.a();
                aazc aazcVar2 = (aazc) himVar7.l.a();
                akaw akawVarFO2 = himVar7.fO();
                if (optionalOf == null) {
                    aooh.i("blockingExecutor");
                }
                if (context2 == null) {
                    aooh.i("context");
                }
                if (aazcVar2 == null) {
                    aooh.i("clock");
                }
                akamVar = new akan(optionalOf, context2, aazcVar2, akawVarFO2, new akao(optionalOf, context2, akawVarFO2));
                return akamVar;
            case 908:
                sqcVar = new agth((android.os.Looper) this.a.ag.a());
                return sqcVar;
            case 909:
                sqcVar = new akcg(this.a.qf);
                return sqcVar;
            case 910:
                return j$.util.Optional.of(this.a.oZ());
            case 911:
                defpackage.him himVar8 = this.a;
                android.app.Application application = (android.app.Application) himVar8.be.a();
                java.util.concurrent.ScheduledExecutorService scheduledExecutorService = (java.util.concurrent.ScheduledExecutorService) himVar8.L.a();
                zzd zzdVar = new zzd(application, "STREAMZ_TIKTOK", (java.lang.String) null);
                ((zyx) zzdVar).k = 3;
                akamVar = new ahix(scheduledExecutorService, new ajxw(zzdVar, "STREAMZ_TIKTOK"), application);
                return akamVar;
            case 912:
                return java.lang.Boolean.valueOf(((apnt) this.a.rI().a.a()).b("tiktok.directboot", "45715562").e());
            case 913:
                return java.lang.Boolean.valueOf(((apnt) this.a.rI().a.a()).b("tiktok.directboot", "45798808").e());
            case 914:
                return new zaj();
            case 915:
                return new aec(0);
            case 916:
                defpackage.him himVar9 = this.a;
                ajyzVar = new ajyz(himVar9.fM(), (akcg) himVar9.qg.a(), himVar9.fO(), aify.n(aikn.a));
                return ajyzVar;
            case 917:
                return new agwm((byte[]) null);
            case 918:
                return ahyn.h(java.lang.Boolean.valueOf(this.a.iy()));
            case 919:
                ahyj ahyjVar = akco.a;
                throw new java.lang.RuntimeException();
            case 920:
                ahyj ahyjVar2 = akco.a;
                throw new java.lang.RuntimeException();
            case 921:
                return new ahsc(1);
            case 922:
                return vfz.u(this.a.sU());
            case 923:
                return java.lang.Long.valueOf(((apnt) this.a.rY().a.a()).b("com.google.android.dialer.directboot", "45379675").b());
            case 924:
                defpackage.him himVar10 = this.a;
                return aihd.t(himVar10.kA(), himVar10.lv(), defpackage.him.mw(), himVar10.lQ());
            case 925:
                return java.lang.Long.valueOf(((apnt) this.a.pg().a.a()).b("com.google.android.dialer", "caller_tag_experiment_id").b());
            case 926:
                return java.lang.Long.valueOf(((apnt) this.a.pg().a.a()).b("com.google.android.dialer", "caller_tag_crowdsourcing_experiment_id").b());
            case 927:
                defpackage.him himVar11 = this.a;
                zcwVar = new zdl((aogc) himVar11.iV.a(), (ajct) himVar11.L.a());
                return zcwVar;
            case 928:
                return new ywh();
            case 929:
                return this.a.qc().h(jsl.d());
            case 930:
                defpackage.him himVar12 = this.a;
                sqcVar = new jsk(himVar12.sN(), (aazc) himVar12.l.a(), (ahbv) himVar12.fg.a(), himVar12.tn(), himVar12.oy(), (ajct) himVar12.r.a());
                return sqcVar;
            case 931:
                return this.a.qc().h(jsl.b());
            case 932:
                return java.lang.Long.valueOf(((apnt) this.a.qe().a.a()).b("com.google.android.dialer", "G__cp2_extended_directory_phone_lookup_timout_millis").b());
            case 933:
                return java.lang.Boolean.valueOf(((apnt) this.a.sH().a.a()).b("com.google.android.dialer.directboot", "45766702").e());
            case 934:
                defpackage.him himVar13 = this.a;
                android.content.Context context3 = (android.content.Context) himVar13.s.a();
                akamVar = new ssq(context3, himVar13.sZ(), himVar13.be());
                return akamVar;
            case 935:
                return java.lang.Boolean.valueOf(((apnt) this.a.qe().a.a()).b("com.google.android.dialer", "G__disable_phone_number_formatting").e());
            case 936:
                return this.a.qc().h(jsl.c());
            case 937:
                defpackage.him himVar14 = this.a;
                android.content.Context context4 = (android.content.Context) himVar14.s.a();
                zcwVar = new ssm(context4, himVar14.tb());
                return zcwVar;
            case 938:
                defpackage.him himVar15 = this.a;
                ajct ajctVar2 = (ajct) himVar15.L.a();
                ajct ajctVar3 = (ajct) himVar15.r.a();
                amyz amyzVar = himVar15.oD;
                sqcVar = new ssd(ajctVar2, ajctVar3, amyzVar, himVar15.cx(), himVar15.np());
                return sqcVar;
            case 939:
                defpackage.him himVar16 = this.a;
                ajyzVar = new ahbq((java.lang.String) himVar16.qH.a(), (ajct) himVar16.qI.a(), himVar16.eI(), amyu.b(himVar16.uf));
                return ajyzVar;
            case 940:
                return vfz.c((android.content.Context) this.a.s.a());
            case 941:
                return achn.h(ahyn.h(this.a.L));
            case 942:
                defpackage.him himVar17 = this.a;
                amwu amwuVarB = amyu.b(himVar17.sy);
                amyz amyzVar2 = himVar17.ue;
                amwu amwuVarB2 = amyu.b(himVar17.qO);
                ajct ajctVar4 = (ajct) himVar17.qI.a();
                aehb aehbVarEI = himVar17.eI();
                sqcVar = new acch(amwuVarB, amyzVar2, amwuVarB2, ajctVar4, aehbVarEI);
                return sqcVar;
            case 943:
                acdv acdvVar = (acdv) this.a.ud.a();
                achn.b(acdvVar);
                return acdvVar;
            case 944:
                defpackage.him himVar18 = this.a;
                acdk acdkVarEl = himVar18.el();
                amwu amwuVarB3 = amyu.b(himVar18.uc);
                akamVar = new acdv(acdkVarEl, amwuVarB3, himVar18.eI());
                return akamVar;
            case 945:
                return achn.q(amyu.b(this.a.qL));
            case 946:
                defpackage.him himVar19 = this.a;
                akamVar = new acgx(himVar19.sN(), himVar19.eu(), (android.content.Context) himVar19.s.a());
                return akamVar;
            case 947:
                return jsl.n();
            case 948:
                defpackage.him himVar20 = this.a;
                android.content.Context context5 = (android.content.Context) himVar20.s.a();
                ajcu ajcuVar = (ajcu) himVar20.qI.a();
                if (context5 == null) {
                    aooh.i("context");
                }
                if (ajcuVar == null) {
                    aooh.i("backgroundExecutor");
                }
                sqcVar = new aeey(ajcuVar, new ajxw(context5, "STREAMZ_GNP_ANDROID"), (android.app.Application) context5);
                return sqcVar;
            case 949:
                defpackage.him himVar21 = this.a;
                amwu amwuVarB4 = amyu.b(himVar21.qL);
                return new achc(amwuVarB4);
            case 950:
                sqcVar = new achj(amyu.b(this.a.qL));
                return sqcVar;
            case 951:
                defpackage.him himVar22 = this.a;
                sqcVar = new acxg(himVar22.qR, (aoss) himVar22.fh.a());
                return sqcVar;
            case 952:
                defpackage.him himVar23 = this.a;
                return defpackage.achr.b((android.content.Context) himVar23.s.a(), (aoss) himVar23.fh.a());
            case 953:
                return achn.p(amyu.b(this.a.qL));
            case 954:
                return achn.r(amyu.b(this.a.qL));
            case 955:
                sqcVar = new rai(this, (short[]) null, (byte[]) null);
                return sqcVar;
            case 956:
                defpackage.him himVar24 = this.a;
                sqcVar = new acaw((adao) himVar24.qW.a(), (java.lang.String) himVar24.qH.a(), (android.content.Context) himVar24.s.a(), amyu.b(himVar24.qK), (aduu) himVar24.qJ.a(), ahyn.h((adzw) himVar24.rc.a()), himVar24.rd, amyu.b(himVar24.rf), amyu.b(himVar24.rh), (adao) himVar24.rk.a(), (aazc) himVar24.l.a());
                return sqcVar;
            case 957:
                return vfz.t((tvn) this.a.qV.a());
            case 958:
                sqcVar = new tvn((android.content.Context) this.a.s.a(), (byte[]) null, (byte[]) null);
                return sqcVar;
            case 959:
                defpackage.him himVar25 = this.a;
                sqcVar = new aeag((android.content.Context) himVar25.s.a(), amyu.b(himVar25.qY), (adzq) himVar25.rb.a(), (aolr) himVar25.ca.a(), (aolr) himVar25.bY.a());
                return sqcVar;
            case 960:
                defpackage.him himVar26 = this.a;
                android.content.Context context6 = (android.content.Context) himVar26.s.a();
                aoss aossVar = (aoss) himVar26.bZ.a();
                android.content.SharedPreferences sharedPreferences = (android.content.SharedPreferences) himVar26.qX.a();
                aefw aefwVar = new aefw();
                adtq adtqVarEu = himVar26.eu();
                himVar26.sT();
                aooh.f(context6, "context");
                aooh.f(aossVar, "blockingScope");
                aooh.f(sharedPreferences, "fetchOnlyPreferences");
                aefwVar.a(context6);
                return eaw.c(new eew(agab.bS(aegw.a.m()).z()), new efk(new rou(11)), ajsz.aY(aecc.a(sharedPreferences)), aossVar, new acik(adtqVarEu.a(context6, "registration_data.pb", false), 3));
            case 961:
                defpackage.him himVar27 = this.a;
                android.content.Context context7 = (android.content.Context) himVar27.s.a();
                himVar27.sT();
                aooh.f(context7, "context");
                android.content.SharedPreferences sharedPreferences2 = context7.getSharedPreferences("registration_data", 0);
                aooh.e(sharedPreferences2, "getSharedPreferences(...)");
                aooc.ap(sharedPreferences2);
                return sharedPreferences2;
            case 962:
                defpackage.him himVar28 = this.a;
                android.content.Context context8 = (android.content.Context) himVar28.s.a();
                aduu aduuVar = (aduu) himVar28.qJ.a();
                agab agabVar = (agab) himVar28.ra.a();
                himVar28.sT();
                sqcVar = new adzt(context8, aduuVar, agabVar);
                return sqcVar;
            case 963:
                return new agab((int[]) null);
            case 964:
                defpackage.him himVar29 = this.a;
                return achn.j((aduu) himVar29.qJ.a(), new aefw(), (android.content.Context) himVar29.s.a());
            case 965:
                defpackage.him himVar30 = this.a;
                amwu amwuVarB5 = amyu.b(himVar30.re);
                aolr aolrVar = (aolr) himVar30.bY.a();
                aooh.f(amwuVarB5, "gnpFetchOnlyRoomDatabase");
                aooh.f(aolrVar, "blockingContext");
                zcwVar = new aeem(new defpackage.agwa(amwuVarB5, 1), aolrVar);
                return zcwVar;
            case 966:
                defpackage.him himVar31 = this.a;
                android.content.Context context9 = (android.content.Context) himVar31.s.a();
                aolr aolrVar2 = (aolr) himVar31.bY.a();
                adtq adtqVarEu2 = himVar31.eu();
                himVar31.sT();
                aooh.f(context9, "context");
                aooh.f(aolrVar2, "blockingContext");
                gfv gfvVarD = gfz.d(context9, com.google.android.libraries.notifications.platform.internal.room.GnpRoomDatabase.class, adtqVarEu2.a(context9, "gnp_database", true));
                gfvVarD.b((ghg[]) java.util.Arrays.copyOf(new ghg[]{com.google.android.libraries.notifications.platform.internal.room.GnpRoomDatabase.m}, 1));
                gfvVarD.d();
                gfvVarD.e(aolrVar2);
                com.google.android.libraries.notifications.platform.internal.room.GnpRoomDatabase gnpRoomDatabaseA = gfvVarD.a();
                aooc.ap(gnpRoomDatabaseA);
                return gnpRoomDatabaseA;
            case 967:
                defpackage.him himVar32 = this.a;
                amwu amwuVarB6 = amyu.b(himVar32.rg);
                aolr aolrVar3 = (aolr) himVar32.bY.a();
                if (amwuVarB6 == null) {
                    aooh.i("gnpFcmRoomDatabase");
                }
                if (aolrVar3 == null) {
                    aooh.i("blockingContext");
                }
                zcwVar = new aeem(new aeev(amwuVarB6, 1), aolrVar3);
                return zcwVar;
            case 968:
                defpackage.him himVar33 = this.a;
                android.content.Context context10 = (android.content.Context) himVar33.s.a();
                aolr aolrVar4 = (aolr) himVar33.bY.a();
                adtq adtqVarEu3 = himVar33.eu();
                himVar33.sT();
                if (context10 == null) {
                    aooh.i("context");
                }
                if (aolrVar4 == null) {
                    aooh.i("blockingContext");
                }
                gfv gfvVarD2 = gfz.d(context10, com.google.android.libraries.notifications.platform.internal.room.GnpRoomDatabase.class, adtqVarEu3.a(context10, "gnp_fcm_database", true));
                gfvVarD2.b((ghg[]) java.util.Arrays.copyOf(new ghg[]{com.google.android.libraries.notifications.platform.internal.room.GnpRoomDatabase.m}, 1));
                gfvVarD2.d();
                gfvVarD2.e(aolrVar4);
                com.google.android.libraries.notifications.platform.internal.room.GnpRoomDatabase gnpRoomDatabaseA2 = gfvVarD2.a();
                if (gnpRoomDatabaseA2 == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return gnpRoomDatabaseA2;
            case 969:
                defpackage.him himVar34 = this.a;
                amwu amwuVarB7 = amyu.b(himVar34.rj);
                aolr aolrVar5 = (aolr) himVar34.bY.a();
                if (amwuVarB7 == null) {
                    aooh.i("registrationDataStore");
                }
                if (aolrVar5 == null) {
                    aooh.i("blockingContext");
                }
                zcwVar = new adao(amwuVarB7, aolrVar5);
                return zcwVar;
            case 970:
                defpackage.him himVar35 = this.a;
                android.content.Context context11 = (android.content.Context) himVar35.s.a();
                aoss aossVar2 = (aoss) himVar35.bZ.a();
                android.content.SharedPreferences sharedPreferences3 = (android.content.SharedPreferences) himVar35.ri.a();
                aefw aefwVar2 = new aefw();
                adtq adtqVarEu4 = himVar35.eu();
                himVar35.sT();
                return achn.m(context11, aossVar2, sharedPreferences3, aefwVar2, adtqVarEu4);
            case 971:
                defpackage.him himVar36 = this.a;
                android.content.Context context12 = (android.content.Context) himVar36.s.a();
                himVar36.sT();
                if (context12 == null) {
                    aooh.i("context");
                }
                android.content.SharedPreferences sharedPreferences4 = context12.getSharedPreferences("fcm_registration_data", 0);
                aooh.e(sharedPreferences4, "getSharedPreferences(...)");
                if (sharedPreferences4 == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return sharedPreferences4;
            case 972:
                defpackage.him himVar37 = this.a;
                sqcVar = new acbw((adao) himVar37.rn.a(), (aazc) himVar37.l.a());
                return sqcVar;
            case 973:
                return achn.o(amyu.b(this.a.qL));
            case 974:
                defpackage.him himVar38 = this.a;
                sqcVar = new acxg((ecx) himVar38.rr.a(), (apdp) himVar38.rs.a());
                return sqcVar;
            case 975:
                defpackage.him himVar39 = this.a;
                return achn.c((android.content.Context) himVar39.s.a(), (aoss) himVar39.cb.a());
            case 976:
                return new apdp();
            case 977:
                defpackage.him himVar40 = this.a;
                sqcVar = new acjk((android.content.Context) himVar40.s.a(), (java.lang.String) himVar40.qH.a(), (adao) himVar40.qT.a(), (acal) himVar40.rm.a(), himVar40.rv, himVar40.hw(), himVar40.sz, himVar40.ek(), (aolr) himVar40.ca.a(), (aoss) himVar40.fh.a(), (aazc) himVar40.l.a());
                return sqcVar;
            case 978:
                return aaoo.aB((adae) this.a.ru.a());
            case 979:
                return new adae();
            case 980:
                defpackage.him himVar41 = this.a;
                akamVar = new agpq(ahyn.h((adag) himVar41.bM.a()), ahyn.h("google"), (ahyn) himVar41.rw.b);
                return akamVar;
            case 981:
                defpackage.him himVar42 = this.a;
                sqcVar = new acig((android.content.Context) himVar42.s.a(), (adao) himVar42.qT.a(), (adao) himVar42.qM.a(), himVar42.eo(), (java.lang.String) himVar42.qH.a(), (ahyn) himVar42.rR.a(), (ahyn) himVar42.rS.a(), amyu.b(himVar42.rT), (aazc) himVar42.l.a(), ahyn.h(himVar42.sd), himVar42.hx(), ahyn.h((adzz) himVar42.su.a()), himVar42.rK, amyu.b(himVar42.qK), amyu.b(himVar42.sh), amyu.b(himVar42.rt), (aolr) himVar42.ca.a(), (aolr) himVar42.bY.a(), new accj(), amyu.b(himVar42.sy));
                return sqcVar;
            case 982:
                sqcVar = new aile(defpackage.achr.d());
                return sqcVar;
            case 983:
                sqcVar = new aegy((ajzc) this.a.rz.a());
                return sqcVar;
            case 984:
                defpackage.him himVar43 = this.a;
                ajct ajctVar5 = (ajct) himVar43.r.a();
                ajct ajctVar6 = (ajct) himVar43.L.a();
                ajct ajctVar7 = (ajct) himVar43.as.a();
                amyz amyzVar3 = himVar43.jn;
                aikn aiknVar = aikn.a;
                ajzd ajzdVar = new ajzd();
                ajzdVar.b = ajctVar6;
                ajzdVar.a = ajctVar5;
                ajzdVar.c = ajctVar7;
                ajzdVar.d = amyzVar3;
                ajzdVar.e.k(aiknVar);
                if (ajzdVar.a == null) {
                    throw new java.lang.NullPointerException("Must set a lightweightExecutor");
                }
                if (ajzdVar.b == null) {
                    throw new java.lang.NullPointerException("Must set a backgroundExecutor");
                }
                if (ajzdVar.c == null) {
                    throw new java.lang.NullPointerException("Must set a blockingExecutor");
                }
                if (ajzdVar.d != null) {
                    return new ajzh(ajzdVar);
                }
                throw new java.lang.NullPointerException("Must set a cronetEngineProvider");
            case 985:
                return this.a.ez();
            case 986:
                android.content.Context context13 = (android.content.Context) this.a.s.a();
                zxw zxwVar = new zxw(new android.os.Bundle());
                acxg acxgVar = zxv.a;
                sqcVar = new abce(context13, zxwVar);
                return sqcVar;
            case 987:
                sqcVar = new zxh((android.content.Context) this.a.s.a());
                return sqcVar;
            case 988:
                aabx aabxVar = aabx.a;
                if (aabxVar == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return aabxVar;
            case 989:
                defpackage.him himVar44 = this.a;
                sqcVar = new aefs((android.content.Context) himVar44.s.a(), (aduu) himVar44.qJ.a(), ahyn.h(new oqc()), ahyn.h((aegf) himVar44.rH.a()), himVar44.eE(), (ajct) himVar44.rJ.a(), himVar44.rK, (aeey) himVar44.qK.a());
                return sqcVar;
            case 990:
                defpackage.him himVar45 = this.a;
                abzy abzyVar = (abzy) himVar45.rG.a();
                ahyn.h(new gus((char[]) null));
                sqcVar = new acli(abzyVar, (aolr) himVar45.ca.a());
                return sqcVar;
            case 991:
                return this.a.ei();
            case 992:
                return aihd.v(achn.d(), achn.e(), achn.g(), achn.f(), achn.k(), achn.l(), new aktj[0]);
            case 993:
                defpackage.him himVar46 = this.a;
                return achn.i(ahyn.h(himVar46.r), (ajcu) himVar46.qI.a());
            case 994:
                defpackage.him himVar47 = this.a;
                return java.lang.Boolean.valueOf(agab.bO((android.content.Context) himVar47.s.a(), new aefw(), (aduu) himVar47.qJ.a()));
            case 995:
                return vfz.v((rai) this.a.rP.a());
            case 996:
                sqcVar = new rai(this, (byte[]) null, (byte[]) null, (char[]) null);
                return sqcVar;
            case 997:
                defpackage.him himVar48 = this.a;
                android.content.Context context14 = (android.content.Context) himVar48.s.a();
                aolr aolrVar6 = (aolr) himVar48.bY.a();
                adtq adtqVarEu5 = himVar48.eu();
                himVar48.sT();
                aooh.f(context14, "context");
                aooh.f(aolrVar6, "blockingContext");
                gfv gfvVarD3 = gfz.d(context14, com.google.android.libraries.notifications.platform.internal.room.GnpPerDeviceRoomDatabase.class, adtqVarEu5.a(context14, "gnp_per_device_database", true));
                gfvVarD3.d();
                gfvVarD3.e(aolrVar6);
                com.google.android.libraries.notifications.platform.internal.room.GnpPerDeviceRoomDatabase gnpPerDeviceRoomDatabaseA = gfvVarD3.a();
                aooc.ap(gnpPerDeviceRoomDatabaseA);
                return gnpPerDeviceRoomDatabaseA;
            case 998:
                return jsl.l();
            case 999:
                return jsl.m();
            default:
                throw new java.lang.AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r14v104, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v112, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v120, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v128, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v139, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v147, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v162, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v177, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v185, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v208, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v223, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v252, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v287, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v316, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v325, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v333, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v361, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v384, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v396, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v404, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v425, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v44, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v52, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v59, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v75, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v89, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v96, types: [aoin, java.lang.Object] */
    public final java.lang.Object a() {
        vaf oneVar;
        swn lbwVar;
        zjm whhVar;
        aogc aogcVar;
        int i = this.b;
        switch (i / 100) {
            case 0:
                return b();
            case 1:
                return c();
            case 2:
                return n();
            case 3:
                return q();
            case 4:
                return r();
            case 5:
                return s();
            case 6:
                return t();
            case 7:
                return u();
            case 8:
                return v();
            case 9:
                return w();
            case 10:
                return d();
            case 11:
                return e();
            case 12:
                return f();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return g();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return h();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return i();
            case 16:
                return j();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return k();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return l();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return m();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_RIGHT /* 20 */:
                return o();
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_LEFT /* 21 */:
                return p();
            default:
                switch (i) {
                    case 2200:
                        return j$.util.Optional.of((ssm) this.a.qG.a());
                    case 2201:
                        oneVar = new one(this.a.pZ);
                        return oneVar;
                    case 2202:
                        defpackage.him himVar = this.a;
                        oneVar = new iqm(himVar.bU, himVar.bV, himVar.bW, himVar.bX, (zzx) himVar.gq(), himVar.G());
                        return oneVar;
                    case 2203:
                        defpackage.him himVar2 = this.a;
                        lbwVar = new lbw(himVar2.ju, himVar2.aE(), (zzx) himVar2.gq());
                        return lbwVar;
                    case 2204:
                        defpackage.him himVar3 = this.a;
                        oneVar = new mnk((zzx) himVar3.gq(), himVar3.aF());
                        return oneVar;
                    case 2205:
                        defpackage.him himVar4 = this.a;
                        whhVar = new whh(himVar4.nY, (zzx) himVar4.gq());
                        return whhVar;
                    case 2206:
                        defpackage.him himVar5 = this.a;
                        oneVar = new sry(himVar5.be(), himVar5.FJ);
                        return oneVar;
                    case 2207:
                        return new hrc(6);
                    case 2208:
                        return java.lang.Boolean.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45763270").e());
                    case 2209:
                        return java.lang.Long.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45689386").b());
                    case 2210:
                        return java.lang.Boolean.valueOf(((apnt) this.a.rM().a.a()).b("com.google.android.dialer.directboot", "45839391").e());
                    case 2211:
                        defpackage.him himVar6 = this.a;
                        aogcVar = new aogc((android.content.Context) himVar6.s.a(), himVar6.be(), himVar6.qD, (float[]) null);
                        return aogcVar;
                    case 2212:
                        oneVar = new kuz((zzx) this.a.gq());
                        return oneVar;
                    case 2213:
                        defpackage.him himVar7 = this.a;
                        kvw kvwVarAh = himVar7.ah();
                        kvy kvyVarAi = himVar7.ai();
                        kaw kawVarOG = himVar7.oG();
                        amyz amyzVar = himVar7.pf;
                        oneVar = new kva(kvwVarAh, kvyVarAi, kawVarOG, amyzVar, (rlv) himVar7.fq.a(), (android.content.Context) himVar7.s.a(), (ajct) himVar7.r.a());
                        return oneVar;
                    case 2214:
                        return java.lang.Boolean.valueOf(((apnt) this.a.pz().a.a()).b("com.google.android.dialer", "CallRecording__enable_call_recording_for_fi").e());
                    case 2215:
                        defpackage.him himVar8 = this.a;
                        oneVar = new oev((zzx) himVar8.gq(), himVar8.vQ);
                        return oneVar;
                    case 2216:
                        defpackage.him himVar9 = this.a;
                        whhVar = new wyc(himVar9.GS, (zzx) himVar9.gq());
                        return whhVar;
                    case 2217:
                        defpackage.him himVar10 = this.a;
                        oneVar = new wyn((android.content.Context) himVar10.s.a(), (ajct) himVar10.L.a(), (ajcu) himVar10.r.a(), himVar10.Qx, himVar10.Qy, himVar10.Qz, himVar10.QA, (wxm) himVar10.Me.a(), himVar10.nH(), new wvk(himVar10.QB, himVar10.QC), (ahbv) himVar10.fg.a(), himVar10.aU(), (wzx) himVar10.sK.a());
                        return oneVar;
                    case 2218:
                        return java.lang.Long.valueOf(((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413186").b());
                    case 2219:
                        alfc alfcVarC = ((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413197").c();
                        aooc.ap(alfcVarC);
                        return alfcVarC;
                    case 2220:
                        alfc alfcVarC2 = ((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413213").c();
                        aooc.ap(alfcVarC2);
                        return alfcVarC2;
                    case 2221:
                        alfc alfcVarC3 = ((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413214").c();
                        aooc.ap(alfcVarC3);
                        return alfcVarC3;
                    case 2222:
                        return java.lang.Boolean.valueOf(((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413198").e());
                    case 2223:
                        java.lang.String strD = ((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413191").d();
                        aooc.ap(strD);
                        return strD;
                    case 2224:
                        defpackage.him himVar11 = this.a;
                        oneVar = new zrw((android.content.Context) himVar11.s.a(), (aoss) himVar11.bZ.a(), (aolr) himVar11.bY.a(), (mgu) himVar11.ch.a());
                        return oneVar;
                    case 2225:
                        return java.lang.Boolean.valueOf(((apnt) this.a.qO().a.a()).b("com.google.android.dialer", "G__enable_lightbringer_video_upgrade").e());
                    case 2226:
                        return java.lang.Long.valueOf(((apnt) this.a.qO().a.a()).b("com.google.android.dialer", "duo_upgrade_supported_cache_timeout_millis").b());
                    case 2227:
                        oneVar = new zzx((android.content.Context) this.a.s.a(), (byte[]) null);
                        return oneVar;
                    case 2228:
                        oneVar = new defpackage.her((zpm) this.a.fn.a(), (byte[]) null);
                        return oneVar;
                    case 2229:
                        return java.lang.Boolean.valueOf(((apnt) this.a.rk().a.a()).b("com.google.android.dialer", "enable_video_call_conference").e());
                    case 2230:
                        return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45616259").e());
                    case 2231:
                        return java.lang.Boolean.valueOf(((apnt) this.a.rr().a.a()).b("com.google.android.dialer", "disallow_merge_one_way_video").e());
                    case 2232:
                        return java.lang.Long.valueOf(((apnt) this.a.rr().a.a()).b("com.google.android.dialer", "max_number_of_participants").b());
                    case 2233:
                        return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45400309").e());
                    case 2234:
                        return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer", "disable_upgrade_transmission_only_video").e());
                    case 2235:
                        defpackage.him himVar12 = this.a;
                        oneVar = new defpackage.ifb(himVar12.ti(), himVar12.oy(), (aoin) himVar12.sN, (ajct) himVar12.r.a(), (zzx) himVar12.gq());
                        return oneVar;
                    case 2236:
                        return java.lang.Long.valueOf(((apnt) this.a.pD().a.a()).b("com.google.android.dialer", "CallAnnouncer__repeat_announcement_delay_millis").b());
                    case 2237:
                        defpackage.him himVar13 = this.a;
                        oneVar = new ugs((aoss) himVar13.fh.a(), (aoss) himVar13.cb.a(), (aolr) himVar13.bg.a(), (aolr) himVar13.ca.a(), himVar13.oH(), (zzx) himVar13.gq(), himVar13.oc(), himVar13.oP(), (rlv) himVar13.fq.a(), (ruc) himVar13.eK.a());
                        return oneVar;
                    case 2238:
                        defpackage.him himVar14 = this.a;
                        aogcVar = new kwe(himVar14.ak(), himVar14.ot, himVar14.ou, himVar14.ov);
                        return aogcVar;
                    case 2239:
                        defpackage.him himVar15 = this.a;
                        aogcVar = new aogc((ajct) himVar15.r.a(), himVar15.tu(), himVar15.oy(), (char[]) null);
                        return aogcVar;
                    case 2240:
                        return java.lang.Long.valueOf(((apnt) this.a.pw().a.a()).b("com.google.android.dialer", "load_and_cache_interpreter_timeout_millis").b());
                    case 2241:
                        defpackage.him himVar16 = this.a;
                        oneVar = new okj((android.content.Context) himVar16.s.a(), (aoss) himVar16.bZ.a(), (aoss) himVar16.cb.a(), (aolr) himVar16.bY.a(), (zjv) himVar16.cf.a(), (mgu) himVar16.ch.a());
                        return oneVar;
                    case 2242:
                        defpackage.him himVar17 = this.a;
                        oneVar = new uyg(himVar17.jr(), himVar17.oU());
                        return oneVar;
                    case 2243:
                        defpackage.him himVar18 = this.a;
                        oneVar = new acxg((zsk) himVar18.ge(), (agsm) himVar18.aT.a());
                        return oneVar;
                    case 2244:
                        return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45633938").e());
                    case 2245:
                        defpackage.him himVar19 = this.a;
                        oneVar = new huy((android.content.Context) himVar19.s.a(), (zzx) himVar19.gq(), himVar19.gX, himVar19.gY, himVar19.gZ, himVar19.y());
                        return oneVar;
                    case 2246:
                        oneVar = new pzn((zpz) this.a.fz.a());
                        return oneVar;
                    case 2247:
                        return java.lang.Boolean.valueOf(((apnt) this.a.sv().a.a()).b("com.google.android.dialer.directboot", "45674642").e());
                    case 2248:
                        defpackage.him himVar20 = this.a;
                        whhVar = new jvt(himVar20.qt, himVar20.qu);
                        return whhVar;
                    case 2249:
                        defpackage.him himVar21 = this.a;
                        whhVar = new zjm(j$.util.Optional.of(himVar21.gh()), j$.util.Optional.of(himVar21.T()));
                        return whhVar;
                    case 2250:
                        defpackage.him himVar22 = this.a;
                        lbwVar = new swq(himVar22.al(), (zzx) himVar22.gq(), himVar22.kd);
                        return lbwVar;
                    case 2251:
                        defpackage.him himVar23 = this.a;
                        oneVar = new pgi((ecx) himVar23.th.a(), (java.util.concurrent.ExecutorService) himVar23.r.a(), (aoss) himVar23.cb.a());
                        return oneVar;
                    case 2252:
                        oneVar = new oxg((android.content.Context) this.a.s.a());
                        return oneVar;
                    case 2253:
                        defpackage.him himVar24 = this.a;
                        oneVar = new zjl((aazc) himVar24.l.a(), (ecx) himVar24.BR.a(), (zzx) himVar24.gq(), himVar24.BS, (aoss) himVar24.cb.a());
                        return oneVar;
                    case 2254:
                        defpackage.him himVar25 = this.a;
                        aogc aogcVarTk = himVar25.tk();
                        ajct ajctVar = (ajct) himVar25.r.a();
                        lbwVar = new defpackage.lee(aogcVarTk, ajctVar, himVar25.oy());
                        return lbwVar;
                    case 2255:
                        return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45852793").e());
                    case 2256:
                        return java.lang.Long.valueOf(((apnt) this.a.qy().a.a()).b("com.google.android.dialer.directboot", "45726052").b());
                    case 2257:
                        oneVar = new zzx((zpm) this.a.fn.a());
                        return oneVar;
                    case 2258:
                        defpackage.him himVar26 = this.a;
                        return dpy.p((ecx) himVar26.MZ.a(), (ajct) himVar26.r.a());
                    case 2259:
                        return afsq.cM(j$.util.Optional.of((hrb) this.a.hg.a()), j$.util.Optional.of(new hrc(0)));
                    case 2260:
                        return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45674455").e());
                    case 2261:
                        return java.lang.Long.valueOf(((apnt) this.a.qF().a.a()).b("com.google.android.dialer.directboot", "45771064").b());
                    case 2262:
                        defpackage.him himVar27 = this.a;
                        oneVar = new tkl((android.content.Context) himVar27.s.a(), (aoss) himVar27.cb.a(), (aolr) himVar27.bY.a(), (mgu) himVar27.ch.a(), himVar27.h());
                        return oneVar;
                    case 2263:
                        defpackage.him himVar28 = this.a;
                        oneVar = new gpd(himVar28.Fu, himVar28.Fv, himVar28.Fw, himVar28.Fx, himVar28.Fy, himVar28.wG, himVar28.Fz);
                        return oneVar;
                    case 2264:
                        return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45848806").e());
                    case 2265:
                        return java.lang.Long.valueOf(((apnt) this.a.pE().a.a()).b("com.google.android.dialer", "notification_contact_photo_timeout_millis").b());
                    case 2266:
                        return afsq.cM(j$.util.Optional.empty(), j$.util.Optional.empty());
                    case 2267:
                        defpackage.him himVar29 = this.a;
                        whhVar = new rsr((android.content.Context) himVar29.s.a(), (ssq) himVar29.qE.a());
                        return whhVar;
                    case 2268:
                        oneVar = new ipc((android.content.Context) this.a.s.a(), (char[]) null);
                        return oneVar;
                    case 2269:
                        return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer", "G__show_phone_number_when_cnap_available").e());
                    case 2270:
                        oneVar = new kaw((android.content.Context) this.a.s.a(), (char[]) null);
                        return oneVar;
                    case 2271:
                        return java.lang.Boolean.valueOf(((apnt) this.a.pn().b.a()).b("com.google.android.dialer.directboot", "45784737").e());
                    case 2272:
                        return java.lang.Boolean.valueOf(((apnt) this.a.aZ.a()).b("com.google.android.dialer.directboot", "45825306").e());
                    case 2273:
                        oneVar = new xtq((android.content.Context) this.a.s.a(), (byte[]) null);
                        return oneVar;
                    case 2274:
                        oneVar = new qkl(this.a.gI);
                        return oneVar;
                    case 2275:
                        oneVar = new zzx(this.a.FB);
                        return oneVar;
                    case 2276:
                        return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45814130").e());
                    case 2277:
                        oneVar = new defpackage.oot((android.content.Context) this.a.s.a());
                        return oneVar;
                    case 2278:
                        return java.lang.Boolean.valueOf(((apnt) this.a.qy().a.a()).b("com.google.android.dialer.directboot", "45790533").e());
                    case 2279:
                        ypt yptVarC = ((apnt) this.a.rk().a.a()).b("com.google.android.dialer", "Videocall__video_reception_unsupported_countries").c();
                        aooc.ap(yptVarC);
                        return yptVarC;
                    case 2280:
                        defpackage.him himVar30 = this.a;
                        return dpy.p((ecx) himVar30.Os.a(), (ajct) himVar30.r.a());
                    case 2281:
                        whhVar = new zjm(j$.util.Optional.of(new wsc((byte[]) null)), j$.util.Optional.of(this.a.cK()));
                        return whhVar;
                    case 2282:
                        defpackage.him himVar31 = this.a;
                        whhVar = new tzc(himVar31.nS, (zzx) himVar31.gq());
                        return whhVar;
                    case 2283:
                        defpackage.him himVar32 = this.a;
                        oneVar = new smx(himVar32.to, himVar32.tp);
                        return oneVar;
                    case 2284:
                        return java.lang.Boolean.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45761412").e());
                    case 2285:
                        defpackage.him himVar33 = this.a;
                        lbwVar = new swn((android.content.Context) himVar33.s.a(), (rlv) himVar33.fq.a(), himVar33.FY);
                        return lbwVar;
                    case 2286:
                        oneVar = new odp(this.a.GG);
                        return oneVar;
                    case 2287:
                        oneVar = new usg(this.a.nU);
                        return oneVar;
                    case 2288:
                        return new amey();
                    case 2289:
                        oneVar = new alqc((android.content.Context) this.a.s.a(), new aitf(4));
                        return oneVar;
                    case 2290:
                        defpackage.him himVar34 = this.a;
                        aogc aogcVarTA = himVar34.tA();
                        kaw kawVarOy = himVar34.oy();
                        ajct ajctVar2 = (ajct) himVar34.L.a();
                        ajct ajctVar3 = (ajct) himVar34.r.a();
                        vzh vzhVarDn = himVar34.dn();
                        oneVar = new vze(aogcVarTA, kawVarOy, ajctVar2, ajctVar3, vzhVarDn, (aogc) himVar34.fo.a(), (mgw) himVar34.cc.a(), himVar34.Bz, himVar34.BA, himVar34.BB, himVar34.BC, himVar34.BD, j$.util.Optional.empty());
                        return oneVar;
                    case 2291:
                        defpackage.him himVar35 = this.a;
                        oneVar = new gat(himVar35.nd(), himVar35.nU(), himVar35.dl(), (aolr) himVar35.bg.a(), (aoss) himVar35.cb.a());
                        return oneVar;
                    case 2292:
                        defpackage.him himVar36 = this.a;
                        android.content.Context context = (android.content.Context) himVar36.s.a();
                        himVar36.be();
                        oneVar = new vaf(context, himVar36.bd(), (ahbv) himVar36.sM.a(), (aoss) himVar36.cb.a());
                        return oneVar;
                    case 2293:
                        defpackage.him himVar37 = this.a;
                        whhVar = new zjm(j$.util.Optional.of(himVar37.cS()), j$.util.Optional.of(himVar37.gT()));
                        return whhVar;
                    default:
                        throw new java.lang.AssertionError(i);
                }
        }
    }
}
