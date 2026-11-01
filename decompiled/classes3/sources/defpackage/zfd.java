package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zfd implements defpackage.zfe {
    public final java.lang.String a;

    public zfd(java.lang.String str) {
        this.a = str;
    }

    @Override // defpackage.zfe
    public final java.lang.String a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.zfd) && aooh.n(this.a, ((defpackage.zfd) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "LocalNetworkIdentity(e164FormattedNumber=" + this.a + ')';
    }
}
