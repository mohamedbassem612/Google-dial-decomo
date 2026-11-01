package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adnv {
    public final java.lang.String a;
    public final java.lang.String b;

    public adnv(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null voiceId");
        }
        this.a = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null messageText");
        }
        this.b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adnv) {
            defpackage.adnv adnvVar = (defpackage.adnv) obj;
            if (this.a.equals(adnvVar.a) && this.b.equals(adnvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "AudioMessageKey{voiceId=" + this.a + ", messageText=" + this.b + '}';
    }

    public adnv() {
        throw null;
    }
}
