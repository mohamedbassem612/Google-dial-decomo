package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gyw extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ gsg e;
    final /* synthetic */ gxl f;
    final /* synthetic */ ipc g;
    private /* synthetic */ java.lang.Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyw(gsg gsgVar, ipc ipcVar, gxl gxlVar, aoln aolnVar) {
        super(2, aolnVar);
        this.e = gsgVar;
        this.g = ipcVar;
        this.f = gxlVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(java.lang.Object obj) {
        java.util.concurrent.CancellationException cancellationException;
        java.lang.Object obj2;
        ajcq ajcqVar;
        aoub aoubVar;
        java.lang.Object obj3;
        aoss aossVar = (aoss) this.h;
        aolu aoluVar = aolu.a;
        try {
            if (this.d != 0) {
                java.lang.Object obj4 = this.c;
                obj3 = this.b;
                obj2 = this.a;
                try {
                    aooc.af(obj);
                    aoubVar = obj4;
                    obj3 = obj3;
                } catch (java.util.concurrent.CancellationException e) {
                    cancellationException = e;
                    ajcqVar = obj3;
                    java.lang.String str = defpackage.gzb.a;
                    gsg gsgVar = this.e;
                    gsh.a().d(str, "Delegated worker " + gsgVar.getClass() + " was cancelled", cancellationException);
                    int i = ((java.util.concurrent.atomic.AtomicInteger) obj2).get();
                    if (ajcqVar.isCancelled() || i == -256) {
                        throw cancellationException;
                    }
                    throw new defpackage.gyu(((java.util.concurrent.atomic.AtomicInteger) obj2).get());
                } catch (java.lang.Throwable th) {
                    th = th;
                    java.lang.Throwable th2 = th;
                    java.lang.String str2 = defpackage.gzb.a;
                    gsg gsgVar2 = this.e;
                    gsh.a().d(str2, "Delegated worker " + gsgVar2.getClass() + " threw exception in startWork.", th2);
                    throw th2;
                }
            } else {
                aooc.af(obj);
                java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(-256);
                ajcq ajcqVarB = this.e.b();
                aooh.e(ajcqVarB, "startWork(...)");
                aoub aoubVarAn = aoov.an(aossVar, (aolr) null, 0, new defpackage.blv(this.g, this.f, atomicInteger, ajcqVarB, (aoln) null, 3), 3);
                try {
                    this.h = null;
                    this.a = atomicInteger;
                    this.b = ajcqVarB;
                    this.c = aoubVarAn;
                    this.d = 1;
                    java.lang.Object objG = defpackage.yt.g(ajcqVarB, this);
                    if (objG == aoluVar) {
                        return aoluVar;
                    }
                    aoubVar = aoubVarAn;
                    obj = objG;
                    obj2 = atomicInteger;
                    obj3 = ajcqVarB;
                } catch (java.util.concurrent.CancellationException e2) {
                    cancellationException = e2;
                    obj2 = atomicInteger;
                    ajcqVar = ajcqVarB;
                    java.lang.String str3 = defpackage.gzb.a;
                    gsg gsgVar3 = this.e;
                    gsh.a().d(str3, "Delegated worker " + gsgVar3.getClass() + " was cancelled", cancellationException);
                    int i2 = ((java.util.concurrent.atomic.AtomicInteger) obj2).get();
                    if (ajcqVar.isCancelled()) {
                        throw cancellationException;
                    }
                    throw cancellationException;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    java.lang.Throwable th4 = th;
                    java.lang.String str4 = defpackage.gzb.a;
                    gsg gsgVar4 = this.e;
                    gsh.a().d(str4, "Delegated worker " + gsgVar4.getClass() + " threw exception in startWork.", th4);
                    throw th4;
                }
            }
            gus gusVar = (gus) obj;
            aoubVar.s((java.util.concurrent.CancellationException) null);
            return gusVar;
        } catch (java.lang.Throwable th5) {
            aoluVar.s((java.util.concurrent.CancellationException) null);
            throw th5;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.gyw gywVar = new defpackage.gyw(this.e, this.g, this.f, aolnVar);
        gywVar.h = obj;
        return gywVar;
    }
}
