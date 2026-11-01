package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gjp {
    public static final java.util.Map a = new java.util.HashMap();
    public final boolean b;
    private final java.io.File c;
    private final java.util.concurrent.locks.Lock d;
    private java.nio.channels.FileChannel e;

    public gjp(java.lang.String str, java.io.File file) {
        java.util.concurrent.locks.Lock lock;
        if (str == null) {
            defpackage.aooh.i("name");
        }
        this.b = false;
        this.c = file != null ? new java.io.File(file, java.lang.String.valueOf(str).concat(".lck")) : null;
        java.util.Map map = a;
        synchronized (map) {
            java.lang.Object reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new java.util.concurrent.locks.ReentrantLock();
                map.put(str, reentrantLock);
            }
            lock = (java.util.concurrent.locks.Lock) reentrantLock;
        }
        this.d = lock;
    }

    public final void a(boolean z) {
        this.d.lock();
        if (z) {
            try {
                java.io.File file = this.c;
                if (file == null) {
                    throw new java.io.IOException("No lock directory was provided.");
                }
                java.io.File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                java.nio.channels.FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new java.io.FileOutputStream(file).getChannel());
                fileChannelConvertMaybeLegacyFileChannelFromLibrary.lock();
                this.e = fileChannelConvertMaybeLegacyFileChannelFromLibrary;
            } catch (java.io.IOException e) {
                this.e = null;
                android.util.Log.w("SupportSQLiteLock", "Unable to grab file lock.", e);
            }
        }
    }

    public final void b() {
        try {
            java.nio.channels.FileChannel fileChannel = this.e;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (java.io.IOException unused) {
        }
        this.d.unlock();
    }
}
