package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vuy {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;

    public vuy(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vuy) {
            defpackage.vuy vuyVar = (defpackage.vuy) obj;
            if (this.a.equals(vuyVar.a) && this.b.equals(vuyVar.b) && this.c.equals(vuyVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "UnreadVoicemailInfo{sourcePackage=" + this.a + ", phoneAccountComponentName=" + this.b + ", phoneAccountId=" + this.c + '}';
    }

    public vuy() {
        throw null;
    }
}
