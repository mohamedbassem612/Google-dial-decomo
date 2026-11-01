package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adsa extends defpackage.adrj implements adrk, amkc {
    public static final aimz d = aimz.i("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseSpeechRecognizer");
    private static final java.util.concurrent.atomic.AtomicBoolean j = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final adsb e;
    public final java.util.concurrent.atomic.AtomicBoolean f;
    public final java.lang.Object g;
    public j$.util.Optional h;
    public final adrw i;
    private byte[] k;
    private int l;
    private final java.lang.Object m;
    private final ahzh n;
    private j$.util.Optional o;
    private j$.util.Optional p;

    public adsa(defpackage.adrn adrnVar, adrw adrwVar, ajcu ajcuVar, ahzp ahzpVar) {
        super(adrnVar, ajcuVar);
        this.f = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.g = new java.lang.Object();
        this.m = new java.lang.Object();
        this.o = j$.util.Optional.empty();
        this.p = j$.util.Optional.empty();
        this.h = j$.util.Optional.empty();
        this.i = adrwVar;
        this.e = new adsb();
        this.n = new ahzh(ahzpVar);
    }

    private final void i() {
        if (this.h.isPresent()) {
            ((defpackage.adrl) this.h.get()).close();
            this.h = j$.util.Optional.empty();
        }
    }

    private static void j(int i, java.lang.String str) throws defpackage.adro {
        k(i, "Failed to init ".concat(str));
    }

    private static void k(int i, java.lang.String str) throws defpackage.adro {
        if (i != 1) {
            throw new defpackage.adro(a.br(i != 0 ? java.lang.Integer.toString(i - 1) : "null", str, ": "));
        }
    }

    public final void b(byte[] bArr) {
        synchronized (this.m) {
            int i = this.l;
            int length = bArr.length;
            int i2 = i + length;
            byte[] bArrCopyOf = this.k;
            int length2 = bArrCopyOf.length;
            if (i2 > length2) {
                bArrCopyOf = java.util.Arrays.copyOf(this.k, java.lang.Math.max(i2, length2 << 1));
                this.k = bArrCopyOf;
            }
            java.lang.System.arraycopy(bArr, 0, bArrCopyOf, this.l, length);
            this.l += length;
        }
    }

    public final void c(amke amkeVar) {
        float f = amkeVar.b;
    }

    public final void e(amkl amklVar) {
        j$.util.Optional optionalEmpty;
        byte[] bArrCopyOf;
        j$.util.Optional optionalEmpty2;
        long jA = ahwr.a.a();
        if (this.c.isEmpty()) {
            return;
        }
        aift aiftVar = new aift(4);
        defpackage.adrp adrpVar = new defpackage.adrp();
        adrpVar.c(jA);
        int i = amklVar.b;
        int i2 = 0;
        if ((i & 4) == 0) {
            if ((i & 8) != 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                defpackage.amkj amkjVar = amklVar.e;
                if (amkjVar == null) {
                    amkjVar = defpackage.amkj.a;
                }
                java.util.Iterator it = amkjVar.c.iterator();
                while (it.hasNext()) {
                    sb.append(((defpackage.amki) it.next()).b);
                }
                defpackage.amkj amkjVar2 = amklVar.e;
                if (((amkjVar2 == null ? defpackage.amkj.a : amkjVar2).b & 16) != 0) {
                    if (amkjVar2 == null) {
                        amkjVar2 = defpackage.amkj.a;
                    }
                    defpackage.amjy amjyVar = amkjVar2.d;
                    if (amjyVar == null) {
                        amjyVar = defpackage.amjy.a;
                    }
                    optionalEmpty = j$.util.Optional.of(java.lang.Float.valueOf(amjyVar.b));
                } else {
                    optionalEmpty = j$.util.Optional.empty();
                }
                aiftVar.i(new defpackage.adrq(sb.toString().trim(), optionalEmpty));
                adrpVar.d(aiftVar.h());
                f(adrpVar.a(), false);
                return;
            }
            return;
        }
        if (this.a.h) {
            synchronized (this.m) {
                int i3 = this.l;
                if (i3 > 0) {
                    bArrCopyOf = java.util.Arrays.copyOf(this.k, i3);
                    this.l = 0;
                } else {
                    bArrCopyOf = null;
                }
            }
            optionalEmpty2 = bArrCopyOf == null ? j$.util.Optional.empty() : j$.util.Optional.of(new defpackage.adns(bArrCopyOf, new android.media.AudioFormat.Builder().setSampleRate(this.a.b).setChannelMask(4).setEncoding(2).build()));
        } else {
            optionalEmpty2 = j$.util.Optional.empty();
        }
        if (optionalEmpty2.isPresent()) {
            adrpVar.b((defpackage.adns) optionalEmpty2.get());
        }
        amkn amknVar = amklVar.d;
        if (amknVar == null) {
            amknVar = amkn.a;
        }
        if ((amknVar.b & 16) == 0) {
            amkn amknVar2 = amklVar.d;
            if (amknVar2 == null) {
                amknVar2 = amkn.a;
            }
            for (defpackage.amkh amkhVar : amknVar2.e) {
                java.lang.String strTrim = amkhVar.c.trim();
                int i4 = amkhVar.b;
                aiftVar.i(new defpackage.adrq(strTrim, (i4 & 8) != 0 ? j$.util.Optional.of(java.lang.Float.valueOf(amkhVar.d)) : (i4 & 262144) != 0 ? j$.util.Optional.of(java.lang.Float.valueOf(amkhVar.e)) : j$.util.Optional.empty()));
                i2++;
            }
            if (i2 > 0) {
                adrpVar.d(aiftVar.h());
                j$.util.Optional.empty().isPresent();
                f(adrpVar.a(), true);
            }
        }
    }

    public final void f(defpackage.adrr adrrVar, boolean z) {
        j$.util.Optional optionalA = this.e.a(adrrVar, z);
        if (optionalA.isPresent()) {
            defpackage.adrp adrpVar = new defpackage.adrp(adrrVar);
            adrpVar.e((adol) optionalA.get());
            adrrVar = adrpVar.a();
        }
        java.util.concurrent.ConcurrentMap concurrentMap = this.c;
        byte[] bArr = null;
        if (z) {
            for (adrs adrsVar : concurrentMap.keySet()) {
                adqu adquVar = (adqu) concurrentMap.get(adrsVar);
                adquVar.c(defpackage.adri.a);
                adquVar.d(new defpackage.aawj(adrsVar, adrrVar, 12, bArr), defpackage.adri.b);
            }
            return;
        }
        for (adrs adrsVar2 : concurrentMap.keySet()) {
            adqu adquVar2 = (adqu) concurrentMap.get(adrsVar2);
            defpackage.adri adriVar = defpackage.adri.a;
            adquVar2.c(adriVar);
            adquVar2.d(new defpackage.aawj(adrsVar2, adrrVar, 13, bArr), adriVar);
        }
    }

    public final void g() {
        try {
            try {
                if (!j.getAndSet(true)) {
                    java.lang.System.loadLibrary("google_recognizer_jni");
                }
                this.o = j$.util.Optional.of(new defpackage.adrz());
                this.p = j$.util.Optional.of(new defpackage.adry());
                if (this.o.isEmpty()) {
                    throw new java.lang.IllegalStateException("initRecognizer - resource manager is null");
                }
                if (this.p.isEmpty()) {
                    throw new java.lang.IllegalStateException("initRecognizer - recognizer is null");
                }
                java.lang.Object obj = this.o.get();
                java.lang.Object obj2 = this.p.get();
                java.lang.String strA = this.i.a();
                if (ahvr.cp(strA)) {
                    throw new defpackage.adro("No model path found.");
                }
                aimz aimzVar = d;
                aimzVar.b().l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseSpeechRecognizer", "initRecognizer", 255, "TerseSpeechRecognizer.java").y("initRecognizer(): Init recognizer from: %s", strA);
                java.io.File file = new java.io.File(strA);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.String parent = file.getParent();
                if (!ahvr.cp(parent) && !parent.equals(".")) {
                    arrayList.add(".");
                    arrayList.add(parent);
                }
                java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
                java.io.File file2 = new java.io.File(strA);
                long length = file2.length();
                byte[] bArr = new byte[(int) length];
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file2);
                try {
                    if (length != fileInputStream.read(bArr)) {
                        throw new java.io.IOException("Failed to read in entire file");
                    }
                    fileInputStream.close();
                    j(((com.google.speech.recognizer.ResourceManager) obj).b(bArr, strArr), "resource manager");
                    j(((com.google.speech.recognizer.AbstractRecognizer) obj2).d(bArr, (com.google.speech.recognizer.ResourceManager) obj), "recognizer");
                    aimzVar.b().l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseSpeechRecognizer", "runRecognitionLoop", 211, "TerseSpeechRecognizer.java").v("runRecognitionLoop(): Starting recognition loop");
                    if (this.p.isEmpty()) {
                        throw new java.lang.IllegalStateException("initRecognizer - recognizer is null");
                    }
                    java.lang.Object obj3 = this.p.get();
                    ((com.google.speech.recognizer.AbstractRecognizer) obj3).e(this);
                    k(1, "Failed to add callback to recognizer");
                    akzx akzxVarM = amko.a.m();
                    defpackage.adrn adrnVar = this.a;
                    float f = adrnVar.b;
                    akzxVarM.u();
                    amko amkoVar = akzxVarM.b;
                    amkoVar.b |= 2;
                    amkoVar.c = f;
                    int i = adrnVar.d;
                    akzxVarM.u();
                    amko amkoVar2 = akzxVarM.b;
                    amkoVar2.b |= 32;
                    amkoVar2.d = i;
                    akzxVarM.u();
                    amko amkoVar3 = akzxVarM.b;
                    amkoVar3.b |= 16384;
                    amkoVar3.f = false;
                    amko amkoVarP = akzxVarM.p();
                    try {
                        synchronized (this.g) {
                            adrnVar.i.get();
                            defpackage.adrl adrlVarY = aesg.y(adrnVar);
                            if (adrnVar.h) {
                                synchronized (this.m) {
                                    try {
                                        this.k = new byte[65536];
                                        this.l = 0;
                                    } catch (java.lang.Throwable th) {
                                        throw th;
                                    }
                                }
                                adrlVarY.c(this);
                            }
                            j$.util.Optional optionalOf = j$.util.Optional.of(adrlVarY);
                            this.h = optionalOf;
                            ((com.google.speech.recognizer.AbstractRecognizer) obj3).f((java.io.InputStream) optionalOf.get());
                            k(1, "Failed to set audio reader to recognizer");
                        }
                        aimzVar.b().l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseSpeechRecognizer", "recognitionLoop", 306, "TerseSpeechRecognizer.java").v("recognitionLoop(): Starting speech recognition loop");
                        while (true) {
                            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f;
                            if (!atomicBoolean.get()) {
                                break;
                            }
                            synchronized (this.g) {
                                if (this.h.isPresent()) {
                                    this.h.get();
                                }
                            }
                            ahzh ahzhVar = this.n;
                            ahzhVar.d();
                            ahzhVar.e();
                            if (atomicBoolean.get()) {
                                ((com.google.speech.recognizer.AbstractRecognizer) obj3).c(amkoVarP);
                            }
                        }
                        synchronized (this.g) {
                            i();
                        }
                        d.b().l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseSpeechRecognizer", "runRecognitionLoop", 213, "TerseSpeechRecognizer.java").v("runRecognitionLoop(): Recognition loop finished");
                        if (this.p.isPresent()) {
                            ((com.google.speech.recognizer.AbstractRecognizer) this.p.get()).a();
                            this.p = j$.util.Optional.empty();
                        }
                        if (this.o.isPresent()) {
                            ((com.google.speech.recognizer.ResourceManager) this.o.get()).a();
                            this.o = j$.util.Optional.empty();
                        }
                        this.f.set(false);
                    } catch (java.lang.Throwable th2) {
                        synchronized (this.g) {
                            try {
                                i();
                                throw th2;
                            } catch (java.lang.Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                } catch (java.lang.Throwable th4) {
                    try {
                        fileInputStream.close();
                    } catch (java.lang.Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (java.lang.Throwable th6) {
                if (this.p.isPresent()) {
                    ((com.google.speech.recognizer.AbstractRecognizer) this.p.get()).a();
                    this.p = j$.util.Optional.empty();
                }
                if (this.o.isPresent()) {
                    ((com.google.speech.recognizer.ResourceManager) this.o.get()).a();
                    this.o = j$.util.Optional.empty();
                }
                this.f.set(false);
                throw th6;
            }
        } catch (defpackage.adro e) {
            d.c().k(e).l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseSpeechRecognizer", "runRecognitionLoop", 215, "TerseSpeechRecognizer.java").v("TerseRecognizer error");
            a(e);
        } catch (java.lang.Exception e2) {
            d.c().k(e2).l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseSpeechRecognizer", "runRecognitionLoop", 221, "TerseSpeechRecognizer.java").v("Error occurred in main recognition loop, or when trying to load Terse runtime library.");
            a(new defpackage.adro(e2));
        } catch (java.lang.UnsatisfiedLinkError e3) {
            d.c().k(e3).l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseSpeechRecognizer", "runRecognitionLoop", 218, "TerseSpeechRecognizer.java").v("Failed to load Terse runtime library.");
            a(new defpackage.adro(e3));
        }
    }

    public final void h() {
    }

    public final void d(amkf amkfVar) {
    }
}
