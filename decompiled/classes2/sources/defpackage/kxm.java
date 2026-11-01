package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class kxm implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ kxm(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a(java.lang.Object obj) {
        int i = 9;
        int i2 = 17;
        int i3 = 4;
        int i4 = 3;
        switch (this.$cid) {
            case 0:
                ((defpackage.kxr) this.a).q.a(qbc.df);
                return aiql.y((java.lang.Exception) obj);
            case 1:
                return ((defpackage.kww) this.a).a();
            case 2:
                return ((defpackage.kxr) this.a).l.a();
            case 3:
                java.lang.Object obj2 = this.a;
                defpackage.kxr kxrVar = (defpackage.kxr) obj2;
                defpackage.kvt kvtVar = kxrVar.r;
                ahrv ahrvVarG = ahrv.g(kvtVar.a(defpackage.kux.a));
                defpackage.kwz kwzVar = new defpackage.kwz(16);
                ?? r8 = kvtVar.a;
                ajcq ajcqVarH = ahrvVarG.h(kwzVar, (java.util.concurrent.Executor) r8);
                ajcq ajcqVarH2 = ahrv.g(kvtVar.a(defpackage.kux.b)).h(new defpackage.kwz(17), (java.util.concurrent.Executor) r8);
                return ahvr.ak(new ajcq[]{ajcqVarH, ajcqVarH2}).p(new defpackage.jsr(obj2, ajcqVarH, ajcqVarH2, i4), kxrVar.h);
            case 4:
                ((defpackage.kxr) this.a).q.a(qbc.db);
                return aiql.y((java.lang.Throwable) obj);
            case 5:
                defpackage.kuo kuoVar = (defpackage.kuo) obj;
                aimz aimzVar = defpackage.kxr.a;
                return ((defpackage.kxq) this.a).equals(defpackage.kxq.b) ? kuoVar.b() : kuoVar.a();
            case 6:
                defpackage.kxr kxrVar2 = (defpackage.kxr) this.a;
                kxrVar2.g.o(rmx.fV);
                kxrVar2.k.set(defpackage.kxq.a);
                ajcq ajcqVar = ajcm.a;
                kxrVar2.o.a(ajcqVar);
                defpackage.kxr.a.c().i(zct.b).k((java.lang.Exception) obj).l("com/android/dialer/callrecording/impl/service/CallRecorder", "startRecording", 398, "CallRecorder.java").v("failed to record, set state: idle");
                rai raiVar = kxrVar2.u;
                if (raiVar != null) {
                    defpackage.kxx kxxVar = (defpackage.kxx) raiVar.a;
                    kxxVar.h.set(true);
                    kxxVar.j.set(j$.util.Optional.of(defpackage.kxw.a));
                    kxxVar.n.a(ajcqVar);
                }
                defpackage.kww kwwVar = kxrVar2.b;
                return kwwVar.m.g(new defpackage.jyr(kwwVar, 5), kwwVar.c);
            case 7:
                aimz aimzVar2 = defpackage.kxr.a;
                return this.a;
            case 8:
                java.io.File file = (java.io.File) ((j$.util.Optional) obj).orElse((java.lang.Object) null);
                if (file != null) {
                    return aiql.z(file);
                }
                ((defpackage.kxr) this.a).q.a(qbc.de);
                return aiql.y(new java.lang.IllegalStateException("failed to save file"));
            case 9:
                defpackage.hxe hxeVar = (defpackage.hxe) obj;
                int iOrdinal = hxeVar.ordinal();
                java.lang.Object obj3 = this.a;
                if (iOrdinal == 0) {
                    aimz aimzVar3 = defpackage.kxx.a;
                    aimzVar3.b().l("com/android/dialer/callrecording/impl/service/CallRecordingButtonController", "startAutomaticRecording", 418, "CallRecordingButtonController.java").v("disclosure playback completed");
                    aimzVar3.b().l("com/android/dialer/callrecording/impl/service/CallRecordingButtonController", "onAutomaticRecordingStartDisclosurePlaybackCompleted", 488, "CallRecordingButtonController.java").v("enter");
                    defpackage.kxx kxxVar2 = (defpackage.kxx) obj3;
                    kxxVar2.h.set(true);
                    kxxVar2.e(kxxVar2.c);
                    return aiql.z(java.lang.Boolean.TRUE);
                }
                if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                    throw new java.lang.AssertionError("unexpected playback ended reason: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(hxeVar))));
                }
                aimz aimzVar4 = defpackage.kxx.a;
                a.bt(aimzVar4.d(), "disclosure playback did not complete for the following reason: %s", hxeVar, "com/android/dialer/callrecording/impl/service/CallRecordingButtonController", "startAutomaticRecording", (char) 427, "CallRecordingButtonController.java", zct.b);
                aimzVar4.b().l("com/android/dialer/callrecording/impl/service/CallRecordingButtonController", "onAutomaticRecordingStartDisclosurePlaybackDidNotComplete", 494, "CallRecordingButtonController.java").v("enter");
                defpackage.kxx kxxVar3 = (defpackage.kxx) obj3;
                kxxVar3.h.set(true);
                kxxVar3.e(kxxVar3.c);
                return aiql.z(java.lang.Boolean.FALSE);
            case 10:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    a.bI(defpackage.kxx.a.d(), "start disclosure did not finish successfully", "com/android/dialer/callrecording/impl/service/CallRecordingButtonController", "startAutomaticRecording", (char) 457, "CallRecordingButtonController.java", zct.b);
                    return ajcm.a;
                }
                java.lang.Object obj4 = this.a;
                defpackage.kxx.a.b().l("com/android/dialer/callrecording/impl/service/CallRecordingButtonController", "startAutomaticRecording", 439, "CallRecordingButtonController.java").v("starting to record the call");
                defpackage.kxx kxxVar4 = (defpackage.kxx) obj4;
                defpackage.kww kwwVar2 = kxxVar4.e;
                return ahvr.ak(new ajcq[]{kxxVar4.c.c(kxxVar4.f), kwwVar2.m.g(new defpackage.jyr(kwwVar2, 4), kwwVar2.c)}).o(new defpackage.jse(6), kxxVar4.b);
            case 11:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return ajcm.a;
                }
                java.lang.Object obj5 = this.a;
                aimz aimzVar5 = defpackage.kxx.a;
                aimzVar5.b().l("com/android/dialer/callrecording/impl/service/CallRecordingButtonController", "startAutomaticRecording", 406, "CallRecordingButtonController.java").v("enter");
                defpackage.kxx kxxVar5 = (defpackage.kxx) obj5;
                agsm.i(238, kxxVar5.e.b(), "logCallRecordingRequested failed", new java.lang.Object[0]);
                kxxVar5.h(j$.time.Instant.now().toEpochMilli());
                aimzVar5.b().l("com/android/dialer/callrecording/impl/service/CallRecordingButtonController", "playStartDisclosure", 464, "CallRecordingButtonController.java").v("enter");
                ahrv ahrvVarG2 = ahrv.g(kxxVar5.c.b());
                defpackage.kxn kxnVar = new defpackage.kxn(obj5, i3);
                ajct ajctVar = kxxVar5.b;
                return ahrv.g(ahrvVarG2.h(kxnVar, ajctVar).i(new defpackage.ibe(7), ajctVar).h(new defpackage.kwz(14), ajctVar)).i(new defpackage.kxm(obj5, i), ajctVar).i(new defpackage.kxm(obj5, 10), ajctVar);
            case 12:
                return ((lbl) this.a).d((aigf) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return ((lbl) this.a).g(j$.time.Instant.now().toEpochMilli());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                tkl tklVar = (tkl) this.a;
                return ahvr.H(((llz) tklVar.d).c((defpackage.lhr) obj), new defpackage.lbs(i4), (java.util.concurrent.Executor) tklVar.c);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return ((llz) this.a).c((defpackage.lhr) obj);
            case 16:
                java.lang.String str = (java.lang.String) obj;
                if (str.isEmpty()) {
                    defpackage.lch.a.b().l("com/android/dialer/callscreen/impl/demo/DemoAudioPlayerController", "playDemoAudio", 42, "DemoAudioPlayerController.java").v("audio file uri is empty.");
                    return aiql.y(new java.lang.Exception("failed to fetch audio file"));
                }
                defpackage.lch lchVar = (defpackage.lch) this.a;
                if (lchVar.c == null) {
                    lchVar.c = lchVar.e.m();
                }
                return lchVar.c.a(android.net.Uri.parse(str));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                long epochMilli = j$.time.Instant.now().toEpochMilli();
                lcp lcpVar = (lcp) this.a;
                long millis = epochMilli - java.util.concurrent.TimeUnit.DAYS.toMillis(((java.lang.Long) lcpVar.g.a()).longValue());
                aift aiftVar = new aift(4);
                for (defpackage.lkq lkqVar : (java.util.List) obj) {
                    if (lkqVar.f < millis && !lkqVar.g.equals(defpackage.ljx.a)) {
                        aiftVar.i(lkqVar.a);
                    }
                }
                return lcpVar.e.a(aiftVar.h(), j$.time.Instant.now().toEpochMilli());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                java.lang.Object obj6 = this.a;
                lcp lcpVar2 = (lcp) obj6;
                ahrv ahrvVarG3 = ahrv.g(lcpVar2.e.d());
                defpackage.kxm kxmVar = new defpackage.kxm(obj6, i2);
                ajct ajctVar2 = lcpVar2.d;
                return ahrvVarG3.i(kxmVar, ajctVar2).h(new defpackage.lbs(11), ajctVar2);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ahvr.aj((aify) obj).o(new defpackage.jse(9), ((lcp) this.a).d);
            default:
                return ((ldb) this.a).b(new defpackage.jyr((java.util.List) obj, 15), 3);
        }
    }
}
