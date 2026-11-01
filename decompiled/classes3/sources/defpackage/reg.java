package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class reg {
    public final aify a;
    public final defpackage.quo b;

    public reg(aify aifyVar, defpackage.quo quoVar) {
        this.a = aifyVar;
        this.b = quoVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.reg) {
            defpackage.reg regVar = (defpackage.reg) obj;
            if (ahvr.aP(this.a, regVar.a) && this.b.equals(regVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.quo quoVar = this.b;
        return "Rule{conditions=" + java.lang.String.valueOf(this.a) + ", voiceCenterFragmentKey=" + quoVar.toString() + '}';
    }

    public reg() {
        throw null;
    }
}
