package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acvj {
    public final java.lang.String a;
    public final ahyn b;
    public final ahyn c;
    public final ahyn d;
    public final ahyn e;
    public final ahyn f;
    public final ahyn g;
    public final boolean h;
    public final int i;
    private final ahyn j;

    public acvj(java.lang.String str, ahyn ahynVar, ahyn ahynVar2, ahyn ahynVar3, ahyn ahynVar4, ahyn ahynVar5, ahyn ahynVar6, ahyn ahynVar7, int i, boolean z) {
        this.a = str;
        this.b = ahynVar;
        this.c = ahynVar2;
        this.d = ahynVar3;
        this.e = ahynVar4;
        this.j = ahynVar5;
        this.f = ahynVar6;
        this.g = ahynVar7;
        this.i = i;
        this.h = z;
    }

    public static defpackage.acvi a() {
        defpackage.acvi acviVar = new defpackage.acvi();
        acviVar.d = 2;
        acviVar.b = true;
        acviVar.c = (byte) 15;
        return acviVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.acvj) {
            defpackage.acvj acvjVar = (defpackage.acvj) obj;
            if (this.a.equals(acvjVar.a) && this.b.equals(acvjVar.b) && this.c.equals(acvjVar.c) && this.d.equals(acvjVar.d) && this.e.equals(acvjVar.e) && this.j.equals(acvjVar.j) && this.f.equals(acvjVar.f) && this.g.equals(acvjVar.g)) {
                int i = this.i;
                int i2 = acvjVar.i;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.h == acvjVar.h) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.f.hashCode();
        int i = this.i;
        anty.aJ(i);
        return (((((((iHashCode * 1000003) ^ 2040732332) * 583896283) ^ i) * 1000003) ^ 1237) * 1000003) ^ (true != this.h ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.i;
        ahyn ahynVar = this.g;
        ahyn ahynVar2 = this.f;
        ahyn ahynVar3 = this.j;
        ahyn ahynVar4 = this.e;
        ahyn ahynVar5 = this.d;
        ahyn ahynVar6 = this.c;
        java.lang.String strValueOf = java.lang.String.valueOf(this.b);
        java.lang.String strValueOf2 = java.lang.String.valueOf(ahynVar6);
        java.lang.String strValueOf3 = java.lang.String.valueOf(ahynVar5);
        java.lang.String strValueOf4 = java.lang.String.valueOf(ahynVar4);
        java.lang.String strValueOf5 = java.lang.String.valueOf(ahynVar3);
        java.lang.String strValueOf6 = java.lang.String.valueOf(ahynVar2);
        java.lang.String strValueOf7 = java.lang.String.valueOf(ahynVar);
        if (i != 1) {
            str = i != 2 ? "null" : "ALL";
        } else {
            str = "NONE";
        }
        return "DownloadFileGroupRequest{groupName=" + this.a + ", accountOptional=" + strValueOf + ", variantIdOptional=" + strValueOf2 + ", contentTitleOptional=" + strValueOf3 + ", contentTextOptional=" + strValueOf4 + ", contentIntentOptional=" + strValueOf5 + ", downloadConditionsOptional=" + strValueOf6 + ", listenerOptional=" + strValueOf7 + ", groupSizeBytes=0, groupSizeBytesLong=0, showNotifications=" + str + ", preserveZipDirectories=false, verifyIsolatedStructure=" + this.h + '}';
    }

    public acvj() {
        throw null;
    }
}
