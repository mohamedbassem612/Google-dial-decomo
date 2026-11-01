package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vfg {
    public final aify a;
    public final aify b;
    public final aify c;
    public final aify d;
    public final aify e;
    public final aify f;

    public vfg(aify aifyVar, aify aifyVar2, aify aifyVar3, aify aifyVar4, aify aifyVar5, aify aifyVar6) {
        this.a = aifyVar;
        this.b = aifyVar2;
        this.c = aifyVar3;
        this.d = aifyVar4;
        this.e = aifyVar5;
        this.f = aifyVar6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vfg) {
            defpackage.vfg vfgVar = (defpackage.vfg) obj;
            if (ahvr.aP(this.a, vfgVar.a) && ahvr.aP(this.b, vfgVar.b) && ahvr.aP(this.c, vfgVar.c) && ahvr.aP(this.d, vfgVar.d) && ahvr.aP(this.e, vfgVar.e) && ahvr.aP(this.f, vfgVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final java.lang.String toString() {
        aify aifyVar = this.f;
        aify aifyVar2 = this.e;
        aify aifyVar3 = this.d;
        aify aifyVar4 = this.c;
        aify aifyVar5 = this.b;
        return "VvmDelta{localVoicemailsToDelete=" + java.lang.String.valueOf(this.a) + ", serverVoicemailsToDownload=" + java.lang.String.valueOf(aifyVar5) + ", localVoicemailsToMarkAsRead=" + java.lang.String.valueOf(aifyVar4) + ", serverVoicemailsToMarkAsRead=" + java.lang.String.valueOf(aifyVar3) + ", voicemailsToArchive=" + java.lang.String.valueOf(aifyVar2) + ", voicemailsToDelete=" + java.lang.String.valueOf(aifyVar) + '}';
    }

    public vfg() {
        throw null;
    }
}
