package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anxp {
    final int a;
    final long b;
    final java.util.Set c;

    public anxp(int i, long j, java.util.Set set) {
        this.a = i;
        this.b = j;
        this.c = aihd.o(set);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.anxp anxpVar = (defpackage.anxp) obj;
            if (this.a == anxpVar.a && this.b == anxpVar.b && j$.util.Objects.equals(this.c, anxpVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Long.valueOf(this.b), this.c});
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.e("maxAttempts", this.a);
        ahymVarL.f("hedgingDelayNanos", this.b);
        ahymVarL.b("nonFatalStatusCodes", this.c);
        return ahymVarL.toString();
    }
}
