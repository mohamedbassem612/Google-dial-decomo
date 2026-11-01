package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aawz extends java.io.OutputStream {
    public volatile defpackage.aawu a;
    private final java.io.OutputStream b;
    private final boolean c;
    private final defpackage.aawt d;

    public aawz(java.io.OutputStream outputStream, boolean z, defpackage.aawt aawtVar) {
        this.b = outputStream;
        this.c = z;
        ahvr.ci(aawtVar);
        this.d = aawtVar;
    }

    private final java.io.IOException a(java.io.IOException iOException) {
        defpackage.aawu aawuVar = this.a;
        if (aawuVar == null) {
            return iOException;
        }
        if (android.util.Log.isLoggable("ChannelOutputStream", 2)) {
            android.util.Log.v("ChannelOutputStream", "Caught IOException, but channel has been closed. Translating to ChannelIOException.", iOException);
        }
        return new defpackage.aavv(aawuVar.a, aawuVar.b);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        try {
            this.b.close();
        } catch (java.io.IOException e) {
            throw a(e);
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws java.io.IOException {
        try {
            this.b.flush();
            if (this.c) {
                try {
                    defpackage.aawt aawtVar = this.d;
                    defpackage.aawd aawdVar = aawtVar.b;
                    aafq aafqVar = new aafq();
                    aafqVar.a = new defpackage.aaav(aawtVar, 14);
                    aafqVar.b = new com.google.android.gms.common.Feature[]{defpackage.aawc.H};
                    aafqVar.b();
                    aafqVar.c = 24057;
                    aaum aaumVarI = aawdVar.i(0, aafqVar.a());
                    if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                        aazc aazcVar = aang.a;
                        aiql.D(new defpackage.zpk(aaumVarI, 4), aiql.r(aazc.w(1))).s();
                    } else {
                        aazc.t(aaumVarI);
                    }
                } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
                    if (e instanceof java.lang.InterruptedException) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                    if (android.util.Log.isLoggable("ChannelOutputStream", 3)) {
                        android.util.Log.d("ChannelOutputStream", "flush: Failed to notify the service", e);
                    }
                }
            }
        } catch (java.io.IOException e2) {
            throw a(e2);
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws java.io.IOException {
        try {
            this.b.write(i);
        } catch (java.io.IOException e) {
            throw a(e);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws java.io.IOException {
        try {
            this.b.write(bArr);
        } catch (java.io.IOException e) {
            throw a(e);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        try {
            this.b.write(bArr, i, i2);
        } catch (java.io.IOException e) {
            throw a(e);
        }
    }
}
