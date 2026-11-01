package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akfr {
    public final akfg a;
    public final boolean b;
    public final boolean c;

    public akfr(akfg akfgVar, boolean z, boolean z2) {
        this.a = akfgVar;
        this.b = z;
        this.c = z2;
    }

    public static defpackage.akfq a() {
        defpackage.akfq akfqVar = new defpackage.akfq();
        akfqVar.a = null;
        akfqVar.b(false);
        akfqVar.b = true;
        akfqVar.c = (byte) (akfqVar.c | 2);
        return akfqVar;
    }

    public static defpackage.akfr b() {
        return a().a();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.akfr) {
            defpackage.akfr akfrVar = (defpackage.akfr) obj;
            akfg akfgVar = this.a;
            if (akfgVar != null ? akfgVar.equals(akfrVar.a) : akfrVar.a == null) {
                if (this.b == akfrVar.b && this.c == akfrVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        akfg akfgVar = this.a;
        int iHashCode = akfgVar == null ? 0 : akfgVar.hashCode();
        return ((((iHashCode ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        return "ParsingOptions{defaultRegion=" + java.lang.String.valueOf(this.a) + ", keepRawInput=" + this.b + ", stripNationalPrefixAfterCountryCode=" + this.c + '}';
    }

    public akfr() {
        throw null;
    }
}
