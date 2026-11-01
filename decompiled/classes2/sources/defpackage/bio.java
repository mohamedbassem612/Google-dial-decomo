package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bio extends dca {
    private final aonj a;
    private final aonj b = null;
    private final aonj d;
    private final vm e;

    public bio(vm vmVar, aonj aonjVar, aonj aonjVar2) {
        this.e = vmVar;
        this.a = aonjVar;
        this.d = aonjVar2;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.bip(this.e, this.a, this.d);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.bip bipVar = (defpackage.bip) cmvVar;
        bipVar.e.b = null;
        bipVar.e = this.e;
        vm vmVar = bipVar.e;
        vmVar.b = bipVar;
        vmVar.a = true != ((cmv) bipVar).D ? 2 : 3;
        bipVar.a = this.a;
        bipVar.b = null;
        bipVar.c = this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bio) {
            defpackage.bio bioVar = (defpackage.bio) obj;
            if (this.e == bioVar.e && this.a == bioVar.a) {
                aonj aonjVar = bioVar.b;
                if (this.d == bioVar.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.e.hashCode() * 31) + this.a.hashCode()) * 961) + this.d.hashCode();
    }
}
