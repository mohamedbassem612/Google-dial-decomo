package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aclx {
    public final java.lang.String a;
    public final albh b;
    public final defpackage.aiva c;
    public final java.lang.Integer d;
    public final zzu e;
    public final int[] f;
    public final int[] g;
    public final zzl h;
    public final int i;

    public aclx(java.lang.String str, albh albhVar, defpackage.aiva aivaVar, java.lang.Integer num, int[] iArr, int[] iArr2, zzl zzlVar) {
        this.a = str;
        this.b = albhVar;
        this.c = aivaVar;
        this.d = num;
        this.i = 1;
        this.e = null;
        this.f = iArr;
        this.g = iArr2;
        this.h = zzlVar;
    }

    public static defpackage.agbc a() {
        defpackage.agbc agbcVar = new defpackage.agbc();
        agbcVar.a = 1;
        return agbcVar;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.aiva aivaVar;
        java.lang.Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aclx) {
            defpackage.aclx aclxVar = (defpackage.aclx) obj;
            if (this.a.equals(aclxVar.a) && this.b.equals(aclxVar.b) && ((aivaVar = this.c) != null ? aivaVar.equals(aclxVar.c) : aclxVar.c == null) && ((num = this.d) != null ? num.equals(aclxVar.d) : aclxVar.d == null)) {
                int i = this.i;
                int i2 = aclxVar.i;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 1) {
                    zzu zzuVar = aclxVar.e;
                    boolean z = aclxVar instanceof defpackage.aclx;
                    if (java.util.Arrays.equals(this.f, z ? aclxVar.f : aclxVar.f)) {
                        if (java.util.Arrays.equals(this.g, z ? aclxVar.g : aclxVar.g)) {
                            zzl zzlVar = this.h;
                            if (zzlVar == null) {
                                if (aclxVar.h == null) {
                                    return true;
                                }
                            } else if (zzlVar.equals(aclxVar.h)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        defpackage.aiva aivaVar = this.c;
        int iHashCode2 = ((iHashCode * 1000003) ^ (aivaVar == null ? 0 : aivaVar.hashCode())) * 1000003;
        java.lang.Integer num = this.d;
        int iHashCode3 = iHashCode2 ^ (num == null ? 0 : num.hashCode());
        a.aY(this.i);
        int iHashCode4 = ((((((iHashCode3 * 583896283) ^ 1) * (-721379959)) ^ java.util.Arrays.hashCode(this.f)) * 1000003) ^ java.util.Arrays.hashCode(this.g)) * 1000003;
        zzl zzlVar = this.h;
        return iHashCode4 ^ (zzlVar != null ? zzlVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        int i = this.i;
        java.lang.String strValueOf = java.lang.String.valueOf(this.b);
        java.lang.String strValueOf2 = java.lang.String.valueOf(this.c);
        java.lang.String str = i != 0 ? "0" : "null";
        int[] iArr = this.f;
        int[] iArr2 = this.g;
        zzl zzlVar = this.h;
        return "ClearcutData{logSource=" + this.a + ", message=" + strValueOf + ", visualElements=" + strValueOf2 + ", eventCode=" + this.d + ", wallTime=null, elapsedTime=null, qosTier=" + str + ", logVerifier=null, experimentIds=" + java.util.Arrays.toString(iArr) + ", testCodes=" + java.util.Arrays.toString(iArr2) + ", complianceProductData=" + java.lang.String.valueOf(zzlVar) + '}';
    }

    public aclx() {
        throw null;
    }
}
