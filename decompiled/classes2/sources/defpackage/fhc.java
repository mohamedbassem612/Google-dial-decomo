package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fhc {
    public final java.util.function.Consumer c;
    public final android.util.SparseArray b = new android.util.SparseArray();
    public int a = -1;

    public fhc(java.util.function.Consumer consumer) {
        this.c = consumer;
    }

    public final java.lang.Object a(int i) {
        android.util.SparseArray sparseArray;
        if (this.a == -1) {
            this.a = 0;
        }
        while (true) {
            int i2 = this.a;
            if (i2 <= 0 || i >= this.b.keyAt(i2)) {
                break;
            }
            this.a--;
        }
        while (true) {
            int i3 = this.a;
            sparseArray = this.b;
            if (i3 >= sparseArray.size() - 1 || i < sparseArray.keyAt(this.a + 1)) {
                break;
            }
            this.a++;
        }
        return sparseArray.valueAt(this.a);
    }

    public final java.lang.Object b() {
        android.util.SparseArray sparseArray = this.b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public final boolean c() {
        return this.b.size() == 0;
    }
}
