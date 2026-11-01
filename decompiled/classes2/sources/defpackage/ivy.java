package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ivy implements defpackage.oqb {
    public static final aimz a = aimz.i("com/android/dialer/beesly/impl/growthkit/BeeslyBannerController");
    public final jbm b;
    public final defpackage.jbv c;
    private final aoss d;
    private final rlv e;

    public ivy(aoss aossVar, jbm jbmVar, defpackage.jbv jbvVar, rlv rlvVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(jbmVar, "settings");
        aooh.f(rlvVar, "loggingBindings");
        this.d = aossVar;
        this.b = jbmVar;
        this.c = jbvVar;
        this.e = rlvVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    @Override // defpackage.oqb
    public final acky a(aclc aclcVar) {
        aoop aoopVar;
        android.content.Intent intent = (android.content.Intent) aclcVar.a.get(ackw.b);
        acky ackyVar = null;
        if (aooh.n(intent != null ? intent.getAction() : null, "com.android.dialer.beesly.impl.growthkit.ACTION_SHOW_SETTINGS")) {
            aoopVar = new aoop();
            aoov.an(this.d, (aolr) null, 0, new defpackage.hyq(this, intent, aoopVar, (aoln) null, 8), 3);
            if (aoopVar.a) {
                ackyVar = new acky(false, 2);
            } else {
                ackyVar = new acky(true, 1);
            }
        } else {
            if (aooh.n(intent != null ? intent.getAction() : null, "com.android.dialer.beesly.impl.growthkit.ACTION_SHOW_SETTINGS_OPT_IN")) {
                aoopVar = new aoop();
                aoov.an(this.d, (aolr) null, 0, new defpackage.hyq(this, intent, aoopVar, (aoln) null, 8), 3);
                if (aoopVar.a) {
                    ackyVar = new acky(false, 2);
                } else {
                    ackyVar = new acky(true, 1);
                }
            }
        }
        return ackyVar;
    }

    @Override // defpackage.oqb
    public final void b(int i, ackw ackwVar) {
        if (i == 2) {
            if (ackwVar == ackw.b) {
                this.e.o(rmx.xi);
            } else if (ackwVar == ackw.d) {
                this.e.o(rmx.xj);
            }
        }
    }
}
