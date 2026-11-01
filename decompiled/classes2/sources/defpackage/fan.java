package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fan {
    public static final defpackage.fan a = new xwe().e();
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public fan(xwe xweVar) {
        this.b = xweVar.b;
        this.c = xweVar.c;
        this.d = xweVar.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.fan fanVar = (defpackage.fan) obj;
            if (this.b == fanVar.b && this.c == fanVar.c && this.d == fanVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ? 1 : 0) << 2) + ((this.c ? 1 : 0) << 1) + (this.d ? 1 : 0);
    }
}
