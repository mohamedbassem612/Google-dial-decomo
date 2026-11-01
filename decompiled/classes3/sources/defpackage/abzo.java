package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class abzo extends anmg {
    public final java.lang.Object a = new java.lang.Object();
    public final defpackage.aeto b;
    public boolean c;
    public int d;
    public int e;

    public abzo(defpackage.aeto aetoVar) {
        this.b = aetoVar;
    }

    public final void a() {
        synchronized (this.a) {
            if (!this.c) {
                defpackage.aeto aetoVar = this.b;
                aetoVar.b = android.os.SystemClock.elapsedRealtime() - aetoVar.a;
            }
        }
    }

    public final void b(long j) {
        synchronized (this.a) {
            this.d += (int) j;
        }
    }

    public final void c(long j) {
        synchronized (this.a) {
            this.e += (int) j;
        }
    }

    public final void d(anlw anlwVar) {
        synchronized (this.a) {
            defpackage.aeto aetoVar = this.b;
            java.net.SocketAddress socketAddress = (java.net.SocketAddress) anlwVar.a(annh.a);
            if (!(socketAddress instanceof java.net.InetSocketAddress)) {
                if (socketAddress instanceof defpackage.anun) {
                    aetoVar.t = 2;
                } else if (socketAddress instanceof anrk) {
                    aetoVar.t = 3;
                }
            }
        }
    }
}
