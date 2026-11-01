package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class grk {
    public final java.util.concurrent.Executor a;
    public final defpackage.aolr b;
    public final java.util.concurrent.Executor c;
    public final defpackage.gta d;
    public final defpackage.gsu e;
    public final defpackage.dxw f;
    public final defpackage.dxw g;
    public final defpackage.dxw h;
    public final java.lang.String i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final defpackage.gus p;
    public final defpackage.gus q;
    public final defpackage.gus r;

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [aolr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [aolr] */
    /* JADX WARN: Type inference failed for: r0v10, types: [gsu] */
    /* JADX WARN: Type inference failed for: r0v13, types: [dxw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v1, types: [dxw, java.lang.Object] */
    public grk(defpackage.anrf anrfVar) {
        java.util.concurrent.Executor executorAb;
        ?? r0 = anrfVar.e;
        ?? Ab = anrfVar.c;
        if (Ab == 0) {
            if (r0 != 0) {
                defpackage.aolo aoloVar = (defpackage.aolo) r0.get(defpackage.aolo.k);
                defpackage.aosp aospVar = aoloVar instanceof defpackage.aosp ? (defpackage.aosp) aoloVar : null;
                if (aospVar != null) {
                    executorAb = defpackage.aooc.ab(aospVar);
                } else {
                    Ab = 0;
                }
            } else {
                Ab = 0;
            }
            if (Ab == 0) {
                Ab = executorAb;
                defpackage.aosp aospVar2 = defpackage.aoth.a;
                int iMax = java.lang.Math.max(1, java.lang.Math.min(java.lang.Runtime.getRuntime().availableProcessors() - 1, 4));
                defpackage.aolk aolkVar = defpackage.aosp.l;
                Ab = defpackage.aooc.ab(aospVar2.e(iMax));
            }
        }
        Ab = executorAb;
        this.a = Ab;
        ?? Ac = r0;
        if (r0 == 0) {
            Ac = anrfVar.c != null ? defpackage.aooc.ac(Ab) : defpackage.aoth.a;
        }
        this.b = Ac;
        java.lang.Object obj = anrfVar.a;
        this.c = obj == null ? defpackage.aooc.ab(defpackage.aoth.a) : obj;
        this.p = new defpackage.gus((char[]) null);
        java.lang.Object obj2 = anrfVar.g;
        this.d = (defpackage.gta) (obj2 == null ? grr.a : obj2);
        this.q = defpackage.gsj.a;
        java.lang.Object obj3 = anrfVar.b;
        this.e = obj3 == null ? new gte() : obj3;
        this.j = 4;
        this.k = Integer.MAX_VALUE;
        this.m = 20;
        this.f = anrfVar.d;
        this.g = null;
        this.h = anrfVar.f;
        this.i = null;
        this.l = 8;
        this.n = true;
        this.r = new defpackage.gus((char[]) null);
        this.o = true;
    }
}
