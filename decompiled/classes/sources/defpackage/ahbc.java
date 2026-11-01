package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahbc {
    public static final defpackage.ahbc a;
    public final defpackage.aigf b;
    private final defpackage.aigf c;

    static {
        defpackage.aikn aiknVar = defpackage.aikn.a;
        a = new defpackage.ahbc(aiknVar, aiknVar);
    }

    public ahbc(java.util.Set set, java.util.Set set2) {
        defpackage.aigb aigbVar = new defpackage.aigb(4);
        defpackage.ailj it = ((defpackage.aikn) set2).iterator();
        while (it.hasNext()) {
            ((defpackage.ahaw) it.next()).a(aigbVar);
        }
        this.c = aigbVar.e(true);
        defpackage.aigb aigbVar2 = new defpackage.aigb(4);
        java.util.Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            ((defpackage.ahaw) it2.next()).a(aigbVar2);
        }
        this.b = aigbVar2.e(true);
    }

    public final defpackage.ahbb a(java.lang.String str) {
        defpackage.ahbb ahbbVar = (defpackage.ahbb) this.c.get(str);
        return ahbbVar == null ? (defpackage.ahbb) this.b.get(str) : ahbbVar;
    }

    public final defpackage.aihd b() {
        return this.b.keySet();
    }
}
