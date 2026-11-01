package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class llw {
    public final android.net.Uri a;
    public final java.lang.String b;

    public llw(android.net.Uri uri, java.lang.String str) {
        if (uri == null) {
            throw new java.lang.NullPointerException("Null audioUri");
        }
        this.a = uri;
        if (str == null) {
            throw new java.lang.NullPointerException("Null displayText");
        }
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.llw) {
            defpackage.llw llwVar = (defpackage.llw) obj;
            if (this.a.equals(llwVar.a) && this.b.equals(llwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "AudioMessage{audioUri=" + this.a.toString() + ", displayText=" + this.b + '}';
    }

    public llw() {
        throw null;
    }
}
