package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mii {
    public final java.lang.String a;
    public final java.lang.String b;
    public final aify c;
    public final aify d;

    public mii(java.lang.String str, java.lang.String str2, aify aifyVar, aify aifyVar2) {
        this.a = str;
        this.b = str2;
        this.c = aifyVar;
        this.d = aifyVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.mii) {
            defpackage.mii miiVar = (defpackage.mii) obj;
            if (this.a.equals(miiVar.a) && ((str = this.b) != null ? str.equals(miiVar.b) : miiVar.b == null) && ahvr.aP(this.c, miiVar.c) && ahvr.aP(this.d, miiVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        java.lang.String str = this.b;
        return (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final java.lang.String toString() {
        aify aifyVar = this.d;
        return "DeviceInfo{serialNumber=" + this.a + ", deviceSoftwareVersion=" + this.b + ", simsSlotsInfo=" + java.lang.String.valueOf(this.c) + ", euiccEids=" + java.lang.String.valueOf(aifyVar) + '}';
    }

    public mii() {
        throw null;
    }
}
