package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class bkd implements defpackage.blg {
    private final defpackage.acu a;
    private final java.util.List b;
    private final int c;
    private final int d;
    private final boolean e;
    private final defpackage.bko f;
    private acx g;

    public bkd(defpackage.acu acuVar, java.util.List list, int i, int i2, boolean z, defpackage.bko bkoVar) {
        this.a = acuVar;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = bkoVar;
        if (list.size() <= 1) {
            defpackage.avo.d("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.');
        }
    }

    private final int o(long j) {
        try {
            return this.a.b(j);
        } catch (java.util.NoSuchElementException e) {
            throw new java.lang.IllegalStateException(a.bz(j, "Invalid selectableId: "), e);
        }
    }

    private final int p(int i, boolean z) {
        int iN = n() - 1;
        int i2 = 0;
        if (iN == 1 ? !z : !(iN != 2 && !z)) {
            i2 = 1;
        }
        return (i - i2) / 2;
    }

    @Override // defpackage.blg
    public final int a() {
        return this.d;
    }

    @Override // defpackage.blg
    public final int b() {
        return this.b.size();
    }

    @Override // defpackage.blg
    public final int c() {
        return this.c;
    }

    @Override // defpackage.blg
    public final acx d(defpackage.bko bkoVar) {
        return defpackage.li.i(bkoVar, this.b, new defpackage.bcm(7), new axo(bkoVar, 7), new defpackage.bbs(bkoVar, 2));
    }

    @Override // defpackage.blg
    public final defpackage.bkl e() {
        return this.e ? h() : f();
    }

    @Override // defpackage.blg
    public final defpackage.bkl f() {
        return (defpackage.bkl) this.b.get(p(this.d, false));
    }

    @Override // defpackage.blg
    public final defpackage.bkl g() {
        return n() == 1 ? f() : h();
    }

    @Override // defpackage.blg
    public final defpackage.bkl h() {
        return (defpackage.bkl) this.b.get(p(this.c, true));
    }

    @Override // defpackage.blg
    public final defpackage.bkl i(long j) {
        acx acxVar = this.g;
        if (acxVar == null) {
            acxVar = new acx(6);
            java.util.List list = this.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                defpackage.bkl bklVar = (defpackage.bkl) list.get(i);
                acxVar.i(bklVar.a, bklVar);
            }
            this.g = acxVar;
        }
        return (defpackage.bkl) acxVar.a(j);
    }

    @Override // defpackage.blg
    public final defpackage.bko j() {
        return this.f;
    }

    @Override // defpackage.blg
    public final void k(aonj aonjVar) {
        int iO = o(g().a);
        int iO2 = o((n() == 1 ? h() : f()).a);
        int i = iO + 1;
        if (i < iO2) {
            while (i < iO2) {
                aonjVar.a(this.b.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.blg
    public final boolean l() {
        return this.e;
    }

    @Override // defpackage.blg
    public final boolean m(defpackage.blg blgVar) {
        if (this.f != null && blgVar != null && (blgVar instanceof defpackage.bkd)) {
            defpackage.bkd bkdVar = (defpackage.bkd) blgVar;
            if (this.e == bkdVar.e && this.c == bkdVar.c && this.d == bkdVar.d && b() == bkdVar.b()) {
                java.util.List list = this.b;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (!((defpackage.bkl) list.get(i)).e((defpackage.bkl) bkdVar.b.get(i))) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.blg
    public final int n() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            return 2;
        }
        if (i > i2) {
            return 1;
        }
        if (i % 2 == 0) {
            return 3;
        }
        return ((defpackage.bkl) this.b.get(i / 2)).f();
    }

    public final java.lang.String toString() {
        int iN = n();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[\n\t");
        java.util.List list = this.b;
        int size = list.size();
        int i = 0;
        boolean z = true;
        while (i < size) {
            defpackage.bkl bklVar = (defpackage.bkl) list.get(i);
            if (!z) {
                sb.append(",\n\t");
            }
            i++;
            sb.append(i + " -> " + bklVar);
            z = false;
        }
        int i2 = this.d;
        int i3 = this.c + 1;
        boolean z2 = this.e;
        sb.append("\n]");
        return "MultiSelectionLayout(isStartHandle=" + z2 + ", startPosition=" + (i3 / 2.0f) + ", endPosition=" + ((i2 + 1) / 2.0f) + ", crossed=" + ((java.lang.Object) defpackage.akf.c(iN)) + ", infos=" + sb.toString() + ')';
    }
}
