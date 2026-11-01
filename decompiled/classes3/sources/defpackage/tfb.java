package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tfb implements defpackage.tfh {
    public final boolean a;
    public final boolean b;

    public tfb(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.tfb) {
            defpackage.tfb tfbVar = (defpackage.tfb) obj;
            if (this.a == tfbVar.a && this.b == tfbVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (anty.L(this.a) * 31) + anty.L(this.b);
    }

    public final java.lang.String toString() {
        return "CarrierVideoCall(isWifi=" + this.a + ", isEnabled=" + this.b + ')';
    }
}
