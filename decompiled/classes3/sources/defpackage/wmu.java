package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wmu extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;

    public wmu(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5) {
        super(amyzVar2, new defpackage.amzw(defpackage.wmu.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        defpackage.abtr abtrVar = (defpackage.abtr) list.get(0);
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(2);
        j$.util.Optional optional3 = (j$.util.Optional) list.get(3);
        j$.util.Optional optional4 = (j$.util.Optional) list.get(4);
        aift aiftVar = new aift(4);
        j$.util.Objects.requireNonNull(aiftVar);
        defpackage.vxc vxcVar = new defpackage.vxc(aiftVar, 20);
        if (true == optional4.isPresent()) {
            ((aift) vxcVar.a).i((defpackage.wlf) optional4.get());
        }
        j$.util.Objects.requireNonNull(aiftVar);
        defpackage.vxc vxcVar2 = new defpackage.vxc(aiftVar, 20);
        if (true == optional2.isPresent()) {
            ((aift) vxcVar2.a).i((defpackage.wlf) optional2.get());
        }
        j$.util.Objects.requireNonNull(aiftVar);
        defpackage.vxc vxcVar3 = new defpackage.vxc(aiftVar, 20);
        if (true == optional.isPresent()) {
            ((aift) vxcVar3.a).i((defpackage.wlf) optional.get());
        }
        j$.util.Objects.requireNonNull(aiftVar);
        defpackage.vxc vxcVar4 = new defpackage.vxc(aiftVar, 20);
        if (true == optional3.isPresent()) {
            ((aift) vxcVar4.a).i((defpackage.wlf) optional3.get());
        }
        defpackage.wpg wpgVar = abtrVar.n().c;
        if (wpgVar == null) {
            wpgVar = defpackage.wpg.a;
        }
        defpackage.wpf wpfVar = wpgVar.e;
        if (wpfVar == null) {
            wpfVar = defpackage.wpf.a;
        }
        java.util.Iterator it = wpfVar.c.iterator();
        int i = 1;
        while (it.hasNext()) {
            aiftVar.k(wsc.L(i, ((defpackage.wpe) it.next()).b));
            if (i < wpfVar.c.size()) {
                aiftVar.i(wsc.J(i));
                aiftVar.i(wsc.K(i));
            } else {
                defpackage.woo wooVar = abtrVar.n().d;
                if (wooVar == null) {
                    wooVar = defpackage.woo.a;
                }
                defpackage.won wonVarB = defpackage.won.b(wooVar.c);
                if (wonVarB == null) {
                    wonVarB = defpackage.won.UNRECOGNIZED;
                }
                boolean z = wonVarB == defpackage.won.IN_SESSION;
                if (!z && wpfVar.d && wpfVar.b.isEmpty()) {
                    akzx akzxVarM = defpackage.wlf.a.m();
                    java.lang.String strN = wsc.N(i, 2);
                    akzxVarM.u();
                    defpackage.wlf wlfVar = (defpackage.wlf) akzxVarM.b;
                    j$.util.Objects.requireNonNull(strN);
                    wlfVar.b |= 1;
                    wlfVar.e = strN;
                    akzx akzxVarM2 = defpackage.wmx.a.m();
                    akzxVarM2.u();
                    defpackage.wmx wmxVar = (defpackage.wmx) akzxVarM2.b;
                    wmxVar.b |= 1;
                    wmxVar.c = 2132021108;
                    akzx akzxVarM3 = defpackage.wmw.a.m();
                    akzxVarM3.u();
                    defpackage.wmw wmwVar = (defpackage.wmw) akzxVarM3.b;
                    wmwVar.b |= 1;
                    wmwVar.c = 2132021110;
                    defpackage.wmv wmvVar = defpackage.wmv.RESUME_TRANSCRIPTION;
                    akzxVarM3.u();
                    defpackage.wmw wmwVar2 = (defpackage.wmw) akzxVarM3.b;
                    wmwVar2.d = wmvVar.c;
                    wmwVar2.b |= 2;
                    akzxVarM2.u();
                    defpackage.wmx wmxVar2 = (defpackage.wmx) akzxVarM2.b;
                    defpackage.wmw wmwVar3 = (defpackage.wmw) akzxVarM3.p();
                    j$.util.Objects.requireNonNull(wmwVar3);
                    wmxVar2.e = wmwVar3;
                    wmxVar2.b |= 4;
                    akzxVarM.u();
                    defpackage.wlf wlfVar2 = (defpackage.wlf) akzxVarM.b;
                    defpackage.wmx wmxVar3 = (defpackage.wmx) akzxVarM2.p();
                    j$.util.Objects.requireNonNull(wmxVar3);
                    wlfVar2.d = wmxVar3;
                    wlfVar2.c = 4;
                    aiftVar.i((defpackage.wlf) akzxVarM.p());
                } else {
                    aiftVar.i(wsc.J(i));
                    if (z) {
                        aiftVar.i(wsc.K(i));
                    }
                }
            }
            i++;
        }
        aiftVar.k(wsc.L(i, wpfVar.b));
        return aiql.z(aiftVar.h());
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        amzg amzgVar2 = this.e;
        amzg amzgVar3 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
