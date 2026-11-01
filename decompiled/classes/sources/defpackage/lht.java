package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lht {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/callscreen/impl/settings/Settings");
    public final android.content.Context b;
    public final defpackage.ajct c;
    public final defpackage.lcx d;
    public final defpackage.aogc e;

    public lht(android.content.Context context, defpackage.aogc aogcVar, defpackage.ajct ajctVar, defpackage.lcx lcxVar) {
        this.b = context;
        this.e = aogcVar;
        this.c = ajctVar;
        this.d = lcxVar;
    }

    public final defpackage.ajcq a() {
        return defpackage.ahvr.F(new lgc(this, 6), this.c);
    }

    public final defpackage.ajcq b() {
        defpackage.ahoq ahoqVarW = defpackage.ahvr.W(295, "Settings_loadSettings");
        try {
            defpackage.ajcq ajcqVarA = a();
            defpackage.ajcq ajcqVarBk = this.e.bk();
            defpackage.ajcq ajcqVarO = defpackage.ahvr.ak(ajcqVarA, ajcqVarBk).o(new lly(ajcqVarA, ajcqVarBk, 1), this.c);
            ahoqVarW.a(ajcqVarO);
            ahoqVarW.close();
            return ajcqVarO;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
