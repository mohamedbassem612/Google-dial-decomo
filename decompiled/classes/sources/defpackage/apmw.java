package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apmw implements defpackage.apqb {
    public final boolean a;
    public boolean b;
    final /* synthetic */ defpackage.apmz c;
    private final defpackage.apoy d = new defpackage.apoy();

    public apmw(defpackage.apmz apmzVar, boolean z) {
        this.c = apmzVar;
        this.a = z;
    }

    private final void c(boolean z) {
        defpackage.apmy apmyVar;
        defpackage.apoy apoyVar;
        long jMin;
        boolean z2;
        defpackage.apmz apmzVar = this.c;
        synchronized (apmzVar) {
            apmyVar = apmzVar.j;
            apmyVar.d();
            while (apmzVar.d >= apmzVar.e && !this.a && !this.b && apmzVar.c() == null) {
                try {
                    apmzVar.k();
                } catch (java.lang.Throwable th) {
                    apmzVar.j.b();
                    throw th;
                }
            }
            apmyVar.b();
            apmzVar.f();
            long j = apmzVar.e - apmzVar.d;
            apoyVar = this.d;
            jMin = java.lang.Math.min(j, apoyVar.b);
            apmzVar.d += jMin;
            boolean z3 = false;
            if (z && jMin == apoyVar.b) {
                z3 = true;
            }
            z2 = z3;
        }
        apmyVar.d();
        try {
            apmzVar.b.h(apmzVar.a, z2, apoyVar, jMin);
        } finally {
            this.c.j.b();
        }
    }

    @Override // defpackage.apqb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        java.util.TimeZone timeZone = defpackage.apjx.a;
        defpackage.apmz apmzVar = this.c;
        synchronized (apmzVar) {
            if (this.b) {
                return;
            }
            defpackage.apme apmeVarC = apmzVar.c();
            defpackage.apmz apmzVar2 = this.c;
            if (!apmzVar2.h.a) {
                defpackage.apoy apoyVar = this.d;
                if (apoyVar.b > 0) {
                    while (apoyVar.b > 0) {
                        c(true);
                    }
                } else if (apmeVarC == null) {
                    apmzVar2.b.h(apmzVar2.a, true, null, 0L);
                }
            }
            synchronized (apmzVar2) {
                this.b = true;
                apmzVar2.notifyAll();
            }
            defpackage.apmz apmzVar3 = this.c;
            apmzVar3.b.e();
            apmzVar3.e();
        }
    }

    @Override // defpackage.apqb
    public final defpackage.apqf fP() {
        return this.c.j;
    }

    @Override // defpackage.apqb
    public final void fQ(defpackage.apoy apoyVar, long j) {
        java.util.TimeZone timeZone = defpackage.apjx.a;
        defpackage.apoy apoyVar2 = this.d;
        apoyVar2.fQ(apoyVar, j);
        while (apoyVar2.b >= 16384) {
            c(false);
        }
    }

    @Override // defpackage.apqb, java.io.Flushable
    public final void flush() {
        java.util.TimeZone timeZone = defpackage.apjx.a;
        defpackage.apmz apmzVar = this.c;
        synchronized (apmzVar) {
            apmzVar.f();
        }
        while (this.d.b > 0) {
            c(false);
            this.c.b.e();
        }
    }
}
