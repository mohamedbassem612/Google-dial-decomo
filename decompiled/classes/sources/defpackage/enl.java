package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class enl extends defpackage.aomh implements defpackage.aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.ems d;
    final /* synthetic */ defpackage.emq e;
    final /* synthetic */ defpackage.aoss f;
    final /* synthetic */ defpackage.aonn g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enl(defpackage.ems emsVar, defpackage.emq emqVar, defpackage.aoss aossVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.d = emsVar;
        this.e = emqVar;
        this.f = aossVar;
        this.g = aonnVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.enl) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0076  */
    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:39:? A[SYNTHETIC] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.lang.Object obj2;
        java.lang.Object obj3;
        defpackage.aoub aoubVar;
        defpackage.emv emvVar;
        java.lang.Object obj4;
        defpackage.aoub aoubVar2;
        defpackage.emv emvVar2;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        if (this.c != 0) {
            java.lang.Object obj5 = this.b;
            obj2 = this.a;
            try {
                defpackage.aooc.af(obj);
                obj4 = obj5;
                aoubVar2 = (defpackage.aoub) ((defpackage.aoot) obj2).a;
                if (aoubVar2 != null) {
                    aoubVar2.s(null);
                }
                emvVar2 = (defpackage.emv) ((defpackage.aoot) obj4).a;
                if (emvVar2 != null) {
                    this.d.d(emvVar2);
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                obj3 = obj5;
                aoubVar = (defpackage.aoub) ((defpackage.aoot) obj2).a;
                if (aoubVar != null) {
                    aoubVar.s(null);
                }
                emvVar = (defpackage.emv) ((defpackage.aoot) obj3).a;
                if (emvVar != null) {
                    throw th;
                }
                this.d.d(emvVar);
                throw th;
            }
        } else {
            defpackage.aooc.af(obj);
            defpackage.ems emsVar = this.d;
            if (emsVar.a() != defpackage.emq.a) {
                defpackage.aoot aootVar = new defpackage.aoot();
                defpackage.aoot aootVar2 = new defpackage.aoot();
                try {
                    defpackage.emq emqVar = this.e;
                    defpackage.aoss aossVar = this.f;
                    defpackage.aonn aonnVar = this.g;
                    this.a = aootVar;
                    this.b = aootVar2;
                    this.c = 1;
                    defpackage.aosc aoscVar = new defpackage.aosc(defpackage.ajsz.ap(this), 1);
                    aoscVar.z();
                    defpackage.emo emoVar = defpackage.emp.Companion;
                    aootVar2.a = new defpackage.enk(defpackage.emo.c(emqVar), aootVar, aossVar, defpackage.emo.a(emqVar), aoscVar, new defpackage.apdp(), aonnVar);
                    java.lang.Object obj6 = aootVar2.a;
                    if (obj6 == null) {
                        defpackage.aooh.h("null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                    }
                    emsVar.c((defpackage.emv) obj6);
                    if (aoscVar.k() == aoluVar) {
                        return aoluVar;
                    }
                    obj2 = aootVar;
                    obj4 = aootVar2;
                    aoubVar2 = (defpackage.aoub) ((defpackage.aoot) obj2).a;
                    if (aoubVar2 != null) {
                        aoubVar2.s(null);
                    }
                    emvVar2 = (defpackage.emv) ((defpackage.aoot) obj4).a;
                    if (emvVar2 != null) {
                        this.d.d(emvVar2);
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    obj2 = aootVar;
                    obj3 = aootVar2;
                    aoubVar = (defpackage.aoub) ((defpackage.aoot) obj2).a;
                    if (aoubVar != null) {
                        aoubVar.s(null);
                    }
                    emvVar = (defpackage.emv) ((defpackage.aoot) obj3).a;
                    if (emvVar != null) {
                        throw th;
                    }
                    this.d.d(emvVar);
                    throw th;
                }
            }
        }
        return defpackage.aojh.a;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        return new defpackage.enl(this.d, this.e, this.f, this.g, aolnVar);
    }
}
