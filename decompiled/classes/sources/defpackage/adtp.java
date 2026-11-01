package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class adtp extends defpackage.aomh implements defpackage.aonn {
    final /* synthetic */ defpackage.adtq a;
    final /* synthetic */ java.io.File b;
    final /* synthetic */ boolean c;
    final /* synthetic */ java.io.File d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adtp(defpackage.adtq adtqVar, java.io.File file, boolean z, java.io.File file2, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.a = adtqVar;
        this.b = file;
        this.c = z;
        this.d = file2;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.adtp) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.aooc.af(obj);
        defpackage.adtq adtqVar = this.a;
        java.io.File file = this.b;
        adtqVar.b(file, this.c);
        if (!file.exists()) {
            adtqVar.c(this.d);
        }
        return defpackage.aojh.a;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        return new defpackage.adtp(this.a, this.b, this.c, this.d, aolnVar);
    }
}
