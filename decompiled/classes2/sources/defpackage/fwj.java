package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fwj {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;

    public fwj(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = z4;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.fwj)) {
            defpackage.fwj fwjVar = (defpackage.fwj) obj;
            if (this.a == fwjVar.a && this.b == fwjVar.b && this.c == fwjVar.c && aooh.n((java.lang.Object) null, (java.lang.Object) null) && aooh.n((java.lang.Object) null, (java.lang.Object) null) && aooh.n((java.lang.Object) null, (java.lang.Object) null) && this.d == fwjVar.d && this.e == fwjVar.e && this.f == fwjVar.f && this.g == fwjVar.g && this.h == fwjVar.h && this.i == fwjVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 923521) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        if (this.a) {
            sb.append("launchSingleTop ");
        }
        if (this.b) {
            sb.append("restoreState ");
        }
        int i = this.f;
        if (i != -1 || this.g != -1 || this.h != -1 || this.i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(java.lang.Integer.toHexString(i));
            sb.append(" exitAnim=0x");
            sb.append(java.lang.Integer.toHexString(this.g));
            sb.append(" popEnterAnim=0x");
            sb.append(java.lang.Integer.toHexString(this.h));
            sb.append(" popExitAnim=0x");
            sb.append(java.lang.Integer.toHexString(this.i));
            sb.append(')');
        }
        return sb.toString();
    }
}
