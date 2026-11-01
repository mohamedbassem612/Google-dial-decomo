package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aggp {
    public int a;
    public int b;
    public int c;
    private final android.content.Context d;
    private int e;
    private float[] f;

    public aggp(android.content.Context context) {
        aooh.f(context, "context");
        this.d = context;
        this.e = 2;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{android.R.attr.colorPrimary});
        aooh.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int color = typedArrayObtainStyledAttributes.getColor(0, -65281);
        typedArrayObtainStyledAttributes.recycle();
        this.c = color;
    }

    public final android.graphics.drawable.Drawable a() {
        if (this.f == null) {
            b(this.e);
        }
        float[] fArr = this.f;
        aooh.c(fArr);
        android.content.Context context = this.d;
        defpackage.aggq aggqVar = new defpackage.aggq(fArr, afsq.n(context, 3), afsq.n(context, 3), afsq.n(context, this.a), afsq.n(context, this.b), afsq.n(context, 0), this.c);
        android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(0);
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_focused}, aggqVar);
        stateListDrawable.addState(android.util.StateSet.WILD_CARD, colorDrawable);
        return stateListDrawable;
    }

    public final void b(int i) {
        this.e = i;
        float fN = afsq.n(this.d, i);
        this.f = new float[]{fN, fN, fN, fN, fN, fN, fN, fN};
    }
}
