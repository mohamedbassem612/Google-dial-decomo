package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rfo {
    public final java.lang.String a;
    public final aify b;
    public final boolean c;

    public rfo(java.lang.String str, aify aifyVar, boolean z) {
        this.a = str;
        this.b = aifyVar;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rfo) {
            defpackage.rfo rfoVar = (defpackage.rfo) obj;
            if (this.a.equals(rfoVar.a) && ahvr.aP(this.b, rfoVar.b) && this.c == rfoVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        return "ActivationChipsConfig{callId=" + this.a + ", chips=" + java.lang.String.valueOf(this.b) + ", shouldEnableChips=" + this.c + '}';
    }

    public rfo() {
        throw null;
    }
}
