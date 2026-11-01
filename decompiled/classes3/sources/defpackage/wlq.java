package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wlq extends amzm {
    private final amzg b;

    public wlq(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.wlq.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOf;
        defpackage.wpg wpgVar = ((defpackage.abtr) obj).n().c;
        if (wpgVar == null) {
            wpgVar = defpackage.wpg.a;
        }
        defpackage.wow wowVarB = defpackage.wow.b(wpgVar.f);
        if (wowVarB == null) {
            wowVarB = defpackage.wow.UNRECOGNIZED;
        }
        if (wowVarB == defpackage.wow.INTRO_FOR_LIVE_TRANSCRIPTION) {
            akzx akzxVarM = defpackage.wlf.a.m();
            akzx akzxVarM2 = defpackage.wkr.a.m();
            akzxVarM2.u();
            defpackage.wkr wkrVar = (defpackage.wkr) akzxVarM2.b;
            wkrVar.b |= 1;
            wkrVar.c = 2132021087;
            akzxVarM.u();
            defpackage.wlf wlfVar = (defpackage.wlf) akzxVarM.b;
            defpackage.wkr wkrVar2 = (defpackage.wkr) akzxVarM2.p();
            j$.util.Objects.requireNonNull(wkrVar2);
            wlfVar.d = wkrVar2;
            wlfVar.c = 7;
            optionalOf = j$.util.Optional.of((defpackage.wlf) akzxVarM.p());
        } else if (wowVarB == defpackage.wow.INTRO_FOR_IVR_DATA) {
            akzx akzxVarM3 = defpackage.wlf.a.m();
            akzx akzxVarM4 = defpackage.wkr.a.m();
            akzxVarM4.u();
            defpackage.wkr wkrVar3 = (defpackage.wkr) akzxVarM4.b;
            wkrVar3.b |= 1;
            wkrVar3.c = 2132021059;
            akzxVarM3.u();
            defpackage.wlf wlfVar2 = (defpackage.wlf) akzxVarM3.b;
            defpackage.wkr wkrVar4 = (defpackage.wkr) akzxVarM4.p();
            j$.util.Objects.requireNonNull(wkrVar4);
            wlfVar2.d = wkrVar4;
            wlfVar2.c = 7;
            optionalOf = j$.util.Optional.of((defpackage.wlf) akzxVarM3.p());
        } else {
            akzx akzxVarM5 = defpackage.wlf.a.m();
            defpackage.wkr wkrVar5 = defpackage.wkr.a;
            akzxVarM5.u();
            defpackage.wlf wlfVar3 = (defpackage.wlf) akzxVarM5.b;
            j$.util.Objects.requireNonNull(wkrVar5);
            wlfVar3.d = wkrVar5;
            wlfVar3.c = 7;
            optionalOf = j$.util.Optional.of((defpackage.wlf) akzxVarM5.p());
        }
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
