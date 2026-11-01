package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xtc {
    public final java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public xtc(defpackage.vhu vhuVar) {
        j$.util.Objects.requireNonNull(vhuVar);
        this.b = vhuVar;
        this.a = new java.util.Stack();
    }

    public final void a(java.lang.Class cls) {
        java.util.Stack stack = (java.util.Stack) this.a;
        if (cls.isInstance(stack.peek())) {
            return;
        }
        throw new java.lang.IllegalStateException("Internal stack error: Expected '" + cls.getName() + "' found '" + stack.peek().getClass().getName() + '\'');
    }

    public xtc(defpackage.xtd xtdVar, java.lang.String str) {
        j$.util.Objects.requireNonNull(xtdVar);
        this.b = xtdVar;
        this.a = str;
    }
}
