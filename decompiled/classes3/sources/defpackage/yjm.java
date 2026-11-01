package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class yjm {
    private static final java.util.Map a;

    static {
        java.util.HashMap map = new java.util.HashMap(13);
        a = map;
        map.put("normal", 400);
        map.put("bold", 700);
        map.put("bolder", 1);
        map.put("lighter", -1);
        map.put("100", 100);
        map.put("200", 200);
        map.put("300", 300);
        map.put("400", 400);
        map.put("500", 500);
        map.put("600", 600);
        map.put("700", 700);
        map.put("800", 800);
        map.put("900", 900);
    }

    public static java.lang.Integer a(java.lang.String str) {
        return (java.lang.Integer) a.get(str);
    }
}
