package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aimt {
    public final int a;
    public final java.util.concurrent.TimeUnit b;

    public aimt(int i, java.util.concurrent.TimeUnit timeUnit) {
        this.a = i;
        defpackage.aiql.l(timeUnit, "time unit");
        this.b = timeUnit;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aimt)) {
            return false;
        }
        defpackage.aimt aimtVar = (defpackage.aimt) obj;
        return this.a == aimtVar.a && this.b == aimtVar.b;
    }

    public final int hashCode() {
        return (this.a * 37) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return this.a + ' ' + this.b.toString();
    }
}
