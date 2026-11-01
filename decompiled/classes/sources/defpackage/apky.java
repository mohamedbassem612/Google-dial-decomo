package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apky {
    public final defpackage.apkz a;
    public final defpackage.apkz b;
    public final java.lang.Throwable c;

    public apky(defpackage.apkz apkzVar, defpackage.apkz apkzVar2, java.lang.Throwable th) {
        if (apkzVar == null) {
            defpackage.aooh.i("plan");
        }
        this.a = apkzVar;
        this.b = apkzVar2;
        this.c = th;
    }

    public final boolean a() {
        return this.b == null && this.c == null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.apky) {
            defpackage.apky apkyVar = (defpackage.apky) obj;
            if (defpackage.aooh.n(this.a, apkyVar.a) && defpackage.aooh.n(this.b, apkyVar.b) && defpackage.aooh.n(this.c, apkyVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.apkz apkzVar = this.b;
        int iHashCode2 = (iHashCode + (apkzVar == null ? 0 : apkzVar.hashCode())) * 31;
        java.lang.Throwable th = this.c;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "ConnectResult(plan=" + this.a + ", nextPlan=" + this.b + ", throwable=" + this.c + ')';
    }
}
