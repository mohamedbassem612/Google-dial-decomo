package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class akcl extends defpackage.anni {
    private final java.util.Map b;
    private final java.lang.Object c = new java.lang.Object();
    private final java.util.Map d = new java.util.HashMap();
    private final java.util.Map e = new java.util.HashMap();
    private final j$.util.concurrent.ConcurrentHashMap f = new j$.util.concurrent.ConcurrentHashMap();
    private static final aimz a = aimz.i("com/google/frameworks/client/data/android/server/LazyServicesHandlerRegistry");
    private static final defpackage.apjb h = new defpackage.apjb((java.lang.Object) null, (java.lang.Object) null);
    private static final defpackage.apjb g = defpackage.antw.y("not_found", null, new java.util.HashMap());

    public akcl(java.util.Map map) {
        this.b = map;
    }

    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.anni
    public final defpackage.apjb a(java.lang.String str) {
        int iIndexOf;
        defpackage.apjb apjbVarB;
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f;
        defpackage.apjb apjbVar = (defpackage.apjb) concurrentHashMap.get(str);
        if (apjbVar == null && (iIndexOf = str.indexOf(47)) > 0) {
            java.lang.String strSubstring = str.substring(0, iIndexOf);
            synchronized (this.c) {
                java.util.Map map = this.e;
                defpackage.apjb apjbVar2 = (defpackage.apjb) map.get(strSubstring);
                if (apjbVar2 == null) {
                    aoin aoinVar = (aoin) this.b.get(strSubstring);
                    if (aoinVar != null) {
                        defpackage.anlx anlxVar = (defpackage.anlx) aoinVar.a();
                        this.d.put(strSubstring, anlxVar);
                        apjbVarB = anlxVar.b();
                    } else {
                        a.d().l("com/google/frameworks/client/data/android/server/LazyServicesHandlerRegistry", "initService", 113, "LazyServicesHandlerRegistry.java").y("No factory available for service %s.", strSubstring);
                        apjbVarB = g;
                    }
                    apjbVar2 = apjbVarB;
                    map.put(strSubstring, apjbVar2);
                }
                defpackage.apjb apjbVar3 = apjbVar2 != g ? (defpackage.apjb) apjbVar2.b.get(str) : null;
                if (apjbVar3 == null) {
                    apjbVar3 = h;
                }
                apjbVar = apjbVar3;
                concurrentHashMap.put(str, apjbVar);
            }
        }
        if (apjbVar != h) {
            return apjbVar;
        }
        return null;
    }
}
