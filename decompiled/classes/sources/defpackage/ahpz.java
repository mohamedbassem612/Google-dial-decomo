package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahpz {
    public final int a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public ahpz(defpackage.ahqj ahqjVar, defpackage.aoin aoinVar, java.util.Set set) {
        this.b = ahqjVar;
        this.a = 2;
        defpackage.ahou ahouVarD = defpackage.ahou.d(set);
        defpackage.aooh.e(ahouVarD, "copyCombine(...)");
        this.d = ahouVarD;
        this.c = new defpackage.ahbo(aoinVar, this, 2);
    }

    @yph
    public final defpackage.ahok a(int i, java.lang.Class cls, @ypi java.lang.String str) {
        defpackage.aooh.f(cls, "clazz");
        return i(cls.getSimpleName() + ": " + str, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ahqj, java.lang.Object] */
    @yph
    public final defpackage.ahok b(int i, long j, long j2) {
        java.lang.Object objA = this.c.a();
        defpackage.aooh.e(objA, "get(...)");
        return this.b.b((defpackage.ahou) objA, j, j2, 2, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ahqj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [aoin, java.lang.Object] */
    @yph
    public final defpackage.ahok c(int i, @ypi java.lang.String str, defpackage.ahou ahouVar) {
        if (str == null) {
            defpackage.aooh.i("name");
        }
        if (ahouVar == null) {
            defpackage.aooh.i("extras");
        }
        ?? r0 = this.b;
        defpackage.ahou ahouVarE = defpackage.ahou.e((defpackage.ahou) this.c.a(), ahouVar);
        defpackage.aooh.e(ahouVarE, "copyCombine(...)");
        return r0.a(str, ahouVarE, 2, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ahqj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [aoin, java.lang.Object] */
    @yph
    public final defpackage.ahpi d(int i, @ypi java.lang.String str, defpackage.ahou ahouVar) {
        if (ahouVar == null) {
            defpackage.aooh.i("extras");
        }
        ?? r0 = this.b;
        defpackage.ahou ahouVarE = defpackage.ahou.e((defpackage.ahou) this.c.a(), ahouVar);
        defpackage.aooh.e(ahouVarE, "copyCombine(...)");
        return r0.c(str, ahouVarE, 2, i);
    }

    @yph
    public final android.text.TextWatcher e(int i, android.text.TextWatcher textWatcher, @ypi java.lang.String str) {
        defpackage.aooh.f(textWatcher, "watcher");
        return new ahpy(this, i, str, textWatcher);
    }

    @yph
    public final defpackage.ahok f(int i, @ypi java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("name");
        }
        return i(str, i);
    }

    @yph
    public final defpackage.ahok g(int i, @ypi java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("name");
        }
        defpackage.ahou ahouVar = defpackage.ahot.a;
        defpackage.aooh.e(ahouVar, "empty(...)");
        return c(i, str, ahouVar);
    }

    @yph
    public final defpackage.ahpm h(int i, @ypi java.lang.String str) {
        if (!defpackage.agab.aw()) {
            return new ahnv(4);
        }
        defpackage.ahou ahouVar = defpackage.ahot.a;
        defpackage.aooh.e(ahouVar, "empty(...)");
        return d(i, str, ahouVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [ahqj, java.lang.Object] */
    public final defpackage.ahok i(java.lang.String str, int i) {
        java.lang.Object objA = this.c.a();
        defpackage.aooh.e(objA, "get(...)");
        return this.b.a(str, (defpackage.ahou) objA, 2, i);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [aemh, java.lang.Object] */
    public final defpackage.ajcq j(boolean z) {
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        ?? r2 = this.d;
        defpackage.ajcq ajcqVarA = z ? r2.a() : r2.c();
        defpackage.ahvr.J(ajcqVarA, new defpackage.aene(this, z, epochMilli), defpackage.ajbm.INSTANCE);
        return ajcqVarA;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aemh, java.lang.Object] */
    public final defpackage.ajcq k(boolean z, java.lang.String str, int i) {
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        ?? r0 = this.d;
        defpackage.ajcq ajcqVarF = z ? r0.f(str, i) : r0.g(str, i);
        defpackage.ahvr.J(ajcqVarF, new aend(this, i, z, epochMilli), defpackage.ajbm.INSTANCE);
        return ajcqVarF;
    }

    public ahpz(defpackage.aemh aemhVar, int i, defpackage.adai adaiVar, java.lang.String str) {
        this.d = aemhVar;
        this.b = adaiVar;
        this.a = i;
        this.c = str;
    }
}
