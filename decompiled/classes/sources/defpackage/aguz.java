package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aguz {
    public final java.lang.Class a;
    public final defpackage.grn b;
    public final defpackage.ahyn c;
    public final defpackage.agux d;
    public final defpackage.ahyn e;
    public final defpackage.grp f;
    public final defpackage.ahyn g;
    public final defpackage.ahyn h;
    public final defpackage.aihd i;
    public final defpackage.ahyn j;
    public final defpackage.ahyn k;
    public final defpackage.ahyn l;

    public aguz(java.lang.Class cls, defpackage.grn grnVar, defpackage.ahyn ahynVar, defpackage.agux aguxVar, defpackage.ahyn ahynVar2, defpackage.grp grpVar, defpackage.ahyn ahynVar3, defpackage.ahyn ahynVar4, defpackage.aihd aihdVar, defpackage.ahyn ahynVar5, defpackage.ahyn ahynVar6, defpackage.ahyn ahynVar7) {
        this.a = cls;
        this.b = grnVar;
        this.c = ahynVar;
        this.d = aguxVar;
        this.e = ahynVar2;
        this.f = grpVar;
        this.g = ahynVar3;
        this.h = ahynVar4;
        this.i = aihdVar;
        this.j = ahynVar5;
        this.k = ahynVar6;
        this.l = ahynVar7;
    }

    public static defpackage.aguv a(java.lang.Class cls) {
        defpackage.aguv aguvVar = new defpackage.aguv();
        aguvVar.a = cls;
        aguvVar.b(defpackage.grn.a);
        aguvVar.c(new defpackage.agux(0L, java.util.concurrent.TimeUnit.SECONDS));
        aguvVar.e(defpackage.aikn.a);
        aguvVar.f = new defpackage.ipc((char[]) null).q();
        return aguvVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aguz) {
            defpackage.aguz aguzVar = (defpackage.aguz) obj;
            if (this.a.equals(aguzVar.a) && this.b.equals(aguzVar.b) && this.c.equals(aguzVar.c) && this.d.equals(aguzVar.d) && this.e.equals(aguzVar.e) && this.f.equals(aguzVar.f) && this.g.equals(aguzVar.g) && this.h.equals(aguzVar.h) && this.i.equals(aguzVar.i) && this.j.equals(aguzVar.j) && this.k.equals(aguzVar.k) && this.l.equals(aguzVar.l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.ahyn ahynVar = this.l;
        defpackage.ahyn ahynVar2 = this.k;
        defpackage.ahyn ahynVar3 = this.j;
        defpackage.aihd aihdVar = this.i;
        defpackage.ahyn ahynVar4 = this.h;
        defpackage.ahyn ahynVar5 = this.g;
        defpackage.grp grpVar = this.f;
        defpackage.ahyn ahynVar6 = this.e;
        defpackage.agux aguxVar = this.d;
        defpackage.ahyn ahynVar7 = this.c;
        defpackage.grn grnVar = this.b;
        return "TikTokWorkSpec{workerClass=" + java.lang.String.valueOf(this.a) + ", constraints=" + java.lang.String.valueOf(grnVar) + ", expedited=" + java.lang.String.valueOf(ahynVar7) + ", initialDelay=" + java.lang.String.valueOf(aguxVar) + ", nextScheduleTimeOverride=" + java.lang.String.valueOf(ahynVar6) + ", inputData=" + java.lang.String.valueOf(grpVar) + ", periodic=" + java.lang.String.valueOf(ahynVar5) + ", unique=" + java.lang.String.valueOf(ahynVar4) + ", tags=" + java.lang.String.valueOf(aihdVar) + ", backoffPolicy=" + java.lang.String.valueOf(ahynVar3) + ", backoffDelayDuration=" + java.lang.String.valueOf(ahynVar2) + ", targetProcess=" + java.lang.String.valueOf(ahynVar) + '}';
    }

    public aguz() {
        throw null;
    }
}
