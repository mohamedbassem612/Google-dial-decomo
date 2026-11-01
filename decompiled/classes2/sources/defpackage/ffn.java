package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ffn extends defpackage.ffi {
    public static final java.lang.Object c = new java.lang.Object();
    public final java.lang.Object d;
    private final java.lang.Object e;

    public ffn(defpackage.erm ermVar, java.lang.Object obj, java.lang.Object obj2) {
        super(ermVar);
        this.e = obj;
        this.d = obj2;
    }

    public static defpackage.ffn q(defpackage.eqt eqtVar) {
        return new defpackage.ffn(new defpackage.ffo(eqtVar), defpackage.erl.a, c);
    }

    @Override // defpackage.ffi, defpackage.erm
    public final int a(java.lang.Object obj) {
        java.lang.Object obj2;
        if (c.equals(obj) && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.b.a(obj);
    }

    @Override // defpackage.ffi, defpackage.erm
    public final defpackage.erk d(int i, defpackage.erk erkVar, boolean z) {
        this.b.d(i, erkVar, z);
        if (j$.util.Objects.equals(erkVar.b, this.d) && z) {
            erkVar.b = c;
        }
        return erkVar;
    }

    @Override // defpackage.ffi, defpackage.erm
    public final defpackage.erl e(int i, defpackage.erl erlVar, long j) {
        this.b.e(i, erlVar, j);
        if (j$.util.Objects.equals(erlVar.b, this.e)) {
            erlVar.b = defpackage.erl.a;
        }
        return erlVar;
    }

    @Override // defpackage.ffi, defpackage.erm
    public final java.lang.Object f(int i) {
        java.lang.Object objF = this.b.f(i);
        return j$.util.Objects.equals(objF, this.d) ? c : objF;
    }

    public final defpackage.ffn p(defpackage.erm ermVar) {
        return new defpackage.ffn(ermVar, this.e, this.d);
    }
}
