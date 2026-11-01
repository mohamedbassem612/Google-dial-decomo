package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agjx {
    public final long a;
    public final long b;
    public final ajh c;
    public final java.util.List d;

    public agjx(long j, long j2, ajh ajhVar, java.util.List list) {
        aooh.f(ajhVar, "easing");
        this.a = j;
        this.b = j2;
        this.c = ajhVar;
        this.d = list;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.agjt agjtVar = (defpackage.agjt) it.next();
            if (!linkedHashSet.add(agjtVar.a)) {
                linkedHashSet2.add(agjtVar.a.a());
            }
        }
        if (linkedHashSet2.isEmpty()) {
            return;
        }
        android.util.Log.w("KeyframeTransition", "Warning: Duplicate uniform(s) defined in KeyframeTransition: " + linkedHashSet2 + ". Duration: " + this.a + ", Delay: " + this.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.agjx) {
            defpackage.agjx agjxVar = (defpackage.agjx) obj;
            if (this.a == agjxVar.a && this.b == agjxVar.b && aooh.n(this.c, agjxVar.c) && aooh.n(this.d, agjxVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((anty.M(this.a) * 31) + anty.M(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "KeyframeTransition(duration=" + this.a + ", delay=" + this.b + ", easing=" + this.c + ", targetKeyFrames=" + this.d + ')';
    }
}
