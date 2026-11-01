package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahtg {
    public android.content.DialogInterface.OnClickListener b;
    public java.lang.CharSequence[] c;
    private final pc e;
    private final defpackage.ahtb f;
    private java.lang.CharSequence g;
    private java.lang.CharSequence i;
    private java.lang.CharSequence k;
    private java.lang.CharSequence m;
    private java.lang.CharSequence p;
    private android.view.View r;
    private final ajwr t;
    public int a = -1;
    private int h = -1;
    private int j = -1;
    private int l = -1;
    private int n = -1;
    private int o = -1;
    private int q = -1;
    private int s = -1;
    public int d = -1;

    public ahtg(android.content.Context context, ajwr ajwrVar, ahyn ahynVar) {
        this.e = new pc(context, context.getTheme());
        this.t = ajwrVar;
        this.f = (defpackage.ahtb) ((ahys) ahynVar).a;
    }

    private final void o() {
        boolean z = false;
        if (this.g == null && this.h == -1) {
            z = true;
        }
        ahvr.bZ(z, "Cannot set message multiple times.");
    }

    private final void p() {
        boolean z = false;
        if (this.i == null && this.j == -1) {
            z = true;
        }
        ahvr.bZ(z, "Cannot set negative button multiple times.");
    }

    private final void q() {
        boolean z = false;
        if (this.k == null && this.l == -1) {
            z = true;
        }
        ahvr.bZ(z, "Cannot set neutral button multiple times.");
    }

    private final void r() {
        boolean z = false;
        if (this.m == null && this.n == -1) {
            z = true;
        }
        ahvr.bZ(z, "Cannot set positive button multiple times.");
    }

    private final void s() {
        boolean z = false;
        if (this.p == null && this.q == -1) {
            z = true;
        }
        ahvr.bZ(z, "Cannot set title multiple times.");
    }

    private final void t() {
        boolean z = false;
        if (this.r == null && this.s == -1) {
            z = true;
        }
        ahvr.bZ(z, "Cannot set view multiple times.");
    }

    public final cy a() {
        android.content.DialogInterface.OnClickListener onClickListener;
        int i = this.o;
        defpackage.ahtb ahtbVar = this.f;
        cx cxVarA = i == -1 ? ahtbVar.a(this.e) : ahtbVar.b(this.e, i);
        int i2 = this.a;
        if (i2 != -1) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            ct ctVar = cxVarA.a;
            ctVar.a.getTheme().resolveAttribute(i2, typedValue, true);
            ctVar.c = typedValue.resourceId;
        }
        java.lang.CharSequence charSequence = this.g;
        if (charSequence != null) {
            cxVarA.f(charSequence);
        } else {
            int i3 = this.h;
            if (i3 != -1) {
                cxVarA.e(i3);
            }
        }
        java.lang.CharSequence charSequence2 = this.i;
        if (charSequence2 != null) {
            final ajwr ajwrVar = this.t;
            final defpackage.ahtd ahtdVar = new defpackage.ahtd();
            cxVarA.g(charSequence2, new android.content.DialogInterface.OnClickListener() { // from class: ahtn
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i4) {
                    java.lang.String str;
                    android.widget.Button buttonB = ((cy) dialogInterface).b(i4);
                    boolean zI = afsq.I(buttonB);
                    ahth ahthVar = ahtdVar;
                    if (zI) {
                        if (i4 == -3) {
                            str = "Clicked neutral dialog button";
                        } else if (i4 != -2) {
                            str = i4 != -1 ? "Clicked dialog button" : "Clicked positive dialog button";
                        } else {
                            str = "Clicked negative dialog button";
                        }
                        ahok ahokVarG = ((ahpz) ajwrVar.b).g(1482, str);
                        try {
                            ahvr.j(ahthVar, buttonB);
                            ahokVarG.close();
                        } catch (java.lang.Throwable th) {
                            try {
                                ahokVarG.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }
            });
        } else {
            int i4 = this.j;
            if (i4 != -1) {
                final ajwr ajwrVar2 = this.t;
                final defpackage.ahtd ahtdVar2 = new defpackage.ahtd();
                cxVarA.setNegativeButton(i4, new android.content.DialogInterface.OnClickListener() { // from class: ahtn
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(android.content.DialogInterface dialogInterface, int i5) {
                        java.lang.String str;
                        android.widget.Button buttonB = ((cy) dialogInterface).b(i5);
                        boolean zI = afsq.I(buttonB);
                        ahth ahthVar = ahtdVar2;
                        if (zI) {
                            if (i5 == -3) {
                                str = "Clicked neutral dialog button";
                            } else if (i5 != -2) {
                                str = i5 != -1 ? "Clicked dialog button" : "Clicked positive dialog button";
                            } else {
                                str = "Clicked negative dialog button";
                            }
                            ahok ahokVarG = ((ahpz) ajwrVar2.b).g(1482, str);
                            try {
                                ahvr.j(ahthVar, buttonB);
                                ahokVarG.close();
                            } catch (java.lang.Throwable th) {
                                try {
                                    ahokVarG.close();
                                } catch (java.lang.Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    }
                });
            }
        }
        java.lang.CharSequence charSequence3 = this.k;
        if (charSequence3 != null) {
            final ajwr ajwrVar3 = this.t;
            final defpackage.ahte ahteVar = new defpackage.ahte();
            android.content.DialogInterface.OnClickListener onClickListener2 = new android.content.DialogInterface.OnClickListener() { // from class: ahtn
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i5) {
                    java.lang.String str;
                    android.widget.Button buttonB = ((cy) dialogInterface).b(i5);
                    boolean zI = afsq.I(buttonB);
                    ahth ahthVar = ahteVar;
                    if (zI) {
                        if (i5 == -3) {
                            str = "Clicked neutral dialog button";
                        } else if (i5 != -2) {
                            str = i5 != -1 ? "Clicked dialog button" : "Clicked positive dialog button";
                        } else {
                            str = "Clicked negative dialog button";
                        }
                        ahok ahokVarG = ((ahpz) ajwrVar3.b).g(1482, str);
                        try {
                            ahvr.j(ahthVar, buttonB);
                            ahokVarG.close();
                        } catch (java.lang.Throwable th) {
                            try {
                                ahokVarG.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }
            };
            ct ctVar2 = cxVarA.a;
            ctVar2.l = charSequence3;
            ctVar2.m = onClickListener2;
        } else {
            int i5 = this.l;
            if (i5 != -1) {
                final ajwr ajwrVar4 = this.t;
                final defpackage.ahte ahteVar2 = new defpackage.ahte();
                android.content.DialogInterface.OnClickListener onClickListener3 = new android.content.DialogInterface.OnClickListener() { // from class: ahtn
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(android.content.DialogInterface dialogInterface, int i6) {
                        java.lang.String str;
                        android.widget.Button buttonB = ((cy) dialogInterface).b(i6);
                        boolean zI = afsq.I(buttonB);
                        ahth ahthVar = ahteVar2;
                        if (zI) {
                            if (i6 == -3) {
                                str = "Clicked neutral dialog button";
                            } else if (i6 != -2) {
                                str = i6 != -1 ? "Clicked dialog button" : "Clicked positive dialog button";
                            } else {
                                str = "Clicked negative dialog button";
                            }
                            ahok ahokVarG = ((ahpz) ajwrVar4.b).g(1482, str);
                            try {
                                ahvr.j(ahthVar, buttonB);
                                ahokVarG.close();
                            } catch (java.lang.Throwable th) {
                                try {
                                    ahokVarG.close();
                                } catch (java.lang.Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    }
                };
                ct ctVar3 = cxVarA.a;
                ctVar3.l = ctVar3.a.getText(i5);
                ctVar3.m = onClickListener3;
            }
        }
        java.lang.CharSequence charSequence4 = this.m;
        if (charSequence4 != null) {
            final ajwr ajwrVar5 = this.t;
            final defpackage.ahtf ahtfVar = new defpackage.ahtf();
            cxVarA.h(charSequence4, new android.content.DialogInterface.OnClickListener() { // from class: ahtn
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i6) {
                    java.lang.String str;
                    android.widget.Button buttonB = ((cy) dialogInterface).b(i6);
                    boolean zI = afsq.I(buttonB);
                    ahth ahthVar = ahtfVar;
                    if (zI) {
                        if (i6 == -3) {
                            str = "Clicked neutral dialog button";
                        } else if (i6 != -2) {
                            str = i6 != -1 ? "Clicked dialog button" : "Clicked positive dialog button";
                        } else {
                            str = "Clicked negative dialog button";
                        }
                        ahok ahokVarG = ((ahpz) ajwrVar5.b).g(1482, str);
                        try {
                            ahvr.j(ahthVar, buttonB);
                            ahokVarG.close();
                        } catch (java.lang.Throwable th) {
                            try {
                                ahokVarG.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }
            });
        } else {
            int i6 = this.n;
            if (i6 != -1) {
                final ajwr ajwrVar6 = this.t;
                final defpackage.ahtf ahtfVar2 = new defpackage.ahtf();
                cxVarA.setPositiveButton(i6, new android.content.DialogInterface.OnClickListener() { // from class: ahtn
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(android.content.DialogInterface dialogInterface, int i7) {
                        java.lang.String str;
                        android.widget.Button buttonB = ((cy) dialogInterface).b(i7);
                        boolean zI = afsq.I(buttonB);
                        ahth ahthVar = ahtfVar2;
                        if (zI) {
                            if (i7 == -3) {
                                str = "Clicked neutral dialog button";
                            } else if (i7 != -2) {
                                str = i7 != -1 ? "Clicked dialog button" : "Clicked positive dialog button";
                            } else {
                                str = "Clicked negative dialog button";
                            }
                            ahok ahokVarG = ((ahpz) ajwrVar6.b).g(1482, str);
                            try {
                                ahvr.j(ahthVar, buttonB);
                                ahokVarG.close();
                            } catch (java.lang.Throwable th) {
                                try {
                                    ahokVarG.close();
                                } catch (java.lang.Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    }
                });
            }
        }
        java.lang.CharSequence charSequence5 = this.p;
        if (charSequence5 != null) {
            cxVarA.setTitle(charSequence5);
        } else {
            int i7 = this.q;
            if (i7 != -1) {
                cxVarA.j(i7);
            }
        }
        android.view.View view = this.r;
        if (view != null) {
            cxVarA.setView(view);
        } else {
            int i8 = this.s;
            if (i8 != -1) {
                cxVarA.k(i8);
            }
        }
        java.lang.CharSequence[] charSequenceArr = this.c;
        if (charSequenceArr != null && (onClickListener = this.b) != null) {
            cxVarA.i(charSequenceArr, this.d, onClickListener);
        }
        return cxVarA.create();
    }

    public final void b(int i) {
        o();
        this.h = i;
    }

    public final void c(java.lang.CharSequence charSequence) {
        o();
        ahvr.bN(!android.text.TextUtils.isEmpty(charSequence), "Cannot set an empty message.");
        this.g = charSequence;
    }

    public final void d(int i) {
        p();
        this.j = i;
    }

    public final void e(java.lang.CharSequence charSequence) {
        p();
        ahvr.bN(!android.text.TextUtils.isEmpty(charSequence), "Cannot set an empty negative button text.");
        this.i = charSequence;
    }

    public final void f(int i) {
        q();
        this.l = i;
    }

    public final void g(java.lang.CharSequence charSequence) {
        q();
        ahvr.bN(!android.text.TextUtils.isEmpty(charSequence), "Cannot set an empty neutral button text.");
        this.k = charSequence;
    }

    public final void h(int i) {
        r();
        this.n = i;
    }

    public final void i(java.lang.CharSequence charSequence) {
        r();
        ahvr.bN(!android.text.TextUtils.isEmpty(charSequence), "Cannot set an empty positive button text.");
        this.m = charSequence;
    }

    public final void j(int i) {
        ahvr.bZ(this.o == -1, "Cannot set theme multiple times.");
        this.o = i;
    }

    public final void k(int i) {
        s();
        this.q = i;
    }

    public final void l(java.lang.CharSequence charSequence) {
        s();
        ahvr.bN(!android.text.TextUtils.isEmpty(charSequence), "Cannot set an empty title.");
        this.p = charSequence;
    }

    public final void m(int i) {
        t();
        this.s = i;
    }

    public final void n(android.view.View view) {
        t();
        ahvr.bN(view != null, "Cannot set a null view.");
        this.r = view;
    }
}
