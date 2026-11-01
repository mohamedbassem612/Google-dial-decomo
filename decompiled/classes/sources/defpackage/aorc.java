package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aorc extends defpackage.aojj implements j$.util.Collection, java.util.Collection, defpackage.aoow {
    final /* synthetic */ defpackage.aord a;

    public aorc(defpackage.aord aordVar) {
        this.a = aordVar;
    }

    @Override // defpackage.aojj
    public final int a() {
        return this.a.a.groupCount() + 1;
    }

    public final defpackage.aoqz b(int i) {
        java.util.regex.Matcher matcher = this.a.a;
        defpackage.aopq aopqVarC = defpackage.aooc.C(matcher.start(i), matcher.end(i));
        if (aopqVarC.c().intValue() < 0) {
            return null;
        }
        java.lang.String strGroup = matcher.group(i);
        defpackage.aooh.e(strGroup, "group(...)");
        return new defpackage.aoqz(strGroup, aopqVarC);
    }

    @Override // defpackage.aojj, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj == null || (obj instanceof defpackage.aoqz)) {
            return super.contains((defpackage.aoqz) obj);
        }
        return false;
    }

    @Override // defpackage.aojj, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new aoqu(new aoqt(defpackage.ajsz.ch(defpackage.ajsz.bf(this)), new agkc(this, 16), 2));
    }
}
