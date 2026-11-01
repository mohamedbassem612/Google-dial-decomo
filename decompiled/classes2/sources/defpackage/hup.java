package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class hup implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ hup(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v14, types: [hxa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v63, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v64, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v90, types: [aoin, java.lang.Object] */
    public final java.lang.Object apply(java.lang.Object obj) {
        final int i = 0;
        final int i2 = 1;
        switch (this.$cid) {
            case 0:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return j$.util.Optional.empty();
                }
                java.lang.Object obj2 = this.a;
                rus rusVar = new rus();
                rusVar.d(ruz.b);
                rusVar.c(rvc.k);
                rusVar.e(new rva(2132017365));
                rusVar.b(((urb) obj2).a.getDrawable(2131231647));
                return j$.util.Optional.of(rusVar.a());
            case 1:
                if (!((java.util.List) obj).contains(java.lang.Boolean.TRUE)) {
                    return j$.util.Optional.empty();
                }
                java.lang.Object obj3 = this.a;
                rus rusVar2 = new rus();
                rusVar2.d(ruz.b);
                rusVar2.c(rvc.j);
                rusVar2.e(new rva(2132017277));
                rusVar2.b(((hkz) obj3).b.getDrawable(2131231920));
                return j$.util.Optional.of(rusVar2.a());
            case 2:
                akzc akzcVar = (akzc) obj;
                if (akzcVar == null) {
                    throw new java.lang.NullPointerException("Null data");
                }
                defpackage.hzb hzbVar = (defpackage.hzb) this.a;
                defpackage.hyz hyzVar = new defpackage.hyz(akzcVar, hzbVar.h);
                hzbVar.h = 0;
                return hyzVar;
            case 3:
                defpackage.hyz hyzVar2 = (defpackage.hyz) obj;
                return this.a.a(hyzVar2.a, hyzVar2.b);
            case 4:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.ibd.a.b().l("com/android/dialer/audio/impl/callaudiomanager/CallAudioManagerImpl", "registerCallListeners", 146, "CallAudioManagerImpl.java").v("constraints not fulfilled");
                    return j$.util.Optional.empty();
                }
                final java.lang.Object obj4 = this.a;
                defpackage.ibd ibdVar = (defpackage.ibd) obj4;
                final defpackage.hyv hyvVar = ibdVar.g;
                hyvVar.d.a(new defpackage.hyu() { // from class: ibb
                    @Override // defpackage.hyu
                    public final void a(final j$.util.Optional optional) {
                        if (i2 == 0) {
                            final defpackage.ibd ibdVar2 = (defpackage.ibd) hyvVar;
                            ahvr.J(ibdVar2.c.eU(ahqx.i(new java.util.concurrent.Callable() { // from class: iba
                                /* JADX WARN: Type inference failed for: r0v3, types: [aoin, java.lang.Object] */
                                /* JADX WARN: Type inference failed for: r1v10, types: [aoin, java.lang.Object] */
                                /* JADX WARN: Type inference failed for: r1v12, types: [aoin, java.lang.Object] */
                                /* JADX WARN: Type inference failed for: r1v14, types: [aoin, java.lang.Object] */
                                /* JADX WARN: Type inference failed for: r1v16, types: [aoin, java.lang.Object] */
                                /* JADX WARN: Type inference failed for: r1v18, types: [aoin, java.lang.Object] */
                                /* JADX WARN: Type inference failed for: r1v6, types: [aoin, java.lang.Object] */
                                /* JADX WARN: Type inference failed for: r1v8, types: [aoin, java.lang.Object] */
                                /* JADX WARN: Type inference failed for: r3v2, types: [aoin, java.lang.Object] */
                                @Override // java.util.concurrent.Callable
                                public final java.lang.Object call() {
                                    aimz aimzVar = defpackage.ibd.a;
                                    aimw aimwVarL = aimzVar.b().l("com/android/dialer/audio/impl/callaudiomanager/CallAudioManagerImpl", "setCurrentCallAudio", 185, "CallAudioManagerImpl.java");
                                    j$.util.Optional optional2 = optional;
                                    aimwVarL.y("callAttributes: %s", optional2);
                                    defpackage.ibd ibdVar3 = ibdVar2;
                                    java.util.concurrent.atomic.AtomicReference atomicReference = ibdVar3.i;
                                    j$.util.Optional optional3 = (j$.util.Optional) atomicReference.get();
                                    if (optional3.isPresent()) {
                                        if (((defpackage.iax) optional3.orElseThrow()).j.equals((true != optional2.isPresent() ? optional2 : j$.util.Optional.ofNullable(((defpackage.hzc) optional2.get()).a)).orElse((java.lang.Object) null))) {
                                            aimzVar.b().l("com/android/dialer/audio/impl/callaudiomanager/CallAudioManagerImpl", "setCurrentCallAudio", 192, "CallAudioManagerImpl.java").v("updating existing current call audio attributes");
                                            defpackage.iax iaxVar = (defpackage.iax) optional3.orElseThrow();
                                            agsm.i(98, ahvr.F(new defpackage.gzk(iaxVar, (defpackage.hzc) optional2.orElseThrow(), 2, null), iaxVar.g), "setCallAttributes failed", new java.lang.Object[0]);
                                            return null;
                                        }
                                        defpackage.iax iaxVar2 = (defpackage.iax) optional3.orElseThrow();
                                        ailj ailjVarK = iaxVar2.d.c().k();
                                        while (ailjVarK.hasNext()) {
                                            defpackage.hyw hywVar = (defpackage.hyw) ailjVarK.next();
                                            agsm.d("com/android/dialer/audio/impl/AudioMulticasterV2", "purgeCall", 80, hywVar.b.eT(ahqx.h(new defpackage.gra(hywVar, iaxVar2.j, 13, (byte[]) null))), zct.b, "Failed to purge call.", new java.lang.Object[0]);
                                        }
                                        ajcq ajcqVarF = ahvr.F(new defpackage.hkx(iaxVar2, 6), iaxVar2.g);
                                        defpackage.ibk ibkVar = (defpackage.ibk) iaxVar2.e.a();
                                        ajcq ajcqVarE = ibkVar.l.e(ahqx.b(new defpackage.ibi(ibkVar, iaxVar2.j, 1)), ibkVar.d);
                                        ahrv ahrvVarG = ahrv.g(ajcqVarF);
                                        defpackage.hky hkyVar = new defpackage.hky(iaxVar2, 2);
                                        ajct ajctVar = iaxVar2.h;
                                        agsm.i(97, ahrvVarG.i(hkyVar, ajctVar).i(new defpackage.hky(ajcqVarE, 3), ajctVar), "cleanup failed", new java.lang.Object[0]);
                                    }
                                    if (!optional2.isPresent()) {
                                        aimzVar.b().l("com/android/dialer/audio/impl/callaudiomanager/CallAudioManagerImpl", "setCurrentCallAudio", 201, "CallAudioManagerImpl.java").v("setting current call audio to empty");
                                        atomicReference.set(j$.util.Optional.empty());
                                        return null;
                                    }
                                    aimzVar.b().l("com/android/dialer/audio/impl/callaudiomanager/CallAudioManagerImpl", "setCurrentCallAudio", 205, "CallAudioManagerImpl.java").v("setting new current call audio");
                                    defpackage.iay iayVar = ibdVar3.e;
                                    defpackage.hzc hzcVar = (defpackage.hzc) optional2.orElseThrow();
                                    hzcVar.getClass();
                                    ajcu ajcuVar = (ajcu) iayVar.a.a();
                                    ajcuVar.getClass();
                                    ajct ajctVar2 = (ajct) iayVar.b.a();
                                    ajctVar2.getClass();
                                    ajct ajctVar3 = (ajct) iayVar.c.a();
                                    ajctVar3.getClass();
                                    defpackage.hyv hyvVar2 = (defpackage.hyv) iayVar.d.a();
                                    hyvVar2.getClass();
                                    defpackage.ifb ifbVar = (defpackage.ifb) iayVar.e.a();
                                    ifbVar.getClass();
                                    aigf aigfVar = (aigf) iayVar.f.a();
                                    aigfVar.getClass();
                                    atomicReference.set(j$.util.Optional.of(new defpackage.iax(hzcVar, ajcuVar, ajctVar2, ajctVar3, hyvVar2, ifbVar, aigfVar, iayVar.g, iayVar.h, iayVar.i)));
                                    return null;
                                }
                            })), ibdVar2.h, ajbm.a);
                            return;
                        }
                        defpackage.hyv.a.b().l("com/android/dialer/audio/impl/AudioControllerSelector", "onActiveCallUpdated", 90, "AudioControllerSelector.java").v("onActiveCallUpdated");
                        java.lang.Object obj5 = hyvVar;
                        ahoq ahoqVarW = ahvr.W(87, "AudioControllerSelector_onActiveCallUpdated");
                        try {
                            defpackage.hrx hrxVar = new defpackage.hrx(obj5, 6);
                            if (true == optional.isPresent()) {
                                java.lang.Object obj6 = optional.get();
                                java.lang.Object obj7 = hrxVar.a;
                                ((defpackage.hyv) obj7).b.g(((defpackage.hyv) obj7).e.eT(ahqx.h(new defpackage.gra(obj7, (defpackage.hzc) obj6, 12, (byte[]) null))), 5L, java.util.concurrent.TimeUnit.SECONDS);
                            }
                            ahoqVarW.close();
                        } catch (java.lang.Throwable th) {
                            try {
                                ahoqVarW.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                });
                ibdVar.f.a(new defpackage.hyu() { // from class: ibb
                    @Override // defpackage.hyu
                    public final void a(final j$.util.Optional optional) {
                        if (i == 0) {
                            final defpackage.ibd ibdVar2 = (defpackage.ibd) obj4;
                            ahvr.J(ibdVar2.c.eU(ahqx.i(new java.util.concurrent.Callable() { // from class: iba
                                /* JADX WARN: Type inference failed for: r0v3, types: [aoin, java.lang.Object] */
                                /* JADX WARN: Type inference failed for: r1v10, types: [aoin, java.lang.Object] */
                                /* JADX WARN: Type inference failed for: r1v12, types: [aoin, java.lang.Object] */
                                /* JADX WARN: Type inference failed for: r1v14, types: [aoin, java.lang.Object] */
                                /* JADX WARN: Type inference failed for: r1v16, types: [aoin, java.lang.Object] */
                                /* JADX WARN: Type inference failed for: r1v18, types: [aoin, java.lang.Object] */
                                /* JADX WARN: Type inference failed for: r1v6, types: [aoin, java.lang.Object] */
                                /* JADX WARN: Type inference failed for: r1v8, types: [aoin, java.lang.Object] */
                                /* JADX WARN: Type inference failed for: r3v2, types: [aoin, java.lang.Object] */
                                @Override // java.util.concurrent.Callable
                                public final java.lang.Object call() {
                                    aimz aimzVar = defpackage.ibd.a;
                                    aimw aimwVarL = aimzVar.b().l("com/android/dialer/audio/impl/callaudiomanager/CallAudioManagerImpl", "setCurrentCallAudio", 185, "CallAudioManagerImpl.java");
                                    j$.util.Optional optional2 = optional;
                                    aimwVarL.y("callAttributes: %s", optional2);
                                    defpackage.ibd ibdVar3 = ibdVar2;
                                    java.util.concurrent.atomic.AtomicReference atomicReference = ibdVar3.i;
                                    j$.util.Optional optional3 = (j$.util.Optional) atomicReference.get();
                                    if (optional3.isPresent()) {
                                        if (((defpackage.iax) optional3.orElseThrow()).j.equals((true != optional2.isPresent() ? optional2 : j$.util.Optional.ofNullable(((defpackage.hzc) optional2.get()).a)).orElse((java.lang.Object) null))) {
                                            aimzVar.b().l("com/android/dialer/audio/impl/callaudiomanager/CallAudioManagerImpl", "setCurrentCallAudio", 192, "CallAudioManagerImpl.java").v("updating existing current call audio attributes");
                                            defpackage.iax iaxVar = (defpackage.iax) optional3.orElseThrow();
                                            agsm.i(98, ahvr.F(new defpackage.gzk(iaxVar, (defpackage.hzc) optional2.orElseThrow(), 2, null), iaxVar.g), "setCallAttributes failed", new java.lang.Object[0]);
                                            return null;
                                        }
                                        defpackage.iax iaxVar2 = (defpackage.iax) optional3.orElseThrow();
                                        ailj ailjVarK = iaxVar2.d.c().k();
                                        while (ailjVarK.hasNext()) {
                                            defpackage.hyw hywVar = (defpackage.hyw) ailjVarK.next();
                                            agsm.d("com/android/dialer/audio/impl/AudioMulticasterV2", "purgeCall", 80, hywVar.b.eT(ahqx.h(new defpackage.gra(hywVar, iaxVar2.j, 13, (byte[]) null))), zct.b, "Failed to purge call.", new java.lang.Object[0]);
                                        }
                                        ajcq ajcqVarF = ahvr.F(new defpackage.hkx(iaxVar2, 6), iaxVar2.g);
                                        defpackage.ibk ibkVar = (defpackage.ibk) iaxVar2.e.a();
                                        ajcq ajcqVarE = ibkVar.l.e(ahqx.b(new defpackage.ibi(ibkVar, iaxVar2.j, 1)), ibkVar.d);
                                        ahrv ahrvVarG = ahrv.g(ajcqVarF);
                                        defpackage.hky hkyVar = new defpackage.hky(iaxVar2, 2);
                                        ajct ajctVar = iaxVar2.h;
                                        agsm.i(97, ahrvVarG.i(hkyVar, ajctVar).i(new defpackage.hky(ajcqVarE, 3), ajctVar), "cleanup failed", new java.lang.Object[0]);
                                    }
                                    if (!optional2.isPresent()) {
                                        aimzVar.b().l("com/android/dialer/audio/impl/callaudiomanager/CallAudioManagerImpl", "setCurrentCallAudio", 201, "CallAudioManagerImpl.java").v("setting current call audio to empty");
                                        atomicReference.set(j$.util.Optional.empty());
                                        return null;
                                    }
                                    aimzVar.b().l("com/android/dialer/audio/impl/callaudiomanager/CallAudioManagerImpl", "setCurrentCallAudio", 205, "CallAudioManagerImpl.java").v("setting new current call audio");
                                    defpackage.iay iayVar = ibdVar3.e;
                                    defpackage.hzc hzcVar = (defpackage.hzc) optional2.orElseThrow();
                                    hzcVar.getClass();
                                    ajcu ajcuVar = (ajcu) iayVar.a.a();
                                    ajcuVar.getClass();
                                    ajct ajctVar2 = (ajct) iayVar.b.a();
                                    ajctVar2.getClass();
                                    ajct ajctVar3 = (ajct) iayVar.c.a();
                                    ajctVar3.getClass();
                                    defpackage.hyv hyvVar2 = (defpackage.hyv) iayVar.d.a();
                                    hyvVar2.getClass();
                                    defpackage.ifb ifbVar = (defpackage.ifb) iayVar.e.a();
                                    ifbVar.getClass();
                                    aigf aigfVar = (aigf) iayVar.f.a();
                                    aigfVar.getClass();
                                    atomicReference.set(j$.util.Optional.of(new defpackage.iax(hzcVar, ajcuVar, ajctVar2, ajctVar3, hyvVar2, ifbVar, aigfVar, iayVar.g, iayVar.h, iayVar.i)));
                                    return null;
                                }
                            })), ibdVar2.h, ajbm.a);
                            return;
                        }
                        defpackage.hyv.a.b().l("com/android/dialer/audio/impl/AudioControllerSelector", "onActiveCallUpdated", 90, "AudioControllerSelector.java").v("onActiveCallUpdated");
                        java.lang.Object obj5 = obj4;
                        ahoq ahoqVarW = ahvr.W(87, "AudioControllerSelector_onActiveCallUpdated");
                        try {
                            defpackage.hrx hrxVar = new defpackage.hrx(obj5, 6);
                            if (true == optional.isPresent()) {
                                java.lang.Object obj6 = optional.get();
                                java.lang.Object obj7 = hrxVar.a;
                                ((defpackage.hyv) obj7).b.g(((defpackage.hyv) obj7).e.eT(ahqx.h(new defpackage.gra(obj7, (defpackage.hzc) obj6, 12, (byte[]) null))), 5L, java.util.concurrent.TimeUnit.SECONDS);
                            }
                            ahoqVarW.close();
                        } catch (java.lang.Throwable th) {
                            try {
                                ahoqVarW.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                });
                return null;
            case 5:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    j$.util.Optional optional = (j$.util.Optional) ((defpackage.ibd) this.a).i.get();
                    return optional.isPresent() ? j$.util.Optional.of((defpackage.iax) optional.orElseThrow()) : j$.util.Optional.empty();
                }
                defpackage.ibd.a.b().l("com/android/dialer/audio/impl/callaudiomanager/CallAudioManagerImpl", "getActiveCallAudio", 78, "CallAudioManagerImpl.java").v("constraints not fulfilled");
                return j$.util.Optional.empty();
            case 6:
                java.lang.Object obj5 = this.a;
                if (obj5 == defpackage.hxe.b || obj5 == defpackage.hxe.a) {
                    defpackage.ibk.a.b().l("com/android/dialer/audio/impl/callaudioplayer/CallAudioPlayer", "endCurrentPlayback", 174, "CallAudioPlayer.java").y("stopping MediaPlayer timed out on end reason: %S", new aepg((java.lang.Enum) obj5));
                    return null;
                }
                defpackage.ibk.a.d().m(aioa.b).l("com/android/dialer/audio/impl/callaudioplayer/CallAudioPlayer", "endCurrentPlayback", 178, "CallAudioPlayer.java").y("stopping MediaPlayer timed out on end reason: %S", new aepg((java.lang.Enum) obj5));
                return null;
            case 7:
                defpackage.ibk.a.c().k((java.lang.IllegalStateException) obj).l("com/android/dialer/audio/impl/callaudioplayer/CallAudioPlayer", "playInternal", 241, "CallAudioPlayer.java").v("Failed to create/start MediaPlayer");
                ((defpackage.ibk) this.a).g.o(rmx.zH);
                return null;
            case 8:
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(((j$.util.Optional) obj).isPresent());
                defpackage.ibo iboVar = (defpackage.ibo) this.a;
                iboVar.d = boolValueOf;
                return iboVar.d;
            case 9:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                defpackage.ibs ibsVar = (defpackage.ibs) this.a;
                if (ibsVar.d.equals(optional2)) {
                    defpackage.ibs.a.b().l("com/android/dialer/audio/impl/tidepods/AudioAvailableCallAttributesUpdatePropagator", "updateModelAndPropagate", 141, "AudioAvailableCallAttributesUpdatePropagator.java").v("no new model to propagate");
                    return null;
                }
                ibsVar.d = optional2;
                aimw aimwVarL = defpackage.ibs.a.b().l("com/android/dialer/audio/impl/tidepods/AudioAvailableCallAttributesUpdatePropagator", "updateModelAndPropagate", 146, "AudioAvailableCallAttributesUpdatePropagator.java");
                java.util.Set set = ibsVar.c;
                aimwVarL.w("propagating update to %d audioAvailableCallAttributesListeners", set.size());
                java.util.Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((defpackage.hyu) it.next()).a(optional2);
                }
                return null;
            case 10:
                j$.util.Optional optional3 = (j$.util.Optional) obj;
                defpackage.ida idaVar = new defpackage.ida(this.a, 2);
                if (true == optional3.isPresent()) {
                    return true != ((defpackage.iax) optional3.get()).j.equals(((defpackage.idh) idaVar.a).a) ? j$.util.Optional.empty() : optional3;
                }
                return optional3;
            case 11:
                j$.util.Optional optional4 = (j$.util.Optional) obj;
                defpackage.ida idaVar2 = new defpackage.ida(this.a, i);
                if (true == optional4.isPresent()) {
                    return true != ((defpackage.iax) optional4.get()).j.equals(((defpackage.idh) idaVar2.a).a) ? j$.util.Optional.empty() : optional4;
                }
                return optional4;
            case 12:
                return this.a.a(obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return a.l((aonj) this.a, obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                java.lang.Throwable th = (java.lang.Throwable) obj;
                if (((java.lang.Boolean) ((jna) this.a).e.a()).booleanValue()) {
                    a.by(jna.a.b(), "ForegroundService start failed asynchronously; suppressed to prevent unhandled exception.", "com/android/dialer/broadcastreceiverstrategy/impl/BroadcastReceiverStrategyImpl", "launchForegroundService", (char) 194, "BroadcastReceiverStrategyImpl.java", th);
                    return null;
                }
                ahzn.c(th);
                throw new java.lang.IllegalStateException(th);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                android.content.Context context = (android.content.Context) ((aogc) this.a).c;
                defpackage.dva dvaVar = new defpackage.dva(context, "phone_low_priority");
                dvaVar.t = urg.c(context, 2130969072);
                dvaVar.d(16, true);
                dvaVar.d(8, true);
                dvaVar.m();
                dvaVar.h(context.getString(2132018759));
                return dvaVar.a();
            case 16:
                return (android.speech.tts.TextToSpeech) ((java.util.concurrent.atomic.AtomicReference) this.a).get();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                android.speech.tts.TextToSpeech textToSpeech = (android.speech.tts.TextToSpeech) obj;
                try {
                    java.io.File fileCreateTempFile = java.io.File.createTempFile("call_announcer_temp_tts_file", null, ((defpackage.jns) this.a).b.getCacheDir());
                    textToSpeech.synthesizeToFile("", new android.os.Bundle(), fileCreateTempFile, "call_announcer_prewarm_tts");
                    fileCreateTempFile.deleteOnExit();
                    return null;
                } catch (java.io.IOException e) {
                    a.bq(defpackage.jns.a.c(), "Failure while requesting to pre-warm TTS", "com/android/dialer/callannouncer/impl/prewarmer/CallAnnouncerTtsPrewarmerImpl", "prewarmTtsForSystemLocale", 'y', "CallAnnouncerTtsPrewarmerImpl.java", e, zct.b);
                    return null;
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                defpackage.jor jorVarB = defpackage.jor.b(((jos) obj).b);
                if (jorVarB == null) {
                    jorVarB = defpackage.jor.UNRECOGNIZED;
                }
                defpackage.jor jorVar = jorVarB;
                return (((java.lang.Boolean) ((defpackage.ifb) this.a).e.a()).booleanValue() && jorVar == defpackage.jor.INVALID) ? defpackage.jor.HEADSET : jorVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return j$.util.Optional.empty();
                }
                java.lang.Object obj6 = this.a;
                rus rusVar3 = new rus();
                rusVar3.d(ruz.a);
                rusVar3.c(rvc.c);
                rusVar3.e(new rva(2132017915));
                rusVar3.b(((sgf) obj6).a.getDrawable(2131231990));
                return j$.util.Optional.of(rusVar3.a());
            default:
                aimz aimzVar = jsk.a;
                aigb aigbVar = new aigb(4);
                ailj ailjVarK = ((aigf) obj).e().k();
                while (ailjVarK.hasNext()) {
                    java.lang.Object obj7 = this.a;
                    java.util.Map.Entry entry = (java.util.Map.Entry) ailjVarK.next();
                    java.lang.String str = (java.lang.String) entry.getKey();
                    defpackage.jsj jsjVar = (defpackage.jsj) entry.getValue();
                    ailj ailjVarK2 = ((aihd) ((aigf) obj7).get(str)).k();
                    while (ailjVarK2.hasNext()) {
                        aigbVar.i((defpackage.hkd) ailjVarK2.next(), jsjVar);
                    }
                }
                return aigbVar.e(true);
        }
    }
}
