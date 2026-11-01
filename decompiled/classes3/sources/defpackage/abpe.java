package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abpe {
    public final int a;
    public final boolean b;
    public final java.lang.Long c;
    private final boolean d = true;

    public abpe(int i, boolean z, java.lang.Long l) {
        this.a = i;
        this.b = z;
        this.c = l;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abpe) {
            defpackage.abpe abpeVar = (defpackage.abpe) obj;
            if (this.a == abpeVar.a && this.b == abpeVar.b && aooh.n(this.c, abpeVar.c)) {
                boolean z = abpeVar.d;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Long l = this.c;
        return (((((this.a * 31) + anty.L(this.b)) * 31) + (l == null ? 0 : l.hashCode())) * 31) + anty.L(true);
    }

    public final java.lang.String toString() {
        return "DrawableIcon(iconRes=" + this.a + ", showMoreIndicator=" + this.b + ", animate=" + this.c + ", tint=true)";
    }
}
