package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahlw {
    public final java.util.Set a;
    public final long b;
    public final defpackage.ahyn c;

    public ahlw(java.util.Set set, long j, defpackage.ahyn ahynVar) {
        this.a = set;
        this.b = j;
        if (ahynVar == null) {
            throw new java.lang.NullPointerException("Null ignoreFirstConstraintTime");
        }
        this.c = ahynVar;
    }

    public static defpackage.ahlw a(defpackage.ahlw ahlwVar, defpackage.ahlw ahlwVar2) {
        java.util.Set set = ahlwVar.a;
        defpackage.ahvr.bY(set.equals(ahlwVar2.a));
        java.util.HashSet hashSet = new java.util.HashSet();
        defpackage.ahyn ahynVarH = defpackage.ahwt.a;
        hashSet.addAll(set);
        long jMin = java.lang.Math.min(ahlwVar.b, ahlwVar2.b);
        defpackage.ahyn ahynVar = ahlwVar.c;
        boolean zF = ahynVar.f();
        defpackage.ahyn ahynVar2 = ahlwVar2.c;
        if (zF && ahynVar2.f()) {
            ahynVarH = defpackage.ahyn.h(java.lang.Long.valueOf(java.lang.Math.min(((java.lang.Long) ahynVar.b()).longValue(), ((java.lang.Long) ahynVar2.b()).longValue())));
        } else if (ahynVar.f()) {
            ahynVarH = ahynVar;
        } else if (ahynVar2.f()) {
            ahynVarH = ahynVar2;
        }
        return new defpackage.ahlw(hashSet, jMin, ahynVarH);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ahlw) {
            defpackage.ahlw ahlwVar = (defpackage.ahlw) obj;
            if (this.a.equals(ahlwVar.a) && this.b == ahlwVar.b && this.c.equals(ahlwVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.ahyn ahynVar = this.c;
        return "SyncSchedule{constraints=" + this.a.toString() + ", nextSyncTime=" + this.b + ", ignoreFirstConstraintTime=" + java.lang.String.valueOf(ahynVar) + '}';
    }

    public ahlw() {
        throw null;
    }
}
