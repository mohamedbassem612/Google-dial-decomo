package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class chy extends defpackage.chp {
    public int c;
    public java.lang.Object[] d;
    public boolean e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public chy(java.lang.Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
        java.lang.Object[] objArr2 = new java.lang.Object[i3];
        this.d = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.e = r5;
        objArr2[0] = objArr;
        c(i - r5, 1);
    }

    private final java.lang.Object d() {
        int i = this.a & 31;
        java.lang.Object obj = this.d[this.c - 1];
        aooh.d(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((java.lang.Object[]) obj)[i];
    }

    private final void e(int i) {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = this.a;
            if (((i2 >> i3) & 31) != i) {
                break;
            } else {
                i3 += 5;
            }
        }
        if (i3 > 0) {
            c(i2, ((this.c - 1) - (i3 / 5)) + 1);
        }
    }

    public final void c(int i, int i2) {
        int i3 = (this.c - i2) * 5;
        while (i2 < this.c) {
            java.lang.Object[] objArr = this.d;
            java.lang.Object obj = objArr[i2 - 1];
            aooh.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i2] = ((java.lang.Object[]) obj)[(i >> i3) & 31];
            i3 -= 5;
            i2++;
        }
    }

    @Override // defpackage.chp, java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object objD = d();
        int i = this.a + 1;
        this.a = i;
        if (i == this.b) {
            this.e = true;
        } else {
            e(0);
        }
        return objD;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        this.a--;
        if (this.e) {
            this.e = false;
            return d();
        }
        e(31);
        return d();
    }
}
