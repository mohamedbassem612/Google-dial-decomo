package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hbc implements defpackage.hba {
    private final defpackage.hgn a;
    private float b = -1.0f;

    public hbc(java.util.List list) {
        this.a = (defpackage.hgn) list.get(0);
    }

    @Override // defpackage.hba
    public final float a() {
        return this.a.b();
    }

    @Override // defpackage.hba
    public final float b() {
        return this.a.c();
    }

    @Override // defpackage.hba
    public final defpackage.hgn c() {
        return this.a;
    }

    @Override // defpackage.hba
    public final boolean d(float f) {
        if (this.b == f) {
            return true;
        }
        this.b = f;
        return false;
    }

    @Override // defpackage.hba
    public final boolean e() {
        return false;
    }

    @Override // defpackage.hba
    public final boolean f(float f) {
        return !this.a.f();
    }
}
