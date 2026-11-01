package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rom {
    public final boolean a;
    public final boolean b;

    public rom(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static /* synthetic */ defpackage.rom a(defpackage.rom romVar, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = romVar.a;
        }
        if ((i & 2) != 0) {
            z2 = romVar.b;
        }
        return new defpackage.rom(z, z2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.rom) {
            defpackage.rom romVar = (defpackage.rom) obj;
            if (this.a == romVar.a && this.b == romVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (defpackage.anty.L(this.a) * 31) + defpackage.anty.L(this.b);
    }

    public final java.lang.String toString() {
        return "DeviceCompatibilityState(compatible=" + this.a + ", showedWarningDialog=" + this.b + ')';
    }

    public rom() {
        this(true, false);
    }
}
