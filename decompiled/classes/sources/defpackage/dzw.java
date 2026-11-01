package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dzw implements java.util.Iterator, defpackage.aoow {
    final /* synthetic */ android.view.ViewGroup a;
    private int b;

    public dzw(android.view.ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.getChildCount();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        int i = this.b;
        this.b = i + 1;
        android.view.View childAt = this.a.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.b - 1;
        this.b = i;
        this.a.removeViewAt(i);
    }
}
