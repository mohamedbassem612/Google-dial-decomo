package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aljl {
    public final int a;
    public final int b;

    public aljl(byte[] bArr) {
        this.a = 5600;
        this.b = 22050;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aljl) {
            defpackage.aljl aljlVar = (defpackage.aljl) obj;
            if (this.a == aljlVar.a && this.b == aljlVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final java.lang.String toString() {
        return "AudioWindowRequest{strideLength=" + this.a + ", requestedWindowLength=" + this.b + '}';
    }

    public aljl() {
        throw null;
    }
}
