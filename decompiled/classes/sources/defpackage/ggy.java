package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ggy extends defpackage.aomh implements defpackage.aonj {
    final /* synthetic */ defpackage.gha a;
    final /* synthetic */ java.lang.String b;
    final /* synthetic */ defpackage.aonj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggy(defpackage.gha ghaVar, java.lang.String str, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        super(1, aolnVar);
        this.a = ghaVar;
        this.b = str;
        this.c = aonjVar;
    }

    @Override // defpackage.aonj
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.ggy(this.a, this.b, this.c, (defpackage.aoln) obj).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        defpackage.aooc.af(obj);
        defpackage.aonj aonjVar = this.c;
        defpackage.gin ginVarA = this.a.a.a(this.b);
        try {
            java.lang.Object objA = aonjVar.a(ginVarA);
            ginVarA.close();
            return objA;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    ginVarA.close();
                } catch (java.lang.Throwable th3) {
                    aoil.b(th, th3);
                }
                throw th2;
            }
        }
    }
}
