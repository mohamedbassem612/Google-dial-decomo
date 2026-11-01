package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fjf implements defpackage.fkm {
    public final java.util.Queue a;
    public android.view.Surface b;
    public defpackage.fkj c;
    public java.util.concurrent.Executor d;
    public defpackage.fjx e;
    private final defpackage.fka f;
    private final defpackage.fkb g;
    private final defpackage.fkg h;
    private final defpackage.fji i;
    private defpackage.eqg j;
    private long k;

    public fjf(defpackage.fka fkaVar, defpackage.fkb fkbVar, defpackage.etc etcVar) {
        this.f = fkaVar;
        this.g = fkbVar;
        fkaVar.b = etcVar;
        defpackage.fji fjiVar = new defpackage.fji(new defpackage.fjk(fkaVar, 1));
        this.i = fjiVar;
        this.h = new defpackage.fkg(new defpackage.fje(this), fkaVar, fkbVar, fjiVar);
        this.a = new java.util.ArrayDeque();
        this.j = new defpackage.eqg(new defpackage.eqf());
        this.k = -9223372036854775807L;
        this.c = defpackage.fkj.b;
        this.d = new defpackage.fjq(1);
        this.e = new defpackage.fjd();
    }

    @Override // defpackage.fkm
    public final android.view.Surface a() {
        android.view.Surface surface = this.b;
        ahvr.ci(surface);
        return surface;
    }

    @Override // defpackage.fkm
    public final void b() {
        this.f.b();
    }

    @Override // defpackage.fkm
    public final void c() {
        this.b = null;
        this.f.i(null);
    }

    @Override // defpackage.fkm
    public final void d(boolean z) {
        if (z) {
            this.f.g();
        }
        this.g.c();
        defpackage.fkg fkgVar = this.h;
        defpackage.evf evfVar = fkgVar.m;
        evfVar.d = 0;
        evfVar.c = -1;
        evfVar.a = 0;
        fkgVar.g = -9223372036854775807L;
        fkgVar.h = -9223372036854775807L;
        fkgVar.i = -9223372036854775807L;
        defpackage.euj eujVar = fkgVar.d;
        if (eujVar.a() > 0) {
            fkgVar.k = ((java.lang.Long) defpackage.fkg.a(eujVar)).longValue();
        }
        defpackage.euj eujVar2 = fkgVar.c;
        if (eujVar2.a() > 0) {
            eujVar2.d(0L, (defpackage.ery) defpackage.fkg.a(eujVar2));
        }
        this.a.clear();
    }

    @Override // defpackage.fkm
    public final void e(boolean z) {
        this.f.c(z);
    }

    @Override // defpackage.fkm
    public final void f() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.fkm
    public final void h(long j, long j2) throws defpackage.fkl {
        try {
            defpackage.fkg fkgVar = this.h;
            while (true) {
                defpackage.evf evfVar = fkgVar.m;
                if (evfVar.i()) {
                    return;
                }
                if (evfVar.a == 0) {
                    throw new java.util.NoSuchElementException();
                }
                long j3 = ((long[]) evfVar.e)[evfVar.d];
                java.lang.Long l = (java.lang.Long) fkgVar.d.c(j3);
                if (l != null && l.longValue() != fkgVar.k) {
                    fkgVar.k = l.longValue();
                    fkgVar.a.f(2);
                }
                defpackage.fji fjiVar = fkgVar.f;
                fjiVar.c(1000 * j3);
                defpackage.fka fkaVar = fkgVar.a;
                long j4 = fkgVar.k;
                long jA = fjiVar.a();
                long j5 = fjiVar.a;
                defpackage.fjy fjyVar = fkgVar.b;
                int iA = fkaVar.a(j3, j, j2, j4, false, false, jA, j5, false, fjyVar);
                if (iA != 5 && iA != 4) {
                    fkgVar.e.b(j3, fjyVar.a);
                }
                if (iA == 0 || iA == 1) {
                    fkgVar.h = j3;
                    long jH = evfVar.h();
                    defpackage.ery eryVar = (defpackage.ery) fkgVar.c.c(jH);
                    if (eryVar != null && !eryVar.equals(defpackage.ery.a) && !eryVar.equals(fkgVar.j)) {
                        fkgVar.j = eryVar;
                        defpackage.fje fjeVar = fkgVar.l;
                        defpackage.ery eryVar2 = fkgVar.j;
                        defpackage.eqf eqfVar = new defpackage.eqf();
                        eqfVar.t = eryVar2.b;
                        eqfVar.u = eryVar2.c;
                        eqfVar.c("video/raw");
                        fjeVar.a = new defpackage.eqg(eqfVar);
                        ((defpackage.fjf) fjeVar.b).d.execute(new defpackage.fay(fjeVar, 14));
                    }
                    long jNanoTime = iA == 0 ? java.lang.System.nanoTime() : fjyVar.b;
                    defpackage.fje fjeVar2 = fkgVar.l;
                    if (fkaVar.n()) {
                        java.lang.Object obj = fjeVar2.b;
                        if (((defpackage.fjf) obj).b != null) {
                            ((defpackage.fjf) obj).d.execute(new defpackage.fay(fjeVar2, 12));
                        }
                    }
                    java.lang.Object eqgVar = fjeVar2.a;
                    if (eqgVar == null) {
                        eqgVar = new defpackage.eqg(new defpackage.eqf());
                    }
                    java.lang.Object obj2 = fjeVar2.b;
                    ((defpackage.fjf) obj2).e.a(jH, jNanoTime, (defpackage.eqg) eqgVar, null);
                    ((defpackage.fkk) ((defpackage.fjf) obj2).a.remove()).a(jNanoTime);
                } else if (iA == 2 || iA == 3) {
                    fkgVar.h = j3;
                    evfVar.h();
                    defpackage.fje fjeVar3 = fkgVar.l;
                    java.lang.Object obj3 = fjeVar3.b;
                    ((defpackage.fjf) obj3).d.execute(new defpackage.fay(fjeVar3, 13));
                    ((defpackage.fkk) ((defpackage.fjf) obj3).a.remove()).b();
                } else if (iA != 4) {
                    return;
                } else {
                    fkgVar.h = j3;
                }
            }
        } catch (defpackage.exl e) {
            throw new defpackage.fkl(e, this.j);
        }
    }

    @Override // defpackage.fkm
    public final void i(long j) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.fkm
    public final void j(int i) {
        this.f.h(i);
    }

    @Override // defpackage.fkm
    public final void k(defpackage.fkj fkjVar, java.util.concurrent.Executor executor) {
        this.c = fkjVar;
        this.d = executor;
    }

    @Override // defpackage.fkm
    public final void l(android.view.Surface surface, defpackage.ety etyVar) {
        this.b = surface;
        this.f.i(surface);
    }

    @Override // defpackage.fkm
    public final void m(float f) {
        this.f.j(f);
    }

    @Override // defpackage.fkm
    public final void n(java.util.List list) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.fkm
    public final void o(defpackage.fjx fjxVar) {
        this.e = fjxVar;
    }

    @Override // defpackage.fkm
    public final void p() {
        defpackage.fkg fkgVar = this.h;
        long j = fkgVar.g;
        if (j == -9223372036854775807L) {
            j = Long.MIN_VALUE;
            fkgVar.g = Long.MIN_VALUE;
            fkgVar.h = Long.MIN_VALUE;
        }
        fkgVar.i = j;
    }

    @Override // defpackage.fkm
    public final void q() {
        this.g.c();
        this.f.d();
    }

    @Override // defpackage.fkm
    public final void r() {
        this.g.c();
        this.f.e();
    }

    @Override // defpackage.fkm
    public final boolean s(long j, defpackage.fkk fkkVar) {
        this.a.add(fkkVar);
        defpackage.fkg fkgVar = this.h;
        defpackage.evf evfVar = fkgVar.m;
        int i = evfVar.a;
        java.lang.Object obj = evfVar.e;
        int length = ((long[]) obj).length;
        if (i == length) {
            int i2 = length << 1;
            if (i2 < 0) {
                throw new java.lang.IllegalStateException();
            }
            long[] jArr = new long[i2];
            int i3 = evfVar.d;
            int i4 = length - i3;
            java.lang.System.arraycopy(obj, i3, jArr, 0, i4);
            java.lang.System.arraycopy(evfVar.e, 0, jArr, i4, i3);
            evfVar.d = 0;
            evfVar.c = evfVar.a - 1;
            evfVar.e = jArr;
            obj = evfVar.e;
            evfVar.b = ((long[]) obj).length - 1;
        }
        int i5 = (evfVar.c + 1) & evfVar.b;
        evfVar.c = i5;
        ((long[]) obj)[i5] = j;
        evfVar.a++;
        fkgVar.g = j;
        fkgVar.i = -9223372036854775807L;
        this.d.execute(new defpackage.fay(this, 11));
        return true;
    }

    @Override // defpackage.fkm
    public final boolean t() {
        defpackage.fkg fkgVar = this.h;
        long j = fkgVar.i;
        return j != -9223372036854775807L && fkgVar.h == j;
    }

    @Override // defpackage.fkm
    public final boolean u() {
        return true;
    }

    @Override // defpackage.fkm
    public final boolean v(boolean z) {
        return this.f.m(z);
    }

    @Override // defpackage.fkm
    public final void w(defpackage.eqg eqgVar, long j, int i, java.util.List list) {
        ahvr.bY(list.isEmpty());
        int i2 = eqgVar.v;
        defpackage.eqg eqgVar2 = this.j;
        if (i2 != eqgVar2.v || eqgVar.w != eqgVar2.w) {
            defpackage.fkg fkgVar = this.h;
            int i3 = eqgVar.w;
            defpackage.euj eujVar = fkgVar.c;
            long j2 = fkgVar.g;
            eujVar.d(j2 == -9223372036854775807L ? 0L : j2 + 1, new defpackage.ery(i2, i3, 1.0f));
        }
        float f = eqgVar.z;
        if (f != this.j.z) {
            this.i.b(f);
        }
        this.j = eqgVar;
        if (j != this.k) {
            defpackage.fkg fkgVar2 = this.h;
            if (fkgVar2.m.i()) {
                fkgVar2.a.f(i);
                fkgVar2.k = j;
            } else {
                defpackage.euj eujVar2 = fkgVar2.d;
                long j3 = fkgVar2.g;
                eujVar2.d(j3 == -9223372036854775807L ? -4611686018427387904L : j3 + 1, java.lang.Long.valueOf(j));
            }
            this.k = j;
        }
    }

    @Override // defpackage.fkm
    public final void g() {
    }

    @Override // defpackage.fkm
    public final void x(defpackage.eqg eqgVar) {
    }
}
