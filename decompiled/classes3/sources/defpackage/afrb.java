package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afrb extends android.view.GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetDragHandleView a;

    public afrb(com.google.android.material.bottomsheet.BottomSheetDragHandleView bottomSheetDragHandleView) {
        j$.util.Objects.requireNonNull(bottomSheetDragHandleView);
        this.a = bottomSheetDragHandleView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.a.a;
        if (bottomSheetBehavior == null || !bottomSheetBehavior.v) {
            return super.onDoubleTap(motionEvent);
        }
        bottomSheetBehavior.t(5);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(android.view.MotionEvent motionEvent) {
        return this.a.isClickable();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(android.view.MotionEvent motionEvent) {
        this.a.performLongClick(motionEvent.getX(), motionEvent.getY());
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        return this.a.b();
    }
}
