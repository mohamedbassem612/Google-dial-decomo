package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class eet extends defpackage.aomh implements defpackage.aonj {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ java.lang.Object d;
    final /* synthetic */ defpackage.eem e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eet(defpackage.eem eemVar, java.lang.Object obj, defpackage.aoln aolnVar) {
        super(1, aolnVar);
        this.e = eemVar;
        this.d = obj;
    }

    @Override // defpackage.aonj
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.eet(this.e, this.d, (defpackage.aoln) obj).b(defpackage.aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        ?? r1;
        java.lang.Throwable th;
        java.lang.Object obj2;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        try {
            if (this.c != 0) {
                obj2 = this.b;
                r1 = this.a;
                try {
                    defpackage.aooc.af(obj);
                    r1 = r1;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (java.lang.Throwable th3) {
                        defpackage.ajsz.ak(r1, th);
                        throw th3;
                    }
                }
            } else {
                defpackage.aooc.af(obj);
                defpackage.eem eemVar = this.e;
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(eemVar.a);
                java.lang.Object obj3 = this.d;
                try {
                    defpackage.efa efaVar = eemVar.b;
                    defpackage.efh efhVar = new defpackage.efh(fileOutputStream);
                    this.a = fileOutputStream;
                    this.b = fileOutputStream;
                    this.c = 1;
                    if (efaVar.c(obj3, efhVar) == aoluVar) {
                        return aoluVar;
                    }
                    obj2 = fileOutputStream;
                    r1 = obj2;
                } catch (java.lang.Throwable th4) {
                    r1 = fileOutputStream;
                    th = th4;
                    throw th;
                }
            }
            ((java.io.FileOutputStream) obj2).getFD().sync();
            defpackage.ajsz.ak(r1, null);
            return defpackage.aojh.a;
        } catch (java.lang.Exception e) {
            if (e instanceof java.io.FileNotFoundException) {
                throw dzr.j(this.e.a.getParent(), e);
            }
            throw e;
        }
    }
}
