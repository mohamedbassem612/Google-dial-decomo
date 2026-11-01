package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xgp implements defpackage.xpa, defpackage.xpr {
    public final java.lang.String a;
    public final long b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xgp(defpackage.xgq xgqVar) {
        this(xgqVar.b(), xgqVar.a());
        aooh.f(xgqVar, "source");
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xgp) {
            defpackage.xgp xgpVar = (defpackage.xgp) obj;
            if (aooh.n(this.a, xgpVar.a) && this.b == xgpVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + anty.M(this.b);
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putString("component", this.a);
        persistableBundle.putLong("changeId", this.b);
        return persistableBundle;
    }

    public final java.lang.String toString() {
        return "PRequiredChange(component=" + this.a + ", changeId=" + this.b + ')';
    }

    public xgp(java.lang.String str, long j) {
        this.a = str;
        this.b = j;
    }
}
