package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajto {
    public java.lang.String a = null;
    public int b;
    public defpackage.ajtr c;
    private final java.util.Set d;
    private final java.util.Set e;
    private int f;
    private final java.util.Set g;

    @java.lang.SafeVarargs
    public ajto(java.lang.Class cls, java.lang.Class... clsArr) {
        java.util.HashSet hashSet = new java.util.HashSet();
        this.d = hashSet;
        this.e = new java.util.HashSet();
        this.f = 0;
        this.b = 0;
        this.g = new java.util.HashSet();
        hashSet.add(new defpackage.ajui(defpackage.ajuh.class, cls));
        for (java.lang.Class cls2 : clsArr) {
            defpackage.anty.aI(cls2, "Null interface");
            this.d.add(new defpackage.ajui(defpackage.ajuh.class, cls2));
        }
    }

    public final defpackage.ajtp a() {
        defpackage.ajsz.I(this.c != null, "Missing required property: factory.");
        return new defpackage.ajtp(this.a, new java.util.HashSet(this.d), new java.util.HashSet(this.e), this.f, this.b, this.c, this.g);
    }

    public final void b(defpackage.ajtx ajtxVar) {
        if (this.d.contains(ajtxVar.a)) {
            throw new java.lang.IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.e.add(ajtxVar);
    }

    public final void c() {
        defpackage.ajsz.I(1 == (this.f ^ 1), "Instantiation type has already been set.");
        this.f = 1;
    }

    @java.lang.SafeVarargs
    public ajto(defpackage.ajui ajuiVar, defpackage.ajui... ajuiVarArr) {
        java.util.HashSet hashSet = new java.util.HashSet();
        this.d = hashSet;
        this.e = new java.util.HashSet();
        this.f = 0;
        this.b = 0;
        this.g = new java.util.HashSet();
        hashSet.add(ajuiVar);
        for (defpackage.ajui ajuiVar2 : ajuiVarArr) {
            defpackage.anty.aI(ajuiVar2, "Null interface");
        }
        java.util.Collections.addAll(this.d, ajuiVarArr);
    }
}
