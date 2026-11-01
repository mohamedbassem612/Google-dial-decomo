package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public class lou extends ajac {
    public aify a;

    public lou(java.lang.Iterable iterable) {
        aify aifyVarJ = aify.j(iterable);
        if (aifyVarJ.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Expected at least one future, got 0.");
        }
        this.a = aifyVarJ;
    }
}
