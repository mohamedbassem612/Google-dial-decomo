package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahgz extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ emq d;
    final /* synthetic */ ems e;
    final /* synthetic */ aonn f;
    private /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahgz(emq emqVar, ems emsVar, aonn aonnVar, aoln aolnVar) {
        super(2, aolnVar);
        this.d = emqVar;
        this.e = emsVar;
        this.f = aonnVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0075  */
    /* JADX WARN: Code duplicated, block: B:18:0x0080  */
    /* JADX WARN: Code duplicated, block: B:25:0x0093  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:35:? A[SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.lang.Object obj2;
        java.lang.Object obj3;
        aoub aoubVar;
        emv emvVar;
        java.lang.Object obj4;
        aoub aoubVar2;
        emv emvVar2;
        aolu aoluVar = aolu.a;
        if (this.c != 0) {
            java.lang.Object obj5 = this.b;
            obj2 = this.a;
            try {
                aooc.af(obj);
                obj4 = obj5;
                aoubVar2 = (aoub) ((aoot) obj2).a;
                if (aoubVar2 != null) {
                    aoubVar2.s((java.util.concurrent.CancellationException) null);
                }
                emvVar2 = (emv) ((aoot) obj4).a;
                if (emvVar2 != null) {
                    this.e.d(emvVar2);
                }
                return aojh.a;
            } catch (java.lang.Throwable th2) {
                th = th2;
                obj3 = obj5;
                aoubVar = (aoub) ((aoot) obj2).a;
                if (aoubVar != null) {
                    aoubVar.s((java.util.concurrent.CancellationException) null);
                }
                emvVar = (emv) ((aoot) obj3).a;
                if (emvVar != null) {
                    throw th;
                }
                this.e.d(emvVar);
                throw th;
            }
        }
        aooc.af(obj);
        aoss aossVar = (aoss) this.g;
        aoot aootVar = new aoot();
        aoot aootVar2 = new aoot();
        try {
            emq emqVar = this.d;
            ems emsVar = this.e;
            aonn aonnVar = this.f;
            this.g = aossVar;
            this.a = aootVar;
            this.b = aootVar2;
            this.c = 1;
            aosc aoscVar = new aosc(ajsz.ap(this), 1);
            aoscVar.z();
            emo emoVar = emp.Companion;
            aootVar2.a = new defpackage.ahgy(emo.c(emqVar), aootVar, aossVar, emo.a(emqVar), aoscVar, new apdp(), aonnVar);
            java.lang.Object obj6 = aootVar2.a;
            aooh.d(obj6, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
            emsVar.c((emv) obj6);
            if (aoscVar.k() == aoluVar) {
                return aoluVar;
            }
            obj2 = aootVar;
            obj4 = aootVar2;
            aoubVar2 = (aoub) ((aoot) obj2).a;
            if (aoubVar2 != null) {
                aoubVar2.s((java.util.concurrent.CancellationException) null);
            }
            emvVar2 = (emv) ((aoot) obj4).a;
            if (emvVar2 != null) {
                this.e.d(emvVar2);
            }
            return aojh.a;
        } catch (java.lang.Throwable th3) {
            th = th3;
            obj2 = aootVar;
            obj3 = aootVar2;
            aoubVar = (aoub) ((aoot) obj2).a;
            if (aoubVar != null) {
                aoubVar.s((java.util.concurrent.CancellationException) null);
            }
            emvVar = (emv) ((aoot) obj3).a;
            if (emvVar != null) {
                throw th;
            }
            this.e.d(emvVar);
            throw th;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.ahgz ahgzVar = new defpackage.ahgz(this.d, this.e, this.f, aolnVar);
        ahgzVar.g = obj;
        return ahgzVar;
    }
}
