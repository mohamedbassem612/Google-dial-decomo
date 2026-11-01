package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cbs extends defpackage.caz {
    public long a;
    public final defpackage.ccp b;
    final /* synthetic */ defpackage.cbt c;
    public final defpackage.ady d;
    private final boolean e;
    private final boolean f;
    private java.util.Set g;

    public cbs(defpackage.cbt cbtVar, long j, boolean z, boolean z2) {
        this.c = cbtVar;
        this.a = j;
        this.e = z;
        this.f = z2;
        defpackage.ady adyVar = defpackage.adz.a;
        this.d = new defpackage.ady(6);
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.cje.d, defpackage.cdu.a);
    }

    @Override // defpackage.caz
    public final long a() {
        return this.a;
    }

    @Override // defpackage.caz
    public final cal b(defpackage.aomy aomyVar) {
        return this.c.b.b(aomyVar);
    }

    @Override // defpackage.caz
    public final defpackage.cay c() {
        return this.c.f;
    }

    @Override // defpackage.caz
    public final defpackage.aolr d() {
        return this.c.b.d();
    }

    @Override // defpackage.caz
    public final void e(cck cckVar) {
        this.c.b.e(cckVar);
    }

    @Override // defpackage.caz
    public final void f() {
        this.c.m--;
    }

    @Override // defpackage.caz
    public final void g(java.util.Set set) {
        java.util.Set hashSet = this.g;
        if (hashSet == null) {
            hashSet = new java.util.HashSet();
            this.g = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.caz
    public final void h(defpackage.cav cavVar) {
        this.d.j(cavVar);
    }

    @Override // defpackage.caz
    public final void i(defpackage.cdk cdkVar) {
        this.c.b.i(cdkVar);
    }

    @Override // defpackage.caz
    public final void j() {
        this.c.m++;
    }

    @Override // defpackage.caz
    public final void k(defpackage.cav cavVar) {
        java.util.Set set = this.g;
        if (set != null) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((java.util.Set) it.next()).remove(((defpackage.cbt) cavVar).d());
            }
        }
        this.d.l(cavVar);
    }

    @Override // defpackage.caz
    public final boolean l() {
        return this.c.b.l();
    }

    @Override // defpackage.caz
    public final boolean m() {
        return this.e;
    }

    @Override // defpackage.caz
    public final boolean n() {
        return this.f;
    }

    @Override // defpackage.caz
    public final defpackage.ady o(defpackage.cbb cbbVar, ceb cebVar, defpackage.aonn aonnVar) {
        return this.c.b.o(cbbVar, cebVar, aonnVar);
    }

    @Override // defpackage.caz
    public final defpackage.ady p(defpackage.cbb cbbVar, ceb cebVar, defpackage.ady adyVar) {
        return this.c.b.p(cbbVar, cebVar, adyVar);
    }

    @Override // defpackage.caz
    public final void q(defpackage.cbb cbbVar, defpackage.aonn aonnVar) {
        this.c.b.q(cbbVar, aonnVar);
    }

    @Override // defpackage.caz
    public final void r(defpackage.cbb cbbVar) {
        defpackage.cbt cbtVar = this.c;
        defpackage.caz cazVar = cbtVar.b;
        cazVar.r(cbtVar.f);
        cazVar.r(cbbVar);
    }

    @Override // defpackage.caz
    public final void s(defpackage.cbb cbbVar) {
        this.c.b.s(cbbVar);
    }

    @Override // defpackage.caz
    public final void t(defpackage.cbb cbbVar) {
        this.c.b.t(cbbVar);
    }

    @Override // defpackage.caz
    public final defpackage.cje u() {
        return (defpackage.cje) this.b.a();
    }

    @Override // defpackage.caz
    public final void w() {
        this.c.b.w();
    }

    @Override // defpackage.caz
    public final vk x(cck cckVar) {
        return this.c.b.x(cckVar);
    }

    @Override // defpackage.caz
    public final void y(cck cckVar, vk vkVar, defpackage.cah cahVar) {
        this.c.b.y(cckVar, vkVar, cahVar);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0065 A[LOOP:0: B:9:0x0019->B:23:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0068 A[EDGE_INSN: B:27:0x0068->B:24:0x0068 BREAK  A[LOOP:0: B:9:0x0019->B:23:0x0065], SYNTHETIC] */
    public final void z() {
        int i;
        defpackage.ady adyVar = this.d;
        if (adyVar.c()) {
            java.util.Set set = this.g;
            if (set != null) {
                java.lang.Object[] objArr = adyVar.b;
                long[] jArr = adyVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i2 != length) {
                                break;
                                break;
                            }
                            i2++;
                        } else {
                            int i3 = i2 - length;
                            int i4 = 0;
                            while (true) {
                                i = 8 - ((~i3) >>> 31);
                                if (i4 >= i) {
                                    break;
                                }
                                if ((255 & j) < 128) {
                                    defpackage.cbt cbtVar = (defpackage.cbt) objArr[(i2 << 3) + i4];
                                    java.util.Iterator it = set.iterator();
                                    while (it.hasNext()) {
                                        ((java.util.Set) it.next()).remove(cbtVar.d());
                                    }
                                }
                                j >>= 8;
                                i4++;
                            }
                            if (i != 8) {
                                break;
                            } else if (i2 != length) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
            }
            adyVar.d();
        }
    }

    @Override // defpackage.caz
    public final void v() {
    }
}
