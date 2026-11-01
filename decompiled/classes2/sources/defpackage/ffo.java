package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ffo extends defpackage.erm {
    private final defpackage.eqt b;

    public ffo(defpackage.eqt eqtVar) {
        this.b = eqtVar;
    }

    @Override // defpackage.erm
    public final int a(java.lang.Object obj) {
        return obj == defpackage.ffn.c ? 0 : -1;
    }

    @Override // defpackage.erm
    public final int b() {
        return 1;
    }

    @Override // defpackage.erm
    public final int c() {
        return 1;
    }

    @Override // defpackage.erm
    public final defpackage.erk d(int i, defpackage.erk erkVar, boolean z) {
        java.lang.Integer num;
        java.lang.Object obj;
        if (z) {
            num = 0;
            obj = defpackage.ffn.c;
        } else {
            num = null;
            obj = null;
        }
        erkVar.i(num, obj, 0, -9223372036854775807L, 0L, defpackage.ept.a, true, -9223372036854775807L);
        return erkVar;
    }

    @Override // defpackage.erm
    public final defpackage.erl e(int i, defpackage.erl erlVar, long j) {
        erlVar.d(defpackage.erl.a, this.b, false, true, null, -9223372036854775807L);
        erlVar.k = true;
        return erlVar;
    }

    @Override // defpackage.erm
    public final java.lang.Object f(int i) {
        return defpackage.ffn.c;
    }
}
