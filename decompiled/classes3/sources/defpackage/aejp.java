package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aejp extends kh {
    private final android.content.Context a;
    private final aify e;
    private final defpackage.aelt f;
    private final int g;

    public aejp(android.content.Context context, aify aifyVar, defpackage.aelt aeltVar, int i) {
        ahvr.ci(context);
        this.a = context;
        this.e = aifyVar;
        this.f = aeltVar;
        this.g = i;
    }

    public final int a() {
        return this.e.d;
    }

    public final /* bridge */ /* synthetic */ ld d(android.view.ViewGroup viewGroup, int i) {
        defpackage.aejh aejhVar = new defpackage.aejh(this.a, this.f, viewGroup);
        android.view.View view = aejhVar.a;
        int i2 = dzs.a;
        int paddingStart = view.getPaddingStart();
        int i3 = this.g;
        view.setPaddingRelative(paddingStart + i3, view.getPaddingTop(), view.getPaddingEnd() + i3, view.getPaddingBottom());
        return aejhVar;
    }

    public final /* synthetic */ void m(ld ldVar, int i) {
        defpackage.aejh aejhVar = (defpackage.aejh) ldVar;
        defpackage.aejg aejgVar = (defpackage.aejg) this.e.get(i);
        com.google.android.libraries.onegoogle.actions.SimpleActionView simpleActionView = aejhVar.w;
        simpleActionView.a = ahyn.h(java.lang.Integer.valueOf(aejgVar.d));
        simpleActionView.b(aejhVar.v);
        android.graphics.drawable.Drawable drawable = aejgVar.a;
        if (drawable != null) {
            android.widget.ImageView imageView = aejhVar.s;
            aehj.k(drawable, aejhVar.u);
            imageView.setImageDrawable(drawable);
        } else {
            android.widget.ImageView imageView2 = aejhVar.s;
            android.content.Context context = imageView2.getContext();
            int i2 = aejgVar.b;
            int i3 = aejhVar.u;
            android.graphics.drawable.Drawable drawableBO = den.bO(context, i2);
            aehj.k(drawableBO, i3);
            imageView2.setImageDrawable(drawableBO);
        }
        aejhVar.t.setText(aejgVar.c);
        aejhVar.a.setOnClickListener(new defpackage.wgf(aejhVar, aejgVar, 6, null));
    }

    public final /* synthetic */ void q(ld ldVar) {
        defpackage.aejh aejhVar = (defpackage.aejh) ldVar;
        com.google.android.libraries.onegoogle.actions.SimpleActionView simpleActionView = aejhVar.w;
        simpleActionView.d(aejhVar.v);
        simpleActionView.a = ahwt.a;
    }
}
