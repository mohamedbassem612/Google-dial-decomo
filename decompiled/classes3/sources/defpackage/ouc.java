package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ouc {
    public static final aimz a = aimz.i("com/android/dialer/incall/activity/uilauncher/impl/DialerInCallUILauncherImpl");
    public final android.content.Context b;
    public final ipc c;
    private final defpackage.pci d;

    public ouc(android.content.Context context, ipc ipcVar, defpackage.pci pciVar) {
        aooh.f(context, "appContext");
        aooh.f(pciVar, "arbiter");
        this.b = context;
        this.c = ipcVar;
        this.d = pciVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.oub oubVar;
        if (aolnVar instanceof defpackage.oub) {
            oubVar = (defpackage.oub) aolnVar;
            int i = oubVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oubVar.c = i - Integer.MIN_VALUE;
            } else {
                oubVar = new defpackage.oub(this, aolnVar);
            }
        } else {
            oubVar = new defpackage.oub(this, aolnVar);
        }
        java.lang.Object objB = oubVar.a;
        java.lang.Boolean bool = aolu.a;
        int i2 = oubVar.c;
        if (i2 == 0) {
            aooc.af(objB);
            defpackage.pci pciVar = this.d;
            defpackage.zie zieVar = defpackage.zie.PHONE;
            mtr mtrVar = new mtr(this, 16);
            oubVar.c = 1;
            objB = pciVar.b(zieVar, mtrVar, oubVar);
            if (objB != bool) {
            }
            return bool;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objB);
        bool = (java.lang.Boolean) objB;
        if (!bool.booleanValue()) {
            a.b().l("com/android/dialer/incall/activity/uilauncher/impl/DialerInCallUILauncherImpl", "launchInCallActivity", 34, "DialerInCallUILauncherImpl.kt").v("Skip launching InCallActivity as primary surface is not PHONE");
        }
        return bool;
    }
}
