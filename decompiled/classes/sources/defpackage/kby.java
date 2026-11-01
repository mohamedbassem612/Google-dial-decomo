package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kby {
    public final long a;
    public final java.lang.String b;
    public final defpackage.aify c;

    public kby(long j, java.lang.String str, defpackage.aify aifyVar) {
        defpackage.aooh.f(aifyVar, "modules");
        this.a = j;
        this.b = str;
        this.c = aifyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kby) {
            defpackage.kby kbyVar = (defpackage.kby) obj;
            if (this.a == kbyVar.a && defpackage.aooh.n(this.b, kbyVar.b) && defpackage.aooh.n(this.c, kbyVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.b;
        return (((defpackage.anty.M(this.a) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "CallLogPopupMenuUiModel(callId=" + this.a + ", header=" + this.b + ", modules=" + this.c + ')';
    }
}
