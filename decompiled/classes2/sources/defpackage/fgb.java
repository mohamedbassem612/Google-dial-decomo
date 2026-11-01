package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fgb extends defpackage.fij {
    private final defpackage.ern b;

    public fgb(defpackage.fii fiiVar, defpackage.ern ernVar) {
        super(fiiVar);
        this.b = ernVar;
    }

    @Override // defpackage.fij, defpackage.fik
    public final defpackage.eqg a(int i) {
        return this.b.a(this.a.e(i));
    }

    @Override // defpackage.fij, defpackage.fii
    public final defpackage.eqg b() {
        return this.b.a(this.a.f());
    }

    @Override // defpackage.fij, defpackage.fik
    public final defpackage.ern c() {
        return this.b;
    }

    @Override // defpackage.fij
    public final boolean equals(java.lang.Object obj) {
        if (super.equals(obj) && (obj instanceof defpackage.fgb)) {
            return this.b.equals(((defpackage.fgb) obj).b);
        }
        return false;
    }

    @Override // defpackage.fij
    public final int hashCode() {
        return (super.hashCode() * 31) + this.b.hashCode();
    }
}
