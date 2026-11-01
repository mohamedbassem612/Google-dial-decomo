package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahzf {
    public final boolean a;
    public final int b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public ahzf(java.lang.String str, java.lang.String str2, boolean z) {
        this.c = str;
        this.d = str2;
        this.b = 4225;
        this.a = z;
    }

    public static defpackage.ahzf b(char c) {
        return new defpackage.ahzf(new defpackage.ahyy(new defpackage.ahxd(c)));
    }

    public static defpackage.ahzf c(defpackage.ahxn ahxnVar) {
        ahxnVar.getClass();
        return new defpackage.ahzf(new defpackage.ahyy(ahxnVar));
    }

    public static defpackage.ahzf d(java.lang.String str) {
        defpackage.ahvr.bN(!str.isEmpty(), "The separator may not be the empty string.");
        return str.length() == 1 ? b(str.charAt(0)) : new defpackage.ahzf(new ahyz(str, 1));
    }

    public static defpackage.ahzf e(java.lang.String str) {
        ahyf ahyfVar = new ahyf(java.util.regex.Pattern.compile(str));
        defpackage.ahvr.bR(!((java.util.regex.Matcher) ahyfVar.a("").a).matches(), "The pattern may not match the empty string: %s", ahyfVar);
        return new defpackage.ahzf(new ahyz(ahyfVar, 0));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [ahze, java.lang.Object] */
    public final defpackage.ahzf a() {
        return new defpackage.ahzf(this.d, true, (defpackage.ahxn) this.c, this.b);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ahze, java.lang.Object] */
    public final defpackage.ahzf f() {
        defpackage.ahxn ahxnVar = defpackage.ahxm.b;
        ahxnVar.getClass();
        return new defpackage.ahzf(this.d, this.a, ahxnVar, this.b);
    }

    public final j$.util.stream.Stream g(java.lang.CharSequence charSequence) {
        return j$.util.stream.StreamSupport.stream(j$.lang.Iterable.-EL.spliterator(h(charSequence)), false);
    }

    public final java.lang.Iterable h(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        return new defpackage.ahzd(this, charSequence);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ahze, java.lang.Object] */
    public final java.util.Iterator i(java.lang.CharSequence charSequence) {
        return this.d.a(this, charSequence);
    }

    public final java.util.List j(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        java.util.Iterator itI = i(charSequence);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (itI.hasNext()) {
            arrayList.add((java.lang.String) itI.next());
        }
        return j$.util.DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [ahze, java.lang.Object] */
    public final defpackage.ahzf k() {
        defpackage.ahvr.bP(true, "must be greater than zero: %s", 2);
        return new defpackage.ahzf(this.d, this.a, (defpackage.ahxn) this.c, 2);
    }

    private ahzf(defpackage.ahze ahzeVar, boolean z, defpackage.ahxn ahxnVar, int i) {
        this.d = ahzeVar;
        this.a = z;
        this.c = ahxnVar;
        this.b = i;
    }

    public ahzf(defpackage.ahze ahzeVar) {
        this(ahzeVar, false, defpackage.ahxk.a, Integer.MAX_VALUE);
    }
}
