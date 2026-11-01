package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahsl extends defpackage.aftt {
    final /* synthetic */ java.lang.String a = "deleteContactUndoSnackbar.addCallback";
    final /* synthetic */ defpackage.aftt b;
    final /* synthetic */ defpackage.uzx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahsl(defpackage.uzx uzxVar, defpackage.aftt afttVar) {
        super(null);
        this.b = afttVar;
        j$.util.Objects.requireNonNull(uzxVar);
        this.c = uzxVar;
    }

    @Override // defpackage.aftt
    public final /* synthetic */ void a(java.lang.Object obj, int i) {
        if (ahns.q()) {
            this.b.a(obj, i);
            return;
        }
        defpackage.uzx uzxVar = this.c;
        ahok ahokVarF = ((ahpz) uzxVar.a).f(1477, this.a);
        try {
            this.b.a(obj, i);
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aftt
    public final /* synthetic */ void b(java.lang.Object obj) {
        if (ahns.q()) {
            return;
        }
        defpackage.uzx uzxVar = this.c;
        ((ahpz) uzxVar.a).f(1478, this.a).close();
    }
}
