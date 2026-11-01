package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ten {
    public static final defpackage.ten a = new defpackage.ten("undefined_key", -1, -1, -1, false);
    public final java.lang.String b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    private final int g;
    private final int h;

    public ten(java.lang.String str, int i, int i2, int i3, boolean z) {
        this.b = str;
        this.g = i;
        this.h = i2;
        this.c = i3;
        this.d = z;
        this.e = i == 0;
        this.f = i == i2 + (-1);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ten) {
            defpackage.ten tenVar = (defpackage.ten) obj;
            if (aooh.n(this.b, tenVar.b) && this.g == tenVar.g && this.h == tenVar.h && this.c == tenVar.c && this.d == tenVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.b.hashCode() * 31) + this.g) * 31) + this.h) * 31) + this.c) * 31) + anty.L(this.d);
    }

    public final java.lang.String toString() {
        return "SearchRowContext(key=" + defpackage.tgx.a(this.b) + ", sectionPosition=" + this.g + ", sectionSize=" + this.h + ", absolutePosition=" + this.c + ", isExpanded=" + this.d + ')';
    }
}
