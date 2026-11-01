package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agih {
    public static defpackage.agih a;
    public final java.util.Map b = new java.util.HashMap();

    public final java.util.Map a(android.content.Context context, java.util.List list) {
        int iIntValue;
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.lang.String[] strArrSplit = str.split(":");
            if (strArrSplit.length != 2) {
                android.util.Log.w("LottieAnimationHelper", "incorrect format customization, value=".concat(java.lang.String.valueOf(str)));
            } else if (strArrSplit[1].charAt(0) == '#') {
                try {
                    map.put(new hcw(new java.lang.String[]{"**", strArrSplit[0], "**"}), java.lang.Integer.valueOf(android.graphics.Color.parseColor(strArrSplit[1])));
                } catch (java.lang.IllegalArgumentException unused) {
                    android.util.Log.e("LottieAnimationHelper", "Unknown color, value=".concat(java.lang.String.valueOf(str)));
                }
            } else if (strArrSplit[1].charAt(0) == '@') {
                java.util.Map map2 = this.b;
                if (map2.containsKey(strArrSplit[1])) {
                    iIntValue = ((java.lang.Integer) map2.get(strArrSplit[1])).intValue();
                } else {
                    int identifier = context.getResources().getIdentifier(strArrSplit[1].substring(1), "color", context.getPackageName());
                    map2.put(strArrSplit[1], java.lang.Integer.valueOf(identifier));
                    iIntValue = identifier;
                }
                try {
                    map.put(new hcw(new java.lang.String[]{"**", strArrSplit[0], "**"}), java.lang.Integer.valueOf(context.getResources().getColor(iIntValue, null)));
                } catch (android.content.res.Resources.NotFoundException unused2) {
                    android.util.Log.e("LottieAnimationHelper", "Resource Not found, resource value=".concat(java.lang.String.valueOf(str)));
                }
            } else {
                android.util.Log.w("LottieAnimationHelper", "incorrect format customization, value=".concat(java.lang.String.valueOf(str)));
            }
        }
        return map;
    }
}
