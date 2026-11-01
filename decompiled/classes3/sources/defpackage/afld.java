package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class afld implements android.view.View.OnTouchListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ android.view.View a;
    public final /* synthetic */ android.view.View b;
    public final /* synthetic */ android.view.View c;

    public /* synthetic */ afld(defpackage.aflh aflhVar, android.widget.FrameLayout frameLayout, android.widget.ImageView imageView, int i) {
        this.$cid = i;
        this.a = aflhVar;
        this.b = frameLayout;
        this.c = imageView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        if (this.$cid != 0) {
            if (motionEvent.getAction() != 1) {
                return false;
            }
            if (motionEvent.getX() >= 0.0f) {
                android.widget.CheckBox checkBox = (android.widget.CheckBox) this.c;
                if (motionEvent.getX() < checkBox.getWidth() && motionEvent.getY() >= 0.0f) {
                    if (motionEvent.getY() < this.b.getHeight()) {
                        checkBox.performClick();
                        return false;
                    }
                }
            }
            android.view.View view2 = this.a;
            ((android.widget.EditText) view2).requestFocus();
            afjz.i(view2);
            return false;
        }
        int action = motionEvent.getAction();
        android.view.View view3 = this.c;
        android.view.View view4 = this.b;
        android.view.View view5 = this.a;
        if (action != 0) {
            if (action == 1) {
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view4;
                if (frameLayout.isPressed()) {
                    frameLayout.performClick();
                }
            } else {
                if (action != 2) {
                    return false;
                }
                if (!defpackage.aflh.f(motionEvent, view)) {
                    ((android.widget.FrameLayout) view4).setPressed(false);
                    defpackage.aflh aflhVar = (defpackage.aflh) view5;
                    aehj.J((android.widget.ImageView) view3, aflhVar.getContext(), aflhVar.b(2131102937));
                }
            }
        } else if (defpackage.aflh.f(motionEvent, view)) {
            ((android.widget.FrameLayout) view4).setPressed(true);
            defpackage.aflh aflhVar2 = (defpackage.aflh) view5;
            aehj.J((android.widget.ImageView) view3, aflhVar2.getContext(), aflhVar2.a());
        }
        return true;
    }

    public /* synthetic */ afld(android.widget.CheckBox checkBox, android.view.View view, android.widget.EditText editText, int i) {
        this.$cid = i;
        this.c = checkBox;
        this.b = view;
        this.a = editText;
    }
}
