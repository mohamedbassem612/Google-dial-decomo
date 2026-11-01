package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lxy {
    public final java.lang.String a;
    public final java.lang.String b;

    public lxy(java.lang.String str, java.lang.String str2) {
        aooh.f(str, "phoneAccountComponentName");
        aooh.f(str2, "phoneAccountId");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.lxy) {
            defpackage.lxy lxyVar = (defpackage.lxy) obj;
            if (aooh.n(this.a, lxyVar.a) && aooh.n(this.b, lxyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "InternalPhoneAccountUiModel(phoneAccountComponentName=" + this.a + ", phoneAccountId=" + this.b + ')';
    }
}
