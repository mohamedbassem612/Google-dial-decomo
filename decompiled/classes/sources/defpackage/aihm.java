package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aihm extends defpackage.aihb {
    private final java.util.Comparator e;

    public aihm(java.util.Comparator comparator) {
        comparator.getClass();
        this.e = comparator;
    }

    @Override // defpackage.aihb, defpackage.aifm, defpackage.aifn
    public final /* synthetic */ void c(java.lang.Object obj) {
        super.c(obj);
    }

    @Override // defpackage.aihb
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final defpackage.aiho g() {
        defpackage.aiho aihoVarX = defpackage.aiho.x(this.e, this.b, this.a);
        this.b = aihoVarX.size();
        this.c = true;
        return aihoVarX;
    }

    public final void n(java.lang.Object obj) {
        super.c(obj);
    }

    public final void o(java.lang.Object... objArr) {
        super.j(objArr);
    }

    public aihm(java.util.Comparator comparator, int i) {
        super(i, false);
        this.e = comparator;
    }
}
