package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qiq {
    public final android.graphics.Bitmap a;
    private final defpackage.abwd b;

    public qiq(android.graphics.Bitmap bitmap, defpackage.abwd abwdVar) {
        aooh.f(bitmap, "bitmap");
        aooh.f(abwdVar, "photoInfo");
        this.a = bitmap;
        this.b = abwdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.qiq) {
            return aooh.n(this.b, ((defpackage.qiq) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.getAllocationByteCount();
    }

    public final java.lang.String toString() {
        return "BitmapWrapper(bitmap=" + this.a + ", photoInfo=" + this.b + ')';
    }
}
