package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dcm implements cyd {
    private final /* synthetic */ int $cid;
    private final cxe a;
    private final int b;
    private final int c;

    public dcm(cxe cxeVar, int i, int i2, int i3) {
        this.$cid = i3;
        this.a = cxeVar;
        this.b = i;
        this.c = i2;
    }

    public final int c(int i) {
        int i2 = this.$cid;
        cxe cxeVar = this.a;
        return i2 != 0 ? cxeVar.c(i) : cxeVar.c(i);
    }

    public final int d(int i) {
        int i2 = this.$cid;
        cxe cxeVar = this.a;
        return i2 != 0 ? cxeVar.d(i) : cxeVar.d(i);
    }

    public final int e(int i) {
        int i2 = this.$cid;
        cxe cxeVar = this.a;
        return i2 != 0 ? cxeVar.e(i) : cxeVar.e(i);
    }

    public final int f(int i) {
        int i2 = this.$cid;
        cxe cxeVar = this.a;
        return i2 != 0 ? cxeVar.f(i) : cxeVar.f(i);
    }

    public final java.lang.Object g() {
        int i = this.$cid;
        cxe cxeVar = this.a;
        return i != 0 ? cxeVar.g() : cxeVar.g();
    }

    public final czc v(long j) {
        int i = this.$cid;
        int i2 = this.c;
        if (i != 0) {
            int i3 = this.b;
            if (i2 == 1) {
                cxe cxeVar = this.a;
                return new defpackage.cwz(i3 == 2 ? cxeVar.d(dpd.a(j)) : cxeVar.f(dpd.a(j)), dpd.g(j) ? dpd.a(j) : 32767);
            }
            cxe cxeVar2 = this.a;
            return new defpackage.cwz(dpd.h(j) ? dpd.b(j) : 32767, i3 == 2 ? cxeVar2.c(dpd.b(j)) : cxeVar2.e(dpd.b(j)));
        }
        int i4 = this.b;
        if (i2 == 1) {
            cxe cxeVar3 = this.a;
            return new defpackage.dcn(i4 == 2 ? cxeVar3.d(dpd.a(j)) : cxeVar3.f(dpd.a(j)), dpd.g(j) ? dpd.a(j) : 32767);
        }
        cxe cxeVar4 = this.a;
        return new defpackage.dcn(dpd.h(j) ? dpd.b(j) : 32767, i4 == 2 ? cxeVar4.c(dpd.b(j)) : cxeVar4.e(dpd.b(j)));
    }
}
