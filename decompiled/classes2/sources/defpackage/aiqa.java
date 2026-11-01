package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aiqa extends aipo {
    private final java.lang.String a;
    private final java.util.logging.Level b;
    private final java.util.Set c;
    private final aioy d;
    private final int e;

    public aiqa(java.lang.String str, int i, java.util.logging.Level level, java.util.Set set, aioy aioyVar) {
        super(str);
        this.a = "";
        this.e = 2;
        this.b = level;
        this.c = set;
        this.d = aioyVar;
    }

    public final void a(aiom aiomVar) {
        java.lang.String strB = (java.lang.String) aiomVar.n().d(aiog.a);
        if (strB == null) {
            strB = d();
        }
        if (strB == null) {
            strB = aiomVar.f().b();
            int iIndexOf = strB.indexOf(36, strB.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strB = strB.substring(0, iIndexOf);
            }
        }
        java.lang.String strD = aiql.d(this.a, strB);
        aiqb.e(aiomVar, strD.substring(0, java.lang.Math.min(strD.length(), 23)), 2, this.b, this.c, this.d);
    }

    public final boolean b(java.util.logging.Level level) {
        return true;
    }
}
