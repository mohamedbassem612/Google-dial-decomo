package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vme {
    public final j$.util.OptionalLong a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final boolean d;
    private final defpackage.vfc e;

    public vme(j$.util.OptionalLong optionalLong, java.lang.String str, java.lang.String str2, defpackage.vfc vfcVar, boolean z) {
        this.a = optionalLong;
        this.b = str;
        this.c = str2;
        this.e = vfcVar;
        this.d = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vme) {
            defpackage.vme vmeVar = (defpackage.vme) obj;
            if (this.a.equals(vmeVar.a) && this.b.equals(vmeVar.b) && this.c.equals(vmeVar.c) && this.e.equals(vmeVar.e) && this.d == vmeVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        defpackage.vfc vfcVar = this.e;
        return "ServerGreeting{durationMillis=" + java.lang.String.valueOf(this.a) + ", audioUrl=" + this.b + ", objectId=" + this.c + ", greetingType=" + java.lang.String.valueOf(vfcVar) + ", activated=" + this.d + '}';
    }

    public vme() {
        throw null;
    }
}
