package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class agwi implements aoxi {
    final /* synthetic */ aoss a;
    final /* synthetic */ aoot b;
    final /* synthetic */ aono c;
    final /* synthetic */ aonj d;
    final /* synthetic */ java.util.List e;
    final /* synthetic */ apdp f;
    final /* synthetic */ aows g;

    public agwi(aoss aossVar, apdp apdpVar, aoot aootVar, aono aonoVar, aonj aonjVar, java.util.List list, aows aowsVar) {
        this.a = aossVar;
        this.f = apdpVar;
        this.b = aootVar;
        this.c = aonoVar;
        this.d = aonjVar;
        this.e = list;
        this.g = aowsVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [aoub, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object a(aoxh aoxhVar, aoln aolnVar) {
        defpackage.agwf agwfVar;
        ?? r2;
        apdp apdpVar;
        ?? r0;
        if (aolnVar instanceof defpackage.agwf) {
            agwfVar = (defpackage.agwf) aolnVar;
            int i = agwfVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                agwfVar.e = i - Integer.MIN_VALUE;
            } else {
                agwfVar = new defpackage.agwf(this, aolnVar);
            }
        } else {
            agwfVar = new defpackage.agwf(this, aolnVar);
        }
        java.lang.Object obj = agwfVar.c;
        aolu aoluVar = aolu.a;
        int i2 = agwfVar.e;
        if (i2 == 0) {
            aooc.af(obj);
            aoss aossVar = this.a;
            apdp apdpVar2 = this.f;
            aoot aootVar = this.b;
            aono aonoVar = this.c;
            aonj aonjVar = this.d;
            java.util.List list = this.e;
            aows aowsVar = this.g;
            aols aolsVar = aols.a;
            ahre.c(aossVar);
            aoub aoubVarAl = aoov.al(aossVar, afsq.K(aolsVar), 2, new defpackage.agwj((aoln) null, aoxhVar, apdpVar2, aootVar, aonoVar, aonjVar, list, aowsVar, 1));
            agwfVar.a = aoubVarAl;
            agwfVar.f = apdpVar2;
            agwfVar.b = list;
            agwfVar.e = 1;
            if (apdpVar2.b(agwfVar) == aoluVar) {
                return aoluVar;
            }
            r2 = aoubVarAl;
            apdpVar = apdpVar2;
            r0 = list;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj2 = agwfVar.b;
            apdpVar = agwfVar.f;
            java.lang.Object obj3 = agwfVar.a;
            aooc.af(obj);
            r0 = obj2;
            r2 = obj3;
        }
        try {
            if (r0.size() > 2) {
                throw new java.lang.IllegalStateException("This Job queue has overflowed. Please report this as a bug at go/tiktok-bug");
            }
            if (r0.size() + 1 > 2) {
                ((aoub) r0.remove(1)).s((java.util.concurrent.CancellationException) null);
            }
            r0.add(r2);
            apdpVar.d();
            r2.z();
            return aojh.a;
        } catch (java.lang.Throwable th) {
            apdpVar.d();
            throw th;
        }
    }
}
