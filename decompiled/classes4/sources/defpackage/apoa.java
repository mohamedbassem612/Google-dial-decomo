package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apoa extends defpackage.apny {
    public static final defpackage.appp f;
    public final defpackage.appp g;
    private final defpackage.appe h;

    static {
        java.lang.String str = defpackage.appp.a;
        f = defpackage.antw.r("okhttp3/internal/publicsuffix/" + okhttp3.internal.publicsuffix.PublicSuffixDatabase.class.getSimpleName() + ".list");
    }

    public apoa(defpackage.appp apppVar, defpackage.appe appeVar) {
        aooh.f(apppVar, "path");
        aooh.f(appeVar, "fileSystem");
        this.g = apppVar;
        this.h = appeVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0071  */
    /* JADX WARN: Code duplicated, block: B:17:0x0082  */
    /* JADX WARN: Code duplicated, block: B:19:0x008c  */
    /* JADX WARN: Code duplicated, block: B:26:0x00aa A[LOOP:1: B:25:0x00a8->B:26:0x00aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b9 A[LOOP:2: B:28:0x00b7->B:29:0x00b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x0109  */
    @Override // defpackage.apny
    public final apqd b() throws java.io.IOException {
        java.util.List listSubList;
        appb appbVar;
        apoy apoyVar;
        appb appbVarC;
        int size;
        int i;
        int size2;
        defpackage.appp apppVar = this.g;
        aooh.f(apppVar, "file");
        if (!defpackage.antw.p(apppVar)) {
            java.util.Objects.toString(apppVar);
            throw new java.io.FileNotFoundException("file not found: ".concat(java.lang.String.valueOf(apppVar)));
        }
        defpackage.appp apppVar2 = defpackage.apqp.c;
        java.lang.String str = defpackage.appp.a;
        aooh.f(apppVar, "child");
        defpackage.appp apppVarE = defpackage.apqj.e(apppVar2, apppVar);
        aooh.f(apppVar2, "other");
        if (!aooh.n(apppVarE.c(), apppVar2.c())) {
            throw new java.lang.IllegalArgumentException(a.bi(apppVar2, apppVarE, "Paths of different roots cannot be relative to each other: ", " and "));
        }
        java.util.List listB = apppVarE.b();
        java.util.List listB2 = apppVar2.b();
        int iMin = java.lang.Math.min(listB.size(), listB2.size());
        int i2 = 0;
        while (i2 < iMin && aooh.n(listB.get(i2), listB2.get(i2))) {
            i2++;
        }
        if (i2 != iMin) {
            listSubList = listB2.subList(i2, listB2.size());
            appbVar = defpackage.apqj.d;
            if (listSubList.indexOf(appbVar) == -1) {
                throw new java.lang.IllegalArgumentException(a.bi(apppVar2, apppVarE, "Impossible relative path to resolve: ", " and "));
            }
            if (!aooh.n(apppVar2.b, defpackage.apqj.c)) {
                apoyVar = new apoy();
                appbVarC = defpackage.apqj.c(apppVar2);
                if (appbVarC == null) {
                    appbVarC = defpackage.apqj.d(defpackage.appp.a);
                }
                size = listB2.size();
                for (i = i2; i < size; i++) {
                    apoyVar.I(appbVar);
                    apoyVar.I(appbVarC);
                }
                size2 = listB.size();
                while (i2 < size2) {
                    apoyVar.I((appb) listB.get(i2));
                    apoyVar.I(appbVarC);
                    i2++;
                }
                apppVarE = defpackage.apqj.f(apoyVar);
            }
        } else if (apppVarE.b.c() == apppVar2.b.c()) {
            apppVarE = defpackage.antw.r(".");
        } else {
            listSubList = listB2.subList(i2, listB2.size());
            appbVar = defpackage.apqj.d;
            if (listSubList.indexOf(appbVar) == -1) {
                throw new java.lang.IllegalArgumentException(a.bi(apppVar2, apppVarE, "Impossible relative path to resolve: ", " and "));
            }
            if (!aooh.n(apppVar2.b, defpackage.apqj.c)) {
                apoyVar = new apoy();
                appbVarC = defpackage.apqj.c(apppVar2);
                if (appbVarC == null && (appbVarC = defpackage.apqj.c(apppVarE)) == null) {
                    appbVarC = defpackage.apqj.d(defpackage.appp.a);
                }
                size = listB2.size();
                while (i < size) {
                    apoyVar.I(appbVar);
                    apoyVar.I(appbVarC);
                }
                size2 = listB.size();
                while (i2 < size2) {
                    apoyVar.I((appb) listB.get(i2));
                    apoyVar.I(appbVarC);
                    i2++;
                }
                apppVarE = defpackage.apqj.f(apoyVar);
            }
        }
        java.net.URL resource = ((defpackage.apqp) this.h).d.getResource(apppVarE.toString());
        if (resource == null) {
            java.util.Objects.toString(apppVar);
            throw new java.io.FileNotFoundException("file not found: ".concat(java.lang.String.valueOf(apppVar)));
        }
        java.net.URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof java.net.JarURLConnection) {
            ((java.net.JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        java.io.InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        aooh.e(inputStream, "getInputStream(...)");
        return aoov.aN(inputStream);
    }
}
