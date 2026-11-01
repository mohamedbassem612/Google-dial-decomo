package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ahal extends lf {
    final lf c;
    final /* synthetic */ defpackage.ahan d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahal(defpackage.ahan ahanVar, android.support.v7.widget.RecyclerView recyclerView) {
        super(recyclerView);
        j$.util.Objects.requireNonNull(ahanVar);
        this.d = ahanVar;
        this.c = recyclerView.Q;
    }

    private final int l() {
        return java.lang.Math.max(this.d.a(), -1);
    }

    public final void b(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        accessibilityEvent.setItemCount(l());
        accessibilityEvent.setFromIndex(accessibilityEvent.getFromIndex());
        accessibilityEvent.setToIndex(accessibilityEvent.getToIndex());
    }

    public final void c(android.view.View view, ebd ebdVar) {
        super.c(view, ebdVar);
        android.view.accessibility.AccessibilityNodeInfo.CollectionInfo collectionInfo = ebdVar.a.getCollectionInfo();
        ni niVar = collectionInfo != null ? new ni(collectionInfo) : null;
        ebdVar.u(ni.s(l(), niVar == null ? 1 : ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) niVar.a).getColumnCount(), niVar != null && ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) niVar.a).isHierarchical()));
    }
}
