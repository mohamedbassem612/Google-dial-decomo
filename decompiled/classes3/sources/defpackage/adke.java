package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class adke implements java.util.Comparator {
    public final /* synthetic */ int a;

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        adju adjuVar = (adju) obj;
        adju adjuVar2 = (adju) obj2;
        try {
            adjc adjcVarC = adjuVar.c();
            int iA = adjuVar.a();
            adjc adjcVarC2 = adjuVar2.c();
            int iA2 = adjuVar2.a();
            int iCompare = java.lang.Long.compare(adjcVarC.b(), adjcVarC2.b());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = java.lang.Long.compare(iA, iA2);
            if (iCompare2 != 0) {
                return iCompare2;
            }
            int iCompare3 = java.lang.Long.compare(adjcVarC.d(), adjcVarC2.d());
            if (iCompare3 != 0) {
                return iCompare3;
            }
            int i = this.a;
            return (i == 3 || i == 2) ? java.lang.Long.compare(adjuVar.b(), adjuVar2.b()) : java.lang.Long.compare(adjcVarC.e(), adjcVarC2.e());
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalStateException("Failed to get metadata", e);
        }
    }
}
