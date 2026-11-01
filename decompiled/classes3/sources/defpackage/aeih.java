package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aeih {
    public final defpackage.aeip a;
    public final java.lang.String b;

    public aeih(defpackage.aeip aeipVar, java.lang.String str) {
        this.a = aeipVar;
        this.b = str;
    }

    public static defpackage.aeih a(defpackage.aeip aeipVar, java.lang.String str) {
        return aehj.b(aeipVar, str);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aeih) {
            defpackage.aeih aeihVar = (defpackage.aeih) obj;
            defpackage.aeip aeipVar = this.a;
            if (aeipVar != null ? aeipVar.equals(aeihVar.a) : aeihVar.a == null) {
                java.lang.String str = this.b;
                if (str == null) {
                    if (aeihVar.b == null) {
                        return true;
                    }
                } else if (str.equals(aeihVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.aeip aeipVar = this.a;
        int iHashCode = aeipVar == null ? 0 : aeipVar.hashCode();
        java.lang.String str = this.b;
        return (((iHashCode ^ 1000003) * (-721379959)) ^ (str != null ? str.hashCode() : 0)) * (-721379959);
    }

    public final java.lang.String toString() {
        return "RingContent{scalableRingDrawableProvider=" + java.lang.String.valueOf(this.a) + ", ringDrawableProvider=null, contentDescription=" + this.b + ", discAnimationType=null, subscriptionTier=null}";
    }

    public aeih() {
        throw null;
    }
}
