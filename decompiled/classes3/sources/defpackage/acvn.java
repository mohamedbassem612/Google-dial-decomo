package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acvn {
    public final java.lang.String a;
    public final boolean b;
    private final ahyn c;
    private final ahyn d;

    public acvn(java.lang.String str, ahyn ahynVar, ahyn ahynVar2, boolean z) {
        this.a = str;
        this.c = ahynVar;
        this.d = ahynVar2;
        this.b = z;
    }

    public static defpackage.acvm a() {
        defpackage.acvm acvmVar = new defpackage.acvm();
        acvmVar.a = true;
        acvmVar.b = (byte) 3;
        return acvmVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.acvn) {
            defpackage.acvn acvnVar = (defpackage.acvn) obj;
            if (this.a.equals(acvnVar.a) && this.c.equals(acvnVar.c) && this.d.equals(acvnVar.d) && this.b == acvnVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        ahyn ahynVar = this.d;
        return "GetFileGroupRequest{groupName=" + this.a + ", accountOptional=" + java.lang.String.valueOf(this.c) + ", variantIdOptional=" + java.lang.String.valueOf(ahynVar) + ", preserveZipDirectories=false, verifyIsolatedStructure=" + this.b + '}';
    }

    public acvn() {
        throw null;
    }
}
