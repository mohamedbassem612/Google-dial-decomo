package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bal implements defpackage.bdm {
    private final defpackage.bbh a;

    public bal(defpackage.bbh bbhVar) {
        this.a = bbhVar;
    }

    @Override // defpackage.bdm
    public final int a() {
        return java.lang.Math.max(0, this.a.b());
    }

    @Override // defpackage.bdm
    public final int b() {
        return this.a.j().n;
    }

    @Override // defpackage.bdm
    public final int c() {
        int iB = b() - 1;
        java.util.List list = this.a.j().k;
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return java.lang.Math.min(iB, ((defpackage.baz) list.get(list.size() - 1)).a);
    }

    @Override // defpackage.bdm
    public final int d() {
        int i;
        defpackage.bbh bbhVar = this.a;
        if (bbhVar.j().k.isEmpty()) {
            return 0;
        }
        int iBe = defpackage.den.be(bbhVar.j());
        int iAJ = defpackage.den.aJ(bbhVar.j());
        if (iAJ == 0 || (i = iBe / iAJ) <= 0) {
            return 1;
        }
        return i;
    }

    @Override // defpackage.bdm
    public final boolean e() {
        return !this.a.j().k.isEmpty();
    }
}
