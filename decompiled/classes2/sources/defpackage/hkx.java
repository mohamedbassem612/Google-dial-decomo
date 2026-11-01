package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class hkx implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public hkx(defpackage.epn epnVar, int i) {
        this.$cid = i;
        this.a = epnVar;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v81, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v90, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v96, types: [java.lang.Object, java.util.List] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.Object objA = null;
        boolean z = false;
        int i = 0;
        switch (this.$cid) {
            case 0:
                return java.lang.Boolean.valueOf(((android.os.UserManager) this.a).isSystemUser());
            case 1:
                java.lang.Object obj = this.a;
                ((defpackage.epn) obj).e.set(true);
                try {
                    android.os.Process.setThreadPriority(10);
                    objA = ((defpackage.epn) obj).a();
                    android.os.Binder.flushPendingCommands();
                    ((defpackage.epn) this.a).d(objA);
                    return objA;
                } catch (java.lang.Throwable th) {
                    try {
                        ((defpackage.epn) this.a).d.set(true);
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        ((defpackage.epn) this.a).d(objA);
                        throw th2;
                    }
                }
            case 2:
                defpackage.mol molVar = (defpackage.mol) this.a;
                if (((zzx) molVar.c).m()) {
                    return j$.util.Optional.empty();
                }
                android.content.Context context = (android.content.Context) molVar.b;
                return j$.util.Optional.of(java.lang.Boolean.valueOf(gez.c(context).getBoolean(context.getString(2132017366), false)));
            case 3:
                return ((defpackage.hyv) this.a).a();
            case 4:
                return java.lang.Boolean.valueOf(((defpackage.iax) this.a).k);
            case 5:
                return java.lang.Boolean.valueOf(((defpackage.iax) this.a).k);
            case 6:
                ((defpackage.iax) this.a).k = true;
                return null;
            case 7:
                return java.lang.Boolean.valueOf(((defpackage.iax) this.a).k);
            case 8:
                for (android.media.AudioDeviceInfo audioDeviceInfo : ((defpackage.ibo) this.a).a.i()) {
                    if (audioDeviceInfo.getType() == 18) {
                        return j$.util.Optional.of(audioDeviceInfo);
                    }
                }
                return j$.util.Optional.empty();
            case 9:
                return ((zpm) this.a).f();
            case 10:
                jiy jiyVar = (jiy) this.a;
                android.content.Context context2 = jiyVar.a;
                if (defpackage.hhk.d(context2).dO().y()) {
                    try {
                        if (fh$.ExternalSyntheticApiModelOutline0.m(context2)) {
                            rus rusVar = new rus();
                            rusVar.d(ruz.b);
                            rusVar.c(rvc.l);
                            rusVar.e(new rva(2132019288));
                            rusVar.b(jiyVar.a.getDrawable(2131231977));
                            return j$.util.Optional.of(rusVar.a());
                        }
                    } catch (java.lang.RuntimeException e) {
                        a.bq(defpackage.jir.a.c(), "Exception while querying BlockedNumberContract", "com/android/dialer/blocking/FilteredNumberCompat", "safeBlockedNumbersContractCanCurrentUserBlockNumbers", (char) 221, "FilteredNumberCompat.java", e, zct.b);
                    }
                }
                return j$.util.Optional.empty();
            case 11:
                zjm zjmVar = ((jnt) this.a).b;
                if (!zjmVar.g().isPresent()) {
                    a.bI(jnt.a.c().m(aioa.b), "worker executed while feature disabled", "com/android/dialer/callannouncer/impl/prewarmer/PrewarmTextToSpeechWorker", "startWork", '9', "PrewarmTextToSpeechWorker.java", zct.b);
                    return new defpackage.gsd();
                }
                jnt.a.b().l("com/android/dialer/callannouncer/impl/prewarmer/PrewarmTextToSpeechWorker", "startWork", 45, "PrewarmTextToSpeechWorker.java").v("starting pre-warm");
                ((defpackage.jns) zjmVar.g().orElseThrow()).c();
                return new gsf();
            case 12:
                defpackage.jny jnyVar = (defpackage.jny) this.a;
                if (jnyVar.g) {
                    defpackage.jny.a.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncer", "cancelAnnouncement", 160, "CallAnnouncer.java").v("announcement is already cancelled");
                    return null;
                }
                jnyVar.g = true;
                if (!jnyVar.e.isPresent()) {
                    defpackage.jny.a.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncer", "cancelAnnouncement", 166, "CallAnnouncer.java").v("cancelled announcement prior to tts being ready");
                    return null;
                }
                j$.util.Optional optional = jnyVar.f;
                if (true == optional.isPresent()) {
                    optional.get().cancel(false);
                }
                ((defpackage.onz) jnyVar.j.a).b();
                if (((android.speech.tts.TextToSpeech) jnyVar.e.orElseThrow()).stop() == -1) {
                    defpackage.jny.a.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncer", "cancelAnnouncement", 177, "CallAnnouncer.java").v("failed to cancel announcement");
                    return null;
                }
                defpackage.jny.a.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncer", "cancelAnnouncement", 181, "CallAnnouncer.java").v("cancelled announcement");
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return java.lang.Boolean.valueOf(android.provider.Settings.Secure.getInt((android.content.ContentResolver) ((defpackage.kvt) this.a).b, "op_breath_mode_status", 0) == 1);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                ?? r8 = this.a;
                aimz aimzVar = jsk.a;
                return afsq.ct((java.util.List) r8);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                jso jsoVar = (jso) this.a;
                aoin aoinVar = jsoVar.e;
                long jLongValue = ((java.lang.Long) aoinVar.a()).longValue() <= 0 ? 180L : ((java.lang.Long) aoinVar.a()).longValue();
                jsk jskVar = jsoVar.d;
                long millis = java.util.concurrent.TimeUnit.DAYS.toMillis(jLongValue);
                aazc aazcVar = jskVar.c;
                long epochMilli = j$.time.Instant.now().toEpochMilli();
                adag adagVar = new adag((byte[]) null);
                adagVar.n("SELECT feedback_creation_time_millis FROM caller_id_feedback WHERE feedback_creation_time_millis < ?");
                adagVar.o(java.lang.Long.valueOf(epochMilli - millis));
                ahrv ahrvVarG = ahrv.g(jskVar.f.F(new defpackage.jsh(adagVar.B(), z ? 1 : 0)));
                defpackage.hky hkyVar = new defpackage.hky(jskVar, 7);
                ajct ajctVar = jskVar.b;
                ahvr.J(ahrvVarG.i(hkyVar, ajctVar), new defpackage.jsi(jskVar, epochMilli), ajctVar);
                return new gsf();
            case 16:
                return gus.ae(((jvs) this.a).b);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                akzx akzxVarM = zah.a.m();
                while (true) {
                    ?? r1 = this.a;
                    if (i >= ((aike) r1).d) {
                        return j$.util.Optional.of(akzxVarM.p());
                    }
                    zai zaiVar = (zai) aiql.H((ajcq) r1.get(i));
                    akzxVarM.u();
                    zah zahVar = akzxVarM.b;
                    j$.util.Objects.requireNonNull(zaiVar);
                    alat alatVar = zahVar.b;
                    if (!alatVar.c()) {
                        zahVar.b = alad.J(alatVar);
                    }
                    zahVar.b.add(zaiVar);
                    i++;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return (aify) j$.util.Collection.-EL.stream((java.util.Collection) this.a).map(new defpackage.etw(11)).filter(new defpackage.jvr(2)).map(new defpackage.etw(12)).collect(aido.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ?? r9 = this.a;
                aimz aimzVar2 = jwu.a;
                return afsq.ct((java.util.List) r9);
            default:
                return java.lang.Boolean.valueOf(android.provider.Settings.System.getInt(((jxe) this.a).c.getContentResolver(), "airplane_mode_on", 0) != 0);
        }
    }

    public /* synthetic */ hkx(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
