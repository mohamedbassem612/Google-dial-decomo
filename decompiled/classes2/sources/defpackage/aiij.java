package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class aiij extends java.util.AbstractList {
    final java.util.List a;
    final int b = 999;

    public aiij(java.util.List list) {
        this.a = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        ahvr.ch(i, size());
        int i2 = this.b;
        java.util.List list = this.a;
        int i3 = i * i2;
        return list.subList(i3, java.lang.Math.min(i2 + i3, list.size()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return aiql.ak(this.a.size(), this.b, java.math.RoundingMode.CEILING);
    }
}
