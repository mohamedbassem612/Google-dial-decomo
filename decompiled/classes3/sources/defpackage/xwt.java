package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xwt implements java.lang.Iterable {
    public final java.util.List a;

    public xwt(java.util.List list) {
        this.a = list;
    }

    final int a() {
        return this.a.size();
    }

    final defpackage.xwt b() {
        return new defpackage.xwt(new java.util.ArrayList(this.a));
    }

    final boolean c(defpackage.yeq yeqVar) {
        return this.a.contains(new defpackage.xws(yeqVar, defpackage.yfu.b));
    }

    final boolean d() {
        return this.a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.a.iterator();
    }
}
