package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afgs implements defpackage.afgl {
    public final android.content.Context a;
    public final java.lang.String b;
    public final java.util.Set c;
    public android.content.SharedPreferences d;
    private final java.util.concurrent.Executor e;
    private final defpackage.ahzi f;
    private final defpackage.apnt g;

    public afgs(defpackage.afgq afgqVar) {
        this.a = afgqVar.a;
        this.e = afgqVar.b;
        this.b = afgqVar.c;
        this.c = afgqVar.d;
        this.g = afgqVar.f;
        this.f = afgqVar.e;
    }

    public static defpackage.afgq d(android.content.Context context, java.util.concurrent.Executor executor) {
        return new defpackage.afgq(context.getApplicationContext(), executor);
    }

    @Override // defpackage.afgl
    public final defpackage.ajcq a() {
        return ((java.lang.Boolean) this.f.eZ()).booleanValue() ? defpackage.ajcm.a : defpackage.aiql.D(new zpk(this, 18), this.e);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [afgr, java.lang.Object] */
    @Override // defpackage.afgl
    public final defpackage.ajcq b(defpackage.albh albhVar) {
        return defpackage.aiql.z(this.g.a.a(new afpl(this.d, this.c, (byte[]) null), albhVar));
    }

    @Override // defpackage.afgl
    public final defpackage.ajcq c() {
        return defpackage.aiql.D(new zpk(this, 19), this.e);
    }
}
