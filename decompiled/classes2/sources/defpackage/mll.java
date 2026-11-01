package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mll {
    public final int a;
    public final int b;

    public mll(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.mll) {
            defpackage.mll mllVar = (defpackage.mll) obj;
            if (this.a == mllVar.a && this.b == mllVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "DialpadKeyData(keyEventCode=" + this.a + ", toneId=" + this.b + ')';
    }
}
