package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alkn {
    public final defpackage.alkm a;
    public final java.lang.String b;

    public alkn(defpackage.alkm alkmVar, java.lang.String str) {
        this.a = alkmVar;
        if (str == null) {
            throw new java.lang.NullPointerException("Null text");
        }
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.alkn) {
            defpackage.alkn alknVar = (defpackage.alkn) obj;
            if (this.a.equals(alknVar.a) && this.b.equals(alknVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "SpeakerText{speaker=" + this.a.toString() + ", text=" + this.b + '}';
    }

    public alkn() {
        throw null;
    }
}
