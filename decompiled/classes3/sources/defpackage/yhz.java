package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class yhz extends defpackage.yic implements defpackage.yib, defpackage.yhy {
    public java.util.List i = new java.util.ArrayList();
    public java.util.Set j = null;
    public java.lang.String k = null;
    public java.util.Set l = null;
    public java.util.Set m = null;

    protected yhz() {
    }

    @Override // defpackage.yib
    public void b(defpackage.yif yifVar) {
        this.i.add(yifVar);
    }

    @Override // defpackage.yhy
    public final java.lang.String c() {
        return this.k;
    }

    @Override // defpackage.yhy
    public final java.util.Set d() {
        return this.j;
    }

    @Override // defpackage.yhy
    public final java.util.Set e() {
        return this.m;
    }

    @Override // defpackage.yhy
    public final java.util.Set f() {
        return this.l;
    }

    @Override // defpackage.yhy
    public final java.util.Set g() {
        return null;
    }

    @Override // defpackage.yhy
    public final void h(java.lang.String str) {
        this.k = str;
    }

    @Override // defpackage.yhy
    public final void i(java.util.Set set) {
        this.j = set;
    }

    @Override // defpackage.yhy
    public final void j(java.util.Set set) {
        this.m = set;
    }

    @Override // defpackage.yhy
    public final void k(java.util.Set set) {
        this.l = set;
    }

    @Override // defpackage.yib
    public final java.util.List n() {
        return this.i;
    }

    @Override // defpackage.yhy
    public final void l(java.util.Set set) {
    }
}
