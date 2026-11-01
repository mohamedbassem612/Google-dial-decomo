package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ig {
    private final android.graphics.Typeface a;
    private final java.lang.String b;
    private final int c;

    public ig(android.graphics.Typeface typeface, java.lang.String str, int i) {
        this.a = typeface;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ig)) {
            return false;
        }
        defpackage.ig igVar = (defpackage.ig) obj;
        return this.c == igVar.c && j$.util.Objects.equals(this.a, igVar.a) && j$.util.Objects.equals(this.b, igVar.b);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, java.lang.Integer.valueOf(this.c)});
    }
}
