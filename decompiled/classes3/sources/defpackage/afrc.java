package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afrc extends dye {
    final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetDragHandleView a;

    public afrc(com.google.android.material.bottomsheet.BottomSheetDragHandleView bottomSheetDragHandleView) {
        j$.util.Objects.requireNonNull(bottomSheetDragHandleView);
        this.a = bottomSheetDragHandleView;
    }

    public final void c(android.view.View view, ebd ebdVar) {
        java.lang.String string;
        super.c(view, ebdVar);
        com.google.android.material.bottomsheet.BottomSheetDragHandleView bottomSheetDragHandleView = this.a;
        if (bottomSheetDragHandleView.c()) {
            java.lang.CharSequence contentDescription = bottomSheetDragHandleView.getContentDescription();
            int i = bottomSheetDragHandleView.a.y;
            if (i == 3) {
                string = bottomSheetDragHandleView.getResources().getString(2132017605);
            } else if (i != 4) {
                string = i != 6 ? null : bottomSheetDragHandleView.getResources().getString(2132017606);
            } else {
                string = bottomSheetDragHandleView.getResources().getString(2132017604);
            }
            if (android.text.TextUtils.isEmpty(string)) {
                return;
            }
            if (!android.text.TextUtils.isEmpty(contentDescription)) {
                string = string + ". " + java.lang.String.valueOf(contentDescription);
            }
            ebdVar.w(string);
        }
    }

    public final void d(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.d(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            this.a.b();
        }
    }
}
