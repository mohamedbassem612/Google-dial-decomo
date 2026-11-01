package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahih {
    public final java.lang.String a;
    public final ahyn b;
    public final aigf c;
    public final boolean d;
    public final boolean e;
    public final int f;
    private final ahyn g;
    private final ahyn h;
    private final ahyn i;

    public ahih(java.lang.String str, ahyn ahynVar, aigf aigfVar, boolean z, boolean z2, ahyn ahynVar2, ahyn ahynVar3, ahyn ahynVar4) {
        this.a = str;
        this.b = ahynVar;
        this.c = aigfVar;
        this.d = z;
        this.e = z2;
        this.g = ahynVar2;
        this.f = 1;
        this.h = ahynVar3;
        this.i = ahynVar4;
    }

    public static defpackage.ahig a() {
        defpackage.ahig ahigVar = new defpackage.ahig();
        ahigVar.b(true);
        ahigVar.c(true);
        ahigVar.d = 1;
        return ahigVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ahih) {
            defpackage.ahih ahihVar = (defpackage.ahih) obj;
            if (this.a.equals(ahihVar.a) && this.b.equals(ahihVar.b) && ahvr.aJ(this.c, ahihVar.c) && this.d == ahihVar.d && this.e == ahihVar.e && this.g.equals(ahihVar.g)) {
                int i = this.f;
                int i2 = ahihVar.f;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 1 && this.h.equals(ahihVar.h) && this.i.equals(ahihVar.i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        anty.aJ(this.f);
        return (((((((((((iHashCode * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003) ^ 2040732332) * 1000003) ^ 1) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final java.lang.String toString() {
        int i = this.f;
        ahyn ahynVar = this.g;
        aigf aigfVar = this.c;
        java.lang.String strValueOf = java.lang.String.valueOf(this.b);
        java.lang.String strValueOf2 = java.lang.String.valueOf(aigfVar);
        java.lang.String strValueOf3 = java.lang.String.valueOf(ahynVar);
        java.lang.String str = i != 1 ? "null" : "SYSTEM_DEFAULT_THEME";
        boolean z = this.e;
        boolean z2 = this.d;
        java.lang.String str2 = this.a;
        ahyn ahynVar2 = this.h;
        ahyn ahynVar3 = this.i;
        return "FeedbackOptions{categoryTag=" + str2 + ", description=" + strValueOf + ", psd=" + strValueOf2 + ", psdAllowPii=" + z2 + ", includeScreenshot=" + z + ", customScreenshot=" + strValueOf3 + ", colorTheme=" + str + ", configuratorTriggerId=" + java.lang.String.valueOf(ahynVar2) + ", logOptions=" + java.lang.String.valueOf(ahynVar3) + '}';
    }

    public ahih() {
        throw null;
    }
}
