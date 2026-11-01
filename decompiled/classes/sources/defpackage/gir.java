package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gir {
    public java.lang.String a;
    public defpackage.giq b;
    public boolean c;
    public boolean d;
    private final android.content.Context e;

    public gir(android.content.Context context) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        this.e = context;
    }

    public final defpackage.aewz a() {
        java.lang.String str;
        defpackage.giq giqVar = this.b;
        if (giqVar == null) {
            throw new java.lang.IllegalArgumentException("Must set a callback to create the configuration.");
        }
        if (this.c && ((str = this.a) == null || str.length() == 0)) {
            throw new java.lang.IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new defpackage.aewz(this.e, this.a, giqVar, this.c, this.d);
    }
}
