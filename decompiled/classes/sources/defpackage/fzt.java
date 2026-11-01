package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class fzt extends defpackage.aojo {
    private final int a;
    private final int b;
    private final java.util.List c;

    public fzt(int i, int i2, java.util.List list) {
        this.a = i;
        this.b = i2;
        this.c = list;
    }

    @Override // defpackage.aojj
    public final int a() {
        return this.a + this.c.size() + this.b;
    }

    @Override // defpackage.aojo, java.util.List
    public final java.lang.Object get(int i) {
        if (i >= 0 && i < this.a) {
            return null;
        }
        int i2 = this.a;
        java.util.List list = this.c;
        if (i < list.size() + i2 && i2 <= i) {
            return list.get(i - i2);
        }
        int size = i2 + list.size();
        if (i < a() && size <= i) {
            return null;
        }
        throw new java.lang.IndexOutOfBoundsException("Illegal attempt to access index " + i + " in ItemSnapshotList of size " + a());
    }
}
