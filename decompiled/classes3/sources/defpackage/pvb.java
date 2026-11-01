package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class pvb extends aijz {
    public pvb(defpackage.pvf pvfVar) {
        j$.util.Objects.requireNonNull(pvfVar);
    }

    public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.pvc pvcVar = (defpackage.pvc) obj;
        defpackage.pvc pvcVar2 = (defpackage.pvc) obj2;
        return aieh.b.d(pvcVar.c(), pvcVar2.c(), j$.util.Comparator.-CC.nullsLast(j$.util.Comparator.-CC.naturalOrder())).c(pvcVar.a, pvcVar2.a).a();
    }
}
