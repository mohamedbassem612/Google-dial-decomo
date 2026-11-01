package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ypf {
    private final ahzp a;
    private final long b;

    public ypf(ahzp ahzpVar) {
        this.a = ahzpVar;
        this.b = ahzpVar.a();
    }

    public static j$.time.Duration a(defpackage.ypf ypfVar, defpackage.ypf ypfVar2) {
        ahvr.bM(ypfVar.a == ypfVar2.a);
        return j$.time.Duration.ofNanos(ypfVar2.b - ypfVar.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ypf) {
            defpackage.ypf ypfVar = (defpackage.ypf) obj;
            if (this.a == ypfVar.a && this.b == ypfVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, java.lang.Long.valueOf(this.b)});
    }
}
