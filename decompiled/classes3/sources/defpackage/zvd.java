package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zvd {
    public int e;
    public int f;
    public int g;
    public int h;
    int i;
    float j;
    float k;
    public int l;
    int m;
    public int o;
    public int p;
    boolean q;
    boolean r;
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    final java.util.List n = new java.util.ArrayList();

    public final int a() {
        return this.h - this.i;
    }

    public final void b(android.view.View view, int i, int i2, int i3, int i4) {
        com.google.android.flexbox.FlexItem flexItem = (com.google.android.flexbox.FlexItem) view.getLayoutParams();
        this.a = java.lang.Math.min(this.a, (view.getLeft() - flexItem.g()) - i);
        this.b = java.lang.Math.min(this.b, (view.getTop() - flexItem.i()) - i2);
        this.c = java.lang.Math.max(this.c, view.getRight() + flexItem.h() + i3);
        this.d = java.lang.Math.max(this.d, view.getBottom() + flexItem.f() + i4);
    }
}
