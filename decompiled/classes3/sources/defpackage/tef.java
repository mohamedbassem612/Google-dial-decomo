package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tef implements rvd {
    public final android.content.Context a;
    private final aoss b;

    public tef(android.content.Context context, aoss aossVar) {
        aooh.f(context, "appContext");
        aooh.f(aossVar, "lightweightScope");
        this.a = context;
        this.b = aossVar;
    }

    public final android.content.Intent a() {
        return new android.content.Intent("com.motorola.phone.settings.FLIP_OPEN_CLOSE_SETTINGS").addCategory("android.intent.category.DEFAULT");
    }

    public final aw b() {
        return null;
    }

    public final /* synthetic */ aw c(defpackage.rvq rvqVar) {
        return null;
    }

    public final ajcq d() {
        return aosv.F(this.b, 0, new bbf((aoln) null, 14, (char[][][]) null), 3);
    }

    public final ajcq e() {
        return aosv.F(this.b, 0, new defpackage.sfo(this, (aoln) null, 14), 3);
    }
}
