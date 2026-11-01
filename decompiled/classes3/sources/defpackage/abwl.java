package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class abwl {
    public abstract java.lang.Object a();

    public abstract java.lang.Object b();

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abwl) {
            defpackage.abwl abwlVar = (defpackage.abwl) obj;
            if (aooh.n(b(), abwlVar.b()) && aooh.n(a(), abwlVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object objB = b();
        int iHashCode = objB != null ? objB.hashCode() : 0;
        java.lang.Object objA = a();
        return (iHashCode * 31) + (objA != null ? objA.hashCode() : 0);
    }
}
