package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agyg {
    public static final defpackage.agye a = new defpackage.agyf();
    public final long b;
    public final defpackage.agye c;
    public final boolean d;
    public final defpackage.ahyn e;
    public final defpackage.ahyn f;

    public agyg(long j, defpackage.agye agyeVar, boolean z, defpackage.ahyn ahynVar, defpackage.ahyn ahynVar2) {
        this.b = j;
        this.c = agyeVar;
        this.d = z;
        this.e = ahynVar;
        this.f = ahynVar2;
    }

    final defpackage.agyg a(defpackage.agxr agxrVar) {
        return new defpackage.agyg(this.b, this.c, this.d, new defpackage.ahys(agxrVar), new defpackage.ahys(agxrVar));
    }

    public final defpackage.agyg b(boolean z) {
        defpackage.agye agyeVar = this.c;
        defpackage.ahvr.bZ(agyeVar instanceof defpackage.agxf, "Non-BackgroundFetchCallbacks shouldn't be mutating around background fetch callbacks.");
        defpackage.ahvr.bZ(z != this.d, "Double-open or double-close on background fetch callbacks.");
        return new defpackage.agyg(this.b, agyeVar, z, this.e, this.f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.agyg) {
            defpackage.agyg agygVar = (defpackage.agyg) obj;
            if (this.b == agygVar.b && this.c.equals(agygVar.c) && this.d == agygVar.d && this.e.equals(agygVar.e) && this.f.equals(agygVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return ((((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.ahyn ahynVar = this.f;
        defpackage.ahyn ahynVar2 = this.e;
        return "SubscriptionCallbacksState{index=" + this.b + ", callbacks=" + this.c.toString() + ", openBackgroundFetch=" + this.d + ", maybeTopicData=" + ahynVar2.toString() + ", maybeInstanceData=" + ahynVar.toString() + '}';
    }

    public agyg() {
        throw null;
    }
}
