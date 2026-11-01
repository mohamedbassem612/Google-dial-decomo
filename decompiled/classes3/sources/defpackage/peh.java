package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class peh {
    public final android.net.Uri a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;
    public final aomy f;
    private final aomy g;

    public peh(android.net.Uri uri, float f, float f2, float f3, boolean z, aomy aomyVar, aomy aomyVar2) {
        aooh.f(uri, "backgroundImageUri");
        this.a = uri;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = z;
        this.f = aomyVar;
        this.g = aomyVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.peh) {
            defpackage.peh pehVar = (defpackage.peh) obj;
            if (aooh.n(this.a, pehVar.a) && java.lang.Float.compare(this.b, pehVar.b) == 0 && java.lang.Float.compare(this.c, pehVar.c) == 0 && java.lang.Float.compare(this.d, pehVar.d) == 0 && this.e == pehVar.e && aooh.n(this.f, pehVar.f) && aooh.n(this.g, pehVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + anty.L(this.e)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final java.lang.String toString() {
        return "ImageCallBackgroundUiData(backgroundImageUri=" + this.a + ", translationX=" + this.b + ", translationY=" + this.c + ", scale=" + this.d + ", shouldAnimateIn=" + this.e + ", onRender=" + this.f + ", onFailure=" + this.g + ')';
    }
}
