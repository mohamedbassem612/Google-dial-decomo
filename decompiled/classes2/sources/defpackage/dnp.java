package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dnp extends defpackage.dvl {
    final /* synthetic */ aosb a;
    final /* synthetic */ dmc b;
    final /* synthetic */ android.content.Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnp(aosb aosbVar, dmc dmcVar, android.content.Context context) {
        super(null);
        this.a = aosbVar;
        this.b = dmcVar;
        this.c = context;
    }

    @Override // defpackage.dvl
    public final void a(int i) {
        java.lang.String str;
        if (i == -3) {
            str = "Generic error loading font, for example variation settings were not parsable";
        } else if (i == -2) {
            str = "The given provider cannot be authenticated with the certificates given.";
        } else if (i == -1) {
            str = "The requested provider was not found on this device.";
        } else if (i == 1) {
            str = "Font not found, please check availability on GoogleFont.Provider.AllFontsList: https://fonts.gstatic.com/s/a/directory.xml";
        } else if (i != 2) {
            str = i != 3 ? "Unknown error code" : "The given query was not supported by this provider.";
        } else {
            str = "The provider found the queried font, but it is currently unavailable.";
        }
        dmc dmcVar = this.b;
        this.a.g(new java.lang.IllegalStateException("Failed to load " + dmcVar + " (reason=" + i + ", " + str + ')'));
    }

    @Override // defpackage.dvl
    public final void b(android.graphics.Typeface typeface) {
        java.lang.ThreadLocal threadLocal = defpackage.dnr.a;
        if (typeface == null) {
            typeface = null;
        } else {
            dnb dnbVar = this.b.b;
            if (!dnbVar.a.isEmpty()) {
                java.lang.ThreadLocal threadLocal2 = defpackage.dnr.a;
                android.graphics.Paint paint = (android.graphics.Paint) threadLocal2.get();
                if (paint == null) {
                    paint = new android.graphics.Paint();
                    threadLocal2.set(paint);
                }
                android.content.Context context = this.c;
                aa$.ExternalSyntheticApiModelOutline0.m(paint, (java.lang.String) null);
                paint.setTypeface(typeface);
                aa$.ExternalSyntheticApiModelOutline0.m(paint, defpackage.yj.f(dnbVar, context));
                typeface = paint.getTypeface();
            }
        }
        this.a.w(typeface);
    }
}
