package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lgc implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ lgc(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:169:0x02e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v23, types: [adrk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, java.util.Set] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() throws java.io.IOException {
        j$.util.Optional optionalOf;
        switch (this.$cid) {
            case 0:
                return java.lang.Integer.valueOf(((oju) this.a).b());
            case 1:
                return java.lang.Boolean.valueOf(!((pgi) this.a).a.isEmpty());
            case 2:
                return ((defpackage.lgi) this.a).f;
            case 3:
                return ((defpackage.lgi) this.a).e;
            case 4:
                return ((defpackage.lgi) this.a).g;
            case 5:
                return java.lang.Boolean.valueOf(gez.c(((lhp) this.a).a).getBoolean("speak_easy_voice_set_key", false));
            case 6:
                lht lhtVar = (lht) this.a;
                java.lang.String languageTag = gus.ae(lhtVar.b).toLanguageTag();
                j$.util.Optional optionalEmpty = j$.util.Optional.empty();
                try {
                    optionalOf = j$.util.Optional.of(akff.a(languageTag));
                } catch (java.lang.IllegalArgumentException e) {
                    hgb.g(lht.a.d(), "unable to parse locale language %s", languageTag, "com/android/dialer/callscreen/impl/settings/Settings", "getCallScreenLanguage", 'k', "Settings.java", e, zct.b);
                    optionalOf = optionalEmpty;
                }
                if (optionalOf.isPresent() && lhtVar.d.d((akff) optionalOf.orElseThrow())) {
                    return optionalOf;
                }
                lcx lcxVar = lhtVar.d;
                return lcxVar.b().isPresent() ? lcxVar.b() : optionalOf;
            case 7:
                ?? r13 = this.a;
                try {
                    adrl adrlVarY = aesg.y(((ljb) r13).r);
                    if (((ljb) r13).r.h) {
                        synchronized (((ljb) r13).u) {
                            try {
                                ((ljb) r13).s = new byte[65536];
                                ((ljb) r13).t = 0;
                                int i = ((ljb) r13).r.g;
                                adrlVarY.c((adrk) r13);
                            } catch (java.lang.Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return j$.util.Optional.of(adrlVarY);
                } catch (java.io.IOException | adpd e2) {
                    a.bq(ljb.a.c(), "Error creating audio input stream", "com/android/dialer/callscreen/impl/speechrecognition/SodaSpeechRecognizer", "createAudioInputStream", (char) 289, "SodaSpeechRecognizer.java", e2, zct.b);
                    return j$.util.Optional.empty();
                }
            case 8:
                java.lang.Object obj = this.a;
                return ((defpackage.ljs) obj).f.eV(ahqx.h(new defpackage.ldf(obj, 12)), (java.lang.Object) null);
            case 9:
                mef mefVar = (mef) this.a;
                j$.util.Optional optional = mefVar.d;
                if (true == optional.isPresent()) {
                    ((aqan) optional.get()).close();
                    mef.a.d().l("com/android/dialer/daredevil/impl/DaredevilModelImpl", "onAllCallsRemoved", 124, "DaredevilModelImpl.java").v("DaredevilModelImpl cleans up remnant interpreter.");
                }
                mefVar.d = j$.util.Optional.empty();
                return null;
            case 10:
                mef mefVar2 = (mef) this.a;
                j$.util.Optional optional2 = mefVar2.d;
                if (true == optional2.isPresent()) {
                    ((aqan) optional2.get()).close();
                }
                mefVar2.d = j$.util.Optional.empty();
                mef.a.b().l("com/android/dialer/daredevil/impl/DaredevilModelImpl", "closeModelResources", 109, "DaredevilModelImpl.java").v("successfully closed model resources");
                return null;
            case 11:
                java.lang.Object obj2 = this.a;
                mef mefVar3 = (mef) obj2;
                if (mefVar3.d.isPresent()) {
                    throw new java.lang.IllegalStateException("resources already initialized");
                }
                android.content.res.AssetFileDescriptor assetFileDescriptorOpenFd = mefVar3.b.getAssets().openFd("sed_15600.tflite");
                try {
                    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(assetFileDescriptorOpenFd.getFileDescriptor());
                    try {
                        java.nio.channels.FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                        try {
                            ((mef) obj2).d = j$.util.Optional.of(new aqan(fileChannelConvertMaybeLegacyFileChannelFromLibrary.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getDeclaredLength()), (aqam) null));
                            mef.a.b().l("com/android/dialer/daredevil/impl/DaredevilModelImpl", "initModelResources", 72, "DaredevilModelImpl.java").v("successfully initialized model resources");
                            if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                                fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                            }
                            fileInputStream.close();
                            if (assetFileDescriptorOpenFd == null) {
                                return null;
                            }
                            assetFileDescriptorOpenFd.close();
                            return null;
                        } catch (java.lang.Throwable th2) {
                            if (fileChannelConvertMaybeLegacyFileChannelFromLibrary == null) {
                                throw th2;
                            }
                            try {
                                fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                                throw th2;
                            } catch (java.lang.Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                            if (assetFileDescriptorOpenFd != null) {
                                throw th;
                            }
                            try {
                                assetFileDescriptorOpenFd.close();
                                throw th;
                            } catch (java.lang.Throwable th4) {
                                th.addSuppressed(th4);
                                throw th;
                            }
                        }
                    } catch (java.lang.Throwable th5) {
                        try {
                            fileInputStream.close();
                            throw th5;
                        } catch (java.lang.Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (java.lang.Throwable th7) {
                    if (assetFileDescriptorOpenFd != null) {
                        throw th7;
                    }
                    assetFileDescriptorOpenFd.close();
                    throw th7;
                }
            case 12:
                java.lang.Object obj3 = this.a;
                zjs zjsVar = ((defpackage.mji) obj3).f;
                java.util.List listT = zjsVar.t();
                j$.util.Optional optionalG = zjsVar.g("voicemail");
                if (listT.size() > 1 && !listT.contains(optionalG.orElse((java.lang.Object) null))) {
                    akzx akzxVarM = defpackage.mjh.a.m();
                    akzxVarM.u();
                    defpackage.mjh mjhVar = (defpackage.mjh) akzxVarM.b;
                    mjhVar.c = 5;
                    mjhVar.b |= 1;
                    return (defpackage.mjh) akzxVarM.p();
                }
                try {
                    if (optionalG.isPresent()) {
                        if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) zjsVar.k((android.telecom.PhoneAccountHandle) optionalG.orElse((java.lang.Object) null)).orElse((java.lang.Object) null))) {
                            akzx akzxVarM2 = defpackage.mjh.a.m();
                            akzxVarM2.u();
                            defpackage.mjh mjhVar2 = (defpackage.mjh) akzxVarM2.b;
                            mjhVar2.c = 4;
                            mjhVar2.b |= 1;
                            return (defpackage.mjh) akzxVarM2.p();
                        }
                    } else if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) ((defpackage.mji) obj3).g.C().orElse((java.lang.Object) null))) {
                        akzx akzxVarM3 = defpackage.mjh.a.m();
                        akzxVarM3.u();
                        defpackage.mjh mjhVar3 = (defpackage.mjh) akzxVarM3.b;
                        mjhVar3.c = 4;
                        mjhVar3.b |= 1;
                        return (defpackage.mjh) akzxVarM3.p();
                    }
                } catch (java.lang.SecurityException e3) {
                    a.bq(defpackage.mji.a.d(), "SecurityException is thrown. Maybe privilege isn't sufficient.", "com/android/dialer/dialpadview/controller/PreCallDialpadController", "shouldAllowVoicemailCall", (char) 227, "PreCallDialpadController.java", e3, zct.b);
                }
                akzx akzxVarM4 = defpackage.mjh.a.m();
                akzxVarM4.u();
                defpackage.mjh mjhVar4 = (defpackage.mjh) akzxVarM4.b;
                mjhVar4.c = 3;
                mjhVar4.b |= 1;
                return (defpackage.mjh) akzxVarM4.p();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ahzh ahzhVar = new ahzh(ahwr.a);
                ahzhVar.e();
                java.lang.Object obj4 = this.a;
                defpackage.mjk mjkVar = (defpackage.mjk) obj4;
                if (!mjkVar.b.isPresent()) {
                    try {
                        ((defpackage.mjk) obj4).b = j$.util.Optional.of(new android.media.ToneGenerator(8, 80));
                    } catch (java.lang.RuntimeException e4) {
                        a.bq(defpackage.mjk.a.c(), "Exception caught while creating local tone generator", "com/android/dialer/dialpadview/controller/PreCallDialpadToneController", "init", 'P', "PreCallDialpadToneController.java", e4, zct.b);
                        mjkVar.b = j$.util.Optional.empty();
                    }
                    break;
                }
                ahzhVar.f();
                if (ahzhVar.c().compareTo(j$.time.Duration.ofMillis(50L)) > 0) {
                    defpackage.mjk.a.b().l("com/android/dialer/dialpadview/controller/PreCallDialpadToneController", "init", 87, "PreCallDialpadToneController.java").x("Time for ToneGenerator creation: %d", ahzhVar.c().toMillis());
                }
                return java.lang.Boolean.valueOf(mjkVar.b.isPresent());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                defpackage.mjk mjkVar2 = (defpackage.mjk) this.a;
                if (!mjkVar2.c || !mjkVar2.b.isPresent()) {
                    return java.lang.Boolean.FALSE;
                }
                ((android.media.ToneGenerator) mjkVar2.b.orElseThrow()).stopTone();
                return java.lang.Boolean.TRUE;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                defpackage.mjk mjkVar3 = (defpackage.mjk) this.a;
                boolean z = android.provider.Settings.System.getInt(mjkVar3.d.getContentResolver(), "dtmf_tone", 1) == 1;
                mjkVar3.c = z;
                return java.lang.Boolean.valueOf(z);
            case 16:
                defpackage.mjk mjkVar4 = (defpackage.mjk) this.a;
                if (!mjkVar4.b.isPresent()) {
                    return java.lang.Boolean.FALSE;
                }
                ((android.media.ToneGenerator) mjkVar4.b.orElseThrow()).release();
                mjkVar4.b = j$.util.Optional.empty();
                return java.lang.Boolean.TRUE;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                akzx akzxVar = ((defpackage.mjm) this.a).e;
                java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.mit) akzxVar.b).c);
                defpackage.mit mitVar = (defpackage.mit) akzxVar.b;
                java.lang.String str = (mitVar.b & 1) != 0 ? mitVar.d : null;
                java.lang.Long lValueOf = java.lang.Long.valueOf(j$.time.Instant.now().toEpochMilli());
                defpackage.mit mitVar2 = (defpackage.mit) akzxVar.b;
                return new defpackage.miz(listUnmodifiableList, str, lValueOf, (mitVar2.b & 4) != 0 ? mitVar2.f : null);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                long epochMilli = j$.time.Instant.now().toEpochMilli();
                akzx akzxVar2 = ((defpackage.mjm) this.a).e;
                akzxVar2.u();
                defpackage.mit mitVar3 = (defpackage.mit) akzxVar2.b;
                defpackage.mit mitVar4 = defpackage.mit.a;
                mitVar3.b |= 2;
                mitVar3.e = epochMilli;
                return new defpackage.mja((defpackage.mit) akzxVar2.p());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                try {
                    return j$.util.Optional.ofNullable(((defpackage.nwb) this.a).h.getPhoneCapability());
                } catch (java.lang.SecurityException e5) {
                    a.bq(defpackage.nwb.a.d(), "TelephonyManager.getPhoneCapability called without permission.", "com/android/dialer/dualsim/dualsimdualactive/impl/DualSimDualActiveImpl", "isDeviceDsdaSupported", (char) 216, "DualSimDualActiveImpl.java", e5, zct.b);
                    return j$.util.Optional.empty();
                }
            default:
                try {
                    return ((defpackage.nwb) this.a).g.getActiveSubscriptionIdList();
                } catch (java.lang.SecurityException e6) {
                    a.bq(defpackage.nwb.a.d(), "SubscriptionManager.getActiveSubscriptionIdList called without permission.", "com/android/dialer/dualsim/dualsimdualactive/impl/DualSimDualActiveImpl", "isSubscriptionDsdaAvailable", (char) 247, "DualSimDualActiveImpl.java", e6, zct.b);
                    return new int[0];
                }
        }
    }
}
