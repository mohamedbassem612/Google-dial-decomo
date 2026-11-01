package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class amdy extends defpackage.amdz {
    private final defpackage.amgf b;

    public amdy(defpackage.amgf amgfVar) {
        this.b = amgfVar;
    }

    @Override // defpackage.amdz
    public final defpackage.altp a() {
        defpackage.amgf amgfVar = this.b;
        defpackage.amge amgeVar = amgfVar.f;
        if (amgeVar == null) {
            amgeVar = defpackage.amge.a;
        }
        int i = amgeVar.c;
        defpackage.amge amgeVar2 = amgfVar.f;
        if (amgeVar2 == null) {
            amgeVar2 = defpackage.amge.a;
        }
        return defpackage.altp.b(i, amgeVar2.d);
    }

    @Override // defpackage.amdz
    public final akzx c() {
        akzx akzxVarM = defpackage.amft.a.m();
        akzxVarM.u();
        defpackage.amft amftVar = (defpackage.amft) akzxVarM.b;
        defpackage.amgf amgfVar = this.b;
        j$.util.Objects.requireNonNull(amgfVar);
        amftVar.d = amgfVar;
        amftVar.c = 8;
        return akzxVarM;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.amdy) {
            return this.b.equals(((defpackage.amdy) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "ParsedVoiceOption{voiceIvrOption=" + java.lang.String.valueOf(this.b) + '}';
    }

    public amdy() {
        throw null;
    }

    @Override // defpackage.amdz
    public final defpackage.amdz b() {
        return this;
    }
}
