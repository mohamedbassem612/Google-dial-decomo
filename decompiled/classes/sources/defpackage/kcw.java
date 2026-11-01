package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kcw {
    public final defpackage.wgi a;
    public final defpackage.tcp b;

    public kcw(defpackage.wgi wgiVar, defpackage.tcp tcpVar) {
        if (wgiVar == null) {
            defpackage.aooh.i("wifiIconConfig");
        }
        if (tcpVar == null) {
            defpackage.aooh.i("rttConfig");
        }
        this.a = wgiVar;
        this.b = tcpVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kcw) {
            defpackage.kcw kcwVar = (defpackage.kcw) obj;
            if (defpackage.aooh.n(this.a, kcwVar.a) && this.b == kcwVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "DropdownMenuConfig(wifiIconConfig=" + this.a + ", rttConfig=" + this.b + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public kcw() {
        defpackage.wgi wgiVar = defpackage.wgi.a;
        defpackage.aooh.e(wgiVar, "getDefaultInstance(...)");
        this(wgiVar, defpackage.tcp.UNSUPPORTED);
    }
}
