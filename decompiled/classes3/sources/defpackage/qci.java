package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qci {
    public static final aimz a = aimz.i("com/android/dialer/incall/onhold/ui/OnHoldViewPeer");
    public static final android.view.animation.Interpolator b = new android.view.animation.AccelerateInterpolator();
    public static final android.view.animation.Interpolator c = new android.view.animation.DecelerateInterpolator();
    public final com.android.dialer.incall.onhold.ui.OnHoldView d;
    public final android.view.ViewGroup e;
    public final android.widget.TextView f;
    public final android.widget.ImageView g;
    public final float h;
    public boolean i = false;

    public qci(com.android.dialer.incall.onhold.ui.OnHoldView onHoldView) {
        this.d = onHoldView;
        com.android.dialer.incall.onhold.ui.OnHoldView.inflate(onHoldView.getContext(), 2131624278, onHoldView);
        this.e = (android.view.ViewGroup) onHoldView.findViewById(2131428340);
        this.f = (android.widget.TextView) onHoldView.findViewById(2131428339);
        this.g = (android.widget.ImageView) onHoldView.findViewById(2131428342);
        this.h = onHoldView.getContext().getResources().getDimension(2131166177);
    }
}
