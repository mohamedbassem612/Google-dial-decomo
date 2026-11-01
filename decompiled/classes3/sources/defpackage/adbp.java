package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class adbp implements ahyc {
    public final /* synthetic */ java.util.Set a;
    public final /* synthetic */ defpackage.acwe b;
    public final /* synthetic */ java.util.concurrent.atomic.AtomicLong c;
    public final /* synthetic */ java.util.Set d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ defpackage.adbr f;
    public final /* synthetic */ defpackage.adac g;
    public final /* synthetic */ java.util.Set h;

    public /* synthetic */ adbp(java.util.Set set, defpackage.acwe acweVar, java.util.concurrent.atomic.AtomicLong atomicLong, java.util.Set set2, boolean z, defpackage.adbr adbrVar, defpackage.adac adacVar, java.util.Set set3) {
        this.a = set;
        this.b = acweVar;
        this.c = atomicLong;
        this.d = set2;
        this.e = z;
        this.f = adbrVar;
        this.g = adacVar;
        this.h = set3;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        java.lang.Long l = (java.lang.Long) obj;
        java.util.Set set = this.a;
        defpackage.acwe acweVar = this.b;
        if (!set.contains(acweVar)) {
            this.c.getAndAdd(l.longValue());
            set.add(acweVar);
        }
        defpackage.adbr adbrVar = this.f;
        boolean z = this.e;
        java.util.Set set2 = this.d;
        if (!set2.contains(acweVar)) {
            if (z) {
                adbrVar.b += l.longValue();
            }
            adbrVar.a += l.longValue();
            set2.add(acweVar);
        }
        if (!this.g.a.f) {
            return null;
        }
        java.util.Set set3 = this.h;
        ahvr.ci(set3);
        if (set3.contains(acweVar)) {
            return null;
        }
        if (z) {
            adbrVar.d += l.longValue();
            adbrVar.f++;
        }
        adbrVar.c += l.longValue();
        set3.add(acweVar);
        return null;
    }
}
