package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jz extends kb {
    public final int a(android.view.View view) {
        return kp.by(view) + view.getLayoutParams().rightMargin;
    }

    public final int b(android.view.View view) {
        kq layoutParams = view.getLayoutParams();
        return kp.bj(view) + layoutParams.leftMargin + layoutParams.rightMargin;
    }

    public final int c(android.view.View view) {
        kq layoutParams = view.getLayoutParams();
        return kp.bi(view) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final int d(android.view.View view) {
        return kp.bx(view) - view.getLayoutParams().leftMargin;
    }

    public final int e() {
        return this.a.C;
    }

    public final int f() {
        kp kpVar = this.a;
        return kpVar.C - kpVar.getPaddingRight();
    }

    public final int g() {
        return this.a.getPaddingRight();
    }

    public final int h() {
        return this.a.A;
    }

    public final int i() {
        return this.a.B;
    }

    public final int j() {
        return this.a.getPaddingLeft();
    }

    public final int k() {
        kp kpVar = this.a;
        return (kpVar.C - kpVar.getPaddingLeft()) - kpVar.getPaddingRight();
    }

    public final int l(android.view.View view) {
        android.graphics.Rect rect = this.c;
        this.a.bo(view, rect);
        return rect.right;
    }

    public final int m(android.view.View view) {
        android.graphics.Rect rect = this.c;
        this.a.bo(view, rect);
        return rect.left;
    }

    public final void n(int i) {
        this.a.aL(i);
    }
}
