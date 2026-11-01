package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class amxy implements defpackage.amyp {
    private final java.lang.Object a = new java.lang.Object();
    private final java.lang.Object b;
    private final defpackage.amwv c;
    private volatile defpackage.hko d;

    public amxy(java.lang.Object obj, defpackage.amwv amwvVar) {
        this.b = obj;
        this.c = amwvVar;
    }

    protected defpackage.hko a() {
        java.lang.Object objA;
        defpackage.hjb hjbVarG = ((defpackage.amxx) defpackage.aooc.ar(this.b, defpackage.amxx.class)).g();
        defpackage.amwv amwvVar = this.c;
        int iD = amwvVar.d() - 1;
        if (iD != 0) {
            objA = iD != 2 ? amwvVar.e() : amwvVar.b();
        } else {
            objA = amwvVar.a();
        }
        defpackage.amwz amwzVarC = ((defpackage.amxj) ((defpackage.amyq) objA).b()).c();
        amwzVarC.getClass();
        hjbVarG.b = amwzVarC;
        hjbVarG.c = amwvVar;
        defpackage.aooc.an(hjbVarG.b, defpackage.amwz.class);
        defpackage.aooc.an(hjbVarG.c, defpackage.amwv.class);
        return new defpackage.hko(hjbVarG.a, hjbVarG.d, hjbVarG.e, hjbVarG.c);
    }

    @Override // defpackage.amyp
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.hko B() {
        if (this.d == null) {
            synchronized (this.a) {
                if (this.d == null) {
                    this.d = a();
                }
            }
        }
        return this.d;
    }
}
