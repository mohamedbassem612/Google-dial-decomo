package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ktz implements android.view.View.OnClickListener, android.view.View.OnTouchListener {
    public final defpackage.kty a;
    public final int[] b = {2131428759, 2131428760, 2131428761, 2131428762, 2131428763};

    public ktz(defpackage.kty ktyVar) {
        this.a = ktyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        defpackage.kth kthVarY = this.a.G().y();
        if (view.getId() == 2131428759 || view.getId() == 2131428760 || view.getId() == 2131428761) {
            defpackage.kth.a.b().l("com/android/dialer/callqualityrating/impl/CallQualityRatingActivityPeer", "onBadCallRatingSelected", 195, "CallQualityRatingActivityPeer.java").v("Bad rating selected");
            kthVarY.c.getIntent().putExtra("rating", 1);
            kthVarY.f();
        } else if (view.getId() == 2131428762 || view.getId() == 2131428763) {
            kthVarY.c();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.app.Dialog dialog = this.a.d;
        if (motionEvent.getAction() == 0) {
            for (int i = 0; i < 5; i++) {
                int id = view.getId();
                int[] iArr = this.b;
                if (id == iArr[i]) {
                    for (int i2 = i; i2 >= 0; i2--) {
                        android.widget.ImageView imageView = (android.widget.ImageView) dialog.findViewById(iArr[i2]);
                        ahvr.ci(imageView);
                        imageView.setImageResource(2131231996);
                    }
                }
            }
        } else if (motionEvent.getAction() == 1) {
            int[] iArr2 = this.b;
            for (int i3 = 0; i3 < 5; i3++) {
                android.widget.ImageView imageView2 = (android.widget.ImageView) dialog.findViewById(iArr2[i3]);
                ahvr.ci(imageView2);
                imageView2.setImageResource(2131231997);
            }
            view.performClick();
        }
        return false;
    }
}
