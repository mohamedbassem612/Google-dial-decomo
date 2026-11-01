package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class ld {
    private static final java.util.List s = java.util.Collections.EMPTY_LIST;
    public final android.view.View a;
    public java.lang.ref.WeakReference b;
    public int c;
    public int d;
    public long e;
    public int f;
    int g;
    public defpackage.ld h;
    public defpackage.ld i;
    int j;
    java.util.List k;
    java.util.List l;
    defpackage.kt m;
    boolean n;
    public int o;
    public int p;
    android.support.v7.widget.RecyclerView q;
    defpackage.kh r;
    private int t;

    public ld(android.view.View view) {
        this.c = -1;
        this.d = -1;
        this.e = -1L;
        this.f = -1;
        this.g = -1;
        this.h = null;
        this.i = null;
        this.k = null;
        this.l = null;
        this.t = 0;
        this.m = null;
        this.n = false;
        this.o = 0;
        this.p = -1;
        if (view == null) {
            throw new java.lang.IllegalArgumentException("itemView may not be null");
        }
        this.a = view;
    }

    public final boolean A() {
        return (this.j & 128) != 0;
    }

    final boolean B() {
        return (this.j & 32) != 0;
    }

    public final int a() {
        android.support.v7.widget.RecyclerView recyclerView = this.q;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.en(this);
    }

    public final int b() {
        android.support.v7.widget.RecyclerView recyclerView;
        defpackage.kh khVar;
        int iEn;
        if (this.r == null || (recyclerView = this.q) == null || (khVar = recyclerView.m) == null || (iEn = recyclerView.en(this)) == -1 || this.r != khVar) {
            return -1;
        }
        return iEn;
    }

    public final int c() {
        int i = this.g;
        return i == -1 ? this.c : i;
    }

    public final java.util.List d() {
        java.util.List list;
        return ((this.j & 1024) != 0 || (list = this.k) == null || list.size() == 0) ? s : this.l;
    }

    public final void e(java.lang.Object obj) {
        if (obj == null) {
            f(1024);
            return;
        }
        if ((this.j & 1024) == 0) {
            if (this.k == null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                this.k = arrayList;
                this.l = j$.util.DesugarCollections.unmodifiableList(arrayList);
            }
            this.k.add(obj);
        }
    }

    public final void f(int i) {
        this.j |= i;
    }

    public final void g() {
        this.d = -1;
        this.g = -1;
    }

    final void h() {
        java.util.List list = this.k;
        if (list != null) {
            list.clear();
        }
        this.j &= -1025;
    }

    final void i() {
        this.j &= -33;
    }

    public final void j() {
        this.j &= -257;
    }

    public final void k(int i, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        int i2 = this.g;
        if (i2 == -1) {
            i2 = this.c;
            this.g = i2;
        }
        if (z) {
            this.g = i2 + i;
        }
        this.c += i;
        android.view.View view = this.a;
        if (view.getLayoutParams() != null) {
            ((defpackage.kq) view.getLayoutParams()).e = true;
        }
    }

    final void l() {
        int i = android.support.v7.widget.RecyclerView.aa;
        this.j = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1L;
        this.g = -1;
        this.t = 0;
        this.h = null;
        this.i = null;
        h();
        this.o = 0;
        this.p = -1;
        android.support.v7.widget.RecyclerView.u(this);
    }

    public final void m(int i, int i2) {
        this.j = (this.j & (~i2)) | (i & i2);
    }

    public final void n(boolean z) {
        int i;
        int i2 = this.t;
        int i3 = z ? i2 - 1 : i2 + 1;
        this.t = i3;
        if (i3 < 0) {
            this.t = 0;
            int i4 = android.support.v7.widget.RecyclerView.aa;
            toString();
            android.util.Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ".concat(toString()));
        } else if (z) {
            if (i3 == 0) {
                i = this.j & (-17);
                this.j = i;
            }
        } else if (i3 == 1) {
            i = this.j | 16;
            this.j = i;
        }
        int i5 = android.support.v7.widget.RecyclerView.aa;
    }

    final void o(defpackage.kt ktVar, boolean z) {
        this.m = ktVar;
        this.n = z;
    }

    final void p() {
        this.m.l(this);
    }

    public final boolean q(int i) {
        return (this.j & i) != 0;
    }

    final boolean r() {
        android.view.View view = this.a;
        return (view.getParent() == null || view.getParent() == this.q) ? false : true;
    }

    public final boolean s() {
        return (this.j & 1) != 0;
    }

    public final boolean t() {
        return (this.j & 4) != 0;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + '{' + java.lang.Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
        if (w()) {
            sb.append(" scrap ");
            sb.append(true != this.n ? "[attachedScrap]" : "[changeScrap]");
        }
        if (t()) {
            sb.append(" invalid");
        }
        if (!s()) {
            sb.append(" unbound");
        }
        if (z()) {
            sb.append(" update");
        }
        if (v()) {
            sb.append(" removed");
        }
        if (A()) {
            sb.append(" ignored");
        }
        if (x()) {
            sb.append(" tmpDetached");
        }
        if (!u()) {
            sb.append(" not recyclable(" + this.t + ')');
        }
        if ((this.j & 512) != 0 || t()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean u() {
        if ((this.j & 16) == 0) {
            android.view.View view = this.a;
            int i = defpackage.dzs.a;
            if (!view.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean v() {
        return (this.j & 8) != 0;
    }

    final boolean w() {
        return this.m != null;
    }

    public final boolean x() {
        return (this.j & 256) != 0;
    }

    public final boolean y() {
        return (this.j & 2) != 0;
    }

    final boolean z() {
        return (this.j & 2) != 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ld(android.view.View view, byte[] bArr) {
        this(view);
        defpackage.aooh.f(view, "view");
        android.view.View viewFindViewById = view.findViewById(2131427663);
        defpackage.aooh.e(viewFindViewById, "findViewById(...)");
    }
}
