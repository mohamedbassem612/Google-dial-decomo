package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ztr {
    public final java.lang.String a;
    public final java.util.List b;

    public ztr(java.util.List list) {
        defpackage.aooh.f(list, "experimentIdsToSync");
        this.a = "phone_experiment_ids";
        this.b = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ztr) {
            defpackage.ztr ztrVar = (defpackage.ztr) obj;
            if (defpackage.aooh.n(this.a, ztrVar.a) && defpackage.aooh.n(this.b, ztrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "SyncExperimentIdsConfig(dataKey=" + this.a + ", experimentIdsToSync=" + this.b + ')';
    }
}
