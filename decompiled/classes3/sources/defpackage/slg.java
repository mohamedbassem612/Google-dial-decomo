package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class slg {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public slg(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.slg) {
            defpackage.slg slgVar = (defpackage.slg) obj;
            if (this.a == slgVar.a && this.b == slgVar.b && this.c == slgVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((anty.L(this.a) * 31) + anty.L(this.b)) * 31) + anty.L(this.c);
    }

    public final java.lang.String toString() {
        return "BackgroundMenuUiData(shouldShowRemoveButton=" + this.a + ", shouldShowGooglePhotosButton=" + this.b + ", enableDefaultCallingCardV1=" + this.c + ')';
    }
}
