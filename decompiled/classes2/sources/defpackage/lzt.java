package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lzt {
    public final aoss a;
    public final ajcu b;
    public final agsm c;
    public boolean d;
    public volatile kiu e;
    public final java.util.Set f;
    public final ahda g;

    public lzt(aoss aossVar, ajcu ajcuVar, agsm agsmVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(ajcuVar, "lightweightExecutor");
        aooh.f(agsmVar, "androidFutures");
        this.a = aossVar;
        this.b = ajcuVar;
        this.c = agsmVar;
        this.e = defpackage.hgt.J(kiu.a.m()).E();
        this.g = new ahda();
        java.util.Set setSynchronizedSet = j$.util.DesugarCollections.synchronizedSet(new java.util.LinkedHashSet());
        aooh.e(setSynchronizedSet, "synchronizedSet(...)");
        this.f = setSynchronizedSet;
    }

    public final void a(kiu kiuVar) {
        aooh.f(kiuVar, "<set-?>");
        this.e = kiuVar;
    }
}
