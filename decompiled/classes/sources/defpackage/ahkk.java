package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahkk {
    public final int a;
    public final int b;

    public ahkk(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ahkk) {
            defpackage.ahkk ahkkVar = (defpackage.ahkk) obj;
            if (this.a == ahkkVar.a && this.b == ahkkVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.a;
        if (i != 1) {
            str = i != 2 ? "DATABASES" : "CACHE";
        } else {
            str = "FILES";
        }
        return "StorageSpec{type=" + str + ", directBoot=" + (this.b != 1 ? "CREDENTIAL" : "DEVICE") + '}';
    }

    public ahkk() {
        throw null;
    }
}
