package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bzf extends android.view.ViewGroup {
    public final int a;
    public final java.util.List b;
    public final java.util.List c;
    public int d;
    public final vx e;

    public bzf(android.content.Context context) {
        super(context);
        this.a = 5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.b = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.c = arrayList2;
        this.e = new vx((char[]) null, (byte[]) null);
        setClipChildren(false);
        defpackage.bzg bzgVar = new defpackage.bzg(context);
        addView(bzgVar);
        arrayList.add(bzgVar);
        arrayList2.add(bzgVar);
        this.d = 1;
        setTag(2131428330, java.lang.Boolean.TRUE);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
