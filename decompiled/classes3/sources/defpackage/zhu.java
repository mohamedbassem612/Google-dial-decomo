package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zhu {
    public static final java.util.regex.Pattern a = java.util.regex.Pattern.compile(" +");
    private static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("\\W");
    private static defpackage.zhu c = new defpackage.zhu(new defpackage.zhs[0]);
    private static java.lang.Object d;
    private final defpackage.zhs[] e;
    private final java.util.regex.Pattern f;

    public zhu(defpackage.zhs[] zhsVarArr) {
        java.util.Arrays.sort(zhsVarArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        for (int i = 0; i < zhsVarArr.length; i++) {
            if (i > 0) {
                sb.append(")|(");
            }
            sb.append(b.matcher(zhsVarArr[i].b).replaceAll("\\\\$0"));
        }
        sb.append(')');
        this.f = java.util.regex.Pattern.compile(sb.toString());
        this.e = zhsVarArr;
    }

    public static synchronized defpackage.zhu b(android.content.ContentResolver contentResolver) {
        java.util.Map treeMap;
        try {
            aayu aayuVar = aaym.a;
            aayuVar.c(contentResolver);
            aayuVar.e.lock();
            try {
                java.lang.Object obj = aayuVar.j;
                aayuVar.e.unlock();
                if (obj != d) {
                    if (android.util.Log.isLoggable("UrlRules", 2)) {
                        android.util.Log.v("UrlRules", "Scanning for Gservices \"url:*\" rules");
                    }
                    java.lang.String[] strArr = {"url:"};
                    try {
                        aazc aazcVar = aaym.a.k;
                        final int i = 0;
                        treeMap = aazc.a(contentResolver, strArr, new defpackage.aays() { // from class: aayq
                            @Override // defpackage.aays
                            public final java.util.Map a(int i2) {
                                if (i != 0) {
                                    int i3 = aayu.l;
                                    return new java.util.HashMap(i2, 1.0f);
                                }
                                int i4 = aayu.l;
                                return new java.util.TreeMap();
                            }
                        });
                    } catch (aayt unused) {
                        treeMap = new java.util.TreeMap();
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.util.Map.Entry entry : treeMap.entrySet()) {
                        try {
                            java.lang.String strSubstring = ((java.lang.String) entry.getKey()).substring(4);
                            java.lang.String str = (java.lang.String) entry.getValue();
                            if (str != null && str.length() != 0) {
                                if (android.util.Log.isLoggable("UrlRules", 2)) {
                                    android.util.Log.v("UrlRules", hgb.n(str, strSubstring, "  Rule ", ": "));
                                }
                                arrayList.add(new defpackage.zhs(str));
                            }
                        } catch (defpackage.zht e) {
                            android.util.Log.e("UrlRules", "Invalid rule from Gservices", e);
                        }
                    }
                    c = new defpackage.zhu((defpackage.zhs[]) arrayList.toArray(new defpackage.zhs[arrayList.size()]));
                    d = obj;
                    if (android.util.Log.isLoggable("UrlRules", 2)) {
                        java.util.Objects.toString(obj);
                        android.util.Log.v("UrlRules", "New rules stored, versionToken: ".concat(java.lang.String.valueOf(obj)));
                    }
                } else if (android.util.Log.isLoggable("UrlRules", 2)) {
                    java.util.Objects.toString(obj);
                    android.util.Log.v("UrlRules", "Using cached rules, versionToken: ".concat(java.lang.String.valueOf(obj)));
                }
            } catch (java.lang.Throwable th) {
                aayuVar.e.unlock();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            throw th2;
        }
        return c;
    }

    public final defpackage.zhs a(java.lang.String str) {
        java.util.regex.Matcher matcher = this.f.matcher(str);
        if (matcher.lookingAt()) {
            int i = 0;
            while (true) {
                defpackage.zhs[] zhsVarArr = this.e;
                if (i >= zhsVarArr.length) {
                    break;
                }
                int i2 = i + 1;
                if (matcher.group(i2) != null) {
                    return zhsVarArr[i];
                }
                i = i2;
            }
        }
        return defpackage.zhs.a;
    }
}
