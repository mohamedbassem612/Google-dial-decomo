package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bjf {
    public final long a;
    public final long b;
    public defpackage.bjk c = defpackage.bjk.a;
    public final cmw d;
    public defpackage.bke e;
    public final defpackage.blz f;
    private final defpackage.bfl g;

    public bjf(long j, defpackage.blz blzVar, long j2) {
        this.a = j;
        this.f = blzVar;
        this.b = j2;
        defpackage.bfl bflVar = new defpackage.bfl();
        this.g = bflVar;
        this.d = uu.p(new defpackage.bjg(blzVar, j, new defpackage.bhl(this, 11)).a(new defpackage.bfj(bflVar)), cvj.b);
    }

    public final void a() {
        defpackage.bke bkeVar = new defpackage.bke(this.a, new defpackage.bhl(this, 8), new defpackage.bhl(this, 9), new defpackage.bhl(this, 10), this.g);
        long j = bkeVar.a;
        if (j == 0) {
            defpackage.avo.c("The selectable contains an invalid id: 0");
            j = 0;
        }
        defpackage.blz blzVar = this.f;
        acx acxVar = blzVar.k;
        if (acxVar.b(j)) {
            defpackage.avo.c(a.bC(j, "Another selectable with the id: ", " has already subscribed."));
        }
        acxVar.h(j, bkeVar);
        blzVar.c.add(bkeVar);
        blzVar.b = false;
        this.e = bkeVar;
    }

    public final void b() {
        defpackage.bke bkeVar = this.e;
        if (bkeVar != null) {
            defpackage.blz blzVar = this.f;
            acx acxVar = blzVar.k;
            long j = bkeVar.a;
            if (acxVar.b(j)) {
                blzVar.c.remove(bkeVar);
                acxVar.e(j);
                aonj aonjVar = blzVar.j;
                if (aonjVar != null) {
                    aonjVar.a(java.lang.Long.valueOf(j));
                }
            }
            this.e = null;
        }
    }

    public final void c(bek bekVar) {
        this.c = defpackage.bjk.a(this.c, null, null, bekVar, 3);
    }
}
