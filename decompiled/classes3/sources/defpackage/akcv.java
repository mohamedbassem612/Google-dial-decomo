package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akcv {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public akcv(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public static defpackage.akcu a() {
        defpackage.akcu akcuVar = new defpackage.akcu();
        akcuVar.b(false);
        akcuVar.c(false);
        akcuVar.d(false);
        return akcuVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.akcv) {
            defpackage.akcv akcvVar = (defpackage.akcv) obj;
            if (this.a == akcvVar.a && this.b == akcvVar.b && this.c == akcvVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        return "EncoderOptions{enableCelLogsiteMetadata=" + this.a + ", enableSafeFormatArgs=" + this.b + ", includeSuppressedExceptions=" + this.c + '}';
    }

    public akcv() {
        throw null;
    }
}
