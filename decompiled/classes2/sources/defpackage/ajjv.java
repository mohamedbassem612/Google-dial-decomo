package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ajjv implements defpackage.ajmy {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ajjv(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ajmy
    public final java.lang.Object a(defpackage.ajex ajexVar, anyd anydVar) throws java.security.GeneralSecurityException {
        defpackage.ajst ajstVarAp;
        defpackage.ajst ajstVarAp2;
        int i = this.$cid;
        int i2 = 0;
        if (i == 0) {
            if (!defpackage.ajnf.b(ajexVar)) {
                throw new java.security.GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            java.util.HashMap map = new java.util.HashMap();
            while (i2 < ajexVar.a()) {
                defpackage.ajew ajewVarC = ajexVar.c(i2);
                if (ajewVarC.b.equals(defpackage.ajeq.a)) {
                    ajen ajenVar = (ajen) anydVar.a(ajewVarC);
                    ajkb ajkbVarA = ajewVarC.a();
                    if (ajkbVarA instanceof ajkb) {
                        ajstVarAp = ajkbVarA.as();
                    } else {
                        if (!(ajkbVarA instanceof ajlx)) {
                            throw new java.security.GeneralSecurityException("Cannot get output prefix for key of class " + ajkbVarA.getClass().getName() + " with parameters " + ajkbVarA.ac().toString());
                        }
                        ajstVarAp = ((ajlx) ajkbVarA).ap();
                    }
                    aftt.G(ajstVarAp, new amwp(ajenVar, ajewVarC.c), map);
                }
                i2++;
            }
            if (((defpackage.ajlz) ajexVar.b(defpackage.ajlz.class)) == null) {
                return new defpackage.ajkv(aftt.F(map));
            }
            throw null;
        }
        if (i != 1) {
            if (i == 2) {
                if (!defpackage.ajnf.b(ajexVar)) {
                    throw new java.security.GeneralSecurityException("keyset doesn't contain a valid primary key");
                }
                if (((defpackage.ajlz) ajexVar.b(defpackage.ajlz.class)) != null) {
                    throw null;
                }
                return new defpackage.ajku();
            }
            if (!defpackage.ajnf.b(ajexVar)) {
                throw new java.security.GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (i2 < ajexVar.a()) {
                defpackage.ajew ajewVarC2 = ajexVar.c(i2);
                if (ajewVarC2.b.equals(defpackage.ajeq.a)) {
                    arrayList.add((defpackage.ajfl) anydVar.a(ajewVarC2));
                }
                i2++;
            }
            defpackage.ajfl ajflVar = (defpackage.ajfl) anydVar.a(ajexVar.d());
            if (ajflVar != null) {
                return new defpackage.ajrl(arrayList, ajflVar);
            }
            throw new java.security.GeneralSecurityException("No primary set");
        }
        if (!defpackage.ajnf.b(ajexVar)) {
            throw new java.security.GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        java.util.HashMap map2 = new java.util.HashMap();
        for (int i3 = 0; i3 < ajexVar.a(); i3++) {
            defpackage.ajew ajewVarC3 = ajexVar.c(i3);
            if (ajewVarC3.b.equals(defpackage.ajeq.a)) {
                ajfv ajfvVarA = ajewVarC3.a();
                if (ajfvVarA instanceof ajfv) {
                    ajstVarAp2 = ajfvVarA.ap();
                } else {
                    if (!(ajfvVarA instanceof ajlx)) {
                        throw new java.security.GeneralSecurityException("Cannot get output prefix for key of class " + ajfvVarA.getClass().getName() + " with parameters " + ajfvVarA.ac().toString());
                    }
                    ajstVarAp2 = ((ajlx) ajfvVarA).ap();
                }
                int i4 = ajewVarC3.c;
                aftt.G(ajstVarAp2, new aftt(), map2);
            }
        }
        if (((defpackage.ajlz) ajexVar.b(defpackage.ajlz.class)) != null) {
            throw null;
        }
        ajexVar.d();
        aftt.F(map2);
        return new defpackage.ajil(0);
    }
}
