package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bcb implements cyf {
    public final defpackage.bce a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final aoss f;
    public final dpf g;
    public final aonj h;
    public final aonj i;
    public final int j;
    public final beo k;
    public final java.util.List l;
    public final int m;
    public final int n;
    public final aso o;
    public final int p;
    public final int q;
    public final defpackage.bbo r;
    private final cyf s;
    private final boolean t;
    private final int u;
    private final int v;

    public bcb(defpackage.bce bceVar, int i, boolean z, float f, cyf cyfVar, float f2, boolean z2, aoss aossVar, dpf dpfVar, int i2, aonj aonjVar, aonj aonjVar2, int i3, beo beoVar, defpackage.bbo bboVar, java.util.List list, int i4, int i5, int i6, aso asoVar, int i7, int i8) {
        this.a = bceVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.s = cyfVar;
        this.e = f2;
        this.t = z2;
        this.f = aossVar;
        this.g = dpfVar;
        this.u = i2;
        this.h = aonjVar;
        this.i = aonjVar2;
        this.j = i3;
        this.k = beoVar;
        this.r = bboVar;
        this.l = list;
        this.v = i4;
        this.m = i5;
        this.n = i6;
        this.o = asoVar;
        this.p = i7;
        this.q = i8;
    }

    public final int a() {
        return -this.v;
    }

    public final int b() {
        return this.s.b();
    }

    public final int c() {
        return this.s.c();
    }

    public final long d() {
        return (((long) c()) << 32) | (((long) b()) & 4294967295L);
    }

    public final defpackage.bcb e(int i, boolean z) {
        defpackage.bce bceVar;
        int i2;
        long j;
        if (this.t) {
            return null;
        }
        java.util.List list = this.l;
        if (list.isEmpty() || (bceVar = this.a) == null || (i2 = this.b - i) < 0 || i2 >= bceVar.d) {
            return null;
        }
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        defpackage.bcc bccVar = (defpackage.bcc) list.get(0);
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        defpackage.bcc bccVar2 = (defpackage.bcc) list.get(list.size() - 1);
        if (bccVar.n || bccVar2.n) {
            return null;
        }
        if (i < 0) {
            aso asoVar = this.o;
            if (java.lang.Math.min((ru.d(bccVar, asoVar) + bccVar.e()) - this.v, (ru.d(bccVar2, asoVar) + bccVar2.e()) - this.m) <= (-i)) {
                return null;
            }
        } else {
            int i3 = this.v;
            aso asoVar2 = this.o;
            if (java.lang.Math.min(i3 - ru.d(bccVar, asoVar2), this.m - ru.d(bccVar2, asoVar2)) <= i) {
                return null;
            }
        }
        int size = list.size();
        int i4 = 0;
        while (i4 < size) {
            defpackage.bcc bccVar3 = (defpackage.bcc) list.get(i4);
            if (!bccVar3.n) {
                long j2 = bccVar3.k;
                long j3 = 4294967295L;
                boolean z2 = bccVar3.c;
                bccVar3.k = (((long) ((int) (j2 >> 32))) << 32) | (((long) (((int) (j2 & 4294967295L)) + i)) & 4294967295L);
                if (z) {
                    int size2 = bccVar3.e.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        bfe bfeVarD = bccVar3.f.d(bccVar3.b, i5);
                        if (bfeVarD != null) {
                            long jD = bfeVarD.d();
                            j = j3;
                            bfeVarD.q((((long) ((int) (jD >> 32))) << 32) | (((long) java.lang.Integer.valueOf(((int) (jD & j)) + i).intValue()) & j));
                        } else {
                            j = j3;
                        }
                        i5++;
                        size = size;
                        j3 = j;
                        list = list;
                    }
                }
            }
            i4++;
            size = size;
            list = list;
        }
        return new defpackage.bcb(bceVar, i2, this.c || i > 0, i, this.s, this.e, false, this.f, this.g, this.u, this.h, this.i, this.j, this.k, this.r, list, this.v, this.m, this.n, this.o, this.p, this.q);
    }

    public final java.util.Map f() {
        return this.s.f();
    }

    public final aonj g() {
        return this.s.g();
    }

    public final aonn h() {
        return this.s.h();
    }

    public final void i() {
        this.s.i();
    }

    public final void j() {
        this.s.j();
    }
}
