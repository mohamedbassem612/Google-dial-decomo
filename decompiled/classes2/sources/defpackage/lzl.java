package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lzl {
    public final boolean a;
    public final wgi b;

    public lzl(boolean z, wgi wgiVar) {
        this.a = z;
        if (wgiVar == null) {
            throw new java.lang.NullPointerException("Null getWifiCallingIconsConfig");
        }
        this.b = wgiVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lzl) {
            defpackage.lzl lzlVar = (defpackage.lzl) obj;
            if (this.a == lzlVar.a && this.b.equals(lzlVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "BottomActionContainerProperties{shouldShowRttVisibleButtons=" + this.a + ", getWifiCallingIconsConfig=" + this.b.toString() + '}';
    }

    public lzl() {
        throw null;
    }
}
