package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bay implements defpackage.cyf {
    public final defpackage.baz a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final defpackage.aoss f;
    public final defpackage.dpf g;
    public final long h;
    public final int i;
    public final defpackage.beo j;
    public final java.util.List k;
    public final int l;
    public final int m;
    public final int n;
    public final defpackage.aso o;
    public final int p;
    public final int q;
    public final defpackage.ban r;
    private final defpackage.cyf s;
    private final boolean t;
    private final boolean u;

    public bay(defpackage.baz bazVar, int i, boolean z, float f, defpackage.cyf cyfVar, float f2, boolean z2, defpackage.aoss aossVar, defpackage.dpf dpfVar, long j, int i2, defpackage.beo beoVar, defpackage.ban banVar, java.util.List list, int i3, int i4, int i5, boolean z3, defpackage.aso asoVar, int i6, int i7) {
        this.a = bazVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.s = cyfVar;
        this.e = f2;
        this.t = z2;
        this.f = aossVar;
        this.g = dpfVar;
        this.h = j;
        this.i = i2;
        this.j = beoVar;
        this.r = banVar;
        this.k = list;
        this.l = i3;
        this.m = i4;
        this.n = i5;
        this.u = z3;
        this.o = asoVar;
        this.p = i6;
        this.q = i7;
    }

    public final int a() {
        return -this.l;
    }

    @Override // defpackage.cyf
    public final int b() {
        return this.s.b();
    }

    @Override // defpackage.cyf
    public final int c() {
        return this.s.c();
    }

    public final long d() {
        return (((long) c()) << 32) | (((long) b()) & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    public final defpackage.bay e(int i, boolean z) {
        defpackage.baz bazVar;
        if (this.t) {
            return null;
        }
        java.util.List list = this.k;
        if (list.isEmpty() || (bazVar = this.a) == null) {
            return null;
        }
        int i2 = this.b - i;
        int iE = bazVar.e();
        if (i2 < 0 || i2 >= iE) {
            return null;
        }
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        int i3 = 0;
        defpackage.baz bazVar2 = (defpackage.baz) list.get(0);
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        defpackage.baz bazVar3 = (defpackage.baz) list.get(list.size() - 1);
        if (bazVar2.j || bazVar3.j) {
            return null;
        }
        if (i < 0) {
            if (java.lang.Math.min((bazVar2.g + bazVar2.e()) - this.l, (bazVar3.g + bazVar3.e()) - this.m) <= (-i)) {
                return null;
            }
        } else if (java.lang.Math.min(this.l - bazVar2.g, this.m - bazVar3.g) <= i) {
            return null;
        }
        int size = list.size();
        int i4 = 0;
        while (i4 < size) {
            defpackage.baz bazVar4 = (defpackage.baz) list.get(i4);
            if (!bazVar4.j) {
                bazVar4.g += i;
                int[] iArr = bazVar4.m;
                int length = iArr.length;
                for (int i5 = i3; i5 < length; i5++) {
                    int i6 = i5 & 1;
                    boolean z2 = bazVar4.c;
                    if (z2) {
                        if (i6 == 0) {
                            i6 = i3;
                            if (z2) {
                            }
                        } else {
                            iArr[i5] = iArr[i5] + i;
                        }
                    } else if (z2 && i6 == 0) {
                        iArr[i5] = iArr[i5] + i;
                    }
                }
                if (z) {
                    int size2 = bazVar4.b.size();
                    int i7 = i3;
                    while (i7 < size2) {
                        defpackage.bfe bfeVarD = bazVar4.f.d(bazVar4.e, i7);
                        if (bfeVarD != null) {
                            long jD = bfeVarD.d();
                            int iIntValue = (int) (jD & 4294967295L);
                            int iIntValue2 = (int) (jD >> 32);
                            if (bazVar4.c) {
                                iIntValue = java.lang.Integer.valueOf(iIntValue + i).intValue();
                            } else {
                                iIntValue2 = java.lang.Integer.valueOf(iIntValue2 + i).intValue();
                            }
                            bfeVarD.q((((long) iIntValue2) << 32) | (((long) iIntValue) & 4294967295L));
                        }
                        i7++;
                        bazVar = bazVar;
                    }
                }
            }
            i4++;
            bazVar = bazVar;
            i3 = 0;
        }
        return new defpackage.bay(bazVar, i2, this.c || i > 0, i, this.s, this.e, false, this.f, this.g, this.h, this.i, this.j, this.r, list, this.l, this.m, this.n, this.u, this.o, this.p, this.q);
    }

    @Override // defpackage.cyf
    public final java.util.Map f() {
        return this.s.f();
    }

    @Override // defpackage.cyf
    public final defpackage.aonj g() {
        return this.s.g();
    }

    @Override // defpackage.cyf
    public final defpackage.aonn h() {
        return this.s.h();
    }

    @Override // defpackage.cyf
    public final void i() {
        this.s.i();
    }

    @Override // defpackage.cyf
    public final void j() {
        this.s.j();
    }
}
