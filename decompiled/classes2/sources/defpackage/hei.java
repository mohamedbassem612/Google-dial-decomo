package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hei {
    public final java.util.List a;
    public final defpackage.gzh b;
    public final java.lang.String c;
    public final long d;
    public final long e;
    public final java.lang.String f;
    public final java.util.List g;
    public final defpackage.hdk h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final defpackage.hdj p;
    public final defpackage.hdb q;
    public final java.util.List r;
    public final boolean s;
    public final int t;
    public final int u;
    public final int v;
    public final defpackage.heq w;
    public final defpackage.hwv x;
    public final defpackage.jkq y;

    public hei(java.util.List list, defpackage.gzh gzhVar, java.lang.String str, long j, int i, long j2, java.lang.String str2, java.util.List list2, defpackage.hdk hdkVar, int i2, int i3, int i4, float f, float f2, float f3, float f4, defpackage.hdj hdjVar, defpackage.jkq jkqVar, java.util.List list3, int i5, defpackage.hdb hdbVar, boolean z, defpackage.heq heqVar, defpackage.hwv hwvVar, int i6) {
        this.a = list;
        this.b = gzhVar;
        this.c = str;
        this.d = j;
        this.t = i;
        this.e = j2;
        this.f = str2;
        this.g = list2;
        this.h = hdkVar;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = f;
        this.m = f2;
        this.n = f3;
        this.o = f4;
        this.p = hdjVar;
        this.y = jkqVar;
        this.r = list3;
        this.u = i5;
        this.q = hdbVar;
        this.s = z;
        this.w = heqVar;
        this.x = hwvVar;
        this.v = i6;
    }

    public final java.lang.String a(java.lang.String str) {
        int i;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(this.c);
        sb.append('\n');
        defpackage.gzh gzhVar = this.b;
        defpackage.hei heiVarC = gzhVar.c(this.e);
        if (heiVarC != null) {
            sb.append("\t\tParents: ");
            sb.append(heiVarC.c);
            for (defpackage.hei heiVarC2 = gzhVar.c(heiVarC.e); heiVarC2 != null; heiVarC2 = gzhVar.c(heiVarC2.e)) {
                sb.append("->");
                sb.append(heiVarC2.c);
            }
            sb.append(str);
            sb.append('\n');
        }
        java.util.List list = this.g;
        if (!list.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(list.size());
            sb.append('\n');
        }
        int i2 = this.i;
        if (i2 != 0 && (i = this.j) != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(java.lang.String.format(java.util.Locale.US, "%dx%d %X\n", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(this.k)));
        }
        java.util.List list2 = this.a;
        if (!list2.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (java.lang.Object obj : list2) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(obj);
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    public final java.lang.String toString() {
        return a("");
    }
}
