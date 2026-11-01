package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class afmg implements android.view.View.OnTouchListener {
    private final /* synthetic */ int $cid;

    public afmg(defpackage.afqy afqyVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(afqyVar);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int i = this.$cid;
        if (i != 0) {
            if (i != 1 || motionEvent.getAction() != 1) {
                return true;
            }
            view.performClick();
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setPressed(true);
        } else if (motionEvent.getAction() == 1) {
            view.performClick();
            view.setPressed(false);
        }
        return false;
    }
}
