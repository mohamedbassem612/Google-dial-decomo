package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class paw extends defpackage.pbg {
    private final java.lang.String a;
    private final java.lang.String b;

    public paw(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null callId");
        }
        this.a = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null message");
        }
        this.b = str2;
    }

    @Override // defpackage.pbg
    public final java.lang.String a() {
        return this.a;
    }

    @Override // defpackage.pbg
    public final java.lang.String b() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.pbg) {
            defpackage.pbg pbgVar = (defpackage.pbg) obj;
            if (this.a.equals(pbgVar.a()) && this.b.equals(pbgVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "SmsMessageSelected{callId=" + this.a + ", message=" + this.b + '}';
    }
}
