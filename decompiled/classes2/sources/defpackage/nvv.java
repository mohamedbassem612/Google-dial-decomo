package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class nvv extends aomh implements aonn {
    int a;
    final /* synthetic */ android.telephony.ims.ImsMmTelManager b;
    final /* synthetic */ defpackage.nvw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nvv(android.telephony.ims.ImsMmTelManager imsMmTelManager, defpackage.nvw nvwVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = imsMmTelManager;
        this.c = nvwVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i != 0) {
            return obj;
        }
        android.telephony.ims.ImsMmTelManager imsMmTelManager = this.b;
        defpackage.nvw nvwVar = this.c;
        this.a = 1;
        aosc aoscVar = new aosc(ajsz.ap(this), 1);
        aoscVar.z();
        baa$.ExternalSyntheticApiModelOutline1.m(imsMmTelManager, nvwVar.f, new defpackage.nvu(aoscVar));
        java.lang.Object objK = aoscVar.k();
        return objK == aoluVar ? aoluVar : objK;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.nvv(this.b, this.c, aolnVar);
    }
}
