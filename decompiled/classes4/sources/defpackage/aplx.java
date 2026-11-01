package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aplx implements apqb {
    final /* synthetic */ defpackage.apmc a;
    private final defpackage.apph b;
    private boolean c;

    public aplx(defpackage.apmc apmcVar) {
        this.a = apmcVar;
        this.b = new defpackage.apph(apmcVar.f.c.fP());
    }

    public final synchronized void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        defpackage.apmc apmcVar = this.a;
        apoz apozVar = apmcVar.f.c;
        apozVar.ab("0\r\n\r\n");
        apozVar.flush();
        defpackage.apmc.n(this.b);
        apmcVar.d = 3;
    }

    public final apqf fP() {
        return this.b;
    }

    public final void fQ(apoy apoyVar, long j) {
        if (this.c) {
            throw new java.lang.IllegalStateException("closed");
        }
        appv appvVar = this.a.f.c;
        appv appvVar2 = appvVar;
        if (appvVar2.c) {
            throw new java.lang.IllegalStateException("closed");
        }
        appvVar2.b.Y(j);
        appvVar2.c();
        appvVar.ab("\r\n");
        appvVar.fQ(apoyVar, j);
        appvVar.ab("\r\n");
    }

    public final synchronized void flush() {
        if (!this.c) {
            this.a.f.c.flush();
        }
    }
}
