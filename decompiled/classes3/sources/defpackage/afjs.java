package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afjs {
    public static final /* synthetic */ int a = 0;
    private static final android.graphics.Rect b = new android.graphics.Rect();

    public static int a(android.content.Context context) {
        android.content.res.Configuration configuration = context.getResources().getConfiguration();
        if (configuration.smallestScreenWidthDp >= 411) {
            return f(context, 2131167837);
        }
        if (configuration.smallestScreenWidthDp >= 380) {
            return f(context, 2131167836);
        }
        if (configuration.smallestScreenWidthDp >= 320) {
            return f(context, 2131167835);
        }
        return configuration.smallestScreenWidthDp >= 240 ? f(context, 2131167834) : f(context, 2131167833);
    }

    public static int b(android.view.ViewGroup viewGroup, android.view.View view, int i, int i2, android.view.View view2, android.view.View view3, boolean z) {
        if (viewGroup == view) {
            throw new java.lang.IllegalStateException("contentView should be the single child of containerViewGroup");
        }
        if (viewGroup.getChildCount() == 0) {
            return i2;
        }
        int measuredHeight = 0;
        view.measure(i, 0);
        int measuredHeight2 = view.getMeasuredHeight();
        if (z) {
            return android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
        }
        android.content.res.Resources resources = view.getContext().getResources();
        android.graphics.Rect rect = b;
        view.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height();
        int dimensionPixelSize = resources.getDimensionPixelSize(2131167810);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(2131167815);
        if (view3 != null) {
            aehj aehjVar = afjy.c;
            android.content.Context context = afjy.b;
            measuredHeight = afjy.b(true) ? view3.getMeasuredHeight() : view3.getHeight();
        }
        int height = iHeight - view2.getHeight();
        int i3 = (dimensionPixelSize2 << 1) + measuredHeight;
        if (measuredHeight2 + i3 > iHeight && height - i3 > dimensionPixelSize) {
            measuredHeight2 = iHeight - i3;
        }
        return android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
    }

    public static void c(android.widget.ImageView imageView, java.lang.Integer num) {
        if (num == null || num.intValue() == 0) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageResource(num.intValue());
            imageView.setVisibility(0);
        }
    }

    public static boolean d(android.content.Context context) {
        return ((android.app.UiModeManager) context.getSystemService("uimode")).getCurrentModeType() == 3;
    }

    public static void e(final android.view.View view, final android.view.View view2, final int i, final int i2) {
        view.post(new java.lang.Runnable() { // from class: afjr
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = defpackage.afjs.a;
                android.graphics.Rect rect = new android.graphics.Rect();
                android.view.View view3 = view2;
                view3.getHitRect(rect);
                rect.top -= 2131167813;
                rect.left = rect.left;
                rect.right += i;
                rect.bottom += i2;
                view.setTouchDelegate(new android.view.TouchDelegate(rect, view3));
            }
        });
    }

    private static int f(android.content.Context context, int i) {
        return context.getResources().getDimensionPixelOffset(i);
    }
}
