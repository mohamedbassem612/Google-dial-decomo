package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahkc extends anne {
    final ahqz a;
    final java.lang.String b;

    public ahkc(ajsz ajszVar, java.lang.String str, ahqz ahqzVar) {
        super(ajszVar);
        this.b = str;
        this.a = ahqzVar;
    }

    public final void a(anty antyVar, anph anphVar) {
        ahqz.c(this.a, new defpackage.acxq(this, antyVar, anphVar, 16)).run();
    }

    public final /* synthetic */ void b(anty antyVar, anph anphVar) {
        ahoq ahoqVarZ = ahvr.Z(1402, this.b);
        try {
            ajdd ajddVar = new ajdd();
            ahoqVarZ.a(ajddVar);
            super.a(new defpackage.ahkd(antyVar, ajddVar), anphVar);
            ahoqVarZ.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarZ.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
