package com.google.speech.recognizer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class AbstractRecognizer {
    private static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(com.google.speech.recognizer.AbstractRecognizer.class.getName());
    private java.io.InputStream c;
    private com.google.speech.recognizer.ResourceManager e;
    private final java.util.List d = new java.util.ArrayList(1);
    private long b = nativeConstruct();

    private final void b() {
        if (this.b == 0) {
            throw new java.lang.IllegalStateException("recognizer is not initialized");
        }
    }

    private native long nativeConstruct();

    private native void nativeDelete(long j);

    private native int nativeInitFromProto(long j, long j2, byte[] bArr);

    private native byte[] nativeRun(long j, byte[] bArr);

    public synchronized void a() {
        long j = this.b;
        if (j != 0) {
            nativeDelete(j);
            this.b = 0L;
        }
    }

    public final defpackage.amkd c(defpackage.amko amkoVar) {
        b();
        try {
            return (defpackage.amkd) alad.B(defpackage.amkd.a, nativeRun(this.b, amkoVar.i()), akzq.a());
        } catch (alaz unused) {
            a.logp(java.util.logging.Level.SEVERE, "com.google.speech.recognizer.AbstractRecognizer", "run", "bad protocol buffer from recognizer jni");
            akzx akzxVarM = defpackage.amkd.a.m();
            akzxVarM.u();
            defpackage.amkd amkdVar = (defpackage.amkd) akzxVarM.b;
            amkdVar.c = 2;
            amkdVar.b |= 1;
            return (defpackage.amkd) akzxVarM.p();
        }
    }

    public final int d(byte[] bArr, com.google.speech.recognizer.ResourceManager resourceManager) {
        b();
        this.e = resourceManager;
        return a.aS(nativeInitFromProto(this.b, resourceManager.a, bArr));
    }

    public final void e(defpackage.amkc amkcVar) {
        this.d.add(amkcVar);
    }

    public final void f(java.io.InputStream inputStream) {
        this.c = inputStream;
    }

    protected final void finalize() {
        a();
    }

    protected void handleAudioLevelEvent(byte[] bArr) {
        defpackage.amke amkeVar = (defpackage.amke) alad.B(defpackage.amke.a, bArr, akzq.a());
        java.util.Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((defpackage.amkc) it.next()).c(amkeVar);
        }
    }

    protected void handleEndpointerEvent(byte[] bArr) {
        defpackage.amkf amkfVar = (defpackage.amkf) alad.B(defpackage.amkf.a, bArr, akzq.a());
        java.util.Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((defpackage.amkc) it.next()).d(amkfVar);
        }
    }

    protected void handleHotwordEvent(byte[] bArr) {
        java.util.Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((defpackage.amkc) it.next()).h();
        }
    }

    protected void handleRecognitionEvent(byte[] bArr) {
        defpackage.amkl amklVarB = alad.B(defpackage.amkl.a, bArr, akzq.a());
        java.util.Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((defpackage.amkc) it.next()).e(amklVarB);
        }
    }

    protected int read(byte[] bArr) throws java.io.IOException {
        if (bArr.length == 0) {
            throw new java.io.IOException("illegal zero length buffer");
        }
        int i = this.c.read(bArr);
        if (i == -1) {
            return 0;
        }
        return i;
    }
}
