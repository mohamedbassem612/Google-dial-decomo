package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ka extends defpackage.kb {
    @Override // defpackage.kb
    public final int a(android.view.View view) {
        return defpackage.kp.bw(view) + ((defpackage.kq) view.getLayoutParams()).bottomMargin;
    }

    @Override // defpackage.kb
    public final int b(android.view.View view) {
        defpackage.kq kqVar = (defpackage.kq) view.getLayoutParams();
        return defpackage.kp.bi(view) + kqVar.topMargin + kqVar.bottomMargin;
    }

    @Override // defpackage.kb
    public final int c(android.view.View view) {
        defpackage.kq kqVar = (defpackage.kq) view.getLayoutParams();
        return defpackage.kp.bj(view) + kqVar.leftMargin + kqVar.rightMargin;
    }

    @Override // defpackage.kb
    public final int d(android.view.View view) {
        return defpackage.kp.bz(view) - ((defpackage.kq) view.getLayoutParams()).topMargin;
    }

    @Override // defpackage.kb
    public final int e() {
        return this.a.D;
    }

    @Override // defpackage.kb
    public final int f() {
        defpackage.kp kpVar = this.a;
        return kpVar.D - kpVar.getPaddingBottom();
    }

    @Override // defpackage.kb
    public final int g() {
        return this.a.getPaddingBottom();
    }

    @Override // defpackage.kb
    public final int h() {
        return this.a.B;
    }

    @Override // defpackage.kb
    public final int i() {
        return this.a.A;
    }

    @Override // defpackage.kb
    public final int j() {
        return this.a.getPaddingTop();
    }

    @Override // defpackage.kb
    public final int k() {
        defpackage.kp kpVar = this.a;
        return (kpVar.D - kpVar.getPaddingTop()) - kpVar.getPaddingBottom();
    }

    @Override // defpackage.kb
    public final int l(android.view.View view) {
        android.graphics.Rect rect = this.c;
        this.a.bo(view, rect);
        return rect.bottom;
    }

    @Override // defpackage.kb
    public final int m(android.view.View view) {
        android.graphics.Rect rect = this.c;
        this.a.bo(view, rect);
        return rect.top;
    }

    @Override // defpackage.kb
    public final void n(int i) {
        this.a.aM(i);
    }
}
