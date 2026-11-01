package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dts {
    public final boolean a;
    final java.lang.String b;
    public int c;
    public float d;
    public java.lang.String e;
    boolean f;
    public int g;
    public final int h;

    public dts(defpackage.dts dtsVar, java.lang.Object obj) {
        this.a = false;
        this.b = dtsVar.b;
        this.h = dtsVar.h;
        a(obj);
    }

    public final void a(java.lang.Object obj) {
        int i = this.h;
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 1:
                this.d = ((java.lang.Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.g = ((java.lang.Integer) obj).intValue();
                return;
            case 4:
                this.e = (java.lang.String) obj;
                return;
            case 5:
                this.f = ((java.lang.Boolean) obj).booleanValue();
                return;
            case 6:
                this.d = ((java.lang.Float) obj).floatValue();
                return;
            default:
                this.c = ((java.lang.Integer) obj).intValue();
                return;
        }
    }

    public dts(java.lang.String str, int i, java.lang.Object obj, boolean z) {
        this.b = str;
        this.h = i;
        this.a = z;
        a(obj);
    }
}
