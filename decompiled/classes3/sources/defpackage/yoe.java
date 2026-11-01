package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yoe {
    public final java.lang.String a;
    public final java.lang.String b;

    public yoe(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null text");
        }
        this.a = str;
        this.b = "User1";
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.yoe) {
            defpackage.yoe yoeVar = (defpackage.yoe) obj;
            if (this.a.equals(yoeVar.a) && this.b.equals(yoeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "SmartReplyMessage{text=" + this.a + ", userId=" + this.b + '}';
    }

    public yoe() {
        throw null;
    }
}
