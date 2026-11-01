package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ett {
    public final java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final java.lang.Object c;

    public ett(alg algVar, nf nfVar) {
        this.b = algVar;
        this.a = nfVar;
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cdu.c);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void a() {
        this.c.execute(new defpackage.drn(this, 6));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cer, java.lang.Object] */
    public final defpackage.alb b() {
        return (defpackage.alb) this.c.a();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [aonj, java.lang.Object] */
    public final cer c(aonj aonjVar, java.lang.Object obj, aiw aiwVar, aonj aonjVar2) {
        defpackage.alb albVarB = b();
        if (albVarB == null) {
            alg algVar = (alg) this.b;
            java.lang.Object objA = aonjVar2.a(algVar.f());
            java.lang.Object obj2 = this.a;
            nf nfVar = (nf) obj2;
            aiw aiwVar2 = (aiw) nfVar.a.a(aonjVar2.a(algVar.f()));
            aiwVar2.d();
            defpackage.alb albVar = new defpackage.alb(this, new defpackage.ale(algVar, objA, aiwVar2, nfVar), aonjVar, aonjVar2);
            this.c.b(albVar);
            algVar.D(albVar.a);
            albVarB = albVar;
        }
        java.lang.Object obj3 = this.b;
        albVarB.c = aonjVar2;
        albVarB.b = aonjVar;
        albVarB.b(((alg) obj3).e(), obj, aiwVar);
        return albVarB;
    }

    public ett(afpb afpbVar, rai raiVar, java.util.concurrent.Executor executor) {
        j$.util.Objects.requireNonNull(afpbVar);
        this.b = afpbVar;
        this.a = new java.lang.ref.WeakReference(raiVar);
        this.c = executor;
    }
}
