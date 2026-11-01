package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qga {
    public final boolean a;
    public final android.net.Uri b;
    public final j$.util.Optional c;

    public qga(boolean z, android.net.Uri uri, j$.util.Optional optional) {
        this.a = z;
        this.b = uri;
        this.c = optional;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.qga) {
            defpackage.qga qgaVar = (defpackage.qga) obj;
            if (this.a == qgaVar.a && this.b.equals(qgaVar.b) && this.c.equals(qgaVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.c;
        return "RttEmcFallbackInfo{isRttEmcCall=" + this.a + ", numberUri=" + java.lang.String.valueOf(this.b) + ", phoneAccountHandle=" + java.lang.String.valueOf(optional) + '}';
    }

    public qga() {
        throw null;
    }
}
