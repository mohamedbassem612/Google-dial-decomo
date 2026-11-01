package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class gad implements defpackage.ew {
    public final gcr a;
    public final gcr b;
    public final defpackage.ew c;
    public int d;
    public int e;
    public int f;
    private int g;
    private int h;

    public gad(gcr gcrVar, gcr gcrVar2, defpackage.ew ewVar) {
        aooh.f(gcrVar, "oldList");
        this.a = gcrVar;
        this.b = gcrVar2;
        this.c = ewVar;
        gbo gboVar = (gbo) gcrVar;
        this.d = gboVar.c;
        this.e = gboVar.d;
        this.f = gboVar.b;
        this.g = 1;
        this.h = 1;
    }

    @Override // defpackage.ew
    public final void a(int i, int i2, java.lang.Object obj) {
        this.c.a(i + this.d, i2, obj);
    }

    @Override // defpackage.ew
    public final void b(int i, int i2) {
        if (i >= this.f && this.h != 2) {
            int iMin = java.lang.Math.min(i2, this.e);
            if (iMin > 0) {
                this.h = 3;
                this.c.a(this.d + i, iMin, defpackage.fzi.b);
                this.e -= iMin;
            }
            int i3 = i2 - iMin;
            if (i3 > 0) {
                this.c.b(i + iMin + this.d, i3);
            }
        } else if (i > 0 || this.g == 2) {
            this.c.b(i + this.d, i2);
        } else {
            int iMin2 = java.lang.Math.min(i2, this.d);
            if (iMin2 > 0) {
                this.g = 3;
                this.c.a((-iMin2) + this.d, iMin2, defpackage.fzi.b);
                this.d -= iMin2;
            }
            int i4 = i2 - iMin2;
            if (i4 > 0) {
                this.c.b(this.d, i4);
            }
        }
        this.f += i2;
    }

    @Override // defpackage.ew
    public final void c(int i, int i2) {
        int i3 = this.d;
        this.c.c(i + i3, i2 + i3);
    }

    @Override // defpackage.ew
    public final void d(int i, int i2) {
        if (i + i2 >= this.f && this.h != 3) {
            int iT = aooc.t(java.lang.Math.min(this.b.d - this.e, i2), 0);
            int i3 = i2 - iT;
            if (iT > 0) {
                this.h = 2;
                this.c.a(this.d + i, iT, defpackage.fzi.a);
                this.e += iT;
            }
            if (i3 > 0) {
                this.c.d(i + iT + this.d, i3);
            }
        } else if (i > 0 || this.g == 3) {
            this.c.d(i + this.d, i2);
        } else {
            int iT2 = aooc.t(java.lang.Math.min(this.b.c - this.d, i2), 0);
            int i4 = i2 - iT2;
            if (i4 > 0) {
                this.c.d(this.d, i4);
            }
            if (iT2 > 0) {
                this.g = 2;
                this.c.a(this.d, iT2, defpackage.fzi.a);
                this.d += iT2;
            }
        }
        this.f -= i2;
    }
}
