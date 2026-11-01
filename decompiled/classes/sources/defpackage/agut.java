package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agut {
    public final defpackage.ahyn a;
    public final defpackage.ahyn b;
    private final defpackage.ahyn c;
    private final defpackage.ahyn d;
    private final defpackage.ahyn e;
    private final defpackage.ahyn f;
    private final defpackage.ahyn g;
    private final defpackage.ahyn h;
    private final defpackage.ahyn i;

    public agut(defpackage.ahyn ahynVar, defpackage.ahyn ahynVar2, defpackage.ahyn ahynVar3, defpackage.ahyn ahynVar4, defpackage.ahyn ahynVar5, defpackage.ahyn ahynVar6, defpackage.ahyn ahynVar7, defpackage.ahyn ahynVar8, defpackage.ahyn ahynVar9) {
        this.c = ahynVar;
        this.d = ahynVar2;
        this.a = ahynVar3;
        this.e = ahynVar4;
        this.f = ahynVar5;
        this.g = ahynVar6;
        this.b = ahynVar7;
        this.h = ahynVar8;
        this.i = ahynVar9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.agut) {
            defpackage.agut agutVar = (defpackage.agut) obj;
            if (this.c.equals(agutVar.c) && this.d.equals(agutVar.d) && this.a.equals(agutVar.a) && this.e.equals(agutVar.e) && this.f.equals(agutVar.f) && this.g.equals(agutVar.g) && this.b.equals(agutVar.b) && this.h.equals(agutVar.h) && this.i.equals(agutVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 842269859) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final java.lang.String toString() {
        defpackage.ahyn ahynVar = this.i;
        defpackage.ahyn ahynVar2 = this.h;
        defpackage.ahyn ahynVar3 = this.b;
        defpackage.ahyn ahynVar4 = this.g;
        defpackage.ahyn ahynVar5 = this.f;
        defpackage.ahyn ahynVar6 = this.e;
        defpackage.ahyn ahynVar7 = this.a;
        defpackage.ahyn ahynVar8 = this.d;
        return "TikTokWorkManagerClientConfiguration{jobSchedulerJobIdRange=" + java.lang.String.valueOf(this.c) + ", minimumLoggingLevel=" + java.lang.String.valueOf(ahynVar8) + ", initializationExceptionHandler=" + java.lang.String.valueOf(ahynVar7) + ", defaultProcessName=" + java.lang.String.valueOf(ahynVar6) + ", useRemoteWorkManager=false, maxSchedulerLimit=" + java.lang.String.valueOf(ahynVar5) + ", schedulingExceptionHandler=" + java.lang.String.valueOf(ahynVar4) + ", workerExecutionExceptionHandler=" + java.lang.String.valueOf(ahynVar3) + ", markingJobsAsImportantWhileForeground=" + java.lang.String.valueOf(ahynVar2) + ", isRemoteCancellationPropagationFixEnabled=" + java.lang.String.valueOf(ahynVar) + '}';
    }

    public agut() {
        throw null;
    }
}
