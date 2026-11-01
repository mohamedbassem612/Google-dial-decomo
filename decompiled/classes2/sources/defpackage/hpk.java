package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hpk {
    public final java.lang.String a;
    public final boolean b;
    public final aomy c;
    private final android.bluetooth.BluetoothDevice d;

    public hpk(java.lang.String str, boolean z, android.bluetooth.BluetoothDevice bluetoothDevice, aomy aomyVar) {
        this.a = str;
        this.b = z;
        this.d = bluetoothDevice;
        this.c = aomyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.hpk) {
            defpackage.hpk hpkVar = (defpackage.hpk) obj;
            if (aooh.n(this.a, hpkVar.a) && this.b == hpkVar.b && aooh.n(this.d, hpkVar.d) && aooh.n(this.c, hpkVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        boolean z = this.b;
        android.bluetooth.BluetoothDevice bluetoothDevice = this.d;
        return (((((iHashCode * 31) + anty.L(z)) * 31) + (bluetoothDevice != null ? bluetoothDevice.hashCode() : 0)) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "BluetoothDeviceEntry(name=" + this.a + ", isSelected=" + this.b + ", device=" + this.d + ", onSelected=" + this.c + ')';
    }
}
