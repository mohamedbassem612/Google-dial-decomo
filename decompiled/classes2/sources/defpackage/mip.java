package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mip {
    public static final aec a;
    public static final aec b;

    static {
        aec aecVar = new aec(0);
        a = aecVar;
        aec aecVar2 = new aec(0);
        b = aecVar2;
        aecVar.put("bul", defpackage.mil.b);
        aecVar.put("rus", defpackage.min.b);
        aecVar.put("ukr", defpackage.mio.b);
        aecVar2.put("bul", defpackage.mil.a);
        aecVar2.put("rus", defpackage.min.a);
        aecVar2.put("ukr", defpackage.mio.a);
    }

    public static aec a(java.lang.String str) {
        aec aecVar = (aec) a.get(str);
        ahvr.cl(aecVar, "No character mappings can be found for language code '%s'", str);
        return aecVar;
    }

    public static aec b(java.lang.String[] strArr) {
        aec aecVar = new aec(0);
        int i = 0;
        while (i < 12) {
            java.lang.String str = strArr[i];
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (java.lang.Character.isAlphabetic(cCharAt)) {
                    java.lang.Character chValueOf = java.lang.Character.valueOf(java.lang.Character.toLowerCase(cCharAt));
                    ahvr.bM(i >= 0 && i <= 11);
                    aecVar.put(chValueOf, java.lang.Character.valueOf(i != 10 ? i != 11 ? (char) (i + 48) : '#' : '*'));
                }
            }
            i++;
        }
        return aecVar;
    }
}
