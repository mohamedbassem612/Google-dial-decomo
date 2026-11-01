package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wwy implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ wwy(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r13v11, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v19, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v31, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r13v98, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v2, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [aoin, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() throws java.io.IOException {
        int i = 16;
        int i2 = 0;
        switch (this.$cid) {
            case 0:
                java.lang.Object obj = this.a;
                try {
                    try {
                        if (((defpackage.wxb) obj).j.isPresent()) {
                            ((java.io.OutputStream) ((defpackage.wxb) obj).j.orElseThrow()).close();
                        }
                        break;
                    } catch (java.io.IOException e) {
                        defpackage.wxb.a.c().i(zct.b).k(e).l("com/android/incallui/atlas/detection/techniques/holddetection/HoldDetectionModelRunner", "closeResources", 251, "HoldDetectionModelRunner.java").v("failed to close the output stream");
                        break;
                    }
                    defpackage.wxb wxbVar = (defpackage.wxb) obj;
                    wxbVar.j = j$.util.Optional.empty();
                    if (wxbVar.i.isPresent()) {
                        ((alje) wxbVar.i.orElseThrow()).g();
                        wxbVar.i = j$.util.Optional.empty();
                        defpackage.wxb.a.b().l("com/android/incallui/atlas/detection/techniques/holddetection/HoldDetectionModelRunner", "closeResources", 259, "HoldDetectionModelRunner.java").v("The hold detection model conversation is stopped.");
                    }
                    return null;
                } catch (java.lang.Throwable th) {
                    ((defpackage.wxb) obj).j = j$.util.Optional.empty();
                    throw th;
                }
            case 1:
                defpackage.ahdv ahdvVar = (defpackage.ahdv) this.a;
                ajcu ajcuVar = (ajcu) ahdvVar.e.a();
                ajcuVar.getClass();
                ajcu ajcuVar2 = (ajcu) ahdvVar.c.a();
                ajcuVar2.getClass();
                ajcu ajcuVar3 = (ajcu) ahdvVar.d.a();
                ajcuVar3.getClass();
                ((aazc) ahdvVar.b.a()).getClass();
                defpackage.wvq wvqVar = (defpackage.wvq) ahdvVar.a.a();
                wvqVar.getClass();
                defpackage.aljf aljfVar = (defpackage.aljf) ahdvVar.f.a();
                aljfVar.getClass();
                defpackage.wzx wzxVar = (defpackage.wzx) ahdvVar.g.a();
                wzxVar.getClass();
                return new defpackage.wxb(ajcuVar, ajcuVar2, ajcuVar3, wvqVar, aljfVar, wzxVar);
            case 2:
                ((defpackage.wxc) this.a).g.set(false);
                return null;
            case 3:
                return rlt.a(((defpackage.wyn) this.a).d, (android.telecom.PhoneAccountHandle) null);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return (aify) j$.util.Collection.-EL.stream((java.util.Collection) this.a).map(new defpackage.wyd(3)).filter(new defpackage.wrm(5)).collect(aido.a);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aift aiftVar = new aift(4);
                while (true) {
                    ?? r1 = this.a;
                    if (i2 >= r1.size()) {
                        return aiftVar.h();
                    }
                    j$.util.Optional optional = (j$.util.Optional) aiql.H((java.util.concurrent.Future) r1.get(i2));
                    if (optional.isPresent()) {
                        java.io.File file = new java.io.File(((idv) optional.orElseThrow()).c);
                        if (file.exists()) {
                            java.lang.String name = file.getName();
                            if (name == null) {
                                throw new java.lang.NullPointerException("Null fileName");
                            }
                            akzc akzcVarA = defpackage.wze.a(file);
                            if (akzcVarA == null) {
                                throw new java.lang.NullPointerException("Null audioData");
                            }
                            aiftVar.i(new defpackage.wzi(name, akzcVarA));
                            if (!file.delete()) {
                                defpackage.wze.a.d().l("com/android/incallui/atlas/ui/impl/database/postcall/AtlasAudioDonationScottyUploader", "prepareAudioUploadForScotty", 109, "AtlasAudioDonationScottyUploader.java").y("unable to delete compressed audio file %s", file.getName());
                            }
                        } else {
                            defpackage.wze.a.d().l("com/android/incallui/atlas/ui/impl/database/postcall/AtlasAudioDonationScottyUploader", "prepareAudioUploadForScotty", 99, "AtlasAudioDonationScottyUploader.java").y("file %s doesn't exist", file.getName());
                        }
                    } else {
                        defpackage.wze.a.d().l("com/android/incallui/atlas/ui/impl/database/postcall/AtlasAudioDonationScottyUploader", "prepareAudioUploadForScotty", 92, "AtlasAudioDonationScottyUploader.java").v("failed to encode audio data");
                    }
                    i2++;
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return defpackage.wze.a(new java.io.File((java.lang.String) this.a));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                wzh wzhVar = (wzh) this.a;
                wzhVar.h.o(rmx.jp);
                long epochMilli = j$.time.Instant.now().toEpochMilli() - wzh.e;
                defpackage.wyw wywVar = wzhVar.i;
                agsm.i(1145, ahrv.g(((wzd) wywVar.b).e(epochMilli)).i(new defpackage.wyv(wywVar, i2), (java.util.concurrent.Executor) wywVar.a), "could not clear metrics", new java.lang.Object[0]);
                return null;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                if (!((xtq) this.a).d()) {
                    return j$.util.Optional.empty();
                }
                defpackage.oum oumVar = new defpackage.oum();
                oumVar.d(defpackage.ous.HOLD_FOR_ME);
                oumVar.b(new defpackage.ouo(2131232008, 2131101156));
                oumVar.c(2132017426);
                return j$.util.Optional.of(oumVar.a());
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.xbf xbfVar = (defpackage.xbf) this.a;
                if (!xbfVar.d.isPresent()) {
                    defpackage.xbf.a.b().l("com/android/incallui/atlas/ui/impl/tidepods/logger/HoldForMeCallAudioLogger", "save", 104, "HoldForMeCallAudioLogger.java").v("nothing logged");
                    return j$.util.Optional.empty();
                }
                akzx akzxVar = xbfVar.e;
                long epochMilli2 = j$.time.Instant.now().toEpochMilli();
                akzxVar.u();
                defpackage.wzw wzwVar = (defpackage.wzw) akzxVar.b;
                defpackage.wzw wzwVar2 = defpackage.wzw.a;
                wzwVar.b |= 4;
                wzwVar.e = epochMilli2;
                defpackage.wzw wzwVar3 = (defpackage.wzw) akzxVar.p();
                ((java.io.FileOutputStream) xbfVar.d.orElseThrow()).close();
                xbfVar.d = j$.util.Optional.empty();
                akzxVar.x();
                return j$.util.Optional.of(wzwVar3);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.xbf xbfVar2 = (defpackage.xbf) this.a;
                if (!xbfVar2.d.isPresent()) {
                    long epochMilli3 = j$.time.Instant.now().toEpochMilli();
                    java.io.File file2 = new java.io.File(xbfVar2.b.getCacheDir(), java.lang.String.format(java.util.Locale.US, "atlas_call_recording_%d.pcm", java.lang.Long.valueOf(epochMilli3)));
                    akzx akzxVar2 = xbfVar2.e;
                    java.lang.String absolutePath = file2.getAbsolutePath();
                    akzxVar2.u();
                    defpackage.wzw wzwVar4 = (defpackage.wzw) akzxVar2.b;
                    defpackage.wzw wzwVar5 = defpackage.wzw.a;
                    j$.util.Objects.requireNonNull(absolutePath);
                    wzwVar4.b |= 1;
                    wzwVar4.c = absolutePath;
                    akzxVar2.u();
                    defpackage.wzw wzwVar6 = (defpackage.wzw) akzxVar2.b;
                    wzwVar6.b |= 16;
                    wzwVar6.g = 16000;
                    akzxVar2.u();
                    defpackage.wzw wzwVar7 = (defpackage.wzw) akzxVar2.b;
                    wzwVar7.b |= 2;
                    wzwVar7.d = epochMilli3;
                    xbfVar2.d = j$.util.Optional.of(new java.io.FileOutputStream(file2));
                    return null;
                }
                return null;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.wzw wzwVar8 = (defpackage.wzw) this.a;
                if (!wzwVar8.c.isEmpty()) {
                    java.io.File file3 = new java.io.File(wzwVar8.c);
                    if (file3.exists() && !file3.delete()) {
                        defpackage.xbf.a.c().m(aioa.b).l("com/android/incallui/atlas/ui/impl/tidepods/logger/HoldForMeCallAudioLogger", "erasePersistedAudio", 141, "HoldForMeCallAudioLogger.java").y("unable to delete file %s", file3.getName());
                        return null;
                    }
                }
                return null;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.xbk xbkVar = (defpackage.xbk) this.a;
                xbkVar.o = defpackage.wvd.a;
                xbkVar.r = true;
                xbkVar.p = j$.util.Optional.empty();
                xbkVar.q = j$.util.Optional.empty();
                return null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.xcc xccVar = (defpackage.xcc) this.a;
                if (xccVar.i) {
                    defpackage.xcc.a.b().l("com/android/incallui/atlas/ui/impl/tidepods/service/callvolumemonitor/HoldForMeCallVolumeMonitor", "stop", 98, "HoldForMeCallVolumeMonitor.java").v("stop");
                    xccVar.i = false;
                    xccVar.e.unregisterReceiver(xccVar.j);
                    return null;
                }
                return null;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.xcc xccVar2 = (defpackage.xcc) this.a;
                if (!xccVar2.i) {
                    defpackage.xcc.a.b().l("com/android/incallui/atlas/ui/impl/tidepods/service/callvolumemonitor/HoldForMeCallVolumeMonitor", "start", 81, "HoldForMeCallVolumeMonitor.java").v("start");
                    dvx.f(xccVar2.e, xccVar2.j, new android.content.IntentFilter("android.media.VOLUME_CHANGED_ACTION"), (java.lang.String) null, 2);
                    xccVar2.i = true;
                    return null;
                }
                return null;
            case 15:
                java.lang.Object obj2 = this.a;
                defpackage.xcn xcnVar = (defpackage.xcn) obj2;
                if (!xcnVar.h.isPresent()) {
                    defpackage.xcn.a.b().l("com/android/incallui/atlas/ui/impl/tidepods/service/ringtone/HoldForMeRingtoneController", "stopRinging", 215, "HoldForMeRingtoneController.java").v("no ringtone is being played");
                    return null;
                }
                a.bI(defpackage.xcn.a.b(), "stop ringing", "com/android/incallui/atlas/ui/impl/tidepods/service/ringtone/HoldForMeRingtoneController", "stopRinging", (char) 219, "HoldForMeRingtoneController.java", zct.a);
                j$.util.Optional optional2 = xcnVar.i;
                if (true == optional2.isPresent()) {
                    ((ogj) optional2.get()).f();
                }
                xcnVar.g.cancel();
                j$.util.Optional optional3 = xcnVar.j;
                defpackage.xch xchVar = new defpackage.xch(obj2, i2);
                if (true == optional3.isPresent()) {
                    ((defpackage.xcn) xchVar.a).d((defpackage.xcm) optional3.get());
                }
                xcnVar.j = j$.util.Optional.empty();
                xcnVar.h = j$.util.Optional.empty();
                return null;
            case 16:
                defpackage.xcq xcqVar = (defpackage.xcq) this.a;
                java.util.concurrent.atomic.AtomicReference atomicReference = xcqVar.h;
                defpackage.xco xcoVar = (defpackage.xco) ((j$.util.Optional) atomicReference.get()).orElse((java.lang.Object) null);
                if (xcoVar != null) {
                    atomicReference.set(j$.util.Optional.empty());
                    if (xcoVar.ordinal() == 4) {
                        xcqVar.g(defpackage.alex.USER_OFFHOLD_CONFIRMATION_DIALOG_CANCEL);
                        return null;
                    }
                }
                return null;
            case 17:
                defpackage.xcq xcqVar2 = (defpackage.xcq) this.a;
                rwi rwiVar = xcqVar2.d;
                if (((java.lang.Boolean) new mgf(rwiVar.e, rwiVar.d.isNotificationPolicyAccessGranted()).a(mgv.cA).f()).booleanValue()) {
                    a.bI(defpackage.xcq.a.b(), "DND access granted", "com/android/incallui/atlas/ui/impl/tidepods/session/AtlasSessionController", "canRing", (char) 290, "AtlasSessionController.java", zct.a);
                    return java.lang.Boolean.TRUE;
                }
                boolean z = rwiVar.a() != 1;
                boolean z2 = xcqVar2.e.c() == 0;
                defpackage.xcq.a.b().i(zct.a).l("com/android/incallui/atlas/ui/impl/tidepods/session/AtlasSessionController", "canRing", 302, "AtlasSessionController.java").L("DND on: %b, ringer silent: %b", z, z2);
                return java.lang.Boolean.valueOf((z || z2) ? false : true);
            case 18:
                return java.lang.Boolean.valueOf(android.preference.PreferenceManager.getDefaultSharedPreferences(((android.content.Context) this.a).getApplicationContext()).getBoolean("com.android.voicemail.impl.is_shutting_down", false));
            case 19:
                java.lang.String str = "DialerCall_" + ((java.util.concurrent.atomic.AtomicInteger) ((zjm) this.a).a).getAndIncrement();
                java.lang.String string = java.util.UUID.randomUUID().toString();
                aooh.e(string, "toString(...)");
                return new defpackage.zhq(str, string);
            default:
                return (aihd) j$.util.Collection.-EL.stream((java.util.Collection) this.a).map(new defpackage.yoz(13)).filter(new defpackage.wrm(15)).filter(new defpackage.wrm(i)).map(new defpackage.yoz(10)).collect(aido.b);
        }
    }
}
