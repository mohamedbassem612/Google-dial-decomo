package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ztp {
    public final defpackage.ztr a;
    private final ztq b;

    public ztp(defpackage.ztr ztrVar) {
        this.a = ztrVar;
        this.b = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ztp) {
            defpackage.ztp ztpVar = (defpackage.ztp) obj;
            if (defpackage.aooh.n(this.a, ztpVar.a)) {
                ztq ztqVar = ztpVar.b;
                if (defpackage.aooh.n(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.ztr ztrVar = this.a;
        return (ztrVar == null ? 0 : ztrVar.hashCode()) * 31;
    }

    public final java.lang.String toString() {
        return "ExperimentSyncSyncletConfig(syncExperimentIdsConfig=" + this.a + ", runtimePropertiesPackageConfig=null)";
    }

    public ztp() {
        this(null);
    }
}
