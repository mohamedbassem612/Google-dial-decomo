package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class amdw extends defpackage.amdz {
    private final defpackage.amgc b;

    public amdw(defpackage.amgc amgcVar) {
        this.b = amgcVar;
    }

    @Override // defpackage.amdz
    public final defpackage.altp a() {
        defpackage.amgc amgcVar = this.b;
        defpackage.amgb amgbVar = amgcVar.f;
        if (amgbVar == null) {
            amgbVar = defpackage.amgb.a;
        }
        int i = amgbVar.c;
        defpackage.amgb amgbVar2 = amgcVar.f;
        if (amgbVar2 == null) {
            amgbVar2 = defpackage.amgb.a;
        }
        return defpackage.altp.b(i, amgbVar2.d);
    }

    @Override // defpackage.amdz
    public final defpackage.amdz b() {
        amdx amdxVar = new amdx();
        akzx akzxVarP = this.b.p();
        akzxVarP.u();
        defpackage.amgc amgcVar = (defpackage.amgc) akzxVarP.b;
        amgcVar.g = 2;
        amgcVar.b |= 32;
        amdxVar.d((defpackage.amgc) akzxVarP.p());
        return amdxVar.c();
    }

    @Override // defpackage.amdz
    public final akzx c() {
        akzx akzxVarM = defpackage.amft.a.m();
        akzxVarM.u();
        defpackage.amft amftVar = (defpackage.amft) akzxVarM.b;
        defpackage.amgc amgcVar = this.b;
        j$.util.Objects.requireNonNull(amgcVar);
        amftVar.d = amgcVar;
        amftVar.c = 2;
        return akzxVarM;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.amdw) {
            return this.b.equals(((defpackage.amdw) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "ParsedKeyOption{ivrOption=" + java.lang.String.valueOf(this.b) + '}';
    }

    public amdw() {
        throw null;
    }
}
