package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rtp {
    public static final aimz a = aimz.i("com/android/dialer/marquee/impl/ui/MarqueeFragmentPeer");
    public final defpackage.agzc b;
    public final odo c;
    public final rst d;
    public final defpackage.rto e;
    public final rlv f;
    public final aoin g;
    public final aoin h;
    public final ccp i;
    public rsd j;
    public final odm k;
    public final defpackage.qhr l;
    public final defpackage.qhr m;
    public final gpd n;
    public final aogc o;
    private final aais p;

    public rtp(defpackage.agzc agzcVar, odo odoVar, defpackage.qhr qhrVar, rst rstVar, aais aaisVar, defpackage.qhr qhrVar2, defpackage.rto rtoVar, gpd gpdVar, aogc aogcVar, rlv rlvVar, aoin aoinVar, aoin aoinVar2) {
        aooh.f(agzcVar, "localSubscriptionMixin");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aoinVar2, "enableMarqueeFrequencyControls");
        this.b = agzcVar;
        this.c = odoVar;
        this.m = qhrVar;
        this.d = rstVar;
        this.p = aaisVar;
        this.l = qhrVar2;
        this.e = rtoVar;
        this.n = gpdVar;
        this.o = aogcVar;
        this.f = rlvVar;
        this.g = aoinVar;
        this.h = aoinVar2;
        this.i = new androidx.compose.runtime.ParcelableSnapshotMutableState(rti.a, cdu.c);
        this.k = new defpackage.quy(this, 9);
    }

    public final defpackage.rtj a() {
        return (defpackage.rtj) this.i.a();
    }

    public final void b(cav cavVar, int i) {
        int i2;
        defpackage.rtp rtpVar;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1496929892);
        if (i3 == 0) {
            i2 = (true != cbtVarB.D(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cbtVarB.H((i2 & 3) != 2, i2 & 1)) {
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR == obj) {
                objR = cbp.a(aols.a, cbtVarB);
                cbtVar.ab(objR);
            }
            aoss aossVar = (aoss) objR;
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(a(), cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState);
                objR2 = parcelableSnapshotMutableState;
            }
            rtpVar = this;
            den.ab(abjc.a.b(this.p), cfo.j(-2106508068, new ata(rtpVar, aossVar, (ccp) objR2, 12, (char[]) null), cbtVarB), cbtVarB, 48);
        } else {
            rtpVar = this;
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new kmg(rtpVar, i, 20);
        }
    }
}
