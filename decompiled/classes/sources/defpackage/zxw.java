package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zxw implements defpackage.aacu {
    public final android.os.Bundle a;

    static {
        new android.os.Bundle();
    }

    public zxw(android.os.Bundle bundle) {
        this.a = bundle;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.zxw) {
            return defpackage.aehj.bV(this.a, ((defpackage.zxw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a});
    }
}
