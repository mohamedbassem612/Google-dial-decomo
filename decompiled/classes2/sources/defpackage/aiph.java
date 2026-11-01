package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aiph extends aipi {
    private final java.util.Map a;

    public aiph(aior aiorVar, aior aiorVar2) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        e(linkedHashMap, aiorVar);
        e(linkedHashMap, aiorVar2);
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            if (((ainp) entry.getKey()).b) {
                entry.setValue(j$.util.DesugarCollections.unmodifiableList((java.util.List) entry.getValue()));
            }
        }
        this.a = j$.util.DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    private static void e(java.util.Map map, aior aiorVar) {
        for (int i = 0; i < aiorVar.b(); i++) {
            ainp ainpVarC = aiorVar.c(i);
            java.lang.Object obj = map.get(ainpVarC);
            if (ainpVarC.b) {
                java.util.List arrayList = (java.util.List) obj;
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                    map.put(ainpVarC, arrayList);
                }
                arrayList.add(ainpVarC.c(aiorVar.e(i)));
            } else {
                map.put(ainpVarC, ainpVarC.c(aiorVar.e(i)));
            }
        }
    }

    public final int a() {
        return this.a.size();
    }

    public final java.lang.Object b(ainp ainpVar) {
        aiql.j(!ainpVar.b, "key must be single valued");
        java.lang.Object obj = this.a.get(ainpVar);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final java.util.Set c() {
        return this.a.keySet();
    }

    public final void d(aioy aioyVar, java.lang.Object obj) {
        for (java.util.Map.Entry entry : this.a.entrySet()) {
            ainp ainpVar = (ainp) entry.getKey();
            java.lang.Object value = entry.getValue();
            if (ainpVar.b) {
                aioyVar.b(ainpVar, ((java.util.List) value).iterator(), obj);
            } else {
                aioyVar.a(ainpVar, value, obj);
            }
        }
    }
}
