package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apna implements java.io.Closeable {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.apmk.class.getName());
    public final defpackage.apoz b;
    public final defpackage.apoy c;
    public int d;
    public boolean e;
    public final defpackage.apmi f;

    public apna(defpackage.apoz apozVar) {
        this.b = apozVar;
        defpackage.apoy apoyVar = new defpackage.apoy();
        this.c = apoyVar;
        this.d = 16384;
        this.f = new defpackage.apmi(apoyVar);
    }

    public final void a(boolean z, int i, defpackage.apoy apoyVar, int i2) {
        synchronized (this) {
            if (this.e) {
                throw new java.io.IOException("closed");
            }
            c(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                defpackage.apoz apozVar = this.b;
                defpackage.aooh.c(apoyVar);
                apozVar.fQ(apoyVar, i2);
            }
        }
    }

    public final void b() {
        synchronized (this) {
            if (this.e) {
                throw new java.io.IOException("closed");
            }
            this.b.flush();
        }
    }

    public final void c(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            java.util.logging.Logger logger = a;
            if (logger.isLoggable(java.util.logging.Level.FINE)) {
                defpackage.appb appbVar = defpackage.apmk.a;
                logger.fine(defpackage.apmk.b(false, i, i2, i3, i4));
            }
        }
        int i5 = this.d;
        if (i2 > i5) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bf(i2, i5, "FRAME_SIZE_ERROR length > ", ": "));
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bj(i, "reserved bit set: "));
        }
        defpackage.apoz apozVar = this.b;
        int i6 = defpackage.apjv.a;
        apozVar.O((i2 >>> 16) & 255);
        apozVar.O((i2 >>> 8) & 255);
        apozVar.O(i2 & 255);
        apozVar.O(i3);
        apozVar.O(i4);
        apozVar.Q(i & Integer.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.e = true;
            this.b.close();
        }
    }

    public final void d(int i, defpackage.apme apmeVar) {
        synchronized (this) {
            if (this.e) {
                throw new java.io.IOException("closed");
            }
            int i2 = apmeVar.o;
            c(i, 4, 3, 0);
            defpackage.apoz apozVar = this.b;
            apozVar.Q(i2);
            apozVar.flush();
        }
    }

    public final void e(int i, long j) {
        synchronized (this) {
            if (this.e) {
                throw new java.io.IOException("closed");
            }
            if (j == 0 || j > 2147483647L) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bz(j, "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: "));
            }
            java.util.logging.Logger logger = a;
            if (logger.isLoggable(java.util.logging.Level.FINE)) {
                defpackage.appb appbVar = defpackage.apmk.a;
                logger.fine(defpackage.apmk.c(false, i, j));
            }
            c(i, 4, 8, 0);
            defpackage.apoz apozVar = this.b;
            apozVar.Q((int) j);
            apozVar.flush();
        }
    }
}
