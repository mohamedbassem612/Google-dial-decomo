package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zvg {
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ com.google.android.flexbox.FlexboxLayoutManager h;

    public zvg(com.google.android.flexbox.FlexboxLayoutManager flexboxLayoutManager) {
        j$.util.Objects.requireNonNull(flexboxLayoutManager);
        this.h = flexboxLayoutManager;
        this.d = 0;
    }

    public final void a() {
        int iF;
        com.google.android.flexbox.FlexboxLayoutManager flexboxLayoutManager = this.h;
        if (flexboxLayoutManager.K() || !flexboxLayoutManager.c) {
            iF = this.e ? flexboxLayoutManager.f.f() : flexboxLayoutManager.f.j();
        } else {
            iF = this.e ? flexboxLayoutManager.f.f() : ((kp) flexboxLayoutManager).C - flexboxLayoutManager.f.j();
        }
        this.c = iF;
    }

    public final void b() {
        this.a = -1;
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        boolean z = false;
        this.f = false;
        this.g = false;
        com.google.android.flexbox.FlexboxLayoutManager flexboxLayoutManager = this.h;
        if (!flexboxLayoutManager.K() ? !(flexboxLayoutManager.b != 0 || flexboxLayoutManager.a != 3) : !(flexboxLayoutManager.b != 0 || flexboxLayoutManager.a != 1)) {
            z = true;
        }
        this.e = z;
    }

    public final java.lang.String toString() {
        return "AnchorInfo{mPosition=" + this.a + ", mFlexLinePosition=" + this.b + ", mCoordinate=" + this.c + ", mPerpendicularCoordinate=" + this.d + ", mLayoutFromEnd=" + this.e + ", mValid=" + this.f + ", mAssignedFromSavedState=" + this.g + '}';
    }
}
