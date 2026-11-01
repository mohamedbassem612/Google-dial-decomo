package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aojy extends defpackage.aojo implements java.util.RandomAccess {
    final /* synthetic */ int[] a;

    public aojy(int[] iArr) {
        this.a = iArr;
    }

    @Override // defpackage.aojj
    public final int a() {
        return 1;
    }

    @Override // defpackage.aojj, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            return defpackage.ajsz.cI(this.a, ((java.lang.Number) obj).intValue()) >= 0;
        }
        return false;
    }

    @Override // defpackage.aojo, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Integer.valueOf(this.a[i]);
    }

    @Override // defpackage.aojo, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Integer)) {
            return -1;
        }
        return defpackage.ajsz.cI(this.a, ((java.lang.Number) obj).intValue());
    }

    @Override // defpackage.aojj, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.aojo, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        return ((obj instanceof java.lang.Integer) && ((java.lang.Number) obj).intValue() == this.a[0]) ? 0 : -1;
    }
}
