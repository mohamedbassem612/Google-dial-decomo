package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class jf extends defpackage.li {
    final /* synthetic */ defpackage.jh a;

    public jf(defpackage.jh jhVar) {
        this.a = jhVar;
    }

    @Override // defpackage.li
    public final void a(android.support.v7.widget.RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        defpackage.jh jhVar = this.a;
        int iComputeVerticalScrollRange = jhVar.l.computeVerticalScrollRange();
        int i3 = jhVar.k;
        jhVar.m = iComputeVerticalScrollRange - i3 > 0 && i3 >= jhVar.a;
        int iComputeHorizontalScrollRange = jhVar.l.computeHorizontalScrollRange();
        int i4 = jhVar.j;
        boolean z = iComputeHorizontalScrollRange - i4 > 0 && i4 >= jhVar.a;
        jhVar.n = z;
        if (jhVar.m) {
            float f = i3;
            jhVar.e = (int) ((f * (iComputeVerticalScrollOffset + (f / 2.0f))) / iComputeVerticalScrollRange);
            jhVar.d = java.lang.Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        } else if (!z) {
            if (jhVar.o != 0) {
                jhVar.e(0);
                return;
            }
            return;
        }
        if (jhVar.n) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i4;
            jhVar.h = (int) ((f3 * (f2 + (f3 / 2.0f))) / iComputeHorizontalScrollRange);
            jhVar.g = java.lang.Math.min(i4, (i4 * i4) / iComputeHorizontalScrollRange);
        }
        int i5 = jhVar.o;
        if (i5 == 0 || i5 == 1) {
            jhVar.e(1);
        }
    }
}
