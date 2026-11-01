package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoer implements apqb {
    public final defpackage.aoes c;
    public apqb f;
    public java.net.Socket g;
    public int h;
    public int i;
    private final defpackage.aocd j;
    private boolean l;
    public final java.lang.Object a = new java.lang.Object();
    public final apoy b = new apoy();
    public boolean d = false;
    public boolean e = false;
    private boolean k = false;

    public aoer(defpackage.aocd aocdVar, defpackage.aoes aoesVar) {
        ahvr.cj(aocdVar, "executor");
        this.j = aocdVar;
        this.c = aoesVar;
    }

    public final void close() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.j.execute(new defpackage.aobd(this, 9));
    }

    public final apqf fP() {
        return apqf.k;
    }

    public final void fQ(apoy apoyVar, long j) throws java.io.IOException {
        if (this.k) {
            throw new java.io.IOException("closed");
        }
        int i = defpackage.aoik.a;
        synchronized (this.a) {
            apoy apoyVar2 = this.b;
            apoyVar2.fQ(apoyVar, j);
            int i2 = this.i + this.h;
            this.i = i2;
            boolean z = false;
            this.h = 0;
            if (!this.l && i2 > 10000) {
                this.l = true;
                z = true;
            } else if (this.d || this.e || apoyVar2.h() <= 0) {
                return;
            } else {
                this.d = true;
            }
            if (!z) {
                this.j.execute(new defpackage.aoeo(this));
                return;
            }
            try {
                this.g.close();
            } catch (java.io.IOException e) {
                this.c.e(e);
            }
        }
    }

    public final void flush() throws java.io.IOException {
        if (this.k) {
            throw new java.io.IOException("closed");
        }
        int i = defpackage.aoik.a;
        synchronized (this.a) {
            if (this.e) {
                return;
            }
            this.e = true;
            this.j.execute(new defpackage.aoep(this));
        }
    }
}
