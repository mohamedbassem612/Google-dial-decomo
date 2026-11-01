package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abpc extends android.support.v7.widget.GridLayoutManager {
    private final int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abpc(android.content.Context context, int i) {
        super(i);
        aooh.f(context, "context");
        this.G = i;
    }

    protected final boolean ak() {
        return !super.ak();
    }

    @Override // android.support.v7.widget.GridLayoutManager
    public final void eJ(kt ktVar, la laVar, android.view.View view, defpackage.ebd ebdVar) {
        aooh.f(ktVar, "recycler");
        aooh.f(laVar, "state");
        aooh.f(view, "host");
        super.eJ(ktVar, laVar, view, ebdVar);
        android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = ebdVar.a.getCollectionItemInfo();
        defpackage.ni niVar = collectionItemInfo != null ? new defpackage.ni(collectionItemInfo) : null;
        if (niVar != null) {
            int iEE = eE(ktVar, laVar) - 1;
            android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo2 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) niVar.a;
            ebdVar.v(defpackage.ni.r(iEE - collectionItemInfo2.getRowIndex(), collectionItemInfo2.getRowSpan(), (this.G - 1) - collectionItemInfo2.getColumnIndex(), collectionItemInfo2.getColumnSpan(), collectionItemInfo2.isHeading(), collectionItemInfo2.isSelected()));
        }
    }
}
