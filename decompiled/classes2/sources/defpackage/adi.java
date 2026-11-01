package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class adi extends defpackage.adv implements java.util.Set, aopb {
    public final ads a;

    public adi(ads adsVar) {
        super(adsVar);
        this.a = adsVar;
    }

    @Override // defpackage.adv, java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        return this.a.f(obj);
    }

    @Override // defpackage.adv, java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        aooh.f(collection, "elements");
        aooh.f(collection, "elements");
        ads adsVar = this.a;
        int i = adsVar.g;
        aooh.f(collection, "elements");
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            adsVar.d(it.next());
        }
        return i != adsVar.g;
    }

    @Override // defpackage.adv, java.util.Set, java.util.Collection
    public final void clear() {
        this.a.c();
    }

    @Override // defpackage.adv, java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.adk(this, 1);
    }

    @Override // defpackage.adv, java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        return this.a.g(obj);
    }

    @Override // defpackage.adv, java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        int iNumberOfTrailingZeros;
        aooh.f(collection, "elements");
        aooh.f(collection, "elements");
        ads adsVar = this.a;
        int i = adsVar.g;
        aooh.f(collection, "elements");
        java.util.Iterator it = collection.iterator();
        while (true) {
            int i2 = 1;
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            int iHashCode = next != null ? next.hashCode() : 0;
            int i4 = adsVar.f;
            int i5 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
            int i6 = i5 ^ (i5 >>> 16);
            int i7 = (i6 >>> 7) & i4;
            while (true) {
                long[] jArr = adsVar.a;
                int i8 = i7 >> 3;
                int i9 = (i7 & 7) << 3;
                int i10 = i3;
                long j = (jArr[i8] >>> i9) | ((jArr[i8 + i2] << (64 - i9)) & ((-i9) >> 63));
                long j2 = (((long) (i6 & 127)) * 72340172838076673L) ^ j;
                for (long j3 = ((-72340172838076673L) + j2) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                    iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i7) & i4;
                    if (aooh.n(adsVar.b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                }
                if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i3 = i10 + 8;
                i7 = (i7 + i3) & i4;
                i2 = 1;
            }
            if (iNumberOfTrailingZeros >= 0) {
                adsVar.e(iNumberOfTrailingZeros);
            }
        }
        return i != adsVar.g;
    }

    @Override // defpackage.adv, java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        aooh.f(collection, "elements");
        return this.a.h(collection);
    }
}
