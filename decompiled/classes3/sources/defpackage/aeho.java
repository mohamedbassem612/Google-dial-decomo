package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aeho {
    public final boolean a;
    private final int b;

    public aeho(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aeho) {
            defpackage.aeho aehoVar = (defpackage.aeho) obj;
            if (this.a == aehoVar.a) {
                int i = this.b;
                int i2 = aehoVar.b;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        anty.aJ(i);
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ i;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.b;
        if (i == 1) {
            str = "UNKNOWN";
        } else if (i != 2) {
            str = i != 3 ? "null" : "FALSE";
        } else {
            str = "TRUE";
        }
        return "GaiaAccountData{isG1User=" + this.a + ", isUnicornUser=" + str + '}';
    }

    public aeho() {
        throw null;
    }
}
