package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
abstract class aimd extends defpackage.aimg {
    protected final ahyc a;

    protected aimd(ahyc ahycVar) {
        this.a = ahycVar;
    }

    @Override // defpackage.aimg
    public final defpackage.aizh b(java.lang.Object obj) {
        defpackage.aizh aizhVar = (defpackage.aizh) this.a.apply(obj);
        int i = aizhVar.c;
        defpackage.aizg aizgVarB = defpackage.aizh.b(i);
        for (int i2 = 0; i2 < i; i2++) {
            aizgVarB.b(c(aizhVar.a(i2)));
        }
        return aizgVarB.a();
    }

    public abstract int c(int i);
}
