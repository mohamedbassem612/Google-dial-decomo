package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jyr implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ jyr(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v103, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v105, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, java.util.List] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        int i = 8;
        int i2 = 2;
        int i3 = 0;
        int iValueOf = 0;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                jys jysVar = (jys) this.a;
                if (jysVar.c()) {
                    rsr rsrVarD = jys.d(aike.a);
                    android.database.Cursor cursorB = jysVar.d.b(android.provider.CallLog.Calls.CONTENT_URI, new java.lang.String[]{"_id"}, (java.lang.String) rsrVarD.b, (java.lang.String[]) rsrVarD.a, (java.lang.String) null);
                    try {
                        if (cursorB == null) {
                            jys.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/calllog/clearmissedcalls/ClearMissedCalls", "getUnreadMissedCallCount", 249, "ClearMissedCalls.java").v("null cursor");
                        } else {
                            iValueOf = java.lang.Integer.valueOf(cursorB.getCount());
                            cursorB.close();
                        }
                        break;
                    } catch (java.lang.Throwable th) {
                        if (cursorB == null) {
                            throw th;
                        }
                        try {
                            cursorB.close();
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                return iValueOf;
            case 1:
                ((defpackage.jxm) this.a).z.i((java.lang.String) null).a(mcd.q);
                return null;
            case 2:
                return ((zjm) this.a).g();
            case 3:
                return a.m((java.util.List) this.a);
            case 4:
                defpackage.kww.a.b().l("com/android/dialer/callrecording/impl/logger/CallRecordingLogger", "logCrosbyRecordingForCall", 155, "CallRecordingLogger.java").v("logging automatic call recording");
                akzx akzxVar = ((defpackage.kww) this.a).k;
                akzxVar.u();
                amoy amoyVar = akzxVar.b;
                amoy amoyVar2 = amoy.a;
                amoyVar.b |= 4;
                amoyVar.e = true;
                return null;
            case 5:
                a.bI(defpackage.kww.a.d(), "logging single recording failure", "com/android/dialer/callrecording/impl/logger/CallRecordingLogger", "logFailure", (char) 223, "CallRecordingLogger.java", zct.b);
                defpackage.kww kwwVar = (defpackage.kww) this.a;
                akzx akzxVar2 = kwwVar.k;
                akzxVar2.u();
                amoy amoyVar3 = akzxVar2.b;
                amoy amoyVar4 = amoy.a;
                amoyVar3.b |= 1;
                amoyVar3.c = false;
                kwwVar.f.add(akzxVar2.p());
                kwwVar.c();
                return null;
            case 6:
                akzx akzxVarM = amoz.a.m();
                j$.util.Objects.requireNonNull(akzxVarM);
                defpackage.fcg fcgVar = new defpackage.fcg(akzxVarM, i);
                defpackage.kww kwwVar2 = (defpackage.kww) this.a;
                j$.lang.Iterable.-EL.forEach(kwwVar2.f, fcgVar);
                j$.util.Optional optional = kwwVar2.h;
                j$.util.Objects.requireNonNull(akzxVarM);
                defpackage.kwv kwvVar = new defpackage.kwv(akzxVarM, i3);
                if (true == optional.isPresent()) {
                    java.lang.Object obj = optional.get();
                    akzx akzxVar3 = (akzx) kwvVar.a;
                    akzxVar3.u();
                    amoz amozVar = akzxVar3.b;
                    j$.util.Objects.requireNonNull(obj);
                    amozVar.b |= 4;
                    amozVar.f = (java.lang.String) obj;
                }
                j$.util.Optional optional2 = kwwVar2.i;
                j$.util.Objects.requireNonNull(akzxVarM);
                defpackage.kwv kwvVar2 = new defpackage.kwv(akzxVarM, i2);
                if (true == optional2.isPresent()) {
                    java.lang.Object obj2 = optional2.get();
                    java.lang.Object obj3 = kwvVar2.a;
                    int iIntValue = ((java.lang.Integer) obj2).intValue();
                    akzx akzxVar4 = (akzx) obj3;
                    akzxVar4.u();
                    amoz amozVar2 = akzxVar4.b;
                    amozVar2.b |= 1;
                    amozVar2.d = iIntValue;
                }
                j$.util.Optional optional3 = kwwVar2.j;
                j$.util.Objects.requireNonNull(akzxVarM);
                defpackage.kwv kwvVar3 = new defpackage.kwv(akzxVarM, 3);
                if (true == optional3.isPresent()) {
                    java.lang.Object obj4 = optional3.get();
                    java.lang.Object obj5 = kwvVar3.a;
                    int iIntValue2 = ((java.lang.Integer) obj4).intValue();
                    akzx akzxVar5 = (akzx) obj5;
                    akzxVar5.u();
                    amoz amozVar3 = akzxVar5.b;
                    amozVar3.b |= 2;
                    amozVar3.e = iIntValue2;
                }
                return akzxVarM.p();
            case 7:
                return ((defpackage.kxx) this.a).a().equals(j$.util.Optional.of(defpackage.kxw.b)) ? j$.util.Optional.of(qtz.d) : j$.util.Optional.empty();
            case 8:
                return ((defpackage.kxx) this.a).a().equals(j$.util.Optional.of(defpackage.kxw.a)) ? j$.util.Optional.of(qtz.e) : j$.util.Optional.empty();
            case 9:
                return ((defpackage.kxx) this.a).i.get() ? j$.util.Optional.of(qtu.f) : j$.util.Optional.empty();
            case 10:
                aimz aimzVar = lbl.a;
                ailj ailjVarK = ((aifo) this.a).k();
                while (ailjVarK.hasNext()) {
                    kui kuiVar = (kui) ailjVarK.next();
                    if (kuiVar != null && (kuiVar.b & 1) != 0) {
                        java.io.File file = new java.io.File(kuiVar.c);
                        if (file.exists()) {
                            j$.nio.file.Files.delete(j$.io.FileRetargetClass.toPath(file));
                        }
                    }
                }
                return null;
            case 11:
                aimz aimzVar2 = lbl.a;
                aigb aigbVar = new aigb(4);
                java.util.Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    aigbVar.l((java.util.Map) aiql.H((ajcq) it.next()));
                }
                return aigbVar.e(true);
            case 12:
                java.io.File file2 = new java.io.File(((lbl) this.a).b.getFilesDir(), "callrecording");
                if (file2.exists()) {
                    java.math.BigInteger bigInteger = apqv.a;
                    try {
                        j$.util.Objects.requireNonNull(file2, "directory");
                        if (!file2.isDirectory()) {
                            if (file2.exists()) {
                                throw new java.lang.IllegalArgumentException("Parameter 'directory' is not a directory: '" + file2.toString() + '\'');
                            }
                            throw new java.io.FileNotFoundException("Directory '" + file2.toString() + "' does not exist.");
                        }
                        try {
                            j$.nio.file.Path path = j$.io.FileRetargetClass.toPath(file2);
                            int i4 = apre.a;
                            int i5 = aprd.b;
                            apra apraVar = new apra();
                            apraVar.b = new aprb();
                            aprd aprdVar = new aprd(apraVar);
                            j$.nio.file.Files.walkFileTree(path, aprdVar);
                            long j = aprdVar.a.a.a;
                            java.lang.Long.valueOf(j).getClass();
                            return java.lang.Integer.valueOf((int) j);
                        } catch (java.io.IOException e) {
                            throw new java.io.UncheckedIOException(e);
                        }
                    } catch (java.io.FileNotFoundException e2) {
                        throw new java.io.UncheckedIOException(e2);
                    }
                }
                return iValueOf;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                java.lang.Object obj6 = this.a;
                lbq lbqVar = (lbq) obj6;
                java.util.Locale localeB = lbqVar.d.b();
                lbq.a.b().l("com/android/dialer/callrecording/impl/ttsprewarm/TtsPreWarm", "configureTts", 123, "TtsPreWarm.java").y("initializing TTS with %s locale", localeB);
                java.util.concurrent.atomic.AtomicReference atomicReference = lbqVar.f;
                ((android.speech.tts.TextToSpeech) ((j$.util.Optional) atomicReference.get()).orElseThrow()).setLanguage(localeB);
                try {
                    java.io.File fileCreateTempFile = java.io.File.createTempFile("tmpsynthesize", null, ((lbq) obj6).e.getCacheDir());
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("com.google.android.tts:Mode", "LocalOnly");
                    j$.util.Optional optional4 = (j$.util.Optional) atomicReference.get();
                    defpackage.hvp hvpVar = new defpackage.hvp(bundle, fileCreateTempFile, i, bArr);
                    if (true == optional4.isPresent()) {
                        ((android.speech.tts.TextToSpeech) optional4.get()).synthesizeToFile("", (android.os.Bundle) hvpVar.b, (java.io.File) hvpVar.a, "dummytext");
                    }
                    fileCreateTempFile.deleteOnExit();
                    break;
                } catch (java.io.IOException e3) {
                    a.bq(lbq.a.c(), "failed to synthesize an empty string", "com/android/dialer/callrecording/impl/ttsprewarm/TtsPreWarm", "configureTts", (char) 147, "TtsPreWarm.java", e3, zct.b);
                }
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                defpackage.lkq lkqVar = (defpackage.lkq) this.a;
                defpackage.ljx ljxVar = lkqVar.g;
                if ((ljxVar.b & 2) != 0) {
                    defpackage.ljz ljzVar = ljxVar.d;
                    if (ljzVar == null) {
                        ljzVar = defpackage.ljz.a;
                    }
                    if (!ljzVar.c.isEmpty()) {
                        defpackage.ljz ljzVar2 = lkqVar.g.d;
                        if (ljzVar2 == null) {
                            ljzVar2 = defpackage.ljz.a;
                        }
                        try {
                            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(ljzVar2.c);
                            try {
                                j$.util.Optional optionalOf = j$.util.Optional.of((defpackage.lkb) alad.A(defpackage.lkb.a, fileInputStream, akzq.a()));
                                fileInputStream.close();
                                return optionalOf;
                            } catch (java.lang.Throwable th3) {
                                try {
                                    fileInputStream.close();
                                    throw th3;
                                } catch (java.lang.Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        } catch (java.io.IOException e4) {
                            a.bq(defpackage.lcl.a.c(), "unable to read call screen session metrics", "com/android/dialer/callscreen/impl/donation/scotty/CallScreenDonationScottyUploader", "readCallScreenSessionMetricsFromFile", (char) 289, "CallScreenDonationScottyUploader.java", e4, zct.b);
                            return j$.util.Optional.empty();
                        }
                    }
                }
                defpackage.lcl.a.b().l("com/android/dialer/callscreen/impl/donation/scotty/CallScreenDonationScottyUploader", "readCallScreenSessionMetricsFromFile", 270, "CallScreenDonationScottyUploader.java").v("no call screen metrics file");
                return j$.util.Optional.empty();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
            case 16:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return this.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                for (java.lang.String str : this.a) {
                    if (!android.text.TextUtils.isEmpty(str)) {
                        java.io.File file3 = new java.io.File(str);
                        if (file3.exists() && !android.text.TextUtils.isEmpty(str) && !file3.delete()) {
                            a.bI(ldb.a.d(), "unable to delete audio recording file", "com/android/dialer/callscreen/impl/history/CallScreenDataLoaderImpl", "deleteFiles", (char) 178, "CallScreenDataLoaderImpl.java", zct.b);
                        }
                    }
                }
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return (java.util.List) this.a.call();
            default:
                defpackage.lem lemVar = (defpackage.lem) this.a;
                if (lemVar.f.isPresent()) {
                    if (lemVar.g) {
                        defpackage.lem.a.b().l("com/android/dialer/callscreen/impl/service/CallScreenAudioPreparer", "restoreAudioRouteAfterListening", 94, "CallScreenAudioPreparer.java").v("unmuting BT audio stream");
                        lemVar.d.adjustStreamVolume(6, 100, 0);
                    }
                    lemVar.c.e((zmw) lemVar.f.orElseThrow());
                } else {
                    defpackage.lem.a.b().l("com/android/dialer/callscreen/impl/service/CallScreenAudioPreparer", "restoreAudioRouteAfterListening", 90, "CallScreenAudioPreparer.java").v("previous audio route not found.");
                }
                return null;
        }
    }
}
