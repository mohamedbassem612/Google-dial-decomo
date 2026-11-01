package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class fij implements defpackage.fii {
    public final defpackage.fii a;

    public fij(defpackage.fii fiiVar) {
        this.a = fiiVar;
    }

    @Override // defpackage.fik
    public defpackage.eqg a(int i) {
        return this.a.a(i);
    }

    @Override // defpackage.fii
    public defpackage.eqg b() {
        return this.a.b();
    }

    @Override // defpackage.fik
    public defpackage.ern c() {
        return this.a.c();
    }

    @Override // defpackage.fik
    public final int e(int i) {
        return this.a.e(i);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.fij) {
            return this.a.equals(((defpackage.fij) obj).a);
        }
        return false;
    }

    @Override // defpackage.fii
    public final int f() {
        return this.a.f();
    }

    @Override // defpackage.fik
    public final int g(int i) {
        return this.a.g(i);
    }

    @Override // defpackage.fik
    public final int h() {
        return this.a.h();
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
