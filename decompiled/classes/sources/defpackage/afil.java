package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class afil implements defpackage.afik {
    long a;

    public afil(byte[] bArr) {
        this.a = 0L;
    }

    @Override // defpackage.afik
    public final akdx a() {
        defpackage.akzx akzxVarM = akdx.a.m();
        long j = this.a;
        akzxVarM.u();
        akdx akdxVar = akzxVarM.b;
        akdxVar.b = 1;
        akdxVar.c = java.lang.Long.valueOf(j);
        return akzxVarM.r();
    }

    @Override // defpackage.afik
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        this.a += ((java.lang.Long) obj).longValue();
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.afil) && this.a == ((defpackage.afil) obj).a;
    }

    public final int hashCode() {
        return java.lang.Long.valueOf(this.a).hashCode();
    }

    public final java.lang.String toString() {
        return java.lang.Long.toString(this.a);
    }

    afil() {
        throw null;
    }
}
