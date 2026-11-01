package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aifx extends defpackage.aify {
    final transient int a;
    final transient int b;
    final /* synthetic */ defpackage.aify c;

    public aifx(defpackage.aify aifyVar, int i, int i2) {
        j$.util.Objects.requireNonNull(aifyVar);
        this.c = aifyVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.aify
    /* JADX INFO: renamed from: b */
    public final defpackage.aify subList(int i, int i2) {
        defpackage.ahvr.bX(i, i2, this.b);
        int i3 = this.a;
        return this.c.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.aifo
    public final int e() {
        return this.c.f() + this.a + this.b;
    }

    @Override // defpackage.aifo
    public final int f() {
        return this.c.f() + this.a;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        defpackage.ahvr.ch(i, this.b);
        return this.c.get(i + this.a);
    }

    @Override // defpackage.aifo
    public final boolean l() {
        return true;
    }

    @Override // defpackage.aifo
    public final java.lang.Object[] m() {
        return this.c.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // defpackage.aify, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.aify, defpackage.aifo
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
