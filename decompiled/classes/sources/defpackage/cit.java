package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cit {
    public int a;

    public cit(byte[] bArr) {
        this.a = 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.cit) && this.a == ((defpackage.cit) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "DeltaCounter(count=" + this.a + ')';
    }

    public cit() {
        this(null);
    }
}
