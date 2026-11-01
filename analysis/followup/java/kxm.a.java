    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.ajat
    public final ajcq a(Object obj) {
        int i = 9;
        int i2 = 17;
        int i3 = 4;
        int i4 = 3;
        switch (this.$cid) {
            case 0:
                ((kxr) this.a).q.a(qbc.CALL_RECORDING_FAILED_SAVING_TO_DB);
                return aiql.y((Exception) obj);
            case 1:
                return ((kww) this.a).a();
            case 2:
                return ((kxr) this.a).l.a();
            case 3:
                Object obj2 = this.a;
                kxr kxrVar = (kxr) obj2;
                kvt kvtVar = kxrVar.r;
                ahrv ahrvVarG = ahrv.g(kvtVar.a(kux.a));
                kwz kwzVar = new kwz(16);
                ?? r8 = kvtVar.a;
                ahrv ahrvVarH = ahrvVarG.h(kwzVar, r8);
                ahrv ahrvVarH2 = ahrv.g(kvtVar.a(kux.b)).h(new kwz(i2), r8);
                return ahvr.ak(ahrvVarH, ahrvVarH2).p(new jsr(obj2, ahrvVarH, ahrvVarH2, i4), kxrVar.h);
            case 4:
                ((kxr) this.a).q.a(qbc.CALL_RECORDING_EXCEPTION_GETTING_AUDIO_TEE);
                return aiql.y((Throwable) obj);
            case 5:
                kuo kuoVar = (kuo) obj;
                aimz aimzVar = kxr.a;
                return ((kxq) this.a).equals(kxq.b) ? kuoVar.b() : kuoVar.a();
            case 6:
                kxr kxrVar2 = (kxr) this.a;
                kxrVar2.g.o(rmx.CALL_RECORDING_FAILED_TO_SAVE_RECORDING);
                kxrVar2.k.set(kxq.a);
                ajcq ajcqVar = ajcm.a;
                kxrVar2.o.a(ajcqVar);
                ((aimw) ((aimw) ((aimw) ((aimw) kxr.a.c()).i(zct.b)).k((Exception) obj)).l("com/android/dialer/callrecording/impl/service/CallRecorder", "startRecording", 398, "CallRecorder.java")).v("failed to record, set state: idle");
                rai raiVar = kxrVar2.u;
                if (raiVar != null) {
                    kxx kxxVar = (kxx) raiVar.a;
                    kxxVar.h.set(true);
                    kxxVar.j.set(Optional.of(kxw.a));
                    kxxVar.n.a(ajcqVar);
                }
                kww kwwVar = kxrVar2.b;
                return kwwVar.m.g(new jyr(kwwVar, 5), kwwVar.c);
            case 7:
                aimz aimzVar2 = kxr.a;
                return this.a;
            case 8:
                File file = (File) ((Optional) obj).orElse(null);
                if (file != null) {
                    return aiql.z(file);
                }
                ((kxr) this.a).q.a(qbc.CALL_RECORDING_ENCODER_FAILED_TO_SAVE_FILE);
                return aiql.y(new IllegalStateException("failed to save file"));
            case 9:
                hxe hxeVar = (hxe) obj;
                int iOrdinal = hxeVar.ordinal();
                Object obj3 = this.a;
                if (iOrdinal == 0) {
                    aimz aimzVar3 = kxx.a;
                    ((aimw) ((aimw) aimzVar3.b()).l("com/android/dialer/callrecording/impl/service/CallRecordingButtonController", "startAutomaticRecording", 418, "CallRecordingButtonController.java")).v("disclosure playback completed");
                    ((aimw) ((aimw) aimzVar3.b()).l("com/android/dialer/callrecording/impl/service/CallRecordingButtonController", "onAutomaticRecordingStartDisclosurePlaybackCompleted", 488, "CallRecordingButtonController.java")).v("enter");
                    kxx kxxVar2 = (kxx) obj3;
                    kxxVar2.h.set(true);
                    kxxVar2.e(kxxVar2.c);
                    return aiql.z(Boolean.TRUE);
                }
                if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                    throw new AssertionError("unexpected playback ended reason: ".concat(String.valueOf(String.valueOf(hxeVar))));
                }
                aimz aimzVar4 = kxx.a;
                ((aimw) ((aimw) ((aimw) aimzVar4.d()).i(zct.b)).l("com/android/dialer/callrecording/impl/service/CallRecordingButtonController", "startAutomaticRecording", (char) 427, "CallRecordingButtonController.java")).y("disclosure playback did not complete for the following reason: %s", hxeVar);
                ((aimw) ((aimw) aimzVar4.b()).l("com/android/dialer/callrecording/impl/service/CallRecordingButtonController", "onAutomaticRecordingStartDisclosurePlaybackDidNotComplete", 494, "CallRecordingButtonController.java")).v("enter");
                kxx kxxVar3 = (kxx) obj3;
                kxxVar3.h.set(true);
                kxxVar3.e(kxxVar3.c);
                return aiql.z(Boolean.FALSE);
            case 10:
                if (!((Boolean) obj).booleanValue()) {
                    ((aimw) ((aimw) ((aimw) kxx.a.d()).i(zct.b)).l("com/android/dialer/callrecording/impl/service/CallRecordingButtonController", "startAutomaticRecording", (char) 457, "CallRecordingButtonController.java")).v("start disclosure did not finish successfully");
                    return ajcm.a;
                }
                Object obj4 = this.a;
                ((aimw) ((aimw) kxx.a.b()).l("com/android/dialer/callrecording/impl/service/CallRecordingButtonController", "startAutomaticRecording", 439, "CallRecordingButtonController.java")).v("starting to record the call");
                kxx kxxVar4 = (kxx) obj4;
                kww kwwVar2 = kxxVar4.e;
                return ahvr.ak(kxxVar4.c.c(kxxVar4.f), kwwVar2.m.g(new jyr(kwwVar2, i3), kwwVar2.c)).o(new jse(6), kxxVar4.b);
            case 11:
                if (!((Boolean) obj).booleanValue()) {
                    return ajcm.a;
                }
                Object obj5 = this.a;
                aimz aimzVar5 = kxx.a;
                ((aimw) ((aimw) aimzVar5.b()).l("com/android/dialer/callrecording/impl/service/CallRecordingButtonController", "startAutomaticRecording", 406, "CallRecordingButtonController.java")).v("enter");
                kxx kxxVar5 = (kxx) obj5;
                agsm.i(238, kxxVar5.e.b(), "logCallRecordingRequested failed", new Object[0]);
                kxxVar5.h(Instant.now().toEpochMilli());
                ((aimw) ((aimw) aimzVar5.b()).l("com/android/dialer/callrecording/impl/service/CallRecordingButtonController", "playStartDisclosure", 464, "CallRecordingButtonController.java")).v("enter");
                ahrv ahrvVarG2 = ahrv.g(kxxVar5.c.b());
                kxn kxnVar = new kxn(obj5, i3);
                ajct ajctVar = kxxVar5.b;
                return ahrv.g(ahrvVarG2.h(kxnVar, ajctVar).i(new ibe(7), ajctVar).h(new kwz(14), ajctVar)).i(new kxm(obj5, i), ajctVar).i(new kxm(obj5, 10), ajctVar);
            case 12:
                return ((lbl) this.a).d((aigf) obj);
            case 13:
                return ((lbl) this.a).g(Instant.now().toEpochMilli());
            case 14:
                tkl tklVar = (tkl) this.a;
                return ahvr.H(((llz) tklVar.d).c((lhr) obj), new lbs(i4), tklVar.c);
            case Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return ((llz) this.a).c((lhr) obj);
            case 16:
                String str = (String) obj;
                if (str.isEmpty()) {
                    ((aimw) ((aimw) lch.a.b()).l("com/android/dialer/callscreen/impl/demo/DemoAudioPlayerController", "playDemoAudio", 42, "DemoAudioPlayerController.java")).v("audio file uri is empty.");
                    return aiql.y(new Exception("failed to fetch audio file"));
                }
                lch lchVar = (lch) this.a;
                if (lchVar.c == null) {
                    lchVar.c = lchVar.e.m();
                }
                return lchVar.c.a(Uri.parse(str));
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                long epochMilli = Instant.now().toEpochMilli();
                lcp lcpVar = (lcp) this.a;
                long millis = epochMilli - TimeUnit.DAYS.toMillis(((Long) lcpVar.g.a()).longValue());
                aift aiftVar = new aift(4);
                for (lkq lkqVar : (List) obj) {
                    if (lkqVar.f < millis && !lkqVar.g.equals(ljx.a)) {
                        aiftVar.i(lkqVar.a);
                    }
                }
                return lcpVar.e.a(aiftVar.g(), Instant.now().toEpochMilli());
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                Object obj6 = this.a;
                lcp lcpVar2 = (lcp) obj6;
                ahrv ahrvVarG3 = ahrv.g(lcpVar2.e.d());
                kxm kxmVar = new kxm(obj6, i2);
                ajct ajctVar2 = lcpVar2.d;
                return ahrvVarG3.i(kxmVar, ajctVar2).h(new lbs(11), ajctVar2);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ahvr.aj((aify) obj).o(new jse(i), ((lcp) this.a).d);
            default:
                return ((ldb) this.a).b(new jyr((List) obj, 15), 3);
        }
    }
