package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afit implements defpackage.aoin {
    private static final java.util.List d;
    public volatile defpackage.afis c;
    private final java.lang.String e;
    public final java.lang.Object b = new java.lang.Object();
    public final java.util.Map a = new java.util.HashMap(10);

    static {
        new defpackage.afit("");
        d = new java.util.ArrayList();
    }

    private afit(java.lang.String str) {
        this.e = str;
    }

    public static long b(java.lang.String str) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
            return java.nio.ByteBuffer.wrap(messageDigest.digest()).getLong();
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static synchronized defpackage.afit d(java.lang.String str) {
        java.util.List<defpackage.afit> list = d;
        for (defpackage.afit afitVar : list) {
            if (afitVar.e.equals(str)) {
            }
        }
        afitVar = new defpackage.afit(str);
        list.add(afitVar);
        return afitVar;
    }

    @Override // defpackage.aoin, defpackage.aoim
    public final /* synthetic */ java.lang.Object a() {
        return this.c;
    }

    public final defpackage.afim c(java.lang.String str, defpackage.afio... afioVarArr) {
        defpackage.afim afimVar;
        synchronized (this.b) {
            java.util.Map map = this.a;
            afimVar = (defpackage.afim) map.get(str);
            if (afimVar != null) {
                afimVar.f(afioVarArr);
            } else {
                afimVar = new defpackage.afim(str, this, afioVarArr);
                map.put(afimVar.b, afimVar);
            }
        }
        return afimVar;
    }

    public final defpackage.afip e(java.lang.String str, defpackage.afio... afioVarArr) {
        defpackage.afip afipVar;
        synchronized (this.b) {
            java.util.Map map = this.a;
            afipVar = (defpackage.afip) map.get(str);
            if (afipVar != null) {
                afipVar.f(afioVarArr);
            } else {
                afipVar = new defpackage.afip(str, this, afioVarArr);
                map.put(afipVar.b, afipVar);
            }
        }
        return afipVar;
    }
}
