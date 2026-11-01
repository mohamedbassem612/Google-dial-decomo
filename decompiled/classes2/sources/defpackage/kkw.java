package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kkw {
    public final int a;
    public final android.view.View b;
    public final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;

    public kkw(int i, android.view.View view, int i2, int i3, int i4, int i5, int i6, int i7) {
        aooh.f(view, "view");
        this.a = i;
        this.b = view;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
    }

    public final int a() {
        return this.c + this.e + this.f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kkw) {
            defpackage.kkw kkwVar = (defpackage.kkw) obj;
            if (this.a == kkwVar.a && aooh.n(this.b, kkwVar.b) && this.c == kkwVar.c && this.d == kkwVar.d && this.e == kkwVar.e && this.f == kkwVar.f && this.g == kkwVar.g && this.h == kkwVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.a * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h;
    }

    public final java.lang.String toString() {
        return "AnimatedItem(viewId=" + this.a + ", view=" + this.b + ", height=" + this.c + ", width=" + this.d + ", topMargin=" + this.e + ", bottomMargin=" + this.f + ", startMargin=" + this.g + ", endMargin=" + this.h + ')';
    }
}
