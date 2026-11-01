package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ouo implements defpackage.ouq {
    public final int a;
    public final java.lang.Integer b;

    public ouo(int i, java.lang.Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ouo) {
            defpackage.ouo ouoVar = (defpackage.ouo) obj;
            if (this.a == ouoVar.a && aooh.n(this.b, ouoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Integer num = this.b;
        return (this.a * 31) + (num == null ? 0 : num.hashCode());
    }

    public final java.lang.String toString() {
        return "DrawableIcon(iconRes=" + this.a + ", iconTintColorRes=" + this.b + ')';
    }
}
