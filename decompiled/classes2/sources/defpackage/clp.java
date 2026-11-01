package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class clp {
    public final defpackage.clg a;
    public int b;
    public java.util.Map.Entry c;
    public java.util.Map.Entry d;
    private final java.util.Iterator e;

    public clp(defpackage.clg clgVar, java.util.Iterator it) {
        this.a = clgVar;
        this.e = it;
        this.b = clgVar.a();
        a();
    }

    protected final void a() {
        this.c = this.d;
        java.util.Iterator it = this.e;
        this.d = ((defpackage.cid) it).c ? (java.util.Map.Entry) it.next() : null;
    }

    public final boolean hasNext() {
        return this.d != null;
    }

    public final void remove() {
        defpackage.clg clgVar = this.a;
        if (clgVar.a() != this.b) {
            throw new java.util.ConcurrentModificationException();
        }
        java.util.Map.Entry entry = this.c;
        if (entry == null) {
            throw new java.lang.IllegalStateException();
        }
        clgVar.remove(entry.getKey());
        this.c = null;
        this.b = clgVar.a();
    }
}
