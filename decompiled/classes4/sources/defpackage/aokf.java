package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aokf implements java.util.Iterator, aoow {
    private final float[] a;
    private int b;

    public aokf(float[] fArr) {
        aooh.f(fArr, "array");
        this.a = fArr;
    }

    public final float a() {
        try {
            float[] fArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return fArr[i];
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            this.b--;
            throw new java.util.NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        return java.lang.Float.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.am();
    }
}
