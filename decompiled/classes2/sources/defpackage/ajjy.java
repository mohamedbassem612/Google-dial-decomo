package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajjy {
    private static final ajel a;

    static {
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        java.util.HashMap map3 = new java.util.HashMap();
        java.util.HashMap map4 = new java.util.HashMap();
        java.util.HashMap map5 = new java.util.HashMap();
        java.util.HashMap map6 = new java.util.HashMap();
        java.util.HashMap map7 = new java.util.HashMap();
        ajel ajelVar = defpackage.ajjw.a;
        ajel ajelVar2 = ajir.a() ? defpackage.ajjw.b : defpackage.ajjw.a;
        if (!(ajelVar2 instanceof ajmr)) {
            throw new java.lang.IllegalArgumentException("Configuration parameter must be created by a ProtoBasedConfigurationBuilder");
        }
        ajmr ajmrVar = (ajmr) ajelVar2;
        for (java.util.Map.Entry entry : ajmrVar.a.entrySet()) {
            if (map.containsKey(entry.getKey())) {
                throw new java.lang.IllegalArgumentException("KeyCreator for " + java.lang.String.valueOf(entry.getKey()) + " already added.");
            }
            map.put((java.lang.Class) entry.getKey(), (ajlq) entry.getValue());
        }
        for (java.util.Map.Entry entry2 : ajmrVar.b.entrySet()) {
            defpackage.ajmx ajmxVar = (defpackage.ajmx) entry2.getKey();
            if (map2.containsKey(ajmxVar)) {
                throw new java.lang.IllegalArgumentException("PrimitiveConstructor for " + java.lang.String.valueOf(ajmxVar.a) + " and primitive " + ajmxVar.b.toString() + " already added.");
            }
            map2.put(ajmxVar, (ajmo) entry2.getValue());
        }
        for (java.util.Map.Entry entry3 : ajmrVar.c.entrySet()) {
            java.lang.Class cls = (java.lang.Class) entry3.getKey();
            if (map3.containsKey(cls)) {
                throw new java.lang.IllegalArgumentException(hgb.i(cls, "PrimitiveWrapper for ", " already added."));
            }
            map3.put(cls, (apjb) entry3.getValue());
        }
        ajms ajmsVar = ajmrVar.d;
        for (java.util.Map.Entry entry4 : ajmsVar.a.entrySet()) {
            if (map4.containsKey(entry4.getKey())) {
                throw new java.lang.IllegalArgumentException("KeySerializer for " + java.lang.String.valueOf(entry4.getKey()) + " already added.");
            }
            map4.put((java.lang.Class) entry4.getKey(), (defpackage.ajmu) entry4.getValue());
        }
        for (java.util.Map.Entry entry5 : ajmsVar.b.entrySet()) {
            if (map5.containsKey(entry5.getKey())) {
                throw new java.lang.IllegalArgumentException("ParametersSerializer for " + java.lang.String.valueOf(entry5.getKey()) + " already added.");
            }
            map5.put((java.lang.Class) entry5.getKey(), (ajmw) entry5.getValue());
        }
        for (java.util.Map.Entry entry6 : ajmsVar.c.entrySet()) {
            if (map6.containsKey(entry6.getKey())) {
                throw new java.lang.IllegalArgumentException("KeyParser for " + ((java.lang.String) entry6.getKey()) + " already added.");
            }
            map6.put((java.lang.String) entry6.getKey(), (defpackage.ajmt) entry6.getValue());
        }
        for (java.util.Map.Entry entry7 : ajmsVar.d.entrySet()) {
            if (map7.containsKey(entry7.getKey())) {
                throw new java.lang.IllegalArgumentException("ParametersParser for " + ((java.lang.String) entry7.getKey()) + " already added.");
            }
            map7.put((java.lang.String) entry7.getKey(), (ajmv) entry7.getValue());
        }
        ajsz.m(new defpackage.ajfo(11), ajlx.class, ajeo.class, map2);
        ajsz.m(new defpackage.ajfo(12), ajlx.class, ajen.class, map2);
        a = ajsz.g(map, map2, map3, map4, map5, map6, map7);
    }

    public static ajel a() throws java.security.GeneralSecurityException {
        if (ajir.a()) {
            throw new java.security.GeneralSecurityException("Cannot use non-FIPS-compliant HybridConfigurationV0 in FIPS mode");
        }
        return a;
    }

    public static aiql b(ajlx ajlxVar) {
        ajff ajffVar = (ajff) a().a(ajff.class);
        if (ajffVar == null) {
            throw new java.security.GeneralSecurityException("Unexpected: CONFIGURATION does not support Proto Serialization");
        }
        defpackage.ajfk ajfkVar = defpackage.ajfk.a;
        return ajffVar.a(ajlxVar.aq(ajfkVar), ajfkVar);
    }
}
