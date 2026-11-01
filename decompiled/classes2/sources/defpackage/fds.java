package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fds extends android.os.Handler {
    final /* synthetic */ defpackage.fdu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fds(defpackage.fdu fduVar, android.os.Looper looper) {
        super(looper);
        j$.util.Objects.requireNonNull(fduVar);
        this.a = fduVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        defpackage.fdt fdtVar;
        defpackage.fdu fduVar = this.a;
        int i = message.what;
        if (i == 1) {
            fdtVar = (defpackage.fdt) message.obj;
            int i2 = fdtVar.a;
            int i3 = fdtVar.b;
            try {
                fduVar.c.queueInputBuffer(i2, 0, fdtVar.c, fdtVar.e, fdtVar.f);
            } catch (java.lang.RuntimeException e) {
                anty.aq(fduVar.d, e);
            }
        } else if (i != 2) {
            fdtVar = null;
            if (i == 3) {
                fduVar.e.g();
            } else if (i != 4) {
                anty.aq(fduVar.d, new java.lang.IllegalStateException(java.lang.String.valueOf(message.what)));
            } else {
                try {
                    fduVar.c.setParameters((android.os.Bundle) message.obj);
                } catch (java.lang.RuntimeException e2) {
                    anty.aq(fduVar.d, e2);
                }
            }
        } else {
            fdtVar = (defpackage.fdt) message.obj;
            int i4 = fdtVar.a;
            int i5 = fdtVar.b;
            android.media.MediaCodec.CryptoInfo cryptoInfo = fdtVar.d;
            long j = fdtVar.e;
            int i6 = fdtVar.f;
            try {
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    fduVar.c.queueSecureInputBuffer(i4, 0, cryptoInfo, j, i6);
                } else {
                    synchronized (defpackage.fdu.b) {
                        fduVar.c.queueSecureInputBuffer(i4, 0, cryptoInfo, j, i6);
                    }
                }
            } catch (java.lang.RuntimeException e3) {
                anty.aq(fduVar.d, e3);
            }
        }
        if (fdtVar != null) {
            java.util.ArrayDeque arrayDeque = defpackage.fdu.a;
            synchronized (arrayDeque) {
                arrayDeque.add(fdtVar);
            }
        }
    }
}
