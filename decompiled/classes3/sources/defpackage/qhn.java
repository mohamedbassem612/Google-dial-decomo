package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qhn {
    private static final aimz a = aimz.i("com/android/dialer/incall/rtt/ui/RttEmergencyButtonFactory");
    private final android.content.Context b;

    public qhn(android.content.Context context) {
        this.b = context;
    }

    final void a(aw awVar, com.google.android.flexbox.FlexboxLayout flexboxLayout, ahoz ahozVar, android.view.View.OnClickListener onClickListener) {
        android.content.Context context = this.b;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, context.getResources().getDimensionPixelSize(2131167345));
        layoutParams.setMargins(0, context.getResources().getDimensionPixelSize(2131167347), 0, 0);
        layoutParams.setMarginEnd(context.getResources().getDimensionPixelSize(2131167346));
        hj hjVar = new hj(new android.view.ContextThemeWrapper(awVar.z(), 2132083577), (android.util.AttributeSet) null, 0);
        hjVar.setLayoutParams(layoutParams);
        hjVar.setText(context.getResources().getString(ahozVar.a));
        try {
            hjVar.setCompoundDrawablesRelativeWithIntrinsicBounds(context.getDrawable(ahozVar.b), (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        } catch (android.content.res.Resources.NotFoundException e) {
            a.bq(a.d(), "Icon not found.", "com/android/dialer/incall/rtt/ui/RttEmergencyButtonFactory", "addRttEmergencyButtonToView", 'Q', "RttEmergencyButtonFactory.java", e, zct.b);
        }
        hjVar.setOnClickListener(onClickListener);
        flexboxLayout.addView(hjVar);
    }
}
