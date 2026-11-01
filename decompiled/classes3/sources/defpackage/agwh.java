package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class agwh implements aoxi {
    final /* synthetic */ aoot a;
    final /* synthetic */ aono b;
    final /* synthetic */ aonj c;
    final /* synthetic */ java.util.List d;
    final /* synthetic */ aoub e;
    final /* synthetic */ apdp f;
    final /* synthetic */ aows g;

    public agwh(apdp apdpVar, aoot aootVar, aono aonoVar, aonj aonjVar, java.util.List list, aoub aoubVar, aows aowsVar) {
        this.f = apdpVar;
        this.a = aootVar;
        this.b = aonoVar;
        this.c = aonjVar;
        this.d = list;
        this.e = aoubVar;
        this.g = aowsVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [aoub, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.List] */
    public final java.lang.Object a(java.lang.Object obj, aoln aolnVar) {
        defpackage.agwg agwgVar;
        apdp apdpVar;
        aoot aootVar;
        aono aonoVar;
        aonj aonjVar;
        aows aowsVar;
        java.lang.Object obj2;
        ?? r1;
        ?? r11;
        if (aolnVar instanceof defpackage.agwg) {
            agwgVar = (defpackage.agwg) aolnVar;
            int i = agwgVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                agwgVar.f = i - Integer.MIN_VALUE;
            } else {
                agwgVar = new defpackage.agwg(this, aolnVar);
            }
        } else {
            agwgVar = new defpackage.agwg(this, aolnVar);
        }
        java.lang.Object obj3 = agwgVar.d;
        aolu aoluVar = aolu.a;
        int i2 = agwgVar.f;
        if (i2 == 0) {
            aooc.af(obj3);
            apdpVar = this.f;
            aootVar = this.a;
            aonoVar = this.b;
            aonjVar = this.c;
            java.util.List list = this.d;
            aoub aoubVar = this.e;
            aowsVar = this.g;
            agwgVar.a = obj;
            agwgVar.h = apdpVar;
            agwgVar.g = aootVar;
            agwgVar.i = (defpackage.agwl) aonoVar;
            agwgVar.k = (defpackage.agkh) aonjVar;
            agwgVar.b = list;
            agwgVar.c = aoubVar;
            agwgVar.j = aowsVar;
            agwgVar.f = 1;
            if (apdpVar.b(agwgVar) == aoluVar) {
                return aoluVar;
            }
            obj2 = obj;
            r1 = list;
            r11 = aoubVar;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aowsVar = agwgVar.j;
            java.lang.Object obj4 = agwgVar.c;
            java.lang.Object obj5 = agwgVar.b;
            aonjVar = agwgVar.k;
            aonoVar = agwgVar.i;
            aootVar = agwgVar.g;
            apdpVar = agwgVar.h;
            obj2 = agwgVar.a;
            aooc.af(obj3);
            r1 = obj5;
            r11 = obj4;
        }
        try {
            defpackage.amdx amdxVar = (defpackage.amdx) aootVar.a;
            if (r11.t()) {
                if (!((java.lang.Boolean) aonjVar.a(obj2)).booleanValue()) {
                    amdxVar.a = aonoVar.a(amdxVar.a, obj2, java.lang.Boolean.TRUE);
                    if (!aowm.c(aowsVar.b(amdxVar.a))) {
                        throw new java.lang.IllegalStateException("Check failed.");
                    }
                } else {
                    if (!r1.contains(r11)) {
                        throw new java.lang.IllegalStateException("Check failed.");
                    }
                    for (aoub aoubVar2 = (aoub) r1.remove(0); !aooh.n(aoubVar2, (java.lang.Object) r11); aoubVar2 = (aoub) r1.remove(0)) {
                        aoubVar2.s((java.util.concurrent.CancellationException) null);
                    }
                    amdxVar.a = aonoVar.a(amdxVar.a, obj2, java.lang.Boolean.valueOf(!r1.isEmpty()));
                    if (!aowm.c(aowsVar.b(amdxVar.a))) {
                        throw new java.lang.IllegalStateException("Check failed.");
                    }
                    r11.s((java.util.concurrent.CancellationException) null);
                }
            }
            apdpVar.d();
            return aojh.a;
        } catch (java.lang.Throwable th) {
            apdpVar.d();
            throw th;
        }
    }
}
