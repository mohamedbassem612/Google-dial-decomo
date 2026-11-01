package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class cx {
    public final defpackage.ct a;
    private final int b;

    public cx(android.content.Context context, int i) {
        this.a = new defpackage.ct(new android.view.ContextThemeWrapper(context, defpackage.cy.a(context, i)));
        this.b = i;
    }

    public final defpackage.cy a() {
        defpackage.cy cyVarCreate = create();
        cyVarCreate.show();
        return cyVarCreate;
    }

    public final void b(android.widget.ListAdapter listAdapter, android.content.DialogInterface.OnClickListener onClickListener) {
        defpackage.ct ctVar = this.a;
        ctVar.r = listAdapter;
        ctVar.s = onClickListener;
    }

    public final void c(android.view.View view) {
        this.a.f = view;
    }

    public defpackage.cy create() {
        android.widget.ListAdapter cqVar;
        defpackage.ct ctVar = this.a;
        android.content.Context context = ctVar.a;
        defpackage.cy cyVar = new defpackage.cy(context, this.b);
        defpackage.cw cwVar = cyVar.a;
        android.view.View view = ctVar.f;
        if (view != null) {
            cwVar.y = view;
        } else {
            java.lang.CharSequence charSequence = ctVar.e;
            if (charSequence != null) {
                cwVar.a(charSequence);
            }
            android.graphics.drawable.Drawable drawable = ctVar.d;
            if (drawable != null) {
                cwVar.u = drawable;
                cwVar.t = 0;
                android.widget.ImageView imageView = cwVar.v;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    cwVar.v.setImageDrawable(drawable);
                }
            }
            int i = ctVar.c;
            if (i != 0) {
                cwVar.u = null;
                cwVar.t = i;
                android.widget.ImageView imageView2 = cwVar.v;
                if (imageView2 != null) {
                    if (i != 0) {
                        imageView2.setVisibility(0);
                        cwVar.v.setImageResource(cwVar.t);
                    } else {
                        imageView2.setVisibility(8);
                    }
                }
            }
        }
        java.lang.CharSequence charSequence2 = ctVar.g;
        if (charSequence2 != null) {
            cwVar.e = charSequence2;
            android.widget.TextView textView = cwVar.x;
            if (textView != null) {
                textView.setText(charSequence2);
            }
        }
        java.lang.CharSequence charSequence3 = ctVar.h;
        if (charSequence3 != null) {
            cwVar.e(-1, charSequence3, ctVar.i);
        }
        java.lang.CharSequence charSequence4 = ctVar.j;
        if (charSequence4 != null) {
            cwVar.e(-2, charSequence4, ctVar.k);
        }
        java.lang.CharSequence charSequence5 = ctVar.l;
        if (charSequence5 != null) {
            cwVar.e(-3, charSequence5, ctVar.m);
        }
        if (ctVar.q != null || ctVar.r != null) {
            android.support.v7.app.AlertController$RecycleListView alertController$RecycleListView = (android.support.v7.app.AlertController$RecycleListView) ctVar.b.inflate(cwVar.D, (android.view.ViewGroup) null);
            if (ctVar.w) {
                cqVar = new defpackage.cq(ctVar, context, cwVar.E, ctVar.q, alertController$RecycleListView);
            } else {
                int i2 = ctVar.x ? cwVar.F : cwVar.G;
                android.widget.ListAdapter cvVar = ctVar.r;
                if (cvVar == null) {
                    cvVar = new defpackage.cv(context, i2, ctVar.q);
                }
                cqVar = cvVar;
            }
            cwVar.z = cqVar;
            cwVar.A = ctVar.y;
            if (ctVar.s != null) {
                alertController$RecycleListView.setOnItemClickListener(new defpackage.cr(ctVar, cwVar));
            } else if (ctVar.z != null) {
                alertController$RecycleListView.setOnItemClickListener(new defpackage.cs(ctVar, alertController$RecycleListView, cwVar));
            }
            if (ctVar.x) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (ctVar.w) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            cwVar.f = alertController$RecycleListView;
        }
        android.view.View view2 = ctVar.u;
        if (view2 != null) {
            cwVar.g = view2;
            cwVar.h = 0;
            cwVar.i = false;
        } else {
            int i3 = ctVar.t;
            if (i3 != 0) {
                cwVar.g = null;
                cwVar.h = i3;
                cwVar.i = false;
            }
        }
        cyVar.setCancelable(ctVar.n);
        if (ctVar.n) {
            cyVar.setCanceledOnTouchOutside(true);
        }
        cyVar.setOnCancelListener(null);
        cyVar.setOnDismissListener(ctVar.o);
        android.content.DialogInterface.OnKeyListener onKeyListener = ctVar.p;
        if (onKeyListener != null) {
            cyVar.setOnKeyListener(onKeyListener);
        }
        return cyVar;
    }

    public final void d(android.graphics.drawable.Drawable drawable) {
        this.a.d = drawable;
    }

    public final void e(int i) {
        defpackage.ct ctVar = this.a;
        ctVar.g = ctVar.a.getText(i);
    }

    public final void f(java.lang.CharSequence charSequence) {
        this.a.g = charSequence;
    }

    public final void g(java.lang.CharSequence charSequence, android.content.DialogInterface.OnClickListener onClickListener) {
        defpackage.ct ctVar = this.a;
        ctVar.j = charSequence;
        ctVar.k = onClickListener;
    }

    public android.content.Context getContext() {
        return this.a.a;
    }

    public final void h(java.lang.CharSequence charSequence, android.content.DialogInterface.OnClickListener onClickListener) {
        defpackage.ct ctVar = this.a;
        ctVar.h = charSequence;
        ctVar.i = onClickListener;
    }

    public final void i(java.lang.CharSequence[] charSequenceArr, int i, android.content.DialogInterface.OnClickListener onClickListener) {
        defpackage.ct ctVar = this.a;
        ctVar.q = charSequenceArr;
        ctVar.s = onClickListener;
        ctVar.y = i;
        ctVar.x = true;
    }

    public final void j(int i) {
        defpackage.ct ctVar = this.a;
        ctVar.e = ctVar.a.getText(i);
    }

    public final void k(int i) {
        defpackage.ct ctVar = this.a;
        ctVar.u = null;
        ctVar.t = i;
    }

    public defpackage.cx setNegativeButton(int i, android.content.DialogInterface.OnClickListener onClickListener) {
        defpackage.ct ctVar = this.a;
        ctVar.j = ctVar.a.getText(i);
        ctVar.k = onClickListener;
        return this;
    }

    public defpackage.cx setPositiveButton(int i, android.content.DialogInterface.OnClickListener onClickListener) {
        defpackage.ct ctVar = this.a;
        ctVar.h = ctVar.a.getText(i);
        ctVar.i = onClickListener;
        return this;
    }

    public defpackage.cx setTitle(java.lang.CharSequence charSequence) {
        this.a.e = charSequence;
        return this;
    }

    public defpackage.cx setView(android.view.View view) {
        defpackage.ct ctVar = this.a;
        ctVar.u = view;
        ctVar.t = 0;
        return this;
    }

    public cx(android.content.Context context) {
        this(context, defpackage.cy.a(context, 0));
    }
}
