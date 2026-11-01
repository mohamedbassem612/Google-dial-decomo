package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akfy {
    public static final defpackage.akfy a;
    private static final java.util.Set b;
    private final akgs c;
    private final java.util.Map d = defpackage.akfk.a;

    /* JADX WARN: Type inference failed for: r1v1, types: [akgs, java.lang.Object] */
    static {
        java.util.logging.Logger.getLogger(defpackage.akfy.class.getName());
        a = new defpackage.akfy(apdi.f().b);
        java.util.HashSet hashSet = new java.util.HashSet();
        b = hashSet;
        hashSet.add(akfg.G);
        hashSet.add(akfg.W);
        hashSet.add(akfg.cv);
    }

    public akfy(akgs akgsVar) {
        this.c = akgsVar;
    }

    public final boolean a(defpackage.akgu akguVar) {
        java.util.List<akfg> list = (java.util.List) this.d.get(java.lang.Integer.valueOf(akguVar.c));
        if (list == null) {
            list = java.util.Collections.EMPTY_LIST;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (akguVar.f) {
            char[] cArr = new char[akguVar.g];
            java.util.Arrays.fill(cArr, '0');
            sb.append(new java.lang.String(cArr));
        }
        sb.append(akguVar.d);
        int length = sb.toString().length();
        for (akfg akfgVar : list) {
            defpackage.akft akftVarB = null;
            if (akfgVar != null) {
                try {
                    akgt akgtVar = this.c;
                    ahvr.bM(defpackage.akgb.a(akfgVar));
                    akftVarB = akgtVar.b.d(akgtVar.a.U(akfgVar)).b(akfgVar);
                } catch (java.lang.IllegalArgumentException unused) {
                }
            }
            if (akftVarB != null) {
                defpackage.akfv akfvVar = akftVarB.c;
                if (akfvVar == null) {
                    akfvVar = defpackage.akfv.a;
                }
                if (akfvVar.d.contains(java.lang.Integer.valueOf(length))) {
                    return true;
                }
            }
        }
        return false;
    }
}
