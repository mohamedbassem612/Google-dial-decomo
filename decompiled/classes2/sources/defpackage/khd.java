package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class khd {
    final /* synthetic */ defpackage.khe a;
    final /* synthetic */ boolean b;
    final /* synthetic */ java.lang.String c;
    final /* synthetic */ java.lang.String d;

    public khd(defpackage.khe kheVar, boolean z, java.lang.String str, java.lang.String str2) {
        this.a = kheVar;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public final android.graphics.drawable.Drawable a() {
        return this.a.b.getDrawable(true != this.b ? 2131231060 : 2131231080);
    }

    public final java.lang.CharSequence b(java.lang.String str) {
        aooh.f(str, "primaryText");
        java.lang.String string = this.a.b.getString(true != this.b ? 2132018861 : 2132018860, str, this.c);
        aooh.e(string, "getString(...)");
        return string;
    }

    public final void c(zrx zrxVar) {
        aooh.f(zrxVar, "callParameter");
        defpackage.khe kheVar = this.a;
        kheVar.f.o(rmx.zn);
        ajcq ajcqVarF = aosv.F(kheVar.e, 0, new defpackage.hyg(kheVar, this.d, this.b, (aoln) null, 3), 3);
        agsm agsmVar = kheVar.a;
        aooh.f(agsmVar, "<this>");
        agsmVar.g(ajcqVarF, 10L, java.util.concurrent.TimeUnit.SECONDS);
    }
}
