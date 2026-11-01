package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rgr {
    public final int a;
    public final int b;
    public final int c;

    public rgr(int i) {
        this.a = 2132017389;
        this.b = 2132017388;
        this.c = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rgr) {
            defpackage.rgr rgrVar = (defpackage.rgr) obj;
            if (this.a == rgrVar.a && this.b == rgrVar.b && this.c == rgrVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final java.lang.String toString() {
        return "CountdownText{templateRes=" + this.a + ", terminalTextRes=" + this.b + ", secondsLeft=" + this.c + '}';
    }

    public rgr() {
        throw null;
    }
}
