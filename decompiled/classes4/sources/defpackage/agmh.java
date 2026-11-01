package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class agmh {
    private static final aihd b;
    private static final aihd c;
    private static final defpackage.agmh d;
    public final aihd a;

    static {
        aihd aihdVarR = aihd.r("google.com", "www.google.com");
        b = aihdVarR;
        aihd aihdVarR2 = aihd.r("gmail.com", "www.gmail.com");
        c = aihdVarR2;
        aihd.r("googlemail.com", "www.googlemail.com");
        defpackage.agmh agmhVar = new defpackage.agmh(aihdVarR);
        d = agmhVar;
        new defpackage.agmh(aihdVarR2);
        new defpackage.agmh(aieu.a(aihdVarR2, agmhVar.a));
    }

    public agmh(java.lang.Iterable iterable) {
        aihb aihbVar = new aihb();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            java.lang.String strSubstring = (java.lang.String) it.next();
            if (strSubstring.startsWith(".")) {
                strSubstring = strSubstring.substring(1);
            }
            aihbVar.i(ahvr.p(strSubstring));
        }
        this.a = aihbVar.h();
    }
}
