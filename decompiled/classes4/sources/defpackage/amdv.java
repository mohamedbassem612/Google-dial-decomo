package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class amdv extends defpackage.amdz {
    private final defpackage.amfp b;

    public amdv(defpackage.amfp amfpVar) {
        this.b = amfpVar;
    }

    @Override // defpackage.amdz
    public final defpackage.altp a() {
        defpackage.amfp amfpVar = this.b;
        defpackage.amfo amfoVar = amfpVar.e;
        if (amfoVar == null) {
            amfoVar = defpackage.amfo.a;
        }
        int i = amfoVar.c;
        defpackage.amfo amfoVar2 = amfpVar.e;
        if (amfoVar2 == null) {
            amfoVar2 = defpackage.amfo.a;
        }
        return defpackage.altp.b(i, amfoVar2.d);
    }

    @Override // defpackage.amdz
    public final akzx c() {
        akzx akzxVarM = defpackage.amft.a.m();
        akzxVarM.u();
        defpackage.amft amftVar = (defpackage.amft) akzxVarM.b;
        defpackage.amfp amfpVar = this.b;
        j$.util.Objects.requireNonNull(amfpVar);
        amftVar.d = amfpVar;
        amftVar.c = 1;
        return akzxVarM;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.amdv) {
            return this.b.equals(((defpackage.amdv) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "ParsedInfo{amInfo=" + java.lang.String.valueOf(this.b) + '}';
    }

    public amdv() {
        throw null;
    }

    @Override // defpackage.amdz
    public final defpackage.amdz b() {
        return this;
    }
}
