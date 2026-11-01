package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vvp implements defpackage.rnv {
    private final defpackage.vvz a;

    public vvp(defpackage.vvz vvzVar, defpackage.ahpz ahpzVar, defpackage.apni apniVar, defpackage.ajct ajctVar, defpackage.aoss aossVar) {
        if (vvzVar == null) {
            defpackage.aooh.i("voicemailTabRetainedState");
        }
        if (ahpzVar == null) {
            defpackage.aooh.i("traceCreation");
        }
        if (apniVar == null) {
            defpackage.aooh.i("androidJobs");
        }
        if (ajctVar == null) {
            defpackage.aooh.i("lightweightExecutor");
        }
        if (aossVar == null) {
            defpackage.aooh.i("activityRetainedCoroutineScope");
        }
        this.a = vvzVar;
    }

    @Override // defpackage.rnv
    public final defpackage.aw a() {
        defpackage.akzx akzxVarM = vyg.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        akzxVarM.u();
        vyg vygVar = akzxVarM.b;
        vygVar.b |= 1;
        vygVar.c = false;
        vyg vygVarR = akzxVarM.r();
        defpackage.aooh.e(vygVarR, "build(...)");
        return vwz.s(vygVarR);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.rnv
    public final java.lang.Object b(defpackage.aoln aolnVar) throws java.lang.Throwable {
        defpackage.vvo vvoVar;
        if (aolnVar instanceof defpackage.vvo) {
            vvoVar = (defpackage.vvo) aolnVar;
            int i = vvoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vvoVar.c = i - Integer.MIN_VALUE;
            } else {
                vvoVar = new defpackage.vvo(this, aolnVar);
            }
        } else {
            vvoVar = new defpackage.vvo(this, aolnVar);
        }
        java.lang.Object objM = vvoVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = vvoVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(objM);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objM);
            }
            defpackage.vvr vvrVar = (defpackage.vvr) objM;
            defpackage.ipc ipcVarAb = defpackage.ttj.ab(defpackage.rob.a.m());
            ipcVarAb.aV(defpackage.roc.VISUAL_VOICEMAIL_TAB_KEY);
            ipcVarAb.aW(vvrVar.a);
            int i3 = vvrVar.b;
            defpackage.akzx akzxVar = (defpackage.akzx) ipcVarAb.a;
            akzxVar.u();
            defpackage.rob robVar = (defpackage.rob) akzxVar.b;
            robVar.b |= 1;
            robVar.e = i3;
            ipcVarAb.aU(vvrVar.c);
            return ipcVarAb.aT();
        }
        defpackage.aooc.af(objM);
        defpackage.vvz vvzVar = this.a;
        vvoVar.c = 1;
        objM = defpackage.aosv.m(new defpackage.emu(vvzVar, (defpackage.aoln) null, 4), vvoVar);
        if (objM == aoluVar) {
            return aoluVar;
        }
        vvoVar.c = 2;
        objM = ((defpackage.aosy) objM).a(vvoVar);
        if (objM == aoluVar) {
            return aoluVar;
        }
        defpackage.vvr vvrVar2 = (defpackage.vvr) objM;
        defpackage.ipc ipcVarAb2 = defpackage.ttj.ab(defpackage.rob.a.m());
        ipcVarAb2.aV(defpackage.roc.VISUAL_VOICEMAIL_TAB_KEY);
        ipcVarAb2.aW(vvrVar2.a);
        int i4 = vvrVar2.b;
        defpackage.akzx akzxVar2 = (defpackage.akzx) ipcVarAb2.a;
        akzxVar2.u();
        defpackage.rob robVar2 = (defpackage.rob) akzxVar2.b;
        robVar2.b |= 1;
        robVar2.e = i4;
        ipcVarAb2.aU(vvrVar2.c);
        return ipcVarAb2.aT();
    }

    @Override // defpackage.rnv
    public final java.lang.String c() {
        return "visual_voicemail_fragment";
    }

    @Override // defpackage.rnv
    public final java.util.Set d() {
        return defpackage.aoke.a;
    }
}
