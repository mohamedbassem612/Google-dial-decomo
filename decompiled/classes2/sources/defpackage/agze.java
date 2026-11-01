package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class agze {
    public boolean a;

    public agze(android.content.Context context, android.os.Looper looper, defpackage.etc etcVar) {
        context.getApplicationContext();
        etcVar.b(looper, null);
        etcVar.b(android.os.Looper.getMainLooper(), null);
    }

    public final void a(boolean z) {
        if (this.a != z) {
            this.a = z;
        }
    }

    public final synchronized void b() {
        while (!this.a) {
            wait();
        }
    }

    public final synchronized void c() {
        boolean z = false;
        while (!this.a) {
            try {
                wait();
            } catch (java.lang.InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean d(long j) {
        if (j > 0) {
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j2 = j + jElapsedRealtime;
            if (j2 < jElapsedRealtime) {
                c();
            } else {
                boolean z = false;
                while (!this.a && jElapsedRealtime < j2) {
                    try {
                        wait(j2 - jElapsedRealtime);
                    } catch (java.lang.InterruptedException unused) {
                        z = true;
                    }
                    jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                }
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
            }
        }
        return this.a;
    }

    public final synchronized boolean e() {
        boolean z;
        z = this.a;
        this.a = false;
        return z;
    }

    public final synchronized boolean f() {
        return this.a;
    }

    public final synchronized boolean g() {
        if (this.a) {
            return false;
        }
        this.a = true;
        notifyAll();
        return true;
    }

    public agze(byte[] bArr) {
    }

    public agze() {
        this.a = true;
    }
}
