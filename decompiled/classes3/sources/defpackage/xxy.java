package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xxy implements defpackage.xxw {
    int a;
    public android.graphics.Bitmap.Config b;
    private final defpackage.xxz c;

    public xxy(defpackage.xxz xxzVar) {
        this.c = xxzVar;
    }

    @Override // defpackage.xxw
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.xxy)) {
            return false;
        }
        defpackage.xxy xxyVar = (defpackage.xxy) obj;
        if (this.a != xxyVar.a) {
            return false;
        }
        android.graphics.Bitmap.Config config = this.b;
        android.graphics.Bitmap.Config config2 = xxyVar.b;
        char[] cArr = defpackage.ygc.a;
        return a.L(config, config2);
    }

    public final int hashCode() {
        int i = this.a * 31;
        android.graphics.Bitmap.Config config = this.b;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return defpackage.xya.c(this.a, this.b);
    }
}
