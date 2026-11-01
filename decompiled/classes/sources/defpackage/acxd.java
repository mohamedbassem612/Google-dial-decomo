package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acxd {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public acxd(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public static defpackage.acxc a() {
        defpackage.acxc acxcVar = new defpackage.acxc();
        acxcVar.d(true);
        acxcVar.c(true);
        acxcVar.b(false);
        return acxcVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.acxd) {
            defpackage.acxd acxdVar = (defpackage.acxd) obj;
            if (this.a == acxdVar.a && this.b == acxdVar.b && this.c == acxdVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        return "ConstraintOverrides{requiresDeviceIdle=" + this.a + ", requiresCharging=" + this.b + ", requiresBatteryNotLow=" + this.c + '}';
    }

    public acxd() {
        throw null;
    }
}
