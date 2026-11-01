package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afsg {
    public static final int[] a = {2130969322};
    private static final defpackage.afsf b;
    private static final defpackage.afsf c;
    private static final java.util.Map d;
    private static final java.util.Map e;

    static {
        defpackage.afsd afsdVar = new defpackage.afsd();
        b = afsdVar;
        defpackage.afse afseVar = new defpackage.afse();
        c = afseVar;
        java.util.HashMap map = new java.util.HashMap();
        map.put("fcnt", afsdVar);
        map.put("google", afsdVar);
        map.put("hmd global", afsdVar);
        map.put("infinix", afsdVar);
        map.put("infinix mobility limited", afsdVar);
        map.put("itel", afsdVar);
        map.put("kyocera", afsdVar);
        map.put("lenovo", afsdVar);
        map.put("lge", afsdVar);
        map.put("meizu", afsdVar);
        map.put("motorola", afsdVar);
        map.put("nothing", afsdVar);
        map.put("oneplus", afsdVar);
        map.put("oppo", afsdVar);
        map.put("realme", afsdVar);
        map.put("robolectric", afsdVar);
        map.put("samsung", afseVar);
        map.put("sharp", afsdVar);
        map.put("shift", afsdVar);
        map.put("sony", afsdVar);
        map.put("tcl", afsdVar);
        map.put("tecno", afsdVar);
        map.put("tecno mobile limited", afsdVar);
        map.put("vivo", afsdVar);
        map.put("wingtech", afsdVar);
        map.put("xiaomi", afsdVar);
        d = j$.util.DesugarCollections.unmodifiableMap(map);
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("asus", afsdVar);
        map2.put("jio", afsdVar);
        e = j$.util.DesugarCollections.unmodifiableMap(map2);
    }

    private afsg() {
    }

    public static boolean a() {
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return false;
        }
        if (!defpackage.dwz.b()) {
            defpackage.afsf afsfVar = (defpackage.afsf) d.get(android.os.Build.MANUFACTURER.toLowerCase(java.util.Locale.ROOT));
            if (afsfVar == null) {
                afsfVar = (defpackage.afsf) e.get(android.os.Build.BRAND.toLowerCase(java.util.Locale.ROOT));
            }
            if (afsfVar == null || !afsfVar.a()) {
                return false;
            }
        }
        return true;
    }
}
