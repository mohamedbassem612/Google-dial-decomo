package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bba extends defpackage.bei {
    public final long a;
    public final defpackage.bas b;
    final /* synthetic */ boolean c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ defpackage.cmi f;
    final /* synthetic */ boolean g;
    final /* synthetic */ int h;
    final /* synthetic */ int i;
    final /* synthetic */ long j;
    final /* synthetic */ defpackage.bbh k;
    final /* synthetic */ defpackage.bee l;
    final /* synthetic */ defpackage.cmn m;
    private final defpackage.bee n;

    public bba(long j, boolean z, defpackage.bas basVar, defpackage.bee beeVar, int i, int i2, defpackage.cmi cmiVar, defpackage.cmn cmnVar, boolean z2, int i3, int i4, long j2, defpackage.bbh bbhVar) {
        int iB;
        this.c = z;
        this.l = beeVar;
        this.d = i;
        this.e = i2;
        this.f = cmiVar;
        this.m = cmnVar;
        this.g = z2;
        this.h = i3;
        this.i = i4;
        this.j = j2;
        this.k = bbhVar;
        this.b = basVar;
        this.n = beeVar;
        int iA = Integer.MAX_VALUE;
        if (z) {
            iB = defpackage.dpd.b(j);
        } else {
            iA = defpackage.dpd.a(j);
            iB = Integer.MAX_VALUE;
        }
        this.a = defpackage.dpe.c(0, iB, 0, iA);
    }

    public final defpackage.baz a(int i, long j) {
        defpackage.bas basVar = this.b;
        java.lang.Object objD = basVar.d(i);
        basVar.c(i);
        int i2 = this.d;
        java.util.List listE = e(this.n, i, j);
        int i3 = i == i2 + (-1) ? 0 : this.e;
        boolean z = this.c;
        defpackage.cmi cmiVar = this.f;
        defpackage.cmn cmnVar = this.m;
        defpackage.bee beeVar = this.l;
        return new defpackage.baz(i, listE, z, cmiVar, cmnVar, beeVar.p(), this.g, this.h, this.i, i3, this.j, objD, this.k.k, j);
    }

    @Override // defpackage.bei
    public final /* synthetic */ defpackage.bef b(int i, int i2, int i3, long j) {
        return a(i, j);
    }

    public final void c(int i) {
        if (i < 0 || i >= this.b.b()) {
            return;
        }
        this.n.s(i);
    }

    public final defpackage.aaif d() {
        return this.b.b;
    }
}
