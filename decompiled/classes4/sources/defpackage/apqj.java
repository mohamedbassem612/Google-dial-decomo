package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apqj {
    public static final appb a;
    public static final appb b;
    public static final appb c;
    public static final appb d;
    private static final appb e;

    static {
        appb appbVar = appb.a;
        a = aoov.aQ("/");
        b = aoov.aQ("\\");
        e = aoov.aQ("/\\");
        c = aoov.aQ(".");
        d = aoov.aQ("..");
    }

    public static final int a(defpackage.appp apppVar) {
        appb appbVar = apppVar.b;
        int iQ = appb.q(appbVar, a);
        return iQ == -1 ? appb.q(appbVar, b) : iQ;
    }

    public static final int b(defpackage.appp apppVar) {
        appb appbVar = apppVar.b;
        if (appbVar.c() == 0) {
            return -1;
        }
        if (appbVar.a(0) != 47) {
            if (appbVar.a(0) != 92) {
                if (appbVar.c() <= 2 || appbVar.a(1) != 58 || appbVar.a(2) != 92) {
                    return -1;
                }
                char cA = (char) appbVar.a(0);
                return ((cA < 'a' || cA >= '{') && (cA < 'A' || cA >= '[')) ? -1 : 3;
            }
            if (appbVar.c() > 2 && appbVar.a(1) == 92) {
                int iD = appbVar.d(b, 2);
                return iD == -1 ? appbVar.c() : iD;
            }
        }
        return 1;
    }

    public static final appb c(defpackage.appp apppVar) {
        appb appbVar = a;
        appb appbVar2 = appb.a;
        appb appbVar3 = apppVar.b;
        if (appbVar3.d(appbVar, 0) != -1) {
            return appbVar;
        }
        appb appbVar4 = b;
        if (appbVar3.d(appbVar4, 0) == -1) {
            return null;
        }
        return appbVar4;
    }

    public static final appb d(java.lang.String str) {
        if (aooh.n(str, "/")) {
            return a;
        }
        if (aooh.n(str, "\\")) {
            return b;
        }
        throw new java.lang.IllegalArgumentException("not a directory separator: ".concat(java.lang.String.valueOf(str)));
    }

    public static final defpackage.appp e(defpackage.appp apppVar, defpackage.appp apppVar2) {
        aooh.f(apppVar2, "child");
        if (b(apppVar2) != -1 || apppVar2.a() != null) {
            return apppVar2;
        }
        appb appbVarC = c(apppVar);
        if (appbVarC == null && (appbVarC = c(apppVar2)) == null) {
            appbVarC = d(defpackage.appp.a);
        }
        apoy apoyVar = new apoy();
        apoyVar.I(apppVar.b);
        if (apoyVar.b > 0) {
            apoyVar.I(appbVarC);
        }
        apoyVar.I(apppVar2.b);
        return f(apoyVar);
    }

    public static final defpackage.appp f(apoy apoyVar) {
        appb appbVar;
        char c2;
        appb appbVarS;
        apoy apoyVar2 = new apoy();
        appb appbVarG = null;
        int i = 0;
        while (true) {
            if (!apoyVar.G(a)) {
                appbVar = b;
                if (!apoyVar.G(appbVar)) {
                    break;
                }
            }
            byte bD = apoyVar.d();
            if (appbVarG == null) {
                appbVarG = g(bD);
            }
            i++;
        }
        if (i >= 2 && aooh.n(appbVarG, appbVar)) {
            aooh.c(appbVarG);
            apoyVar2.I(appbVarG);
            apoyVar2.I(appbVarG);
        } else if (i > 0) {
            aooh.c(appbVarG);
            apoyVar2.I(appbVarG);
        } else {
            long j = apoyVar.j(e);
            if (appbVarG == null) {
                appbVarG = j == -1 ? d(defpackage.appp.a) : g(apoyVar.c(j));
            }
            if (aooh.n(appbVarG, appbVar) && apoyVar.b >= 2 && apoyVar.c(1L) == 58 && (((c2 = (char) apoyVar.c(0L)) >= 'a' && c2 < '{') || (c2 >= 'A' && c2 < '['))) {
                if (j == 2) {
                    apoyVar2.fQ(apoyVar, 3L);
                } else {
                    apoyVar2.fQ(apoyVar, 2L);
                }
            }
        }
        long j2 = apoyVar2.b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!apoyVar.B()) {
            long j3 = apoyVar.j(e);
            if (j3 == -1) {
                appbVarS = apoyVar.r();
            } else {
                appbVarS = apoyVar.s(j3);
                apoyVar.d();
            }
            if (aooh.n(appbVarS, d)) {
                if (j2 <= 0 || !arrayList.isEmpty()) {
                    arrayList.add(appbVarS);
                }
            } else if (!aooh.n(appbVarS, c) && !aooh.n(appbVarS, appb.a)) {
                arrayList.add(appbVarS);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                apoyVar2.I(appbVarG);
            }
            apoyVar2.I((appb) arrayList.get(i2));
        }
        if (apoyVar2.b == 0) {
            apoyVar2.I(c);
        }
        return new defpackage.appp(apoyVar2.r());
    }

    private static final appb g(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        throw new java.lang.IllegalArgumentException(a.bj(b2, "not a directory separator: "));
    }
}
