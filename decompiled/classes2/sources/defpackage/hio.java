package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hio implements amyz {
    public final defpackage.him a;
    private final int b;

    public hio(defpackage.him himVar, int i) {
        this.a = himVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r13v101, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v108, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v116, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v172, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v179, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v190, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v197, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v209, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v284, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v298, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v323, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v330, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v337, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v347, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v362, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v369, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v40, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v400, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v407, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v427, types: [aoin, java.lang.Object] */
    private final java.lang.Object b() {
        nxr aiyyVar;
        kvz ahttVar;
        nzh ahtyVar;
        int i = this.b;
        switch (i) {
            case 0:
                aiyyVar = new aiyy(this.a.a.aI());
                return aiyyVar;
            case 1:
                aiyyVar = new ahtu((ahtt) this.a.a.b.a(), 0);
                return aiyyVar;
            case 2:
                defpackage.him himVar = this.a;
                ahttVar = new ahtt((android.content.Context) himVar.s.a(), (java.util.concurrent.Executor) himVar.L.a());
                return ahttVar;
            case 3:
                defpackage.him himVar2 = this.a;
                ahtyVar = new ahty((android.content.Context) himVar2.s.a(), ahyn.h(ahua.b), (ahtt) himVar2.a.b.a());
                return ahtyVar;
            case 4:
                defpackage.him himVar3 = this.a;
                ahttVar = new lbr((zzx) himVar3.gq(), (lpe) himVar3.AZ.a(), himVar3.ah(), (lbq) himVar3.wm.a(), (ajct) himVar3.r.a());
                return ahttVar;
            case 5:
                aiyyVar = new agup(this.a.ft, 1);
                return aiyyVar;
            case 6:
                ahyn.h(abra.a);
                return new aeqy(1);
            case 7:
                android.content.Context context = (android.content.Context) this.a.s.a();
                long jM = aa$.ExternalSyntheticApiModelOutline1.m();
                android.app.Application application = (android.app.Application) context;
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(true);
                aiyyVar = new ahis(application, new ahit(atomicBoolean, application), atomicBoolean, jM);
                return aiyyVar;
            case 8:
                ahttVar = new ahri(ahyn.h(ahpk.a), aikn.a, 1);
                return ahttVar;
            case 9:
                this.a.sO();
                return new aeqy(0);
            case 10:
                defpackage.him himVar4 = this.a;
                android.content.Context context2 = (android.content.Context) himVar4.s.a();
                defpackage.hip hipVar = himVar4.a;
                aiyyVar = new afai(hipVar.aJ(), himVar4.oC(), ahwt.a, context2, ahyn.h(hipVar.an()), hipVar.l);
                return aiyyVar;
            case 11:
                return this.a.a.at();
            case 12:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.dj().a.a()).b("com.google.android.dialer.directboot", "45843593").e());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aolr aolrVar = (aolr) this.a.bn.a();
                if (aolrVar == null) {
                    aooh.i("mainContext");
                }
                afec.c();
                aolr aolrVar2 = (aolr) det.a.a();
                cch cchVar = aolo.k;
                aosp aospVar = aolrVar2.get(cchVar);
                if (aospVar == null) {
                    aooh.h("null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
                }
                aosp aospVar2 = aospVar;
                aota aotaVar = aolrVar.get(cchVar);
                if (aotaVar == null) {
                    aooh.h("null cannot be cast to non-null type kotlinx.coroutines.Delay");
                }
                aolr aolrVarPlus = aolrVar2.plus(new agsc(aospVar2, aotaVar)).plus(ahre.b(new ahpg(1), 2)).plus(agvw.a);
                if (aolrVarPlus == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return aolrVarPlus;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                aiyyVar = new ahtu((android.content.Context) this.a.s.a(), 1);
                return aiyyVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                ahttVar = new ahri(ahyn.h(ahpk.a), aikn.a, 0);
                return ahttVar;
            case 16:
                aiyyVar = new agup((java.util.concurrent.Executor) this.a.L.a(), 2);
                return aiyyVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                defpackage.him himVar5 = this.a;
                himVar5.oC();
                j$.util.Optional optionalEmpty = j$.util.Optional.empty();
                j$.util.Optional optionalEmpty2 = j$.util.Optional.empty();
                defpackage.hip hipVar2 = himVar5.a;
                aiyyVar = new ahep(optionalEmpty, optionalEmpty2, hipVar2.bK, hipVar2.bM, hipVar2.bN, hipVar2.bO);
                return aiyyVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                defpackage.him himVar6 = this.a;
                android.content.Context context3 = (android.content.Context) himVar6.s.a();
                adag adagVarOC = himVar6.oC();
                defpackage.hip hipVar3 = himVar6.a;
                aiyyVar = new aheo(context3, adagVarOC, hipVar3.as(), hipVar3.aG(), hipVar3.bH, hipVar3.bJ, (ajct) himVar6.L.a(), amyu.b(himVar6.aT), himVar6.bb, himVar6.nh(), himVar6.ar);
                return aiyyVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                aiyyVar = new ahkj(this.a.eK(), 1);
                return aiyyVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_RIGHT /* 20 */:
                return jsl.e(this.a.a.m());
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_LEFT /* 21 */:
                defpackage.him himVar7 = this.a;
                return himVar7.pX().t(defpackage.hip.aQ(), (aogc) himVar7.bq.a());
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_RIGHT /* 22 */:
                aiyyVar = new ahkj((android.content.Context) this.a.s.a(), 0);
                return aiyyVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_LEFT /* 23 */:
                defpackage.him himVar8 = this.a;
                ahttVar = new wzf((zjx) himVar8.kO.a(), (ajct) himVar8.r.a());
                return ahttVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                defpackage.him himVar9 = this.a;
                ahttVar = new xep((zjx) himVar9.kO.a(), (ajct) himVar9.r.a());
                return ahttVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_FORK_LEFT /* 25 */:
                defpackage.him himVar10 = this.a;
                ahtyVar = new jsn((zjx) himVar10.kO.a(), (ajct) himVar10.r.a(), (jso) himVar10.a.A.a());
                return ahtyVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_FORK_RIGHT /* 26 */:
                defpackage.him himVar11 = this.a;
                jsk jskVar = (jsk) himVar11.qA.a();
                ajct ajctVar = (ajct) himVar11.L.a();
                defpackage.hip hipVar4 = himVar11.a;
                aiyyVar = new jso(jskVar, ajctVar, hipVar4.cb(), hipVar4.y, hipVar4.z);
                return aiyyVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return java.lang.Long.valueOf(((apnt) this.a.pg().a.a()).b("com.google.android.dialer", "feedback_chip_string_id").b());
            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return java.lang.Long.valueOf(((apnt) this.a.qX().a.a()).b("com.google.android.dialer", "caller_id_retention_days").b());
            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.cD().b.a()).b("com.google.android.dialer.directboot", "45836020").e());
            case 30:
                aiyyVar = new aclj(this.a.a.Z());
                return aiyyVar;
            case 31:
                defpackage.him himVar12 = this.a;
                accp accpVarV = himVar12.a.V();
                aoss aossVar = (aoss) himVar12.cb.a();
                aooh.f(aossVar, "futureScope");
                ahttVar = new acxg(accpVarV, aossVar);
                return ahttVar;
            case 32:
                return this.a.a.X();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                return java.lang.Long.valueOf(angy.a.b().d());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                return this.a.a.Y();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                return java.lang.Long.valueOf(((java.lang.Boolean) this.a.rK.a()).booleanValue() ? angy.a.b().b() : angy.a.b().c());
            case androidx.car.app.navigation.model.Maneuver.TYPE_STRAIGHT /* 36 */:
                defpackage.him himVar13 = this.a;
                aiyyVar = new acil((android.content.Context) himVar13.s.a(), (aolr) himVar13.bg.a(), new accj(), himVar13.ue, himVar13.a.C, (achv) himVar13.sz.a());
                return aiyyVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                defpackage.him himVar14 = this.a;
                aiyyVar = new acgo((aogc) himVar14.sh.a(), (acal) himVar14.rm.a(), amyu.b(himVar14.st), (android.content.Context) himVar14.s.a(), (aduu) himVar14.qJ.a(), himVar14.ue);
                return aiyyVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                defpackage.him himVar15 = this.a;
                aiyyVar = new achl(himVar15.a.W(), himVar15.ue, amyu.b(himVar15.st));
                return aiyyVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                defpackage.him himVar16 = this.a;
                ahttVar = new lco((zjx) himVar16.kO.a(), (ajct) himVar16.r.a());
                return ahttVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                defpackage.him himVar17 = this.a;
                aiyyVar = new mfg((zjx) himVar17.kO.a(), (aoss) himVar17.cb.a());
                return aiyyVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                defpackage.him himVar18 = this.a;
                aiyyVar = new muk((aoss) himVar18.cb.a(), (zjx) himVar18.kO.a(), (muj) himVar18.a.P.a());
                return aiyyVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                defpackage.him himVar19 = this.a;
                aoss aossVar2 = (aoss) himVar19.fh.a();
                aazc aazcVar = (aazc) himVar19.l.a();
                nri nriVar = (nri) himVar19.py.a();
                mnk mnkVarAE = himVar19.aE();
                defpackage.hip hipVar5 = himVar19.a;
                aiyyVar = new muj(aossVar2, aazcVar, nriVar, mnkVarAE, hipVar5.z(), himVar19.sY, hipVar5.O, himVar19.aK(), (rlv) himVar19.fq.a());
                return aiyyVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                java.lang.String strD = ((apnt) this.a.pq().b.a()).b("com.google.android.dialer.directboot", "45382603").d();
                aooc.ap(strD);
                return strD;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                return java.lang.Long.valueOf(((apnt) this.a.pq().b.a()).b("com.google.android.dialer.directboot", "45418642").b());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                defpackage.him himVar20 = this.a;
                ahtyVar = new nzl(himVar20.a.ab(), (ajct) himVar20.r.a(), (zjx) himVar20.kO.a());
                return ahtyVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                return java.lang.Long.valueOf(((apnt) this.a.rh().a.a()).b("com.google.android.dialer.directboot", "45415522").b());
            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                return java.lang.Long.valueOf(((apnt) this.a.rh().a.a()).b("com.google.android.dialer.directboot", "45415363").b());
            case 48:
                defpackage.him himVar21 = this.a;
                aiyyVar = new okx(himVar21.qD(), himVar21.a.U);
                return aiyyVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return java.lang.Boolean.valueOf(((apnt) new tvn(this.a.a.a.aZ, (byte[]) null).a.a()).b("com.google.android.dialer.directboot", "45761283").e());
            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                defpackage.him himVar22 = this.a;
                ahtyVar = new urr((zth) himVar22.oD.a(), (ajct) himVar22.L.a(), himVar22.fr);
                return ahtyVar;
            case 51:
                defpackage.him himVar23 = this.a;
                ahttVar = new uth((zjx) himVar23.kO.a(), (ajct) himVar23.r.a());
                return ahttVar;
            case 52:
                defpackage.him himVar24 = this.a;
                ahttVar = new wrl((zjx) himVar24.kO.a(), (ajct) himVar24.r.a());
                return ahttVar;
            case 53:
                defpackage.him himVar25 = this.a;
                ahbz ahbzVar = (ahbz) himVar25.AG.a();
                adag adagVarOC2 = himVar25.oC();
                j$.util.Optional optionalEmpty3 = j$.util.Optional.empty();
                aooh.f(ahbzVar, "updater");
                aooh.f(optionalEmpty3, "perProcessRegistration");
                ahttVar = new ahcx(adagVarOC2, optionalEmpty3, ahbzVar);
                return ahttVar;
            case 54:
                defpackage.him himVar26 = this.a;
                aexi aexiVar = (aexi) himVar26.aK.a();
                defpackage.hip hipVar6 = himVar26.a;
                ahct ahctVarAm = hipVar6.am();
                adag adagVarOC3 = himVar26.oC();
                j$.util.Optional optionalEmpty4 = j$.util.Optional.empty();
                aooh.f(aexiVar, "phenotypeApi");
                aooh.f(optionalEmpty4, "perProcessRegistration");
                ahtyVar = new ahcw(adagVarOC3, optionalEmpty4, hipVar6.aa, ahctVarAm, aexiVar);
                return ahtyVar;
            case 55:
                return j$.util.Optional.of(java.lang.Boolean.valueOf(this.a.a.aN()));
            case 56:
                defpackage.him himVar27 = this.a;
                ahttVar = new ahma(himVar27.a.aZ, ((java.lang.Boolean) himVar27.bL.a()).booleanValue());
                return ahttVar;
            case 57:
                defpackage.him himVar28 = this.a;
                boolean zBooleanValue = ((java.lang.Boolean) himVar28.bL.a()).booleanValue();
                defpackage.hip hipVar7 = himVar28.a;
                aoin aoinVar = himVar28.AB;
                adag adagVarOC4 = himVar28.oC();
                java.lang.String strAF = hipVar7.aF();
                if (defpackage.him.iM().equals(agvn.b)) {
                    java.lang.Boolean.FALSE.booleanValue();
                    if (!adagVarOC4.q().equals(strAF)) {
                        ahlu.a.c().l("com/google/apps/tiktok/sync/impl/SyncModule", "provideSyncManager", 114, "SyncModule.java").v("The ProcessInit main process must be the same as the default work process, otherwise Synclets will not run. See go/tiktok-sync/multiprocess#sync-process-check");
                    }
                } else {
                    java.lang.Boolean.FALSE.booleanValue();
                }
                aoin aoinVar2 = hipVar7.ac;
                if (true != zBooleanValue) {
                    aoinVar = aoinVar2;
                }
                ahli ahliVar = (ahli) aoinVar.a();
                aooc.ap(ahliVar);
                return ahliVar;
            case 58:
                return new ahlh();
            case 59:
                aiyyVar = new grk((anrf) this.a.a.bC.a());
                return aiyyVar;
            case 60:
                defpackage.him himVar29 = this.a;
                ahys ahysVarH = ahyn.h(defpackage.him.jk());
                android.content.Context context4 = (android.content.Context) himVar29.s.a();
                defpackage.hip hipVar8 = himVar29.a;
                agvd agvdVarAc = hipVar8.ac();
                ajcu ajcuVar = (ajcu) himVar29.L.a();
                aolr aolrVar3 = (aolr) himVar29.bg.a();
                agth agthVar = (agth) himVar29.qb.a();
                gta gtaVar = (gta) hipVar8.bB.a();
                anrf anrfVar = new anrf((char[]) null);
                if (ajcuVar == null) {
                    aooh.i("executor");
                }
                anrfVar.c = ajcuVar;
                anrfVar.b = new agve(agthVar);
                if (ajcuVar == null) {
                    aooh.i("taskExecutor");
                }
                anrfVar.a = ajcuVar;
                if (aolrVar3 == null) {
                    aooh.i("context");
                }
                anrfVar.e = aolrVar3;
                if (gtaVar == null) {
                    aooh.i("workerFactory");
                }
                anrfVar.g = gtaVar;
                agut agutVar = (agut) ahysVarH.a;
                anrfVar.d = agutVar.a.a;
                anrfVar.f = agutVar.b.a;
                java.lang.String packageName = context4.getPackageName();
                agvd.a.b().l("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateAsynchronouslyAndMaybeCrash", 66, "DefaultProcessValidator.java").v("Validating WorkManager process");
                agsm agsmVar = agvdVarAc.d;
                abqu abquVar = new abqu(agvdVarAc, packageName, 15);
                ajct ajctVar2 = agvdVarAc.c;
                ajdk ajdkVar = new ajdk(java.util.concurrent.Executors.callable(ahqx.h(abquVar), null));
                ajctVar2.execute(ajdkVar);
                agsmVar.g(ajdkVar, 1L, java.util.concurrent.TimeUnit.MINUTES);
                return anrfVar;
            case 61:
                return vfz.b(this.a.a.aK());
            case 62:
                defpackage.him himVar30 = this.a;
                return sgg.s(himVar30.a.ae, himVar30.qm());
            case 63:
                defpackage.him himVar31 = this.a;
                ajct ajctVar3 = (ajct) himVar31.r.a();
                wze wzeVarR = himVar31.a.R();
                wyw wywVarJu = himVar31.ju();
                aiyyVar = new wzh(ajctVar3, wzeVarR, wywVarJu, (wzd) himVar31.oX.a(), (rlv) himVar31.fq.a());
                return aiyyVar;
            case androidx.car.app.hardware.common.CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                java.lang.String strD2 = ((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413188").d();
                aooc.ap(strD2);
                return strD2;
            case 65:
                defpackage.him himVar32 = this.a;
                return defpackage.irr.r(himVar32.a.ah, himVar32.qm());
            case 66:
                defpackage.him himVar33 = this.a;
                ahtyVar = new kuy(himVar33.te(), himVar33.a.q(), (ajct) himVar33.r.a());
                return ahtyVar;
            case 67:
                return java.lang.Boolean.valueOf(((apnt) this.a.pz().a.a()).b("com.google.android.dialer", "G__use_minutes_for_call_recording_deletion").e());
            case 68:
                defpackage.him himVar34 = this.a;
                return defpackage.irr.o(himVar34.a.aj, himVar34.qm());
            case 69:
                defpackage.him himVar35 = this.a;
                aiyyVar = new jhh(himVar35.il, (aoss) himVar35.fh.a(), (kgl) himVar35.pv.a(), himVar35.sa(), himVar35.dD(), (iwc) himVar35.xY.a(), (rlv) himVar35.fq.a(), himVar35.cC(), himVar35.bz(), himVar35.jt(), (defpackage.jhw) himVar35.Bi.a(), (aazc) himVar35.l.a());
                return aiyyVar;
            case 70:
                defpackage.him himVar36 = this.a;
                return defpackage.irr.n(himVar36.a.ar, himVar36.qm());
            case 71:
                defpackage.him himVar37 = this.a;
                aoss aossVar3 = (aoss) himVar37.cb.a();
                aolr aolrVar4 = (aolr) himVar37.bg.a();
                kgl kglVar = (kgl) himVar37.pv.a();
                defpackage.hip hipVar9 = himVar37.a;
                aiyyVar = new ivx(aossVar3, aolrVar4, kglVar, hipVar9.n(), (rlv) himVar37.fq.a(), himVar37.E(), (aazc) himVar37.l.a(), hipVar9.aq);
                return aiyyVar;
            case 72:
                defpackage.him himVar38 = this.a;
                defpackage.hip hipVar10 = himVar38.a;
                aiyyVar = new defpackage.kpq(hipVar10.o(), hipVar10.bf(), (rlv) himVar38.fq.a(), (aazc) himVar38.l.a());
                return aiyyVar;
            case 73:
                return java.lang.Double.valueOf(((apnt) this.a.sh().a.a()).b("com.google.android.dialer.directboot", "45741150").a());
            case 74:
                return java.lang.Double.valueOf(((apnt) this.a.sh().a.a()).b("com.google.android.dialer.directboot", "45741151").a());
            case 75:
                return java.lang.Long.valueOf(((apnt) this.a.qf().b.a()).b("com.google.android.dialer.directboot", "45849214").b());
            case 76:
                defpackage.him himVar39 = this.a;
                aiyyVar = new defpackage.kpj((aolr) himVar39.bY.a(), himVar39.a.bc(), (gpd) himVar39.fD.a(), (rlv) himVar39.fq.a(), (aazc) himVar39.l.a());
                return aiyyVar;
            case 77:
                return java.lang.Boolean.valueOf(((apnt) this.a.qf().b.a()).b("com.google.android.dialer.directboot", "45849279").e());
            case 78:
                defpackage.him himVar40 = this.a;
                return defpackage.irr.t(himVar40.a.av, himVar40.qm());
            case 79:
                defpackage.him himVar41 = this.a;
                ajct ajctVar4 = (ajct) himVar41.r.a();
                lkk lkkVar = (lkk) himVar41.pc.a();
                defpackage.hip hipVar11 = himVar41.a;
                return new lcp(ajctVar4, lkkVar, (defpackage.lcl) hipVar11.av(), hipVar11.au);
            case androidx.car.app.hardware.common.CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                java.lang.String strD3 = ((apnt) this.a.pw().a.a()).b("com.google.android.dialer", "call_screen_scotty_upload_target").d();
                aooc.ap(strD3);
                return strD3;
            case 81:
                return java.lang.Long.valueOf(((apnt) this.a.pw().a.a()).b("com.google.android.dialer", "call_screen_audio_and_metrics_retention_days").b());
            case 82:
                defpackage.him himVar42 = this.a;
                amyz amyzVar = himVar42.a.ax;
                aogc aogcVarQm = himVar42.qm();
                j$.util.Objects.requireNonNull(amyzVar);
                ahttVar = new agvg(new vfy(amyzVar, 18), aogcVarQm);
                return ahttVar;
            case 83:
                defpackage.him himVar43 = this.a;
                ajct ajctVar5 = (ajct) himVar43.r.a();
                aiyyVar = new xeq(ajctVar5, (lkk) himVar43.pc.a(), himVar43.an(), himVar43.mY(), (rlv) himVar43.fq.a(), himVar43.a.au);
                return aiyyVar;
            case 84:
                defpackage.him himVar44 = this.a;
                return defpackage.irr.p(himVar44.a.A, himVar44.qm());
            case 85:
                defpackage.him himVar45 = this.a;
                return defpackage.lhj.q(himVar45.a.aA, himVar45.qm());
            case 86:
                defpackage.him himVar46 = this.a;
                aiyyVar = new mff(himVar46.mO(), (aoss) himVar46.fh.a());
                return aiyyVar;
            case 87:
                defpackage.him himVar47 = this.a;
                return defpackage.lhj.r(himVar47.a.P, himVar47.qm());
            case 88:
                defpackage.him himVar48 = this.a;
                return defpackage.lhj.u(himVar48.a.aF, himVar48.qm());
            case 89:
                defpackage.him himVar49 = this.a;
                ahtyVar = new nzh((ajct) himVar49.L.a(), (defpackage.nzg) himVar49.Bq.a(), himVar49.a.C());
                return ahtyVar;
            case 90:
                java.lang.String strD4 = ((apnt) this.a.rh().a.a()).b("com.google.android.dialer.directboot", "45414669").d();
                aooc.ap(strD4);
                return strD4;
            case 91:
                java.lang.String strD5 = ((apnt) this.a.rh().a.a()).b("com.google.android.dialer.directboot", "45414668").d();
                aooc.ap(strD5);
                return strD5;
            case 92:
                defpackage.him himVar50 = this.a;
                return defpackage.irr.s(himVar50.a.aH, himVar50.qm());
            case 93:
                defpackage.him himVar51 = this.a;
                ahttVar = new kvz((defpackage.hwv) himVar51.a.ay(), (ajct) himVar51.r.a());
                return ahttVar;
            case 94:
                defpackage.him himVar52 = this.a;
                return defpackage.irr.q(himVar52.a.aK, himVar52.qm());
            case 95:
                defpackage.him himVar53 = this.a;
                zjx zjxVar = (zjx) himVar53.kO.a();
                aoss aossVar4 = (aoss) himVar53.cb.a();
                ajct ajctVar6 = (ajct) himVar53.r.a();
                ojo ojoVar = (ojo) himVar53.oF.a();
                zrw zrwVarDT = himVar53.dT();
                aazc aazcVar2 = (aazc) himVar53.l.a();
                defpackage.hip hipVar12 = himVar53.a;
                aiyyVar = new kfu(zjxVar, aossVar4, ajctVar6, ojoVar, zrwVarDT, aazcVar2, (afhf) hipVar12.s.a(), himVar53.sa(), hipVar12.aJ);
                return aiyyVar;
            case androidx.car.app.hardware.common.CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                return java.lang.Boolean.valueOf(((apnt) this.a.ql().b.a()).b("com.google.android.dialer.directboot", "45723476").e());
            case 97:
                defpackage.him himVar54 = this.a;
                return defpackage.lhj.s(himVar54.a.aM, himVar54.qm());
            case 98:
                defpackage.him himVar55 = this.a;
                aiyyVar = new nxr((aoss) himVar55.fh.a(), himVar55.a.B(), (nxg) himVar55.uY.a(), (nwu) himVar55.va.a());
                return aiyyVar;
            case 99:
                defpackage.him himVar56 = this.a;
                return defpackage.lhj.t(himVar56.a.aR, himVar56.qm());
            default:
                throw new java.lang.AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r13v104, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v11, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v126, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v17, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v191, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v199, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v226, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v270, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v291, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v303, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v314, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v322, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v339, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v356, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v5, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v70, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v82, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v98, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [ahlx, java.lang.Object] */
    private final java.lang.Object c() {
        soh agvgVar;
        aipz utiVar;
        java.util.Set setAL;
        int i = this.b;
        int i2 = 17;
        int i3 = 3;
        int i4 = 1;
        switch (i) {
            case 100:
                defpackage.him himVar = this.a;
                aoss aossVar = (aoss) himVar.fh.a();
                olc olcVar = (olc) himVar.uU.a();
                nxg nxgVar = (nxg) himVar.uY.a();
                rlv rlvVar = (rlv) himVar.fq.a();
                nwu nwuVar = (nwu) himVar.va.a();
                defpackage.hip hipVar = himVar.a;
                return new nxu(aossVar, olcVar, nxgVar, rlvVar, nwuVar, hipVar.aO, hipVar.aP, hipVar.aQ);
            case androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                return java.lang.Long.valueOf(((apnt) this.a.rz().a.a()).b("com.google.android.dialer.directboot", "45725633").b());
            case 102:
                return java.lang.Long.valueOf(((apnt) this.a.rz().a.a()).b("com.google.android.dialer.directboot", "45707858").b());
            case 103:
                return java.lang.Long.valueOf(((apnt) this.a.rz().a.a()).b("com.google.android.dialer.directboot", "45710351").b());
            case 104:
                defpackage.him himVar2 = this.a;
                amyz amyzVar = himVar2.a.aT;
                aogc aogcVarQm = himVar2.qm();
                j$.util.Objects.requireNonNull(amyzVar);
                agvgVar = new agvg(new tmu(amyzVar, 17), aogcVarQm);
                return agvgVar;
            case 105:
                defpackage.him himVar3 = this.a;
                return new twl((aoss) himVar3.cb.a(), himVar3.co(), (zzx) himVar3.gq());
            case 106:
                defpackage.him himVar4 = this.a;
                amyz amyzVar2 = himVar4.a.aV;
                aogc aogcVarQm2 = himVar4.qm();
                j$.util.Objects.requireNonNull(amyzVar2);
                agvgVar = new agvg(new defpackage.jsp(amyzVar2, i4), aogcVarQm2);
                return agvgVar;
            case 107:
                defpackage.him himVar5 = this.a;
                agvgVar = new jnt(himVar5.mJ(), (ajct) himVar5.r.a());
                return agvgVar;
            case 108:
                defpackage.him himVar6 = this.a;
                amyz amyzVar3 = himVar6.a.aX;
                aogc aogcVarQm3 = himVar6.qm();
                j$.util.Objects.requireNonNull(amyzVar3);
                agvgVar = new agvg(new defpackage.kvq(amyzVar3, i3), aogcVarQm3);
                return agvgVar;
            case 109:
                defpackage.him himVar7 = this.a;
                agvgVar = new kwd(himVar7.ai(), (ajct) himVar7.r.a());
                return agvgVar;
            case 110:
                defpackage.him himVar8 = this.a;
                amyz amyzVar4 = himVar8.a.ba;
                aogc aogcVarQm4 = himVar8.qm();
                j$.util.Objects.requireNonNull(amyzVar4);
                agvgVar = new agvg(new zlk(amyzVar4, 14), aogcVarQm4);
                return agvgVar;
            case 111:
                defpackage.him himVar9 = this.a;
                return new ahmc((ahli) himVar9.a.aZ.a(), (ahbz) himVar9.kM.a(), (ahlx) himVar9.gK(), (java.util.concurrent.ScheduledExecutorService) himVar9.r.a(), himVar9.oC(), himVar9.iH(), ((java.lang.Boolean) himVar9.bL.a()).booleanValue());
            case 112:
                defpackage.him himVar10 = this.a;
                amyz amyzVar5 = himVar10.a.bc;
                aogc aogcVarQm5 = himVar10.qm();
                j$.util.Objects.requireNonNull(amyzVar5);
                agvgVar = new agvg(new zlk(amyzVar5, 8), aogcVarQm5);
                return agvgVar;
            case 113:
                defpackage.him himVar11 = this.a;
                return new adcv((android.content.Context) himVar11.s.a(), (acwi) himVar11.ll.a(), (ajct) himVar11.L.a(), aikn.a, himVar11.a.aF(), (ahbz) himVar11.kM.a());
            case 114:
                defpackage.him himVar12 = this.a;
                amyz amyzVar6 = himVar12.a.be;
                aogc aogcVarQm6 = himVar12.qm();
                j$.util.Objects.requireNonNull(amyzVar6);
                agvgVar = new agvg(new uir(amyzVar6, 7), aogcVarQm6);
                return agvgVar;
            case 115:
                defpackage.him himVar13 = this.a;
                utiVar = new uti(himVar13.nU, (ajcu) himVar13.r.a(), (utf) himVar13.Bx.a());
                return utiVar;
            case 116:
                defpackage.him himVar14 = this.a;
                amyz amyzVar7 = himVar14.a.bg;
                aogc aogcVarQm7 = himVar14.qm();
                j$.util.Objects.requireNonNull(amyzVar7);
                agvgVar = new agvg(new defpackage.irh(amyzVar7, i2), aogcVarQm7);
                return agvgVar;
            case 117:
                defpackage.him himVar15 = this.a;
                return new jfu((aoss) himVar15.fh.a(), (kgl) himVar15.pv.a(), himVar15.sa(), himVar15.a.k(), defpackage.him.nj(), (aais) himVar15.ce.a(), (rlv) himVar15.fq.a());
            case 118:
                defpackage.him himVar16 = this.a;
                amyz amyzVar8 = himVar16.a.bi;
                aogc aogcVarQm8 = himVar16.qm();
                j$.util.Objects.requireNonNull(amyzVar8);
                agvgVar = new agvg(new uoe(amyzVar8, 3), aogcVarQm8);
                return agvgVar;
            case 119:
                defpackage.him himVar17 = this.a;
                return new vbf((aoss) himVar17.cb.a(), himVar17.mT());
            case 120:
                defpackage.him himVar18 = this.a;
                amyz amyzVar9 = himVar18.a.bl;
                aogc aogcVarQm9 = himVar18.qm();
                j$.util.Objects.requireNonNull(amyzVar9);
                agvgVar = new agvg(new vfy(amyzVar9, 10), aogcVarQm9);
                return agvgVar;
            case 121:
                defpackage.him himVar19 = this.a;
                return new vnj((aoss) himVar19.cb.a(), (zzx) himVar19.gq(), himVar19.nU(), himVar19.a.bk, (zjs) himVar19.cn.a(), (aolr) himVar19.bY.a());
            case 122:
                return java.lang.Boolean.valueOf(((apnt) this.a.px().a.a()).b("com.google.android.dialer", "enable_check_tos_accepted").e());
            case 123:
                defpackage.him himVar20 = this.a;
                amyz amyzVar10 = himVar20.a.bo;
                aogc aogcVarQm10 = himVar20.qm();
                j$.util.Objects.requireNonNull(amyzVar10);
                agvgVar = new agvg(new vfy(amyzVar10, 9), aogcVarQm10);
                return agvgVar;
            case 124:
                defpackage.him himVar21 = this.a;
                rsr rsrVarPj = himVar21.pj();
                ajct ajctVar = (ajct) himVar21.r.a();
                rlv rlvVar2 = (rlv) himVar21.fq.a();
                return new vmo(rsrVarPj, ajctVar, rlvVar2, himVar21.a.bn);
            case 125:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45797949").e());
            case 126:
                defpackage.him himVar22 = this.a;
                amyz amyzVar11 = himVar22.a.bt;
                aogc aogcVarQm11 = himVar22.qm();
                j$.util.Objects.requireNonNull(amyzVar11);
                agvgVar = new agvg(new uir(amyzVar11, 12), aogcVarQm11);
                return agvgVar;
            case 127:
                defpackage.him himVar23 = this.a;
                agvgVar = new vnv((ajct) himVar23.r.a(), (vnr) himVar23.a.bs.a());
                return agvgVar;
            case 128:
                defpackage.him himVar24 = this.a;
                android.content.Context context = (android.content.Context) himVar24.s.a();
                aoss aossVar2 = (aoss) himVar24.fh.a();
                defpackage.hip hipVar2 = himVar24.a;
                return new vnr(context, aossVar2, hipVar2.aR(), (rlv) himVar24.fq.a(), himVar24.cT(), (ruc) himVar24.eK.a(), himVar24.BU, hipVar2.br);
            case 129:
                return java.lang.Double.valueOf(((apnt) this.a.sf().a.a()).b("com.google.android.dialer.directboot", "45667798").a());
            case 130:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45838903").e());
            case 131:
                defpackage.him himVar25 = this.a;
                amyz amyzVar12 = himVar25.a.bw;
                aogc aogcVarQm12 = himVar25.qm();
                j$.util.Objects.requireNonNull(amyzVar12);
                utiVar = new agvg(new uir(amyzVar12, 11), aogcVarQm12);
                return utiVar;
            case 132:
                return new veh((veg) this.a.a.bv.a());
            case 133:
                defpackage.him himVar26 = this.a;
                return new veg((java.util.concurrent.Executor) himVar26.r.a(), (aogc) himVar26.gQ(), (vea) himVar26.Dm.a(), (zjv) himVar26.cf.a(), j$.util.Optional.empty(), himVar26.DV, himVar26.Dn);
            case 134:
                defpackage.him himVar27 = this.a;
                amyz amyzVar13 = himVar27.a.bz;
                aogc aogcVarQm13 = himVar27.qm();
                j$.util.Objects.requireNonNull(amyzVar13);
                agvgVar = new agvg(new wcx(amyzVar13, 10), aogcVarQm13);
                return agvgVar;
            case 135:
                defpackage.him himVar28 = this.a;
                ajct ajctVar2 = (ajct) himVar28.r.a();
                defpackage.hip hipVar3 = himVar28.a;
                defpackage.him himVar29 = hipVar3.a;
                wrj wrjVar = new wrj((ajct) himVar29.L.a(), (ajct) himVar29.r.a(), himVar29.nB(), new whz(hipVar3.by, (ajct) himVar29.L.a(), (ajct) himVar29.as.a(), (ajct) himVar29.r.a(), jsl.v()));
                utiVar = new wrp(ajctVar2, wrjVar, (wqr) himVar28.vv.a());
                return utiVar;
            case 136:
                java.lang.String strD = ((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417181").d();
                aooc.ap(strD);
                return strD;
            case 137:
                setAL = this.a.a.aL();
                return aihd.o(setAL);
            case 138:
                defpackage.him himVar30 = this.a;
                defpackage.hip hipVar4 = himVar30.a;
                return new ahex(hipVar4.aO(), hipVar4.bF, (ajct) himVar30.r.a(), (ahid) himVar30.bl.a(), (aogc) himVar30.kJ.a(), (byte[]) null);
            case 139:
                defpackage.him himVar31 = this.a;
                android.app.Application application = (android.app.Application) himVar31.be.a();
                java.util.concurrent.ScheduledExecutorService scheduledExecutorService = (java.util.concurrent.ScheduledExecutorService) himVar31.L.a();
                zzd zzdVar = new zzd(application, "STREAMZ_TIKTOK", (java.lang.String) null);
                ((zyx) zzdVar).k = 3;
                utiVar = new abtr(scheduledExecutorService, new ajxw(zzdVar, "STREAMZ_TIKTOK"), application);
                return utiVar;
            case 140:
                setAL = this.a.a.aM();
                return aihd.o(setAL);
            case 141:
                defpackage.him himVar32 = this.a;
                defpackage.hip hipVar5 = himVar32.a;
                return new ahex(hipVar5.aO(), hipVar5.bF, (ajct) himVar32.r.a(), (ahid) himVar32.bl.a(), (aogc) himVar32.kJ.a());
            case 142:
                defpackage.him himVar33 = this.a;
                android.content.Context context2 = (android.content.Context) himVar33.s.a();
                adag adagVarOC = himVar33.oC();
                java.util.concurrent.ExecutorService executorService = (java.util.concurrent.ExecutorService) himVar33.r.a();
                ajcu ajcuVar = (ajcu) himVar33.L.a();
                ahda ahdaVarNh = himVar33.nh();
                int iA = himVar33.a();
                defpackage.hip hipVar6 = himVar33.a;
                return new ahew(context2, adagVarOC, executorService, ajcuVar, ahdaVarNh, iA, hipVar6.as(), hipVar6.aG(), hipVar6.bH, hipVar6.bJ, amyu.b(hipVar6.bL), himVar33.ar);
            case 143:
                defpackage.him himVar34 = this.a;
                android.content.Context context3 = (android.content.Context) himVar34.s.a();
                aogc aogcVarSN = himVar34.sN();
                aooh.f(context3, "context");
                ahbq ahbqVar = ahew.k;
                java.lang.String strAp = agab.ap();
                aooh.c(strAp);
                aooh.f(strAp, "currentProcess");
                return aogcVarSN.aB("StartupAfterPackageReplacedImplDatabase_".concat(java.lang.String.valueOf(new aorg("[^A-Za-z0-9\\-_:]").b(strAp, "_"))), ahew.k);
            case 144:
                return j$.util.Optional.of(java.lang.Boolean.valueOf(this.a.a.aP()));
            case 145:
                return new agup((java.util.concurrent.Executor) this.a.as.a(), 0);
            case 146:
                defpackage.hip hipVar7 = this.a.a;
                return aihd.t((aipq) hipVar7.bZ.a(), (aipq) hipVar7.ca.a(), (aipq) hipVar7.ce.a(), (aipq) hipVar7.cg.a());
            case 147:
                defpackage.him himVar35 = this.a;
                android.content.Context context4 = (android.content.Context) himVar35.s.a();
                defpackage.hip hipVar8 = himVar35.a;
                java.lang.Object objA = hipVar8.bR.a();
                defpackage.zzz zzzVar = (defpackage.zzz) hipVar8.bU.a();
                java.util.concurrent.Executor executor = (java.util.concurrent.Executor) himVar35.L.a();
                amwu amwuVarB = amyu.b(hipVar8.bX);
                amwu amwuVarB2 = amyu.b(hipVar8.bY);
                ahys ahysVarH = ahyn.h(java.lang.Boolean.TRUE);
                j$.util.Objects.requireNonNull(amwuVarB);
                akdc akdcVar = new akdc(context4, new zlk(amwuVarB, 11));
                ahvr.ci(zzzVar);
                akdcVar.d = zzzVar;
                akdcVar.f = ((java.lang.Boolean) ahysVarH.a).booleanValue();
                akdcVar.i = (ahhi) objA;
                j$.util.Objects.requireNonNull(amwuVarB2);
                akdcVar.g = new zlk(amwuVarB2, 12);
                akdcVar.e = executor;
                akdcVar.k = akdc.j;
                android.content.Context context5 = akdcVar.b;
                akdd akddVar = akdcVar.d;
                if (akddVar == null) {
                    akddVar = new akdd();
                }
                akdd akddVar2 = akddVar;
                aevo aevoVar = akdc.a;
                ajbm ajbmVar = akdcVar.e;
                if (ajbmVar == null) {
                    ajbmVar = ajbm.a;
                }
                ajbm ajbmVar2 = ajbmVar;
                aoin aoinVar = akdcVar.c;
                agwm agwmVar = akdcVar.i;
                if (agwmVar == null) {
                    agwmVar = akdc.h;
                }
                agwm agwmVar2 = agwmVar;
                boolean z = akdcVar.f;
                zlk zlkVar = akdcVar.g;
                if (zlkVar == null) {
                    zlkVar = new zlk(akdcVar, 18);
                }
                utiVar = new akde(context5, akddVar2, aevoVar, ajbmVar2, aoinVar, agwmVar2, z, zlkVar, akdcVar.k);
                return utiVar;
            case 148:
                return new ahhi(amyu.b(this.a.rx));
            case 149:
                return new aaaa(this.a.a.bS);
            case 150:
                defpackage.hip hipVar9 = this.a.a;
                agvgVar = new defpackage.oor(5, hipVar9.bV, hipVar9.bW);
                return agvgVar;
            case 151:
                alfc alfcVarC = ((apnt) this.a.sD().a.a()).b("com.google.android.dialer.directboot", "45421496").c();
                aooc.ap(alfcVarC);
                return alfcVarC;
            case 152:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.dh().a.a()).b("com.google.android.dialer.directboot", "45827257").e());
            case 153:
                java.lang.String str = ((android.content.pm.PackageInfo) this.a.ar.a()).versionName;
                ahvr.cj(str, "PackageInfo's versionName is null. If this is a Robolectric test, make sure to either specify versionName in your test's manifest or via http://go/android_rules#android_local_test-manifest_values");
                return str;
            case 154:
                aipz aipzVar = aiqb.c;
                aipz aipzVar2 = new aipz(aipzVar.a, false, aipzVar.f, aipzVar.c, aipzVar.d, aipzVar.e);
                aipz aipzVar3 = new aipz("Dialer", aipzVar2.b, aipzVar2.f, aipzVar2.c, aipzVar2.d, aipzVar2.e);
                utiVar = new aipz(aipzVar3.a, aipzVar3.b, 1, aipzVar3.c, aipzVar3.d, aipzVar3.e);
                return utiVar;
            case 155:
                return new aeot((soj) this.a.a.cd.a(), 1);
            case 156:
                defpackage.him himVar36 = this.a;
                android.content.Context context6 = (android.content.Context) himVar36.s.a();
                ajcu ajcuVar2 = (ajcu) himVar36.L.a();
                defpackage.hip hipVar10 = himVar36.a;
                return new soj(context6, ajcuVar2, (soh) hipVar10.cb.a(), (rlv) himVar36.fq.a(), hipVar10.cc);
            case 157:
                defpackage.him himVar37 = this.a;
                agvgVar = new soh((android.content.Context) himVar37.s.a(), (ajct) himVar37.L.a());
                return agvgVar;
            case 158:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.cF().a.a()).b("com.google.android.dialer.directboot", "45634261").e());
            case 159:
                return new aeot((aeou) this.a.a.cf.a(), 0);
            case 160:
                return new aeou((adai) this.a.D.a());
            case 161:
                return new aile(this.a.gv());
            case 162:
                defpackage.him himVar38 = this.a;
                android.content.Context context7 = (android.content.Context) himVar38.s.a();
                defpackage.hip hipVar11 = himVar38.a;
                return new son(context7, 5, hipVar11.I(), new zzx(hipVar11.cs), (ajct) himVar38.r.a());
            case 163:
                defpackage.hip hipVar12 = this.a.a;
                return aihd.s(hipVar12.bO(), new zjm(hipVar12.co, new vkc(1)), hipVar12.bP());
            case 164:
                defpackage.him himVar39 = this.a;
                return new mew((aoss) himVar39.cb.a(), (ajcu) himVar39.r.a(), himVar39.a.u());
            case 165:
                defpackage.hip hipVar13 = this.a.a;
                return aihd.s(hipVar13.bC(), hipVar13.bD(), new zjm(new rkv(7), new vkc(2)));
            case 166:
                defpackage.him himVar40 = this.a;
                return new hlj((apni) himVar40.eY.a(), (hmd) himVar40.a.cn.a());
            case 167:
                defpackage.him himVar41 = this.a;
                return new hmd((android.content.Context) himVar41.s.a(), (aoss) himVar41.cb.a(), (aolr) himVar41.bY.a(), himVar41.dT(), (ecx) himVar41.a.cm.a());
            case 168:
                return this.a.qc().h(zja.b("DialerCarAppServiceStatus", kcq.Q(hme.a.m()).o(), (java.lang.Iterable) null, (aonj) null, 12));
            case 169:
                defpackage.him himVar42 = this.a;
                return new defpackage.ksz((aoss) himVar42.cb.a(), himVar42.a.p());
            case 170:
                return java.lang.Boolean.valueOf(((apnt) this.a.pZ().b.a()).b("com.google.android.dialer.directboot", "45800747").e());
            case 171:
                return new defpackage.kvt();
            case 172:
                son sonVar = (son) this.a.a.ct.a();
                j$.util.Objects.requireNonNull(sonVar);
                return new apnt(sonVar);
            case 173:
                defpackage.him himVar43 = this.a;
                j$.util.Optional optionalOf = ((java.lang.Boolean) himVar43.Er.a()).booleanValue() ? j$.util.Optional.of(himVar43.a.S()) : j$.util.Optional.empty();
                if (optionalOf == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return optionalOf;
            case 174:
                return java.lang.Boolean.valueOf(((apnt) this.a.pJ().a.a()).b("com.google.android.dialer", "G__speak_easy_bypass_locale_check").e());
            case 175:
                return new uqf((gpd) this.a.fD.a());
            case 176:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.cL().a.a()).b("com.google.android.dialer.directboot", "45826250").e());
            case 177:
                defpackage.hip hipVar14 = this.a.a;
                return new rtx(hipVar14.G(), hipVar14.cz, hipVar14.cA);
            case 178:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.dq().a.a()).b("com.google.android.dialer.directboot", "45847505").e());
            case 179:
                return java.lang.Long.valueOf(((apnt) this.a.a.dq().a.a()).b("com.google.android.dialer.directboot", "45847506").b());
            case 180:
                defpackage.him himVar44 = this.a;
                return new defpackage.hql((apni) himVar44.eY.a(), (aoss) himVar44.cb.a(), (ecx) himVar44.a.cC.a());
            case 181:
                return this.a.qc().h(zja.b("LastSelectedTab", defpackage.hht.a(defpackage.hqf.a.m()).f(), (java.lang.Iterable) null, (aonj) null, 12));
            case 182:
                return new defpackage.hin(this, 1, (byte[]) null);
            case 183:
                defpackage.him himVar45 = this.a;
                return new uqc((android.content.Context) himVar45.s.a(), (ajct) himVar45.L.a(), (lvs) himVar45.oS.a(), himVar45.a.r(), (nwu) himVar45.va.a(), (ojo) himVar45.oF.a(), himVar45.uQ, (nxg) himVar45.uY.a(), himVar45.jF(), (ahbv) himVar45.fg.a(), (ajct) himVar45.r.a());
            case 184:
                return new rai(this, (char[]) null, (byte[]) null);
            case 185:
                return java.lang.Long.valueOf(((apnt) this.a.a.cS().a.a()).b("com.google.android.dialer.directboot", "45771522").b());
            case 186:
                return new rai(this, (byte[]) null, (char[]) null);
            case 187:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.a.aZ.a()).b("com.google.android.dialer", "G__enable_wifi_calling_icons_all_carriers").e());
            case 188:
                defpackage.him himVar46 = this.a;
                aoss aossVar3 = (aoss) himVar46.cb.a();
                aolr aolrVar = (aolr) himVar46.ca.a();
                defpackage.hip hipVar15 = himVar46.a;
                return new kdd(aossVar3, aolrVar, hipVar15.cK, hipVar15.co(), hipVar15.cn());
            case 189:
                return java.lang.Long.valueOf(((apnt) this.a.a.cK().a.a()).b("com.google.android.dialer.directboot", "45418376").b());
            case 190:
                return this.a.a.aq();
            case 191:
                defpackage.him himVar47 = this.a;
                return new jdd((isj) himVar47.vA.a(), himVar47.qS());
            case 192:
                return new huh();
            case 193:
                return new kvm();
            case 194:
                defpackage.him himVar48 = this.a;
                return new lby(himVar48.qS(), himVar48.iI, himVar48.Es);
            case 195:
                return new wgj((sou) this.a.vr.a(), 1, (byte[]) null);
            case 196:
                return new defpackage.kij(1);
            case 197:
                return new defpackage.kij(0);
            case 198:
                return new defpackage.kii();
            case 199:
                defpackage.him himVar49 = this.a;
                return new defpackage.jqt((moe) himVar49.wc.a(), (defpackage.jqr) himVar49.a.cT.a());
            default:
                throw new java.lang.AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v101, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v109, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v117, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v125, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v133, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v141, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v155, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v162, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v169, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v177, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v184, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v197, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v232, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v239, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v247, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v255, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v282, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v290, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v318, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v325, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v335, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v350, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v369, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v77, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v85, types: [aoin, java.lang.Object] */
    private final java.lang.Object d() {
        tez udfVar;
        rju tvvVar;
        int i = this.b;
        switch (i) {
            case 200:
                return new defpackage.jqr((kgl) this.a.pQ.a());
            case 201:
                return new wgj((sou) this.a.vr.a(), 0);
            case 202:
                return this.a.a.ap();
            case 203:
                defpackage.him himVar = this.a;
                return new defpackage.jsb((android.content.Context) himVar.s.a(), himVar.a.cb(), (rlv) himVar.fq.a(), himVar.sG());
            case 204:
                defpackage.him himVar2 = this.a;
                return new ude((mau) himVar2.a.da.a(), (rlv) himVar2.fq.a(), himVar2.mV(), himVar2.ox(), himVar2.qS(), 1);
            case 205:
                defpackage.him himVar3 = this.a;
                android.content.Context context = (android.content.Context) himVar3.s.a();
                ajct ajctVar = (ajct) himVar3.as.a();
                zjm zjmVarMV = himVar3.mV();
                himVar3.qS();
                aeqx aeqxVarMy = himVar3.my();
                lvs lvsVar = (lvs) himVar3.oS.a();
                defpackage.hip hipVar = himVar3.a;
                return new mau(context, ajctVar, zjmVarMV, aeqxVarMy, lvsVar, hipVar.cU(), himVar3.sG(), (nwu) himVar3.va.a(), (rlv) himVar3.fq.a(), himVar3.jC(), himVar3.oV(), (gpd) himVar3.fD.a(), (ahpz) himVar3.bb.a(), himVar3.jA(), (maw) himVar3.Eu.a(), himVar3.ox(), himVar3.uQ, hipVar.dn(), himVar3.oT, hipVar.cY, himVar3.mZ(), hipVar.cZ, himVar3.vR);
            case 206:
                return java.lang.Boolean.valueOf(((apnt) this.a.qk().b.a()).b("com.google.android.dialer.directboot", "45809219").e());
            case 207:
                return java.lang.Boolean.valueOf(((apnt) this.a.qk().b.a()).b("com.google.android.dialer.directboot", "45802815").e());
            case 208:
                defpackage.him himVar4 = this.a;
                return new udf((android.content.Context) himVar4.s.a(), (rlv) himVar4.fq.a(), himVar4.ox(), himVar4.a.dn(), 0);
            case 209:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.cI().a.a()).b("com.google.android.dialer.directboot", "45653473").e());
            case 210:
                defpackage.him himVar5 = this.a;
                return new udf((android.content.Context) himVar5.s.a(), (rlv) himVar5.fq.a(), himVar5.ox(), himVar5.a.dn(), 1, (byte[]) null);
            case 211:
                defpackage.him himVar6 = this.a;
                return new ude((rlv) himVar6.fq.a(), himVar6.a.dn(), (android.content.Context) himVar6.s.a(), himVar6.ox(), himVar6.qS(), 2, (byte[]) null);
            case 212:
                defpackage.him himVar7 = this.a;
                return new ude((rlv) himVar7.fq.a(), himVar7.a.dn(), (android.content.Context) himVar7.s.a(), himVar7.ox(), himVar7.qS(), 0);
            case 213:
                defpackage.him himVar8 = this.a;
                return new defpackage.moj(himVar8.my(), (rlv) himVar8.fq.a(), himVar8.qS());
            case 214:
                defpackage.him himVar9 = this.a;
                udfVar = new udf((android.content.Context) himVar9.s.a(), j$.util.Optional.of(new wsc((byte[]) null)), himVar9.jC(), (rlv) himVar9.fq.a(), 2);
                return udfVar;
            case 215:
                return java.lang.Boolean.valueOf(((apnt) this.a.rT().a.a()).b("com.google.android.dialer.directboot", "45779365").e());
            case 216:
                return java.lang.Long.valueOf(((apnt) this.a.pm().a.a()).b("com.google.android.dialer.directboot", "45638895").b());
            case 217:
                return new defpackage.hmv();
            case 218:
                return new rai(this, (char[]) null);
            case 219:
                defpackage.him himVar10 = this.a;
                return new defpackage.hnx((zpm) himVar10.fn.a(), (hpy) himVar10.fx.a(), (aoss) himVar10.cb.a(), himVar10.a.f5do);
            case 220:
                return java.lang.Boolean.valueOf(this.a.a.cP().P());
            case 221:
                defpackage.him himVar11 = this.a;
                ops opsVar = (ops) himVar11.BM.a();
                defpackage.hip hipVar2 = himVar11.a;
                return new defpackage.hod(opsVar, (rai) hipVar2.dq.a(), hipVar2.c(), hipVar2.b(), (zpm) himVar11.fn.a(), (gpd) himVar11.fD.a(), (defpackage.hqu) hipVar2.dr.a(), (aazc) himVar11.l.a(), (ahpz) himVar11.bb.a(), hipVar2.f5do);
            case 222:
                return new rai(this, (byte[]) null, (byte[]) null);
            case 223:
                return new defpackage.hin(this, 0);
            case 224:
                return new defpackage.hin(this, 2, (char[]) null);
            case 225:
                return new rai(this, (byte[]) null);
            case 226:
                return new rai(this);
            case 227:
                return new rai(this, (byte[]) null, (char[]) null, (byte[]) null);
            case 228:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.cW().a.a()).b("com.google.android.dialer.directboot", "45828654").e());
            case 229:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.dp().a.a()).b("com.google.android.dialer.directboot", "45621629").e());
            case 230:
                defpackage.hip hipVar3 = this.a.a;
                return aihd.r(hipVar3.bK(), hipVar3.bL());
            case 231:
                defpackage.him himVar12 = this.a;
                return new jyu((aoss) himVar12.cb.a(), (zjs) himVar12.cn.a());
            case 232:
                defpackage.him himVar13 = this.a;
                defpackage.hip hipVar4 = himVar13.a;
                amyz amyzVar = hipVar4.dy;
                amyz amyzVar2 = hipVar4.dB;
                amyz amyzVar3 = hipVar4.dC;
                amyz amyzVar4 = hipVar4.dD;
                amyz amyzVar5 = hipVar4.dE;
                amyz amyzVar6 = hipVar4.dF;
                amyz amyzVar7 = himVar13.Fs;
                amyz amyzVar8 = himVar13.Ft;
                android.content.Context context2 = (android.content.Context) himVar13.s.a();
                aoss aossVar = (aoss) himVar13.cb.a();
                aolr aolrVar = (aolr) himVar13.bg.a();
                rlv rlvVar = (rlv) himVar13.fq.a();
                gpd gpdVar = (gpd) himVar13.fD.a();
                aazc aazcVar = (aazc) himVar13.l.a();
                java.lang.Object objAB = hipVar4.aB();
                return new defpackage.htr(amyzVar, amyzVar2, amyzVar3, amyzVar4, amyzVar5, amyzVar6, amyzVar7, amyzVar8, context2, aossVar, aolrVar, rlvVar, gpdVar, aazcVar, (tuz) objAB, (ipc) hipVar4.dG.a(), (ssq) himVar13.qE.a(), (nwu) himVar13.va.a(), (rwi) himVar13.Bs.a(), (ops) himVar13.BM.a(), himVar13.mR(), hipVar4.H(), himVar13.oS(), himVar13.jF(), hipVar4.cs(), (ahbv) himVar13.fg.a(), himVar13.bN(), (defpackage.hgz) himVar13.vg.a(), hipVar4.e(), hipVar4.f(), (zzx) himVar13.gq(), (zjs) himVar13.cn.a(), himVar13.oa(), defpackage.hip.cr(), (ipc) himVar13.FC.a(), himVar13.bz(), himVar13.sd(), himVar13.sk());
            case 233:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.cR().a.a()).b("com.google.android.dialer.directboot", "45841237").e());
            case 234:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.dg().a.a()).b("com.google.android.dialer.directboot", "45848205").e());
            case 235:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.cT().a.a()).b("com.google.android.dialer.directboot", "45848029").e());
            case 236:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.cT().a.a()).b("com.google.android.dialer.directboot", "45852617").e());
            case 237:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.dl().a.a()).b("com.google.android.dialer.directboot", "45767734").e());
            case 238:
                return new ipc((short[]) null);
            case 239:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.cT().a.a()).b("com.google.android.dialer.directboot", "45672310").e());
            case 240:
                return new ryu(this.a.a.dI);
            case 241:
                return java.lang.Boolean.valueOf(this.a.a.cO().S());
            case 242:
                return java.lang.Long.valueOf(((apnt) this.a.rH().a.a()).b("com.google.android.dialer.directboot", "45692522").b());
            case 243:
                return java.lang.Boolean.valueOf(((apnt) this.a.sh().a.a()).b("com.google.android.dialer.directboot", "45760209").e());
            case 244:
                return java.lang.Long.valueOf(((apnt) this.a.sh().a.a()).b("com.google.android.dialer.directboot", "45654283").b());
            case 245:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.cH().a.a()).b("com.google.android.dialer.directboot", "45625343").e());
            case 246:
                return java.lang.Boolean.valueOf(((apnt) this.a.rM().a.a()).b("com.google.android.dialer.directboot", "45853556").e());
            case 247:
                defpackage.him himVar14 = this.a;
                tvvVar = new tvv((android.content.Context) himVar14.s.a(), (zth) himVar14.oD.a(), himVar14.be());
                return tvvVar;
            case 248:
                return java.lang.Long.valueOf(this.a.qe().u());
            case 249:
                return java.lang.Long.valueOf(((apnt) this.a.a.cY().a.a()).b("com.google.android.dialer.directboot", "45855709").b());
            case 250:
                defpackage.hip hipVar5 = this.a.a;
                return aihd.t(hipVar5.bY(), hipVar5.bG(), hipVar5.bT(), hipVar5.bz());
            case 251:
                return new sop((aprf) this.a.a.dR.a());
            case 252:
                ahbq ahbqVar = (ahbq) this.a.AJ.a();
                aooh.f(ahbqVar, "state");
                return new aprf(ahbqVar, (byte[]) null);
            case 253:
                defpackage.him himVar15 = this.a;
                return new defpackage.mhr((android.content.Context) himVar15.s.a(), (aazc) himVar15.l.a(), (zzx) himVar15.gq(), (aoss) himVar15.cb.a(), 0);
            case 254:
                return new defpackage.mht((aoss) this.a.cb.a());
            case 255:
                defpackage.him himVar16 = this.a;
                return new defpackage.mhr((android.telecom.TelecomManager) himVar16.ci.a(), himVar16.be(), (aoss) himVar16.bZ.a(), 1);
            case 256:
                defpackage.him himVar17 = this.a;
                return new mni((rlv) himVar17.fq.a(), (aoss) himVar17.cb.a());
            case 257:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.dc().a.a()).b("com.google.android.dialer.directboot", "45649436").e());
            case 258:
                return java.lang.Boolean.valueOf(((apnt) this.a.qV().a.a()).b("com.google.android.dialer.directboot", "45421146").e());
            case 259:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.cJ().a.a()).b("com.google.android.dialer.directboot", "45839973").e());
            case 260:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.dm().a.a()).b("com.google.android.dialer.directboot", "45820481").e());
            case 261:
                defpackage.hip hipVar6 = this.a.a;
                return aihd.r(hipVar6.bJ(), hipVar6.bq());
            case 262:
                defpackage.him himVar18 = this.a;
                return new sxh((aoss) himVar18.cb.a(), (aolr) himVar18.bY.a(), (rlv) himVar18.fq.a(), himVar18.i(), himVar18.bW());
            case 263:
                defpackage.hip hipVar7 = this.a.a;
                return aihd.t(hipVar7.bl(), hipVar7.bI(), hipVar7.bn(), hipVar7.bp());
            case 264:
                defpackage.him himVar19 = this.a;
                return new defpackage.msy((aoss) himVar19.cb.a(), (mtd) himVar19.FG.a(), (nri) himVar19.py.a(), himVar19.aN(), himVar19.aJ(), himVar19.a.cv(), himVar19.aK(), himVar19.aL(), (rlv) himVar19.fq.a(), (android.content.Context) himVar19.s.a(), (ojo) himVar19.oF.a(), (aolr) himVar19.bg.a(), (gpd) himVar19.fD.a(), himVar19.EK);
            case 265:
                defpackage.him himVar20 = this.a;
                return new udh((aoss) himVar20.cb.a(), (rlv) himVar20.fq.a(), himVar20.a.ck());
            case 266:
                defpackage.him himVar21 = this.a;
                android.content.Context context3 = (android.content.Context) himVar21.s.a();
                aoss aossVar2 = (aoss) himVar21.cb.a();
                aolr aolrVar2 = (aolr) himVar21.ca.a();
                zzd zzdVar = (zzd) himVar21.fa.a();
                rlv rlvVar2 = (rlv) himVar21.fq.a();
                ipc ipcVar = (ipc) himVar21.fj.a();
                syd sydVarBX = himVar21.bX();
                tbo tboVarBY = himVar21.bY();
                gou gouVarNn = himVar21.nn();
                defpackage.hip hipVar8 = himVar21.a;
                return new sxg(context3, aossVar2, aolrVar2, zzdVar, rlvVar2, ipcVar, sydVarBX, tboVarBY, gouVarNn, (yzr) hipVar8.ef.a(), himVar21.bW(), j$.util.Optional.of(himVar21.oJ()), himVar21.dK(), hipVar8.ck());
            case 267:
                return new yzr();
            case 268:
                defpackage.him himVar22 = this.a;
                defpackage.lnn lnnVar = defpackage.lnn.AUDIO_BASED_SCREENING_FEATURE_KEY_DOBBY;
                defpackage.hip hipVar9 = himVar22.a;
                return aigf.l(lnnVar, hipVar9.bk(), defpackage.lnn.AUDIO_BASED_SCREENING_FEATURE_KEY_REVELIO, hipVar9.bo());
            case 269:
                defpackage.him himVar23 = this.a;
                aoss aossVar3 = (aoss) himVar23.cb.a();
                aolr aolrVar3 = (aolr) himVar23.ca.a();
                defpackage.hip hipVar10 = himVar23.a;
                return new defpackage.msp(aossVar3, aolrVar3, hipVar10.ei, (ojo) himVar23.oF.a(), (zpm) himVar23.fn.a(), himVar23.np(), (mtd) himVar23.FG.a(), (rlv) himVar23.fq.a(), himVar23.dT(), hipVar10.x(), (aazc) himVar23.l.a(), hipVar10.y(), (mgw) himVar23.cc.a(), himVar23.aL(), himVar23.mH(), defpackage.him.nk(), (kaw) himVar23.FH.a(), hipVar10.ej);
            case 270:
                return java.lang.Long.valueOf(((apnt) this.a.pq().b.a()).b("com.google.android.dialer.directboot", "45415289").b());
            case 271:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.dd().a.a()).b("com.google.android.dialer.directboot", "45841996").e());
            case 272:
                defpackage.him himVar24 = this.a;
                aoss aossVar4 = (aoss) himVar24.cb.a();
                aolr aolrVar4 = (aolr) himVar24.ca.a();
                rlv rlvVar3 = (rlv) himVar24.fq.a();
                defpackage.hip hipVar11 = himVar24.a;
                return new sxd(aossVar4, aolrVar4, rlvVar3, hipVar11.J(), himVar24.np(), (yzr) hipVar11.ef.a(), himVar24.bW(), himVar24.bT());
            case 273:
                defpackage.him himVar25 = this.a;
                defpackage.lno lnoVar = defpackage.lno.CALL_INFO_BASED_SCREENING_FEATURE_KEY_BEESLY;
                defpackage.hip hipVar12 = himVar25.a;
                return aigf.m(lnoVar, hipVar12.bi(), defpackage.lno.CALL_INFO_BASED_SCREENING_FEATURE_KEY_DOBBY, hipVar12.bj(), defpackage.lno.CALL_INFO_BASED_SCREENING_FEATURE_KEY_SPAM, hipVar12.bm());
            case 274:
                defpackage.him himVar26 = this.a;
                aolr aolrVar5 = (aolr) himVar26.ca.a();
                aoss aossVar5 = (aoss) himVar26.cb.a();
                himVar26.E();
                jbm jbmVar = (jbm) himVar26.eW.a();
                defpackage.hip hipVar13 = himVar26.a;
                return new defpackage.ist(aolrVar5, aossVar5, jbmVar, hipVar13.h(), (ita) himVar26.Gi.a(), (kaw) himVar26.FH.a(), hipVar13.ej);
            case 275:
                defpackage.him himVar27 = this.a;
                aolr aolrVar6 = (aolr) himVar27.ca.a();
                aoss aossVar6 = (aoss) himVar27.cb.a();
                rlv rlvVar4 = (rlv) himVar27.fq.a();
                himVar27.np();
                mnl mnlVarAF = himVar27.aF();
                defpackage.hip hipVar14 = himVar27.a;
                defpackage.msu msuVarY = hipVar14.y();
                mtd mtdVar = (mtd) himVar27.FG.a();
                mgw mgwVar = (mgw) himVar27.cc.a();
                himVar27.aL();
                return new defpackage.msl(aolrVar6, aossVar6, rlvVar4, mnlVarAF, msuVarY, mtdVar, mgwVar, (kaw) himVar27.FH.a(), hipVar14.ej);
            case 276:
                defpackage.him himVar28 = this.a;
                return new udg((aoss) himVar28.cb.a(), (rlv) himVar28.fq.a(), (uhs) himVar28.iu.a(), himVar28.np(), himVar28.a.J(), (mgw) himVar28.cc.a());
            case 277:
                return java.lang.Boolean.valueOf(this.a.a.cV().Q());
            case 278:
                return new rai(this, (short[]) null);
            case 279:
                defpackage.him himVar29 = this.a;
                return himVar29.qc().h(defpackage.oqj.b());
            case 280:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.da().a.a()).b("com.google.android.dialer.directboot", "45814312").e());
            case 281:
                return java.lang.Boolean.valueOf(((apnt) this.a.rH().a.a()).b("com.google.android.dialer.directboot", "45790963").e());
            case 282:
                return new rhx();
            case 283:
                return new rjj();
            case 284:
                return new rlt(this.a.be());
            case 285:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.dk().a.a()).b("com.google.android.dialer.directboot", "45851943").e());
            case 286:
                return java.lang.Boolean.valueOf(this.a.pl().G());
            case 287:
                return java.lang.Long.valueOf(this.a.a.cG().R());
            case 288:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.dr().a.a()).b("com.google.android.dialer.directboot", "45749851").e());
            case 289:
                return new ssu();
            case 290:
                defpackage.him himVar30 = this.a;
                return himVar30.qc().h(sgg.b());
            case 291:
                return java.lang.Boolean.valueOf(this.a.pU().t());
            case 292:
                return java.lang.Boolean.valueOf(this.a.pS().r());
            case 293:
                return java.lang.Boolean.valueOf(this.a.pS().s());
            case 294:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.m94do().a.a()).b("com.google.android.dialer.directboot", "45476413").e());
            case 295:
                defpackage.him himVar31 = this.a;
                acxg acxgVarOV = himVar31.oV();
                defpackage.hip hipVar15 = himVar31.a;
                udfVar = new tez(acxgVarOV, hipVar15.cE(), (aazc) himVar31.l.a(), new wsc((byte[]) null), (rju) hipVar15.eK.a(), (nwu) himVar31.va.a(), (aoss) himVar31.eX.a(), (defpackage.mkj) hipVar15.eO.a(), himVar31.Gw);
                return udfVar;
            case 296:
                return sgg.p(this.a.a.eJ);
            case 297:
                defpackage.him himVar32 = this.a;
                tvvVar = new rju((android.content.Context) himVar32.s.a(), himVar32.a.cu(), (ajct) himVar32.L.a());
                return tvvVar;
            case 298:
                defpackage.him himVar33 = this.a;
                return new defpackage.mkj((defpackage.mki) himVar33.a.eN.a(), (aoss) himVar33.cb.a());
            case 299:
                defpackage.him himVar34 = this.a;
                return new defpackage.mki((defpackage.hli) himVar34.Gt.a(), (android.content.Context) himVar34.s.a(), (aolr) himVar34.bg.a(), (defpackage.nvw) himVar34.a.eM.a(), himVar34.jF(), himVar34.bd(), (zjs) himVar34.cn.a(), himVar34.be(), (aolr) himVar34.ca.a(), (aoss) himVar34.cb.a(), (ssq) himVar34.qE.a(), (ahpz) himVar34.bb.a());
            default:
                throw new java.lang.AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v101, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v109, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v119, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v127, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v137, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v145, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v158, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v180, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v188, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v337, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v372, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v380, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v388, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v413, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v424, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v439, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v466, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v474, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v77, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v85, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v93, types: [aoin, java.lang.Object] */
    private final java.lang.Object e() {
        tly nvwVar;
        adww advrVar;
        aofv ajxiVar;
        vtp agpnVar;
        advp ahjvVar;
        java.lang.Object kvpVar;
        int i = this.b;
        switch (i) {
            case 300:
                defpackage.him himVar = this.a;
                android.content.Context context = (android.content.Context) himVar.s.a();
                aolr aolrVar = (aolr) himVar.bY.a();
                aolr aolrVar2 = (aolr) himVar.ca.a();
                java.util.concurrent.Executor executor = (java.util.concurrent.Executor) himVar.as.a();
                zjs zjsVar = (zjs) himVar.cn.a();
                oko okoVarBe = himVar.be();
                okj okjVarBd = himVar.bd();
                defpackage.kvt kvtVar = (defpackage.kvt) himVar.Gs.a();
                defpackage.hip hipVar = himVar.a;
                defpackage.him himVar2 = hipVar.a;
                nvwVar = new defpackage.nvw(context, aolrVar, aolrVar2, executor, zjsVar, okoVarBe, okjVarBd, kvtVar, afsq.cM(j$.util.Optional.of(himVar2.aQ()), j$.util.Optional.of(himVar2.aP())), hipVar.eL);
                return nvwVar;
            case 301:
                return java.lang.Boolean.valueOf(((apnt) new vaa(this.a.a.a.aZ, (byte[]) null).a.a()).b("com.google.android.dialer.directboot", "45839654").e());
            case 302:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.a.aZ.a()).b("com.google.android.dialer.directboot", "45851012").e());
            case 303:
                return java.lang.Long.valueOf(((apnt) new xtq(this.a.a.a.aZ, (byte[]) null).a.a()).b("com.google.android.dialer", "ContactRetriever__max_num_scores_considered_in_popularity_ranking").b());
            case 304:
                defpackage.him himVar3 = this.a;
                android.content.Context context2 = (android.content.Context) himVar3.s.a();
                ajct ajctVar = (ajct) himVar3.L.a();
                ajct ajctVar2 = (ajct) himVar3.r.a();
                defpackage.hip hipVar2 = himVar3.a;
                nvwVar = new uqp(context2, ajctVar, ajctVar2, (uqt) hipVar2.eT.a(), hipVar2.eU, hipVar2.eV, hipVar2.eW, hipVar2.eX, himVar3.dT(), (ojo) himVar3.oF.a());
                return nvwVar;
            case 305:
                uqt uqtVarX = ((com.android.dialer.suggestcontacts.impl.database.ContactScoreDatabase) this.a.a.eS.a()).x();
                aooc.ap(uqtVarX);
                return uqtVarX;
            case 306:
                defpackage.him himVar4 = this.a;
                android.content.Context context3 = (android.content.Context) himVar4.s.a();
                ajct ajctVar3 = (ajct) himVar4.L.a();
                gfv gfvVarD = gfz.d(context3, com.android.dialer.suggestcontacts.impl.database.ContactScoreDatabase.class, "suggest_contact_database");
                gfvVarD.f(ajctVar3);
                com.android.dialer.suggestcontacts.impl.database.ContactScoreDatabase contactScoreDatabaseA = gfvVarD.a();
                aooc.ap(contactScoreDatabaseA);
                return contactScoreDatabaseA;
            case 307:
                return java.lang.Long.valueOf(((apnt) this.a.a.cX().a.a()).b("com.google.android.dialer", "G__frequents_recency_decay").b());
            case 308:
                return java.lang.Long.valueOf(((apnt) this.a.a.cX().a.a()).b("com.google.android.dialer", "G__frequents_time_of_day_weight_fraction_pct").b());
            case 309:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.cX().a.a()).b("com.google.android.dialer", "G__frequents_enable_missed_call_effect").e());
            case 310:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.cX().a.a()).b("com.google.android.dialer", "G__frequents_enable_time_of_day_effect").e());
            case 311:
                return java.lang.Boolean.valueOf(((apnt) this.a.rH().a.a()).b("com.google.android.dialer.directboot", "45838248").e());
            case 312:
                return java.lang.Boolean.valueOf(((apnt) this.a.qC().a.a()).b("com.google.android.dialer.directboot", "45414216").e());
            case 313:
                return java.lang.Long.valueOf(((apnt) this.a.qC().a.a()).b("com.google.android.dialer.directboot", "45414198").b());
            case 314:
                return java.lang.Long.valueOf(((apnt) this.a.qC().a.a()).b("com.google.android.dialer.directboot", "45414199").b());
            case 315:
                return java.lang.Long.valueOf(((apnt) new xtq(this.a.a.a.aZ, (byte[]) null).a.a()).b("com.google.android.dialer", "G__experiment_for_alternative_spam_word").b());
            case 316:
                return java.lang.Boolean.valueOf(((apnt) this.a.pS().a.a()).b("com.google.android.dialer", "kill_rtt_videocall_transition").e());
            case 317:
                return java.lang.Boolean.valueOf(((apnt) new ahda(this.a.a.a.aZ).a.a()).b("com.google.android.dialer", "G__enable_default_dialer").e());
            case 318:
                return java.lang.Boolean.valueOf(((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45837077").e());
            case 319:
                defpackage.him himVar5 = this.a;
                return himVar5.pX().t(zte.a("VvmPowerCycleData", vmt.a).a(), (aogc) himVar5.bq.a());
            case 320:
                return java.lang.Boolean.valueOf(((apnt) this.a.ss().a.a()).b("com.google.android.dialer.directboot", "45420397").e());
            case 321:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.a.aZ.a()).b("com.google.android.dialer.directboot", "45830165").e());
            case 322:
                defpackage.him himVar6 = this.a;
                return himVar6.pX().t(zte.a("VoicemailGreetingsLastDataFetchResult", vpt.a).a(), (aogc) himVar6.bq.a());
            case 323:
                return java.lang.Long.valueOf(((apnt) this.a.rv().a.a()).b("com.google.android.dialer.directboot", "45408773").b());
            case 324:
                return java.lang.Long.valueOf(((apnt) this.a.rv().a.a()).b("com.google.android.dialer.directboot", "45408772").b());
            case 325:
                defpackage.him himVar7 = this.a;
                return himVar7.pX().t(zte.a("ExistingPhoneAccountRecord", xqt.a).a(), (aogc) himVar7.bq.a());
            case 326:
                nvwVar = new aile(zjm.h(this.a.a.a.Ct));
                return nvwVar;
            case 327:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.a.aZ.a()).b("com.google.android.dialer.directboot", "45809262").e());
            case 328:
                defpackage.him himVar8 = this.a;
                android.content.Context context4 = (android.content.Context) himVar8.s.a();
                defpackage.hip hipVar3 = himVar8.a;
                nvwVar = new advj(context4, himVar8.rh, hipVar3.fq, hipVar3.fr, himVar8.sk, himVar8.qJ, himVar8.qK, himVar8.sn, amzb.a, himVar8.rF, (aolr) himVar8.bY.a());
                return nvwVar;
            case 329:
                defpackage.him himVar9 = this.a;
                aeee aeeeVar = (aeee) himVar9.rh.a();
                aolr aolrVar3 = (aolr) himVar9.bg.a();
                android.content.Context context5 = (android.content.Context) himVar9.s.a();
                aikn aiknVar = aikn.a;
                himVar9.sT();
                nvwVar = new aduh(aeeeVar, aolrVar3, context5, aiknVar);
                return nvwVar;
            case 330:
                nvwVar = new aefb((android.content.Context) this.a.a.a.s.a());
                return nvwVar;
            case 331:
                defpackage.him himVar10 = this.a;
                advrVar = new advr(himVar10.a.cq(), (aolr) himVar10.bY.a());
                return advrVar;
            case 332:
                defpackage.him himVar11 = this.a;
                defpackage.hip hipVar4 = himVar11.a;
                advrVar = new adwj(hipVar4.fu, himVar11.sk, himVar11.sn, himVar11.l, himVar11.si, hipVar4.fv, (android.content.Context) himVar11.s.a(), himVar11.qK, himVar11.qJ, hipVar4.fw, hipVar4.fx, hipVar4.fy, (aolr) himVar11.bY.a());
                return advrVar;
            case 333:
                defpackage.him himVar12 = this.a;
                nvwVar = new adwp((aeee) himVar12.rh.a(), (adym) himVar12.rE.a());
                return nvwVar;
            case 334:
                return new adxr();
            case 335:
                defpackage.hip hipVar5 = this.a.a;
                defpackage.him himVar13 = hipVar5.a;
                return ahyn.h(new aced((adzh) himVar13.st.a(), new acil((android.content.Context) himVar13.s.a(), (aolr) himVar13.bg.a(), new accj(), himVar13.ue, hipVar5.C, (achv) himVar13.sz.a()), (adxm) himVar13.sk.a(), (gat) himVar13.sn.a(), himVar13.ue));
            case 336:
                defpackage.him himVar14 = this.a;
                advrVar = new adws(himVar14.a.cq(), (aolr) himVar14.bY.a());
                return advrVar;
            case 337:
                defpackage.him himVar15 = this.a;
                advrVar = new adwu(himVar15.a.cq(), (aolr) himVar15.bY.a());
                return advrVar;
            case 338:
                defpackage.him himVar16 = this.a;
                advrVar = new adww(himVar16.a.cq(), (aolr) himVar16.bY.a());
                return advrVar;
            case 339:
                return new defpackage.advs(1);
            case 340:
                return new defpackage.advs(0);
            case 341:
                nvwVar = new adwk(this.a.a.aa());
                return nvwVar;
            case 342:
                return new defpackage.advs(2);
            case 343:
                return new defpackage.advs(3);
            case 344:
                return new defpackage.advs(4);
            case 345:
                nvwVar = new defpackage.hiu(this.a, 1);
                return nvwVar;
            case 346:
                nvwVar = new defpackage.hiu(this.a, 0);
                return nvwVar;
            case 347:
                defpackage.him himVar17 = this.a;
                ajct ajctVar4 = (ajct) himVar17.as.a();
                agsm agsmVar = (agsm) himVar17.aT.a();
                agth agthVar = (agth) himVar17.qb.a();
                return new aegx(ajctVar4, agsmVar, agthVar);
            case 348:
                nvwVar = new defpackage.hgw(this.a);
                return nvwVar;
            case 349:
                nvwVar = new defpackage.hiy(this.a, 0);
                return nvwVar;
            case 350:
                nvwVar = new defpackage.hiy(this.a, 1);
                return nvwVar;
            case 351:
                nvwVar = new defpackage.hiy(this.a, 2);
                return nvwVar;
            case 352:
                defpackage.hip hipVar6 = this.a.a;
                ajxiVar = new ajxi((afcd) hipVar6.fS.a(), j$.util.Optional.of((defpackage.afaz) hipVar6.fQ.a()), j$.util.Optional.of((afcd) hipVar6.fR.a()), (byte[]) null);
                return ajxiVar;
            case 353:
                return new defpackage.afaz();
            case 354:
                return new afcd();
            case 355:
                android.content.Context context6 = (android.content.Context) this.a.s.a();
                java.lang.String packageName = context6.getPackageName();
                zzd.k(context6, "STRICT_INTENTS_SANITIZATION_EVENT");
                abtl.b(context6, new defpackage.afbh());
                j$.util.Objects.requireNonNull(j$.util.concurrent.ThreadLocalRandom.current());
                if (packageName != null) {
                    return new afcd();
                }
                throw new java.lang.NullPointerException("Null packageName");
            case 356:
                defpackage.him himVar18 = this.a;
                android.content.Context context7 = (android.content.Context) himVar18.s.a();
                agoo agooVar = (agoo) himVar18.a.a.tw.a();
                aooh.f(agooVar, "accountDataSourceFactory");
                agpnVar = new defpackage.agpn(context7, new aile(new aprf(agooVar)), (ajct) himVar18.r.a(), (agsm) himVar18.aT.a());
                return agpnVar;
            case 357:
                nvwVar = new apjb(this.a.a.fV);
                return nvwVar;
            case 358:
                nvwVar = new defpackage.hjx(this.a);
                return nvwVar;
            case 359:
                defpackage.him himVar19 = this.a;
                ajct ajctVar5 = (ajct) himVar19.as.a();
                ajct ajctVar6 = (ajct) himVar19.r.a();
                zwr zwrVarIG = himVar19.iG();
                ahjw ahjwVar = new ahjw();
                ahvr.bY(!ahvr.cp(ahjwVar.a));
                agpq agpqVar = (agpq) himVar19.rx.a();
                ahjvVar = new ahjv(ajctVar5, ajctVar6, zwrVarIG, ahjwVar, agpqVar);
                return ahjvVar;
            case 360:
                nvwVar = new xyx((android.content.Context) this.a.s.a(), 1);
                return nvwVar;
            case 361:
                nvwVar = new aekz((android.content.Context) this.a.s.a(), 3, (byte[]) null);
                return nvwVar;
            case 362:
                defpackage.him himVar20 = this.a;
                java.lang.Object objGO = himVar20.gO();
                ajct ajctVar7 = (ajct) himVar20.r.a();
                himVar20.gL();
                agpnVar = new vtp((vze) objGO, ajctVar7, himVar20.nd(), (zjs) himVar20.cn.a());
                return agpnVar;
            case 363:
                defpackage.him himVar21 = this.a;
                ajxiVar = new vqt(himVar21.nd(), (ajct) himVar21.r.a(), (vze) himVar21.gO());
                return ajxiVar;
            case 364:
                defpackage.him himVar22 = this.a;
                aazc aazcVar = (aazc) himVar22.l.a();
                defpackage.hip hipVar7 = himVar22.a;
                nvwVar = new adxa(aazcVar, hipVar7.fz, new aefw(), amyu.b(himVar22.sk), amyu.b(himVar22.sn), (aolr) himVar22.bY.a(), hipVar7.aa());
                return nvwVar;
            case 365:
                defpackage.him himVar23 = this.a;
                aazc aazcVar2 = (aazc) himVar23.l.a();
                android.content.Context context8 = (android.content.Context) himVar23.s.a();
                aigb aigbVarG = aigf.g(7);
                defpackage.hip hipVar8 = himVar23.a;
                aigbVarG.i("GK_ONEOFF_SYNC", hipVar8.D.a());
                aigbVarG.i("GK_PERIODIC_SYNC", hipVar8.F.a());
                aigbVarG.i("GNP_IN_APP_ACCOUNT_SYNC", (adzf) hipVar8.G.a());
                aigbVarG.i("GK_PERMISSIONS_STATE_LOGGING", (adzf) hipVar8.H.a());
                defpackage.him himVar24 = hipVar8.a;
                aigbVarG.i("GNP_REGISTRATION", (adzf) himVar24.sx.a());
                aigbVarG.i("GNP_PERIODIC_REGISTRATION", (adzf) himVar24.Ba.a());
                aigbVarG.i("GK_STORAGE_CLEANUP", (adzf) hipVar8.I.a());
                ahjvVar = new advp(aazcVar2, context8, aigbVarG.e(true), himVar23.eI(), (aduu) himVar23.qJ.a(), amyu.b(himVar23.qK), amyu.b(himVar23.sk), amyu.b(himVar23.sn), (aolr) himVar23.ca.a(), hipVar8.cB());
                return ahjvVar;
            case 366:
                defpackage.him himVar25 = this.a;
                ajxiVar = new aofv((android.content.Context) himVar25.s.a(), (wsk) himVar25.sb.a(), himVar25.a.cA());
                return ajxiVar;
            case 367:
                nvwVar = new rai(this, (byte[]) null, (byte[]) null, (byte[]) null);
                return nvwVar;
            case 368:
                defpackage.him himVar26 = this.a;
                nvwVar = new ahdr((android.content.Context) himVar26.s.a(), amyu.b(himVar26.bC), (aewq) himVar26.br.a(), (agoo) himVar26.tw.a(), himVar26.oY(), defpackage.him.iO());
                return nvwVar;
            case 369:
                nvwVar = new ahhr((android.content.Context) this.a.s.a());
                return nvwVar;
            case 370:
                return java.lang.Boolean.valueOf(((apnt) new vqu(this.a.a.a.aZ, (byte[]) null).a.a()).b("com.google.android.dialer.directboot", "45766385").e());
            case 371:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.a.aZ.a()).b("com.google.android.dialer.directboot", "45864234").e());
            case 372:
                defpackage.him himVar27 = this.a;
                android.content.Context context9 = (android.content.Context) himVar27.s.a();
                defpackage.hip hipVar9 = himVar27.a;
                kvpVar = new defpackage.kvp(context9, hipVar9.cg(), hipVar9.ca(), himVar27.jC(), j$.util.Optional.of(new wsc((byte[]) null)), 1);
                return kvpVar;
            case 373:
                defpackage.him himVar28 = this.a;
                nvwVar = new defpackage.kjm((android.content.Context) himVar28.s.a(), (aazc) himVar28.l.a(), himVar28.vq);
                return nvwVar;
            case 374:
                defpackage.him himVar29 = this.a;
                kvpVar = new defpackage.jdc((android.content.Context) himVar29.s.a(), (defpackage.jdb) himVar29.a.gp.a(), j$.util.Optional.of(new wsc((byte[]) null)), (rlv) himVar29.fq.a(), himVar29.E(), himVar29.FL);
                return kvpVar;
            case 375:
                nvwVar = new defpackage.jdb((kgl) this.a.pv.a(), new kcq());
                return nvwVar;
            case 376:
                defpackage.him himVar30 = this.a;
                android.content.Context context10 = (android.content.Context) himVar30.s.a();
                defpackage.hip hipVar10 = himVar30.a;
                nvwVar = new defpackage.mag(context10, hipVar10.cg(), hipVar10.ca(), (rlv) himVar30.fq.a(), j$.util.Optional.of(new wsc((byte[]) null)));
                return nvwVar;
            case 377:
                defpackage.him himVar31 = this.a;
                nvwVar = new tcn((android.content.Context) himVar31.s.a(), (rlv) himVar31.fq.a());
                return nvwVar;
            case 378:
                return java.lang.Boolean.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417189").e());
            case 379:
                return java.lang.Boolean.valueOf(((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417188").e());
            case 380:
                return java.lang.Boolean.valueOf(((apnt) this.a.pZ().b.a()).b("com.google.android.dialer.directboot", "45837621").e());
            case 381:
                return gus.V((android.content.Context) this.a.s.a(), "CARRIER_SERVICES");
            case 382:
                return gus.V((android.content.Context) this.a.s.a(), "NOVA_VOICE");
            case 383:
                return gus.V((android.content.Context) this.a.s.a(), "CONNECTIVITY_MONITOR");
            case 384:
                return java.lang.Boolean.valueOf(((apnt) new xtq(this.a.a.a.aZ, (byte[]) null).a.a()).b("com.google.android.dialer", "G__enable_feedback_log_upload").e());
            case 385:
                return this.a.qc().h(zja.a("VideoCallIntroData", uyj.a).a());
            case 386:
                return java.lang.Boolean.valueOf(((apnt) this.a.rk().a.a()).b("com.google.android.dialer", "enable_video_call_introduction").e());
            case 387:
                nvwVar = new wzs(this.a.nH());
                return nvwVar;
            case 388:
                defpackage.him himVar32 = this.a;
                nvwVar = new defpackage.ivy((aoss) himVar32.cb.a(), (jbm) himVar32.eW.a(), himVar32.a.i(), (rlv) himVar32.fq.a());
                return nvwVar;
            case 389:
                defpackage.him himVar33 = this.a;
                nvwVar = new defpackage.jcf((aolr) himVar33.ca.a(), (ish) himVar33.ya.a(), himVar33.sn(), himVar33.M(), himVar33.L());
                return nvwVar;
            case 390:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45857427").e());
            case 391:
                defpackage.him himVar34 = this.a;
                nvwVar = new defpackage.jno(himVar34.sG(), (rlv) himVar34.fq.a());
                return nvwVar;
            case 392:
                nvwVar = new owa((rlv) this.a.fq.a(), 0);
                return nvwVar;
            case 393:
                nvwVar = new owa((rlv) this.a.fq.a(), 1, (byte[]) null);
                return nvwVar;
            case 394:
                defpackage.him himVar35 = this.a;
                nvwVar = new wil((ajct) himVar35.r.a(), himVar35.ds());
                return nvwVar;
            case 395:
                defpackage.him himVar36 = this.a;
                nvwVar = new tly((aoss) himVar36.cb.a(), (aogc) himVar36.kz.a());
                return nvwVar;
            case 396:
                return java.lang.Boolean.valueOf(((apnt) this.a.qJ().a.a()).b("com.google.android.dialer", "enable_deny_growthkit_promo_using_session_timer").e());
            case 397:
                return java.lang.Long.valueOf(((apnt) this.a.qJ().a.a()).b("com.google.android.dialer", "growthkit_promo_incubation_period").b());
            case 398:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.a.aZ.a()).b("com.google.android.dialer", "enable_incall_fixed_60hz_refresh_rate").e());
            case 399:
                return new uzg(1);
            default:
                throw new java.lang.AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r14v176, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v186, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v211, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v240, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v260, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v293, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v305, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v314, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v321, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v331, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v339, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v348, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v356, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v36, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v363, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v374, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v382, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v429, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v437, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v454, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v462, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v473, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v480, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v6, types: [aoin, java.lang.Object] */
    private final java.lang.Object f() {
        vzn midVar;
        rur pgiVar;
        spu acmzVar;
        defpackage.mjk kkuVar;
        int i = this.b;
        switch (i) {
            case 400:
                return new uzg(0);
            case 401:
                return java.lang.Boolean.valueOf(((apnt) new ahda(this.a.a.a.aZ).a.a()).b("com.google.android.dialer", "enable_hardware_acceleration_for_vivo_go").e());
            case 402:
                defpackage.him himVar = this.a;
                midVar = new mid((android.content.Context) himVar.s.a(), (ajct) himVar.L.a());
                return midVar;
            case 403:
                return java.lang.Long.valueOf(((apnt) this.a.a.a.aZ.a()).b("com.google.android.dialer.directboot", "45690271").b());
            case 404:
                defpackage.him himVar2 = this.a;
                vvq vvqVar = vvq.a;
                aooh.e(vvqVar, "getDefaultInstance(...)");
                return himVar2.pX().t(zte.a("VoicemailTabPreviouslyShown", vvqVar).a(), (aogc) himVar2.bq.a());
            case 405:
                return new defpackage.lxk();
            case 406:
                defpackage.him himVar3 = this.a;
                pgiVar = new pgi(himVar3.aA(), (aoss) himVar3.cb.a());
                return pgiVar;
            case 407:
                return java.lang.Boolean.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45794962").e());
            case 408:
                defpackage.him himVar4 = this.a;
                midVar = new uwp((ajct) himVar4.r.a(), (rlv) himVar4.fq.a());
                return midVar;
            case 409:
                defpackage.him himVar5 = this.a;
                aikn aiknVar = aikn.a;
                acmz acmzVar2 = (acmz) himVar5.a.gY.a();
                aiof aiofVar = acop.a;
                aihb aihbVar = new aihb();
                aihbVar.k(aiknVar);
                aihbVar.i(acmzVar2.g);
                midVar = new vaa(aihbVar.h());
                return midVar;
            case 410:
                defpackage.him himVar6 = this.a;
                aclt acltVar = (aclt) himVar6.fW.a();
                final ahpz ahpzVar = (ahpz) himVar6.a.a.bb.a();
                ahys ahysVarH = ahyn.h(new acmq() { // from class: agrt
                    public final java.lang.Runnable a(java.lang.Runnable runnable) {
                        return ahns.q() ? ahqx.h(runnable) : new acxq(ahpzVar, runnable, 10);
                    }
                });
                himVar6.eq();
                acmzVar = new acmz(acltVar, (acmq) ahysVarH.a, (adae) himVar6.fX.a());
                if (!"robolectric".equals(android.os.Build.FINGERPRINT) && !android.os.Build.TAGS.contains("dev-keys") && !android.os.Build.TAGS.contains("test-keys")) {
                    java.lang.Integer num = 500;
                    num.getClass();
                    ((acmz) acmzVar).d = 500;
                }
                return acmzVar;
            case 411:
                defpackage.him himVar7 = this.a;
                aclt acltVar2 = (aclt) himVar7.fW.a();
                adae adaeVar = (adae) himVar7.fX.a();
                java.lang.Boolean.FALSE.booleanValue();
                midVar = new acnd(acltVar2, adaeVar);
                return midVar;
            case 412:
                ahdr ahdrVar = (ahdr) this.a.a.gj.a();
                aooh.f(ahdrVar, "userSwitchSerializer");
                pgiVar = new ahja(ahdrVar, 1);
                return pgiVar;
            case 413:
                defpackage.him himVar8 = this.a;
                adag adagVar = (adag) himVar8.bM.a();
                defpackage.hip hipVar = himVar8.a;
                pgiVar = new abtr(adagVar, aigf.k(agra.class, hipVar.hc), aigf.k(agre.class, hipVar.hd), aikn.a, (agno) himVar8.AD.a());
                return pgiVar;
            case 414:
                return new agra();
            case 415:
                pgiVar = new agre((android.content.Context) this.a.s.a());
                return pgiVar;
            case 416:
                defpackage.him himVar9 = this.a;
                defpackage.hip hipVar2 = himVar9.a;
                acmzVar = new xaa(new wzz(hipVar2.a.re(), 0), himVar9.dt(), hipVar2.U(), (rlv) himVar9.fq.a());
                return acmzVar;
            case 417:
                pgiVar = new wzt(this.a.re(), 0);
                return pgiVar;
            case 418:
                defpackage.him himVar10 = this.a;
                pgiVar = new ovx(himVar10.re(), (rlv) himVar10.fq.a(), 1);
                return pgiVar;
            case 419:
                defpackage.him himVar11 = this.a;
                pgiVar = new defpackage.ixa(himVar11.re(), himVar11.mV(), himVar11.E());
                return pgiVar;
            case 420:
                defpackage.him himVar12 = this.a;
                pgiVar = new defpackage.jnp((aoss) himVar12.cb.a(), himVar12.re());
                return pgiVar;
            case 421:
                pgiVar = new defpackage.muy(this.a.re());
                return pgiVar;
            case 422:
                defpackage.him himVar13 = this.a;
                pgiVar = new ovx(himVar13.re(), himVar13.tf, 0);
                return pgiVar;
            case 423:
                defpackage.him himVar14 = this.a;
                pgiVar = new defpackage.jpb(himVar14.P(), himVar14.a.U(), himVar14.re());
                return pgiVar;
            case 424:
                pgiVar = new tlz(this.a.re(), 1);
                return pgiVar;
            case 425:
                pgiVar = new wzt((android.content.Context) this.a.s.a(), 1);
                return pgiVar;
            case 426:
                defpackage.him himVar15 = this.a;
                pgiVar = new sfc(himVar15.a.U(), himVar15.bH(), himVar15.re(), (rlv) himVar15.fq.a());
                return pgiVar;
            case 427:
                defpackage.him himVar16 = this.a;
                android.content.Context context = (android.content.Context) himVar16.s.a();
                defpackage.hip hipVar3 = himVar16.a;
                pgiVar = new rji(context, 5, hipVar3.U(), (rjj) hipVar3.ex.a());
                return pgiVar;
            case 428:
                defpackage.him himVar17 = this.a;
                pgiVar = new scb(himVar17.bH(), (rlv) himVar17.fq.a(), himVar17.tv);
                return pgiVar;
            case 429:
                defpackage.him himVar18 = this.a;
                defpackage.hip hipVar4 = himVar18.a;
                midVar = new sxy(new wzz(hipVar4.a.re(), 1), himVar18.bV(), hipVar4.U());
                return midVar;
            case 430:
                defpackage.him himVar19 = this.a;
                acmzVar = new tcz(himVar19.mX(), himVar19.re(), (ajct) himVar19.L.a());
                return acmzVar;
            case 431:
                defpackage.him himVar20 = this.a;
                acmzVar = new tzz(himVar20.re(), himVar20.a.U(), himVar20.ct());
                return acmzVar;
            case 432:
                pgiVar = new wim(this.a.re());
                return pgiVar;
            case 433:
                pgiVar = new tlz(this.a.re(), 0);
                return pgiVar;
            case 434:
                pgiVar = new vpe(this.a.re());
                return pgiVar;
            case 435:
                ahoq ahoqVarW = ahvr.W(1397, "provideExtensionRegistry");
                try {
                    pgiVar = akzq.a();
                    ahoqVarW.close();
                    aooc.ap(pgiVar);
                    return pgiVar;
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarW.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case 436:
                defpackage.him himVar21 = this.a;
                defpackage.hip hipVar5 = himVar21.a;
                ahda ahdaVarCx = hipVar5.cx();
                ahpz ahpzVar2 = (ahpz) himVar21.bb.a();
                android.content.Context context2 = (android.content.Context) himVar21.s.a();
                amyz amyzVar = hipVar5.hz;
                ajct ajctVar = (ajct) himVar21.r.a();
                aoss aossVar = (aoss) himVar21.cb.a();
                iep iepVar = (iep) hipVar5.hA.a();
                defpackage.him himVar22 = hipVar5.a;
                pgiVar = new iez(ahdaVarCx, ahpzVar2, context2, amyzVar, ajctVar, aossVar, iepVar, new aogc((oju) himVar22.Ga.a(), (aoss) himVar22.cb.a(), (apni) himVar22.eY.a()), (rlv) himVar21.fq.a(), (aogc) himVar21.fo.a(), himVar21.aW(), (tkl) himVar21.fy.a(), hipVar5.hB);
                return pgiVar;
            case 437:
                ipc ipcVar = new ipc((android.content.Context) this.a.a.a.s.a());
                java.lang.String str = eum.a;
                defpackage.epu epuVar = new defpackage.epu(1, 2);
                defpackage.flf flfVar = new defpackage.flf();
                flfVar.d();
                flfVar.c();
                android.content.Context context3 = (android.content.Context) ipcVar.a;
                defpackage.exo exoVar = new defpackage.exo(context3, new defpackage.ffh(context3, flfVar));
                ahvr.bY(!exoVar.o);
                exoVar.j = epuVar;
                ahvr.bY(!exoVar.o);
                exoVar.o = true;
                return new defpackage.eyc(exoVar);
            case 438:
                defpackage.him himVar23 = this.a;
                pgiVar = new iep((android.content.Context) himVar23.s.a(), (aoss) himVar23.bZ.a(), (aoss) himVar23.cb.a(), (oju) himVar23.Ga.a(), (apni) himVar23.eY.a(), himVar23.a.g());
                return pgiVar;
            case 439:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.a.aZ.a()).b("com.google.android.dialer.directboot", "45585427").e());
            case 440:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.a.aZ.a()).b("com.google.android.dialer.directboot", "45645314").e());
            case 441:
                return java.lang.Boolean.valueOf(((apnt) this.a.pc().a.a()).b("com.google.android.dialer.directboot", "45757994").e());
            case 442:
                return java.lang.Boolean.valueOf(((apnt) new vaa(this.a.a.a.aZ, (byte[]) null).a.a()).b("com.google.android.dialer.directboot", "45776285").e());
            case 443:
                pgiVar = new defpackage.jmw(this.a.a.j());
                return pgiVar;
            case 444:
                pgiVar = new defpackage.jmv(this.a.a.j());
                return pgiVar;
            case 445:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.a.aZ.a()).b("com.google.android.dialer.directboot", "45845490").e());
            case 446:
                return java.lang.Boolean.valueOf(((apnt) new vaa(this.a.a.a.aZ, (byte[]) null).a.a()).b("com.google.android.dialer.directboot", "45630413").e());
            case 447:
                return this.a.qc().h(zja.a("CallerTagSelector", defpackage.jvm.a).a());
            case 448:
                defpackage.him himVar24 = this.a;
                ojo ojoVar = (ojo) himVar24.oF.a();
                defpackage.hip hipVar6 = himVar24.a;
                midVar = new opx(ojoVar, aihd.s((opu) hipVar6.hL.a(), (opu) hipVar6.hM.a(), (opu) hipVar6.hN.a()));
                return midVar;
            case 449:
                defpackage.him himVar25 = this.a;
                acmzVar = new uqr((ajct) himVar25.r.a(), himVar25.a.eY, (ahpz) himVar25.bb.a());
                return acmzVar;
            case 450:
                defpackage.him himVar26 = this.a;
                acmzVar = new spu((ajct) himVar26.r.a(), himVar26.pn, (ahpz) himVar26.bb.a());
                return acmzVar;
            case 451:
                defpackage.him himVar27 = this.a;
                kkuVar = new kku((ajct) himVar27.r.a(), himVar27.pn, (ahpz) himVar27.bb.a(), himVar27.oT);
                return kkuVar;
            case 452:
                return new defpackage.ni((byte[]) null);
            case 453:
                return java.lang.Boolean.valueOf(((apnt) this.a.rN().a.a()).b("com.google.android.dialer.directboot", "45850006").e());
            case 454:
                pgiVar = new kgd((rlv) this.a.fq.a(), 1, (byte[]) null);
                return pgiVar;
            case 455:
                defpackage.him himVar28 = this.a;
                pgiVar = new kge((rlv) himVar28.fq.a(), (gpd) himVar28.fD.a(), 1);
                return pgiVar;
            case 456:
                pgiVar = new kgd((rlv) this.a.fq.a(), 0);
                return pgiVar;
            case 457:
                return java.lang.Boolean.valueOf(((apnt) this.a.rH().a.a()).b("com.google.android.dialer.directboot", "45720526").e());
            case 458:
                defpackage.him himVar29 = this.a;
                pgiVar = new kge(himVar29.ox(), (rlv) himVar29.fq.a(), 0);
                return pgiVar;
            case 459:
                defpackage.him himVar30 = this.a;
                pgiVar = new kgf(himVar30.ox(), (rlv) himVar30.fq.a(), (gpd) himVar30.fD.a());
                return pgiVar;
            case 460:
                pgiVar = new defpackage.kvl((rlv) this.a.fq.a());
                return pgiVar;
            case 461:
                defpackage.him himVar31 = this.a;
                pgiVar = new defpackage.kol(himVar31.my(), (nwu) himVar31.va.a(), himVar31.jC(), himVar31.oV(), (agsm) himVar31.aT.a(), himVar31.mZ(), (rlv) himVar31.fq.a());
                return pgiVar;
            case 462:
                defpackage.him himVar32 = this.a;
                pgiVar = new rsr((aoss) himVar32.cb.a(), himVar32.a.cn());
                return pgiVar;
            case 463:
                defpackage.him himVar33 = this.a;
                pgiVar = new defpackage.jde((android.content.Context) himVar33.s.a(), (isj) himVar33.vA.a(), himVar33.E(), himVar33.qS());
                return pgiVar;
            case 464:
                return new defpackage.lbz();
            case 465:
                defpackage.him himVar34 = this.a;
                pgiVar = new defpackage.mob(himVar34.qS(), himVar34.ps(), himVar34.iI);
                return pgiVar;
            case 466:
                return new unz(0);
            case 467:
                return new unz(1, (byte[]) null);
            case 468:
                return java.lang.Boolean.valueOf(((apnt) this.a.pz().a.a()).b("com.google.android.dialer", "enable_crosbycrosby_enable_delete_snackbar_with_undo").e());
            case 469:
                return new aaoo();
            case 470:
                return this.a.qc().h(zja.a("CallScreenSettingsCache", defpackage.lii.a).a());
            case 471:
                return java.lang.Long.valueOf(((apnt) this.a.pw().a.a()).b("com.google.android.dialer", "call_screen_activated_banner_duration_millis").b());
            case 472:
                defpackage.him himVar35 = this.a;
                pgiVar = new defpackage.ldq((android.content.Context) himVar35.s.a(), (ahzi) himVar35.jq.a(), (aogc) himVar35.iV.a(), himVar35.am(), (ldu) himVar35.gw(), (ajct) himVar35.L.a(), (ajct) himVar35.r.a(), himVar35.qD());
                return pgiVar;
            case 473:
                return java.lang.Long.valueOf(((apnt) this.a.pw().a.a()).b("com.google.android.dialer", "call_screen_voice_pack_download_timout_seconds").b());
            case 474:
                return java.lang.Boolean.valueOf(((apnt) this.a.pw().a.a()).b("com.google.android.dialer", "enable_call_screen_demo").e());
            case 475:
                return java.lang.Boolean.valueOf(((apnt) new xtq(this.a.a.a.aZ, (byte[]) null).a.a()).b("com.google.android.dialer", "hide_default_avatar_incall").e());
            case 476:
                return java.lang.Boolean.valueOf(((apnt) this.a.pJ().a.a()).b("com.google.android.dialer", "G__speak_easy_enable_listen_in_button").e());
            case 477:
                return java.lang.Long.valueOf(((apnt) this.a.a.de().a.a()).b("com.google.android.dialer.directboot", "45408669").b());
            case 478:
                return java.lang.Long.valueOf(((apnt) this.a.a.de().a.a()).b("com.google.android.dialer.directboot", "45408670").b());
            case 479:
                return java.lang.Boolean.valueOf(((apnt) this.a.ql().b.a()).b("com.google.android.dialer.directboot", "45795602").e());
            case 480:
                defpackage.him himVar36 = this.a;
                pgiVar = new defpackage.khe((agsm) himVar36.aT.a(), (android.content.Context) himVar36.s.a(), himVar36.aa(), himVar36.Z(), (lqz) himVar36.wa.a(), (aoss) himVar36.cb.a(), (rlv) himVar36.fq.a());
                return pgiVar;
            case 481:
                return java.lang.Boolean.valueOf(((apnt) this.a.ql().b.a()).b("com.google.android.dialer.directboot", "45842794").e());
            case 482:
                return java.lang.Boolean.valueOf(((apnt) this.a.ql().b.a()).b("com.google.android.dialer.directboot", "45852130").e());
            case 483:
                return java.lang.Long.valueOf(((apnt) this.a.a.a.aZ.a()).b("com.google.android.dialer", "min_phone_number_length_for_wait_time").b());
            case 484:
                defpackage.him himVar37 = this.a;
                kkuVar = new defpackage.mjk((android.content.Context) himVar37.s.a(), (ajct) himVar37.as.a(), (ajct) himVar37.r.a(), (oju) himVar37.Ga.a());
                return kkuVar;
            case 485:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.a.aZ.a()).b("com.google.android.dialer.directboot", "45743345").e());
            case 486:
                defpackage.him himVar38 = this.a;
                ajct ajctVar2 = (ajct) himVar38.r.a();
                agab agabVarRX = himVar38.rX();
                aogc aogcVar = (aogc) himVar38.fo.a();
                zzx zzxVarCp = himVar38.a.cp();
                pgiVar = new defpackage.mjm(ajctVar2, agabVarRX, aogcVar, zzxVarCp, (ojo) himVar38.oF.a(), himVar38.Gw);
                return pgiVar;
            case 487:
                defpackage.him himVar39 = this.a;
                defpackage.miy miyVar = defpackage.miy.VOICE;
                defpackage.hip hipVar7 = himVar39.a;
                zjm zjmVarH = zjm.h(hipVar7.ix);
                defpackage.miy miyVar2 = defpackage.miy.WAIT_TIME;
                zjm zjmVarH2 = zjm.h(hipVar7.iy);
                defpackage.him himVar40 = hipVar7.a;
                defpackage.miy miyVar3 = defpackage.miy.RTT;
                amyz amyzVar2 = hipVar7.iz;
                tcq tcqVarCb = himVar40.cb();
                j$.util.Objects.requireNonNull(tcqVarCb);
                return aigf.m(miyVar, zjmVarH, miyVar2, zjmVarH2, miyVar3, new zjm(amyzVar2, new tee(tcqVarCb, 1)));
            case 488:
                defpackage.him himVar41 = this.a;
                ajct ajctVar3 = (ajct) himVar41.r.a();
                defpackage.hip hipVar8 = himVar41.a;
                pgiVar = new vzk(ajctVar3, hipVar8.cz(), himVar41.oV(), hipVar8.ce(), (gpd) himVar41.fD.a(), (rlv) himVar41.fq.a(), himVar41.Gw, (defpackage.mkj) hipVar8.eO.a());
                return pgiVar;
            case 489:
                defpackage.him himVar42 = this.a;
                defpackage.hip hipVar9 = himVar42.a;
                amyz amyzVar3 = hipVar9.iu;
                android.content.Context context4 = (android.content.Context) himVar42.s.a();
                ajcu ajcuVar = (ajcu) himVar42.r.a();
                acxg acxgVarOV = himVar42.oV();
                midVar = new vzn(amyzVar3, context4, ajcuVar, acxgVarOV, hipVar9.ce(), himVar42.Gw, (defpackage.mkj) hipVar9.eO.a());
                return midVar;
            case 490:
                defpackage.him himVar43 = this.a;
                ajcu ajcuVar2 = (ajcu) himVar43.r.a();
                tcv tcvVar = (tcv) himVar43.Gx.a();
                defpackage.hip hipVar10 = himVar43.a;
                pgiVar = new tda(ajcuVar2, tcvVar, hipVar10.cz(), (gpd) himVar43.fD.a(), himVar43.oV(), himVar43.Gw, (defpackage.mkj) hipVar10.eO.a());
                return pgiVar;
            case 491:
                defpackage.him himVar44 = this.a;
                pgiVar = new rur((android.content.Context) himVar44.s.a(), (ajct) himVar44.L.a(), (ajct) himVar44.r.a(), (rlv) himVar44.fq.a(), himVar44.be());
                return pgiVar;
            case 492:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45852763").e());
            case 493:
                return java.lang.Boolean.valueOf(((apnt) this.a.sK().a.a()).b("com.google.android.dialer.directboot", "45840874").e());
            case 494:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.a.aZ.a()).b("com.google.android.dialer.directboot", "45781765").e());
            case 495:
                return java.lang.Boolean.valueOf(((apnt) this.a.py().b.a()).b("com.google.android.dialer.directboot", "45825909").e());
            case 496:
                return java.lang.Boolean.valueOf(((apnt) this.a.py().b.a()).b("com.google.android.dialer.directboot", "45858063").e());
            case 497:
                return this.a.qc().h(zja.a("InAppReview", defpackage.orz.a).a());
            case 498:
                return java.lang.Long.valueOf(((apnt) this.a.qA().a.a()).b("com.google.android.dialer", "interval_for_in_app_review_days").b());
            case 499:
                return java.lang.Boolean.valueOf(((apnt) this.a.sc().a.a()).b("com.google.android.dialershared.directboot", "45833188").e());
            default:
                throw new java.lang.AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r8v101, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v111, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v128, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v137, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v165, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v187, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v195, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v202, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v209, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v21, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v245, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v256, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v283, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v293, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v303, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v311, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v336, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v346, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v354, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v37, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v377, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v385, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v393, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v401, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v408, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v415, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v422, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v429, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v436, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v444, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v454, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v462, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v47, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v471, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v479, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v500, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v510, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v520, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v528, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v536, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v543, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v56, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v560, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v574, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v604, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v64, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v72, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v80, types: [aoin, java.lang.Object] */
    private final java.lang.Object g() {
        rsr rdpVar;
        acow ucmVar;
        zlr aljfVar;
        vqy vqyVar;
        int i = this.b;
        switch (i) {
            case 500:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.a.aZ.a()).b("com.google.android.dialer.directboot", "45849222").e());
            case 501:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.a.aZ.a()).b("com.google.android.dialer.directboot", "45853407").e());
            case 502:
                return java.lang.Boolean.valueOf(((apnt) this.a.sb().a.a()).b("com.google.android.dialer.directboot", "45860911").e());
            case 503:
                defpackage.him himVar = this.a;
                rdpVar = new rdp((zpm) himVar.fn.a(), (gpd) himVar.fD.a(), (aoss) himVar.cb.a(), himVar.EK);
                return rdpVar;
            case 504:
                defpackage.him himVar2 = this.a;
                rdpVar = new pgi((zpm) himVar2.fn.a(), (gpd) himVar2.fD.a());
                return rdpVar;
            case 505:
                return java.lang.Boolean.valueOf(((apnt) new vqf(this.a.a.a.aZ, (byte[]) null).a.a()).b("com.google.android.dialer.directboot", "45793027").e());
            case 506:
                return java.lang.Boolean.valueOf(((apnt) new ajyi(this.a.a.a.aZ).a.a()).b("com.google.android.dialer.directboot", "45838844").e());
            case 507:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.cM().a.a()).b("com.google.android.dialer.directboot", "45848381").e());
            case 508:
                return java.lang.Boolean.valueOf(((apnt) this.a.pI().a.a()).b("com.google.android.dialer", "G__enable_emergency_buttons_in_emergency_rtt_chat").e());
            case 509:
                return java.lang.Boolean.valueOf(((apnt) this.a.qH().a.a()).b("com.google.android.dialer.directboot", "45723737").e());
            case 510:
                return java.lang.Boolean.valueOf(((apnt) this.a.qH().a.a()).b("com.google.android.dialer.directboot", "45848836").e());
            case 511:
                return this.a.a.bg().b(qtl.c);
            case 512:
                return this.a.a.bg().b(qtl.a);
            case 513:
                return this.a.a.bg().b(qtl.b);
            case 514:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.cQ().a.a()).b("com.google.android.dialer.directboot", "45408452").e());
            case 515:
                return java.lang.Long.valueOf(((apnt) new vqu(this.a.a.a.aZ, (byte[]) null).a.a()).b("com.google.android.dialer.directboot", "45618349").b());
            case 516:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.a.aZ.a()).b("com.google.android.dialer.directboot", "45585412").e());
            case 517:
                return java.lang.Long.valueOf(((apnt) this.a.a.cN().a.a()).b("com.google.android.dialer.directboot", "45739034").b());
            case 518:
                return java.lang.Boolean.valueOf(((apnt) new vqu(this.a.a.a.aZ, (byte[]) null).a.a()).b("com.google.android.dialer.directboot", "45820359").e());
            case 519:
                rdpVar = new tcr((tkl) this.a.a.je.a(), 1);
                return rdpVar;
            case 520:
                defpackage.him himVar3 = this.a;
                rdpVar = new tkl((ajct) himVar3.L.a(), (opx) himVar3.a.hO.a(), (kjr) himVar3.pn.a());
                return rdpVar;
            case 521:
                rdpVar = new nyb((aogc) this.a.a.jg.a());
                return rdpVar;
            case 522:
                defpackage.him himVar4 = this.a;
                rdpVar = new aogc(amyu.b(himVar4.va), (ajct) himVar4.r.a());
                return rdpVar;
            case 523:
                rdpVar = new tcr(this.a.sY(), 0);
                return rdpVar;
            case 524:
                return java.lang.Boolean.valueOf(((apnt) this.a.qk().b.a()).b("com.google.android.dialer.directboot", "45857416").e());
            case 525:
                rdpVar = new kih(this.a.a.co());
                return rdpVar;
            case 526:
                rdpVar = new jyi(this.a.a.cn());
                return rdpVar;
            case 527:
                defpackage.him himVar5 = this.a;
                defpackage.hip hipVar = himVar5.a;
                rdpVar = new kal(hipVar.l(), (kai) hipVar.jm.a(), himVar5.mZ(), (aoss) himVar5.cb.a());
                return rdpVar;
            case 528:
                defpackage.him himVar6 = this.a;
                rdpVar = new kai(himVar6.nu(), himVar6.mZ(), himVar6.pn, (aoss) himVar6.cb.a());
                return rdpVar;
            case 529:
                return java.lang.Boolean.valueOf(((apnt) this.a.qk().b.a()).b("com.google.android.dialer.directboot", "45853076").e());
            case 530:
                return java.lang.Long.valueOf(((apnt) this.a.qk().b.a()).b("com.google.android.dialer.directboot", "45809607").b());
            case 531:
                return java.lang.Long.valueOf(((apnt) this.a.qk().b.a()).b("com.google.android.dialer.directboot", "45809608").b());
            case 532:
                return java.lang.Long.valueOf(((apnt) this.a.rH().a.a()).b("com.google.android.dialer.directboot", "45647184").b());
            case 533:
                defpackage.him himVar7 = this.a;
                android.content.Context context = (android.content.Context) himVar7.s.a();
                defpackage.hip hipVar2 = himVar7.a;
                java.lang.Object objA = hipVar2.jt.a();
                ajct ajctVar = (ajct) himVar7.L.a();
                rdpVar = new abtr(context, (ucm) objA, ajctVar, hipVar2.jv, (apjb) hipVar2.jw.a());
                return rdpVar;
            case 534:
                defpackage.him himVar8 = this.a;
                ajcu ajcuVar = (ajcu) himVar8.r.a();
                defpackage.hip hipVar3 = himVar8.a;
                zoe zoeVarCy = hipVar3.cy();
                ucmVar = new ucm(ajcuVar, zoeVarCy, hipVar3.js, (byte[]) null);
                return ucmVar;
            case 535:
                return this.a.a.ao();
            case 536:
                return new aaoo();
            case 537:
                return new aaoo();
            case 538:
                defpackage.him himVar9 = this.a;
                android.content.Context context2 = (android.content.Context) himVar9.a.a.s.a();
                acxg acxgVar = aals.a;
                rdpVar = new apjb(new aawd(context2), (java.util.concurrent.Executor) himVar9.r.a());
                return rdpVar;
            case 539:
                defpackage.him himVar10 = this.a;
                android.content.Context context3 = (android.content.Context) himVar10.s.a();
                ajcu ajcuVar2 = (ajcu) himVar10.r.a();
                defpackage.hip hipVar4 = himVar10.a;
                aljfVar = new aljf(context3, ajcuVar2, (ucm) hipVar4.jt.a(), (apjb) hipVar4.jw.a());
                return aljfVar;
            case 540:
                return java.lang.Boolean.valueOf(((apnt) new vqu(this.a.a.a.aZ, (byte[]) null).a.a()).b("com.google.android.dialer.directboot", "45461963").e());
            case 541:
                defpackage.him himVar11 = this.a;
                rdpVar = new defpackage.mvj((android.content.Context) himVar11.s.a(), (nri) himVar11.py.a(), himVar11.aK(), (aazc) himVar11.l.a(), (rlv) himVar11.fq.a(), himVar11.a.jA);
                return rdpVar;
            case 542:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.db().a.a()).b("com.google.android.dialer.directboot", "45831998").e());
            case 543:
                defpackage.him himVar12 = this.a;
                rdpVar = new defpackage.mvf((android.content.Context) himVar12.s.a(), himVar12.aK(), (aoss) himVar12.cb.a(), himVar12.aH(), (rlv) himVar12.fq.a(), himVar12.aL(), himVar12.a.jA);
                return rdpVar;
            case 544:
                defpackage.him himVar13 = this.a;
                rdpVar = new defpackage.mvd((android.content.Context) himVar13.s.a(), himVar13.aK(), (aoss) himVar13.cb.a(), himVar13.aH(), (rlv) himVar13.fq.a(), himVar13.aL(), himVar13.a.jA);
                return rdpVar;
            case 545:
                defpackage.him himVar14 = this.a;
                rdpVar = new defpackage.mup((android.content.Context) himVar14.s.a(), himVar14.re(), himVar14.aH(), himVar14.aK(), (rlv) himVar14.fq.a(), himVar14.aL(), himVar14.a.jA);
                return rdpVar;
            case 546:
                defpackage.him himVar15 = this.a;
                rdpVar = new ovu((android.content.Context) himVar15.s.a(), himVar15.re(), (rlv) himVar15.fq.a(), himVar15.bn(), himVar15.nl());
                return rdpVar;
            case 547:
                defpackage.him himVar16 = this.a;
                rdpVar = new defpackage.jat((android.content.Context) himVar16.s.a(), himVar16.re(), (rlv) himVar16.fq.a(), (jbm) himVar16.eW.a());
                return rdpVar;
            case 548:
                defpackage.him himVar17 = this.a;
                rdpVar = new defpackage.jao((android.content.Context) himVar17.s.a(), himVar17.re(), (rlv) himVar17.fq.a(), (zjs) himVar17.cn.a(), himVar17.nU(), (jbm) himVar17.eW.a());
                return rdpVar;
            case 549:
                defpackage.him himVar18 = this.a;
                rdpVar = new defpackage.jar((android.content.Context) himVar18.s.a(), himVar18.re(), (rlv) himVar18.fq.a(), (zjs) himVar18.cn.a(), himVar18.nU(), (jbm) himVar18.eW.a());
                return rdpVar;
            case 550:
                defpackage.him himVar19 = this.a;
                rdpVar = new sby((android.content.Context) himVar19.s.a(), himVar19.re(), himVar19.bA(), (rlv) himVar19.fq.a(), himVar19.a.jA);
                return rdpVar;
            case 551:
                return java.lang.Boolean.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45723945").e());
            case 552:
                defpackage.him himVar20 = this.a;
                rdpVar = new sca((android.content.Context) himVar20.s.a(), (rlv) himVar20.fq.a(), himVar20.bA(), himVar20.re(), himVar20.a.jA);
                return rdpVar;
            case 553:
                return java.lang.Boolean.valueOf(((apnt) this.a.qy().a.a()).b("com.google.android.dialer.directboot", "45738337").e());
            case 554:
                defpackage.him himVar21 = this.a;
                android.content.Context context4 = (android.content.Context) himVar21.s.a();
                aogc aogcVar = (aogc) himVar21.kz.a();
                ipc ipcVarRe = himVar21.re();
                aoss aossVar = (aoss) himVar21.cb.a();
                rlv rlvVar = (rlv) himVar21.fq.a();
                defpackage.hip hipVar5 = himVar21.a;
                rdpVar = new tmc(context4, aogcVar, ipcVarRe, aossVar, rlvVar, hipVar5.jA, hipVar5.jN);
                return rdpVar;
            case 555:
                return java.lang.Boolean.valueOf(((apnt) this.a.qy().a.a()).b("com.google.android.dialer.directboot", "45841628").e());
            case 556:
                return java.lang.Boolean.valueOf(((apnt) this.a.qy().a.a()).b("com.google.android.dialer.directboot", "45774653").e());
            case 557:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.a.aZ.a()).b("com.google.android.dialer.directboot", "45755904").e());
            case 558:
                defpackage.him himVar22 = this.a;
                rdpVar = new uzk((android.content.Context) himVar22.s.a(), (rlv) himVar22.fq.a());
                return rdpVar;
            case 559:
                return this.a.qc().h(zja.b("MarqueeStorageData", ttj.aa(rtl.a.m()).aP(), (java.lang.Iterable) null, (aonj) null, 12));
            case 560:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.db().a.a()).b("com.google.android.dialer.directboot", "45837052").e());
            case 561:
                return java.lang.Boolean.valueOf(((apnt) new ajyi(this.a.a.a.aZ).a.a()).b("com.google.android.dialer.directboot", "45859552").e());
            case 562:
                return java.lang.Boolean.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45838548").e());
            case 563:
                defpackage.hip hipVar6 = this.a.a;
                ucmVar = new acow(hipVar6.jW, hipVar6.jX, hipVar6.ha);
                return ucmVar;
            case 564:
                rdpVar = new afpl((vaa) this.a.a.gZ.a());
                return rdpVar;
            case 565:
                return ((afpl) this.a.a.jW.a()).a;
            case 566:
                return java.lang.Boolean.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45769243").e());
            case 567:
                return java.lang.Boolean.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45825304").e());
            case 568:
                return java.lang.Boolean.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45706229").e());
            case 569:
                return java.lang.Long.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45714031").b());
            case 570:
                return java.lang.Long.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45714057").b());
            case 571:
                return java.lang.Long.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45714058").b());
            case 572:
                return java.lang.Long.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45813912").b());
            case 573:
                return java.lang.Long.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45714032").b());
            case 574:
                return java.lang.Boolean.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45808576").e());
            case 575:
                return java.lang.Boolean.valueOf(((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45823302").e());
            case 576:
                return java.lang.Boolean.valueOf(((apnt) new vaa(this.a.a.a.aZ, (byte[]) null).a.a()).b("com.google.android.dialer.directboot", "45841056").e());
            case 577:
                return java.lang.Double.valueOf(((apnt) this.a.qA().a.a()).b("com.google.android.dialer", "post_call_in_app_review_probability").a());
            case 578:
                defpackage.him himVar23 = this.a;
                aljfVar = new sya((ajct) himVar23.L.a(), (ajct) himVar23.r.a(), himVar23.qD(), himVar23.et());
                return aljfVar;
            case 579:
                return java.lang.Boolean.valueOf(((apnt) this.a.pS().a.a()).b("com.google.android.dialer", "show_tty_setting").e());
            case 580:
                return java.lang.Boolean.valueOf(((apnt) this.a.qy().a.a()).b("com.google.android.dialer.directboot", "45843363").e());
            case 581:
                ahkl ahklVarA = ahkm.a();
                ahklVarA.a = "FavoritesBarContactsCache";
                ahklVarA.c(aais.aL(unv.a.m()).s());
                return this.a.qc().h(ahklVarA.a());
            case 582:
                ahkl ahklVarA2 = ahkm.a();
                ahklVarA2.a = "FavoritesBarSettings";
                ahklVarA2.c(aais.aM(unq.a.m()).v());
                return this.a.qc().h(ahklVarA2.a());
            case 583:
                rdpVar = new rsr((tvd) this.a.a.ax());
                return rdpVar;
            case 584:
                return java.lang.Boolean.valueOf(((apnt) new tvn(this.a.a.a.aZ, (byte[]) null).a.a()).b("com.google.android.dialer.directboot", "45843465").e());
            case 585:
                return java.lang.Boolean.valueOf(((apnt) new tvn(this.a.a.a.aZ, (byte[]) null).a.a()).b("com.google.android.dialer.directboot", "45852008").e());
            case 586:
                return java.lang.Boolean.valueOf(((apnt) new tvn(this.a.a.a.aZ, (byte[]) null).a.a()).b("com.google.android.dialer.directboot", "45852133").e());
            case 587:
                return java.lang.Boolean.valueOf(((apnt) this.a.ru().a.a()).b("com.google.android.dialer", "unified_feedback_show_additional_feedback_description").e());
            case 588:
                java.lang.String strD = ((apnt) this.a.ru().a.a()).b("com.google.android.dialer", "unified_feedback_google_help_context_string").d();
                aooc.ap(strD);
                return strD;
            case 589:
                java.lang.String strD2 = ((apnt) this.a.ru().a.a()).b("com.google.android.dialer", "unified_feedback_google_help_fallback_uri").d();
                aooc.ap(strD2);
                return strD2;
            case 590:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.a.aZ.a()).b("com.google.android.dialer.directboot", "45788627").e());
            case 591:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.cZ().a.a()).b("com.google.android.dialer.directboot", "45857505").e());
            case 592:
                defpackage.him himVar24 = this.a;
                return himVar24.pX().t(zte.a("VisualVoicemailFragmentModelCacheData", vts.a).a(), (aogc) himVar24.bq.a());
            case 593:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.df().a.a()).b("com.google.android.dialer.directboot", "45856492").e());
            case 594:
                defpackage.him himVar25 = this.a;
                android.content.Context context5 = (android.content.Context) himVar25.s.a();
                defpackage.hip hipVar7 = himVar25.a;
                vqyVar = new vqy(context5, hipVar7.aE(), (vud) hipVar7.kB.a());
                return vqyVar;
            case 595:
                defpackage.him himVar26 = this.a;
                vqyVar = new vud((android.content.Context) himVar26.s.a(), (vvb) himVar26.a.aE(), (rlv) himVar26.fq.a());
                return vqyVar;
            case 596:
                defpackage.him himVar27 = this.a;
                android.content.Context context6 = (android.content.Context) himVar27.s.a();
                defpackage.hip hipVar8 = himVar27.a;
                amyz amyzVar = hipVar8.kB;
                java.lang.Object objAE = hipVar8.aE();
                vvb vvbVar = (vvb) objAE;
                aljfVar = new zlr(context6, vvbVar, (vud) amyzVar.a(), (rlv) himVar27.fq.a());
                return aljfVar;
            case 597:
                defpackage.him himVar28 = this.a;
                android.content.Context context7 = (android.content.Context) himVar28.s.a();
                defpackage.hip hipVar9 = himVar28.a;
                java.lang.Object objA2 = hipVar9.kB.a();
                aljfVar = new zlr(context7, (vud) objA2, (vvb) hipVar9.aE(), (rlv) himVar28.fq.a());
                return aljfVar;
            case 598:
                defpackage.him himVar29 = this.a;
                android.content.Context context8 = (android.content.Context) himVar29.s.a();
                defpackage.hip hipVar10 = himVar29.a;
                vqyVar = new vqy(context8, (vud) hipVar10.kB.a(), (vvb) hipVar10.aE());
                return vqyVar;
            case 599:
                return java.lang.Boolean.valueOf(((apnt) this.a.a.df().a.a()).b("com.google.android.dialer.directboot", "45850051").e());
            default:
                throw new java.lang.AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v166, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v183, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v225, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v73, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v80, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v87, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v94, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final java.lang.Object a() {
        boolean zE;
        long jB;
        pex hubVar;
        wcw zuyVar;
        int i = this.b;
        int i2 = i / 100;
        if (i2 == 0) {
            return b();
        }
        if (i2 == 1) {
            return c();
        }
        if (i2 == 2) {
            return d();
        }
        if (i2 == 3) {
            return e();
        }
        if (i2 == 4) {
            return f();
        }
        if (i2 == 5) {
            return g();
        }
        switch (i) {
            case 600:
                zE = ((apnt) this.a.a.df().a.a()).b("com.google.android.dialer.directboot", "45855932").e();
                return java.lang.Boolean.valueOf(zE);
            case 601:
                zE = ((apnt) this.a.a.a.aZ.a()).b("com.google.android.dialer", "G__enable_archived_vvm").e();
                return java.lang.Boolean.valueOf(zE);
            case 602:
                ahko ahkoVarA = zte.a("VoicemailUiPreferences", vvn.a).a();
                defpackage.him himVar = this.a;
                return himVar.pX().t(ahkoVarA, (aogc) himVar.bq.a());
            case 603:
                zE = ((apnt) this.a.sp().a.a()).b("com.google.android.dialer.directboot", "45665339").e();
                return java.lang.Boolean.valueOf(zE);
            case 604:
                zE = ((apnt) this.a.a.cZ().a.a()).b("com.google.android.dialer.directboot", "45821891").e();
                return java.lang.Boolean.valueOf(zE);
            case 605:
                java.lang.String strD = ((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417221").d();
                aooc.ap(strD);
                return strD;
            case 606:
                jB = ((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417192").b();
                return java.lang.Long.valueOf(jB);
            case 607:
                zE = ((apnt) this.a.sj().a.a()).b("com.google.android.dialer.directboot", "45417224").e();
                return java.lang.Boolean.valueOf(zE);
            case 608:
                zE = ((apnt) this.a.rb().a.a()).b("com.google.android.dialer.directboot", "45646893").e();
                return java.lang.Boolean.valueOf(zE);
            case 609:
                java.lang.String strD2 = ((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413175").d();
                aooc.ap(strD2);
                return strD2;
            case 610:
                java.lang.String strD3 = ((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413176").d();
                aooc.ap(strD3);
                return strD3;
            case 611:
                java.lang.String strD4 = ((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413178").d();
                aooc.ap(strD4);
                return strD4;
            case 612:
                jB = ((apnt) this.a.ph().a.a()).b("com.google.android.dialer.directboot", "45413190").b();
                return java.lang.Long.valueOf(jB);
            case 613:
                defpackage.him himVar2 = this.a;
                return new defpackage.mtp((android.content.Context) himVar2.s.a(), himVar2.aF(), (rlv) himVar2.fq.a(), j$.util.Optional.of(new wsc((byte[]) null)), himVar2.mH(), himVar2.iI, himVar2.Es);
            case 614:
                defpackage.him himVar3 = this.a;
                hubVar = new defpackage.hub((android.content.Context) himVar3.s.a(), (java.util.concurrent.Executor) himVar3.r.a(), (aolr) himVar3.ca.a(), (xtq) himVar3.a.kU.a());
                return hubVar;
            case 615:
                android.content.Context context = (android.content.Context) this.a.s.a();
                aooh.f(context, "context");
                ahvr.bZ(context != null, "Missing call to setContext()");
                j$.util.Optional optionalEmpty = j$.util.Optional.empty();
                j$.util.Optional optionalEmpty2 = j$.util.Optional.empty();
                j$.util.Optional optionalEmpty3 = j$.util.Optional.empty();
                j$.util.Optional.empty();
                j$.util.Optional.empty();
                j$.util.Optional.empty();
                j$.util.Optional optionalOf = j$.util.Optional.of(new aknx());
                aooh.f(context, "context");
                defpackage.akxk akxkVar = new defpackage.akxk();
                aooh.f(context, "context");
                aooh.f(context, "<set-?>");
                akxkVar.b = context;
                java.util.List list = zzd.m;
                zza zzaVar = new zza(context, "ON_DEVICE_POLICY");
                ((zyw) zzaVar).f = new akxl(0);
                akxkVar.a = zzaVar.b();
                java.lang.String packageName = context.getPackageName();
                aooh.e(packageName, "getPackageName(...)");
                aooh.f(packageName, "packageName");
                aooh.f(packageName, "<set-?>");
                akxkVar.c = packageName;
                akxkVar.d = new defpackage.fed(19);
                if (akxkVar.b == null) {
                    throw new java.lang.IllegalStateException("context is required");
                }
                if (akxkVar.a == null) {
                    throw new java.lang.IllegalStateException("clearcutLogger is required");
                }
                if (akxkVar.c == null) {
                    throw new java.lang.IllegalStateException("packageName is required");
                }
                j$.util.Optional optionalOf2 = j$.util.Optional.of(new akxm(akxkVar));
                j$.util.Optional optionalOf3 = j$.util.Optional.of(java.util.concurrent.Executors.newSingleThreadExecutor());
                optionalEmpty.isPresent();
                optionalEmpty3.isPresent();
                optionalEmpty2.isPresent();
                optionalOf.isPresent();
                optionalOf.get();
                optionalOf3.isPresent();
                ?? r1 = optionalOf3.get();
                aihd aihdVar = akwz.a;
                akxy akxyVar = akxy.g;
                akxa akxaVar = new akxa(akxyVar);
                akxy akxyVar2 = akxy.h;
                akxa akxaVar2 = new akxa(akxyVar2);
                akxy akxyVar3 = akxy.i;
                akxa akxaVar3 = new akxa(akxyVar3);
                akxy akxyVar4 = akxy.j;
                akxa akxaVar4 = new akxa(akxyVar4);
                akxy akxyVar5 = akxy.k;
                akxa akxaVar5 = new akxa(akxyVar5);
                akxy akxyVar6 = akxy.o;
                akxi akxiVar = new akxi(akxyVar6);
                akxy akxyVar7 = akxy.p;
                akxi akxiVar2 = new akxi(akxyVar7);
                aigb aigbVar = new aigb(4);
                aigbVar.i(akxyVar, akxaVar);
                aigbVar.i(akxyVar2, akxaVar2);
                aigbVar.i(akxyVar3, akxaVar3);
                aigbVar.i(akxyVar4, akxaVar4);
                aigbVar.i(akxyVar5, akxaVar5);
                aigbVar.i(akxyVar6, akxiVar);
                aigbVar.i(akxyVar7, akxiVar2);
                return new xtq(new akwz(aigbVar.e(true), (java.util.concurrent.Executor) r1, optionalOf2));
            case 616:
                zE = ((apnt) this.a.a.a.aZ.a()).b("com.google.android.dialer.directboot", "45862505").e();
                return java.lang.Boolean.valueOf(zE);
            case 617:
                hubVar = new ahzh(ahwr.a);
                return hubVar;
            case 618:
                defpackage.him himVar4 = this.a;
                java.util.Map map = (java.util.Map) himVar4.a.kZ.a();
                ahpz ahpzVar = (ahpz) himVar4.bb.a();
                aigb aigbVar2 = new aigb(4);
                for (java.util.Map.Entry entry : map.entrySet()) {
                    aigbVar2.i((java.lang.String) entry.getKey(), new defpackage.jhx(ahpzVar, entry, 20, null));
                }
                return new akcl(aigbVar2.e(true));
            case 619:
                return aigf.k("com.google.android.libraries.dialer.patrick.account.CallingCardAccountGrpcService", this.a.a.kY);
            case 620:
                defpackage.him himVar5 = this.a;
                hubVar = new rxt((aolr) himVar5.ca.a(), himVar5.bD());
                return hubVar;
            case 621:
                ahpz ahpzVar2 = (ahpz) this.a.bb.a();
                ahwt ahwtVar = ahwt.a;
                aift aiftVar = new aift(4);
                aiftVar.i((anqn) ahwtVar.c(new ahiw(ahpzVar2, 17)));
                aify aifyVarH = aiftVar.h();
                aooc.ap(aifyVarH);
                return aifyVarH;
            case 622:
                zE = ((apnt) this.a.a.a.aZ.a()).b("com.google.android.dialer", "enable_remote_actions_service").e();
                return java.lang.Boolean.valueOf(zE);
            case 623:
                defpackage.him himVar6 = this.a;
                ruc rucVar = (ruc) himVar6.eK.a();
                return new wur(rucVar);
            case 624:
                zE = ((apnt) this.a.qM().a.a()).b("com.google.android.dialershared.directboot", "45422467").e();
                return java.lang.Boolean.valueOf(zE);
            case 625:
                zE = ((apnt) this.a.a.a.aZ.a()).b("com.google.android.dialer.directboot", "45383868").e();
                return java.lang.Boolean.valueOf(zE);
            case 626:
                zE = ((apnt) this.a.sE().a.a()).b("com.google.android.dialer.directboot", "45410247").e();
                return java.lang.Boolean.valueOf(zE);
            case 627:
                defpackage.him himVar7 = this.a;
                hubVar = new zlr((zpm) himVar7.fn.a(), (afpl) himVar7.Oz.a(), (aoss) himVar7.cb.a(), (apni) himVar7.eY.a());
                return hubVar;
            case 628:
                defpackage.him himVar8 = this.a;
                zuyVar = new zuy((android.content.Context) himVar8.s.a(), (ajct) himVar8.as.a());
                return zuyVar;
            case 629:
                defpackage.him himVar9 = this.a;
                zuyVar = new wcw((zjs) himVar9.cn.a(), (ajct) himVar9.as.a());
                return zuyVar;
            case 630:
                defpackage.hip hipVar = this.a.a;
                j$.util.Optional optionalOf4 = j$.util.Optional.of(hipVar.v());
                aooh.f(optionalOf4, "serviceIntegrationClientEnabledFn");
                return new aile(new zjm(hipVar.lo, new yvz(optionalOf4, 5)));
            case 631:
                hubVar = new zjh(new zzx(this.a.a.ln));
                return hubVar;
            case 632:
                defpackage.him himVar10 = this.a;
                zjc zjcVar = zjc.b;
                defpackage.hip hipVar2 = himVar10.a;
                defpackage.him himVar11 = hipVar2.a;
                return aigf.l(zjcVar, new zjm(hipVar2.lk, new defpackage.jer(himVar11.H(), 13)), zjc.c, new zjm(new ozw(hipVar2.lm, 2), new pes(new per(himVar11.NV), 0)));
            case 633:
                defpackage.him himVar12 = this.a;
                aogc aogcVarTd = himVar12.td();
                kgl kglVar = (kgl) himVar12.pv.a();
                aolr aolrVar = (aolr) himVar12.bY.a();
                defpackage.him himVar13 = himVar12.a.a;
                hubVar = new defpackage.jhu(aogcVarTd, kglVar, aolrVar, new izg(himVar13.nB(), (android.content.Context) himVar13.s.a(), (aolr) himVar13.bg.a()), himVar12.Ka, himVar12.E(), (rlv) himVar12.fq.a());
                return hubVar;
            case 634:
                defpackage.him himVar14 = this.a;
                zpm zpmVar = (zpm) himVar14.fn.a();
                defpackage.hip hipVar3 = himVar14.a;
                defpackage.him himVar15 = hipVar3.a;
                hubVar = new pex(zpmVar, new defpackage.orx((android.content.Context) himVar15.s.a(), (aolr) himVar15.bg.a(), (ojo) himVar15.oF.a(), (aazc) himVar15.l.a(), hipVar3.ll), (rlv) himVar14.fq.a(), (android.content.Context) himVar14.s.a());
                return hubVar;
            case 635:
                jB = ((apnt) this.a.ra().a.a()).b("com.google.android.dialer.directboot", "45760888").b();
                return java.lang.Long.valueOf(jB);
            case 636:
                return new anrq(true);
            default:
                throw new java.lang.AssertionError(i);
        }
    }
}
