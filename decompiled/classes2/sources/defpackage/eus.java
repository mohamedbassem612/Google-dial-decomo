package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eus extends defpackage.euu {
    public final long a;
    public final java.util.List b;
    public final java.util.List c;

    public eus(int i, long j) {
        super(i);
        this.a = j;
        this.b = new java.util.ArrayList();
        this.c = new java.util.ArrayList();
    }

    public final defpackage.eus a(int i) {
        java.util.List list = this.c;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.eus eusVar = (defpackage.eus) list.get(i2);
            if (eusVar.d == i) {
                return eusVar;
            }
        }
        return null;
    }

    public final defpackage.eut b(int i) {
        java.util.List list = this.b;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.eut eutVar = (defpackage.eut) list.get(i2);
            if (eutVar.d == i) {
                return eutVar;
            }
        }
        return null;
    }

    public final void c(defpackage.eus eusVar) {
        this.c.add(eusVar);
    }

    public final void d(defpackage.eut eutVar) {
        this.b.add(eutVar);
    }

    @Override // defpackage.euu
    public final java.lang.String toString() {
        java.util.List list = this.b;
        return e(this.d) + " leaves: " + java.util.Arrays.toString(list.toArray()) + " containers: " + java.util.Arrays.toString(this.c.toArray());
    }
}
