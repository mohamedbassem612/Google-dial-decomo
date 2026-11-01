package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahjz {
    public final java.lang.String a;
    public final java.lang.Integer b;
    public final defpackage.ajzt c;

    public ahjz(java.lang.String str, java.lang.Integer num, defpackage.ajzt ajztVar) {
        this.a = str;
        this.b = num;
        this.c = ajztVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ahjz) {
            defpackage.ahjz ahjzVar = (defpackage.ahjz) obj;
            java.lang.String str = this.a;
            if (str != null ? str.equals(ahjzVar.a) : ahjzVar.a == null) {
                java.lang.Integer num = this.b;
                if (num != null ? num.equals(ahjzVar.b) : ahjzVar.b == null) {
                    if (this.c.equals(ahjzVar.c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.Integer num = this.b;
        return ((((iHashCode ^ 1000003) * 1000003) ^ (num != null ? num.hashCode() : 0)) * 1000003) ^ this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "GrpcClientConfig{host=" + this.a + ", port=" + this.b + ", rpcServiceConfig=" + java.lang.String.valueOf(this.c) + '}';
    }

    public ahjz() {
        throw null;
    }
}
