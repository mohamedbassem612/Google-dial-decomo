package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hbb implements defpackage.hba {
    private final java.util.List a;
    private defpackage.hgn c = null;
    private float d = -1.0f;
    private defpackage.hgn b = g(0.0f);

    public hbb(java.util.List list) {
        this.a = list;
    }

    private final defpackage.hgn g(float f) {
        java.util.List list = this.a;
        defpackage.hgn hgnVar = (defpackage.hgn) list.get(list.size() - 1);
        if (f >= hgnVar.c()) {
            return hgnVar;
        }
        for (int size = list.size() - 2; size > 0; size--) {
            defpackage.hgn hgnVar2 = (defpackage.hgn) list.get(size);
            if (this.b != hgnVar2 && hgnVar2.e(f)) {
                return hgnVar2;
            }
        }
        return (defpackage.hgn) list.get(0);
    }

    @Override // defpackage.hba
    public final float a() {
        java.util.List list = this.a;
        return ((defpackage.hgn) list.get(list.size() - 1)).b();
    }

    @Override // defpackage.hba
    public final float b() {
        return ((defpackage.hgn) this.a.get(0)).c();
    }

    @Override // defpackage.hba
    public final defpackage.hgn c() {
        return this.b;
    }

    @Override // defpackage.hba
    public final boolean d(float f) {
        defpackage.hgn hgnVar = this.c;
        defpackage.hgn hgnVar2 = this.b;
        if (hgnVar == hgnVar2 && this.d == f) {
            return true;
        }
        this.c = hgnVar2;
        this.d = f;
        return false;
    }

    @Override // defpackage.hba
    public final boolean e() {
        return false;
    }

    @Override // defpackage.hba
    public final boolean f(float f) {
        if (this.b.e(f)) {
            return !this.b.f();
        }
        this.b = g(f);
        return true;
    }
}
