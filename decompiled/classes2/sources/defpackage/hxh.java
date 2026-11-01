package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hxh {
    public final defpackage.hxj a;
    public final defpackage.hxj b;

    public hxh(defpackage.hxj hxjVar, defpackage.hxj hxjVar2) {
        this.a = hxjVar;
        this.b = hxjVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.hxh) {
            defpackage.hxh hxhVar = (defpackage.hxh) obj;
            if (aooh.n(this.a, hxhVar.a) && aooh.n(this.b, hxhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.hxj hxjVar = this.a;
        int iHashCode = hxjVar == null ? 0 : hxjVar.hashCode();
        defpackage.hxj hxjVar2 = this.b;
        return (iHashCode * 31) + (hxjVar2 != null ? hxjVar2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "InjectionRequest(localInjection=" + this.a + ", remoteInjection=" + this.b + ')';
    }
}
