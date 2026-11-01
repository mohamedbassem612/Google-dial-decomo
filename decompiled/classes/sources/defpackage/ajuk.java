package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajuk implements defpackage.ajtq {
    public final java.util.Set a;
    public final defpackage.ajtq b;
    private final java.util.Set c;
    private final java.util.Set d;

    public ajuk(defpackage.ajtp ajtpVar, defpackage.ajtq ajtqVar) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.HashSet hashSet3 = new java.util.HashSet();
        java.util.HashSet hashSet4 = new java.util.HashSet();
        java.util.HashSet hashSet5 = new java.util.HashSet();
        for (defpackage.ajtx ajtxVar : ajtpVar.c) {
            if (ajtxVar.a()) {
                if (ajtxVar.b()) {
                    hashSet4.add(ajtxVar.a);
                } else {
                    hashSet.add(ajtxVar.a);
                }
            } else if (ajtxVar.b()) {
                hashSet5.add(ajtxVar.a);
            } else {
                hashSet2.add(ajtxVar.a);
            }
        }
        if (!ajtpVar.g.isEmpty()) {
            hashSet.add(new defpackage.ajui(defpackage.ajuh.class, defpackage.ajvn.class));
        }
        this.c = j$.util.DesugarCollections.unmodifiableSet(hashSet);
        this.d = j$.util.DesugarCollections.unmodifiableSet(hashSet2);
        j$.util.DesugarCollections.unmodifiableSet(hashSet3);
        this.a = j$.util.DesugarCollections.unmodifiableSet(hashSet4);
        j$.util.DesugarCollections.unmodifiableSet(hashSet5);
        java.util.Set set = ajtpVar.g;
        this.b = ajtqVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ajtz */
    @Override // defpackage.ajtq
    public final defpackage.ajwe a(defpackage.ajui ajuiVar) throws ajtz {
        if (this.d.contains(ajuiVar)) {
            return this.b.a(ajuiVar);
        }
        throw new ajtz(java.lang.String.format("Attempting to request an undeclared dependency Provider<%s>.", ajuiVar));
    }

    @Override // defpackage.ajtq
    public final defpackage.ajwe b(java.lang.Class cls) {
        return a(new defpackage.ajui(defpackage.ajuh.class, cls));
    }

    @Override // defpackage.ajtq
    public final defpackage.ajwe c(defpackage.ajui ajuiVar) {
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ajtz */
    @Override // defpackage.ajtq
    public final java.lang.Object d(defpackage.ajui ajuiVar) throws ajtz {
        if (this.c.contains(ajuiVar)) {
            return defpackage.ajsz.q(this.b, ajuiVar);
        }
        throw new ajtz(java.lang.String.format("Attempting to request an undeclared dependency %s.", ajuiVar));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ajtz */
    @Override // defpackage.ajtq
    public final java.lang.Object e(java.lang.Class cls) throws ajtz {
        if (!this.c.contains(new defpackage.ajui(defpackage.ajuh.class, cls))) {
            throw new ajtz(java.lang.String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        java.lang.Object objR = defpackage.ajsz.r(this.b, cls);
        if (!cls.equals(defpackage.ajvn.class)) {
            return objR;
        }
        return new ajuj();
    }
}
