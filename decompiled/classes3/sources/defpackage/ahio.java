package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahio {
    public final java.lang.String a;
    public final android.net.Uri b;
    public final aify c;

    public ahio(java.lang.String str, android.net.Uri uri, aify aifyVar) {
        this.a = str;
        this.b = uri;
        this.c = aifyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ahio) {
            defpackage.ahio ahioVar = (defpackage.ahio) obj;
            if (this.a.equals(ahioVar.a) && this.b.equals(ahioVar.b) && ahvr.aP(this.c, ahioVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final java.lang.String toString() {
        aify aifyVar = this.c;
        return "HelpOptions{helpCenterContext=" + this.a + ", fallbackSupportUri=" + java.lang.String.valueOf(this.b) + ", overflowMenuItems=" + java.lang.String.valueOf(aifyVar) + '}';
    }

    public ahio() {
        throw null;
    }
}
