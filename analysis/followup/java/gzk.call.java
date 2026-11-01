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
    public final Object call() throws IOException {
        boolean z = false;
        switch (this.$cid) {
            case 0:
                return gzl.h((InputStream) this.a, (String) this.b);
            case 1:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.a;
                boolean z2 = lottieAnimationView.d;
                Object obj = this.b;
                Context context = lottieAnimationView.getContext();
                if (z2) {
                    return gzl.a(context, (String) obj, "asset_".concat(String.valueOf(obj)));
                }
                return gzl.a(context, (String) obj, null);
            case 2:
                ((iax) this.b).b.set(this.a);
                return null;
            case 3:
                idt idtVar = (idt) this.a;
                ahvr.bN(idtVar.c == 3, "invalid config");
                Object obj2 = this.b;
                akzc akzcVar = (akzc) obj2;
                ahvr.bN(!akzcVar.C(), "no data to encode");
                ids idsVar = idtVar.c == 3 ? (ids) idtVar.d : ids.a;
                File file = new File(idtVar.e);
                if (!file.exists() || !idsVar.f) {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                    try {
                        int iB = iea.b(idsVar, ((akzc) obj2).c());
                        ieb.a(bufferedOutputStream, idsVar, iB);
                        ((akzc) obj2).m(bufferedOutputStream);
                        if (iB % 2 == 1) {
                            bufferedOutputStream.write(0);
                        }
                        bufferedOutputStream.flush();
                        akzx akzxVarM = idv.a.m();
                        String absolutePath = file.getAbsolutePath();
                        akzxVarM.u();
                        idv idvVar = (idv) akzxVarM.b;
                        Objects.requireNonNull(absolutePath);
                        idvVar.b |= 1;
                        idvVar.c = absolutePath;
                        long length = file.length();
                        akzxVarM.u();
                        idv idvVar2 = (idv) akzxVarM.b;
                        idvVar2.b |= 2;
                        idvVar2.d = length;
                        idv idvVar3 = (idv) akzxVarM.r();
                        bufferedOutputStream.close();
                        return idvVar3;
                    } catch (Throwable th) {
                        try {
                            bufferedOutputStream.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                idn idnVarD = hgu.d(file);
                idm idmVar = idnVarD.c;
                if (idmVar == null) {
                    idmVar = idm.a;
                }
                ahvr.bZ(idmVar.e == idsVar.c, "inconsistent sample rate");
                ahvr.bZ(idmVar.d == idsVar.d, "inconsistent channel count");
                ahvr.bZ(idmVar.f == (idsVar.e << 3), "inconsistent bits per sample");
                int iB2 = iea.b(idsVar, akzcVar.c());
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(randomAccessFile.getFD()));
                    try {
                        idl idlVar = idnVarD.d;
                        if (idlVar == null) {
                            idlVar = idl.a;
                        }
                        ieb.a(bufferedOutputStream2, idsVar, idlVar.c + iB2);
                        bufferedOutputStream2.flush();
                        idl idlVar2 = idnVarD.d;
                        if (idlVar2 == null) {
                            idlVar2 = idl.a;
                        }
                        randomAccessFile.skipBytes(idlVar2.c);
                        bufferedOutputStream2.write(((akzc) obj2).D(), 0, iB2);
                        idl idlVar3 = idnVarD.d;
                        if (idlVar3 == null) {
                            idlVar3 = idl.a;
                        }
                        if ((idlVar3.c + iB2) % 2 == 1) {
                            bufferedOutputStream2.write(0);
                        }
                        bufferedOutputStream2.flush();
                        akzx akzxVarM2 = idv.a.m();
                        String absolutePath2 = file.getAbsolutePath();
                        akzxVarM2.u();
                        idv idvVar4 = (idv) akzxVarM2.b;
                        Objects.requireNonNull(absolutePath2);
                        idvVar4.b |= 1;
                        idvVar4.c = absolutePath2;
                        long length2 = file.length();
                        akzxVarM2.u();
                        idv idvVar5 = (idv) akzxVarM2.b;
                        idvVar5.b |= 2;
                        idvVar5.d = length2;
                        idv idvVar6 = (idv) akzxVarM2.r();
                        bufferedOutputStream2.close();
                        randomAccessFile.close();
                        return idvVar6;
                    } catch (Throwable th3) {
                        try {
                            bufferedOutputStream2.close();
                            break;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        randomAccessFile.close();
                        break;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            case 4:
                aiql.H(this.a);
                aiql.H(this.b);
                return null;
            case 5:
                return afsq.bW(this.a, this.b);
            case 6:
                String languageTag = gus.ae(((jvp) this.a).a).toLanguageTag();
                aift aiftVar = new aift(4);
                for (acvb acvbVar : ((acvd) this.b).c) {
                    if ((acvbVar.b & 1) != 0) {
                        acva acvaVar = acvbVar.c;
                        if (acvaVar == null) {
                            acvaVar = acva.a;
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
                return aiftVar.g();
            case 7:
                zah zahVar = zah.a;
                return Optional.of((zah) ((jvs) this.b).g.M((Uri) this.a, new affq(alad.M(zah.class))));
            case 8:
                akzx akzxVarL = ((zag) aiql.H(this.a)).L();
                ?? r10 = this.b;
                if (((Optional) aiql.H(r10)).isPresent()) {
                    zai zaiVar = (zai) ((Optional) aiql.H(r10)).orElseThrow();
                    akzxVarL.u();
                    zag zagVar = (zag) akzxVarL.b;
                    Objects.requireNonNull(zaiVar);
                    zagVar.c = zaiVar;
                    zagVar.b |= 1;
                }
                return (zag) akzxVarL.r();
            case 9:
                return ((jwk) this.b).a((PhoneAccountHandle) this.a);
            case 10:
                jys jysVar = (jys) this.a;
                if (!jysVar.c()) {
                    return null;
                }
                ?? r11 = this.b;
                ContentValues contentValues = new ContentValues();
                contentValues.put("is_read", (Integer) 1);
                contentValues.put("new", (Integer) 0);
                contentValues.put("last_modified", Long.valueOf(Instant.now().toEpochMilli()));
                ojo ojoVar = jysVar.d;
                rsr rsrVarD = jys.d(r11);
                ojoVar.q(CallLog.Calls.CONTENT_URI, contentValues, (String) rsrVarD.b, (String[]) rsrVarD.a);
                if (((Boolean) jysVar.f.a()).booleanValue() && Build.VERSION.SDK_INT > 30) {
                    return null;
                }
                Uri uri = CallLog.Calls.CONTENT_URI;
                aooh.f(uri, "uri");
                ojoVar.a.getContentResolver().notifyChange(uri, (ContentObserver) null, false);
                return null;
            case 11:
                aiql.H(this.a);
                aiql.H(this.b);
                return null;
            case 12:
                if (((Boolean) aiql.H(this.a)).booleanValue()) {
                    ((aimw) ((aimw) kva.a.b()).l("com/android/dialer/callrecording/impl/CallRecordingImpl", "canShowMenu", 95, "CallRecordingImpl.java")).v("menu can be shown as settings were previously used");
                    return Boolean.TRUE;
                }
                if (((Boolean) aiql.H(this.b)).booleanValue()) {
                    ((aimw) ((aimw) kva.a.b()).l("com/android/dialer/callrecording/impl/CallRecordingImpl", "canShowMenu", 99, "CallRecordingImpl.java")).v("menu can be shown as a call was previously recorded");
                    return Boolean.TRUE;
                }
                ((aimw) ((aimw) kva.a.b()).l("com/android/dialer/callrecording/impl/CallRecordingImpl", "canShowMenu", 102, "CallRecordingImpl.java")).v("menu cannot be shown");
                return Boolean.FALSE;
            case 13:
                ((kww) this.a).e = Optional.of(this.b);
                return null;
            case 14:
                return ((hys) ((kvt) this.b).b).a(new hxz(((kux) this.a).c));
            case Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                boolean zBooleanValue = ((Boolean) aiql.H(this.a)).booleanValue();
                boolean zBooleanValue2 = ((Boolean) aiql.H(this.b)).booleanValue();
                ((aimw) ((aimw) kyj.a.b()).l("com/android/dialer/callrecording/impl/service/CallRecordingInternalProducerModule", "produceIsCallRecordingButtonEnabledInternal", 167, "CallRecordingInternalProducerModule.java")).L("callAudioAvailable %b, hasEnoughPermissionsForCallRecording %b", zBooleanValue, zBooleanValue2);
                if (zBooleanValue && zBooleanValue2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 16:
                boolean zBooleanValue3 = ((Boolean) aiql.H(this.a)).booleanValue();
                boolean zBooleanValue4 = ((Boolean) aiql.H(this.b)).booleanValue();
                ((aimw) ((aimw) kyq.a.b()).l("com/android/dialer/callrecording/impl/service/CallRecordingProducerModule", "produceShouldStartAutomaticRecording", 72, "CallRecordingProducerModule.java")).L("shouldStartAutomaticRecordingForCaller %b, hasEnoughPermissionsForCallRecording %b", zBooleanValue3, zBooleanValue4);
                if (zBooleanValue3 && zBooleanValue4) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                lbq lbqVar = (lbq) this.b;
                lbqVar.f.set(Optional.of(new TextToSpeech(lbqVar.e, this.a)));
                return null;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                Object obj3 = this.b;
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream((String) obj3));
                Object obj4 = this.a;
                try {
                    idn idnVarD2 = hgu.d(new File((String) obj3));
                    idm idmVar2 = idnVarD2.c;
                    if (idmVar2 == null) {
                        idmVar2 = idm.a;
                    }
                    int i = idmVar2.c + 28;
                    idm idmVar3 = idnVarD2.c;
                    if (idmVar3 == null) {
                        idmVar3 = idm.a;
                    }
                    akzc akzcVarA = ((lcl) obj4).d.a(akzc.F(bufferedInputStream).x(i), idmVar3.e, 16000);
                    bufferedInputStream.close();
                    return akzcVarA;
                } catch (Throwable th7) {
                    try {
                        bufferedInputStream.close();
                        break;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                    throw th7;
                }
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                Object obj5 = this.a;
                aigf aigfVar = lcq.a;
                kwv kwvVar = new kwv(obj5, 7);
                Optional optional = (Optional) this.b;
                if (true == optional.isPresent()) {
                    Object obj6 = optional.get();
                    Object obj7 = kwvVar.a;
                    lcr lcrVar = (lcr) obj6;
                    akzx akzxVarM3 = ahwg.a.m();
                    String str = lcrVar.a;
                    akzxVarM3.u();
                    ahwg ahwgVar = (ahwg) akzxVarM3.b;
                    Objects.requireNonNull(str);
                    ahwgVar.b |= 1;
                    ahwgVar.c = str;
                    akzc akzcVar2 = lcrVar.b;
                    akzxVarM3.u();
                    ahwg ahwgVar2 = (ahwg) akzxVarM3.b;
                    Objects.requireNonNull(akzcVar2);
                    ahwgVar2.b |= 2;
                    ahwgVar2.d = akzcVar2;
                    ((akzx) obj7).at((ahwg) akzxVarM3.r());
                }
                return new amms(((ahwh) ((akzx) obj5).r()).i());
            default:
                if (aiql.H(this.a) != zmy.a) {
                    return Boolean.FALSE;
                }
                lgj lgjVar = (lgj) aiql.H(this.b);
                return Boolean.valueOf(lgjVar == lgj.b || lgjVar == lgj.c);
        }
    }
