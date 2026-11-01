package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class blh {
    public final long a;
    public final long b;
    public final cxi c;
    public final boolean d;
    public final defpackage.bko e;
    public final defpackage.blg f;
    public final java.util.Comparator g;
    public final boolean h;
    public final java.util.List i;
    public int j;
    public int k;
    public int l;
    public final defpackage.acu m;

    public blh(long j, long j2, cxi cxiVar, boolean z, defpackage.bko bkoVar, defpackage.blg blgVar, java.util.Comparator comparator, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = cxiVar;
        this.d = z;
        this.e = bkoVar;
        this.f = blgVar;
        this.g = comparator;
        this.h = z2;
        int i = defpackage.acv.a;
        this.m = new defpackage.acu(6);
        this.i = new java.util.ArrayList();
        this.j = -1;
        this.k = -1;
        this.l = -1;
    }

    public final int a(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        int iJ = defpackage.li.j(i2, i3) - 1;
        if (iJ == 0) {
            return this.l - 1;
        }
        if (iJ != 1) {
            return -1;
        }
        return this.l;
    }
}
