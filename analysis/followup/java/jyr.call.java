    /* JADX WARN: Type inference failed for: r0v103, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v105, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, java.util.List] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
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
                    Cursor cursorB = jysVar.d.b(CallLog.Calls.CONTENT_URI, new String[]{"_id"}, (String) rsrVarD.b, (String[]) rsrVarD.a, null);
                    try {
                        if (cursorB == null) {
                            ((aimw) ((aimw) ((aimw) ((aimw) jys.a.c()).m(aioa.MEDIUM)).i(zct.b)).l("com/android/dialer/calllog/clearmissedcalls/ClearMissedCalls", "getUnreadMissedCallCount", 249, "ClearMissedCalls.java")).v("null cursor");
                        } else {
                            iValueOf = Integer.valueOf(cursorB.getCount());
                            cursorB.close();
                        }
                        break;
                    } catch (Throwable th) {
                        if (cursorB == null) {
                            throw th;
                        }
                        try {
                            cursorB.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                return iValueOf;
            case 1:
                ((jxm) this.a).z.i(null).a(mcd.NO_RESPONSE_FROM_TELECOM_FOR_OUTGOING_CALL);
                return null;
            case 2:
                return ((zjm) this.a).g();
            case 3:
                return a.m(this.a);
            case 4:
                ((aimw) ((aimw) kww.a.b()).l("com/android/dialer/callrecording/impl/logger/CallRecordingLogger", "logCrosbyRecordingForCall", 155, "CallRecordingLogger.java")).v("logging automatic call recording");
                akzx akzxVar = ((kww) this.a).k;
                akzxVar.u();
                amoy amoyVar = (amoy) akzxVar.b;
                amoy amoyVar2 = amoy.a;
                amoyVar.b |= 4;
                amoyVar.e = true;
                return null;
            case 5:
                ((aimw) ((aimw) ((aimw) kww.a.d()).i(zct.b)).l("com/android/dialer/callrecording/impl/logger/CallRecordingLogger", "logFailure", (char) 223, "CallRecordingLogger.java")).v("logging single recording failure");
                kww kwwVar = (kww) this.a;
                akzx akzxVar2 = kwwVar.k;
                akzxVar2.u();
                amoy amoyVar3 = (amoy) akzxVar2.b;
                amoy amoyVar4 = amoy.a;
                amoyVar3.b |= 1;
                amoyVar3.c = false;
                kwwVar.f.add((amoy) akzxVar2.r());
                kwwVar.c();
                return null;
            case 6:
                akzx akzxVarM = amoz.a.m();
                Objects.requireNonNull(akzxVarM);
                fcg fcgVar = new fcg(akzxVarM, i);
                kww kwwVar2 = (kww) this.a;
                Iterable$EL.forEach(kwwVar2.f, fcgVar);
                Optional optional = kwwVar2.h;
                Objects.requireNonNull(akzxVarM);
                kwv kwvVar = new kwv(akzxVarM, i3);
                if (true == optional.isPresent()) {
                    Object obj = optional.get();
                    akzx akzxVar3 = (akzx) kwvVar.a;
                    akzxVar3.u();
                    amoz amozVar = (amoz) akzxVar3.b;
                    Objects.requireNonNull(obj);
                    amozVar.b |= 4;
                    amozVar.f = (String) obj;
                }
                Optional optional2 = kwwVar2.i;
                Objects.requireNonNull(akzxVarM);
                kwv kwvVar2 = new kwv(akzxVarM, i2);
                if (true == optional2.isPresent()) {
                    Object obj2 = optional2.get();
                    Object obj3 = kwvVar2.a;
                    int iIntValue = ((Integer) obj2).intValue();
                    akzx akzxVar4 = (akzx) obj3;
                    akzxVar4.u();
                    amoz amozVar2 = (amoz) akzxVar4.b;
                    amozVar2.b |= 1;
                    amozVar2.d = iIntValue;
                }
                Optional optional3 = kwwVar2.j;
                Objects.requireNonNull(akzxVarM);
                kwv kwvVar3 = new kwv(akzxVarM, 3);
                if (true == optional3.isPresent()) {
                    Object obj4 = optional3.get();
                    Object obj5 = kwvVar3.a;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    akzx akzxVar5 = (akzx) obj5;
                    akzxVar5.u();
                    amoz amozVar3 = (amoz) akzxVar5.b;
                    amozVar3.b |= 2;
                    amozVar3.e = iIntValue2;
                }
                return (amoz) akzxVarM.r();
            case 7:
                return ((kxx) this.a).a().equals(Optional.of(kxw.b)) ? Optional.of(qtz.SNACKBAR_RECORDING_AUDIO_SAVED) : Optional.empty();
            case 8:
                return ((kxx) this.a).a().equals(Optional.of(kxw.a)) ? Optional.of(qtz.SNACKBAR_RECORDING_FAILED) : Optional.empty();
            case 9:
                return ((kxx) this.a).i.get() ? Optional.of(qtu.DIALOG_RECORD) : Optional.empty();
            case 10:
                aimz aimzVar = lbl.a;
                ailj it = ((aifo) this.a).iterator();
                while (it.hasNext()) {
                    kui kuiVar = (kui) it.next();
                    if (kuiVar != null && (kuiVar.b & 1) != 0) {
                        File file = new File(kuiVar.c);
                        if (file.exists()) {
                            Files.delete(FileRetargetClass.toPath(file));
                        }
                    }
                }
                return null;
            case 11:
                aimz aimzVar2 = lbl.a;
                aigb aigbVar = new aigb(4);
                Iterator it2 = this.a.iterator();
                while (it2.hasNext()) {
                    aigbVar.l((Map) aiql.H((ajcq) it2.next()));
                }
                return aigbVar.e(true);
            case 12:
                File file2 = new File(((lbl) this.a).b.getFilesDir(), "callrecording");
                if (file2.exists()) {
                    BigInteger bigInteger = apqv.a;
                    try {
                        Objects.requireNonNull(file2, "directory");
                        if (!file2.isDirectory()) {
                            if (file2.exists()) {
                                throw new IllegalArgumentException("Parameter 'directory' is not a directory: '" + file2.toString() + '\'');
                            }
                            throw new FileNotFoundException("Directory '" + file2.toString() + "' does not exist.");
                        }
                        try {
                            Path path = FileRetargetClass.toPath(file2);
                            int i4 = apre.a;
                            int i5 = aprd.b;
                            apra apraVar = new apra();
                            apraVar.b = new aprb();
                            aprd aprdVar = new aprd(apraVar);
                            Files.walkFileTree(path, aprdVar);
                            long j = aprdVar.a.a.a;
                            Long.valueOf(j).getClass();
                            return Integer.valueOf((int) j);
                        } catch (IOException e) {
                            throw new UncheckedIOException(e);
                        }
                    } catch (FileNotFoundException e2) {
                        throw new UncheckedIOException(e2);
                    }
                }
                return iValueOf;
            case 13:
                Object obj6 = this.a;
                lbq lbqVar = (lbq) obj6;
                Locale localeB = lbqVar.d.b();
                ((aimw) ((aimw) lbq.a.b()).l("com/android/dialer/callrecording/impl/ttsprewarm/TtsPreWarm", "configureTts", 123, "TtsPreWarm.java")).y("initializing TTS with %s locale", localeB);
                AtomicReference atomicReference = lbqVar.f;
                ((TextToSpeech) ((Optional) atomicReference.get()).orElseThrow()).setLanguage(localeB);
                try {
                    File fileCreateTempFile = File.createTempFile("tmpsynthesize", null, ((lbq) obj6).e.getCacheDir());
                    Bundle bundle = new Bundle();
                    bundle.putString("com.google.android.tts:Mode", "LocalOnly");
                    Optional optional4 = (Optional) atomicReference.get();
                    hvp hvpVar = new hvp(bundle, fileCreateTempFile, i, bArr);
                    if (true == optional4.isPresent()) {
                        ((TextToSpeech) optional4.get()).synthesizeToFile("", (Bundle) hvpVar.b, (File) hvpVar.a, "dummytext");
                    }
                    fileCreateTempFile.deleteOnExit();
                    break;
                } catch (IOException e3) {
                    ((aimw) ((aimw) ((aimw) ((aimw) lbq.a.c()).i(zct.b)).k(e3)).l("com/android/dialer/callrecording/impl/ttsprewarm/TtsPreWarm", "configureTts", (char) 147, "TtsPreWarm.java")).v("failed to synthesize an empty string");
                }
                return null;
            case 14:
                lkq lkqVar = (lkq) this.a;
                ljx ljxVar = lkqVar.g;
                if ((ljxVar.b & 2) != 0) {
                    ljz ljzVar = ljxVar.d;
                    if (ljzVar == null) {
                        ljzVar = ljz.a;
                    }
                    if (!ljzVar.c.isEmpty()) {
                        ljz ljzVar2 = lkqVar.g.d;
                        if (ljzVar2 == null) {
                            ljzVar2 = ljz.a;
                        }
                        try {
                            FileInputStream fileInputStream = new FileInputStream(ljzVar2.c);
                            try {
                                Optional optionalOf = Optional.of((lkb) alad.A(lkb.a, fileInputStream, akzq.a()));
                                fileInputStream.close();
                                return optionalOf;
                            } catch (Throwable th3) {
                                try {
                                    fileInputStream.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        } catch (IOException e4) {
                            ((aimw) ((aimw) ((aimw) ((aimw) lcl.a.c()).i(zct.b)).k(e4)).l("com/android/dialer/callscreen/impl/donation/scotty/CallScreenDonationScottyUploader", "readCallScreenSessionMetricsFromFile", (char) 289, "CallScreenDonationScottyUploader.java")).v("unable to read call screen session metrics");
                            return Optional.empty();
                        }
                    }
                }
                ((aimw) ((aimw) lcl.a.b()).l("com/android/dialer/callscreen/impl/donation/scotty/CallScreenDonationScottyUploader", "readCallScreenSessionMetricsFromFile", 270, "CallScreenDonationScottyUploader.java")).v("no call screen metrics file");
                return Optional.empty();
            case Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return this.a;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                for (String str : this.a) {
                    if (!TextUtils.isEmpty(str)) {
                        File file3 = new File(str);
                        if (file3.exists() && !TextUtils.isEmpty(str) && !file3.delete()) {
                            ((aimw) ((aimw) ((aimw) ldb.a.d()).i(zct.b)).l("com/android/dialer/callscreen/impl/history/CallScreenDataLoaderImpl", "deleteFiles", (char) 178, "CallScreenDataLoaderImpl.java")).v("unable to delete audio recording file");
                        }
                    }
                }
                return null;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return (List) this.a.call();
            default:
                lem lemVar = (lem) this.a;
                if (lemVar.f.isPresent()) {
                    if (lemVar.g) {
                        ((aimw) ((aimw) lem.a.b()).l("com/android/dialer/callscreen/impl/service/CallScreenAudioPreparer", "restoreAudioRouteAfterListening", 94, "CallScreenAudioPreparer.java")).v("unmuting BT audio stream");
                        lemVar.d.adjustStreamVolume(6, 100, 0);
                    }
                    lemVar.c.e((zmw) lemVar.f.orElseThrow());
                } else {
                    ((aimw) ((aimw) lem.a.b()).l("com/android/dialer/callscreen/impl/service/CallScreenAudioPreparer", "restoreAudioRouteAfterListening", 90, "CallScreenAudioPreparer.java")).v("previous audio route not found.");
                }
                return null;
        }
    }
