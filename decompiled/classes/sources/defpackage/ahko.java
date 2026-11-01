package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahko {
    public final java.lang.String a;
    public final defpackage.ahyn b;
    public final defpackage.albh c;
    public final defpackage.ahkk d;
    public final defpackage.aify e;
    public final defpackage.ahyn f;
    public final defpackage.ahyn g;
    public final java.util.concurrent.Executor h;

    public ahko(java.lang.String str, defpackage.ahyn ahynVar, defpackage.albh albhVar, defpackage.ahkk ahkkVar, defpackage.aify aifyVar, defpackage.ahyn ahynVar2, defpackage.ahyn ahynVar3, java.util.concurrent.Executor executor) {
        this.a = str;
        this.b = ahynVar;
        this.c = albhVar;
        this.d = ahkkVar;
        this.e = aifyVar;
        this.f = ahynVar2;
        this.g = ahynVar3;
        this.h = executor;
    }

    public static defpackage.ahkn a() {
        defpackage.ahkn ahknVar = new defpackage.ahkn();
        ahknVar.e = (byte) 1;
        ahknVar.c = new defpackage.ahkk(1, 2);
        return ahknVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ahko) {
            defpackage.ahko ahkoVar = (defpackage.ahko) obj;
            if (this.a.equals(ahkoVar.a) && this.b.equals(ahkoVar.b) && this.c.equals(ahkoVar.c) && this.d.equals(ahkoVar.d) && defpackage.ahvr.aP(this.e, ahkoVar.e) && this.f.equals(ahkoVar.f) && this.g.equals(ahkoVar.g)) {
                java.util.concurrent.Executor executor = this.h;
                if (executor == null) {
                    if (ahkoVar.h == null) {
                        return true;
                    }
                } else if (executor.equals(ahkoVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.a.hashCode() ^ 385623362) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
        java.util.concurrent.Executor executor = this.h;
        return ((((iHashCode * 1000003) ^ 2040732332) * 1000003) ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
    }

    public final java.lang.String toString() {
        java.util.concurrent.Executor executor = this.h;
        defpackage.ahyn ahynVar = this.g;
        defpackage.ahyn ahynVar2 = this.f;
        defpackage.aify aifyVar = this.e;
        defpackage.ahkk ahkkVar = this.d;
        defpackage.albh albhVar = this.c;
        return "ProtoDataStoreConfig{blockingSafeReads=false, name=" + this.a + ", nameSuffix=" + java.lang.String.valueOf(this.b) + ", schema=" + java.lang.String.valueOf(albhVar) + ", storage=" + java.lang.String.valueOf(ahkkVar) + ", migrations=" + java.lang.String.valueOf(aifyVar) + ", handler=" + java.lang.String.valueOf(ahynVar2) + ", logger=" + java.lang.String.valueOf(ahynVar) + ", ioExecutor=" + java.lang.String.valueOf(executor) + ", lamsConfig=null}";
    }

    public ahko() {
        throw null;
    }
}
