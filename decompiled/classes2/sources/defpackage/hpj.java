package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hpj {
    public final java.util.List a;
    public final java.util.List b;

    public hpj(java.util.List list, java.util.List list2) {
        aooh.f(list, "bluetoothDeviceEntries");
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.hpj) {
            defpackage.hpj hpjVar = (defpackage.hpj) obj;
            if (aooh.n(this.a, hpjVar.a) && aooh.n(this.b, hpjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "AudioRouteSelectorUiState(bluetoothDeviceEntries=" + this.a + ", supportedRouteEntries=" + this.b + ')';
    }
}
