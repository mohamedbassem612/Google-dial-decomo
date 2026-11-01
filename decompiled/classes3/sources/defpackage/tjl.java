package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tjl extends dye {
    final /* synthetic */ com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView a;

    public tjl(com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView expandableSheetView) {
        j$.util.Objects.requireNonNull(expandableSheetView);
        this.a = expandableSheetView;
    }

    public final void c(android.view.View view, ebd ebdVar) {
        super.c(view, ebdVar);
        com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView expandableSheetView = this.a;
        if (expandableSheetView.f.getVisibility() == 0) {
            ebdVar.i(new ebc((java.lang.Object) null, 16, expandableSheetView.getResources().getText(2132017189), (ebo) null, (java.lang.Class) null));
        } else {
            ebdVar.i(new ebc((java.lang.Object) null, 16, expandableSheetView.getResources().getText(2132017190), (ebo) null, (java.lang.Class) null));
        }
    }
}
