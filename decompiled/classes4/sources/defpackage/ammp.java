package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ammp {
    public final java.util.Map a = new java.util.HashMap();

    public final java.lang.String a(java.lang.String str) {
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.US);
        java.util.Map map = this.a;
        if (!map.containsKey(lowerCase)) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        boolean z = true;
        for (java.lang.String str2 : (java.util.List) map.get(str.toLowerCase(java.util.Locale.US))) {
            if (str2 != null) {
                if (!z) {
                    sb.append(',');
                }
                sb.append(str2);
                z = false;
            }
        }
        return sb.toString();
    }

    public final java.util.List b(java.lang.String str) {
        java.util.List list = (java.util.List) this.a.get(str.toLowerCase(java.util.Locale.US));
        return list == null ? aike.a : list;
    }

    public final java.util.Set c() {
        return j$.util.DesugarCollections.unmodifiableSet(this.a.keySet());
    }

    public final void d(java.lang.String str, java.lang.String str2) {
        boolean z = false;
        if (str != null && !str.isEmpty()) {
            z = true;
        }
        ahvr.bM(z);
        ahvr.ci(str2);
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.US);
        java.util.Map map = this.a;
        map.put(lowerCase, new java.util.ArrayList());
        ((java.util.List) map.get(lowerCase)).add(str2);
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.a.entrySet());
        java.util.Collections.sort(arrayList, new aeov(5));
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        new defpackage.apjb(new ahyj(", ")).y(sb, arrayList);
        sb.append('}');
        return sb.toString();
    }
}
