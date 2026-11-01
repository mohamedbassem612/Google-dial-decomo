package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class stz implements defpackage.zta {
    public static final defpackage.aify a = defpackage.aify.q("android.permission.CALL_PHONE", "android.permission.READ_PHONE_STATE");
    public static final defpackage.aimz b = defpackage.aimz.i("com/android/dialer/precall/integrations/PermissionCheckPrecallIntegration");
    public final android.content.Context c;
    public final defpackage.zrw d;
    public final defpackage.aoss e;
    private final defpackage.aoss f;

    public stz(android.content.Context context, defpackage.zrw zrwVar, defpackage.aoss aossVar, defpackage.aoss aossVar2) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aossVar2 == null) {
            defpackage.aooh.i("uiScope");
        }
        this.c = context;
        this.d = zrwVar;
        this.f = aossVar;
        this.e = aossVar2;
    }

    @Override // defpackage.zta
    public final al a(zrx zrxVar) {
        throw new java.lang.UnsupportedOperationException("not supposed to be called");
    }

    @Override // defpackage.zta
    public final defpackage.ajcq b(zrx zrxVar) {
        return defpackage.aosv.F(this.f, 0, new tma(this, (defpackage.aoln) null, 1), 3);
    }

    @Override // defpackage.zta
    public final /* synthetic */ defpackage.ajcq c(zrx zrxVar) {
        return defpackage.aiql.z(zrxVar);
    }
}
