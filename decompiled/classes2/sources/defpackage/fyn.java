package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fyn extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyn(defpackage.agx agxVar, defpackage.agy agyVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = agxVar;
        this.a = agyVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 1:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 2:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 3:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 4:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 5:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 6:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 7:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 8:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 9:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 10:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 11:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 12:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 16:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            default:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
    }

    /* JADX WARN: Type inference failed for: r12v87, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v93, types: [boolean, int] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.String str;
        ipb ipbVar;
        boolean z = false;
        android.net.ConnectivityManager connectivityManager = null;
        switch (this.$cid) {
            case 0:
                aooc.af(obj);
                gca gcaVar = (gca) this.a;
                gbo gboVar = gcaVar.b;
                gbo gboVar2 = gcaVar.a;
                aooh.f(gboVar, "<this>");
                gbo gboVar3 = gboVar;
                defpackage.es esVarA = defpackage.ev.a(new defpackage.gcs(gboVar, gboVar2, gboVar3.b, gboVar2.b));
                aopp aoppVarA = aooc.C(0, gboVar3.b).a();
                while (aoppVarA.a) {
                    if (esVarA.a(aoppVarA.a()) != -1) {
                        z = true;
                        return new akwb(esVarA, z);
                    }
                }
                return new akwb(esVarA, z);
            case 1:
                aooc.af(obj);
                defpackage.agx agxVar = (defpackage.agx) this.b;
                if (agxVar.g.f()) {
                    agxVar.b.f.i(agxVar.a);
                }
                return aojh.a;
            case 2:
                aooc.af(obj);
                java.lang.Object obj2 = this.a;
                java.lang.Object obj3 = this.b;
                ahoq ahoqVarW = ahvr.W(35, "CarInCallController_displayAccountSelector");
                try {
                    defpackage.uc ucVar = ((defpackage.hnm) obj3).h;
                    if (ucVar.a() instanceof defpackage.hoy) {
                        defpackage.hnm.a.b().l("com/android/dialer/androidauto/impl/incall/CarInCallController", "displayAccountSelector$<anonymous>$<anonymous>", 343, "CarInCallController.kt").v("Not showing selector as it is presented");
                    } else {
                        if (!((defpackage.hnm) obj3).k()) {
                            defpackage.hnm.a.b().l("com/android/dialer/androidauto/impl/incall/CarInCallController", "displayAccountSelector$<anonymous>$<anonymous>", 346, "CarInCallController.kt").v("Pushing in-call screen before account selector");
                            ucVar.e(((defpackage.hnm) obj3).a());
                        }
                        rai raiVar = ((defpackage.hnm) obj3).u;
                        defpackage.tt ttVar = ((defpackage.hnm) obj3).b;
                        defpackage.him himVar = ((defpackage.hio) raiVar.a).a;
                        defpackage.hoy hoyVar = new defpackage.hoy(ttVar, (defpackage.hoz) obj2, (rlv) himVar.fq.a(), (zpm) himVar.fn.a());
                        hoyVar.c = "inCall_accountSelector";
                        ucVar.e(hoyVar);
                        ((defpackage.hnm) obj3).q.i((java.lang.String) null).b(mce.gD);
                    }
                    ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
                    return aojh.a;
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        ajsz.ak(ahoqVarW, th);
                        throw th2;
                    }
                }
            case 3:
                aooc.af(obj);
                defpackage.hnm.a.b().l("com/android/dialer/androidauto/impl/incall/CarInCallController", "displayCallError$<anonymous>", 313, "CarInCallController.kt").v("Creating and pushing call error screen.");
                defpackage.hnm hnmVar = (defpackage.hnm) this.b;
                defpackage.uc ucVar2 = hnmVar.h;
                java.util.Collection<defpackage.ub> collectionB = ucVar2.b();
                if (collectionB.isEmpty()) {
                    rai raiVar2 = hnmVar.v;
                    defpackage.tt ttVar2 = hnmVar.b;
                    java.lang.Object obj4 = this.a;
                    defpackage.him himVar2 = ((defpackage.hio) raiVar2.a).a;
                    defpackage.hpr hprVar = new defpackage.hpr(ttVar2, (java.lang.String) obj4, (ipc) himVar2.EC.a(), (rlv) himVar2.fq.a());
                    hprVar.c = "googleDialerCallerror";
                    ucVar2.e(hprVar);
                } else {
                    for (defpackage.ub ubVar : collectionB) {
                        if (ubVar == null || (str = ubVar.c) == null || !str.equals("googleDialerCallerror")) {
                        }
                    }
                    rai raiVar3 = hnmVar.v;
                    defpackage.tt ttVar3 = hnmVar.b;
                    java.lang.Object obj5 = this.a;
                    defpackage.him himVar3 = ((defpackage.hio) raiVar3.a).a;
                    defpackage.hpr hprVar2 = new defpackage.hpr(ttVar3, (java.lang.String) obj5, (ipc) himVar3.EC.a(), (rlv) himVar3.fq.a());
                    hprVar2.c = "googleDialerCallerror";
                    ucVar2.e(hprVar2);
                }
                return aojh.a;
            case 4:
                aooc.af(obj);
                java.lang.Object obj6 = this.a;
                ahoq ahoqVarW2 = ahvr.W(75, "TabTemplateConverter_logCuisOnTabTemplateCreation");
                try {
                    defpackage.hqh hqhVar = ((defpackage.hqp) obj6).f;
                    java.lang.Object obj7 = this.b;
                    if (hqhVar != obj7) {
                        int iOrdinal = ((defpackage.hqh) obj7).ordinal();
                        if (iOrdinal == 1) {
                            ((defpackage.hqp) obj6).c.o(rmx.qq);
                            ((defpackage.hqp) obj6).g.i((java.lang.String) null).b(mce.gr);
                        } else if (iOrdinal == 2) {
                            ((defpackage.hqp) obj6).c.o(rmx.qr);
                            ((defpackage.hqp) obj6).g.i((java.lang.String) null).b(mce.gt);
                        } else if (iOrdinal == 3) {
                            ((defpackage.hqp) obj6).c.o(rmx.qs);
                            ((defpackage.hqp) obj6).g.i((java.lang.String) null).b(mce.gv);
                        } else {
                            if (iOrdinal != 4) {
                                throw new java.lang.IllegalStateException(a.bh(obj7, "Invalid tab: "));
                            }
                            ((defpackage.hqp) obj6).c.o(rmx.qt);
                            ((defpackage.hqp) obj6).g.i((java.lang.String) null).b(mce.gx);
                        }
                        ((defpackage.hqp) obj6).f = (defpackage.hqh) obj7;
                    }
                    ajsz.ak(ahoqVarW2, (java.lang.Throwable) null);
                    return aojh.a;
                } catch (java.lang.Throwable th3) {
                    try {
                        throw th3;
                    } catch (java.lang.Throwable th4) {
                        ajsz.ak(ahoqVarW2, th3);
                        throw th4;
                    }
                }
            case 5:
                aooc.af(obj);
                java.lang.Object obj8 = this.a;
                ahoq ahoqVarW3 = ahvr.W(76, "TabTemplateConverter_logTabSelected");
                try {
                    defpackage.hqh hqhVar2 = ((defpackage.hqp) obj8).f;
                    java.lang.Object obj9 = this.b;
                    if (obj9 != hqhVar2) {
                        ((defpackage.hqp) obj8).g.i((java.lang.String) null).b(mce.gq);
                        int iOrdinal2 = ((defpackage.hqh) obj9).ordinal();
                        if (iOrdinal2 == 1) {
                            ((defpackage.hqp) obj8).c.o(rmx.qu);
                        } else if (iOrdinal2 == 2) {
                            ((defpackage.hqp) obj8).c.o(rmx.qv);
                        } else if (iOrdinal2 == 3) {
                            ((defpackage.hqp) obj8).c.o(rmx.qw);
                        } else {
                            if (iOrdinal2 != 4) {
                                throw new java.lang.IllegalStateException(a.bh(obj9, "Invalid tab: "));
                            }
                            ((defpackage.hqp) obj8).c.o(rmx.qx);
                        }
                    }
                    ajsz.ak(ahoqVarW3, (java.lang.Throwable) null);
                    return aojh.a;
                } catch (java.lang.Throwable th5) {
                    try {
                        throw th5;
                    } catch (java.lang.Throwable th6) {
                        ajsz.ak(ahoqVarW3, th5);
                        throw th6;
                    }
                }
            case 6:
                aooc.af(obj);
                defpackage.hxj hxjVar = (defpackage.hxj) this.b;
                if (hxjVar.c != null) {
                    defpackage.hxv.a.b().l("com/android/dialer/audio/audioinjector/AudioInjector$QueuedPlaybackSession", "cancel$<anonymous>", 459, "AudioInjector.kt").v("cancelling queued request");
                    ((defpackage.hxv) this.a).k.a(qbc.jk);
                    dsd dsdVar = hxjVar.c;
                    if (dsdVar != null) {
                        dsdVar.c();
                    }
                    hxjVar.c = null;
                } else {
                    ajcq ajcqVar = hxjVar.b;
                    if (!ajcqVar.isDone() || ajcqVar.isCancelled() || ((defpackage.hxf) aiql.H(ajcqVar)).b().isDone()) {
                        defpackage.hxv.a.b().l("com/android/dialer/audio/audioinjector/AudioInjector$QueuedPlaybackSession", "cancel$<anonymous>", 473, "AudioInjector.kt").v("not cancelling since playback has ended already");
                    } else {
                        defpackage.hxv.a.b().l("com/android/dialer/audio/audioinjector/AudioInjector$QueuedPlaybackSession", "cancel$<anonymous>", 469, "AudioInjector.kt").v("cancelling ongoing playback");
                        ((defpackage.hxv) this.a).k.a(qbc.jj);
                        ((defpackage.hxf) aiql.H(ajcqVar)).d();
                    }
                }
                return aojh.a;
            case 7:
                aooc.af(obj);
                ((defpackage.hyf) this.a).f((defpackage.hxe) this.b);
                return aojh.a;
            case 8:
                aooc.af(obj);
                defpackage.hyp hypVar = (defpackage.hyp) this.a;
                android.content.Context context = hypVar.b;
                java.io.File file = new java.io.File(context.getFilesDir(), "audioinjector");
                defpackage.hxy hxyVar = (defpackage.hxy) this.b;
                java.io.File file2 = new java.io.File(file, hypVar.a(hxyVar));
                if (file2.exists()) {
                    return file2;
                }
                java.io.File file3 = new java.io.File(context.getFilesDir(), "audioinjector");
                if (!file3.exists()) {
                    file3.mkdirs();
                }
                j$.nio.file.Path path = j$.nio.file.Paths.get(file3.getAbsolutePath(), new java.lang.String[]{hypVar.a(hxyVar)});
                java.io.InputStream inputStreamOpenRawResource = context.getResources().openRawResource(hxyVar.a);
                aooh.e(inputStreamOpenRawResource, "openRawResource(...)");
                j$.nio.file.Files.copy(inputStreamOpenRawResource, path, new j$.nio.file.CopyOption[0]);
                defpackage.hyp.a.b().l("com/android/dialer/audio/audioinjector/fileprovider/StaticFileProvider", "createAudioFile", 56, "StaticFileProvider.kt").y("Created file: %s", hypVar.a(hxyVar));
                java.io.File file4 = path.toFile();
                aooh.e(file4, "toFile(...)");
                return file4;
            case 9:
                aooc.af(obj);
                java.lang.Object obj10 = this.b;
                defpackage.ijt ijtVar = (defpackage.ijt) this.a;
                akzx akzxVar = ijtVar.b;
                aooh.f(obj10, "<this>");
                akzx akzxVarM = amoh.a.m();
                aooh.f(akzxVarM, "builder");
                defpackage.ihw ihwVar = (defpackage.ihw) obj10;
                boolean z2 = ihwVar.c;
                akzxVarM.u();
                amoh amohVar = akzxVarM.b;
                amohVar.b |= 1;
                amohVar.c = z2;
                if ((ihwVar.b & 1) != 0) {
                    defpackage.ihv ihvVarB = defpackage.ihv.b(ihwVar.d);
                    if (ihvVarB == null) {
                        ihvVarB = defpackage.ihv.UNRECOGNIZED;
                    }
                    akzxVarM.u();
                    amoh amohVar2 = akzxVarM.b;
                    amohVar2.d = ihvVarB.a();
                    amohVar2.b |= 2;
                }
                amoh amohVarP = akzxVarM.p();
                aooh.e(amohVarP, "build(...)");
                amoh amohVar3 = amohVarP;
                akzxVar.u();
                amoi amoiVar = akzxVar.b;
                amoi amoiVar2 = amoi.a;
                j$.util.Objects.requireNonNull(amohVar3);
                alat alatVar = amoiVar.c;
                if (!alatVar.c()) {
                    amoiVar.c = alad.J(alatVar);
                }
                amoiVar.c.add(amohVar3);
                ijtVar.b = akzxVar;
                return aojh.a;
            case 10:
                aooc.af(obj);
                defpackage.ips ipsVar = (defpackage.ips) this.a;
                long jM = ft$.ExternalSyntheticApiModelOutline0.m(ipsVar.b.getPackageInfo(ipsVar.a.getPackageName(), 0));
                akzx akzxVar2 = (akzx) ((defpackage.jhw) this.b).a;
                akzxVar2.u();
                ioy ioyVar = akzxVar2.b;
                ioy ioyVar2 = ioy.a;
                ioyVar.b |= 1;
                ioyVar.c = jM;
                return aojh.a;
            case 11:
                aooc.af(obj);
                java.lang.Object obj11 = this.b;
                ipb ipbVar2 = ipb.a;
                if (!aooh.n(obj11, ipbVar2)) {
                    ipt.a.b().l("com/android/dialer/backup/impl/DelayedBackupMigration", "migrate$<anonymous>", 63, "DelayedBackupMigration.kt").v("already restored before.");
                    return obj11;
                }
                ipt iptVar = (ipt) this.a;
                android.content.Context context2 = iptVar.b;
                if (!new java.io.File(context2.getFilesDir(), "dialer_delayed_backup_temp.pb").exists()) {
                    ((ipt) this.a).c.o(rmx.rw);
                    ipb ipbVar3 = ipb.a;
                    aooh.e(ipbVar3, "getDefaultInstance(...)");
                    return ipbVar3;
                }
                iptVar.c.o(rmx.rv);
                try {
                    ipbVar = (ipb) alad.x(ipbVar2, context2.openFileInput("dialer_delayed_backup_temp.pb"));
                    break;
                } catch (alaz e) {
                    ipt.a.b().k(e).l("com/android/dialer/backup/impl/DelayedBackupMigration", "migrate$<anonymous>", 77, "DelayedBackupMigration.kt").v("backup file corrupted");
                    ipbVar = ipb.a;
                }
                ipb ipbVar4 = ipbVar;
                aooh.c(ipbVar4);
                return ipbVar4;
            case 12:
                aooc.af(obj);
                java.io.File file5 = new java.io.File(((ish) this.b).b.getFilesDir(), (java.lang.String) this.a);
                if (file5.exists()) {
                    return file5.getAbsolutePath();
                }
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aooc.af(obj);
                java.lang.Object obj12 = this.a;
                java.io.File filesDir = ((android.content.Context) ((defpackage.jkq) this.b).a).getFilesDir();
                android.net.Uri uri = android.net.Uri.parse((java.lang.String) obj12);
                aooh.e(uri, "parse(...)");
                java.lang.String path2 = uri.getPath();
                if (path2 == null) {
                    throw new java.lang.IllegalStateException("Required value was null.");
                }
                java.io.File file6 = new java.io.File(filesDir, path2);
                if (file6.exists()) {
                    return file6;
                }
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                aooc.af(obj);
                try {
                    ?? r12 = ((ft$.ExternalSyntheticApiModelOutline0.m(((android.content.Context) this.b).getPackageManager().getPackageInfo("com.google.android.aicore", 0)) > ((java.lang.Number) this.a.a()).longValue() ? 1 : (ft$.ExternalSyntheticApiModelOutline0.m(((android.content.Context) this.b).getPackageManager().getPackageInfo("com.google.android.aicore", 0)) == ((java.lang.Number) this.a.a()).longValue() ? 0 : -1)) ^ (-1)) >>> 31;
                    ahaq ahaqVarA = ahar.a();
                    ahaqVarA.b(false);
                    ahaqVarA.a = ahap.a;
                    ahaqVarA.c(akzc.v(java.lang.String.valueOf((boolean) r12), java.nio.charset.StandardCharsets.UTF_8));
                    return ahaqVarA.a();
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    return ahas.d;
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                aooc.af(obj);
                ((ceg) this.a).h(((java.lang.Number) ((aii) this.b).d()).floatValue());
                return aojh.a;
            case 16:
                aooc.af(obj);
                ((ceg) this.a).h(((java.lang.Number) ((aii) this.b).d()).floatValue());
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                aooc.af(obj);
                ((ceg) this.a).h(((java.lang.Number) ((aii) this.b).d()).floatValue());
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                aooc.af(obj);
                defpackage.jcp jcpVar = (defpackage.jcp) this.a;
                android.net.ConnectivityManager connectivityManager2 = jcpVar.s;
                if (connectivityManager2 == null) {
                    aooh.j("connectivityManager");
                } else {
                    connectivityManager = connectivityManager2;
                }
                connectivityManager.registerNetworkCallback((android.net.NetworkRequest) this.b, jcpVar.r);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                aooc.af(obj);
                return java.lang.Boolean.valueOf(pez.bi((android.content.Context) this.b, (java.lang.String) aooh.p((j$.util.Optional) this.a, "")));
            default:
                aooc.af(obj);
                java.lang.Object obj13 = this.a;
                defpackage.jsv jsvVar = (defpackage.jsv) this.b;
                if (jsvVar.b == obj13) {
                    return aojh.a;
                }
                jsvVar.b = (qtz) obj13;
                zpz zpzVar = jsvVar.c;
                aojh aojhVar = aojh.a;
                zpzVar.a(aiql.z(aojhVar));
                return aojhVar;
        }
    }

    /* JADX WARN: Type inference failed for: r6v29, types: [aoin, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                return new defpackage.fyn((gca) this.a, (defpackage.fyr) this.b, aolnVar, 0);
            case 1:
                return new defpackage.fyn((defpackage.agx) this.b, (defpackage.agy) this.a, aolnVar, 1);
            case 2:
                return new defpackage.fyn((defpackage.hnm) this.b, (defpackage.hoz) this.a, aolnVar, 2);
            case 3:
                return new defpackage.fyn((defpackage.hnm) this.b, (java.lang.String) this.a, aolnVar, 3);
            case 4:
                return new defpackage.fyn((defpackage.hqp) this.a, (defpackage.hqh) this.b, aolnVar, 4);
            case 5:
                return new defpackage.fyn((defpackage.hqh) this.b, (defpackage.hqp) this.a, aolnVar, 5);
            case 6:
                return new defpackage.fyn((defpackage.hxj) this.b, (defpackage.hxv) this.a, aolnVar, 6);
            case 7:
                return new defpackage.fyn((defpackage.hyf) this.a, (defpackage.hxe) this.b, aolnVar, 7);
            case 8:
                return new defpackage.fyn((defpackage.hyp) this.a, (defpackage.hxy) this.b, aolnVar, 8);
            case 9:
                return new defpackage.fyn((defpackage.ijt) this.a, (defpackage.ihw) this.b, aolnVar, 9);
            case 10:
                return new defpackage.fyn((defpackage.jhw) this.b, (defpackage.ips) this.a, aolnVar, 10);
            case 11:
                return new defpackage.fyn((ipb) this.b, (ipt) this.a, aolnVar, 11);
            case 12:
                return new defpackage.fyn((ish) this.b, (java.lang.String) this.a, aolnVar, 12);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return new defpackage.fyn((defpackage.jkq) this.b, (java.lang.String) this.a, aolnVar, 13);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return new defpackage.fyn((android.content.Context) this.b, (aoin) this.a, aolnVar, 14);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return new defpackage.fyn((aii) this.b, (ceg) this.a, aolnVar, 15);
            case 16:
                return new defpackage.fyn((aii) this.b, (ceg) this.a, aolnVar, 16, (byte[]) null);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new defpackage.fyn((aii) this.b, (ceg) this.a, aolnVar, 17, (char[]) null);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new defpackage.fyn((defpackage.jcp) this.a, (android.net.NetworkRequest) this.b, aolnVar, 18);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new defpackage.fyn((android.content.Context) this.b, (j$.util.Optional) this.a, aolnVar, 19);
            default:
                return new defpackage.fyn(aolnVar, (defpackage.jsv) this.b, (qtz) this.a, 20);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyn(aii aiiVar, ceg cegVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = aiiVar;
        this.a = cegVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyn(aii aiiVar, ceg cegVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = aiiVar;
        this.a = cegVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyn(aii aiiVar, ceg cegVar, aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = aiiVar;
        this.a = cegVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyn(android.content.Context context, aoin aoinVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = context;
        this.a = aoinVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyn(android.content.Context context, j$.util.Optional optional, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = context;
        this.a = optional;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyn(aoln aolnVar, defpackage.jsv jsvVar, qtz qtzVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = jsvVar;
        this.a = qtzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyn(gca gcaVar, defpackage.fyr fyrVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = gcaVar;
        this.b = fyrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyn(defpackage.hnm hnmVar, defpackage.hoz hozVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = hnmVar;
        this.a = hozVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyn(defpackage.hnm hnmVar, java.lang.String str, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = hnmVar;
        this.a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyn(defpackage.hqh hqhVar, defpackage.hqp hqpVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = hqhVar;
        this.a = hqpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyn(defpackage.hqp hqpVar, defpackage.hqh hqhVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = hqpVar;
        this.b = hqhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyn(defpackage.hxj hxjVar, defpackage.hxv hxvVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = hxjVar;
        this.a = hxvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyn(defpackage.hyf hyfVar, defpackage.hxe hxeVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = hyfVar;
        this.b = hxeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyn(defpackage.hyp hypVar, defpackage.hxy hxyVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = hypVar;
        this.b = hxyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyn(defpackage.ijt ijtVar, defpackage.ihw ihwVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ijtVar;
        this.b = ihwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyn(ipb ipbVar, ipt iptVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = ipbVar;
        this.a = iptVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyn(ish ishVar, java.lang.String str, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = ishVar;
        this.a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyn(defpackage.jcp jcpVar, android.net.NetworkRequest networkRequest, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = jcpVar;
        this.b = networkRequest;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyn(defpackage.jhw jhwVar, defpackage.ips ipsVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = jhwVar;
        this.a = ipsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyn(defpackage.jkq jkqVar, java.lang.String str, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = jkqVar;
        this.a = str;
    }
}
