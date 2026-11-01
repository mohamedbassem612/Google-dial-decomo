package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xzi {
    private static final java.lang.String a;
    private static final java.util.Map b;
    private boolean c = true;
    private java.util.Map d = b;
    private boolean e = true;

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    static {
        java.lang.String property = java.lang.System.getProperty("http.agent");
        if (!android.text.TextUtils.isEmpty(property)) {
            int length = property.length();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char cCharAt = property.charAt(i);
                if (cCharAt > 31) {
                    if (cCharAt < 127) {
                        sb.append(cCharAt);
                    } else {
                        sb.append('?');
                    }
                } else if (cCharAt == '\t') {
                    cCharAt = '\t';
                    if (cCharAt < 127) {
                        sb.append(cCharAt);
                    } else {
                        sb.append('?');
                    }
                } else {
                    sb.append('?');
                }
            }
            property = sb.toString();
        }
        a = property;
        java.util.HashMap map = new java.util.HashMap(2);
        if (!android.text.TextUtils.isEmpty(property)) {
            map.put("User-Agent", java.util.Collections.singletonList(new defpackage.xzj(property)));
        }
        b = j$.util.DesugarCollections.unmodifiableMap(map);
    }

    private final java.util.List c(java.lang.String str) {
        java.util.List list = (java.util.List) this.d.get(str);
        if (list != null) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.d.put(str, arrayList);
        return arrayList;
    }

    private final void d() {
        if (this.c) {
            this.c = false;
            java.util.HashMap map = new java.util.HashMap(this.d.size());
            for (java.util.Map.Entry entry : this.d.entrySet()) {
                map.put((java.lang.String) entry.getKey(), new java.util.ArrayList((java.util.Collection) entry.getValue()));
            }
            this.d = map;
        }
    }

    public final defpackage.xzk a() {
        this.c = true;
        return new defpackage.xzk(this.d);
    }

    public final void b(java.lang.String str, java.lang.String str2) {
        defpackage.xzj xzjVar = new defpackage.xzj(str2);
        if (!this.e || !"User-Agent".equalsIgnoreCase(str)) {
            d();
            c(str).add(xzjVar);
            return;
        }
        d();
        java.util.List listC = c(str);
        listC.clear();
        listC.add(xzjVar);
        if (this.e && "User-Agent".equalsIgnoreCase(str)) {
            this.e = false;
        }
    }
}
