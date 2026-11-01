package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vpr {
    public final java.lang.String a;
    public final java.lang.String b;
    public final j$.util.OptionalLong c;

    public vpr(java.lang.String str, java.lang.String str2, j$.util.OptionalLong optionalLong) {
        this.a = str;
        this.b = str2;
        this.c = optionalLong;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vpr) {
            defpackage.vpr vprVar = (defpackage.vpr) obj;
            if (this.a.equals(vprVar.a) && this.b.equals(vprVar.b) && this.c.equals(vprVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "VoicemailGreetingInsertContent{objectId=" + this.a + ", audioUrl=" + this.b + ", durationSeconds=" + java.lang.String.valueOf(this.c) + '}';
    }

    public vpr() {
        throw null;
    }
}
