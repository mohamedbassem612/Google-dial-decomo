package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahxl extends defpackage.ahxn {
    final defpackage.ahxn a;
    final defpackage.ahxn b;

    public ahxl(defpackage.ahxn ahxnVar, defpackage.ahxn ahxnVar2) {
        this.a = ahxnVar;
        ahxnVar2.getClass();
        this.b = ahxnVar2;
    }

    @Override // defpackage.ahxn
    public final void b(java.util.BitSet bitSet) {
        this.a.b(bitSet);
        this.b.b(bitSet);
    }

    @Override // defpackage.ahxn
    public final boolean c(char c) {
        return this.a.c(c) || this.b.c(c);
    }

    public final java.lang.String toString() {
        defpackage.ahxn ahxnVar = this.b;
        return this.a.toString() + ".or(" + ahxnVar.toString() + ')';
    }
}
