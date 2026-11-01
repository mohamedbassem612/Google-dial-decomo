package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aihz extends defpackage.ailj {
    final /* synthetic */ java.util.Iterator a;
    final /* synthetic */ int b;

    public aihz(java.util.Iterator it, int i) {
        this.a = it;
        this.b = i;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.util.List next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i = this.b;
        java.lang.Object[] objArr = new java.lang.Object[i];
        int i2 = 0;
        while (i2 < i) {
            java.util.Iterator it = this.a;
            if (!it.hasNext()) {
                break;
            }
            objArr[i2] = it.next();
            i2++;
        }
        for (int i3 = i2; i3 < i; i3++) {
            objArr[i3] = null;
        }
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(java.util.Arrays.asList(objArr));
        return i2 != i ? listUnmodifiableList.subList(0, i2) : listUnmodifiableList;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }
}
