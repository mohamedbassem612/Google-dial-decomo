package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class swo implements ahjr {
    private static final aimz a = aimz.i("com/android/dialer/revelio/impl/settings/RevelioSettingReceiver");
    private final android.content.Context b;
    private final ipc c;

    public swo(android.content.Context context, ipc ipcVar) {
        this.b = context;
        this.c = ipcVar;
    }

    public final ajcq a(android.content.Intent intent, int i) {
        if (!"com.android.dialer.revelio.ACTION_SET_DEFAULT_REVELIO_SETTINGS".equals(intent.getAction())) {
            return ajcm.a;
        }
        a.b().l("com/android/dialer/revelio/impl/settings/RevelioSettingReceiver", "onReceive", 47, "RevelioSettingReceiver.java").v("Received ACTION_SET_DEFAULT_REVELIO_SETTINGS intent");
        android.content.Context context = this.b;
        ipc ipcVar = this.c;
        akzx akzxVarM = defpackage.rvq.a.m();
        akzx akzxVarM2 = defpackage.rvo.a.m();
        defpackage.rvc rvcVar = defpackage.rvc.REVELIO;
        akzxVarM2.u();
        ((defpackage.rvo) akzxVarM2.b).d = rvcVar.a();
        akzx akzxVarM3 = defpackage.rvk.a.m();
        akzxVarM3.u();
        ((defpackage.rvk) akzxVarM3.b).b = true;
        defpackage.rvk rvkVar = (defpackage.rvk) akzxVarM3.p();
        akzxVarM2.u();
        defpackage.rvo rvoVar = (defpackage.rvo) akzxVarM2.b;
        j$.util.Objects.requireNonNull(rvkVar);
        rvoVar.c = rvkVar;
        rvoVar.b = 3;
        defpackage.rvo rvoVar2 = (defpackage.rvo) akzxVarM2.p();
        akzxVarM.u();
        defpackage.rvq rvqVar = (defpackage.rvq) akzxVarM.b;
        j$.util.Objects.requireNonNull(rvoVar2);
        rvqVar.d = rvoVar2;
        rvqVar.c = 2;
        akzxVarM.u();
        defpackage.rvq rvqVar2 = (defpackage.rvq) akzxVarM.b;
        rvqVar2.b |= 1;
        rvqVar2.e = true;
        ahqx.l(context, ipcVar.aL((defpackage.rvq) akzxVarM.p()).setFlags(335544320));
        return ajcm.a;
    }
}
