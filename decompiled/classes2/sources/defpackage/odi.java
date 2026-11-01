package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class odi {
    public final android.app.PendingIntent a;
    public final defpackage.oce b;

    public odi(android.app.PendingIntent pendingIntent, defpackage.oce oceVar) {
        aooh.f(pendingIntent, "pendingIntent");
        aooh.f(oceVar, "handoverType");
        this.a = pendingIntent;
        this.b = oceVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.odi) {
            defpackage.odi odiVar = (defpackage.odi) obj;
            if (aooh.n(this.a, odiVar.a) && this.b == odiVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ConnectionEventExtras(pendingIntent=" + this.a + ", handoverType=" + this.b + ')';
    }
}
