package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class f9 implements java.lang.Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ f9(java.lang.Object obj, java.lang.Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        java.lang.Object obj = this.b;
        java.lang.Object obj2 = this.c;
        switch (b) {
            case 0:
                java.lang.Runnable runnable = (java.lang.Runnable) obj2;
                try {
                    ((java.lang.Runnable) obj).run();
                    runnable.run();
                    return;
                } catch (java.lang.Throwable th) {
                    try {
                        runnable.run();
                        break;
                    } catch (java.lang.Throwable th2) {
                        try {
                            th.addSuppressed(th2);
                            break;
                        } catch (java.lang.Throwable unused) {
                        }
                    }
                    throw th;
                }
            default:
                j$.util.stream.Stream stream = (j$.util.stream.Stream) obj2;
                try {
                    ((j$.util.stream.Stream) obj).close();
                    stream.close();
                    return;
                } catch (java.lang.Throwable th3) {
                    try {
                        stream.close();
                        break;
                    } catch (java.lang.Throwable th4) {
                        try {
                            th3.addSuppressed(th4);
                            break;
                        } catch (java.lang.Throwable unused2) {
                        }
                    }
                    throw th3;
                }
        }
    }
}
