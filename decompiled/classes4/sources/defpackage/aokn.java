package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aokn extends aojo {
    public final java.util.List a;

    public aokn(java.util.List list) {
        aooh.f(list, "delegate");
        this.a = list;
    }

    public final int a() {
        return this.a.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object get(int i) {
        if (i >= 0 && i <= ajsz.aZ(this)) {
            return this.a.get(ajsz.aZ(this) - i);
        }
        throw new java.lang.IndexOutOfBoundsException("Element index " + i + " must be in range [" + new aopq(0, ajsz.aZ(this)) + "].");
    }

    public final java.util.Iterator iterator() {
        return new defpackage.aokm(this, 0);
    }

    public final java.util.ListIterator listIterator() {
        return new defpackage.aokm(this, 0);
    }

    public final java.util.ListIterator listIterator(int i) {
        return new defpackage.aokm(this, i);
    }
}
