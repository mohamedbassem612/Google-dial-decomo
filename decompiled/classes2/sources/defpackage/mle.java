package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class mle implements agye {
    final /* synthetic */ defpackage.mli a;

    public mle(defpackage.mli mliVar) {
        j$.util.Objects.requireNonNull(mliVar);
        this.a = mliVar;
    }

    public final void a(java.lang.Throwable th) {
        a.bq(defpackage.mli.a.c(), "Error loading precall dialpad model", "com/android/dialer/dialpadview/ui/PreCallDialpadFragmentPeer$1", "onError", (char) 202, "PreCallDialpadFragmentPeer.java", th, zct.b);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0083  */
    /* JADX WARN: Code duplicated, block: B:19:0x0094  */
    /* JADX WARN: Code duplicated, block: B:20:0x009e  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a6  */
    public final /* synthetic */ void b(java.lang.Object obj) {
        java.util.List list;
        defpackage.miv mivVar;
        defpackage.miv mivVar2;
        defpackage.miv mivVar3;
        defpackage.mli mliVar = this.a;
        defpackage.mjb mjbVar = (defpackage.mjb) obj;
        if (((java.lang.Boolean) mliVar.p.a()).booleanValue()) {
            defpackage.miz mizVar = (defpackage.miz) mjbVar;
            list = mizVar.a;
            java.lang.String str = mizVar.b;
            if (str != null) {
                mliVar.e = j$.util.Optional.of(str);
            }
        } else {
            defpackage.mit mitVar = ((defpackage.mja) mjbVar).a;
            list = mitVar.c;
            if ((mitVar.b & 4) != 0) {
                mliVar.e = j$.util.Optional.of(mitVar.f);
            }
        }
        defpackage.mkw mkwVar = mliVar.i;
        mkwVar.d = (aigf) j$.util.Collection.-EL.stream(list).collect(aido.b(new defpackage.mig(3), j$.util.function.Function.-CC.identity()));
        aigf aigfVar = mkwVar.d;
        aift aiftVar = new aift(4);
        defpackage.miv mivVar4 = defpackage.miv.RTT_BUTTON;
        if (aigfVar.containsKey(mivVar4)) {
            defpackage.miv mivVar5 = defpackage.miv.RTT_VOICE_BUTTON;
            if (aigfVar.containsKey(mivVar5)) {
                aiftVar.i((defpackage.miu) aigfVar.get(mivVar4));
                aiftVar.i((defpackage.miu) aigfVar.get(mivVar5));
            } else {
                mivVar = defpackage.miv.WAIT_TIME_VOICE_BUTTON;
                if (aigfVar.containsKey(mivVar)) {
                    aiftVar.i((defpackage.miu) aigfVar.get(mivVar));
                    mivVar3 = defpackage.miv.BUSINESS_MESSAGE_CHAT_BUTTON;
                    if (aigfVar.containsKey(mivVar3)) {
                        aiftVar.i((defpackage.miu) aigfVar.get(mivVar3));
                    }
                } else {
                    mivVar2 = defpackage.miv.VOICE_BUTTON;
                    if (aigfVar.containsKey(mivVar2)) {
                        aiftVar.i((defpackage.miu) aigfVar.get(mivVar2));
                    }
                }
            }
        } else {
            mivVar = defpackage.miv.WAIT_TIME_VOICE_BUTTON;
            if (aigfVar.containsKey(mivVar)) {
                aiftVar.i((defpackage.miu) aigfVar.get(mivVar));
                mivVar3 = defpackage.miv.BUSINESS_MESSAGE_CHAT_BUTTON;
                if (aigfVar.containsKey(mivVar3)) {
                    aiftVar.i((defpackage.miu) aigfVar.get(mivVar3));
                }
            } else {
                mivVar2 = defpackage.miv.VOICE_BUTTON;
                if (aigfVar.containsKey(mivVar2)) {
                    aiftVar.i((defpackage.miu) aigfVar.get(mivVar2));
                }
            }
        }
        aify aifyVarH = aiftVar.h();
        ailk ailkVarY = aifyVarH.y(0);
        boolean z = false;
        boolean z2 = false;
        while (ailkVarY.hasNext()) {
            defpackage.miu miuVar = (defpackage.miu) ailkVarY.next();
            defpackage.miv mivVarB = defpackage.miv.b(miuVar.c);
            if (mivVarB == null) {
                mivVarB = defpackage.miv.UNSPECIFIED;
            }
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) mkwVar.c.get(mivVarB);
            if (defpackage.mkw.b.contains(mivVarB)) {
                java.util.Map map = mkwVar.e;
                extendedFloatingActionButton.m(((defpackage.mkv) map.get(mivVarB)).a);
                extendedFloatingActionButton.setContentDescription(((defpackage.mkv) map.get(mivVarB)).b);
            }
            if ((miuVar.b & 8) != 0) {
                extendedFloatingActionButton.m(mkwVar.f.G().getDrawable(miuVar.f));
            }
            if ((miuVar.b & 16) != 0) {
                extendedFloatingActionButton.setContentDescription(mkwVar.f.G().getString(miuVar.g));
            }
            int i = miuVar.c;
            defpackage.miv mivVarB2 = defpackage.miv.b(i);
            if (mivVarB2 == null) {
                mivVarB2 = defpackage.miv.UNSPECIFIED;
            }
            if (mivVarB2 == defpackage.miv.WAIT_TIME_VOICE_BUTTON) {
                mkwVar.a(miuVar);
                z = true;
            } else {
                defpackage.miv mivVarB3 = defpackage.miv.b(i);
                if (mivVarB3 == null) {
                    mivVarB3 = defpackage.miv.UNSPECIFIED;
                }
                if (mivVarB3 == defpackage.miv.BUSINESS_MESSAGE_CHAT_BUTTON) {
                    mkwVar.a(miuVar);
                    z2 = true;
                }
            }
        }
        if (z) {
            java.util.Map map2 = mkwVar.c;
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton2 = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) map2.get(defpackage.miv.WAIT_TIME_VOICE_BUTTON);
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton3 = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) map2.get(defpackage.miv.BUSINESS_MESSAGE_CHAT_BUTTON);
            dtv layoutParams = extendedFloatingActionButton2.getLayoutParams();
            dtv layoutParams2 = extendedFloatingActionButton3.getLayoutParams();
            layoutParams2.t = -1;
            layoutParams2.l = -1;
            layoutParams2.u = -1;
            layoutParams.t = -1;
            layoutParams.i = -1;
            layoutParams.s = -1;
            layoutParams.v = -1;
            layoutParams.l = -1;
            if (z2) {
                layoutParams2.t = 0;
                layoutParams2.l = 0;
                layoutParams2.u = 2131427983;
                layoutParams.s = 2131427980;
                layoutParams.i = 2131427980;
                layoutParams.l = 2131427980;
                layoutParams.v = 0;
                layoutParams.bottomMargin = 0;
                layoutParams.height = 0;
                layoutParams.leftMargin = mkwVar.f.z().getResources().getDimensionPixelSize(2131165620);
            } else {
                layoutParams.v = 0;
                layoutParams.l = 0;
                layoutParams.t = 0;
                layoutParams.bottomMargin = mkwVar.f.z().getResources().getDimensionPixelSize(2131165609);
                layoutParams.height = -2;
                layoutParams.leftMargin = 0;
            }
            extendedFloatingActionButton2.setLayoutParams(layoutParams);
            extendedFloatingActionButton3.setLayoutParams(layoutParams2);
        }
        for (java.util.Map.Entry entry : mkwVar.c.entrySet()) {
            ailk ailkVarY2 = aifyVarH.y(0);
            boolean z3 = true;
            while (ailkVarY2.hasNext()) {
                defpackage.miu miuVar2 = (defpackage.miu) ailkVarY2.next();
                defpackage.miv mivVar6 = (defpackage.miv) entry.getKey();
                defpackage.miv mivVarB4 = defpackage.miv.b(miuVar2.c);
                if (mivVarB4 == null) {
                    mivVarB4 = defpackage.miv.UNSPECIFIED;
                }
                if (mivVar6.equals(mivVarB4)) {
                    ((com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) entry.getValue()).E(0);
                    defpackage.mli mliVarY = mkwVar.f.y();
                    akzx akzxVarM = defpackage.mjc.a.m();
                    akzxVarM.u();
                    defpackage.mjc mjcVar = (defpackage.mjc) akzxVarM.b;
                    j$.util.Objects.requireNonNull(miuVar2);
                    mjcVar.c = miuVar2;
                    mjcVar.b |= 1;
                    defpackage.mjc mjcVar2 = (defpackage.mjc) akzxVarM.p();
                    defpackage.mji mjiVar = mliVarY.m;
                    akzx akzxVarP = mjcVar2.p();
                    boolean z4 = mliVarY.f;
                    akzxVarP.u();
                    defpackage.mjc mjcVar3 = (defpackage.mjc) akzxVarP.b;
                    mjcVar3.b |= 2;
                    mjcVar3.d = z4;
                    defpackage.mjc mjcVar4 = (defpackage.mjc) akzxVarP.p();
                    aigf aigfVarK = mjiVar.i.k();
                    defpackage.miu miuVar3 = mjcVar4.c;
                    if (miuVar3 == null) {
                        miuVar3 = defpackage.miu.a;
                    }
                    defpackage.miy miyVarB = defpackage.miy.b(miuVar3.h);
                    if (miyVarB == null) {
                        miyVarB = defpackage.miy.UNKNOWN;
                    }
                    ((defpackage.mln) ((aoin) aigfVarK.get(miyVarB)).a()).a(mjcVar4);
                    z3 = false;
                }
            }
            if (z3) {
                ((com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) entry.getValue()).E(1);
            }
        }
    }

    public final /* synthetic */ void c() {
    }
}
