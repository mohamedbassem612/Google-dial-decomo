package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aliz implements defpackage.aljg {
    private static final aimz d = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/core/gingerfish/DuplexRecognizerRunner");
    public defpackage.aliv a;
    public aljb c;
    private aizr g;
    private java.lang.String h;
    private defpackage.alqg i;
    private com.google.speech.recognizer.AbstractRecognizer j;
    private defpackage.aljj k;
    private final java.util.concurrent.atomic.AtomicBoolean e = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicBoolean f = new java.util.concurrent.atomic.AtomicBoolean(false);
    public j$.util.Optional b = j$.util.Optional.empty();

    @Override // defpackage.aljg
    public final int a() {
        defpackage.aliv alivVar = this.a;
        if (alivVar == null) {
            return 0;
        }
        return alivVar.a();
    }

    @Override // defpackage.aljg
    public final void b() {
        this.e.set(false);
        com.google.speech.recognizer.AbstractRecognizer abstractRecognizer = this.j;
        if (abstractRecognizer != null) {
            abstractRecognizer.a();
        }
    }

    @Override // defpackage.aljg
    public final void c(java.io.InputStream inputStream) throws defpackage.alio {
        java.lang.String str;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.e;
        if (atomicBoolean.getAndSet(true)) {
            throw new defpackage.alio("Called start while another session is in progress.", defpackage.alti.START_DUPLEX_CALLED_WHILE_IN_PROGRESS);
        }
        if (!this.f.getAndSet(true)) {
            throw new defpackage.alio("Called start before Duplex is initialized.", defpackage.alti.START_DUPLEX_CALLED_BEFORE_INITIALIZATION);
        }
        defpackage.aliv alivVar = new defpackage.aliv(inputStream, this.i, new defpackage.aljh(this, 1));
        this.a = alivVar;
        this.j.f(alivVar);
        this.c = new aljb(this.g, j$.time.Duration.ofSeconds(this.k.b));
        akzx akzxVarM = defpackage.amko.a.m();
        int i = this.i.d;
        akzxVarM.u();
        defpackage.amko amkoVar = (defpackage.amko) akzxVarM.b;
        amkoVar.b |= 2048;
        amkoVar.e = i;
        float f = this.i.c;
        akzxVarM.u();
        defpackage.amko amkoVar2 = (defpackage.amko) akzxVarM.b;
        amkoVar2.b |= 2;
        amkoVar2.c = f;
        int i2 = this.k.c;
        akzxVarM.u();
        defpackage.amko amkoVar3 = (defpackage.amko) akzxVarM.b;
        amkoVar3.b |= 32;
        amkoVar3.d = i2;
        defpackage.amko amkoVar4 = (defpackage.amko) akzxVarM.p();
        while (atomicBoolean.get()) {
            this.a.a = false;
            aljb aljbVar = this.c;
            java.lang.Object obj = aljbVar.b;
            aljbVar.c = j$.time.Instant.now();
            defpackage.amkd amkdVarC = this.j.c(amkoVar4);
            if (!this.a.a) {
                atomicBoolean.set(false);
            }
            int iAS = a.aS(amkdVarC.c);
            if (iAS == 0) {
                iAS = 1;
            }
            if (iAS != 1 && iAS != 5) {
                java.util.Locale locale = java.util.Locale.US;
                int iAS2 = a.aS(amkdVarC.c);
                if (iAS2 == 0) {
                    iAS2 = 1;
                }
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(iAS2 - 1);
                int iAS3 = a.aS(amkdVarC.c);
                if (iAS3 == 0 || iAS3 == 1) {
                    str = "STATUS_SUCCESS";
                } else if (iAS3 == 2) {
                    str = "STATUS_INITIALIZATION_ERROR";
                } else if (iAS3 != 3) {
                    str = iAS3 != 4 ? "STATUS_CANCELED" : "STATUS_STREAM_BROKEN";
                } else {
                    str = "STATUS_RECOGNITION_ERROR";
                }
                java.lang.String str2 = java.lang.String.format(locale, "Error code %d returned from the recognizer (%s)", numValueOf, str);
                d.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/gingerfish/DuplexRecognizerRunner", "validateReturnStatus", 204, "DuplexRecognizerRunner.java").y("runRecognition(): %s", str2);
                int i3 = iAS - 1;
                defpackage.alti altiVar = defpackage.alti.UNKNONW;
                if (i3 == 2) {
                    altiVar = defpackage.alti.RECOGNIZER_STATUS_RECOGNITION_ERROR;
                } else if (i3 == 3) {
                    altiVar = defpackage.alti.RECOGNIZER_STATUS_STREAM_BROKEN;
                }
                throw new defpackage.alio(str2, altiVar);
            }
        }
    }

    @Override // defpackage.aljg
    public final void d() {
        boolean andSet = this.e.getAndSet(false);
        aimz aimzVar = d;
        if (!andSet) {
            aimzVar.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/gingerfish/DuplexRecognizerRunner", "stop", 135, "DuplexRecognizerRunner.java").v("not currently running");
            return;
        }
        aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/gingerfish/DuplexRecognizerRunner", "stop", 139, "DuplexRecognizerRunner.java").v("stop(): starting close sequence");
        this.a.close();
        aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/gingerfish/DuplexRecognizerRunner", "stop", 142, "DuplexRecognizerRunner.java").v("stop(): completed");
    }

    @Override // defpackage.aljg
    public final void e(java.lang.String str, aizr aizrVar, defpackage.alqg alqgVar, ajcu ajcuVar, defpackage.amgv amgvVar) throws defpackage.alio {
        this.g = aizrVar;
        this.h = str;
        this.i = alqgVar;
        try {
            if (alqgVar.b != 0) {
                throw new defpackage.alio("Unsupported audio input (only PCM_16BIT is supported)", defpackage.alti.INVALID_INPUT_FORMAT);
            }
            java.lang.String str2 = this.h + java.io.File.separator + "core_specs.pb";
            try {
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(str2);
                try {
                    defpackage.aljj aljjVar = (defpackage.aljj) alad.A(defpackage.aljj.a, fileInputStream, akzq.a());
                    fileInputStream.close();
                    this.k = aljjVar;
                    defpackage.altl altlVarF = defpackage.aknx.F(str);
                    int iA = a();
                    akzx akzxVarM = defpackage.altn.a.m();
                    akzxVarM.u();
                    defpackage.altn altnVar = (defpackage.altn) akzxVarM.b;
                    j$.util.Objects.requireNonNull(altlVarF);
                    altnVar.c = altlVarF;
                    altnVar.b = 12;
                    amgvVar.h(akzxVarM, j$.time.Duration.ofMillis(iA));
                    java.lang.String str3 = this.h;
                    aimz aimzVar = defpackage.alja.a;
                    aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/gingerfish/RecognizerFactoryImpl", "newRecognizer", 18, "RecognizerFactoryImpl.java").v("newRecognizer(): loading library");
                    if (!defpackage.alja.b.getAndSet(true)) {
                        defpackage.aisr.a();
                    }
                    aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/gingerfish/RecognizerFactoryImpl", "newRecognizer", 20, "RecognizerFactoryImpl.java").v("newRecognizer(): creating model");
                    defpackage.alix alixVar = new defpackage.alix();
                    java.lang.String str4 = str3 + java.io.File.separator + "dictation.config";
                    java.lang.String[] strArr = {".", str3};
                    try {
                        java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(new java.io.File(str4));
                        try {
                            int iAvailable = fileInputStream2.available();
                            byte[] bArr = new byte[iAvailable];
                            int iD = aisk.d(fileInputStream2, bArr, iAvailable);
                            if (iD != iAvailable) {
                                throw new java.io.EOFException("reached end of stream after reading " + iD + " bytes; " + iAvailable + " bytes expected");
                            }
                            fileInputStream2.close();
                            com.google.speech.recognizer.ResourceManager resourceManager = alixVar.a;
                            defpackage.alix.b(resourceManager.b(bArr, strArr), "Init resource manager from proto failed");
                            defpackage.alix.b(alixVar.d(bArr, resourceManager), "Init recognizer from proto failed");
                            this.j = alixVar;
                            alixVar.e(new defpackage.aliy(this));
                            this.f.set(true);
                        } catch (java.lang.Throwable th) {
                            try {
                                fileInputStream2.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (java.io.IOException e) {
                        throw new defpackage.alio(java.lang.String.format(java.util.Locale.US, "Failed to read config file: %s", str4), e);
                    }
                } catch (java.lang.Throwable th3) {
                    try {
                        fileInputStream.close();
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (java.io.IOException e2) {
                throw new defpackage.alio(java.lang.String.format("failed to load %s", str2), defpackage.alti.SPECS_LOADING_FAILURE, e2);
            }
        } catch (defpackage.alio e3) {
            b();
            throw e3;
        }
    }

    @Override // defpackage.aljg
    public final void f(aprf aprfVar) {
        this.b = j$.util.Optional.of(aprfVar);
    }
}
