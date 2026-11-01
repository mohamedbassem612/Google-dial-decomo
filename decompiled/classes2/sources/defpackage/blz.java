package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class blz {
    public static final ckb a = new dko(new defpackage.aem(7), new defpackage.bcm(11), 1);
    public boolean b;
    public final java.util.List c;
    public java.util.concurrent.atomic.AtomicLong d;
    public aonj e;
    public aonp f;
    public aonr g;
    public aomy h;
    public aonj i;
    public aonj j;
    public final acx k;
    private final ccp l;

    public blz(long j) {
        this.c = new java.util.ArrayList();
        int i = acy.a;
        this.k = new acx(6);
        this.d = new java.util.concurrent.atomic.AtomicLong(j);
        this.l = new androidx.compose.runtime.ParcelableSnapshotMutableState(acy.a(), cdu.c);
    }

    public final long a() {
        long andIncrement = this.d.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.d.getAndIncrement();
        }
        return andIncrement;
    }

    public final acx b() {
        return (acx) this.l.a();
    }

    public final java.util.List c(cxi cxiVar) {
        if (!this.b) {
            ajsz.bo(this.c, new defpackage.bdt(new axo(cxiVar, 10), 5, null));
            this.b = true;
        }
        return this.c;
    }

    public final void d() {
        aomy aomyVar = this.h;
        if (aomyVar != null) {
            aomyVar.a();
        }
    }

    public final void e(cxi cxiVar, long j, defpackage.bks bksVar, boolean z) {
        aonp aonpVar = this.f;
        if (aonpVar != null) {
            aonpVar.a(java.lang.Boolean.valueOf(z), cxiVar, new cpm(j), bksVar);
        }
    }

    public final void f(acx acxVar) {
        this.l.b(acxVar);
    }

    public final boolean g(cxi cxiVar, long j, long j2, defpackage.bks bksVar, boolean z) {
        aonr aonrVar = this.g;
        if (aonrVar != null) {
            return ((java.lang.Boolean) aonrVar.a(java.lang.Boolean.valueOf(z), cxiVar, new cpm(j), new cpm(j2), java.lang.Boolean.FALSE, bksVar)).booleanValue();
        }
        return true;
    }

    public blz() {
        throw null;
    }
}
