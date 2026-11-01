package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class gzk implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ gzk(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v22, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r10v107, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r10v26, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r10v27, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v36, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r10v46, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v56, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r10v57, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r10v82, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r10v86, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r10v90, types: [android.speech.tts.TextToSpeech$OnInitListener, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() throws java.io.IOException {
        boolean z = false;
        switch (this.$cid) {
            case 0:
                return defpackage.gzl.h((java.io.InputStream) this.a, (java.lang.String) this.b);
            case 1:
                com.airbnb.lottie.LottieAnimationView lottieAnimationView = (com.airbnb.lottie.LottieAnimationView) this.a;
                boolean z2 = lottieAnimationView.d;
                java.lang.Object obj = this.b;
                android.content.Context context = lottieAnimationView.getContext();
                if (z2) {
                    return defpackage.gzl.a(context, (java.lang.String) obj, "asset_".concat(java.lang.String.valueOf(obj)));
                }
                return defpackage.gzl.a(context, (java.lang.String) obj, null);
            case 2:
                ((defpackage.iax) this.b).b.set(this.a);
                return null;
            case 3:
                defpackage.idt idtVar = (defpackage.idt) this.a;
                ahvr.bN(idtVar.c == 3, "invalid config");
                java.lang.Object obj2 = this.b;
                akzc akzcVar = (akzc) obj2;
                ahvr.bN(!akzcVar.C(), "no data to encode");
                defpackage.ids idsVar = idtVar.c == 3 ? (defpackage.ids) idtVar.d : defpackage.ids.a;
                java.io.File file = new java.io.File(idtVar.e);
                if (!file.exists() || !idsVar.f) {
                    java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file));
                    try {
                        int iB = iea.b(idsVar, ((akzc) obj2).c());
                        defpackage.ieb.a(bufferedOutputStream, idsVar, iB);
                        ((akzc) obj2).m(bufferedOutputStream);
                        if (iB % 2 == 1) {
                            bufferedOutputStream.write(0);
                        }
                        bufferedOutputStream.flush();
                        akzx akzxVarM = defpackage.idv.a.m();
                        java.lang.String absolutePath = file.getAbsolutePath();
                        akzxVarM.u();
                        defpackage.idv idvVar = (defpackage.idv) akzxVarM.b;
                        j$.util.Objects.requireNonNull(absolutePath);
                        idvVar.b |= 1;
                        idvVar.c = absolutePath;
                        long length = file.length();
                        akzxVarM.u();
                        defpackage.idv idvVar2 = (defpackage.idv) akzxVarM.b;
                        idvVar2.b |= 2;
                        idvVar2.d = length;
                        defpackage.idv idvVar3 = (defpackage.idv) akzxVarM.p();
                        bufferedOutputStream.close();
                        return idvVar3;
                    } catch (java.lang.Throwable th) {
                        try {
                            bufferedOutputStream.close();
                            break;
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                defpackage.idn idnVarD = defpackage.hgu.d(file);
                defpackage.idm idmVar = idnVarD.c;
                if (idmVar == null) {
                    idmVar = defpackage.idm.a;
                }
                ahvr.bZ(idmVar.e == idsVar.c, "inconsistent sample rate");
                ahvr.bZ(idmVar.d == idsVar.d, "inconsistent channel count");
                ahvr.bZ(idmVar.f == (idsVar.e << 3), "inconsistent bits per sample");
                int iB2 = iea.b(idsVar, akzcVar.c());
                java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file, "rw");
                try {
                    java.io.BufferedOutputStream bufferedOutputStream2 = new java.io.BufferedOutputStream(new java.io.FileOutputStream(randomAccessFile.getFD()));
                    try {
                        defpackage.idl idlVar = idnVarD.d;
                        if (idlVar == null) {
                            idlVar = defpackage.idl.a;
                        }
                        defpackage.ieb.a(bufferedOutputStream2, idsVar, idlVar.c + iB2);
                        bufferedOutputStream2.flush();
                        defpackage.idl idlVar2 = idnVarD.d;
                        if (idlVar2 == null) {
                            idlVar2 = defpackage.idl.a;
                        }
                        randomAccessFile.skipBytes(idlVar2.c);
                        bufferedOutputStream2.write(((akzc) obj2).D(), 0, iB2);
                        defpackage.idl idlVar3 = idnVarD.d;
                        if (idlVar3 == null) {
                            idlVar3 = defpackage.idl.a;
                        }
                        if ((idlVar3.c + iB2) % 2 == 1) {
                            bufferedOutputStream2.write(0);
                        }
                        bufferedOutputStream2.flush();
                        akzx akzxVarM2 = defpackage.idv.a.m();
                        java.lang.String absolutePath2 = file.getAbsolutePath();
                        akzxVarM2.u();
                        defpackage.idv idvVar4 = (defpackage.idv) akzxVarM2.b;
                        j$.util.Objects.requireNonNull(absolutePath2);
                        idvVar4.b |= 1;
                        idvVar4.c = absolutePath2;
                        long length2 = file.length();
                        akzxVarM2.u();
                        defpackage.idv idvVar5 = (defpackage.idv) akzxVarM2.b;
                        idvVar5.b |= 2;
                        idvVar5.d = length2;
                        defpackage.idv idvVar6 = (defpackage.idv) akzxVarM2.p();
                        bufferedOutputStream2.close();
                        randomAccessFile.close();
                        return idvVar6;
                    } catch (java.lang.Throwable th3) {
                        try {
                            bufferedOutputStream2.close();
                            break;
                        } catch (java.lang.Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (java.lang.Throwable th5) {
                    try {
                        randomAccessFile.close();
                        break;
                    } catch (java.lang.Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            case 4:
                aiql.H((java.util.concurrent.Future) this.a);
                aiql.H((java.util.concurrent.Future) this.b);
                return null;
            case 5:
                return afsq.bW((ajcq) this.a, (ajcq) this.b);
            case 6:
                java.lang.String languageTag = gus.ae(((jvp) this.a).a).toLanguageTag();
                aift aiftVar = new aift(4);
                for (defpackage.acvb acvbVar : ((acvd) this.b).c) {
                    if ((acvbVar.b & 1) != 0) {
                        defpackage.acva acvaVar = acvbVar.c;
                        if (acvaVar == null) {
                            acvaVar = defpackage.acva.a;
                        }
                        if (acvaVar.b.contains(languageTag)) {
                        }
                    }
                    acux acuxVar = acvbVar.d;
                    if (acuxVar == null) {
                        acuxVar = acux.a;
                    }
                    aiftVar.i(acuxVar);
                }
                return aiftVar.h();
            case 7:
                zah zahVar = zah.a;
                return j$.util.Optional.of((zah) ((jvs) this.b).g.M((android.net.Uri) this.a, new affq(alad.M(zah.class))));
            case 8:
                akzx akzxVarP = ((zag) aiql.H((java.util.concurrent.Future) this.a)).p();
                ?? r10 = this.b;
                if (((j$.util.Optional) aiql.H((java.util.concurrent.Future) r10)).isPresent()) {
                    zai zaiVar = (zai) ((j$.util.Optional) aiql.H((java.util.concurrent.Future) r10)).orElseThrow();
                    akzxVarP.u();
                    zag zagVar = akzxVarP.b;
                    j$.util.Objects.requireNonNull(zaiVar);
                    zagVar.c = zaiVar;
                    zagVar.b |= 1;
                }
                return akzxVarP.p();
            case 9:
                return ((jwk) this.b).a((android.telecom.PhoneAccountHandle) this.a);
            case 10:
                jys jysVar = (jys) this.a;
                if (!jysVar.c()) {
                    return null;
                }
                ?? r11 = this.b;
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put("is_read", (java.lang.Integer) 1);
                contentValues.put("new", (java.lang.Integer) 0);
                contentValues.put("last_modified", java.lang.Long.valueOf(j$.time.Instant.now().toEpochMilli()));
                ojo ojoVar = jysVar.d;
                rsr rsrVarD = jys.d((java.util.Collection) r11);
                ojoVar.q(android.provider.CallLog.Calls.CONTENT_URI, contentValues, (java.lang.String) rsrVarD.b, (java.lang.String[]) rsrVarD.a);
                if (((java.lang.Boolean) jysVar.f.a()).booleanValue() && android.os.Build.VERSION.SDK_INT > 30) {
                    return null;
                }
                android.net.Uri uri = android.provider.CallLog.Calls.CONTENT_URI;
                aooh.f(uri, "uri");
                ojoVar.a.getContentResolver().notifyChange(uri, (android.database.ContentObserver) null, false);
                return null;
            case 11:
                aiql.H((java.util.concurrent.Future) this.a);
                aiql.H((java.util.concurrent.Future) this.b);
                return null;
            case 12:
                if (((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.a)).booleanValue()) {
                    kva.a.b().l("com/android/dialer/callrecording/impl/CallRecordingImpl", "canShowMenu", 95, "CallRecordingImpl.java").v("menu can be shown as settings were previously used");
                    return java.lang.Boolean.TRUE;
                }
                if (((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.b)).booleanValue()) {
                    kva.a.b().l("com/android/dialer/callrecording/impl/CallRecordingImpl", "canShowMenu", 99, "CallRecordingImpl.java").v("menu can be shown as a call was previously recorded");
                    return java.lang.Boolean.TRUE;
                }
                kva.a.b().l("com/android/dialer/callrecording/impl/CallRecordingImpl", "canShowMenu", 102, "CallRecordingImpl.java").v("menu cannot be shown");
                return java.lang.Boolean.FALSE;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ((defpackage.kww) this.a).e = j$.util.Optional.of(this.b);
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return ((defpackage.hys) ((defpackage.kvt) this.b).b).a(new defpackage.hxz(((defpackage.kux) this.a).c));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                boolean zBooleanValue = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.a)).booleanValue();
                boolean zBooleanValue2 = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.b)).booleanValue();
                defpackage.kyj.a.b().l("com/android/dialer/callrecording/impl/service/CallRecordingInternalProducerModule", "produceIsCallRecordingButtonEnabledInternal", 167, "CallRecordingInternalProducerModule.java").L("callAudioAvailable %b, hasEnoughPermissionsForCallRecording %b", zBooleanValue, zBooleanValue2);
                if (zBooleanValue && zBooleanValue2) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 16:
                boolean zBooleanValue3 = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.a)).booleanValue();
                boolean zBooleanValue4 = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.b)).booleanValue();
                defpackage.kyq.a.b().l("com/android/dialer/callrecording/impl/service/CallRecordingProducerModule", "produceShouldStartAutomaticRecording", 72, "CallRecordingProducerModule.java").L("shouldStartAutomaticRecordingForCaller %b, hasEnoughPermissionsForCallRecording %b", zBooleanValue3, zBooleanValue4);
                if (zBooleanValue3 && zBooleanValue4) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                lbq lbqVar = (lbq) this.b;
                lbqVar.f.set(j$.util.Optional.of(new android.speech.tts.TextToSpeech(lbqVar.e, this.a)));
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                java.lang.Object obj3 = this.b;
                java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream((java.lang.String) obj3));
                java.lang.Object obj4 = this.a;
                try {
                    defpackage.idn idnVarD2 = defpackage.hgu.d(new java.io.File((java.lang.String) obj3));
                    defpackage.idm idmVar2 = idnVarD2.c;
                    if (idmVar2 == null) {
                        idmVar2 = defpackage.idm.a;
                    }
                    int i = idmVar2.c + 28;
                    defpackage.idm idmVar3 = idnVarD2.c;
                    if (idmVar3 == null) {
                        idmVar3 = defpackage.idm.a;
                    }
                    akzc akzcVarA = ((defpackage.lcl) obj4).d.a(akzc.F(bufferedInputStream).x(i), idmVar3.e, 16000);
                    bufferedInputStream.close();
                    return akzcVarA;
                } catch (java.lang.Throwable th7) {
                    try {
                        bufferedInputStream.close();
                        break;
                    } catch (java.lang.Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                    throw th7;
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                java.lang.Object obj5 = this.a;
                aigf aigfVar = defpackage.lcq.a;
                defpackage.kwv kwvVar = new defpackage.kwv(obj5, 7);
                j$.util.Optional optional = (j$.util.Optional) this.b;
                if (true == optional.isPresent()) {
                    java.lang.Object obj6 = optional.get();
                    java.lang.Object obj7 = kwvVar.a;
                    defpackage.lcr lcrVar = (defpackage.lcr) obj6;
                    akzx akzxVarM3 = ahwg.a.m();
                    java.lang.String str = lcrVar.a;
                    akzxVarM3.u();
                    ahwg ahwgVar = akzxVarM3.b;
                    j$.util.Objects.requireNonNull(str);
                    ahwgVar.b |= 1;
                    ahwgVar.c = str;
                    akzc akzcVar2 = lcrVar.b;
                    akzxVarM3.u();
                    ahwg ahwgVar2 = akzxVarM3.b;
                    j$.util.Objects.requireNonNull(akzcVar2);
                    ahwgVar2.b |= 2;
                    ahwgVar2.d = akzcVar2;
                    ((akzx) obj7).at(akzxVarM3.p());
                }
                return new amms(((akzx) obj5).p().i());
            default:
                if (aiql.H((java.util.concurrent.Future) this.a) != zmy.a) {
                    return java.lang.Boolean.FALSE;
                }
                defpackage.lgj lgjVar = (defpackage.lgj) aiql.H((java.util.concurrent.Future) this.b);
                return java.lang.Boolean.valueOf(lgjVar == defpackage.lgj.b || lgjVar == defpackage.lgj.c);
        }
    }

    public /* synthetic */ gzk(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
