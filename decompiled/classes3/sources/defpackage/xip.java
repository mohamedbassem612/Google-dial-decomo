package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xip {
    public final java.lang.String a;
    private final java.util.Map b;

    public xip(java.lang.String str, java.util.Map map) {
        aooh.f(map, "extras");
        this.a = str;
        this.b = map;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xip) {
            defpackage.xip xipVar = (defpackage.xip) obj;
            if (aooh.n(this.a, xipVar.a) && aooh.n(this.b, xipVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "IntentData(action=" + this.a + ", extras=" + this.b + ')';
    }
}
