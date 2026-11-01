package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class zpk implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public zpk(adqu adquVar, java.lang.Runnable runnable, int i) {
        this.$cid = i;
        this.a = runnable;
        j$.util.Objects.requireNonNull(adquVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v100, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r11v25, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v28, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r11v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v32, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v66, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v92, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v94 */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() throws java.lang.Throwable {
        aoiu aoiuVar;
        j$.util.Optional optionalOf;
        j$.util.Optional optionalEmpty;
        java.io.InputStream inputStreamOpenRawResource;
        defpackage.alfo alfoVar;
        java.lang.Object obj;
        java.lang.Throwable cause = null;
        ?? r3 = 0;
        switch (this.$cid) {
            case 0:
                aigb aigbVar = new aigb(4);
                for (java.util.Map.Entry entry : this.a.entrySet()) {
                    aigbVar.i((java.lang.String) entry.getKey(), aiql.H((java.util.concurrent.Future) entry.getValue()));
                }
                return aigbVar.e(true);
            case 1:
                aihb aihbVar = new aihb();
                ailj ailjVarK = ((aihd) this.a).k();
                while (ailjVarK.hasNext()) {
                    try {
                        j$.util.Optional optional = (j$.util.Optional) aiql.H((ajcq) ailjVarK.next());
                        defpackage.xch xchVar = new defpackage.xch(aihbVar, 13);
                        if (true == optional.isPresent()) {
                            ((aihb) xchVar.a).i(optional.get());
                        }
                    } catch (java.lang.Exception e) {
                        if (cause == null) {
                            cause = e.getCause();
                        } else {
                            cause.addSuppressed(e.getCause());
                        }
                    }
                }
                if (cause == null) {
                    return aihbVar.h();
                }
                throw new java.lang.IllegalStateException(cause);
            case 2:
                hiv hivVar = (hiv) ((defpackage.afpl) this.a).a;
                hivVar.b();
                return hivVar.a();
            case 3:
                akzx akzxVarM = defpackage.zuc.a.m();
                boolean zIsRoleHeld = fn$.ExternalSyntheticApiModelOutline0.m(((defpackage.zuy) this.a).a.getSystemService("role")).isRoleHeld("android.app.role.DIALER");
                akzxVarM.u();
                defpackage.zuc zucVar = (defpackage.zuc) akzxVarM.b;
                zucVar.b |= 1;
                zucVar.c = zIsRoleHeld;
                return (defpackage.zuc) akzxVarM.p();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return (java.lang.Void) aazc.t((aaum) this.a);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aiof aiofVar = acea.a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.util.Map.Entry entry2 : this.a.entrySet()) {
                    akjc akjcVar = (akjc) entry2.getKey();
                    try {
                        android.content.Intent intent = (android.content.Intent) aiql.H((ajcq) entry2.getValue());
                        if (intent != null) {
                            akjb akjbVarB = akjb.b(akjcVar.e);
                            if (akjbVarB == null) {
                                akjbVarB = akjb.a;
                            }
                            aoiuVar = new aoiu(akjbVarB, intent);
                        } else {
                            aoiuVar = null;
                        }
                    } catch (java.lang.Exception e2) {
                        aiob aiobVarK = acea.a.d().k(e2);
                        akjb akjbVarB2 = akjb.b(akjcVar.e);
                        if (akjbVarB2 == null) {
                            akjbVarB2 = akjb.a;
                        }
                        aiobVarK.I("Failed to add intent for action of type [%s] and text [%s]", akjbVarB2.name(), akjcVar.f);
                    }
                    if (aoiuVar != null) {
                        arrayList.add(aoiuVar);
                    }
                }
                return ajsz.aR(arrayList);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ?? r11 = this.a;
                aiof aiofVar2 = acea.a;
                return (adtz) aiql.H((java.util.concurrent.Future) r11);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.util.Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    defpackage.acwa acwaVar = (defpackage.acwa) aiql.H((ajcq) it.next());
                    if (acwaVar != defpackage.acwa.NONE && acwaVar != defpackage.acwa.SUBSCRIBED) {
                        return java.lang.Boolean.FALSE;
                    }
                }
                return java.lang.Boolean.TRUE;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                acup.b((java.util.Collection) this.a, "Failed to add file groups", new java.lang.Object[0]);
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                java.lang.Object obj2 = this.a;
                return ((defpackage.adow) obj2).f.eV(new defpackage.absj(obj2, 10), (java.lang.Object) null);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.adpt adptVar = (defpackage.adpt) this.a;
                java.lang.Object obj3 = adptVar.b.get();
                byte[] bArr = new byte[2000];
                while (!java.lang.Thread.interrupted() && adptVar.c) {
                    ((defpackage.vqf) obj3).H(bArr, 0, 2000);
                }
                defpackage.vqf vqfVar = (defpackage.vqf) obj3;
                vqfVar.G();
                vqfVar.F();
                return null;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                try {
                    this.a.run();
                    return null;
                } catch (java.lang.Exception e3) {
                    a.by(adqu.a.c(), "Exception occurred while executing runnable", "com/google/android/libraries/micore/telephony/common/infra/SequentialTaskSubmitter$1", "call", 'A', "SequentialTaskSubmitter.java", e3);
                    return null;
                }
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                java.lang.Object obj4 = this.a;
                synchronized (((defpackage.adsa) obj4).g) {
                    if (((defpackage.adsa) obj4).h.isPresent()) {
                        ((defpackage.adrl) ((defpackage.adsa) obj4).h.get()).close();
                    }
                    break;
                }
                defpackage.adsa.d.b().l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseSpeechRecognizer", "endSpeechRecognition", 176, "TerseSpeechRecognizer.java").v("endSpeechRecognition() - completed");
                return null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                int threadPriority = android.os.Process.getThreadPriority(android.os.Process.myTid());
                java.lang.Object obj5 = this.a;
                try {
                    try {
                        adrw adrwVar = ((defpackage.adsa) obj5).i;
                        java.io.Closeable closeableB = adrwVar.c.b();
                        try {
                            android.os.Process.setThreadPriority(-19);
                            java.lang.String parent = new java.io.File(adrwVar.a()).getParent();
                            if (ahvr.cp(parent)) {
                                adrw.a.c().l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseModelManagerImpl", "getModelConfigFile", 201, "TerseModelManagerImpl.java").v("getTerseModelConfigPath(): Can't determine base dir for downloaded Terse model config.");
                                optionalOf = j$.util.Optional.empty();
                            } else {
                                optionalOf = j$.util.Optional.of(new java.io.File(parent, "model.config"));
                            }
                            if (optionalOf.isEmpty() || !((java.io.File) optionalOf.get()).exists()) {
                                adrw.a.b().l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseModelManagerImpl", "maybeGetModelConfig", 188, "TerseModelManagerImpl.java").v("maybeGetModelConfig(): Can't find model.config file.");
                                optionalEmpty = j$.util.Optional.empty();
                            } else {
                                java.io.FileInputStream fileInputStream = new java.io.FileInputStream((java.io.File) optionalOf.get());
                                try {
                                    optionalEmpty = j$.util.Optional.of((defpackage.adrv) alad.x(defpackage.adrv.a, fileInputStream));
                                    fileInputStream.close();
                                } catch (java.lang.Throwable th) {
                                    try {
                                        fileInputStream.close();
                                        throw th;
                                    } catch (java.lang.Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            }
                            if (optionalEmpty.isPresent()) {
                                adsb adsbVar = ((defpackage.adsa) obj5).e;
                                adru adruVar = ((defpackage.adrv) optionalEmpty.get()).b;
                                if (adruVar == null) {
                                    adruVar = adru.a;
                                }
                                adsbVar.b = adruVar;
                                adsb.a.b().l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TranscriptionTypeResolver", "updateConfidenceConfig", 40, "TranscriptionTypeResolver.java").y("updateConfidenceConfig(): Threshold is now set to: %s", java.lang.Float.valueOf(adruVar.b));
                            }
                            ((defpackage.adsa) obj5).g();
                            closeableB.close();
                        } catch (java.lang.Throwable th3) {
                            try {
                                closeableB.close();
                                throw th3;
                            } catch (java.lang.Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (java.lang.Throwable th5) {
                        android.os.Process.setThreadPriority(threadPriority);
                        throw th5;
                    }
                } catch (java.lang.Exception e4) {
                    defpackage.adsa.d.c().k(e4).l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseSpeechRecognizer", "processSpeechRecognition", 196, "TerseSpeechRecognizer.java").v("Got an exception when trying to open the Terse model.");
                }
                android.os.Process.setThreadPriority(threadPriority);
                return null;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                java.lang.Object obj6 = this.a;
                defpackage.adsp adspVar = (defpackage.adsp) obj6;
                j$.util.Optional optionalB = adspVar.b.b();
                defpackage.adsj adsjVar = (defpackage.adsj) adspVar.d;
                if (adsjVar.b.get()) {
                    adsjVar.c.getAndSet(true);
                }
                if (optionalB.isPresent()) {
                    try {
                        optionalB.get().get(2000L, java.util.concurrent.TimeUnit.MILLISECONDS);
                    } catch (java.lang.Exception e5) {
                        a.by(defpackage.adsp.a.d(), "Error occurred while waiting on playback future to complete", "com/google/android/libraries/micore/telephony/common/uplinkaudioplayback/UplinkAudioPlaybackManagerImpl", "shutdown", ']', "UplinkAudioPlaybackManagerImpl.java", e5);
                    }
                    break;
                }
                synchronized (obj6) {
                    ((defpackage.adsp) obj6).c = j$.util.Optional.empty();
                    break;
                }
                defpackage.adsp.a.b().l("com/google/android/libraries/micore/telephony/common/uplinkaudioplayback/UplinkAudioPlaybackManagerImpl", "shutdown", 100, "UplinkAudioPlaybackManagerImpl.java").v("shutdown(): completed");
                return null;
            case 15:
                ((android.content.BroadcastReceiver.PendingResult) this.a).finish();
                return null;
            case 16:
                int i = defpackage.afax.a;
                return ((android.content.Context) this.a).getExternalFilesDirs(null);
            case 17:
                int i2 = defpackage.afax.a;
                return ((android.content.Context) this.a).getExternalCacheDirs();
            case 18:
                afgs afgsVar = (afgs) this.a;
                java.util.Set<java.lang.String> setKeySet = afgsVar.c;
                if (setKeySet == null) {
                    setKeySet = afgsVar.d.getAll().keySet();
                }
                android.content.SharedPreferences.Editor editorEdit = afgsVar.d.edit();
                java.util.Iterator<java.lang.String> it2 = setKeySet.iterator();
                while (it2.hasNext()) {
                    editorEdit.remove(it2.next());
                }
                if (editorEdit.commit()) {
                    return null;
                }
                throw new java.io.IOException("Failed to remove migrated SharedPreferences keys: ".concat(java.lang.String.valueOf(afgsVar.b)));
            case 19:
                afgs afgsVar2 = (afgs) this.a;
                afgsVar2.d = afgsVar2.a.getSharedPreferences(afgsVar2.b, 0);
                java.util.Set set = afgsVar2.c;
                if (set == null) {
                    return java.lang.Boolean.valueOf(!afgsVar2.d.getAll().isEmpty());
                }
                java.util.Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    if (afgsVar2.d.contains((java.lang.String) it3.next())) {
                        return java.lang.Boolean.TRUE;
                    }
                }
                return java.lang.Boolean.FALSE;
            default:
                ?? it4 = this.a;
                try {
                    try {
                        inputStreamOpenRawResource = ((defpackage.afmn) it4).b.getResources().openRawResource(2131951701);
                        try {
                            defpackage.alfo alfoVar2 = defpackage.alfo.a;
                            alfoVar = (defpackage.alfo) alad.M(defpackage.alfo.class).e(inputStreamOpenRawResource);
                        } catch (java.io.IOException e6) {
                            e = e6;
                            defpackage.afmn.a.c().k(e).l("com/google/android/libraries/toolkit/monogram/impl/MonogramData", "createPrefixToMonogramMap", 98, "MonogramData.java").v("Error reading config, using defaults.");
                            alfoVar = defpackage.alfo.a;
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        r3 = it4;
                        defpackage.aisl.a(r3);
                        throw th;
                    }
                    break;
                } catch (java.io.IOException e7) {
                    e = e7;
                    inputStreamOpenRawResource = null;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    defpackage.aisl.a(r3);
                    throw th;
                }
                defpackage.aisl.a(inputStreamOpenRawResource);
                java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(alfoVar.b);
                aec aecVar = new aec(mapUnmodifiableMap.size());
                it4 = mapUnmodifiableMap.entrySet().iterator();
                while (it4.hasNext()) {
                    java.util.Map.Entry entry3 = (java.util.Map.Entry) it4.next();
                    java.lang.String str = (java.lang.String) entry3.getKey();
                    java.lang.String str2 = ((java.lang.String) entry3.getValue()).isEmpty() ? str : (java.lang.String) entry3.getValue();
                    defpackage.afmm afmmVar = null;
                    for (char c : str.toCharArray()) {
                        if (afmmVar == null) {
                            obj = aecVar;
                        } else {
                            if (afmmVar.b == null) {
                                afmmVar.b = new aec(0);
                            }
                            obj = afmmVar.b;
                        }
                        java.lang.Character chValueOf = java.lang.Character.valueOf(c);
                        aec aecVar2 = (aec) obj;
                        defpackage.afmm afmmVar2 = (defpackage.afmm) aecVar2.get(chValueOf);
                        if (afmmVar2 == null) {
                            afmmVar2 = new defpackage.afmm();
                            aecVar2.put(chValueOf, afmmVar2);
                        }
                        afmmVar = afmmVar2;
                    }
                    afmmVar.a = str2;
                }
                return aecVar;
        }
    }

    public /* synthetic */ zpk(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
