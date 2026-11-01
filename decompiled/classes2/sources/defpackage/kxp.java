package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kxp implements ajcb {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public kxp(defpackage.kxr kxrVar, defpackage.kxq kxqVar, int i) {
        this.$cid = i;
        this.a = kxqVar;
        j$.util.Objects.requireNonNull(kxrVar);
        this.b = kxrVar;
    }

    /* JADX WARN: Type inference failed for: r12v25, types: [java.lang.Object, xva] */
    public final void a(java.lang.Throwable th) {
        switch (this.$cid) {
            case 0:
                defpackage.kxr kxrVar = (defpackage.kxr) this.b;
                java.util.concurrent.atomic.AtomicReference atomicReference = kxrVar.k;
                defpackage.kxq kxqVar = defpackage.kxq.a;
                defpackage.kxq kxqVar2 = (defpackage.kxq) atomicReference.getAndSet(kxqVar);
                if (((java.lang.Boolean) kxrVar.m.a()).booleanValue()) {
                    kxrVar.o.a(ajcm.a);
                }
                defpackage.kxr.a.b().l("com/android/dialer/callrecording/impl/service/CallRecorder$1", "onFailure", 478, "CallRecorder.java").I("onFailure %s -> %s ", kxqVar2, kxqVar);
                return;
            case 1:
                aooh.f(th, "t");
                throw new java.lang.AssertionError(th);
            case 2:
                a.bq(defpackage.onz.a.c(), "Unable to read Flip To Silence user settings", "com/android/dialer/fliptosilence/FlipToSilenceDriver$1", "onFailure", '=', "FlipToSilenceDriver.java", th, zct.b);
                return;
            case 3:
                ((pgs) this.b).d.n(ruc.S, rub.c);
                return;
            case 4:
                phe.a.b().l("com/android/dialer/incall/cachedphonelookup/MultiStagePhoneLookup$3", "onFailure", 223, "MultiStagePhoneLookup.java").v("full lookup failure");
                ((phe) this.b).e.n(ruc.S, rub.c);
                return;
            case 5:
                if (th instanceof java.util.concurrent.CancellationException) {
                    return;
                }
                java.lang.Object obj = this.b;
                pmv pmvVar = new pmv(this, 15);
                j$.util.Optional optional = ((pqm) obj).e;
                optional.isPresent();
                ((pzo) optional.get()).a(((pqm) ((defpackage.kxp) pmvVar.a).b).b, 3);
                a.by(pqm.a.c(), "Failed to process disconnect completer.", "com/android/dialer/incall/core/call/CallControllerImpl$1", "onFailure", (char) 479, "CallControllerImpl.java", th);
                ((dsd) this.a).d(th);
                return;
            case 6:
                if (th instanceof java.util.concurrent.CancellationException) {
                    return;
                }
                a.by(pqm.a.c(), "Failed to process unhold completer.", "com/android/dialer/incall/core/call/CallControllerImpl$2", "onFailure", (char) 559, "CallControllerImpl.java", th);
                ((pqm) this.b).u(6);
                ((dsd) this.a).d(th);
                return;
            case 7:
                a.by(puq.a.d(), "Could not check if outgoing call is to an emergency number.", "com/android/dialer/incall/core/peer/InCallServicePeerImpl$1", "onFailure", (char) 431, "InCallServicePeerImpl.java", th);
                return;
            case 8:
                a.bq(com.android.dialer.shortcuts.PeriodicJobService.a.c(), "failed", "com/android/dialer/shortcuts/PeriodicJobService$1", "onFailure", 'E', "PeriodicJobService.java", th, zct.b);
                ((com.android.dialer.shortcuts.PeriodicJobService) this.b).jobFinished((android.app.job.JobParameters) this.a, false);
                return;
            case 9:
                if (((abyu) this.b).f) {
                    return;
                }
                xur xurVar = abyv.a;
                this.a.f(new java.lang.RuntimeException(th));
                return;
            case 10:
                ((acwx) this.a).k.h(((acxu) this.b).a);
                return;
            case 11:
                int i = adbe.a;
                try {
                    java.lang.Object obj2 = this.b;
                    afsq.cU(((acyu) obj2).a, ((acyu) obj2).g, (acvu) this.a, ((acyu) obj2).m);
                    return;
                } catch (java.io.IOException unused) {
                    return;
                }
            case 12:
                adbe.g(th, "%s: Failed to add file group %s with account: %s, variant: %s", new java.lang.Object[]{"ManifestConfigHelper", this.b, java.lang.String.valueOf(((ahyn) this.a).e()), "null"});
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                boolean z = th instanceof acvh;
                java.lang.Object obj3 = this.b;
                if (z) {
                    ((adcn) obj3).e((acvh) th, (acve) this.a);
                    return;
                }
                defpackage.yg ygVarB = acvh.b();
                ygVarB.c = th;
                ygVarB.b = acvg.c;
                ygVarB.d = "Refresh failed.";
                ((adcn) obj3).e(ygVarB.d(), (acve) this.a);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                android.util.Log.e("NetworkCallerGrpc", "Failed to get survey startup config.", th);
                defpackage.afjg.a.b = false;
                afjq afjqVar = (afjq) this.b;
                afjqVar.e();
                afjqVar.k((ajxi) this.a);
                return;
            default:
                android.util.Log.e("ClientLoggingBackend", "Error while logging.", th);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, xvb] */
    /* JADX WARN: Type inference failed for: r13v36, types: [java.lang.Object, xva] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, zzz] */
    public final /* synthetic */ void b(java.lang.Object obj) {
        defpackage.kxq kxqVar;
        int i = 20;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                aimz aimzVar = defpackage.kxr.a;
                int iOrdinal = ((defpackage.kxq) this.a).ordinal();
                if (iOrdinal == 0) {
                    kxqVar = defpackage.kxq.b;
                } else if (iOrdinal == 1) {
                    kxqVar = defpackage.kxq.c;
                } else if (iOrdinal != 2) {
                    kxqVar = iOrdinal != 3 ? defpackage.kxq.a : defpackage.kxq.a;
                } else {
                    kxqVar = defpackage.kxq.d;
                }
                defpackage.kxr kxrVar = (defpackage.kxr) this.b;
                defpackage.kxq kxqVar2 = (defpackage.kxq) kxrVar.k.getAndSet(kxqVar);
                if (((java.lang.Boolean) kxrVar.m.a()).booleanValue()) {
                    kxrVar.o.a(ajcm.a);
                }
                defpackage.kxr.a.b().l("com/android/dialer/callrecording/impl/service/CallRecorder$1", "onSuccess", 468, "CallRecorder.java").I("onSuccess %s -> %s ", kxqVar2, kxqVar);
                break;
            case 1:
                java.lang.Integer num = (java.lang.Integer) obj;
                kiu kiuVar = (kiu) this.b;
                defpackage.kis kisVar = kiuVar.u;
                if (kisVar == null) {
                    kisVar = defpackage.kis.a;
                }
                int size = kisVar.b.size();
                if (num == null || num.intValue() != size) {
                    aimw aimwVarL = defpackage.jyb.a.c().m(aioa.b).l("com/android/dialer/calllog/CallLogDeleter$deleteCallLogItem$<anonymous>", "onSuccess", 90, "CallLogDeleter.kt");
                    defpackage.kis kisVar2 = kiuVar.u;
                    if (kisVar2 == null) {
                        kisVar2 = defpackage.kis.a;
                    }
                    aimwVarL.G("Deleting call log item is unsuccessful. %d of %d rows are deleted.", num, kisVar2.b.size());
                }
                defpackage.jyb jybVar = (defpackage.jyb) this.a;
                jybVar.b.n(rmw.hl);
                jybVar.c.i((java.lang.String) null).b(mce.dj);
                break;
            case 2:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.onz onzVar = (defpackage.onz) this.a;
                    float fDoubleValue = (float) ((java.lang.Double) onzVar.b.a()).doubleValue();
                    android.hardware.SensorEventListener sensorEventListener = onzVar.c;
                    abdn abdnVar = ((abdo) sensorEventListener).f;
                    abdnVar.a = fDoubleValue;
                    java.lang.Object obj2 = this.b;
                    java.util.List list = ((abdo) sensorEventListener).c;
                    list.add(obj2);
                    abdo.a.b().l("com/google/android/libraries/awareness/flip/impl/FlipObserverAccelerometerOnlyImpl", "runOnFlip", 59, "FlipObserverAccelerometerOnlyImpl.java").w("adding a runOnFlip to the list, size=%s", list.size());
                    ((abdo) sensorEventListener).e = (android.hardware.SensorManager) ((abdo) sensorEventListener).b.getSystemService("sensor");
                    ((abdo) sensorEventListener).d = ((abdo) sensorEventListener).e.getDefaultSensor(1);
                    ((abdo) sensorEventListener).e.registerListener(sensorEventListener, ((abdo) sensorEventListener).d, 1);
                    ((abdo) sensorEventListener).h = false;
                    ((abdo) sensorEventListener).i = false;
                    abdnVar.a();
                    ((abdo) sensorEventListener).g.a();
                }
                break;
            case 3:
                java.lang.Object obj3 = this.b;
                pgs pgsVar = (pgs) obj3;
                pgsVar.d.n(ruc.S, rub.b);
                agsm.d("com/android/dialer/incall/cachedphonelookup/CachedPhoneLookup", "recordPhoneLookupInfo", 282, ahvr.I(ahrv.g(pgsVar.j.a()).i(new defpackage.ljp(obj3, this.a, i, bArr), pgsVar.e), new phd(obj3, (spn) obj, 1), pgsVar.c), zct.b, "Failed write phonelookup history", new java.lang.Object[0]);
                break;
            case 4:
                phe.a.b().l("com/android/dialer/incall/cachedphonelookup/MultiStagePhoneLookup$3", "onSuccess", 216, "MultiStagePhoneLookup.java").v("full lookup success");
                java.lang.Object obj4 = this.b;
                phe pheVar = (phe) obj4;
                pheVar.e.n(ruc.S, rub.b);
                agsm.d("com/android/dialer/incall/cachedphonelookup/MultiStagePhoneLookup", "recordPhoneLookupInfo", 261, ahvr.I(ahrv.g(pheVar.j.a()).h(new defpackage.mjl(this.a, i), pheVar.f), new phd(obj4, (spn) obj, 0), pheVar.d), zct.b, "Failed write phonelookup history", new java.lang.Object[0]);
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    ((pzo) this.b).c((android.telecom.Call) this.a, 14);
                }
                break;
            case 8:
                com.android.dialer.shortcuts.PeriodicJobService.a.b().l("com/android/dialer/shortcuts/PeriodicJobService$1", "onSuccess", 63, "PeriodicJobService.java").v("succeeded");
                ((com.android.dialer.shortcuts.PeriodicJobService) this.b).jobFinished((android.app.job.JobParameters) this.a, false);
                break;
            case 9:
                ?? r13 = this.b;
                xzh xzhVar = (xzh) obj;
                abyu abyuVar = (abyu) r13;
                if (!abyuVar.f) {
                    abyv abyvVar = abyuVar.h;
                    abys abysVar = abyuVar.d;
                    int i2 = abyuVar.a;
                    int i3 = abyuVar.b;
                    xzg xzgVarC = abyvVar.c(abysVar, i2, i3, true, xzhVar);
                    xus xusVar = abyuVar.c;
                    xzp xzpVar = abyvVar.b;
                    ucm ucmVarB = xzpVar.b(xzgVarC, i2, i3, xusVar);
                    if (ucmVarB != null) {
                        ?? r0 = ucmVarB.c;
                        abyuVar.g = r0;
                        r0.g(abyuVar.e, (xva) r13);
                        if (abyuVar.f) {
                            abyuVar.d();
                        }
                    } else {
                        abyuVar.f(new java.lang.RuntimeException(java.lang.String.valueOf(xzpVar) + " returned null LoadData for " + xzgVarC.b()));
                    }
                }
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj5 = this.a;
                if (!zBooleanValue) {
                    java.lang.String.valueOf(((ahyn) obj5).e());
                    int i4 = adbe.a;
                } else {
                    java.lang.String.valueOf(((ahyn) obj5).e());
                    int i5 = adbe.a;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                defpackage.afjg afjgVar = defpackage.afjg.a;
                anap anapVar = ((anak) obj).b;
                if (anapVar == null) {
                    anapVar = anap.a;
                }
                afjgVar.b = anapVar.b;
                afjq afjqVar = (afjq) this.b;
                afjqVar.e();
                afjqVar.k((ajxi) this.a);
                break;
            default:
                akdb akdbVar = (akdb) ((defpackage.afjo) this.a).b;
                java.lang.String str = (java.lang.String) obj;
                float fA = aevn.c(((aevm) akdbVar.b.eZ()).a((aevn) null)).a();
                if (fA >= 0.0f) {
                    akzx akzxVarP = ((alad) this.b).p();
                    akzxVarP.u();
                    akdq akdqVar = akzxVarP.b;
                    akdqVar.b |= 2048;
                    akdqVar.k = fA;
                    akdq akdqVarP = akzxVarP.p();
                    apjb apjbVar = akdbVar.c;
                    defpackage.aiwf aiwfVar = akdqVarP.g;
                    if (aiwfVar == null) {
                        aiwfVar = defpackage.aiwf.a;
                    }
                    java.lang.String str2 = aiwfVar.j;
                    akcv akcvVar = akcw.a;
                    int i6 = airu.a;
                    int iA = aisb.b.b(str2, java.nio.charset.StandardCharsets.UTF_8).a();
                    ?? r2 = apjbVar.b;
                    android.content.Context context = (android.content.Context) apjbVar.a;
                    zzc zzcVarH = r2.a(context, str).h(akdqVarP, abtl.b(context, new anai()));
                    zzcVarH.m(iA);
                    ajcq ajcqVarE = aazc.e(zzcVarH.d());
                    ahye ahyeVar = new ahye((java.lang.Object) null);
                    ajbm ajbmVar = ajbm.a;
                    ajcq ajcqVarF = ajan.f(ajcqVarE, ahyeVar, ajbmVar);
                    ajcqVarF.c(new ahts(ajcqVarF, 18), ajbmVar);
                    aizu.f(ajcqVarF, java.lang.Exception.class, ahqx.a(new agqd(19)), ajbmVar);
                    break;
                }
                break;
        }
    }

    public kxp(kiu kiuVar, defpackage.jyb jybVar, int i) {
        this.$cid = i;
        this.b = kiuVar;
        this.a = jybVar;
    }

    public kxp(defpackage.onz onzVar, java.lang.Runnable runnable, int i) {
        this.$cid = i;
        this.b = runnable;
        j$.util.Objects.requireNonNull(onzVar);
        this.a = onzVar;
    }

    public kxp(pgs pgsVar, android.telecom.Call.Details details, int i) {
        this.$cid = i;
        this.a = details;
        j$.util.Objects.requireNonNull(pgsVar);
        this.b = pgsVar;
    }

    public kxp(phe pheVar, android.telecom.Call.Details details, int i) {
        this.$cid = i;
        this.a = details;
        j$.util.Objects.requireNonNull(pheVar);
        this.b = pheVar;
    }

    public kxp(pqm pqmVar, dsd dsdVar, int i) {
        this.$cid = i;
        this.a = dsdVar;
        j$.util.Objects.requireNonNull(pqmVar);
        this.b = pqmVar;
    }

    public kxp(pqm pqmVar, dsd dsdVar, int i, byte[] bArr) {
        this.$cid = i;
        this.a = dsdVar;
        j$.util.Objects.requireNonNull(pqmVar);
        this.b = pqmVar;
    }

    public kxp(puq puqVar, pzo pzoVar, android.telecom.Call call, int i) {
        this.$cid = i;
        this.b = pzoVar;
        this.a = call;
        j$.util.Objects.requireNonNull(puqVar);
    }

    public kxp(com.android.dialer.shortcuts.PeriodicJobService periodicJobService, android.app.job.JobParameters jobParameters, int i) {
        this.$cid = i;
        this.a = jobParameters;
        j$.util.Objects.requireNonNull(periodicJobService);
        this.b = periodicJobService;
    }

    public kxp(abyu abyuVar, xva xvaVar, int i) {
        this.$cid = i;
        this.a = xvaVar;
        j$.util.Objects.requireNonNull(abyuVar);
        this.b = abyuVar;
    }

    public kxp(acwx acwxVar, acxu acxuVar, int i) {
        this.$cid = i;
        this.b = acxuVar;
        j$.util.Objects.requireNonNull(acwxVar);
        this.a = acwxVar;
    }

    public kxp(acyu acyuVar, acvu acvuVar, int i) {
        this.$cid = i;
        this.a = acvuVar;
        j$.util.Objects.requireNonNull(acyuVar);
        this.b = acyuVar;
    }

    public kxp(vqy vqyVar, java.lang.String str, ahyn ahynVar, int i) {
        this.$cid = i;
        this.b = str;
        this.a = ahynVar;
        j$.util.Objects.requireNonNull(vqyVar);
    }

    public kxp(adcn adcnVar, acve acveVar, int i) {
        this.$cid = i;
        this.a = acveVar;
        j$.util.Objects.requireNonNull(adcnVar);
        this.b = adcnVar;
    }

    public kxp(afjq afjqVar, ajxi ajxiVar, int i) {
        this.$cid = i;
        this.a = ajxiVar;
        j$.util.Objects.requireNonNull(afjqVar);
        this.b = afjqVar;
    }

    public kxp(defpackage.afjo afjoVar, akdq akdqVar, int i) {
        this.$cid = i;
        this.b = akdqVar;
        j$.util.Objects.requireNonNull(afjoVar);
        this.a = afjoVar;
    }
}
