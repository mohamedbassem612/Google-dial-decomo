package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qhl extends defpackage.ahao {
    private android.content.res.ColorStateList a;
    private android.content.res.ColorStateList b;
    private android.content.res.ColorStateList c;
    private android.content.res.ColorStateList d;
    private final android.content.Context e;
    private final ops f;

    public qhl(android.content.Context context, ops opsVar) {
        this.e = context;
        this.f = opsVar;
    }

    @Override // defpackage.ahao
    public final android.view.View a(android.view.ViewGroup viewGroup) {
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624409, viewGroup, false);
        viewInflate.setTag(2131428822, new defpackage.qhr(viewInflate));
        android.content.res.TypedArray typedArrayObtainStyledAttributes = viewInflate.getContext().obtainStyledAttributes(defpackage.qgv.a);
        try {
            this.a = typedArrayObtainStyledAttributes.getColorStateList(6);
            this.b = typedArrayObtainStyledAttributes.getColorStateList(5);
            this.c = typedArrayObtainStyledAttributes.getColorStateList(8);
            this.d = typedArrayObtainStyledAttributes.getColorStateList(7);
            return viewInflate;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // defpackage.ahao
    public final /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        android.content.res.ColorStateList colorStateList;
        int i;
        defpackage.qgp qgpVar = (defpackage.qgp) obj;
        int iAN = a.aN(qgpVar.e);
        int i2 = 4;
        if (iAN == 0 || iAN != 4) {
            defpackage.qhr qhrVar = (defpackage.qhr) view.getTag(2131428822);
            android.widget.TextView textView = (android.widget.TextView) qhrVar.b;
            textView.setText(qgpVar.c);
            android.view.View view2 = (android.view.View) qhrVar.a;
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) view2.getLayoutParams();
            int iAN2 = a.aN(qgpVar.e);
            int i3 = 8388613;
            if (iAN2 != 0 && iAN2 == 3) {
                i3 = 8388611;
            }
            layoutParams.gravity = i3;
            boolean z = qgpVar.f;
            android.content.Context context = this.e;
            layoutParams.topMargin = z ? context.getResources().getDimensionPixelSize(2131167337) : context.getResources().getDimensionPixelSize(2131167340);
            view2.setLayoutParams(layoutParams);
            int iAN3 = a.aN(qgpVar.e);
            textView.setEnabled(iAN3 != 0 && iAN3 == 3);
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(2131428819);
            int iAN4 = a.aN(qgpVar.e);
            if (iAN4 == 0 || iAN4 != 3) {
                imageView.setVisibility(8);
            } else if ((qgpVar.b & 32) != 0) {
                imageView.setVisibility(0);
                ops opsVar = this.f;
                defpackage.abwd abwdVar = qgpVar.h;
                if (abwdVar == null) {
                    abwdVar = defpackage.abwd.a;
                }
                opsVar.f(imageView, abwdVar, false);
            } else {
                imageView.setVisibility(4);
            }
            textView.setBackgroundTintList(null);
            int iAN5 = a.aN(qgpVar.e);
            if (iAN5 == 0) {
                iAN5 = 1;
            }
            int i4 = iAN5 - 1;
            if (i4 == 1) {
                colorStateList = qgpVar.d ? this.b : this.a;
            } else {
                if (i4 != 2) {
                    throw new java.lang.IllegalStateException("Should only style for MessageTypes LOCAL and REMOTE");
                }
                colorStateList = qgpVar.d ? this.d : this.c;
            }
            if (qgpVar.f) {
                if (qgpVar.g) {
                    int iAN6 = a.aN(qgpVar.e);
                    i2 = (iAN6 == 0 || iAN6 != 3) ? 1 : 2;
                } else {
                    int iAN7 = a.aN(qgpVar.e);
                    if (iAN7 == 0 || iAN7 != 3) {
                        i2 = 3;
                    }
                }
            } else if (qgpVar.g) {
                int iAN8 = a.aN(qgpVar.e);
                i2 = 7;
                if (iAN8 != 0 && iAN8 == 3) {
                    i2 = 8;
                }
            } else {
                int iAN9 = a.aN(qgpVar.e);
                i2 = 5;
                if (iAN9 != 0 && iAN9 == 3) {
                    i2 = 6;
                }
            }
            switch (i2 - 1) {
                case 0:
                    i = !qgpVar.d ? 2131231795 : 2131231794;
                    break;
                case 1:
                    i = !qgpVar.d ? 2131232078 : 2131232077;
                    break;
                case 2:
                    i = !qgpVar.d ? 2131231798 : 2131231797;
                    break;
                case 3:
                    i = !qgpVar.d ? 2131232081 : 2131232080;
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    i = !qgpVar.d ? 2131231793 : 2131231792;
                    break;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    i = !qgpVar.d ? 2131232076 : 2131232075;
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    i = !qgpVar.d ? 2131231790 : 2131231789;
                    break;
                default:
                    i = !qgpVar.d ? 2131232073 : 2131232072;
                    break;
            }
            textView.setBackgroundResource(i);
            textView.setTextColor(colorStateList);
            textView.setTypeface(qgpVar.d ? android.graphics.Typeface.DEFAULT : android.graphics.Typeface.DEFAULT_BOLD);
        }
    }
}
