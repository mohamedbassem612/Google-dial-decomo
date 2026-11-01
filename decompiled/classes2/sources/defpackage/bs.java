package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@java.lang.Deprecated
public abstract class bs extends defpackage.gmi {
    private final bo b;
    private final int c;
    private bw d = null;
    private aw e = null;
    private boolean f;

    public bs(bo boVar, int i) {
        this.b = boVar;
        this.c = i;
    }

    private static java.lang.String k(int i, long j) {
        return "android:switcher:" + i + ':' + j;
    }

    public abstract aw a(int i);

    @Override // defpackage.gmi
    public final java.lang.Object b(android.view.ViewGroup viewGroup, int i) {
        if (this.d == null) {
            this.d = new u(this.b);
        }
        long j = i;
        aw awVarE = this.b.e(k(viewGroup.getId(), j));
        if (awVarE != null) {
            this.d.n(new bv(7, awVarE));
        } else {
            awVarE = a(i);
            this.d.e(viewGroup.getId(), awVarE, k(viewGroup.getId(), j), 1);
        }
        if (awVarE != this.e) {
            awVarE.ay(false);
            if (this.c == 1) {
                this.d.l(awVarE, emq.d);
            } else {
                awVarE.aC(false);
            }
        }
        return awVarE;
    }

    @Override // defpackage.gmi
    public final void c(android.view.ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new java.lang.IllegalStateException(a.bg(this, "ViewPager with adapter ", " requires a view id"));
        }
    }

    @Override // defpackage.gmi
    public final boolean d(android.view.View view, java.lang.Object obj) {
        return ((aw) obj).Q == view;
    }

    @Override // defpackage.gmi
    public final void e(java.lang.Object obj) {
        if (this.d == null) {
            this.d = new u(this.b);
        }
        u uVar = this.d;
        aw awVar = (aw) obj;
        bo boVar = awVar.B;
        if (boVar != null && boVar != uVar.a) {
            throw new java.lang.IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + awVar.toString() + " is already attached to a FragmentManager.");
        }
        uVar.n(new bv(6, awVar));
        if (awVar.equals(this.e)) {
            this.e = null;
        }
    }

    @Override // defpackage.gmi
    public final void f() {
        bw bwVar = this.d;
        if (bwVar != null) {
            if (!this.f) {
                try {
                    this.f = true;
                    bwVar.d();
                    this.f = false;
                } catch (java.lang.Throwable th) {
                    this.f = false;
                    throw th;
                }
            }
            this.d = null;
        }
    }

    @Override // defpackage.gmi
    public final void h(java.lang.Object obj) {
        aw awVar = this.e;
        if (obj != awVar) {
            if (awVar != null) {
                awVar.ay(false);
                if (this.c == 1) {
                    if (this.d == null) {
                        this.d = new u(this.b);
                    }
                    this.d.l(this.e, emq.d);
                } else {
                    this.e.aC(false);
                }
            }
            aw awVar2 = (aw) obj;
            awVar2.ay(true);
            if (this.c == 1) {
                if (this.d == null) {
                    this.d = new u(this.b);
                }
                this.d.l(awVar2, emq.e);
            } else {
                awVar2.aC(true);
            }
            this.e = awVar2;
        }
    }

    @Override // defpackage.gmi
    public final void g() {
    }
}
