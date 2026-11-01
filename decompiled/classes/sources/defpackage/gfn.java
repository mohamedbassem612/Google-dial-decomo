package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gfn {
    public final defpackage.gfy a;
    public final java.lang.String[] b;
    public final defpackage.ggq c;
    public final java.util.Map d;
    public final java.util.concurrent.locks.ReentrantLock e;
    public final java.util.concurrent.atomic.AtomicInteger f;
    public defpackage.ghh g;
    public final defpackage.aomy h;
    public final defpackage.aomy i;
    public final java.lang.Object j;
    public hgu k;
    private final java.util.Map l;
    private final java.util.Map m;

    public gfn(defpackage.gfy gfyVar, java.util.Map map, java.util.Map map2, java.lang.String... strArr) {
        this.a = gfyVar;
        this.l = map;
        this.m = map2;
        this.b = strArr;
        defpackage.ggq ggqVar = new defpackage.ggq(gfyVar, map, map2, strArr, gfyVar.j, new defpackage.dsm((java.lang.Object) this, 2, (char[]) null));
        this.c = ggqVar;
        this.d = new java.util.LinkedHashMap();
        this.e = new java.util.concurrent.locks.ReentrantLock();
        this.f = new java.util.concurrent.atomic.AtomicInteger(0);
        this.h = new defpackage.ddw(this, 17);
        this.i = new defpackage.ddw(this, 18);
        defpackage.aooh.e(java.util.Collections.newSetFromMap(new java.util.IdentityHashMap()), "newSetFromMap(...)");
        this.j = new java.lang.Object();
        ggqVar.f = new defpackage.ddw(this, 19);
    }

    public final java.lang.Object a(defpackage.aoln aolnVar) {
        java.lang.Object objE = this.c.e(aolnVar);
        return objE != defpackage.aolu.a ? defpackage.aojh.a : objE;
    }

    public final void b() {
        this.c.f(this.h, this.i);
    }
}
