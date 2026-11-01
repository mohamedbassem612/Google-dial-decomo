package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wdu {
    public final defpackage.wee a;
    public final android.view.ViewGroup b;
    public final android.view.ViewGroup c;
    public final com.android.dialer.widget.bubble.impl.CheckableButton d;
    public final com.android.dialer.widget.bubble.impl.CheckableButton e;
    public final com.android.dialer.widget.bubble.impl.CheckableButton f;
    public final com.android.dialer.widget.bubble.impl.CheckableButton g;
    final /* synthetic */ wdx h;

    public wdu(final wdx wdxVar, android.content.Context context) {
        j$.util.Objects.requireNonNull(wdxVar);
        this.h = wdxVar;
        defpackage.wee weeVar = new defpackage.wee(context);
        this.a = weeVar;
        android.view.View viewInflate = android.view.LayoutInflater.from(weeVar.getContext()).inflate(2131624041, (android.view.ViewGroup) weeVar, true);
        this.b = (android.view.ViewGroup) viewInflate.findViewById(2131427620);
        this.c = (android.view.ViewGroup) viewInflate.findViewById(2131427614);
        this.d = (com.android.dialer.widget.bubble.impl.CheckableButton) viewInflate.findViewById(2131427612);
        this.e = (com.android.dialer.widget.bubble.impl.CheckableButton) viewInflate.findViewById(2131427613);
        this.f = (com.android.dialer.widget.bubble.impl.CheckableButton) viewInflate.findViewById(2131427610);
        this.g = (com.android.dialer.widget.bubble.impl.CheckableButton) viewInflate.findViewById(2131427611);
        weeVar.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: wdt
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                wdx wdxVar2 = wdxVar;
                if (wdxVar2.y != 3 || motionEvent.getActionMasked() != 4) {
                    return false;
                }
                int[] iArr = new int[2];
                wdx wdxVar3 = this.a.h;
                ((defpackage.wdw) wdxVar3.o.eZ()).b.getLocationOnScreen(iArr);
                if (motionEvent.getRawX() >= iArr[0] && motionEvent.getRawX() <= iArr[0] + ((defpackage.wdw) wdxVar3.o.eZ()).b.getWidth() && motionEvent.getRawY() >= iArr[1] && motionEvent.getRawY() <= iArr[1] + ((defpackage.wdw) wdxVar3.o.eZ()).b.getHeight()) {
                    return false;
                }
                wdx.a.b().l("com/android/dialer/widget/bubble/impl/BubbleImpl$MenuViewHolder", "<init>", 1179, "BubbleImpl.java").v("touch outside to collapse");
                wdxVar2.g(rmw.gr);
                wdxVar2.b(0, true);
                return true;
            }
        });
    }

    public final void a(boolean z) {
        wdx.a.b().l("com/android/dialer/widget/bubble/impl/BubbleImpl$MenuViewHolder", "setChildClickable", 1229, "BubbleImpl.java").y("clickable: %b", java.lang.Boolean.valueOf(z));
        this.d.setClickable(z);
        this.e.setClickable(z);
        this.f.setClickable(z);
        this.g.setClickable(z);
    }

    public final boolean b() {
        wdx.a.b().l("com/android/dialer/widget/bubble/impl/BubbleImpl$MenuViewHolder", "onBackInvokedInternal", 1208, "BubbleImpl.java").v("Enter");
        wdx wdxVar = this.h;
        if (wdxVar.m != 2 || wdxVar.y != 3) {
            return false;
        }
        wdxVar.g(rmw.gr);
        wdxVar.b(0, true);
        return true;
    }
}
