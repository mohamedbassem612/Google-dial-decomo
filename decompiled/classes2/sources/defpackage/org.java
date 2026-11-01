package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class org implements defpackage.oqx {
    private final zrx a;
    private final java.util.List b;
    private final android.content.Context c;
    private final rlv d;
    private final ahpz e;
    private final mce f;
    private final gpd g;
    private final acxg h;

    public org(zrx zrxVar, mce mceVar, java.util.List list, android.content.Context context, acxg acxgVar, gpd gpdVar, rlv rlvVar, ahpz ahpzVar) {
        aooh.f(zrxVar, "callParameter");
        aooh.f(list, "impressions");
        aooh.f(context, "appContext");
        aooh.f(gpdVar, "cuiLogger");
        aooh.f(rlvVar, "logging");
        aooh.f(ahpzVar, "traceCreation");
        this.a = zrxVar;
        this.f = mceVar;
        this.b = list;
        this.c = context;
        this.h = acxgVar;
        this.g = gpdVar;
        this.d = rlvVar;
        this.e = ahpzVar;
    }

    private final boolean f() {
        zrx zrxVar = this.a;
        return (zrxVar.c == 2 ? (zsf) zrxVar.d : zsf.a).f;
    }

    @Override // defpackage.oqx
    public final int a() {
        return f() ? 2131231080 : 2131231060;
    }

    @Override // defpackage.oqx
    public final java.lang.String b() {
        java.lang.String string = this.c.getString(true != f() ? 2132020816 : 2132020717);
        aooh.e(string, "getString(...)");
        return string;
    }

    @Override // defpackage.oqx
    public final void c(az azVar) {
        ahok ahokVarF;
        android.content.Context context = this.c;
        java.lang.String strB = b();
        if (aooh.n(strB, context.getString(2132020816))) {
            ahokVarF = this.e.f(424, "Clicked voice call button in voicemail dropdown menu");
        } else {
            boolean zN = aooh.n(strB, context.getString(2132020717));
            ahpz ahpzVar = this.e;
            ahokVarF = zN ? ahpzVar.f(423, "Clicked video call button in voicemail dropdown menu") : ahpzVar.f(422, "Clicked unknown button in voicemail dropdown menu");
        }
        try {
            mce mceVar = this.f;
            if (mceVar != null) {
                this.g.i((java.lang.String) null).b(mceVar);
            }
            java.util.Iterator it = this.b.iterator();
            while (it.hasNext()) {
                this.d.n((rmw) it.next());
            }
            this.h.w(this.a);
            ajsz.ak(ahokVarF, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahokVarF, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.oqx
    public final void e() {
        c(null);
    }

    @Override // defpackage.oqx
    public final /* synthetic */ void d() {
    }
}
