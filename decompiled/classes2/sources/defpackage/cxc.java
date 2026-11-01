package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class cxc implements cze {
    private final cze[] a;
    private final czs b;
    private final cxb c;
    private final czs d;
    private final cxb e;

    public cxc(cze[] czeVarArr) {
        this.a = czeVarArr;
        int length = czeVarArr.length;
        czs[] czsVarArr = new czs[length];
        for (int i = 0; i < length; i++) {
            czsVarArr[i] = this.a[i].c();
        }
        this.b = new czs(new brg(czsVarArr, 12));
        int length2 = this.a.length;
        cxb[] cxbVarArr = new cxb[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            cxbVarArr[i2] = this.a[i2].b();
        }
        this.c = new cxb(new brg(cxbVarArr, 9));
        int length3 = this.a.length;
        czs[] czsVarArr2 = new czs[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            czsVarArr2[i3] = this.a[i3].d();
        }
        this.d = new czs(new brg(czsVarArr2, 11));
        int length4 = this.a.length;
        cxb[] cxbVarArr2 = new cxb[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            cxbVarArr2[i4] = this.a[i4].a();
        }
        this.e = new cxb(new brg(cxbVarArr2, 8));
    }

    public final cxb a() {
        return this.e;
    }

    public final cxb b() {
        return this.c;
    }

    public final czs c() {
        return this.b;
    }

    public final czs d() {
        return this.d;
    }

    public final java.lang.String toString() {
        return ajsz.dj(this.a, (java.lang.CharSequence) null, "innermostOf(", ")", (aonj) null, 57);
    }
}
