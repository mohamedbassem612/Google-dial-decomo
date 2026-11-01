package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class appn extends defpackage.aojo implements java.util.RandomAccess {
    public static final defpackage.aoov c = new defpackage.aoov();
    public final defpackage.appb[] a;
    public final int[] b;

    public appn(defpackage.appb[] appbVarArr, int[] iArr) {
        this.a = appbVarArr;
        this.b = iArr;
    }

    @Override // defpackage.aojj
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.aojj, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof defpackage.appb) {
            return super.contains((defpackage.appb) obj);
        }
        return false;
    }

    @Override // defpackage.aojo, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        return this.a[i];
    }

    @Override // defpackage.aojo, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (obj instanceof defpackage.appb) {
            return super.indexOf((defpackage.appb) obj);
        }
        return -1;
    }

    @Override // defpackage.aojo, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof defpackage.appb) {
            return super.lastIndexOf((defpackage.appb) obj);
        }
        return -1;
    }
}
