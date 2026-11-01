package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class efz extends defpackage.aomh implements defpackage.aonn {
    java.lang.Object a;
    int b;
    /* synthetic */ java.lang.Object c;
    final /* synthetic */ defpackage.aonn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efz(defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.d = aonnVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.efz) c((defpackage.efx) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.efx efxVar = (defpackage.efx) this.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        if (this.b != 0) {
            java.lang.Object obj2 = this.a;
            defpackage.aooc.af(obj);
            return obj2;
        }
        defpackage.aooc.af(obj);
        defpackage.efx efxVar2 = new defpackage.efx(defpackage.ajsz.aT(efxVar.b()), false);
        defpackage.aonn aonnVar = this.d;
        this.c = null;
        this.a = efxVar2;
        this.b = 1;
        return aonnVar.a(efxVar2, this) != aoluVar ? efxVar2 : aoluVar;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.efz efzVar = new defpackage.efz(this.d, aolnVar);
        efzVar.c = obj;
        return efzVar;
    }
}
