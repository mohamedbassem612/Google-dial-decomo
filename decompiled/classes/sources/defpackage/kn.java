package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class kn implements defpackage.ma {
    private final /* synthetic */ int $cid;
    final /* synthetic */ defpackage.kp a;

    public kn(defpackage.kp kpVar, int i) {
        this.$cid = i;
        this.a = kpVar;
    }

    @Override // defpackage.ma
    public final int a(android.view.View view) {
        int iBw;
        int i;
        if (this.$cid != 0) {
            defpackage.kq kqVar = (defpackage.kq) view.getLayoutParams();
            iBw = defpackage.kp.by(view);
            i = kqVar.rightMargin;
        } else {
            defpackage.kq kqVar2 = (defpackage.kq) view.getLayoutParams();
            iBw = defpackage.kp.bw(view);
            i = kqVar2.bottomMargin;
        }
        return iBw + i;
    }

    @Override // defpackage.ma
    public final int b(android.view.View view) {
        int iBz;
        int i;
        if (this.$cid != 0) {
            defpackage.kq kqVar = (defpackage.kq) view.getLayoutParams();
            iBz = defpackage.kp.bx(view);
            i = kqVar.leftMargin;
        } else {
            defpackage.kq kqVar2 = (defpackage.kq) view.getLayoutParams();
            iBz = defpackage.kp.bz(view);
            i = kqVar2.topMargin;
        }
        return iBz - i;
    }

    @Override // defpackage.ma
    public final int c() {
        int i;
        int paddingBottom;
        int i2 = this.$cid;
        defpackage.kp kpVar = this.a;
        if (i2 != 0) {
            i = kpVar.C;
            paddingBottom = kpVar.getPaddingRight();
        } else {
            i = kpVar.D;
            paddingBottom = kpVar.getPaddingBottom();
        }
        return i - paddingBottom;
    }

    @Override // defpackage.ma
    public final int d() {
        int i = this.$cid;
        defpackage.kp kpVar = this.a;
        return i != 0 ? kpVar.getPaddingLeft() : kpVar.getPaddingTop();
    }

    @Override // defpackage.ma
    public final android.view.View e(int i) {
        int i2 = this.$cid;
        defpackage.kp kpVar = this.a;
        return i2 != 0 ? kpVar.aE(i) : kpVar.aE(i);
    }
}
