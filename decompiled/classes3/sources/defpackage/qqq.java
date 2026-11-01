package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qqq {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final defpackage.qqp d;

    public qqq(boolean z, boolean z2, boolean z3, defpackage.qqp qqpVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = qqpVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.qqq) {
            defpackage.qqq qqqVar = (defpackage.qqq) obj;
            if (this.a == qqqVar.a && this.b == qqqVar.b && this.c == qqqVar.c && this.d.equals(qqqVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237)) * 1000003) ^ this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "Preview{isVisible=" + this.a + ", isMinimized=" + this.b + ", showMuteOverlay=" + this.c + ", previewPosition=" + java.lang.String.valueOf(this.d) + '}';
    }

    public qqq() {
        throw null;
    }
}
