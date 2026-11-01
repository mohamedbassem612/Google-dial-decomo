package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aomf extends defpackage.aomb {
    public aomf(defpackage.aoln aolnVar) {
        super(aolnVar);
        if (aolnVar != null && aolnVar.u() != defpackage.aols.a) {
            throw new java.lang.IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // defpackage.aoln
    public final defpackage.aolr u() {
        return defpackage.aols.a;
    }
}
