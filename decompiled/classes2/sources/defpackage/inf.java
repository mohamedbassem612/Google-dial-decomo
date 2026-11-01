package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class inf implements defpackage.ing {
    private final java.lang.Long a;
    private final java.lang.Long b;

    public inf(java.lang.Long l, java.lang.Long l2) {
        this.a = l;
        this.b = l2;
    }

    @Override // defpackage.ing
    public final boolean a(java.lang.Long l) {
        aimw aimwVarL = defpackage.ind.a.b().l("com/android/dialer/audioprism/internal/models/soda/impl/RunningState$Stopped", "happenedWhileFeatureAlive", 70, "AudioPrismSodaFeatureState.kt");
        java.lang.Long l2 = this.a;
        java.lang.Long l3 = this.b;
        aimwVarL.M("timestamp = %d, startTimeUsec = %s, stopTimeUsec = %s", l, l2, l3);
        if (l == null) {
            return true;
        }
        if ((l2 != null ? l2.longValue() : Long.MIN_VALUE) < l.longValue()) {
            if (l.longValue() < (l3 != null ? l3.longValue() : Long.MAX_VALUE)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.inf) {
            defpackage.inf infVar = (defpackage.inf) obj;
            if (aooh.n(this.a, infVar.a) && aooh.n(this.b, infVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Long l = this.a;
        int iHashCode = l == null ? 0 : l.hashCode();
        java.lang.Long l2 = this.b;
        return (iHashCode * 31) + (l2 != null ? l2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "Stopped(startTimeUsec=" + this.a + ", stopTimeUsec=" + this.b + ')';
    }
}
