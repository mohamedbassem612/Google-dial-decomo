package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bgt {
    public final java.lang.Object a;
    public java.lang.Object b;

    public bgt() {
        this.a = new java.util.ArrayList();
        float[] fArr = new float[5];
        for (int i = 0; i < 5; i++) {
            fArr[i] = Float.NaN;
        }
        this.b = fArr;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void a(java.lang.Object obj, float f) {
        ?? r0 = this.a;
        r0.add(obj);
        if (((float[]) this.b).length < r0.size()) {
            float[] fArrCopyOf = java.util.Arrays.copyOf((float[]) this.b, r0.size() + 2);
            aooh.e(fArrCopyOf, "copyOf(...)");
            this.b = fArrCopyOf;
        }
        ((float[]) this.b)[r0.size() - 1] = f;
    }

    public bgt(dji djiVar) {
        this.a = djiVar;
        this.b = djiVar;
    }
}
