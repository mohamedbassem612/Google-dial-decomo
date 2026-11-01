package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fdu implements defpackage.feb {
    public static final java.util.ArrayDeque a = new java.util.ArrayDeque();
    public static final java.lang.Object b = new java.lang.Object();
    public final android.media.MediaCodec c;
    public final java.util.concurrent.atomic.AtomicReference d;
    public final defpackage.agze e;
    private final android.os.HandlerThread f;
    private android.os.Handler g;
    private boolean h;

    public fdu(android.media.MediaCodec mediaCodec, android.os.HandlerThread handlerThread) {
        defpackage.agze agzeVar = new defpackage.agze(null);
        this.c = mediaCodec;
        this.f = handlerThread;
        this.e = agzeVar;
        this.d = new java.util.concurrent.atomic.AtomicReference();
    }

    private static defpackage.fdt h() {
        defpackage.fdt fdtVar;
        java.util.ArrayDeque arrayDeque = a;
        synchronized (arrayDeque) {
            fdtVar = arrayDeque.isEmpty() ? new defpackage.fdt() : (defpackage.fdt) arrayDeque.removeFirst();
        }
        return fdtVar;
    }

    private static byte[] i(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < (length = bArr.length)) {
                return java.util.Arrays.copyOf(bArr, bArr.length);
            }
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
        }
        return bArr2;
    }

    private static int[] j(int[] iArr, int[] iArr2) {
        int length;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < (length = iArr.length)) {
                return java.util.Arrays.copyOf(iArr, iArr.length);
            }
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, length);
        }
        return iArr2;
    }

    @Override // defpackage.feb
    public final void a() {
        if (this.h) {
            try {
                android.os.Handler handler = this.g;
                ahvr.ci(handler);
                handler.removeCallbacksAndMessages(null);
                defpackage.agze agzeVar = this.e;
                agzeVar.e();
                android.os.Handler handler2 = this.g;
                ahvr.ci(handler2);
                handler2.obtainMessage(3).sendToTarget();
                agzeVar.b();
            } catch (java.lang.InterruptedException e) {
                java.lang.Thread.currentThread().interrupt();
                throw new java.lang.IllegalStateException(e);
            }
        }
    }

    @Override // defpackage.feb
    public final void b() {
        java.lang.RuntimeException runtimeException = (java.lang.RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // defpackage.feb
    public final void c(android.os.Bundle bundle) {
        b();
        android.os.Handler handler = this.g;
        java.lang.String str = eum.a;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.feb
    public final void d() {
        if (this.h) {
            a();
            this.f.quit();
        }
        this.h = false;
    }

    @Override // defpackage.feb
    public final void e() {
        if (this.h) {
            return;
        }
        android.os.HandlerThread handlerThread = this.f;
        handlerThread.start();
        this.g = new defpackage.fds(this, handlerThread.getLooper());
        this.h = true;
    }

    @Override // defpackage.feb
    public final void f(int i, int i2, long j, int i3) {
        b();
        defpackage.fdt fdtVarH = h();
        fdtVarH.a(i, i2, j, i3);
        android.os.Handler handler = this.g;
        java.lang.String str = eum.a;
        handler.obtainMessage(1, fdtVarH).sendToTarget();
    }

    @Override // defpackage.feb
    public final void g(int i, defpackage.ewq ewqVar, long j, int i2) {
        b();
        defpackage.fdt fdtVarH = h();
        fdtVarH.a(i, 0, j, i2);
        android.media.MediaCodec.CryptoInfo cryptoInfo = fdtVarH.d;
        cryptoInfo.numSubSamples = ewqVar.f;
        cryptoInfo.numBytesOfClearData = j(ewqVar.d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = j(ewqVar.e, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrI = i(ewqVar.b, cryptoInfo.key);
        ahvr.ci(bArrI);
        cryptoInfo.key = bArrI;
        byte[] bArrI2 = i(ewqVar.a, cryptoInfo.iv);
        ahvr.ci(bArrI2);
        cryptoInfo.iv = bArrI2;
        cryptoInfo.mode = ewqVar.c;
        fh$.ExternalSyntheticApiModelOutline0.m(cryptoInfo, new android.media.MediaCodec.CryptoInfo.Pattern(ewqVar.g, ewqVar.h));
        android.os.Handler handler = this.g;
        java.lang.String str = eum.a;
        handler.obtainMessage(2, fdtVarH).sendToTarget();
    }
}
