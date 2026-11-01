package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ros extends defpackage.aomh implements defpackage.aonn {
    final /* synthetic */ boolean a;
    final /* synthetic */ defpackage.rpa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ros(boolean z, defpackage.rpa rpaVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.a = z;
        this.b = rpaVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.ros) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.aooc.af(obj);
        defpackage.rpa rpaVar = this.b;
        defpackage.rol rolVar = rpaVar.j;
        if (this.a != rolVar.c) {
            rpaVar.j = defpackage.rol.a(rolVar, false, false, true, 3);
            rpaVar.o.s(defpackage.ajcm.a, defpackage.rpl.a);
        }
        return defpackage.aojh.a;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        return new defpackage.ros(this.a, this.b, aolnVar);
    }
}
