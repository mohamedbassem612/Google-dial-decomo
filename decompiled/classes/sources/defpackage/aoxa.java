package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoxa extends defpackage.aoxe {
    private final defpackage.aonn d;

    public /* synthetic */ aoxa(defpackage.aonn aonnVar) {
        this(aonnVar, defpackage.aols.a, -2, 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.aoxe, defpackage.aozv
    public final java.lang.Object b(defpackage.aows aowsVar, defpackage.aoln aolnVar) {
        defpackage.aowz aowzVar;
        if (aolnVar instanceof defpackage.aowz) {
            aowzVar = (defpackage.aowz) aolnVar;
            int i = aowzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aowzVar.c = i - Integer.MIN_VALUE;
            } else {
                aowzVar = new defpackage.aowz(this, aolnVar);
            }
        } else {
            aowzVar = new defpackage.aowz(this, aolnVar);
        }
        java.lang.Object obj = aowzVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aowzVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            aowzVar.d = aowsVar;
            aowzVar.c = 1;
            if (defpackage.aoxe.g(this, aowsVar, aowzVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aowsVar = aowzVar.d;
            defpackage.aooc.af(obj);
        }
        if (aowsVar.b.f()) {
            return defpackage.aojh.a;
        }
        throw new java.lang.IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override // defpackage.aoxe, defpackage.aozv
    protected final defpackage.aozv c(defpackage.aolr aolrVar, int i, int i2) {
        return new defpackage.aoxa(this.d, aolrVar, i, i2);
    }

    public aoxa(defpackage.aonn aonnVar, defpackage.aolr aolrVar, int i, int i2) {
        super(aonnVar, aolrVar, i, i2);
        this.d = aonnVar;
    }
}
